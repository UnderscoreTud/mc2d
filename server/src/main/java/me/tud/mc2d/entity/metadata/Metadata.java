package me.tud.mc2d.entity.metadata;

import me.tud.mc2d.entity.*;
import me.tud.mc2d.entity.Display.Billboard;
import me.tud.mc2d.entity.ItemDisplay.DisplayType;
import me.tud.mc2d.entity.TextDisplay.Alignment;
import me.tud.mc2d.entity.player.MainHand;
import me.tud.mc2d.entity.player.SkinPart;
import me.tud.mc2d.painting.PaintingVariant;
import me.tud.mc2d.world.block.BlockFace;
import me.tud.mc2d.world.blockdata.BlockData;
import org.joml.Quaternionf;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.machinemc.scriptive.serialization.ComponentProperties;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import static me.tud.mc2d.entity.metadata.MetadataEntry.*;

// TODO maybe autogenerate this class alongside entity classes?
public class Metadata {

    public static class Entity {
        private static final AtomicInteger INDEX = new AtomicInteger();

        public static final MetadataEntry<Boolean> IS_ON_FIRE = bitmask(INDEX.get(), 0x01);
        public static final MetadataEntry<Boolean> IS_SNEAKING = bitmask(INDEX.get(), 0x02);
        public static final MetadataEntry<Boolean> IS_RIDING = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<Boolean> IS_SPRINTING = bitmask(INDEX.get(), 0x08);
        public static final MetadataEntry<Boolean> IS_SWIMMING = bitmask(INDEX.get(), 0x10);
        public static final MetadataEntry<Boolean> IS_INVISIBLE = bitmask(INDEX.get(), 0x20);
        public static final MetadataEntry<Boolean> HAS_GLOWING_EFFECT = bitmask(INDEX.get(), 0x40);
        public static final MetadataEntry<Boolean> IS_FLYING_WITH_ELYTRA = bitmask(INDEX.get(), 0x80);
        public static final MetadataEntry<Integer> AIR_TICKS = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<@Nullable ComponentProperties> CUSTOM_NAME = optComponent(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_CUSTOM_NAME_VISIBLE = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_SILENT = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> HAS_NO_GRAVITY = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<EntityPose> POSE = pose(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> TICKS_FROZEN = varInt(INDEX.incrementAndGet());
    }

    public static class AreaEffectCloud extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Float> RADIUS = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_SINGLE_POINT = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Object> PARTICLE = particle(INDEX.incrementAndGet());
    }

    public static class DragonFireball extends Entity {}

    public static class EndCrystal extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<@Nullable Vector3d> BEAM_TARGET = optPosition(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> SHOW_BOTTOM = _boolean(INDEX.incrementAndGet());
    }

    public static class EvokerFangs extends Entity {}

    public static class ExperienceOrb extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Integer> EXPERIENCE_AMOUNT = varInt(INDEX.incrementAndGet());
    }

    public static class EyeOfEnder extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
    }

    public static class FallingBlock extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Vector3d> SPAWN_POSITION = position(INDEX.incrementAndGet());
    }

    public static class Fireball extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
    }

    public static class FireworkRocket extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> FIREWORK_INFO = slot(INDEX.incrementAndGet());
        public static final MetadataEntry<@Nullable Integer> USER_ID = optVarInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_SHOT_AT_ANGLE = _boolean(INDEX.incrementAndGet());
    }

    public static class Interaction extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Float> WIDTH = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Float> HEIGHT = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_RESPONSIVE = _boolean(INDEX.incrementAndGet());
    }

    public static class Item extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
    }

    public static class ItemFrame extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<BlockFace> DIRECTION = direction(INDEX.incrementAndGet());
        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> ROTATION = varInt(INDEX.incrementAndGet());
    }

    public static class GlowingItemFrame extends ItemFrame {}

    public static class LeashKnot extends Entity {}

    public static class LightningBolt extends Entity {}

    public static class LlamaSpit extends Entity {}

    public static class Marker extends Entity {}

    public static class OminousItemSpawner extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
    }

    public static class Painting extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
        public static final ServerAwareMetadataEntry<PaintingVariant> PAINTING_TYPE = paintingVariant(INDEX.incrementAndGet());
    }

    public static class ShulkerBullet extends Entity {}

    public static class SmallFireball extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
    }

    public static class PrimedTNT extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Integer> FUSE_TIME = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<BlockData> BLOCK_STATE = blockState(INDEX.incrementAndGet());
    }

    public static class WindCharge extends Entity {}

    public static class WitherSkull extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Boolean> IS_INVULNERABLE = _boolean(INDEX.incrementAndGet());
    }

    public static class FishingBobber extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        /**
         * Hooked entity id + 1, or 0 if there is no hooked entity
         */
        public static final MetadataEntry<Integer> HOOKED_ENTITY = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_CATCHABLE = _boolean(INDEX.incrementAndGet());
    }

    public static class AbstractArrow extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Boolean> IS_CRITICAL = bitmask(INDEX.incrementAndGet(), 0x01);
        public static final MetadataEntry<Boolean> IS_NOCLIP = bitmask(INDEX.get(), 0x02);
        public static final MetadataEntry<Byte> PIERCING_LEVEL = _byte(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_IN_GROUND = _boolean(INDEX.incrementAndGet());
    }

    public static class Arrow extends AbstractArrow {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractArrow.INDEX.get());

        public static final MetadataEntry<Integer> COLOR = varInt(INDEX.incrementAndGet());
    }

    public static class SpectralArrow extends AbstractArrow {}

    public static class Trident extends AbstractArrow {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractArrow.INDEX.get());

        public static final MetadataEntry<Byte> LOYALTY_LEVEL = _byte(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> HAS_ENCHANTMENT_GLINT = _boolean(INDEX.incrementAndGet());
    }

    public static class Display extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Integer> INTERPOLATION_DELAY = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> TRANSFORMATION_INTERPOLATION_DURATION = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> POSITION_ROTATION_INTERPOLATION_DURATION = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Vector3f> TRANSLATION = vector3(INDEX.incrementAndGet());
        public static final MetadataEntry<Vector3f> SCALE = vector3(INDEX.incrementAndGet());
        public static final MetadataEntry<Quaternionf> ROTATION_LEFT = quaternion(INDEX.incrementAndGet());
        public static final MetadataEntry<Quaternionf> ROTATION_RIGHT = quaternion(INDEX.incrementAndGet());
        public static final MetadataEntry<Billboard> BILLBOARD_CONSTRAINTS = byteEnum(INDEX.incrementAndGet(), Billboard.class);
        /**
         * Brightness override ({@code blockLight << 4 | skyLight << 20})
         */
        public static final MetadataEntry<Integer> BRIGHTNESS_OVERRIDE = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Float> VIEW_RANGE = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Float> SHADOW_RADIUS = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Float> SHADOW_STRENGTH = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Float> WIDTH = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Float> HEIGHT = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> GLOW_COLOR_OVERRIDE = varInt(INDEX.incrementAndGet());
    }

    public static class BlockDisplay extends Display {
        private static final AtomicInteger INDEX = new AtomicInteger(Display.INDEX.get());

        public static final MetadataEntry<BlockData> DISPLAYED_BLOCK = blockState(INDEX.incrementAndGet());
    }

    public static class ItemDisplay extends Display {
        private static final AtomicInteger INDEX = new AtomicInteger(Display.INDEX.get());

        public static final MetadataEntry<Object> DISPLAYED_ITEM = slot(INDEX.incrementAndGet());
        public static final MetadataEntry<DisplayType> DISPLAY_TYPE = byteEnum(INDEX.incrementAndGet(), DisplayType.class);
    }

    public static class TextDisplay extends Display {
        private static final AtomicInteger INDEX = new AtomicInteger(Display.INDEX.get());

        public static final MetadataEntry<ComponentProperties> TEXT = component(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> LINE_WIDTH = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> BACKGROUND_COLOR = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Byte> TEXT_OPACITY = _byte(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> HAS_SHADOW = bitmask(INDEX.incrementAndGet(), 0x01);
        public static final MetadataEntry<Boolean> IS_SEE_THROUGH = bitmask(INDEX.get(), 0x02);
        public static final MetadataEntry<Boolean> USE_DEFAULT_BACKGROUND_COLOR = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<Alignment> ALIGNMENT = bitmask(INDEX.get(), 0x08, Alignment.class);
    }

    public static class LivingEntity extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Boolean> IS_HAND_ACTIVE = bitmask(INDEX.incrementAndGet(), 0x01);
        public static final MetadataEntry<Boolean> IS_OFFHAND_ACTIVE = bitmask(INDEX.get(), 0x02);
        public static final MetadataEntry<Boolean> IS_IN_RIPTIDE_SPIN_ATTACK = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<Float> HEALTH = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Object> POTION_EFFECT_COLOR = particle(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_POTION_EFFECT_AMBIENT = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> ARROWS_STUCK = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> BEE_STINGERS_STUCK = varInt(INDEX.incrementAndGet());
        /**
         * Location of the bed that the entity is currently sleeping in (Empty if it isn't sleeping)
         */
        public static final MetadataEntry<@Nullable Vector3d> BED_LOCATION = optPosition(INDEX.incrementAndGet());
    }

    public static class ArmorStand extends LivingEntity {
        private static final AtomicInteger INDEX = new AtomicInteger(LivingEntity.INDEX.get());

        public static final MetadataEntry<Boolean> IS_SMALL = bitmask(INDEX.incrementAndGet(), 0x01);
        public static final MetadataEntry<Boolean> HAS_ARMS = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<Boolean> HAS_NO_BASEPLATE = bitmask(INDEX.get(), 0x08);
        public static final MetadataEntry<Boolean> IS_MARKER = bitmask(INDEX.get(), 0x10);
        public static final MetadataEntry<Vector3f> HEAD_ROTATION = rotations(INDEX.incrementAndGet());
        public static final MetadataEntry<Vector3f> BODY_ROTATION = rotations(INDEX.incrementAndGet());
        public static final MetadataEntry<Vector3f> LEFT_ARM_ROTATION = rotations(INDEX.incrementAndGet());
        public static final MetadataEntry<Vector3f> RIGHT_ARM_ROTATION = rotations(INDEX.incrementAndGet());
        public static final MetadataEntry<Vector3f> LEFT_LEG_ROTATION = rotations(INDEX.incrementAndGet());
        public static final MetadataEntry<Vector3f> RIGHT_LEG_ROTATION = rotations(INDEX.incrementAndGet());
    }

    public static class Avatar extends LivingEntity {
        private static final AtomicInteger INDEX = new AtomicInteger(LivingEntity.INDEX.get());

        public static final MetadataEntry<MainHand> MAIN_HAND = byteEnum(INDEX.incrementAndGet(), MainHand.class);
        public static final MetadataEntry<Set<SkinPart>> SKIN_PARTS = bitmask(INDEX.incrementAndGet(), SkinPart.class);
    }

    public static class Mannequin extends Avatar {
        private static final AtomicInteger INDEX = new AtomicInteger(Avatar.INDEX.get());

        public static final MetadataEntry<Object> PROFILE = resolvableProfile(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IMMOVABLE = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<@Nullable ComponentProperties> BELOW_NAME = optComponent(INDEX.incrementAndGet());
    }

    public static class Player extends Avatar {
        private static final AtomicInteger INDEX = new AtomicInteger(Avatar.INDEX.get());

        public static final MetadataEntry<Float> ADDITIONAL_HEARTS = _float(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> SCORE = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<@Nullable Integer> LEFT_SHOULDER_ENTITY = optVarInt(INDEX.incrementAndGet());
        public static final MetadataEntry<@Nullable Integer> RIGHT_SHOULDER_ENTITY = optVarInt(INDEX.incrementAndGet());
    }

    public static class Mob extends LivingEntity {
        private static final AtomicInteger INDEX = new AtomicInteger(LivingEntity.INDEX.get());

        public static final MetadataEntry<Boolean> IS_NO_AI = bitmask(INDEX.incrementAndGet(), 0x01);
        public static final MetadataEntry<Boolean> IS_LEFT_HANDED = bitmask(INDEX.get(), 0x02);
        public static final MetadataEntry<Boolean> IS_AGGRESSIVE = bitmask(INDEX.get(), 0x04);
    }

    public static class Bat extends Mob {
        private static final AtomicInteger INDEX = new AtomicInteger(Mob.INDEX.get());

        public static final MetadataEntry<Boolean> IS_HANGING = bitmask(INDEX.incrementAndGet(), 0x01);
    }

    public static class EnderDragon extends Mob {
        private static final AtomicInteger INDEX = new AtomicInteger(Mob.INDEX.get());

        public static final MetadataEntry<Integer> DRAGON_PHASE = varInt(INDEX.incrementAndGet());
    }

    public static class Ghast extends Mob {
        private static final AtomicInteger INDEX = new AtomicInteger(Mob.INDEX.get());

        public static final MetadataEntry<Boolean> IS_ATTACKING = _boolean(INDEX.incrementAndGet());
    }

    public static class Phantom extends Mob {
        private static final AtomicInteger INDEX = new AtomicInteger(Mob.INDEX.get());

        public static final MetadataEntry<Integer> SIZE = varInt(INDEX.incrementAndGet());
    }

    public static class Slime extends Mob {
        private static final AtomicInteger INDEX = new AtomicInteger(Mob.INDEX.get());

        public static final MetadataEntry<Integer> SIZE = varInt(INDEX.incrementAndGet());
    }

    public static class MagmaCube extends Slime {}

    public static class Creature extends Mob {
        private static final AtomicInteger INDEX = new AtomicInteger(Mob.INDEX.get());
    }

    public static class Allay extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Boolean> IS_DANCING = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> CAN_DUPLICATE = _boolean(INDEX.incrementAndGet());
    }

    public static class CopperGolem extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Object> WEATHERING_STATE = weatheringCopperState(INDEX.incrementAndGet());
        public static final MetadataEntry<Object> COPPER_GOLEM_STATE = copperGolemState(INDEX.incrementAndGet());
    }

    public static class IronGolem extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Boolean> IS_PLAYER_CREATED = bitmask(INDEX.incrementAndGet(), 0x01);
    }

    public static class Pufferfish extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Boolean> IS_FROM_BUCKET = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> PUFF_STATE = varInt(INDEX.incrementAndGet());
    }

    public static class Shulker extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<BlockFace> ATTACH_FACE = direction(INDEX.incrementAndGet());
        public static final MetadataEntry<Byte> SHIELD_HEIGHT = _byte(INDEX.incrementAndGet());
        public static final MetadataEntry<Byte> COLOR = _byte(INDEX.incrementAndGet());
    }

    public static class SnowGolem extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Boolean> HAS_PUMPKIN_HAT = bitmask(INDEX.incrementAndGet(), 0x10);
    }

    public static class Tadpole extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Boolean> IS_FROM_BUCKET = _boolean(INDEX.incrementAndGet());
    }

    public static class AgeableMob extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Boolean> IS_BABY = _boolean(INDEX.incrementAndGet());
    }

    public static class Dolphin extends AgeableMob {
        private static final AtomicInteger INDEX = new AtomicInteger(AgeableMob.INDEX.get());

        public static final MetadataEntry<Boolean> HAS_FISH = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> MOISTURE_LEVEL = varInt(INDEX.incrementAndGet());
    }

    public static class Squid extends AgeableMob {
        private static final AtomicInteger INDEX = new AtomicInteger(AgeableMob.INDEX.get());
    }

    public static class GlowSquid extends Squid {
        private static final AtomicInteger INDEX = new AtomicInteger(Squid.INDEX.get());

        public static final MetadataEntry<Integer> DARK_TICKS_REMAINING = varInt(INDEX.incrementAndGet());
    }

    public static class Animal extends AgeableMob {
        private static final AtomicInteger INDEX = new AtomicInteger(AgeableMob.INDEX.get());
    }

    public static class Armadillo extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Object> ARMADILLO_STATE = armadilloState(INDEX.incrementAndGet());
    }

    public static class Axolotl extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Integer> VARIANT = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_PLAYING_DEAD = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_FROM_BUCKET = _boolean(INDEX.incrementAndGet());
    }

    public static class Bee extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_ANGRY = bitmask(INDEX.incrementAndGet(), 0x02);
        public static final MetadataEntry<Boolean> HAS_STUNG = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<Boolean> HAS_NECTAR = bitmask(INDEX.get(), 0x08);
        public static final MetadataEntry<Long> ANGER_TIME_TICKS = varLong(INDEX.incrementAndGet());
    }

    public static class Chicken extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final ServerAwareMetadataEntry<MobVariant> VARIANT = chickenVariant(INDEX.incrementAndGet());
    }

    public static class Cow extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final ServerAwareMetadataEntry<MobVariant> VARIANT = cowVariant(INDEX.incrementAndGet());
    }

    public static class Fox extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Integer> TYPE = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_SITTING = bitmask(INDEX.incrementAndGet(), 0x01);
        public static final MetadataEntry<Boolean> IS_CROUCHING = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<Boolean> IS_INTERESTED = bitmask(INDEX.get(), 0x08);
        public static final MetadataEntry<Boolean> IS_POUNCING = bitmask(INDEX.get(), 0x10);
        public static final MetadataEntry<Boolean> IS_SLEEPING = bitmask(INDEX.get(), 0x20);
        public static final MetadataEntry<Boolean> IS_FACEPLANTED = bitmask(INDEX.get(), 0x40);
        public static final MetadataEntry<Boolean> IS_DEFENDING = bitmask(INDEX.get(), 0x80);
    }

    public static class Frog extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final ServerAwareMetadataEntry<MobVariant> VARIANT = frogVariant(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> TONGUE_TARGET = varInt(INDEX.incrementAndGet());
    }

    public static class HappyGhast extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_LEASH_HOLDER = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> STAYS_STILL = _boolean(INDEX.incrementAndGet());
    }

    public static class Goat extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_SCREAMING_GOAT = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> HAS_LEFT_HORN = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> HAS_RIGHT_HORN = _boolean(INDEX.incrementAndGet());
    }

    public static class Hoglin extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_IMMUNE_TO_ZOMBIFICATION = _boolean(INDEX.incrementAndGet());
    }

    public static class Mooshroom extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Integer> VARIANT = varInt(INDEX.incrementAndGet());
    }

    public static class Ocelot extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_TRUSTING = _boolean(INDEX.incrementAndGet());
    }

    public static class Panda extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Integer> BREED_TIMER = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> SNEEZE_TIMER = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> EAT_TIMER = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Byte> MAIN_GENE = _byte(INDEX.incrementAndGet());
        public static final MetadataEntry<Byte> HIDDEN_GENE = _byte(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_SNEEZING = bitmask(INDEX.incrementAndGet(), 0x02);
        public static final MetadataEntry<Boolean> IS_ROLLING = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<Boolean> IS_SITTING = bitmask(INDEX.get(), 0x08);
        public static final MetadataEntry<Boolean> IS_ON_BACK = bitmask(INDEX.get(), 0x10);
    }

    public static class Pig extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Integer> TOTAL_BOOST_TIME = varInt(INDEX.incrementAndGet());
        public static final ServerAwareMetadataEntry<MobVariant> VARIANT = pigVariant(INDEX.incrementAndGet());
    }

    public static class PolarBear extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_STANDING_UP = _boolean(INDEX.incrementAndGet());
    }

    public static class Rabbit extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Integer> TYPE = varInt(INDEX.incrementAndGet());
    }

    public static class Sheep extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Byte> COLOR = _byte(INDEX.incrementAndGet(), 0x0F);
        public static final MetadataEntry<Boolean> IS_SHEARED = bitmask(INDEX.get(), 0x10);
    }

    public static class Sniffer extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Object> STATE = snifferState(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> DROP_SEED_AT_TICK = varInt(INDEX.incrementAndGet());
    }

    public static class Strider extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Integer> TOTAL_BOOST_TIME = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_SHAKING = _boolean(INDEX.incrementAndGet());
    }

    public static class Turtle extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> HAS_EGG = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_LAYING_EGG = _boolean(INDEX.incrementAndGet());
    }

    public static class AbstractHorse extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_TAME = bitmask(INDEX.incrementAndGet(), 0x02);
        public static final MetadataEntry<Boolean> HAS_BRED = bitmask(INDEX.get(), 0x08);
        public static final MetadataEntry<Boolean> IS_EATING = bitmask(INDEX.get(), 0x10);
        public static final MetadataEntry<Boolean> IS_REARING = bitmask(INDEX.get(), 0x20);
        public static final MetadataEntry<Boolean> IS_MOUTH_OPEN = bitmask(INDEX.get(), 0x40);
    }

    public static class Camel extends AbstractHorse {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractHorse.INDEX.get());

        public static final MetadataEntry<Boolean> IS_DASHING = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Long> LAST_POSE_CHANGE_TICK = varLong(INDEX.incrementAndGet());
    }

    public static class CamelHusk extends Camel {}

    public static class Horse extends AbstractHorse {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractHorse.INDEX.get());

        public static final MetadataEntry<Integer> VARIANT = varInt(INDEX.incrementAndGet());
    }

    public static class SkeletonHorse extends AbstractHorse {}

    public static class ZombieHorse extends AbstractHorse {}

    public static class ChestedHorse extends AbstractHorse {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractHorse.INDEX.get());

        public static final MetadataEntry<Boolean> HAS_CHEST = _boolean(INDEX.incrementAndGet());
    }

    public static class Donkey extends ChestedHorse {}

    public static class Llama extends ChestedHorse {
        private static final AtomicInteger INDEX = new AtomicInteger(ChestedHorse.INDEX.get());

        public static final MetadataEntry<Integer> STRENGTH = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> VARIANT = varInt(INDEX.incrementAndGet());
    }

    public static class TraderLlama extends Llama {}

    public static class Mule extends ChestedHorse {}

    public static class TameableAnimal extends Animal {
        private static final AtomicInteger INDEX = new AtomicInteger(Animal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_SITTING = bitmask(INDEX.incrementAndGet(), 0x01);
        public static final MetadataEntry<Boolean> IS_TAMED = bitmask(INDEX.get(), 0x04);
        public static final MetadataEntry<@Nullable UUID> OWNER = optLivingEntity(INDEX.incrementAndGet());
    }

    public static class Cat extends TameableAnimal {
        private static final AtomicInteger INDEX = new AtomicInteger(TameableAnimal.INDEX.get());

        public static final MetadataEntry<Integer> VARIANT = varInt(INDEX.incrementAndGet());
    }

    public static class Wolf extends TameableAnimal {
        private static final AtomicInteger INDEX = new AtomicInteger(TameableAnimal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_BEGGING = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> COLLAR_COLOR = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Long> ANGER_TIME = varLong(INDEX.incrementAndGet());
        public static final ServerAwareMetadataEntry<WolfVariant> VARIANT = wolfVariant(INDEX.incrementAndGet());
        public static final ServerAwareMetadataEntry<WolfSoundVariant> SOUND_VARIANT = wolfSoundVariant(INDEX.incrementAndGet());
    }

    public static class AbstractNautilus extends TameableAnimal {
        private static final AtomicInteger INDEX = new AtomicInteger(TameableAnimal.INDEX.get());

        public static final MetadataEntry<Boolean> IS_DASHING = _boolean(INDEX.incrementAndGet());
    }

    public static class Nautilus extends AbstractNautilus {}

    public static class ZombifiedNautilus extends AbstractNautilus {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractNautilus.INDEX.get());

        public static final ServerAwareMetadataEntry<MobVariant> VARIANT = zombieNautilusVariant(INDEX.incrementAndGet());
    }

    public static class AbstractVillager extends AgeableMob {
        private static final AtomicInteger INDEX = new AtomicInteger(AgeableMob.INDEX.get());

        public static final MetadataEntry<Integer> HEAD_SHAKE_TIMER = varInt(INDEX.incrementAndGet());
    }

    public static class Villager extends AbstractVillager {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractVillager.INDEX.get());

        public static final MetadataEntry<Object> VILLAGER_DATA = villagerData(INDEX.incrementAndGet());
    }

    public static class WanderingTrader extends AbstractVillager {}

    public static class AbstractFish extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());

        public static final MetadataEntry<Boolean> IS_FROM_BUCKET = _boolean(INDEX.incrementAndGet());
    }

    public static class Cod extends AbstractFish {}

    public static class Salmon extends AbstractFish {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractFish.INDEX.get());

        public static final MetadataEntry<Integer> TYPE = varInt(INDEX.incrementAndGet());
    }

    public static class TropicalFish extends AbstractFish {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractFish.INDEX.get());

        public static final MetadataEntry<Integer> TYPE = varInt(INDEX.incrementAndGet());
    }

    public static class Monster extends Creature {
        private static final AtomicInteger INDEX = new AtomicInteger(Creature.INDEX.get());
    }

    public static class Blaze extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_ON_FIRE = bitmask(INDEX.incrementAndGet(), 0x01);
    }

    public static class Bogged extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_SHEARED = _boolean(INDEX.incrementAndGet());
    }

    public static class Breeze extends Monster {}

    public static class Creaking extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> CAN_MOVE = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_ACTIVE = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_TEARING_DOWN = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<@Nullable Vector3d> HOME_POSITION = optPosition(INDEX.incrementAndGet());
    }

    public static class Creeper extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        /**
         * State (idle = -1, fuse = 1)
         */
        public static final MetadataEntry<Integer> STATE = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_CHARGED = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_IGNITED = _boolean(INDEX.incrementAndGet());
    }

    public static class Enderman extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<BlockData> CARRIED_BLOCK = blockState(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_SCREAMING = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_STARING = _boolean(INDEX.incrementAndGet());
    }

    public static class Endermite extends Monster {}

    public static class Giant extends Monster {}

    public static class Guardian extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_RETRACTING_SPIKES = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> TARGET = varInt(INDEX.incrementAndGet());
    }

    public static class ElderGuardian extends Guardian {}

    public static class Parched extends Monster {}

    public static class Silverfish extends Monster {}

    public static class Skeleton extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_BEING_CONVERTED_TO_STRAY = _boolean(INDEX.incrementAndGet());
    }

    public static class Spider extends Monster {
    }

    public static class CaveSpider extends Spider {}

    public static class Stray extends Monster {}

    public static class Vex extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_ATTACKING = bitmask(INDEX.incrementAndGet(), 0x01);
    }

    public static class Warden extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Integer> ANGER_LEVEL = varInt(INDEX.incrementAndGet());
    }

    public static class Wither extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Integer> CENTER_HEAD_TARGET = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> LEFT_HEAD_TARGET = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> RIGHT_HEAD_TARGET = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> INVULNERABLE_TIME = varInt(INDEX.incrementAndGet());
    }

    public static class WitherSkeleton extends Monster {}

    public static class Zoglin extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_BABY = _boolean(INDEX.incrementAndGet());
    }

    public static class Zombie extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_BABY = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_BECOMING_DROWNED = _boolean(INDEX.addAndGet(2));
    }

    public static class Drowned extends Zombie {}

    public static class Husk extends Zombie {}

    public static class ZombieVillager extends Zombie {
        private static final AtomicInteger INDEX = new AtomicInteger(Zombie.INDEX.get());

        public static final MetadataEntry<Boolean> IS_CONVERTING = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Object> VILLAGER_DATA = villagerData(INDEX.incrementAndGet());
    }

    public static class ZombifiedPiglin extends Zombie {}

    public static class BasePiglin extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_IMMUNE_TO_ZOMBIFICATION = _boolean(INDEX.incrementAndGet());
    }

    public static class Piglin extends BasePiglin {
        private static final AtomicInteger INDEX = new AtomicInteger(BasePiglin.INDEX.get());

        public static final MetadataEntry<Boolean> IS_BABY = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_CHARGING_CROSSBOW = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_DANCING = _boolean(INDEX.incrementAndGet());
    }

    public static class PiglinBrute extends BasePiglin {}

    public static class Raider extends Monster {
        private static final AtomicInteger INDEX = new AtomicInteger(Monster.INDEX.get());

        public static final MetadataEntry<Boolean> IS_CELEBRATING = _boolean(INDEX.incrementAndGet());
    }

    public static class Pillager extends Raider {
        private static final AtomicInteger INDEX = new AtomicInteger(Raider.INDEX.get());

        public static final MetadataEntry<Boolean> IS_CHARGING = _boolean(INDEX.incrementAndGet());
    }

    public static class Ravager extends Raider {}

    public static class Vindicator extends Raider {}

    public static class Witch extends Raider {
        private static final AtomicInteger INDEX = new AtomicInteger(Raider.INDEX.get());

        public static final MetadataEntry<Boolean> IS_DRINKING_POTION = _boolean(INDEX.incrementAndGet());
    }

    public static class SpellcasterIllager extends Raider {
        private static final AtomicInteger INDEX = new AtomicInteger(Raider.INDEX.get());

        /**
         * Spell (0: none, 1: summon vex, 2: attack, 3: wololo, 4: disappear, 5: blindness)
         */
        public static final MetadataEntry<Byte> SPELL = _byte(INDEX.incrementAndGet());
    }

    public static class Evoker extends SpellcasterIllager {}

    public static class Illusioner extends SpellcasterIllager {}

    public static class ThrownItemProjectile extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Object> ITEM = slot(INDEX.incrementAndGet());
    }

    public static class ThrownEgg extends ThrownItemProjectile {}

    public static class ThrownEnderPearl extends ThrownItemProjectile {}

    public static class ThrownBottleOEnchanting extends ThrownItemProjectile {}

    public static class SplashPotion extends ThrownItemProjectile {}

    public static class LingeringPotion extends ThrownItemProjectile {}

    public static class Snowball extends ThrownItemProjectile {}

    public static class AbstractVehicle extends Entity {
        private static final AtomicInteger INDEX = new AtomicInteger(Entity.INDEX.get());

        public static final MetadataEntry<Integer> SHAKING_POWER = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> SHAKING_DIRECTION = varInt(INDEX.incrementAndGet());
        public static final MetadataEntry<Float> SHAKING_MULTIPLIER = _float(INDEX.incrementAndGet());
    }

    public static class Boat extends AbstractVehicle {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractVehicle.INDEX.get());

        public static final MetadataEntry<Boolean> IS_LEFT_PADDLE_TURNING = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Boolean> IS_RIGHT_PADDLE_TURNING = _boolean(INDEX.incrementAndGet());
        public static final MetadataEntry<Integer> SPLASH_TIMER = varInt(INDEX.incrementAndGet());
    }

    public static class AcaciaBoat extends Boat {}

    public static class AcaciaBoatWithChest extends Boat {}

    public static class BambooRaft extends Boat {}

    public static class BambooRaftWithChest extends Boat {}

    public static class BirchBoat extends Boat {}

    public static class BirchBoatWithChest extends Boat {}

    public static class CherryBoat extends Boat {}

    public static class CherryBoatWithChest extends Boat {}

    public static class DarkOakBoat extends Boat {}

    public static class DarkOakBoatWithChest extends Boat {}

    public static class JungleBoat extends Boat {}

    public static class JungleBoatWithChest extends Boat {}

    public static class MangroveBoat extends Boat {}

    public static class MangroveBoatWithChest extends Boat {}

    public static class OakBoat extends Boat {}

    public static class OakBoatWithChest extends Boat {}

    public static class PaleOakBoat extends Boat {}

    public static class PaleOakBoatWithChest extends Boat {}

    public static class SpruceBoat extends Boat {}

    public static class SpruceBoatWithChest extends Boat {}

    public static class AbstractMinecart extends AbstractVehicle {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractVehicle.INDEX.get());

        public static final MetadataEntry<BlockData> BLOCK = blockState(INDEX.incrementAndGet());
        /**
         * Custom block Y position (in 16ths of a block)
         */
        public static final MetadataEntry<Integer> BLOCK_Y_POS = varInt(INDEX.incrementAndGet());
    }

    public static class MinecartWithChest extends AbstractMinecart {}

    public static class MinecartWithCommandBlock extends AbstractMinecart {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractMinecart.INDEX.get());

        public static final MetadataEntry<String> COMMAND = string(INDEX.incrementAndGet());
        public static final MetadataEntry<ComponentProperties> LAST_OUTPUT = component(INDEX.incrementAndGet());
    }

    public static class MinecartWithFurnace extends AbstractMinecart {
        private static final AtomicInteger INDEX = new AtomicInteger(AbstractMinecart.INDEX.get());

        public static final MetadataEntry<Boolean> HAS_FUEL = _boolean(INDEX.incrementAndGet());
    }

    public static class MinecartWithHopper extends AbstractMinecart {}

    public static class Minecart extends AbstractMinecart {}

    public static class MinecartWithMonsterSpawner extends AbstractMinecart {}

    public static class MinecartWithTNT extends AbstractMinecart {}

}
