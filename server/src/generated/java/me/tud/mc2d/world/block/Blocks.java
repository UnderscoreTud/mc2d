package me.tud.mc2d.world.block;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import me.tud.mc2d.item.Item;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.registry.BuiltInRegistry;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.registry.tag.Tag;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.blockdata.AmethystClusterData;
import me.tud.mc2d.world.blockdata.AnvilData;
import me.tud.mc2d.world.blockdata.AttachedStemData;
import me.tud.mc2d.world.blockdata.BambooStalkData;
import me.tud.mc2d.world.blockdata.BannerData;
import me.tud.mc2d.world.blockdata.BarrelData;
import me.tud.mc2d.world.blockdata.BarrierData;
import me.tud.mc2d.world.blockdata.BaseCoralFanData;
import me.tud.mc2d.world.blockdata.BaseCoralPlantData;
import me.tud.mc2d.world.blockdata.BaseCoralWallFanData;
import me.tud.mc2d.world.blockdata.BedData;
import me.tud.mc2d.world.blockdata.BeehiveData;
import me.tud.mc2d.world.blockdata.BeetrootData;
import me.tud.mc2d.world.blockdata.BellData;
import me.tud.mc2d.world.blockdata.BigDripleafData;
import me.tud.mc2d.world.blockdata.BigDripleafStemData;
import me.tud.mc2d.world.blockdata.BlastFurnaceData;
import me.tud.mc2d.world.blockdata.BlockData;
import me.tud.mc2d.world.blockdata.BrewingStandData;
import me.tud.mc2d.world.blockdata.BrushableData;
import me.tud.mc2d.world.blockdata.BubbleColumnData;
import me.tud.mc2d.world.blockdata.ButtonData;
import me.tud.mc2d.world.blockdata.CactusData;
import me.tud.mc2d.world.blockdata.CakeData;
import me.tud.mc2d.world.blockdata.CalibratedSculkSensorData;
import me.tud.mc2d.world.blockdata.CampfireData;
import me.tud.mc2d.world.blockdata.CandleCakeData;
import me.tud.mc2d.world.blockdata.CandleData;
import me.tud.mc2d.world.blockdata.CarrotData;
import me.tud.mc2d.world.blockdata.CaveVinesData;
import me.tud.mc2d.world.blockdata.CaveVinesPlantData;
import me.tud.mc2d.world.blockdata.CeilingHangingSignData;
import me.tud.mc2d.world.blockdata.ChainData;
import me.tud.mc2d.world.blockdata.ChestData;
import me.tud.mc2d.world.blockdata.ChiseledBookShelfData;
import me.tud.mc2d.world.blockdata.ChorusFlowerData;
import me.tud.mc2d.world.blockdata.ChorusPlantData;
import me.tud.mc2d.world.blockdata.CocoaData;
import me.tud.mc2d.world.blockdata.CommandData;
import me.tud.mc2d.world.blockdata.ComparatorData;
import me.tud.mc2d.world.blockdata.ComposterData;
import me.tud.mc2d.world.blockdata.ConduitData;
import me.tud.mc2d.world.blockdata.CopperBulbBlockData;
import me.tud.mc2d.world.blockdata.CopperChestData;
import me.tud.mc2d.world.blockdata.CopperGolemStatueData;
import me.tud.mc2d.world.blockdata.CoralFanData;
import me.tud.mc2d.world.blockdata.CoralPlantData;
import me.tud.mc2d.world.blockdata.CoralWallFanData;
import me.tud.mc2d.world.blockdata.CrafterData;
import me.tud.mc2d.world.blockdata.CreakingHeartData;
import me.tud.mc2d.world.blockdata.CropData;
import me.tud.mc2d.world.blockdata.DaylightDetectorData;
import me.tud.mc2d.world.blockdata.DecoratedPotData;
import me.tud.mc2d.world.blockdata.DetectorRailData;
import me.tud.mc2d.world.blockdata.DispenserData;
import me.tud.mc2d.world.blockdata.DoorData;
import me.tud.mc2d.world.blockdata.DoublePlantData;
import me.tud.mc2d.world.blockdata.DriedGhastData;
import me.tud.mc2d.world.blockdata.DropperData;
import me.tud.mc2d.world.blockdata.EndPortalFrameData;
import me.tud.mc2d.world.blockdata.EndRodData;
import me.tud.mc2d.world.blockdata.EnderChestData;
import me.tud.mc2d.world.blockdata.FarmData;
import me.tud.mc2d.world.blockdata.FenceData;
import me.tud.mc2d.world.blockdata.FenceGateData;
import me.tud.mc2d.world.blockdata.FireData;
import me.tud.mc2d.world.blockdata.FlowerBedData;
import me.tud.mc2d.world.blockdata.FrostedIceData;
import me.tud.mc2d.world.blockdata.FurnaceData;
import me.tud.mc2d.world.blockdata.GlazedTerracottaData;
import me.tud.mc2d.world.blockdata.GlowLichenData;
import me.tud.mc2d.world.blockdata.GrassData;
import me.tud.mc2d.world.blockdata.GrindstoneData;
import me.tud.mc2d.world.blockdata.HangingMossData;
import me.tud.mc2d.world.blockdata.HangingRootsData;
import me.tud.mc2d.world.blockdata.HayData;
import me.tud.mc2d.world.blockdata.HeavyCoreData;
import me.tud.mc2d.world.blockdata.HopperData;
import me.tud.mc2d.world.blockdata.HugeMushroomData;
import me.tud.mc2d.world.blockdata.InfestedRotatedPillarData;
import me.tud.mc2d.world.blockdata.IronBarsData;
import me.tud.mc2d.world.blockdata.JackOLanternData;
import me.tud.mc2d.world.blockdata.JigsawData;
import me.tud.mc2d.world.blockdata.JukeboxData;
import me.tud.mc2d.world.blockdata.KelpData;
import me.tud.mc2d.world.blockdata.LadderData;
import me.tud.mc2d.world.blockdata.LanternData;
import me.tud.mc2d.world.blockdata.LayeredCauldronData;
import me.tud.mc2d.world.blockdata.LeafLitterData;
import me.tud.mc2d.world.blockdata.LecternData;
import me.tud.mc2d.world.blockdata.LeverData;
import me.tud.mc2d.world.blockdata.LightData;
import me.tud.mc2d.world.blockdata.LightningRodData;
import me.tud.mc2d.world.blockdata.LiquidData;
import me.tud.mc2d.world.blockdata.LoomData;
import me.tud.mc2d.world.blockdata.MangroveLeavesData;
import me.tud.mc2d.world.blockdata.MangrovePropaguleData;
import me.tud.mc2d.world.blockdata.MangroveRootsData;
import me.tud.mc2d.world.blockdata.MossyCarpetData;
import me.tud.mc2d.world.blockdata.MovingPistonData;
import me.tud.mc2d.world.blockdata.MultifaceData;
import me.tud.mc2d.world.blockdata.MyceliumData;
import me.tud.mc2d.world.blockdata.NetherPortalData;
import me.tud.mc2d.world.blockdata.NetherWartData;
import me.tud.mc2d.world.blockdata.NoteData;
import me.tud.mc2d.world.blockdata.ObserverData;
import me.tud.mc2d.world.blockdata.PiglinwallskullData;
import me.tud.mc2d.world.blockdata.PistonBaseData;
import me.tud.mc2d.world.blockdata.PistonHeadData;
import me.tud.mc2d.world.blockdata.PitcherCropData;
import me.tud.mc2d.world.blockdata.PlayerHeadData;
import me.tud.mc2d.world.blockdata.PlayerWallHeadData;
import me.tud.mc2d.world.blockdata.PointedDripstoneData;
import me.tud.mc2d.world.blockdata.PotatoData;
import me.tud.mc2d.world.blockdata.PoweredRailData;
import me.tud.mc2d.world.blockdata.PressurePlateData;
import me.tud.mc2d.world.blockdata.RailData;
import me.tud.mc2d.world.blockdata.RedstoneLampData;
import me.tud.mc2d.world.blockdata.RedstoneOreData;
import me.tud.mc2d.world.blockdata.RedstoneTorchData;
import me.tud.mc2d.world.blockdata.RedstoneWallTorchData;
import me.tud.mc2d.world.blockdata.RedstoneWireData;
import me.tud.mc2d.world.blockdata.RepeaterData;
import me.tud.mc2d.world.blockdata.RespawnAnchorData;
import me.tud.mc2d.world.blockdata.RotatedPillarData;
import me.tud.mc2d.world.blockdata.SaplingData;
import me.tud.mc2d.world.blockdata.ScaffoldingData;
import me.tud.mc2d.world.blockdata.SculkCatalystData;
import me.tud.mc2d.world.blockdata.SculkSensorData;
import me.tud.mc2d.world.blockdata.SculkShriekerData;
import me.tud.mc2d.world.blockdata.SculkVeinData;
import me.tud.mc2d.world.blockdata.SeaPickleData;
import me.tud.mc2d.world.blockdata.ShelfData;
import me.tud.mc2d.world.blockdata.ShulkerBoxData;
import me.tud.mc2d.world.blockdata.SkullData;
import me.tud.mc2d.world.blockdata.SlabData;
import me.tud.mc2d.world.blockdata.SmallDripleafData;
import me.tud.mc2d.world.blockdata.SmokerData;
import me.tud.mc2d.world.blockdata.SnifferEggData;
import me.tud.mc2d.world.blockdata.SnowLayerData;
import me.tud.mc2d.world.blockdata.SnowyDirtData;
import me.tud.mc2d.world.blockdata.StainedGlassPaneData;
import me.tud.mc2d.world.blockdata.StairData;
import me.tud.mc2d.world.blockdata.StandingSignData;
import me.tud.mc2d.world.blockdata.StemData;
import me.tud.mc2d.world.blockdata.StonecutterData;
import me.tud.mc2d.world.blockdata.StructureData;
import me.tud.mc2d.world.blockdata.SugarCaneData;
import me.tud.mc2d.world.blockdata.SweetBerryBushData;
import me.tud.mc2d.world.blockdata.TallFlowerData;
import me.tud.mc2d.world.blockdata.TallSeagrassData;
import me.tud.mc2d.world.blockdata.TargetData;
import me.tud.mc2d.world.blockdata.TestData;
import me.tud.mc2d.world.blockdata.TintedParticleLeavesData;
import me.tud.mc2d.world.blockdata.TntData;
import me.tud.mc2d.world.blockdata.TorchflowerCropData;
import me.tud.mc2d.world.blockdata.TrapdoorData;
import me.tud.mc2d.world.blockdata.TrappedChestData;
import me.tud.mc2d.world.blockdata.TrialSpawnerData;
import me.tud.mc2d.world.blockdata.TripWireHookData;
import me.tud.mc2d.world.blockdata.TripwireData;
import me.tud.mc2d.world.blockdata.TurtleEggData;
import me.tud.mc2d.world.blockdata.TwistingVinesData;
import me.tud.mc2d.world.blockdata.UntintedParticleLeavesData;
import me.tud.mc2d.world.blockdata.VaultData;
import me.tud.mc2d.world.blockdata.VineData;
import me.tud.mc2d.world.blockdata.WallBannerData;
import me.tud.mc2d.world.blockdata.WallData;
import me.tud.mc2d.world.blockdata.WallHangingSignData;
import me.tud.mc2d.world.blockdata.WallSignData;
import me.tud.mc2d.world.blockdata.WallSkullData;
import me.tud.mc2d.world.blockdata.WallTorchData;
import me.tud.mc2d.world.blockdata.WaterloggedTransparentData;
import me.tud.mc2d.world.blockdata.WeatheringCopperBarData;
import me.tud.mc2d.world.blockdata.WeatheringCopperBulbData;
import me.tud.mc2d.world.blockdata.WeatheringCopperChainData;
import me.tud.mc2d.world.blockdata.WeatheringCopperChestData;
import me.tud.mc2d.world.blockdata.WeatheringCopperDoorData;
import me.tud.mc2d.world.blockdata.WeatheringCopperGolemStatueData;
import me.tud.mc2d.world.blockdata.WeatheringCopperGrateData;
import me.tud.mc2d.world.blockdata.WeatheringCopperSlabData;
import me.tud.mc2d.world.blockdata.WeatheringCopperStairData;
import me.tud.mc2d.world.blockdata.WeatheringCopperTrapDoorData;
import me.tud.mc2d.world.blockdata.WeatheringLanternData;
import me.tud.mc2d.world.blockdata.WeatheringLightningRodData;
import me.tud.mc2d.world.blockdata.WeepingVinesData;
import me.tud.mc2d.world.blockdata.WeightedPressurePlateData;
import me.tud.mc2d.world.blockdata.WitherSkullData;
import me.tud.mc2d.world.blockdata.WitherWallSkullData;

/**
 * This class contains autogenerated code. Please do <b>NOT</b> edit manually.
 */
@Generated("me.tud.mc2d.generators.blocks.BlocksGenerator")
sealed class Blocks permits Block {
    public static final Block<BlockData> AIR = new Block<>(0, 0, NamespacedKey.parse("minecraft:air"), () -> new BlockData(Block.AIR, 0), () -> Item.AIR);

    public static final Block<BlockData> STONE = new Block<>(1, 1, NamespacedKey.parse("minecraft:stone"), () -> new BlockData(Block.STONE, 1), () -> Item.STONE);

    public static final Block<BlockData> GRANITE = new Block<>(2, 2, NamespacedKey.parse("minecraft:granite"), () -> new BlockData(Block.GRANITE, 2), () -> Item.GRANITE);

    public static final Block<BlockData> POLISHED_GRANITE = new Block<>(3, 3, NamespacedKey.parse("minecraft:polished_granite"), () -> new BlockData(Block.POLISHED_GRANITE, 3), () -> Item.POLISHED_GRANITE);

    public static final Block<BlockData> DIORITE = new Block<>(4, 4, NamespacedKey.parse("minecraft:diorite"), () -> new BlockData(Block.DIORITE, 4), () -> Item.DIORITE);

    public static final Block<BlockData> POLISHED_DIORITE = new Block<>(5, 5, NamespacedKey.parse("minecraft:polished_diorite"), () -> new BlockData(Block.POLISHED_DIORITE, 5), () -> Item.POLISHED_DIORITE);

    public static final Block<BlockData> ANDESITE = new Block<>(6, 6, NamespacedKey.parse("minecraft:andesite"), () -> new BlockData(Block.ANDESITE, 6), () -> Item.ANDESITE);

    public static final Block<BlockData> POLISHED_ANDESITE = new Block<>(7, 7, NamespacedKey.parse("minecraft:polished_andesite"), () -> new BlockData(Block.POLISHED_ANDESITE, 7), () -> Item.POLISHED_ANDESITE);

    public static final Block<GrassData> GRASS_BLOCK = new Block<>(8, 8, NamespacedKey.parse("minecraft:grass_block"), () -> new GrassData(Block.GRASS_BLOCK, 8), () -> Item.GRASS_BLOCK);

    public static final Block<BlockData> DIRT = new Block<>(9, 10, NamespacedKey.parse("minecraft:dirt"), () -> new BlockData(Block.DIRT, 10), () -> Item.DIRT);

    public static final Block<BlockData> COARSE_DIRT = new Block<>(10, 11, NamespacedKey.parse("minecraft:coarse_dirt"), () -> new BlockData(Block.COARSE_DIRT, 11), () -> Item.COARSE_DIRT);

    public static final Block<SnowyDirtData> PODZOL = new Block<>(11, 12, NamespacedKey.parse("minecraft:podzol"), () -> new SnowyDirtData(Block.PODZOL, 12), () -> Item.PODZOL);

    public static final Block<BlockData> COBBLESTONE = new Block<>(12, 14, NamespacedKey.parse("minecraft:cobblestone"), () -> new BlockData(Block.COBBLESTONE, 14), () -> Item.COBBLESTONE);

    public static final Block<BlockData> OAK_PLANKS = new Block<>(13, 15, NamespacedKey.parse("minecraft:oak_planks"), () -> new BlockData(Block.OAK_PLANKS, 15), () -> Item.OAK_PLANKS);

    public static final Block<BlockData> SPRUCE_PLANKS = new Block<>(14, 16, NamespacedKey.parse("minecraft:spruce_planks"), () -> new BlockData(Block.SPRUCE_PLANKS, 16), () -> Item.SPRUCE_PLANKS);

    public static final Block<BlockData> BIRCH_PLANKS = new Block<>(15, 17, NamespacedKey.parse("minecraft:birch_planks"), () -> new BlockData(Block.BIRCH_PLANKS, 17), () -> Item.BIRCH_PLANKS);

    public static final Block<BlockData> JUNGLE_PLANKS = new Block<>(16, 18, NamespacedKey.parse("minecraft:jungle_planks"), () -> new BlockData(Block.JUNGLE_PLANKS, 18), () -> Item.JUNGLE_PLANKS);

    public static final Block<BlockData> ACACIA_PLANKS = new Block<>(17, 19, NamespacedKey.parse("minecraft:acacia_planks"), () -> new BlockData(Block.ACACIA_PLANKS, 19), () -> Item.ACACIA_PLANKS);

    public static final Block<BlockData> CHERRY_PLANKS = new Block<>(18, 20, NamespacedKey.parse("minecraft:cherry_planks"), () -> new BlockData(Block.CHERRY_PLANKS, 20), () -> Item.CHERRY_PLANKS);

    public static final Block<BlockData> DARK_OAK_PLANKS = new Block<>(19, 21, NamespacedKey.parse("minecraft:dark_oak_planks"), () -> new BlockData(Block.DARK_OAK_PLANKS, 21), () -> Item.DARK_OAK_PLANKS);

    public static final Block<RotatedPillarData> PALE_OAK_WOOD = new Block<>(20, 22, NamespacedKey.parse("minecraft:pale_oak_wood"), () -> new RotatedPillarData(Block.PALE_OAK_WOOD, 22), () -> Item.PALE_OAK_WOOD);

    public static final Block<BlockData> PALE_OAK_PLANKS = new Block<>(21, 25, NamespacedKey.parse("minecraft:pale_oak_planks"), () -> new BlockData(Block.PALE_OAK_PLANKS, 25), () -> Item.PALE_OAK_PLANKS);

    public static final Block<BlockData> MANGROVE_PLANKS = new Block<>(22, 26, NamespacedKey.parse("minecraft:mangrove_planks"), () -> new BlockData(Block.MANGROVE_PLANKS, 26), () -> Item.MANGROVE_PLANKS);

    public static final Block<BlockData> BAMBOO_PLANKS = new Block<>(23, 27, NamespacedKey.parse("minecraft:bamboo_planks"), () -> new BlockData(Block.BAMBOO_PLANKS, 27), () -> Item.BAMBOO_PLANKS);

    public static final Block<BlockData> BAMBOO_MOSAIC = new Block<>(24, 28, NamespacedKey.parse("minecraft:bamboo_mosaic"), () -> new BlockData(Block.BAMBOO_MOSAIC, 28), () -> Item.BAMBOO_MOSAIC);

    public static final Block<SaplingData> OAK_SAPLING = new Block<>(25, 29, NamespacedKey.parse("minecraft:oak_sapling"), () -> new SaplingData(Block.OAK_SAPLING, 29), () -> Item.OAK_SAPLING);

    public static final Block<SaplingData> SPRUCE_SAPLING = new Block<>(26, 31, NamespacedKey.parse("minecraft:spruce_sapling"), () -> new SaplingData(Block.SPRUCE_SAPLING, 31), () -> Item.SPRUCE_SAPLING);

    public static final Block<SaplingData> BIRCH_SAPLING = new Block<>(27, 33, NamespacedKey.parse("minecraft:birch_sapling"), () -> new SaplingData(Block.BIRCH_SAPLING, 33), () -> Item.BIRCH_SAPLING);

    public static final Block<SaplingData> JUNGLE_SAPLING = new Block<>(28, 35, NamespacedKey.parse("minecraft:jungle_sapling"), () -> new SaplingData(Block.JUNGLE_SAPLING, 35), () -> Item.JUNGLE_SAPLING);

    public static final Block<SaplingData> ACACIA_SAPLING = new Block<>(29, 37, NamespacedKey.parse("minecraft:acacia_sapling"), () -> new SaplingData(Block.ACACIA_SAPLING, 37), () -> Item.ACACIA_SAPLING);

    public static final Block<SaplingData> CHERRY_SAPLING = new Block<>(30, 39, NamespacedKey.parse("minecraft:cherry_sapling"), () -> new SaplingData(Block.CHERRY_SAPLING, 39), () -> Item.CHERRY_SAPLING);

    public static final Block<SaplingData> DARK_OAK_SAPLING = new Block<>(31, 41, NamespacedKey.parse("minecraft:dark_oak_sapling"), () -> new SaplingData(Block.DARK_OAK_SAPLING, 41), () -> Item.DARK_OAK_SAPLING);

    public static final Block<SaplingData> PALE_OAK_SAPLING = new Block<>(32, 43, NamespacedKey.parse("minecraft:pale_oak_sapling"), () -> new SaplingData(Block.PALE_OAK_SAPLING, 43), () -> Item.PALE_OAK_SAPLING);

    public static final Block<MangrovePropaguleData> MANGROVE_PROPAGULE = new Block<>(33, 45, NamespacedKey.parse("minecraft:mangrove_propagule"), () -> new MangrovePropaguleData(Block.MANGROVE_PROPAGULE, 45), () -> Item.MANGROVE_PROPAGULE);

    public static final Block<BlockData> BEDROCK = new Block<>(34, 85, NamespacedKey.parse("minecraft:bedrock"), () -> new BlockData(Block.BEDROCK, 85), () -> Item.BEDROCK);

    public static final Block<LiquidData> WATER = new Block<>(35, 86, NamespacedKey.parse("minecraft:water"), () -> new LiquidData(Block.WATER, 86), null);

    public static final Block<LiquidData> LAVA = new Block<>(36, 102, NamespacedKey.parse("minecraft:lava"), () -> new LiquidData(Block.LAVA, 102), null);

    public static final Block<BlockData> SAND = new Block<>(37, 118, NamespacedKey.parse("minecraft:sand"), () -> new BlockData(Block.SAND, 118), () -> Item.SAND);

    public static final Block<BrushableData> SUSPICIOUS_SAND = new Block<>(38, 119, NamespacedKey.parse("minecraft:suspicious_sand"), () -> new BrushableData(Block.SUSPICIOUS_SAND, 119), () -> Item.SUSPICIOUS_SAND);

    public static final Block<BlockData> RED_SAND = new Block<>(39, 123, NamespacedKey.parse("minecraft:red_sand"), () -> new BlockData(Block.RED_SAND, 123), () -> Item.RED_SAND);

    public static final Block<BlockData> GRAVEL = new Block<>(40, 124, NamespacedKey.parse("minecraft:gravel"), () -> new BlockData(Block.GRAVEL, 124), () -> Item.GRAVEL);

    public static final Block<BrushableData> SUSPICIOUS_GRAVEL = new Block<>(41, 125, NamespacedKey.parse("minecraft:suspicious_gravel"), () -> new BrushableData(Block.SUSPICIOUS_GRAVEL, 125), () -> Item.SUSPICIOUS_GRAVEL);

    public static final Block<BlockData> GOLD_ORE = new Block<>(42, 129, NamespacedKey.parse("minecraft:gold_ore"), () -> new BlockData(Block.GOLD_ORE, 129), () -> Item.GOLD_ORE);

    public static final Block<BlockData> DEEPSLATE_GOLD_ORE = new Block<>(43, 130, NamespacedKey.parse("minecraft:deepslate_gold_ore"), () -> new BlockData(Block.DEEPSLATE_GOLD_ORE, 130), () -> Item.DEEPSLATE_GOLD_ORE);

    public static final Block<BlockData> IRON_ORE = new Block<>(44, 131, NamespacedKey.parse("minecraft:iron_ore"), () -> new BlockData(Block.IRON_ORE, 131), () -> Item.IRON_ORE);

    public static final Block<BlockData> DEEPSLATE_IRON_ORE = new Block<>(45, 132, NamespacedKey.parse("minecraft:deepslate_iron_ore"), () -> new BlockData(Block.DEEPSLATE_IRON_ORE, 132), () -> Item.DEEPSLATE_IRON_ORE);

    public static final Block<BlockData> COAL_ORE = new Block<>(46, 133, NamespacedKey.parse("minecraft:coal_ore"), () -> new BlockData(Block.COAL_ORE, 133), () -> Item.COAL_ORE);

    public static final Block<BlockData> DEEPSLATE_COAL_ORE = new Block<>(47, 134, NamespacedKey.parse("minecraft:deepslate_coal_ore"), () -> new BlockData(Block.DEEPSLATE_COAL_ORE, 134), () -> Item.DEEPSLATE_COAL_ORE);

    public static final Block<BlockData> NETHER_GOLD_ORE = new Block<>(48, 135, NamespacedKey.parse("minecraft:nether_gold_ore"), () -> new BlockData(Block.NETHER_GOLD_ORE, 135), () -> Item.NETHER_GOLD_ORE);

    public static final Block<RotatedPillarData> OAK_LOG = new Block<>(49, 136, NamespacedKey.parse("minecraft:oak_log"), () -> new RotatedPillarData(Block.OAK_LOG, 136), () -> Item.OAK_LOG);

    public static final Block<RotatedPillarData> SPRUCE_LOG = new Block<>(50, 139, NamespacedKey.parse("minecraft:spruce_log"), () -> new RotatedPillarData(Block.SPRUCE_LOG, 139), () -> Item.SPRUCE_LOG);

    public static final Block<RotatedPillarData> BIRCH_LOG = new Block<>(51, 142, NamespacedKey.parse("minecraft:birch_log"), () -> new RotatedPillarData(Block.BIRCH_LOG, 142), () -> Item.BIRCH_LOG);

    public static final Block<RotatedPillarData> JUNGLE_LOG = new Block<>(52, 145, NamespacedKey.parse("minecraft:jungle_log"), () -> new RotatedPillarData(Block.JUNGLE_LOG, 145), () -> Item.JUNGLE_LOG);

    public static final Block<RotatedPillarData> ACACIA_LOG = new Block<>(53, 148, NamespacedKey.parse("minecraft:acacia_log"), () -> new RotatedPillarData(Block.ACACIA_LOG, 148), () -> Item.ACACIA_LOG);

    public static final Block<RotatedPillarData> CHERRY_LOG = new Block<>(54, 151, NamespacedKey.parse("minecraft:cherry_log"), () -> new RotatedPillarData(Block.CHERRY_LOG, 151), () -> Item.CHERRY_LOG);

    public static final Block<RotatedPillarData> DARK_OAK_LOG = new Block<>(55, 154, NamespacedKey.parse("minecraft:dark_oak_log"), () -> new RotatedPillarData(Block.DARK_OAK_LOG, 154), () -> Item.DARK_OAK_LOG);

    public static final Block<RotatedPillarData> PALE_OAK_LOG = new Block<>(56, 157, NamespacedKey.parse("minecraft:pale_oak_log"), () -> new RotatedPillarData(Block.PALE_OAK_LOG, 157), () -> Item.PALE_OAK_LOG);

    public static final Block<RotatedPillarData> MANGROVE_LOG = new Block<>(57, 160, NamespacedKey.parse("minecraft:mangrove_log"), () -> new RotatedPillarData(Block.MANGROVE_LOG, 160), () -> Item.MANGROVE_LOG);

    public static final Block<MangroveRootsData> MANGROVE_ROOTS = new Block<>(58, 163, NamespacedKey.parse("minecraft:mangrove_roots"), () -> new MangroveRootsData(Block.MANGROVE_ROOTS, 163), () -> Item.MANGROVE_ROOTS);

    public static final Block<RotatedPillarData> MUDDY_MANGROVE_ROOTS = new Block<>(59, 165, NamespacedKey.parse("minecraft:muddy_mangrove_roots"), () -> new RotatedPillarData(Block.MUDDY_MANGROVE_ROOTS, 165), () -> Item.MUDDY_MANGROVE_ROOTS);

    public static final Block<RotatedPillarData> BAMBOO_BLOCK = new Block<>(60, 168, NamespacedKey.parse("minecraft:bamboo_block"), () -> new RotatedPillarData(Block.BAMBOO_BLOCK, 168), () -> Item.BAMBOO_BLOCK);

    public static final Block<RotatedPillarData> STRIPPED_SPRUCE_LOG = new Block<>(61, 171, NamespacedKey.parse("minecraft:stripped_spruce_log"), () -> new RotatedPillarData(Block.STRIPPED_SPRUCE_LOG, 171), () -> Item.STRIPPED_SPRUCE_LOG);

    public static final Block<RotatedPillarData> STRIPPED_BIRCH_LOG = new Block<>(62, 174, NamespacedKey.parse("minecraft:stripped_birch_log"), () -> new RotatedPillarData(Block.STRIPPED_BIRCH_LOG, 174), () -> Item.STRIPPED_BIRCH_LOG);

    public static final Block<RotatedPillarData> STRIPPED_JUNGLE_LOG = new Block<>(63, 177, NamespacedKey.parse("minecraft:stripped_jungle_log"), () -> new RotatedPillarData(Block.STRIPPED_JUNGLE_LOG, 177), () -> Item.STRIPPED_JUNGLE_LOG);

    public static final Block<RotatedPillarData> STRIPPED_ACACIA_LOG = new Block<>(64, 180, NamespacedKey.parse("minecraft:stripped_acacia_log"), () -> new RotatedPillarData(Block.STRIPPED_ACACIA_LOG, 180), () -> Item.STRIPPED_ACACIA_LOG);

    public static final Block<RotatedPillarData> STRIPPED_CHERRY_LOG = new Block<>(65, 183, NamespacedKey.parse("minecraft:stripped_cherry_log"), () -> new RotatedPillarData(Block.STRIPPED_CHERRY_LOG, 183), () -> Item.STRIPPED_CHERRY_LOG);

    public static final Block<RotatedPillarData> STRIPPED_DARK_OAK_LOG = new Block<>(66, 186, NamespacedKey.parse("minecraft:stripped_dark_oak_log"), () -> new RotatedPillarData(Block.STRIPPED_DARK_OAK_LOG, 186), () -> Item.STRIPPED_DARK_OAK_LOG);

    public static final Block<RotatedPillarData> STRIPPED_PALE_OAK_LOG = new Block<>(67, 189, NamespacedKey.parse("minecraft:stripped_pale_oak_log"), () -> new RotatedPillarData(Block.STRIPPED_PALE_OAK_LOG, 189), () -> Item.STRIPPED_PALE_OAK_LOG);

    public static final Block<RotatedPillarData> STRIPPED_OAK_LOG = new Block<>(68, 192, NamespacedKey.parse("minecraft:stripped_oak_log"), () -> new RotatedPillarData(Block.STRIPPED_OAK_LOG, 192), () -> Item.STRIPPED_OAK_LOG);

    public static final Block<RotatedPillarData> STRIPPED_MANGROVE_LOG = new Block<>(69, 195, NamespacedKey.parse("minecraft:stripped_mangrove_log"), () -> new RotatedPillarData(Block.STRIPPED_MANGROVE_LOG, 195), () -> Item.STRIPPED_MANGROVE_LOG);

    public static final Block<RotatedPillarData> STRIPPED_BAMBOO_BLOCK = new Block<>(70, 198, NamespacedKey.parse("minecraft:stripped_bamboo_block"), () -> new RotatedPillarData(Block.STRIPPED_BAMBOO_BLOCK, 198), () -> Item.STRIPPED_BAMBOO_BLOCK);

    public static final Block<RotatedPillarData> OAK_WOOD = new Block<>(71, 201, NamespacedKey.parse("minecraft:oak_wood"), () -> new RotatedPillarData(Block.OAK_WOOD, 201), () -> Item.OAK_WOOD);

    public static final Block<RotatedPillarData> SPRUCE_WOOD = new Block<>(72, 204, NamespacedKey.parse("minecraft:spruce_wood"), () -> new RotatedPillarData(Block.SPRUCE_WOOD, 204), () -> Item.SPRUCE_WOOD);

    public static final Block<RotatedPillarData> BIRCH_WOOD = new Block<>(73, 207, NamespacedKey.parse("minecraft:birch_wood"), () -> new RotatedPillarData(Block.BIRCH_WOOD, 207), () -> Item.BIRCH_WOOD);

    public static final Block<RotatedPillarData> JUNGLE_WOOD = new Block<>(74, 210, NamespacedKey.parse("minecraft:jungle_wood"), () -> new RotatedPillarData(Block.JUNGLE_WOOD, 210), () -> Item.JUNGLE_WOOD);

    public static final Block<RotatedPillarData> ACACIA_WOOD = new Block<>(75, 213, NamespacedKey.parse("minecraft:acacia_wood"), () -> new RotatedPillarData(Block.ACACIA_WOOD, 213), () -> Item.ACACIA_WOOD);

    public static final Block<RotatedPillarData> CHERRY_WOOD = new Block<>(76, 216, NamespacedKey.parse("minecraft:cherry_wood"), () -> new RotatedPillarData(Block.CHERRY_WOOD, 216), () -> Item.CHERRY_WOOD);

    public static final Block<RotatedPillarData> DARK_OAK_WOOD = new Block<>(77, 219, NamespacedKey.parse("minecraft:dark_oak_wood"), () -> new RotatedPillarData(Block.DARK_OAK_WOOD, 219), () -> Item.DARK_OAK_WOOD);

    public static final Block<RotatedPillarData> MANGROVE_WOOD = new Block<>(78, 222, NamespacedKey.parse("minecraft:mangrove_wood"), () -> new RotatedPillarData(Block.MANGROVE_WOOD, 222), () -> Item.MANGROVE_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_OAK_WOOD = new Block<>(79, 225, NamespacedKey.parse("minecraft:stripped_oak_wood"), () -> new RotatedPillarData(Block.STRIPPED_OAK_WOOD, 225), () -> Item.STRIPPED_OAK_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_SPRUCE_WOOD = new Block<>(80, 228, NamespacedKey.parse("minecraft:stripped_spruce_wood"), () -> new RotatedPillarData(Block.STRIPPED_SPRUCE_WOOD, 228), () -> Item.STRIPPED_SPRUCE_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_BIRCH_WOOD = new Block<>(81, 231, NamespacedKey.parse("minecraft:stripped_birch_wood"), () -> new RotatedPillarData(Block.STRIPPED_BIRCH_WOOD, 231), () -> Item.STRIPPED_BIRCH_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_JUNGLE_WOOD = new Block<>(82, 234, NamespacedKey.parse("minecraft:stripped_jungle_wood"), () -> new RotatedPillarData(Block.STRIPPED_JUNGLE_WOOD, 234), () -> Item.STRIPPED_JUNGLE_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_ACACIA_WOOD = new Block<>(83, 237, NamespacedKey.parse("minecraft:stripped_acacia_wood"), () -> new RotatedPillarData(Block.STRIPPED_ACACIA_WOOD, 237), () -> Item.STRIPPED_ACACIA_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_CHERRY_WOOD = new Block<>(84, 240, NamespacedKey.parse("minecraft:stripped_cherry_wood"), () -> new RotatedPillarData(Block.STRIPPED_CHERRY_WOOD, 240), () -> Item.STRIPPED_CHERRY_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_DARK_OAK_WOOD = new Block<>(85, 243, NamespacedKey.parse("minecraft:stripped_dark_oak_wood"), () -> new RotatedPillarData(Block.STRIPPED_DARK_OAK_WOOD, 243), () -> Item.STRIPPED_DARK_OAK_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_PALE_OAK_WOOD = new Block<>(86, 246, NamespacedKey.parse("minecraft:stripped_pale_oak_wood"), () -> new RotatedPillarData(Block.STRIPPED_PALE_OAK_WOOD, 246), () -> Item.STRIPPED_PALE_OAK_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_MANGROVE_WOOD = new Block<>(87, 249, NamespacedKey.parse("minecraft:stripped_mangrove_wood"), () -> new RotatedPillarData(Block.STRIPPED_MANGROVE_WOOD, 249), () -> Item.STRIPPED_MANGROVE_WOOD);

    public static final Block<TintedParticleLeavesData> OAK_LEAVES = new Block<>(88, 252, NamespacedKey.parse("minecraft:oak_leaves"), () -> new TintedParticleLeavesData(Block.OAK_LEAVES, 252), () -> Item.OAK_LEAVES);

    public static final Block<TintedParticleLeavesData> SPRUCE_LEAVES = new Block<>(89, 280, NamespacedKey.parse("minecraft:spruce_leaves"), () -> new TintedParticleLeavesData(Block.SPRUCE_LEAVES, 280), () -> Item.SPRUCE_LEAVES);

    public static final Block<TintedParticleLeavesData> BIRCH_LEAVES = new Block<>(90, 308, NamespacedKey.parse("minecraft:birch_leaves"), () -> new TintedParticleLeavesData(Block.BIRCH_LEAVES, 308), () -> Item.BIRCH_LEAVES);

    public static final Block<TintedParticleLeavesData> JUNGLE_LEAVES = new Block<>(91, 336, NamespacedKey.parse("minecraft:jungle_leaves"), () -> new TintedParticleLeavesData(Block.JUNGLE_LEAVES, 336), () -> Item.JUNGLE_LEAVES);

    public static final Block<TintedParticleLeavesData> ACACIA_LEAVES = new Block<>(92, 364, NamespacedKey.parse("minecraft:acacia_leaves"), () -> new TintedParticleLeavesData(Block.ACACIA_LEAVES, 364), () -> Item.ACACIA_LEAVES);

    public static final Block<UntintedParticleLeavesData> CHERRY_LEAVES = new Block<>(93, 392, NamespacedKey.parse("minecraft:cherry_leaves"), () -> new UntintedParticleLeavesData(Block.CHERRY_LEAVES, 392), () -> Item.CHERRY_LEAVES);

    public static final Block<TintedParticleLeavesData> DARK_OAK_LEAVES = new Block<>(94, 420, NamespacedKey.parse("minecraft:dark_oak_leaves"), () -> new TintedParticleLeavesData(Block.DARK_OAK_LEAVES, 420), () -> Item.DARK_OAK_LEAVES);

    public static final Block<UntintedParticleLeavesData> PALE_OAK_LEAVES = new Block<>(95, 448, NamespacedKey.parse("minecraft:pale_oak_leaves"), () -> new UntintedParticleLeavesData(Block.PALE_OAK_LEAVES, 448), () -> Item.PALE_OAK_LEAVES);

    public static final Block<MangroveLeavesData> MANGROVE_LEAVES = new Block<>(96, 476, NamespacedKey.parse("minecraft:mangrove_leaves"), () -> new MangroveLeavesData(Block.MANGROVE_LEAVES, 476), () -> Item.MANGROVE_LEAVES);

    public static final Block<UntintedParticleLeavesData> AZALEA_LEAVES = new Block<>(97, 504, NamespacedKey.parse("minecraft:azalea_leaves"), () -> new UntintedParticleLeavesData(Block.AZALEA_LEAVES, 504), () -> Item.AZALEA_LEAVES);

    public static final Block<UntintedParticleLeavesData> FLOWERING_AZALEA_LEAVES = new Block<>(98, 532, NamespacedKey.parse("minecraft:flowering_azalea_leaves"), () -> new UntintedParticleLeavesData(Block.FLOWERING_AZALEA_LEAVES, 532), () -> Item.FLOWERING_AZALEA_LEAVES);

    public static final Block<BlockData> SPONGE = new Block<>(99, 560, NamespacedKey.parse("minecraft:sponge"), () -> new BlockData(Block.SPONGE, 560), () -> Item.SPONGE);

    public static final Block<BlockData> WET_SPONGE = new Block<>(100, 561, NamespacedKey.parse("minecraft:wet_sponge"), () -> new BlockData(Block.WET_SPONGE, 561), () -> Item.WET_SPONGE);

    public static final Block<BlockData> GLASS = new Block<>(101, 562, NamespacedKey.parse("minecraft:glass"), () -> new BlockData(Block.GLASS, 562), () -> Item.GLASS);

    public static final Block<BlockData> LAPIS_ORE = new Block<>(102, 563, NamespacedKey.parse("minecraft:lapis_ore"), () -> new BlockData(Block.LAPIS_ORE, 563), () -> Item.LAPIS_ORE);

    public static final Block<BlockData> DEEPSLATE_LAPIS_ORE = new Block<>(103, 564, NamespacedKey.parse("minecraft:deepslate_lapis_ore"), () -> new BlockData(Block.DEEPSLATE_LAPIS_ORE, 564), () -> Item.DEEPSLATE_LAPIS_ORE);

    public static final Block<BlockData> LAPIS_BLOCK = new Block<>(104, 565, NamespacedKey.parse("minecraft:lapis_block"), () -> new BlockData(Block.LAPIS_BLOCK, 565), () -> Item.LAPIS_BLOCK);

    public static final Block<DispenserData> DISPENSER = new Block<>(105, 566, NamespacedKey.parse("minecraft:dispenser"), () -> new DispenserData(Block.DISPENSER, 566), () -> Item.DISPENSER);

    public static final Block<BlockData> SANDSTONE = new Block<>(106, 578, NamespacedKey.parse("minecraft:sandstone"), () -> new BlockData(Block.SANDSTONE, 578), () -> Item.SANDSTONE);

    public static final Block<BlockData> CHISELED_SANDSTONE = new Block<>(107, 579, NamespacedKey.parse("minecraft:chiseled_sandstone"), () -> new BlockData(Block.CHISELED_SANDSTONE, 579), () -> Item.CHISELED_SANDSTONE);

    public static final Block<BlockData> CUT_SANDSTONE = new Block<>(108, 580, NamespacedKey.parse("minecraft:cut_sandstone"), () -> new BlockData(Block.CUT_SANDSTONE, 580), () -> Item.CUT_SANDSTONE);

    public static final Block<NoteData> NOTE_BLOCK = new Block<>(109, 581, NamespacedKey.parse("minecraft:note_block"), () -> new NoteData(Block.NOTE_BLOCK, 581), () -> Item.NOTE_BLOCK);

    public static final Block<BedData> WHITE_BED = new Block<>(110, 1731, NamespacedKey.parse("minecraft:white_bed"), () -> new BedData(Block.WHITE_BED, 1731), () -> Item.WHITE_BED);

    public static final Block<BedData> ORANGE_BED = new Block<>(111, 1747, NamespacedKey.parse("minecraft:orange_bed"), () -> new BedData(Block.ORANGE_BED, 1747), () -> Item.ORANGE_BED);

    public static final Block<BedData> MAGENTA_BED = new Block<>(112, 1763, NamespacedKey.parse("minecraft:magenta_bed"), () -> new BedData(Block.MAGENTA_BED, 1763), () -> Item.MAGENTA_BED);

    public static final Block<BedData> LIGHT_BLUE_BED = new Block<>(113, 1779, NamespacedKey.parse("minecraft:light_blue_bed"), () -> new BedData(Block.LIGHT_BLUE_BED, 1779), () -> Item.LIGHT_BLUE_BED);

    public static final Block<BedData> YELLOW_BED = new Block<>(114, 1795, NamespacedKey.parse("minecraft:yellow_bed"), () -> new BedData(Block.YELLOW_BED, 1795), () -> Item.YELLOW_BED);

    public static final Block<BedData> LIME_BED = new Block<>(115, 1811, NamespacedKey.parse("minecraft:lime_bed"), () -> new BedData(Block.LIME_BED, 1811), () -> Item.LIME_BED);

    public static final Block<BedData> PINK_BED = new Block<>(116, 1827, NamespacedKey.parse("minecraft:pink_bed"), () -> new BedData(Block.PINK_BED, 1827), () -> Item.PINK_BED);

    public static final Block<BedData> GRAY_BED = new Block<>(117, 1843, NamespacedKey.parse("minecraft:gray_bed"), () -> new BedData(Block.GRAY_BED, 1843), () -> Item.GRAY_BED);

    public static final Block<BedData> LIGHT_GRAY_BED = new Block<>(118, 1859, NamespacedKey.parse("minecraft:light_gray_bed"), () -> new BedData(Block.LIGHT_GRAY_BED, 1859), () -> Item.LIGHT_GRAY_BED);

    public static final Block<BedData> CYAN_BED = new Block<>(119, 1875, NamespacedKey.parse("minecraft:cyan_bed"), () -> new BedData(Block.CYAN_BED, 1875), () -> Item.CYAN_BED);

    public static final Block<BedData> PURPLE_BED = new Block<>(120, 1891, NamespacedKey.parse("minecraft:purple_bed"), () -> new BedData(Block.PURPLE_BED, 1891), () -> Item.PURPLE_BED);

    public static final Block<BedData> BLUE_BED = new Block<>(121, 1907, NamespacedKey.parse("minecraft:blue_bed"), () -> new BedData(Block.BLUE_BED, 1907), () -> Item.BLUE_BED);

    public static final Block<BedData> BROWN_BED = new Block<>(122, 1923, NamespacedKey.parse("minecraft:brown_bed"), () -> new BedData(Block.BROWN_BED, 1923), () -> Item.BROWN_BED);

    public static final Block<BedData> GREEN_BED = new Block<>(123, 1939, NamespacedKey.parse("minecraft:green_bed"), () -> new BedData(Block.GREEN_BED, 1939), () -> Item.GREEN_BED);

    public static final Block<BedData> RED_BED = new Block<>(124, 1955, NamespacedKey.parse("minecraft:red_bed"), () -> new BedData(Block.RED_BED, 1955), () -> Item.RED_BED);

    public static final Block<BedData> BLACK_BED = new Block<>(125, 1971, NamespacedKey.parse("minecraft:black_bed"), () -> new BedData(Block.BLACK_BED, 1971), () -> Item.BLACK_BED);

    public static final Block<PoweredRailData> POWERED_RAIL = new Block<>(126, 1987, NamespacedKey.parse("minecraft:powered_rail"), () -> new PoweredRailData(Block.POWERED_RAIL, 1987), () -> Item.POWERED_RAIL);

    public static final Block<DetectorRailData> DETECTOR_RAIL = new Block<>(127, 2011, NamespacedKey.parse("minecraft:detector_rail"), () -> new DetectorRailData(Block.DETECTOR_RAIL, 2011), () -> Item.DETECTOR_RAIL);

    public static final Block<PistonBaseData> STICKY_PISTON = new Block<>(128, 2035, NamespacedKey.parse("minecraft:sticky_piston"), () -> new PistonBaseData(Block.STICKY_PISTON, 2035), () -> Item.STICKY_PISTON);

    public static final Block<BlockData> COBWEB = new Block<>(129, 2047, NamespacedKey.parse("minecraft:cobweb"), () -> new BlockData(Block.COBWEB, 2047), () -> Item.COBWEB);

    public static final Block<BlockData> SHORT_GRASS = new Block<>(130, 2048, NamespacedKey.parse("minecraft:short_grass"), () -> new BlockData(Block.SHORT_GRASS, 2048), () -> Item.SHORT_GRASS);

    public static final Block<BlockData> FERN = new Block<>(131, 2049, NamespacedKey.parse("minecraft:fern"), () -> new BlockData(Block.FERN, 2049), () -> Item.FERN);

    public static final Block<BlockData> DEAD_BUSH = new Block<>(132, 2050, NamespacedKey.parse("minecraft:dead_bush"), () -> new BlockData(Block.DEAD_BUSH, 2050), () -> Item.DEAD_BUSH);

    public static final Block<BlockData> BUSH = new Block<>(133, 2051, NamespacedKey.parse("minecraft:bush"), () -> new BlockData(Block.BUSH, 2051), () -> Item.BUSH);

    public static final Block<BlockData> SHORT_DRY_GRASS = new Block<>(134, 2052, NamespacedKey.parse("minecraft:short_dry_grass"), () -> new BlockData(Block.SHORT_DRY_GRASS, 2052), () -> Item.SHORT_DRY_GRASS);

    public static final Block<BlockData> TALL_DRY_GRASS = new Block<>(135, 2053, NamespacedKey.parse("minecraft:tall_dry_grass"), () -> new BlockData(Block.TALL_DRY_GRASS, 2053), () -> Item.TALL_DRY_GRASS);

    public static final Block<BlockData> SEAGRASS = new Block<>(136, 2054, NamespacedKey.parse("minecraft:seagrass"), () -> new BlockData(Block.SEAGRASS, 2054), () -> Item.SEAGRASS);

    public static final Block<TallSeagrassData> TALL_SEAGRASS = new Block<>(137, 2055, NamespacedKey.parse("minecraft:tall_seagrass"), () -> new TallSeagrassData(Block.TALL_SEAGRASS, 2055), null);

    public static final Block<PistonBaseData> PISTON = new Block<>(138, 2057, NamespacedKey.parse("minecraft:piston"), () -> new PistonBaseData(Block.PISTON, 2057), () -> Item.PISTON);

    public static final Block<PistonHeadData> PISTON_HEAD = new Block<>(139, 2069, NamespacedKey.parse("minecraft:piston_head"), () -> new PistonHeadData(Block.PISTON_HEAD, 2069), null);

    public static final Block<BlockData> WHITE_WOOL = new Block<>(140, 2093, NamespacedKey.parse("minecraft:white_wool"), () -> new BlockData(Block.WHITE_WOOL, 2093), () -> Item.WHITE_WOOL);

    public static final Block<BlockData> ORANGE_WOOL = new Block<>(141, 2094, NamespacedKey.parse("minecraft:orange_wool"), () -> new BlockData(Block.ORANGE_WOOL, 2094), () -> Item.ORANGE_WOOL);

    public static final Block<BlockData> MAGENTA_WOOL = new Block<>(142, 2095, NamespacedKey.parse("minecraft:magenta_wool"), () -> new BlockData(Block.MAGENTA_WOOL, 2095), () -> Item.MAGENTA_WOOL);

    public static final Block<BlockData> LIGHT_BLUE_WOOL = new Block<>(143, 2096, NamespacedKey.parse("minecraft:light_blue_wool"), () -> new BlockData(Block.LIGHT_BLUE_WOOL, 2096), () -> Item.LIGHT_BLUE_WOOL);

    public static final Block<BlockData> YELLOW_WOOL = new Block<>(144, 2097, NamespacedKey.parse("minecraft:yellow_wool"), () -> new BlockData(Block.YELLOW_WOOL, 2097), () -> Item.YELLOW_WOOL);

    public static final Block<BlockData> LIME_WOOL = new Block<>(145, 2098, NamespacedKey.parse("minecraft:lime_wool"), () -> new BlockData(Block.LIME_WOOL, 2098), () -> Item.LIME_WOOL);

    public static final Block<BlockData> PINK_WOOL = new Block<>(146, 2099, NamespacedKey.parse("minecraft:pink_wool"), () -> new BlockData(Block.PINK_WOOL, 2099), () -> Item.PINK_WOOL);

    public static final Block<BlockData> GRAY_WOOL = new Block<>(147, 2100, NamespacedKey.parse("minecraft:gray_wool"), () -> new BlockData(Block.GRAY_WOOL, 2100), () -> Item.GRAY_WOOL);

    public static final Block<BlockData> LIGHT_GRAY_WOOL = new Block<>(148, 2101, NamespacedKey.parse("minecraft:light_gray_wool"), () -> new BlockData(Block.LIGHT_GRAY_WOOL, 2101), () -> Item.LIGHT_GRAY_WOOL);

    public static final Block<BlockData> CYAN_WOOL = new Block<>(149, 2102, NamespacedKey.parse("minecraft:cyan_wool"), () -> new BlockData(Block.CYAN_WOOL, 2102), () -> Item.CYAN_WOOL);

    public static final Block<BlockData> PURPLE_WOOL = new Block<>(150, 2103, NamespacedKey.parse("minecraft:purple_wool"), () -> new BlockData(Block.PURPLE_WOOL, 2103), () -> Item.PURPLE_WOOL);

    public static final Block<BlockData> BLUE_WOOL = new Block<>(151, 2104, NamespacedKey.parse("minecraft:blue_wool"), () -> new BlockData(Block.BLUE_WOOL, 2104), () -> Item.BLUE_WOOL);

    public static final Block<BlockData> BROWN_WOOL = new Block<>(152, 2105, NamespacedKey.parse("minecraft:brown_wool"), () -> new BlockData(Block.BROWN_WOOL, 2105), () -> Item.BROWN_WOOL);

    public static final Block<BlockData> GREEN_WOOL = new Block<>(153, 2106, NamespacedKey.parse("minecraft:green_wool"), () -> new BlockData(Block.GREEN_WOOL, 2106), () -> Item.GREEN_WOOL);

    public static final Block<BlockData> RED_WOOL = new Block<>(154, 2107, NamespacedKey.parse("minecraft:red_wool"), () -> new BlockData(Block.RED_WOOL, 2107), () -> Item.RED_WOOL);

    public static final Block<BlockData> BLACK_WOOL = new Block<>(155, 2108, NamespacedKey.parse("minecraft:black_wool"), () -> new BlockData(Block.BLACK_WOOL, 2108), () -> Item.BLACK_WOOL);

    public static final Block<MovingPistonData> MOVING_PISTON = new Block<>(156, 2109, NamespacedKey.parse("minecraft:moving_piston"), () -> new MovingPistonData(Block.MOVING_PISTON, 2109), null);

    public static final Block<BlockData> DANDELION = new Block<>(157, 2121, NamespacedKey.parse("minecraft:dandelion"), () -> new BlockData(Block.DANDELION, 2121), () -> Item.DANDELION);

    public static final Block<BlockData> TORCHFLOWER = new Block<>(158, 2122, NamespacedKey.parse("minecraft:torchflower"), () -> new BlockData(Block.TORCHFLOWER, 2122), () -> Item.TORCHFLOWER);

    public static final Block<BlockData> POPPY = new Block<>(159, 2123, NamespacedKey.parse("minecraft:poppy"), () -> new BlockData(Block.POPPY, 2123), () -> Item.POPPY);

    public static final Block<BlockData> BLUE_ORCHID = new Block<>(160, 2124, NamespacedKey.parse("minecraft:blue_orchid"), () -> new BlockData(Block.BLUE_ORCHID, 2124), () -> Item.BLUE_ORCHID);

    public static final Block<BlockData> ALLIUM = new Block<>(161, 2125, NamespacedKey.parse("minecraft:allium"), () -> new BlockData(Block.ALLIUM, 2125), () -> Item.ALLIUM);

    public static final Block<BlockData> AZURE_BLUET = new Block<>(162, 2126, NamespacedKey.parse("minecraft:azure_bluet"), () -> new BlockData(Block.AZURE_BLUET, 2126), () -> Item.AZURE_BLUET);

    public static final Block<BlockData> RED_TULIP = new Block<>(163, 2127, NamespacedKey.parse("minecraft:red_tulip"), () -> new BlockData(Block.RED_TULIP, 2127), () -> Item.RED_TULIP);

    public static final Block<BlockData> ORANGE_TULIP = new Block<>(164, 2128, NamespacedKey.parse("minecraft:orange_tulip"), () -> new BlockData(Block.ORANGE_TULIP, 2128), () -> Item.ORANGE_TULIP);

    public static final Block<BlockData> WHITE_TULIP = new Block<>(165, 2129, NamespacedKey.parse("minecraft:white_tulip"), () -> new BlockData(Block.WHITE_TULIP, 2129), () -> Item.WHITE_TULIP);

    public static final Block<BlockData> PINK_TULIP = new Block<>(166, 2130, NamespacedKey.parse("minecraft:pink_tulip"), () -> new BlockData(Block.PINK_TULIP, 2130), () -> Item.PINK_TULIP);

    public static final Block<BlockData> OXEYE_DAISY = new Block<>(167, 2131, NamespacedKey.parse("minecraft:oxeye_daisy"), () -> new BlockData(Block.OXEYE_DAISY, 2131), () -> Item.OXEYE_DAISY);

    public static final Block<BlockData> CORNFLOWER = new Block<>(168, 2132, NamespacedKey.parse("minecraft:cornflower"), () -> new BlockData(Block.CORNFLOWER, 2132), () -> Item.CORNFLOWER);

    public static final Block<BlockData> WITHER_ROSE = new Block<>(169, 2133, NamespacedKey.parse("minecraft:wither_rose"), () -> new BlockData(Block.WITHER_ROSE, 2133), () -> Item.WITHER_ROSE);

    public static final Block<BlockData> LILY_OF_THE_VALLEY = new Block<>(170, 2134, NamespacedKey.parse("minecraft:lily_of_the_valley"), () -> new BlockData(Block.LILY_OF_THE_VALLEY, 2134), () -> Item.LILY_OF_THE_VALLEY);

    public static final Block<BlockData> BROWN_MUSHROOM = new Block<>(171, 2135, NamespacedKey.parse("minecraft:brown_mushroom"), () -> new BlockData(Block.BROWN_MUSHROOM, 2135), () -> Item.BROWN_MUSHROOM);

    public static final Block<BlockData> RED_MUSHROOM = new Block<>(172, 2136, NamespacedKey.parse("minecraft:red_mushroom"), () -> new BlockData(Block.RED_MUSHROOM, 2136), () -> Item.RED_MUSHROOM);

    public static final Block<BlockData> GOLD_BLOCK = new Block<>(173, 2137, NamespacedKey.parse("minecraft:gold_block"), () -> new BlockData(Block.GOLD_BLOCK, 2137), () -> Item.GOLD_BLOCK);

    public static final Block<BlockData> IRON_BLOCK = new Block<>(174, 2138, NamespacedKey.parse("minecraft:iron_block"), () -> new BlockData(Block.IRON_BLOCK, 2138), () -> Item.IRON_BLOCK);

    public static final Block<BlockData> BRICKS = new Block<>(175, 2139, NamespacedKey.parse("minecraft:bricks"), () -> new BlockData(Block.BRICKS, 2139), () -> Item.BRICKS);

    public static final Block<TntData> TNT = new Block<>(176, 2140, NamespacedKey.parse("minecraft:tnt"), () -> new TntData(Block.TNT, 2140), () -> Item.TNT);

    public static final Block<BlockData> BOOKSHELF = new Block<>(177, 2142, NamespacedKey.parse("minecraft:bookshelf"), () -> new BlockData(Block.BOOKSHELF, 2142), () -> Item.BOOKSHELF);

    public static final Block<ChiseledBookShelfData> CHISELED_BOOKSHELF = new Block<>(178, 2143, NamespacedKey.parse("minecraft:chiseled_bookshelf"), () -> new ChiseledBookShelfData(Block.CHISELED_BOOKSHELF, 2143), () -> Item.CHISELED_BOOKSHELF);

    public static final Block<ShelfData> ACACIA_SHELF = new Block<>(179, 2399, NamespacedKey.parse("minecraft:acacia_shelf"), () -> new ShelfData(Block.ACACIA_SHELF, 2399), () -> Item.ACACIA_SHELF);

    public static final Block<ShelfData> BAMBOO_SHELF = new Block<>(180, 2463, NamespacedKey.parse("minecraft:bamboo_shelf"), () -> new ShelfData(Block.BAMBOO_SHELF, 2463), () -> Item.BAMBOO_SHELF);

    public static final Block<ShelfData> BIRCH_SHELF = new Block<>(181, 2527, NamespacedKey.parse("minecraft:birch_shelf"), () -> new ShelfData(Block.BIRCH_SHELF, 2527), () -> Item.BIRCH_SHELF);

    public static final Block<ShelfData> CHERRY_SHELF = new Block<>(182, 2591, NamespacedKey.parse("minecraft:cherry_shelf"), () -> new ShelfData(Block.CHERRY_SHELF, 2591), () -> Item.CHERRY_SHELF);

    public static final Block<ShelfData> CRIMSON_SHELF = new Block<>(183, 2655, NamespacedKey.parse("minecraft:crimson_shelf"), () -> new ShelfData(Block.CRIMSON_SHELF, 2655), () -> Item.CRIMSON_SHELF);

    public static final Block<ShelfData> DARK_OAK_SHELF = new Block<>(184, 2719, NamespacedKey.parse("minecraft:dark_oak_shelf"), () -> new ShelfData(Block.DARK_OAK_SHELF, 2719), () -> Item.DARK_OAK_SHELF);

    public static final Block<ShelfData> JUNGLE_SHELF = new Block<>(185, 2783, NamespacedKey.parse("minecraft:jungle_shelf"), () -> new ShelfData(Block.JUNGLE_SHELF, 2783), () -> Item.JUNGLE_SHELF);

    public static final Block<ShelfData> MANGROVE_SHELF = new Block<>(186, 2847, NamespacedKey.parse("minecraft:mangrove_shelf"), () -> new ShelfData(Block.MANGROVE_SHELF, 2847), () -> Item.MANGROVE_SHELF);

    public static final Block<ShelfData> OAK_SHELF = new Block<>(187, 2911, NamespacedKey.parse("minecraft:oak_shelf"), () -> new ShelfData(Block.OAK_SHELF, 2911), () -> Item.OAK_SHELF);

    public static final Block<ShelfData> PALE_OAK_SHELF = new Block<>(188, 2975, NamespacedKey.parse("minecraft:pale_oak_shelf"), () -> new ShelfData(Block.PALE_OAK_SHELF, 2975), () -> Item.PALE_OAK_SHELF);

    public static final Block<ShelfData> SPRUCE_SHELF = new Block<>(189, 3039, NamespacedKey.parse("minecraft:spruce_shelf"), () -> new ShelfData(Block.SPRUCE_SHELF, 3039), () -> Item.SPRUCE_SHELF);

    public static final Block<ShelfData> WARPED_SHELF = new Block<>(190, 3103, NamespacedKey.parse("minecraft:warped_shelf"), () -> new ShelfData(Block.WARPED_SHELF, 3103), () -> Item.WARPED_SHELF);

    public static final Block<BlockData> MOSSY_COBBLESTONE = new Block<>(191, 3167, NamespacedKey.parse("minecraft:mossy_cobblestone"), () -> new BlockData(Block.MOSSY_COBBLESTONE, 3167), () -> Item.MOSSY_COBBLESTONE);

    public static final Block<BlockData> OBSIDIAN = new Block<>(192, 3168, NamespacedKey.parse("minecraft:obsidian"), () -> new BlockData(Block.OBSIDIAN, 3168), () -> Item.OBSIDIAN);

    public static final Block<BlockData> TORCH = new Block<>(193, 3169, NamespacedKey.parse("minecraft:torch"), () -> new BlockData(Block.TORCH, 3169), () -> Item.TORCH);

    public static final Block<WallTorchData> WALL_TORCH = new Block<>(194, 3170, NamespacedKey.parse("minecraft:wall_torch"), () -> new WallTorchData(Block.WALL_TORCH, 3170), null);

    public static final Block<FireData> FIRE = new Block<>(195, 3174, NamespacedKey.parse("minecraft:fire"), () -> new FireData(Block.FIRE, 3174), null);

    public static final Block<BlockData> SOUL_FIRE = new Block<>(196, 3686, NamespacedKey.parse("minecraft:soul_fire"), () -> new BlockData(Block.SOUL_FIRE, 3686), null);

    public static final Block<BlockData> SPAWNER = new Block<>(197, 3687, NamespacedKey.parse("minecraft:spawner"), () -> new BlockData(Block.SPAWNER, 3687), () -> Item.SPAWNER);

    public static final Block<CreakingHeartData> CREAKING_HEART = new Block<>(198, 3688, NamespacedKey.parse("minecraft:creaking_heart"), () -> new CreakingHeartData(Block.CREAKING_HEART, 3688), () -> Item.CREAKING_HEART);

    public static final Block<StairData> OAK_STAIRS = new Block<>(199, 3706, NamespacedKey.parse("minecraft:oak_stairs"), () -> new StairData(Block.OAK_STAIRS, 3706), () -> Item.OAK_STAIRS);

    public static final Block<ChestData> CHEST = new Block<>(200, 3786, NamespacedKey.parse("minecraft:chest"), () -> new ChestData(Block.CHEST, 3786), () -> Item.CHEST);

    public static final Block<RedstoneWireData> REDSTONE_WIRE = new Block<>(201, 3810, NamespacedKey.parse("minecraft:redstone_wire"), () -> new RedstoneWireData(Block.REDSTONE_WIRE, 3810), null);

    public static final Block<BlockData> DIAMOND_ORE = new Block<>(202, 5106, NamespacedKey.parse("minecraft:diamond_ore"), () -> new BlockData(Block.DIAMOND_ORE, 5106), () -> Item.DIAMOND_ORE);

    public static final Block<BlockData> DEEPSLATE_DIAMOND_ORE = new Block<>(203, 5107, NamespacedKey.parse("minecraft:deepslate_diamond_ore"), () -> new BlockData(Block.DEEPSLATE_DIAMOND_ORE, 5107), () -> Item.DEEPSLATE_DIAMOND_ORE);

    public static final Block<BlockData> DIAMOND_BLOCK = new Block<>(204, 5108, NamespacedKey.parse("minecraft:diamond_block"), () -> new BlockData(Block.DIAMOND_BLOCK, 5108), () -> Item.DIAMOND_BLOCK);

    public static final Block<BlockData> CRAFTING_TABLE = new Block<>(205, 5109, NamespacedKey.parse("minecraft:crafting_table"), () -> new BlockData(Block.CRAFTING_TABLE, 5109), () -> Item.CRAFTING_TABLE);

    public static final Block<CropData> WHEAT = new Block<>(206, 5110, NamespacedKey.parse("minecraft:wheat"), () -> new CropData(Block.WHEAT, 5110), () -> Item.WHEAT);

    public static final Block<FarmData> FARMLAND = new Block<>(207, 5118, NamespacedKey.parse("minecraft:farmland"), () -> new FarmData(Block.FARMLAND, 5118), () -> Item.FARMLAND);

    public static final Block<FurnaceData> FURNACE = new Block<>(208, 5126, NamespacedKey.parse("minecraft:furnace"), () -> new FurnaceData(Block.FURNACE, 5126), () -> Item.FURNACE);

    public static final Block<StandingSignData> OAK_SIGN = new Block<>(209, 5134, NamespacedKey.parse("minecraft:oak_sign"), () -> new StandingSignData(Block.OAK_SIGN, 5134), () -> Item.OAK_SIGN);

    public static final Block<StandingSignData> SPRUCE_SIGN = new Block<>(210, 5166, NamespacedKey.parse("minecraft:spruce_sign"), () -> new StandingSignData(Block.SPRUCE_SIGN, 5166), () -> Item.SPRUCE_SIGN);

    public static final Block<StandingSignData> BIRCH_SIGN = new Block<>(211, 5198, NamespacedKey.parse("minecraft:birch_sign"), () -> new StandingSignData(Block.BIRCH_SIGN, 5198), () -> Item.BIRCH_SIGN);

    public static final Block<StandingSignData> ACACIA_SIGN = new Block<>(212, 5230, NamespacedKey.parse("minecraft:acacia_sign"), () -> new StandingSignData(Block.ACACIA_SIGN, 5230), () -> Item.ACACIA_SIGN);

    public static final Block<StandingSignData> CHERRY_SIGN = new Block<>(213, 5262, NamespacedKey.parse("minecraft:cherry_sign"), () -> new StandingSignData(Block.CHERRY_SIGN, 5262), () -> Item.CHERRY_SIGN);

    public static final Block<StandingSignData> JUNGLE_SIGN = new Block<>(214, 5294, NamespacedKey.parse("minecraft:jungle_sign"), () -> new StandingSignData(Block.JUNGLE_SIGN, 5294), () -> Item.JUNGLE_SIGN);

    public static final Block<StandingSignData> DARK_OAK_SIGN = new Block<>(215, 5326, NamespacedKey.parse("minecraft:dark_oak_sign"), () -> new StandingSignData(Block.DARK_OAK_SIGN, 5326), () -> Item.DARK_OAK_SIGN);

    public static final Block<StandingSignData> PALE_OAK_SIGN = new Block<>(216, 5358, NamespacedKey.parse("minecraft:pale_oak_sign"), () -> new StandingSignData(Block.PALE_OAK_SIGN, 5358), () -> Item.PALE_OAK_SIGN);

    public static final Block<StandingSignData> MANGROVE_SIGN = new Block<>(217, 5390, NamespacedKey.parse("minecraft:mangrove_sign"), () -> new StandingSignData(Block.MANGROVE_SIGN, 5390), () -> Item.MANGROVE_SIGN);

    public static final Block<StandingSignData> BAMBOO_SIGN = new Block<>(218, 5422, NamespacedKey.parse("minecraft:bamboo_sign"), () -> new StandingSignData(Block.BAMBOO_SIGN, 5422), () -> Item.BAMBOO_SIGN);

    public static final Block<DoorData> OAK_DOOR = new Block<>(219, 5454, NamespacedKey.parse("minecraft:oak_door"), () -> new DoorData(Block.OAK_DOOR, 5454), () -> Item.OAK_DOOR);

    public static final Block<LadderData> LADDER = new Block<>(220, 5518, NamespacedKey.parse("minecraft:ladder"), () -> new LadderData(Block.LADDER, 5518), () -> Item.LADDER);

    public static final Block<RailData> RAIL = new Block<>(221, 5526, NamespacedKey.parse("minecraft:rail"), () -> new RailData(Block.RAIL, 5526), () -> Item.RAIL);

    public static final Block<StairData> COBBLESTONE_STAIRS = new Block<>(222, 5546, NamespacedKey.parse("minecraft:cobblestone_stairs"), () -> new StairData(Block.COBBLESTONE_STAIRS, 5546), () -> Item.COBBLESTONE_STAIRS);

    public static final Block<WallSignData> OAK_WALL_SIGN = new Block<>(223, 5626, NamespacedKey.parse("minecraft:oak_wall_sign"), () -> new WallSignData(Block.OAK_WALL_SIGN, 5626), null);

    public static final Block<WallSignData> SPRUCE_WALL_SIGN = new Block<>(224, 5634, NamespacedKey.parse("minecraft:spruce_wall_sign"), () -> new WallSignData(Block.SPRUCE_WALL_SIGN, 5634), null);

    public static final Block<WallSignData> BIRCH_WALL_SIGN = new Block<>(225, 5642, NamespacedKey.parse("minecraft:birch_wall_sign"), () -> new WallSignData(Block.BIRCH_WALL_SIGN, 5642), null);

    public static final Block<WallSignData> ACACIA_WALL_SIGN = new Block<>(226, 5650, NamespacedKey.parse("minecraft:acacia_wall_sign"), () -> new WallSignData(Block.ACACIA_WALL_SIGN, 5650), null);

    public static final Block<WallSignData> CHERRY_WALL_SIGN = new Block<>(227, 5658, NamespacedKey.parse("minecraft:cherry_wall_sign"), () -> new WallSignData(Block.CHERRY_WALL_SIGN, 5658), null);

    public static final Block<WallSignData> JUNGLE_WALL_SIGN = new Block<>(228, 5666, NamespacedKey.parse("minecraft:jungle_wall_sign"), () -> new WallSignData(Block.JUNGLE_WALL_SIGN, 5666), null);

    public static final Block<WallSignData> DARK_OAK_WALL_SIGN = new Block<>(229, 5674, NamespacedKey.parse("minecraft:dark_oak_wall_sign"), () -> new WallSignData(Block.DARK_OAK_WALL_SIGN, 5674), null);

    public static final Block<WallSignData> PALE_OAK_WALL_SIGN = new Block<>(230, 5682, NamespacedKey.parse("minecraft:pale_oak_wall_sign"), () -> new WallSignData(Block.PALE_OAK_WALL_SIGN, 5682), null);

    public static final Block<WallSignData> MANGROVE_WALL_SIGN = new Block<>(231, 5690, NamespacedKey.parse("minecraft:mangrove_wall_sign"), () -> new WallSignData(Block.MANGROVE_WALL_SIGN, 5690), null);

    public static final Block<WallSignData> BAMBOO_WALL_SIGN = new Block<>(232, 5698, NamespacedKey.parse("minecraft:bamboo_wall_sign"), () -> new WallSignData(Block.BAMBOO_WALL_SIGN, 5698), null);

    public static final Block<CeilingHangingSignData> OAK_HANGING_SIGN = new Block<>(233, 5706, NamespacedKey.parse("minecraft:oak_hanging_sign"), () -> new CeilingHangingSignData(Block.OAK_HANGING_SIGN, 5706), () -> Item.OAK_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> SPRUCE_HANGING_SIGN = new Block<>(234, 5770, NamespacedKey.parse("minecraft:spruce_hanging_sign"), () -> new CeilingHangingSignData(Block.SPRUCE_HANGING_SIGN, 5770), () -> Item.SPRUCE_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> BIRCH_HANGING_SIGN = new Block<>(235, 5834, NamespacedKey.parse("minecraft:birch_hanging_sign"), () -> new CeilingHangingSignData(Block.BIRCH_HANGING_SIGN, 5834), () -> Item.BIRCH_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> ACACIA_HANGING_SIGN = new Block<>(236, 5898, NamespacedKey.parse("minecraft:acacia_hanging_sign"), () -> new CeilingHangingSignData(Block.ACACIA_HANGING_SIGN, 5898), () -> Item.ACACIA_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> CHERRY_HANGING_SIGN = new Block<>(237, 5962, NamespacedKey.parse("minecraft:cherry_hanging_sign"), () -> new CeilingHangingSignData(Block.CHERRY_HANGING_SIGN, 5962), () -> Item.CHERRY_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> JUNGLE_HANGING_SIGN = new Block<>(238, 6026, NamespacedKey.parse("minecraft:jungle_hanging_sign"), () -> new CeilingHangingSignData(Block.JUNGLE_HANGING_SIGN, 6026), () -> Item.JUNGLE_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> DARK_OAK_HANGING_SIGN = new Block<>(239, 6090, NamespacedKey.parse("minecraft:dark_oak_hanging_sign"), () -> new CeilingHangingSignData(Block.DARK_OAK_HANGING_SIGN, 6090), () -> Item.DARK_OAK_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> PALE_OAK_HANGING_SIGN = new Block<>(240, 6154, NamespacedKey.parse("minecraft:pale_oak_hanging_sign"), () -> new CeilingHangingSignData(Block.PALE_OAK_HANGING_SIGN, 6154), () -> Item.PALE_OAK_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> CRIMSON_HANGING_SIGN = new Block<>(241, 6218, NamespacedKey.parse("minecraft:crimson_hanging_sign"), () -> new CeilingHangingSignData(Block.CRIMSON_HANGING_SIGN, 6218), () -> Item.CRIMSON_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> WARPED_HANGING_SIGN = new Block<>(242, 6282, NamespacedKey.parse("minecraft:warped_hanging_sign"), () -> new CeilingHangingSignData(Block.WARPED_HANGING_SIGN, 6282), () -> Item.WARPED_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> MANGROVE_HANGING_SIGN = new Block<>(243, 6346, NamespacedKey.parse("minecraft:mangrove_hanging_sign"), () -> new CeilingHangingSignData(Block.MANGROVE_HANGING_SIGN, 6346), () -> Item.MANGROVE_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> BAMBOO_HANGING_SIGN = new Block<>(244, 6410, NamespacedKey.parse("minecraft:bamboo_hanging_sign"), () -> new CeilingHangingSignData(Block.BAMBOO_HANGING_SIGN, 6410), () -> Item.BAMBOO_HANGING_SIGN);

    public static final Block<WallHangingSignData> OAK_WALL_HANGING_SIGN = new Block<>(245, 6474, NamespacedKey.parse("minecraft:oak_wall_hanging_sign"), () -> new WallHangingSignData(Block.OAK_WALL_HANGING_SIGN, 6474), null);

    public static final Block<WallHangingSignData> SPRUCE_WALL_HANGING_SIGN = new Block<>(246, 6482, NamespacedKey.parse("minecraft:spruce_wall_hanging_sign"), () -> new WallHangingSignData(Block.SPRUCE_WALL_HANGING_SIGN, 6482), null);

    public static final Block<WallHangingSignData> BIRCH_WALL_HANGING_SIGN = new Block<>(247, 6490, NamespacedKey.parse("minecraft:birch_wall_hanging_sign"), () -> new WallHangingSignData(Block.BIRCH_WALL_HANGING_SIGN, 6490), null);

    public static final Block<WallHangingSignData> ACACIA_WALL_HANGING_SIGN = new Block<>(248, 6498, NamespacedKey.parse("minecraft:acacia_wall_hanging_sign"), () -> new WallHangingSignData(Block.ACACIA_WALL_HANGING_SIGN, 6498), null);

    public static final Block<WallHangingSignData> CHERRY_WALL_HANGING_SIGN = new Block<>(249, 6506, NamespacedKey.parse("minecraft:cherry_wall_hanging_sign"), () -> new WallHangingSignData(Block.CHERRY_WALL_HANGING_SIGN, 6506), null);

    public static final Block<WallHangingSignData> JUNGLE_WALL_HANGING_SIGN = new Block<>(250, 6514, NamespacedKey.parse("minecraft:jungle_wall_hanging_sign"), () -> new WallHangingSignData(Block.JUNGLE_WALL_HANGING_SIGN, 6514), null);

    public static final Block<WallHangingSignData> DARK_OAK_WALL_HANGING_SIGN = new Block<>(251, 6522, NamespacedKey.parse("minecraft:dark_oak_wall_hanging_sign"), () -> new WallHangingSignData(Block.DARK_OAK_WALL_HANGING_SIGN, 6522), null);

    public static final Block<WallHangingSignData> PALE_OAK_WALL_HANGING_SIGN = new Block<>(252, 6530, NamespacedKey.parse("minecraft:pale_oak_wall_hanging_sign"), () -> new WallHangingSignData(Block.PALE_OAK_WALL_HANGING_SIGN, 6530), null);

    public static final Block<WallHangingSignData> MANGROVE_WALL_HANGING_SIGN = new Block<>(253, 6538, NamespacedKey.parse("minecraft:mangrove_wall_hanging_sign"), () -> new WallHangingSignData(Block.MANGROVE_WALL_HANGING_SIGN, 6538), null);

    public static final Block<WallHangingSignData> CRIMSON_WALL_HANGING_SIGN = new Block<>(254, 6546, NamespacedKey.parse("minecraft:crimson_wall_hanging_sign"), () -> new WallHangingSignData(Block.CRIMSON_WALL_HANGING_SIGN, 6546), null);

    public static final Block<WallHangingSignData> WARPED_WALL_HANGING_SIGN = new Block<>(255, 6554, NamespacedKey.parse("minecraft:warped_wall_hanging_sign"), () -> new WallHangingSignData(Block.WARPED_WALL_HANGING_SIGN, 6554), null);

    public static final Block<WallHangingSignData> BAMBOO_WALL_HANGING_SIGN = new Block<>(256, 6562, NamespacedKey.parse("minecraft:bamboo_wall_hanging_sign"), () -> new WallHangingSignData(Block.BAMBOO_WALL_HANGING_SIGN, 6562), null);

    public static final Block<LeverData> LEVER = new Block<>(257, 6570, NamespacedKey.parse("minecraft:lever"), () -> new LeverData(Block.LEVER, 6570), () -> Item.LEVER);

    public static final Block<PressurePlateData> STONE_PRESSURE_PLATE = new Block<>(258, 6594, NamespacedKey.parse("minecraft:stone_pressure_plate"), () -> new PressurePlateData(Block.STONE_PRESSURE_PLATE, 6594), () -> Item.STONE_PRESSURE_PLATE);

    public static final Block<DoorData> IRON_DOOR = new Block<>(259, 6596, NamespacedKey.parse("minecraft:iron_door"), () -> new DoorData(Block.IRON_DOOR, 6596), () -> Item.IRON_DOOR);

    public static final Block<PressurePlateData> OAK_PRESSURE_PLATE = new Block<>(260, 6660, NamespacedKey.parse("minecraft:oak_pressure_plate"), () -> new PressurePlateData(Block.OAK_PRESSURE_PLATE, 6660), () -> Item.OAK_PRESSURE_PLATE);

    public static final Block<PressurePlateData> SPRUCE_PRESSURE_PLATE = new Block<>(261, 6662, NamespacedKey.parse("minecraft:spruce_pressure_plate"), () -> new PressurePlateData(Block.SPRUCE_PRESSURE_PLATE, 6662), () -> Item.SPRUCE_PRESSURE_PLATE);

    public static final Block<PressurePlateData> BIRCH_PRESSURE_PLATE = new Block<>(262, 6664, NamespacedKey.parse("minecraft:birch_pressure_plate"), () -> new PressurePlateData(Block.BIRCH_PRESSURE_PLATE, 6664), () -> Item.BIRCH_PRESSURE_PLATE);

    public static final Block<PressurePlateData> JUNGLE_PRESSURE_PLATE = new Block<>(263, 6666, NamespacedKey.parse("minecraft:jungle_pressure_plate"), () -> new PressurePlateData(Block.JUNGLE_PRESSURE_PLATE, 6666), () -> Item.JUNGLE_PRESSURE_PLATE);

    public static final Block<PressurePlateData> ACACIA_PRESSURE_PLATE = new Block<>(264, 6668, NamespacedKey.parse("minecraft:acacia_pressure_plate"), () -> new PressurePlateData(Block.ACACIA_PRESSURE_PLATE, 6668), () -> Item.ACACIA_PRESSURE_PLATE);

    public static final Block<PressurePlateData> CHERRY_PRESSURE_PLATE = new Block<>(265, 6670, NamespacedKey.parse("minecraft:cherry_pressure_plate"), () -> new PressurePlateData(Block.CHERRY_PRESSURE_PLATE, 6670), () -> Item.CHERRY_PRESSURE_PLATE);

    public static final Block<PressurePlateData> DARK_OAK_PRESSURE_PLATE = new Block<>(266, 6672, NamespacedKey.parse("minecraft:dark_oak_pressure_plate"), () -> new PressurePlateData(Block.DARK_OAK_PRESSURE_PLATE, 6672), () -> Item.DARK_OAK_PRESSURE_PLATE);

    public static final Block<PressurePlateData> PALE_OAK_PRESSURE_PLATE = new Block<>(267, 6674, NamespacedKey.parse("minecraft:pale_oak_pressure_plate"), () -> new PressurePlateData(Block.PALE_OAK_PRESSURE_PLATE, 6674), () -> Item.PALE_OAK_PRESSURE_PLATE);

    public static final Block<PressurePlateData> MANGROVE_PRESSURE_PLATE = new Block<>(268, 6676, NamespacedKey.parse("minecraft:mangrove_pressure_plate"), () -> new PressurePlateData(Block.MANGROVE_PRESSURE_PLATE, 6676), () -> Item.MANGROVE_PRESSURE_PLATE);

    public static final Block<PressurePlateData> BAMBOO_PRESSURE_PLATE = new Block<>(269, 6678, NamespacedKey.parse("minecraft:bamboo_pressure_plate"), () -> new PressurePlateData(Block.BAMBOO_PRESSURE_PLATE, 6678), () -> Item.BAMBOO_PRESSURE_PLATE);

    public static final Block<RedstoneOreData> REDSTONE_ORE = new Block<>(270, 6680, NamespacedKey.parse("minecraft:redstone_ore"), () -> new RedstoneOreData(Block.REDSTONE_ORE, 6680), () -> Item.REDSTONE_ORE);

    public static final Block<RedstoneOreData> DEEPSLATE_REDSTONE_ORE = new Block<>(271, 6682, NamespacedKey.parse("minecraft:deepslate_redstone_ore"), () -> new RedstoneOreData(Block.DEEPSLATE_REDSTONE_ORE, 6682), () -> Item.DEEPSLATE_REDSTONE_ORE);

    public static final Block<RedstoneTorchData> REDSTONE_TORCH = new Block<>(272, 6684, NamespacedKey.parse("minecraft:redstone_torch"), () -> new RedstoneTorchData(Block.REDSTONE_TORCH, 6684), () -> Item.REDSTONE_TORCH);

    public static final Block<RedstoneWallTorchData> REDSTONE_WALL_TORCH = new Block<>(273, 6686, NamespacedKey.parse("minecraft:redstone_wall_torch"), () -> new RedstoneWallTorchData(Block.REDSTONE_WALL_TORCH, 6686), null);

    public static final Block<ButtonData> STONE_BUTTON = new Block<>(274, 6694, NamespacedKey.parse("minecraft:stone_button"), () -> new ButtonData(Block.STONE_BUTTON, 6694), () -> Item.STONE_BUTTON);

    public static final Block<SnowLayerData> SNOW = new Block<>(275, 6718, NamespacedKey.parse("minecraft:snow"), () -> new SnowLayerData(Block.SNOW, 6718), () -> Item.SNOW);

    public static final Block<BlockData> ICE = new Block<>(276, 6726, NamespacedKey.parse("minecraft:ice"), () -> new BlockData(Block.ICE, 6726), () -> Item.ICE);

    public static final Block<BlockData> SNOW_BLOCK = new Block<>(277, 6727, NamespacedKey.parse("minecraft:snow_block"), () -> new BlockData(Block.SNOW_BLOCK, 6727), () -> Item.SNOW_BLOCK);

    public static final Block<CactusData> CACTUS = new Block<>(278, 6728, NamespacedKey.parse("minecraft:cactus"), () -> new CactusData(Block.CACTUS, 6728), () -> Item.CACTUS);

    public static final Block<BlockData> CACTUS_FLOWER = new Block<>(279, 6744, NamespacedKey.parse("minecraft:cactus_flower"), () -> new BlockData(Block.CACTUS_FLOWER, 6744), () -> Item.CACTUS_FLOWER);

    public static final Block<BlockData> CLAY = new Block<>(280, 6745, NamespacedKey.parse("minecraft:clay"), () -> new BlockData(Block.CLAY, 6745), () -> Item.CLAY);

    public static final Block<SugarCaneData> SUGAR_CANE = new Block<>(281, 6746, NamespacedKey.parse("minecraft:sugar_cane"), () -> new SugarCaneData(Block.SUGAR_CANE, 6746), () -> Item.SUGAR_CANE);

    public static final Block<JukeboxData> JUKEBOX = new Block<>(282, 6762, NamespacedKey.parse("minecraft:jukebox"), () -> new JukeboxData(Block.JUKEBOX, 6762), () -> Item.JUKEBOX);

    public static final Block<FenceData> OAK_FENCE = new Block<>(283, 6764, NamespacedKey.parse("minecraft:oak_fence"), () -> new FenceData(Block.OAK_FENCE, 6764), () -> Item.OAK_FENCE);

    public static final Block<BlockData> NETHERRACK = new Block<>(284, 6796, NamespacedKey.parse("minecraft:netherrack"), () -> new BlockData(Block.NETHERRACK, 6796), () -> Item.NETHERRACK);

    public static final Block<BlockData> SOUL_SAND = new Block<>(285, 6797, NamespacedKey.parse("minecraft:soul_sand"), () -> new BlockData(Block.SOUL_SAND, 6797), () -> Item.SOUL_SAND);

    public static final Block<BlockData> SOUL_SOIL = new Block<>(286, 6798, NamespacedKey.parse("minecraft:soul_soil"), () -> new BlockData(Block.SOUL_SOIL, 6798), () -> Item.SOUL_SOIL);

    public static final Block<RotatedPillarData> BASALT = new Block<>(287, 6799, NamespacedKey.parse("minecraft:basalt"), () -> new RotatedPillarData(Block.BASALT, 6799), () -> Item.BASALT);

    public static final Block<RotatedPillarData> POLISHED_BASALT = new Block<>(288, 6802, NamespacedKey.parse("minecraft:polished_basalt"), () -> new RotatedPillarData(Block.POLISHED_BASALT, 6802), () -> Item.POLISHED_BASALT);

    public static final Block<BlockData> SOUL_TORCH = new Block<>(289, 6805, NamespacedKey.parse("minecraft:soul_torch"), () -> new BlockData(Block.SOUL_TORCH, 6805), () -> Item.SOUL_TORCH);

    public static final Block<WallTorchData> SOUL_WALL_TORCH = new Block<>(290, 6806, NamespacedKey.parse("minecraft:soul_wall_torch"), () -> new WallTorchData(Block.SOUL_WALL_TORCH, 6806), null);

    public static final Block<BlockData> COPPER_TORCH = new Block<>(291, 6810, NamespacedKey.parse("minecraft:copper_torch"), () -> new BlockData(Block.COPPER_TORCH, 6810), () -> Item.COPPER_TORCH);

    public static final Block<WallTorchData> COPPER_WALL_TORCH = new Block<>(292, 6811, NamespacedKey.parse("minecraft:copper_wall_torch"), () -> new WallTorchData(Block.COPPER_WALL_TORCH, 6811), null);

    public static final Block<BlockData> GLOWSTONE = new Block<>(293, 6815, NamespacedKey.parse("minecraft:glowstone"), () -> new BlockData(Block.GLOWSTONE, 6815), () -> Item.GLOWSTONE);

    public static final Block<NetherPortalData> NETHER_PORTAL = new Block<>(294, 6816, NamespacedKey.parse("minecraft:nether_portal"), () -> new NetherPortalData(Block.NETHER_PORTAL, 6816), null);

    public static final Block<JackOLanternData> CARVED_PUMPKIN = new Block<>(295, 6818, NamespacedKey.parse("minecraft:carved_pumpkin"), () -> new JackOLanternData(Block.CARVED_PUMPKIN, 6818), () -> Item.CARVED_PUMPKIN);

    public static final Block<JackOLanternData> JACK_O_LANTERN = new Block<>(296, 6822, NamespacedKey.parse("minecraft:jack_o_lantern"), () -> new JackOLanternData(Block.JACK_O_LANTERN, 6822), () -> Item.JACK_O_LANTERN);

    public static final Block<CakeData> CAKE = new Block<>(297, 6826, NamespacedKey.parse("minecraft:cake"), () -> new CakeData(Block.CAKE, 6826), () -> Item.CAKE);

    public static final Block<RepeaterData> REPEATER = new Block<>(298, 6833, NamespacedKey.parse("minecraft:repeater"), () -> new RepeaterData(Block.REPEATER, 6833), () -> Item.REPEATER);

    public static final Block<BlockData> WHITE_STAINED_GLASS = new Block<>(299, 6897, NamespacedKey.parse("minecraft:white_stained_glass"), () -> new BlockData(Block.WHITE_STAINED_GLASS, 6897), () -> Item.WHITE_STAINED_GLASS);

    public static final Block<BlockData> ORANGE_STAINED_GLASS = new Block<>(300, 6898, NamespacedKey.parse("minecraft:orange_stained_glass"), () -> new BlockData(Block.ORANGE_STAINED_GLASS, 6898), () -> Item.ORANGE_STAINED_GLASS);

    public static final Block<BlockData> MAGENTA_STAINED_GLASS = new Block<>(301, 6899, NamespacedKey.parse("minecraft:magenta_stained_glass"), () -> new BlockData(Block.MAGENTA_STAINED_GLASS, 6899), () -> Item.MAGENTA_STAINED_GLASS);

    public static final Block<BlockData> LIGHT_BLUE_STAINED_GLASS = new Block<>(302, 6900, NamespacedKey.parse("minecraft:light_blue_stained_glass"), () -> new BlockData(Block.LIGHT_BLUE_STAINED_GLASS, 6900), () -> Item.LIGHT_BLUE_STAINED_GLASS);

    public static final Block<BlockData> YELLOW_STAINED_GLASS = new Block<>(303, 6901, NamespacedKey.parse("minecraft:yellow_stained_glass"), () -> new BlockData(Block.YELLOW_STAINED_GLASS, 6901), () -> Item.YELLOW_STAINED_GLASS);

    public static final Block<BlockData> LIME_STAINED_GLASS = new Block<>(304, 6902, NamespacedKey.parse("minecraft:lime_stained_glass"), () -> new BlockData(Block.LIME_STAINED_GLASS, 6902), () -> Item.LIME_STAINED_GLASS);

    public static final Block<BlockData> PINK_STAINED_GLASS = new Block<>(305, 6903, NamespacedKey.parse("minecraft:pink_stained_glass"), () -> new BlockData(Block.PINK_STAINED_GLASS, 6903), () -> Item.PINK_STAINED_GLASS);

    public static final Block<BlockData> GRAY_STAINED_GLASS = new Block<>(306, 6904, NamespacedKey.parse("minecraft:gray_stained_glass"), () -> new BlockData(Block.GRAY_STAINED_GLASS, 6904), () -> Item.GRAY_STAINED_GLASS);

    public static final Block<BlockData> LIGHT_GRAY_STAINED_GLASS = new Block<>(307, 6905, NamespacedKey.parse("minecraft:light_gray_stained_glass"), () -> new BlockData(Block.LIGHT_GRAY_STAINED_GLASS, 6905), () -> Item.LIGHT_GRAY_STAINED_GLASS);

    public static final Block<BlockData> CYAN_STAINED_GLASS = new Block<>(308, 6906, NamespacedKey.parse("minecraft:cyan_stained_glass"), () -> new BlockData(Block.CYAN_STAINED_GLASS, 6906), () -> Item.CYAN_STAINED_GLASS);

    public static final Block<BlockData> PURPLE_STAINED_GLASS = new Block<>(309, 6907, NamespacedKey.parse("minecraft:purple_stained_glass"), () -> new BlockData(Block.PURPLE_STAINED_GLASS, 6907), () -> Item.PURPLE_STAINED_GLASS);

    public static final Block<BlockData> BLUE_STAINED_GLASS = new Block<>(310, 6908, NamespacedKey.parse("minecraft:blue_stained_glass"), () -> new BlockData(Block.BLUE_STAINED_GLASS, 6908), () -> Item.BLUE_STAINED_GLASS);

    public static final Block<BlockData> BROWN_STAINED_GLASS = new Block<>(311, 6909, NamespacedKey.parse("minecraft:brown_stained_glass"), () -> new BlockData(Block.BROWN_STAINED_GLASS, 6909), () -> Item.BROWN_STAINED_GLASS);

    public static final Block<BlockData> GREEN_STAINED_GLASS = new Block<>(312, 6910, NamespacedKey.parse("minecraft:green_stained_glass"), () -> new BlockData(Block.GREEN_STAINED_GLASS, 6910), () -> Item.GREEN_STAINED_GLASS);

    public static final Block<BlockData> RED_STAINED_GLASS = new Block<>(313, 6911, NamespacedKey.parse("minecraft:red_stained_glass"), () -> new BlockData(Block.RED_STAINED_GLASS, 6911), () -> Item.RED_STAINED_GLASS);

    public static final Block<BlockData> BLACK_STAINED_GLASS = new Block<>(314, 6912, NamespacedKey.parse("minecraft:black_stained_glass"), () -> new BlockData(Block.BLACK_STAINED_GLASS, 6912), () -> Item.BLACK_STAINED_GLASS);

    public static final Block<TrapdoorData> OAK_TRAPDOOR = new Block<>(315, 6913, NamespacedKey.parse("minecraft:oak_trapdoor"), () -> new TrapdoorData(Block.OAK_TRAPDOOR, 6913), () -> Item.OAK_TRAPDOOR);

    public static final Block<TrapdoorData> SPRUCE_TRAPDOOR = new Block<>(316, 6977, NamespacedKey.parse("minecraft:spruce_trapdoor"), () -> new TrapdoorData(Block.SPRUCE_TRAPDOOR, 6977), () -> Item.SPRUCE_TRAPDOOR);

    public static final Block<TrapdoorData> BIRCH_TRAPDOOR = new Block<>(317, 7041, NamespacedKey.parse("minecraft:birch_trapdoor"), () -> new TrapdoorData(Block.BIRCH_TRAPDOOR, 7041), () -> Item.BIRCH_TRAPDOOR);

    public static final Block<TrapdoorData> JUNGLE_TRAPDOOR = new Block<>(318, 7105, NamespacedKey.parse("minecraft:jungle_trapdoor"), () -> new TrapdoorData(Block.JUNGLE_TRAPDOOR, 7105), () -> Item.JUNGLE_TRAPDOOR);

    public static final Block<TrapdoorData> ACACIA_TRAPDOOR = new Block<>(319, 7169, NamespacedKey.parse("minecraft:acacia_trapdoor"), () -> new TrapdoorData(Block.ACACIA_TRAPDOOR, 7169), () -> Item.ACACIA_TRAPDOOR);

    public static final Block<TrapdoorData> CHERRY_TRAPDOOR = new Block<>(320, 7233, NamespacedKey.parse("minecraft:cherry_trapdoor"), () -> new TrapdoorData(Block.CHERRY_TRAPDOOR, 7233), () -> Item.CHERRY_TRAPDOOR);

    public static final Block<TrapdoorData> DARK_OAK_TRAPDOOR = new Block<>(321, 7297, NamespacedKey.parse("minecraft:dark_oak_trapdoor"), () -> new TrapdoorData(Block.DARK_OAK_TRAPDOOR, 7297), () -> Item.DARK_OAK_TRAPDOOR);

    public static final Block<TrapdoorData> PALE_OAK_TRAPDOOR = new Block<>(322, 7361, NamespacedKey.parse("minecraft:pale_oak_trapdoor"), () -> new TrapdoorData(Block.PALE_OAK_TRAPDOOR, 7361), () -> Item.PALE_OAK_TRAPDOOR);

    public static final Block<TrapdoorData> MANGROVE_TRAPDOOR = new Block<>(323, 7425, NamespacedKey.parse("minecraft:mangrove_trapdoor"), () -> new TrapdoorData(Block.MANGROVE_TRAPDOOR, 7425), () -> Item.MANGROVE_TRAPDOOR);

    public static final Block<TrapdoorData> BAMBOO_TRAPDOOR = new Block<>(324, 7489, NamespacedKey.parse("minecraft:bamboo_trapdoor"), () -> new TrapdoorData(Block.BAMBOO_TRAPDOOR, 7489), () -> Item.BAMBOO_TRAPDOOR);

    public static final Block<BlockData> STONE_BRICKS = new Block<>(325, 7553, NamespacedKey.parse("minecraft:stone_bricks"), () -> new BlockData(Block.STONE_BRICKS, 7553), () -> Item.STONE_BRICKS);

    public static final Block<BlockData> MOSSY_STONE_BRICKS = new Block<>(326, 7554, NamespacedKey.parse("minecraft:mossy_stone_bricks"), () -> new BlockData(Block.MOSSY_STONE_BRICKS, 7554), () -> Item.MOSSY_STONE_BRICKS);

    public static final Block<BlockData> CRACKED_STONE_BRICKS = new Block<>(327, 7555, NamespacedKey.parse("minecraft:cracked_stone_bricks"), () -> new BlockData(Block.CRACKED_STONE_BRICKS, 7555), () -> Item.CRACKED_STONE_BRICKS);

    public static final Block<BlockData> CHISELED_STONE_BRICKS = new Block<>(328, 7556, NamespacedKey.parse("minecraft:chiseled_stone_bricks"), () -> new BlockData(Block.CHISELED_STONE_BRICKS, 7556), () -> Item.CHISELED_STONE_BRICKS);

    public static final Block<BlockData> PACKED_MUD = new Block<>(329, 7557, NamespacedKey.parse("minecraft:packed_mud"), () -> new BlockData(Block.PACKED_MUD, 7557), () -> Item.PACKED_MUD);

    public static final Block<BlockData> MUD_BRICKS = new Block<>(330, 7558, NamespacedKey.parse("minecraft:mud_bricks"), () -> new BlockData(Block.MUD_BRICKS, 7558), () -> Item.MUD_BRICKS);

    public static final Block<BlockData> INFESTED_STONE = new Block<>(331, 7559, NamespacedKey.parse("minecraft:infested_stone"), () -> new BlockData(Block.INFESTED_STONE, 7559), () -> Item.INFESTED_STONE);

    public static final Block<BlockData> INFESTED_COBBLESTONE = new Block<>(332, 7560, NamespacedKey.parse("minecraft:infested_cobblestone"), () -> new BlockData(Block.INFESTED_COBBLESTONE, 7560), () -> Item.INFESTED_COBBLESTONE);

    public static final Block<BlockData> INFESTED_STONE_BRICKS = new Block<>(333, 7561, NamespacedKey.parse("minecraft:infested_stone_bricks"), () -> new BlockData(Block.INFESTED_STONE_BRICKS, 7561), () -> Item.INFESTED_STONE_BRICKS);

    public static final Block<BlockData> INFESTED_MOSSY_STONE_BRICKS = new Block<>(334, 7562, NamespacedKey.parse("minecraft:infested_mossy_stone_bricks"), () -> new BlockData(Block.INFESTED_MOSSY_STONE_BRICKS, 7562), () -> Item.INFESTED_MOSSY_STONE_BRICKS);

    public static final Block<BlockData> INFESTED_CRACKED_STONE_BRICKS = new Block<>(335, 7563, NamespacedKey.parse("minecraft:infested_cracked_stone_bricks"), () -> new BlockData(Block.INFESTED_CRACKED_STONE_BRICKS, 7563), () -> Item.INFESTED_CRACKED_STONE_BRICKS);

    public static final Block<BlockData> INFESTED_CHISELED_STONE_BRICKS = new Block<>(336, 7564, NamespacedKey.parse("minecraft:infested_chiseled_stone_bricks"), () -> new BlockData(Block.INFESTED_CHISELED_STONE_BRICKS, 7564), () -> Item.INFESTED_CHISELED_STONE_BRICKS);

    public static final Block<HugeMushroomData> BROWN_MUSHROOM_BLOCK = new Block<>(337, 7565, NamespacedKey.parse("minecraft:brown_mushroom_block"), () -> new HugeMushroomData(Block.BROWN_MUSHROOM_BLOCK, 7565), () -> Item.BROWN_MUSHROOM_BLOCK);

    public static final Block<HugeMushroomData> RED_MUSHROOM_BLOCK = new Block<>(338, 7629, NamespacedKey.parse("minecraft:red_mushroom_block"), () -> new HugeMushroomData(Block.RED_MUSHROOM_BLOCK, 7629), () -> Item.RED_MUSHROOM_BLOCK);

    public static final Block<HugeMushroomData> MUSHROOM_STEM = new Block<>(339, 7693, NamespacedKey.parse("minecraft:mushroom_stem"), () -> new HugeMushroomData(Block.MUSHROOM_STEM, 7693), () -> Item.MUSHROOM_STEM);

    public static final Block<IronBarsData> IRON_BARS = new Block<>(340, 7757, NamespacedKey.parse("minecraft:iron_bars"), () -> new IronBarsData(Block.IRON_BARS, 7757), () -> Item.IRON_BARS);

    public static final Block<WeatheringCopperBarData> COPPER_BARS = new Block<>(341, 7789, NamespacedKey.parse("minecraft:copper_bars"), () -> new WeatheringCopperBarData(Block.COPPER_BARS, 7789), () -> Item.COPPER_BARS);

    public static final Block<WeatheringCopperBarData> EXPOSED_COPPER_BARS = new Block<>(342, 7821, NamespacedKey.parse("minecraft:exposed_copper_bars"), () -> new WeatheringCopperBarData(Block.EXPOSED_COPPER_BARS, 7821), () -> Item.EXPOSED_COPPER_BARS);

    public static final Block<WeatheringCopperBarData> WEATHERED_COPPER_BARS = new Block<>(343, 7853, NamespacedKey.parse("minecraft:weathered_copper_bars"), () -> new WeatheringCopperBarData(Block.WEATHERED_COPPER_BARS, 7853), () -> Item.WEATHERED_COPPER_BARS);

    public static final Block<WeatheringCopperBarData> OXIDIZED_COPPER_BARS = new Block<>(344, 7885, NamespacedKey.parse("minecraft:oxidized_copper_bars"), () -> new WeatheringCopperBarData(Block.OXIDIZED_COPPER_BARS, 7885), () -> Item.OXIDIZED_COPPER_BARS);

    public static final Block<IronBarsData> WAXED_COPPER_BARS = new Block<>(345, 7917, NamespacedKey.parse("minecraft:waxed_copper_bars"), () -> new IronBarsData(Block.WAXED_COPPER_BARS, 7917), () -> Item.WAXED_COPPER_BARS);

    public static final Block<IronBarsData> WAXED_EXPOSED_COPPER_BARS = new Block<>(346, 7949, NamespacedKey.parse("minecraft:waxed_exposed_copper_bars"), () -> new IronBarsData(Block.WAXED_EXPOSED_COPPER_BARS, 7949), () -> Item.WAXED_EXPOSED_COPPER_BARS);

    public static final Block<IronBarsData> WAXED_WEATHERED_COPPER_BARS = new Block<>(347, 7981, NamespacedKey.parse("minecraft:waxed_weathered_copper_bars"), () -> new IronBarsData(Block.WAXED_WEATHERED_COPPER_BARS, 7981), () -> Item.WAXED_WEATHERED_COPPER_BARS);

    public static final Block<IronBarsData> WAXED_OXIDIZED_COPPER_BARS = new Block<>(348, 8013, NamespacedKey.parse("minecraft:waxed_oxidized_copper_bars"), () -> new IronBarsData(Block.WAXED_OXIDIZED_COPPER_BARS, 8013), () -> Item.WAXED_OXIDIZED_COPPER_BARS);

    public static final Block<ChainData> IRON_CHAIN = new Block<>(349, 8045, NamespacedKey.parse("minecraft:iron_chain"), () -> new ChainData(Block.IRON_CHAIN, 8045), () -> Item.IRON_CHAIN);

    public static final Block<WeatheringCopperChainData> COPPER_CHAIN = new Block<>(350, 8051, NamespacedKey.parse("minecraft:copper_chain"), () -> new WeatheringCopperChainData(Block.COPPER_CHAIN, 8051), () -> Item.COPPER_CHAIN);

    public static final Block<WeatheringCopperChainData> EXPOSED_COPPER_CHAIN = new Block<>(351, 8057, NamespacedKey.parse("minecraft:exposed_copper_chain"), () -> new WeatheringCopperChainData(Block.EXPOSED_COPPER_CHAIN, 8057), () -> Item.EXPOSED_COPPER_CHAIN);

    public static final Block<WeatheringCopperChainData> WEATHERED_COPPER_CHAIN = new Block<>(352, 8063, NamespacedKey.parse("minecraft:weathered_copper_chain"), () -> new WeatheringCopperChainData(Block.WEATHERED_COPPER_CHAIN, 8063), () -> Item.WEATHERED_COPPER_CHAIN);

    public static final Block<WeatheringCopperChainData> OXIDIZED_COPPER_CHAIN = new Block<>(353, 8069, NamespacedKey.parse("minecraft:oxidized_copper_chain"), () -> new WeatheringCopperChainData(Block.OXIDIZED_COPPER_CHAIN, 8069), () -> Item.OXIDIZED_COPPER_CHAIN);

    public static final Block<ChainData> WAXED_COPPER_CHAIN = new Block<>(354, 8075, NamespacedKey.parse("minecraft:waxed_copper_chain"), () -> new ChainData(Block.WAXED_COPPER_CHAIN, 8075), () -> Item.WAXED_COPPER_CHAIN);

    public static final Block<ChainData> WAXED_EXPOSED_COPPER_CHAIN = new Block<>(355, 8081, NamespacedKey.parse("minecraft:waxed_exposed_copper_chain"), () -> new ChainData(Block.WAXED_EXPOSED_COPPER_CHAIN, 8081), () -> Item.WAXED_EXPOSED_COPPER_CHAIN);

    public static final Block<ChainData> WAXED_WEATHERED_COPPER_CHAIN = new Block<>(356, 8087, NamespacedKey.parse("minecraft:waxed_weathered_copper_chain"), () -> new ChainData(Block.WAXED_WEATHERED_COPPER_CHAIN, 8087), () -> Item.WAXED_WEATHERED_COPPER_CHAIN);

    public static final Block<ChainData> WAXED_OXIDIZED_COPPER_CHAIN = new Block<>(357, 8093, NamespacedKey.parse("minecraft:waxed_oxidized_copper_chain"), () -> new ChainData(Block.WAXED_OXIDIZED_COPPER_CHAIN, 8093), () -> Item.WAXED_OXIDIZED_COPPER_CHAIN);

    public static final Block<IronBarsData> GLASS_PANE = new Block<>(358, 8099, NamespacedKey.parse("minecraft:glass_pane"), () -> new IronBarsData(Block.GLASS_PANE, 8099), () -> Item.GLASS_PANE);

    public static final Block<BlockData> PUMPKIN = new Block<>(359, 8131, NamespacedKey.parse("minecraft:pumpkin"), () -> new BlockData(Block.PUMPKIN, 8131), () -> Item.PUMPKIN);

    public static final Block<BlockData> MELON = new Block<>(360, 8132, NamespacedKey.parse("minecraft:melon"), () -> new BlockData(Block.MELON, 8132), () -> Item.MELON);

    public static final Block<AttachedStemData> ATTACHED_PUMPKIN_STEM = new Block<>(361, 8133, NamespacedKey.parse("minecraft:attached_pumpkin_stem"), () -> new AttachedStemData(Block.ATTACHED_PUMPKIN_STEM, 8133), null);

    public static final Block<AttachedStemData> ATTACHED_MELON_STEM = new Block<>(362, 8137, NamespacedKey.parse("minecraft:attached_melon_stem"), () -> new AttachedStemData(Block.ATTACHED_MELON_STEM, 8137), null);

    public static final Block<StemData> PUMPKIN_STEM = new Block<>(363, 8141, NamespacedKey.parse("minecraft:pumpkin_stem"), () -> new StemData(Block.PUMPKIN_STEM, 8141), null);

    public static final Block<StemData> MELON_STEM = new Block<>(364, 8149, NamespacedKey.parse("minecraft:melon_stem"), () -> new StemData(Block.MELON_STEM, 8149), null);

    public static final Block<VineData> VINE = new Block<>(365, 8157, NamespacedKey.parse("minecraft:vine"), () -> new VineData(Block.VINE, 8157), () -> Item.VINE);

    public static final Block<GlowLichenData> GLOW_LICHEN = new Block<>(366, 8189, NamespacedKey.parse("minecraft:glow_lichen"), () -> new GlowLichenData(Block.GLOW_LICHEN, 8189), () -> Item.GLOW_LICHEN);

    public static final Block<MultifaceData> RESIN_CLUMP = new Block<>(367, 8317, NamespacedKey.parse("minecraft:resin_clump"), () -> new MultifaceData(Block.RESIN_CLUMP, 8317), () -> Item.RESIN_CLUMP);

    public static final Block<FenceGateData> OAK_FENCE_GATE = new Block<>(368, 8445, NamespacedKey.parse("minecraft:oak_fence_gate"), () -> new FenceGateData(Block.OAK_FENCE_GATE, 8445), () -> Item.OAK_FENCE_GATE);

    public static final Block<StairData> BRICK_STAIRS = new Block<>(369, 8477, NamespacedKey.parse("minecraft:brick_stairs"), () -> new StairData(Block.BRICK_STAIRS, 8477), () -> Item.BRICK_STAIRS);

    public static final Block<StairData> STONE_BRICK_STAIRS = new Block<>(370, 8557, NamespacedKey.parse("minecraft:stone_brick_stairs"), () -> new StairData(Block.STONE_BRICK_STAIRS, 8557), () -> Item.STONE_BRICK_STAIRS);

    public static final Block<StairData> MUD_BRICK_STAIRS = new Block<>(371, 8637, NamespacedKey.parse("minecraft:mud_brick_stairs"), () -> new StairData(Block.MUD_BRICK_STAIRS, 8637), () -> Item.MUD_BRICK_STAIRS);

    public static final Block<MyceliumData> MYCELIUM = new Block<>(372, 8717, NamespacedKey.parse("minecraft:mycelium"), () -> new MyceliumData(Block.MYCELIUM, 8717), () -> Item.MYCELIUM);

    public static final Block<BlockData> LILY_PAD = new Block<>(373, 8719, NamespacedKey.parse("minecraft:lily_pad"), () -> new BlockData(Block.LILY_PAD, 8719), () -> Item.LILY_PAD);

    public static final Block<BlockData> RESIN_BLOCK = new Block<>(374, 8720, NamespacedKey.parse("minecraft:resin_block"), () -> new BlockData(Block.RESIN_BLOCK, 8720), () -> Item.RESIN_BLOCK);

    public static final Block<BlockData> RESIN_BRICKS = new Block<>(375, 8721, NamespacedKey.parse("minecraft:resin_bricks"), () -> new BlockData(Block.RESIN_BRICKS, 8721), () -> Item.RESIN_BRICKS);

    public static final Block<StairData> RESIN_BRICK_STAIRS = new Block<>(376, 8722, NamespacedKey.parse("minecraft:resin_brick_stairs"), () -> new StairData(Block.RESIN_BRICK_STAIRS, 8722), () -> Item.RESIN_BRICK_STAIRS);

    public static final Block<SlabData> RESIN_BRICK_SLAB = new Block<>(377, 8802, NamespacedKey.parse("minecraft:resin_brick_slab"), () -> new SlabData(Block.RESIN_BRICK_SLAB, 8802), () -> Item.RESIN_BRICK_SLAB);

    public static final Block<WallData> RESIN_BRICK_WALL = new Block<>(378, 8808, NamespacedKey.parse("minecraft:resin_brick_wall"), () -> new WallData(Block.RESIN_BRICK_WALL, 8808), () -> Item.RESIN_BRICK_WALL);

    public static final Block<BlockData> CHISELED_RESIN_BRICKS = new Block<>(379, 9132, NamespacedKey.parse("minecraft:chiseled_resin_bricks"), () -> new BlockData(Block.CHISELED_RESIN_BRICKS, 9132), () -> Item.CHISELED_RESIN_BRICKS);

    public static final Block<BlockData> NETHER_BRICKS = new Block<>(380, 9133, NamespacedKey.parse("minecraft:nether_bricks"), () -> new BlockData(Block.NETHER_BRICKS, 9133), () -> Item.NETHER_BRICKS);

    public static final Block<FenceData> NETHER_BRICK_FENCE = new Block<>(381, 9134, NamespacedKey.parse("minecraft:nether_brick_fence"), () -> new FenceData(Block.NETHER_BRICK_FENCE, 9134), () -> Item.NETHER_BRICK_FENCE);

    public static final Block<StairData> NETHER_BRICK_STAIRS = new Block<>(382, 9166, NamespacedKey.parse("minecraft:nether_brick_stairs"), () -> new StairData(Block.NETHER_BRICK_STAIRS, 9166), () -> Item.NETHER_BRICK_STAIRS);

    public static final Block<NetherWartData> NETHER_WART = new Block<>(383, 9246, NamespacedKey.parse("minecraft:nether_wart"), () -> new NetherWartData(Block.NETHER_WART, 9246), () -> Item.NETHER_WART);

    public static final Block<BlockData> ENCHANTING_TABLE = new Block<>(384, 9250, NamespacedKey.parse("minecraft:enchanting_table"), () -> new BlockData(Block.ENCHANTING_TABLE, 9250), () -> Item.ENCHANTING_TABLE);

    public static final Block<BrewingStandData> BREWING_STAND = new Block<>(385, 9251, NamespacedKey.parse("minecraft:brewing_stand"), () -> new BrewingStandData(Block.BREWING_STAND, 9251), () -> Item.BREWING_STAND);

    public static final Block<BlockData> CAULDRON = new Block<>(386, 9259, NamespacedKey.parse("minecraft:cauldron"), () -> new BlockData(Block.CAULDRON, 9259), () -> Item.CAULDRON);

    public static final Block<LayeredCauldronData> WATER_CAULDRON = new Block<>(387, 9260, NamespacedKey.parse("minecraft:water_cauldron"), () -> new LayeredCauldronData(Block.WATER_CAULDRON, 9260), null);

    public static final Block<BlockData> LAVA_CAULDRON = new Block<>(388, 9263, NamespacedKey.parse("minecraft:lava_cauldron"), () -> new BlockData(Block.LAVA_CAULDRON, 9263), null);

    public static final Block<LayeredCauldronData> POWDER_SNOW_CAULDRON = new Block<>(389, 9264, NamespacedKey.parse("minecraft:powder_snow_cauldron"), () -> new LayeredCauldronData(Block.POWDER_SNOW_CAULDRON, 9264), null);

    public static final Block<BlockData> END_PORTAL = new Block<>(390, 9267, NamespacedKey.parse("minecraft:end_portal"), () -> new BlockData(Block.END_PORTAL, 9267), null);

    public static final Block<EndPortalFrameData> END_PORTAL_FRAME = new Block<>(391, 9268, NamespacedKey.parse("minecraft:end_portal_frame"), () -> new EndPortalFrameData(Block.END_PORTAL_FRAME, 9268), () -> Item.END_PORTAL_FRAME);

    public static final Block<BlockData> END_STONE = new Block<>(392, 9276, NamespacedKey.parse("minecraft:end_stone"), () -> new BlockData(Block.END_STONE, 9276), () -> Item.END_STONE);

    public static final Block<BlockData> DRAGON_EGG = new Block<>(393, 9277, NamespacedKey.parse("minecraft:dragon_egg"), () -> new BlockData(Block.DRAGON_EGG, 9277), () -> Item.DRAGON_EGG);

    public static final Block<RedstoneLampData> REDSTONE_LAMP = new Block<>(394, 9278, NamespacedKey.parse("minecraft:redstone_lamp"), () -> new RedstoneLampData(Block.REDSTONE_LAMP, 9278), () -> Item.REDSTONE_LAMP);

    public static final Block<CocoaData> COCOA = new Block<>(395, 9280, NamespacedKey.parse("minecraft:cocoa"), () -> new CocoaData(Block.COCOA, 9280), null);

    public static final Block<StairData> SANDSTONE_STAIRS = new Block<>(396, 9292, NamespacedKey.parse("minecraft:sandstone_stairs"), () -> new StairData(Block.SANDSTONE_STAIRS, 9292), () -> Item.SANDSTONE_STAIRS);

    public static final Block<BlockData> EMERALD_ORE = new Block<>(397, 9372, NamespacedKey.parse("minecraft:emerald_ore"), () -> new BlockData(Block.EMERALD_ORE, 9372), () -> Item.EMERALD_ORE);

    public static final Block<BlockData> DEEPSLATE_EMERALD_ORE = new Block<>(398, 9373, NamespacedKey.parse("minecraft:deepslate_emerald_ore"), () -> new BlockData(Block.DEEPSLATE_EMERALD_ORE, 9373), () -> Item.DEEPSLATE_EMERALD_ORE);

    public static final Block<EnderChestData> ENDER_CHEST = new Block<>(399, 9374, NamespacedKey.parse("minecraft:ender_chest"), () -> new EnderChestData(Block.ENDER_CHEST, 9374), () -> Item.ENDER_CHEST);

    public static final Block<TripWireHookData> TRIPWIRE_HOOK = new Block<>(400, 9382, NamespacedKey.parse("minecraft:tripwire_hook"), () -> new TripWireHookData(Block.TRIPWIRE_HOOK, 9382), () -> Item.TRIPWIRE_HOOK);

    public static final Block<TripwireData> TRIPWIRE = new Block<>(401, 9398, NamespacedKey.parse("minecraft:tripwire"), () -> new TripwireData(Block.TRIPWIRE, 9398), null);

    public static final Block<BlockData> EMERALD_BLOCK = new Block<>(402, 9526, NamespacedKey.parse("minecraft:emerald_block"), () -> new BlockData(Block.EMERALD_BLOCK, 9526), () -> Item.EMERALD_BLOCK);

    public static final Block<StairData> SPRUCE_STAIRS = new Block<>(403, 9527, NamespacedKey.parse("minecraft:spruce_stairs"), () -> new StairData(Block.SPRUCE_STAIRS, 9527), () -> Item.SPRUCE_STAIRS);

    public static final Block<StairData> BIRCH_STAIRS = new Block<>(404, 9607, NamespacedKey.parse("minecraft:birch_stairs"), () -> new StairData(Block.BIRCH_STAIRS, 9607), () -> Item.BIRCH_STAIRS);

    public static final Block<StairData> JUNGLE_STAIRS = new Block<>(405, 9687, NamespacedKey.parse("minecraft:jungle_stairs"), () -> new StairData(Block.JUNGLE_STAIRS, 9687), () -> Item.JUNGLE_STAIRS);

    public static final Block<CommandData> COMMAND_BLOCK = new Block<>(406, 9767, NamespacedKey.parse("minecraft:command_block"), () -> new CommandData(Block.COMMAND_BLOCK, 9767), () -> Item.COMMAND_BLOCK);

    public static final Block<BlockData> BEACON = new Block<>(407, 9779, NamespacedKey.parse("minecraft:beacon"), () -> new BlockData(Block.BEACON, 9779), () -> Item.BEACON);

    public static final Block<WallData> COBBLESTONE_WALL = new Block<>(408, 9780, NamespacedKey.parse("minecraft:cobblestone_wall"), () -> new WallData(Block.COBBLESTONE_WALL, 9780), () -> Item.COBBLESTONE_WALL);

    public static final Block<WallData> MOSSY_COBBLESTONE_WALL = new Block<>(409, 10104, NamespacedKey.parse("minecraft:mossy_cobblestone_wall"), () -> new WallData(Block.MOSSY_COBBLESTONE_WALL, 10104), () -> Item.MOSSY_COBBLESTONE_WALL);

    public static final Block<BlockData> FLOWER_POT = new Block<>(410, 10428, NamespacedKey.parse("minecraft:flower_pot"), () -> new BlockData(Block.FLOWER_POT, 10428), () -> Item.FLOWER_POT);

    public static final Block<BlockData> POTTED_TORCHFLOWER = new Block<>(411, 10429, NamespacedKey.parse("minecraft:potted_torchflower"), () -> new BlockData(Block.POTTED_TORCHFLOWER, 10429), null);

    public static final Block<BlockData> POTTED_OAK_SAPLING = new Block<>(412, 10430, NamespacedKey.parse("minecraft:potted_oak_sapling"), () -> new BlockData(Block.POTTED_OAK_SAPLING, 10430), null);

    public static final Block<BlockData> POTTED_SPRUCE_SAPLING = new Block<>(413, 10431, NamespacedKey.parse("minecraft:potted_spruce_sapling"), () -> new BlockData(Block.POTTED_SPRUCE_SAPLING, 10431), null);

    public static final Block<BlockData> POTTED_BIRCH_SAPLING = new Block<>(414, 10432, NamespacedKey.parse("minecraft:potted_birch_sapling"), () -> new BlockData(Block.POTTED_BIRCH_SAPLING, 10432), null);

    public static final Block<BlockData> POTTED_JUNGLE_SAPLING = new Block<>(415, 10433, NamespacedKey.parse("minecraft:potted_jungle_sapling"), () -> new BlockData(Block.POTTED_JUNGLE_SAPLING, 10433), null);

    public static final Block<BlockData> POTTED_ACACIA_SAPLING = new Block<>(416, 10434, NamespacedKey.parse("minecraft:potted_acacia_sapling"), () -> new BlockData(Block.POTTED_ACACIA_SAPLING, 10434), null);

    public static final Block<BlockData> POTTED_CHERRY_SAPLING = new Block<>(417, 10435, NamespacedKey.parse("minecraft:potted_cherry_sapling"), () -> new BlockData(Block.POTTED_CHERRY_SAPLING, 10435), null);

    public static final Block<BlockData> POTTED_DARK_OAK_SAPLING = new Block<>(418, 10436, NamespacedKey.parse("minecraft:potted_dark_oak_sapling"), () -> new BlockData(Block.POTTED_DARK_OAK_SAPLING, 10436), null);

    public static final Block<BlockData> POTTED_PALE_OAK_SAPLING = new Block<>(419, 10437, NamespacedKey.parse("minecraft:potted_pale_oak_sapling"), () -> new BlockData(Block.POTTED_PALE_OAK_SAPLING, 10437), null);

    public static final Block<BlockData> POTTED_MANGROVE_PROPAGULE = new Block<>(420, 10438, NamespacedKey.parse("minecraft:potted_mangrove_propagule"), () -> new BlockData(Block.POTTED_MANGROVE_PROPAGULE, 10438), null);

    public static final Block<BlockData> POTTED_FERN = new Block<>(421, 10439, NamespacedKey.parse("minecraft:potted_fern"), () -> new BlockData(Block.POTTED_FERN, 10439), null);

    public static final Block<BlockData> POTTED_DANDELION = new Block<>(422, 10440, NamespacedKey.parse("minecraft:potted_dandelion"), () -> new BlockData(Block.POTTED_DANDELION, 10440), null);

    public static final Block<BlockData> POTTED_POPPY = new Block<>(423, 10441, NamespacedKey.parse("minecraft:potted_poppy"), () -> new BlockData(Block.POTTED_POPPY, 10441), null);

    public static final Block<BlockData> POTTED_BLUE_ORCHID = new Block<>(424, 10442, NamespacedKey.parse("minecraft:potted_blue_orchid"), () -> new BlockData(Block.POTTED_BLUE_ORCHID, 10442), null);

    public static final Block<BlockData> POTTED_ALLIUM = new Block<>(425, 10443, NamespacedKey.parse("minecraft:potted_allium"), () -> new BlockData(Block.POTTED_ALLIUM, 10443), null);

    public static final Block<BlockData> POTTED_AZURE_BLUET = new Block<>(426, 10444, NamespacedKey.parse("minecraft:potted_azure_bluet"), () -> new BlockData(Block.POTTED_AZURE_BLUET, 10444), null);

    public static final Block<BlockData> POTTED_RED_TULIP = new Block<>(427, 10445, NamespacedKey.parse("minecraft:potted_red_tulip"), () -> new BlockData(Block.POTTED_RED_TULIP, 10445), null);

    public static final Block<BlockData> POTTED_ORANGE_TULIP = new Block<>(428, 10446, NamespacedKey.parse("minecraft:potted_orange_tulip"), () -> new BlockData(Block.POTTED_ORANGE_TULIP, 10446), null);

    public static final Block<BlockData> POTTED_WHITE_TULIP = new Block<>(429, 10447, NamespacedKey.parse("minecraft:potted_white_tulip"), () -> new BlockData(Block.POTTED_WHITE_TULIP, 10447), null);

    public static final Block<BlockData> POTTED_PINK_TULIP = new Block<>(430, 10448, NamespacedKey.parse("minecraft:potted_pink_tulip"), () -> new BlockData(Block.POTTED_PINK_TULIP, 10448), null);

    public static final Block<BlockData> POTTED_OXEYE_DAISY = new Block<>(431, 10449, NamespacedKey.parse("minecraft:potted_oxeye_daisy"), () -> new BlockData(Block.POTTED_OXEYE_DAISY, 10449), null);

    public static final Block<BlockData> POTTED_CORNFLOWER = new Block<>(432, 10450, NamespacedKey.parse("minecraft:potted_cornflower"), () -> new BlockData(Block.POTTED_CORNFLOWER, 10450), null);

    public static final Block<BlockData> POTTED_LILY_OF_THE_VALLEY = new Block<>(433, 10451, NamespacedKey.parse("minecraft:potted_lily_of_the_valley"), () -> new BlockData(Block.POTTED_LILY_OF_THE_VALLEY, 10451), null);

    public static final Block<BlockData> POTTED_WITHER_ROSE = new Block<>(434, 10452, NamespacedKey.parse("minecraft:potted_wither_rose"), () -> new BlockData(Block.POTTED_WITHER_ROSE, 10452), null);

    public static final Block<BlockData> POTTED_RED_MUSHROOM = new Block<>(435, 10453, NamespacedKey.parse("minecraft:potted_red_mushroom"), () -> new BlockData(Block.POTTED_RED_MUSHROOM, 10453), null);

    public static final Block<BlockData> POTTED_BROWN_MUSHROOM = new Block<>(436, 10454, NamespacedKey.parse("minecraft:potted_brown_mushroom"), () -> new BlockData(Block.POTTED_BROWN_MUSHROOM, 10454), null);

    public static final Block<BlockData> POTTED_DEAD_BUSH = new Block<>(437, 10455, NamespacedKey.parse("minecraft:potted_dead_bush"), () -> new BlockData(Block.POTTED_DEAD_BUSH, 10455), null);

    public static final Block<BlockData> POTTED_CACTUS = new Block<>(438, 10456, NamespacedKey.parse("minecraft:potted_cactus"), () -> new BlockData(Block.POTTED_CACTUS, 10456), null);

    public static final Block<CarrotData> CARROTS = new Block<>(439, 10457, NamespacedKey.parse("minecraft:carrots"), () -> new CarrotData(Block.CARROTS, 10457), null);

    public static final Block<PotatoData> POTATOES = new Block<>(440, 10465, NamespacedKey.parse("minecraft:potatoes"), () -> new PotatoData(Block.POTATOES, 10465), null);

    public static final Block<ButtonData> OAK_BUTTON = new Block<>(441, 10473, NamespacedKey.parse("minecraft:oak_button"), () -> new ButtonData(Block.OAK_BUTTON, 10473), () -> Item.OAK_BUTTON);

    public static final Block<ButtonData> SPRUCE_BUTTON = new Block<>(442, 10497, NamespacedKey.parse("minecraft:spruce_button"), () -> new ButtonData(Block.SPRUCE_BUTTON, 10497), () -> Item.SPRUCE_BUTTON);

    public static final Block<ButtonData> BIRCH_BUTTON = new Block<>(443, 10521, NamespacedKey.parse("minecraft:birch_button"), () -> new ButtonData(Block.BIRCH_BUTTON, 10521), () -> Item.BIRCH_BUTTON);

    public static final Block<ButtonData> JUNGLE_BUTTON = new Block<>(444, 10545, NamespacedKey.parse("minecraft:jungle_button"), () -> new ButtonData(Block.JUNGLE_BUTTON, 10545), () -> Item.JUNGLE_BUTTON);

    public static final Block<ButtonData> ACACIA_BUTTON = new Block<>(445, 10569, NamespacedKey.parse("minecraft:acacia_button"), () -> new ButtonData(Block.ACACIA_BUTTON, 10569), () -> Item.ACACIA_BUTTON);

    public static final Block<ButtonData> CHERRY_BUTTON = new Block<>(446, 10593, NamespacedKey.parse("minecraft:cherry_button"), () -> new ButtonData(Block.CHERRY_BUTTON, 10593), () -> Item.CHERRY_BUTTON);

    public static final Block<ButtonData> DARK_OAK_BUTTON = new Block<>(447, 10617, NamespacedKey.parse("minecraft:dark_oak_button"), () -> new ButtonData(Block.DARK_OAK_BUTTON, 10617), () -> Item.DARK_OAK_BUTTON);

    public static final Block<ButtonData> PALE_OAK_BUTTON = new Block<>(448, 10641, NamespacedKey.parse("minecraft:pale_oak_button"), () -> new ButtonData(Block.PALE_OAK_BUTTON, 10641), () -> Item.PALE_OAK_BUTTON);

    public static final Block<ButtonData> MANGROVE_BUTTON = new Block<>(449, 10665, NamespacedKey.parse("minecraft:mangrove_button"), () -> new ButtonData(Block.MANGROVE_BUTTON, 10665), () -> Item.MANGROVE_BUTTON);

    public static final Block<ButtonData> BAMBOO_BUTTON = new Block<>(450, 10689, NamespacedKey.parse("minecraft:bamboo_button"), () -> new ButtonData(Block.BAMBOO_BUTTON, 10689), () -> Item.BAMBOO_BUTTON);

    public static final Block<SkullData> SKELETON_SKULL = new Block<>(451, 10713, NamespacedKey.parse("minecraft:skeleton_skull"), () -> new SkullData(Block.SKELETON_SKULL, 10713), () -> Item.SKELETON_SKULL);

    public static final Block<WallSkullData> SKELETON_WALL_SKULL = new Block<>(452, 10745, NamespacedKey.parse("minecraft:skeleton_wall_skull"), () -> new WallSkullData(Block.SKELETON_WALL_SKULL, 10745), null);

    public static final Block<WitherSkullData> WITHER_SKELETON_SKULL = new Block<>(453, 10753, NamespacedKey.parse("minecraft:wither_skeleton_skull"), () -> new WitherSkullData(Block.WITHER_SKELETON_SKULL, 10753), () -> Item.WITHER_SKELETON_SKULL);

    public static final Block<WitherWallSkullData> WITHER_SKELETON_WALL_SKULL = new Block<>(454, 10785, NamespacedKey.parse("minecraft:wither_skeleton_wall_skull"), () -> new WitherWallSkullData(Block.WITHER_SKELETON_WALL_SKULL, 10785), null);

    public static final Block<SkullData> ZOMBIE_HEAD = new Block<>(455, 10793, NamespacedKey.parse("minecraft:zombie_head"), () -> new SkullData(Block.ZOMBIE_HEAD, 10793), () -> Item.ZOMBIE_HEAD);

    public static final Block<WallSkullData> ZOMBIE_WALL_HEAD = new Block<>(456, 10825, NamespacedKey.parse("minecraft:zombie_wall_head"), () -> new WallSkullData(Block.ZOMBIE_WALL_HEAD, 10825), null);

    public static final Block<PlayerHeadData> PLAYER_HEAD = new Block<>(457, 10833, NamespacedKey.parse("minecraft:player_head"), () -> new PlayerHeadData(Block.PLAYER_HEAD, 10833), () -> Item.PLAYER_HEAD);

    public static final Block<PlayerWallHeadData> PLAYER_WALL_HEAD = new Block<>(458, 10865, NamespacedKey.parse("minecraft:player_wall_head"), () -> new PlayerWallHeadData(Block.PLAYER_WALL_HEAD, 10865), null);

    public static final Block<SkullData> CREEPER_HEAD = new Block<>(459, 10873, NamespacedKey.parse("minecraft:creeper_head"), () -> new SkullData(Block.CREEPER_HEAD, 10873), () -> Item.CREEPER_HEAD);

    public static final Block<WallSkullData> CREEPER_WALL_HEAD = new Block<>(460, 10905, NamespacedKey.parse("minecraft:creeper_wall_head"), () -> new WallSkullData(Block.CREEPER_WALL_HEAD, 10905), null);

    public static final Block<SkullData> DRAGON_HEAD = new Block<>(461, 10913, NamespacedKey.parse("minecraft:dragon_head"), () -> new SkullData(Block.DRAGON_HEAD, 10913), () -> Item.DRAGON_HEAD);

    public static final Block<WallSkullData> DRAGON_WALL_HEAD = new Block<>(462, 10945, NamespacedKey.parse("minecraft:dragon_wall_head"), () -> new WallSkullData(Block.DRAGON_WALL_HEAD, 10945), null);

    public static final Block<SkullData> PIGLIN_HEAD = new Block<>(463, 10953, NamespacedKey.parse("minecraft:piglin_head"), () -> new SkullData(Block.PIGLIN_HEAD, 10953), () -> Item.PIGLIN_HEAD);

    public static final Block<PiglinwallskullData> PIGLIN_WALL_HEAD = new Block<>(464, 10985, NamespacedKey.parse("minecraft:piglin_wall_head"), () -> new PiglinwallskullData(Block.PIGLIN_WALL_HEAD, 10985), null);

    public static final Block<AnvilData> ANVIL = new Block<>(465, 10993, NamespacedKey.parse("minecraft:anvil"), () -> new AnvilData(Block.ANVIL, 10993), () -> Item.ANVIL);

    public static final Block<AnvilData> CHIPPED_ANVIL = new Block<>(466, 10997, NamespacedKey.parse("minecraft:chipped_anvil"), () -> new AnvilData(Block.CHIPPED_ANVIL, 10997), () -> Item.CHIPPED_ANVIL);

    public static final Block<AnvilData> DAMAGED_ANVIL = new Block<>(467, 11001, NamespacedKey.parse("minecraft:damaged_anvil"), () -> new AnvilData(Block.DAMAGED_ANVIL, 11001), () -> Item.DAMAGED_ANVIL);

    public static final Block<TrappedChestData> TRAPPED_CHEST = new Block<>(468, 11005, NamespacedKey.parse("minecraft:trapped_chest"), () -> new TrappedChestData(Block.TRAPPED_CHEST, 11005), () -> Item.TRAPPED_CHEST);

    public static final Block<WeightedPressurePlateData> LIGHT_WEIGHTED_PRESSURE_PLATE = new Block<>(469, 11029, NamespacedKey.parse("minecraft:light_weighted_pressure_plate"), () -> new WeightedPressurePlateData(Block.LIGHT_WEIGHTED_PRESSURE_PLATE, 11029), () -> Item.LIGHT_WEIGHTED_PRESSURE_PLATE);

    public static final Block<WeightedPressurePlateData> HEAVY_WEIGHTED_PRESSURE_PLATE = new Block<>(470, 11045, NamespacedKey.parse("minecraft:heavy_weighted_pressure_plate"), () -> new WeightedPressurePlateData(Block.HEAVY_WEIGHTED_PRESSURE_PLATE, 11045), () -> Item.HEAVY_WEIGHTED_PRESSURE_PLATE);

    public static final Block<ComparatorData> COMPARATOR = new Block<>(471, 11061, NamespacedKey.parse("minecraft:comparator"), () -> new ComparatorData(Block.COMPARATOR, 11061), () -> Item.COMPARATOR);

    public static final Block<DaylightDetectorData> DAYLIGHT_DETECTOR = new Block<>(472, 11077, NamespacedKey.parse("minecraft:daylight_detector"), () -> new DaylightDetectorData(Block.DAYLIGHT_DETECTOR, 11077), () -> Item.DAYLIGHT_DETECTOR);

    public static final Block<BlockData> REDSTONE_BLOCK = new Block<>(473, 11109, NamespacedKey.parse("minecraft:redstone_block"), () -> new BlockData(Block.REDSTONE_BLOCK, 11109), () -> Item.REDSTONE_BLOCK);

    public static final Block<BlockData> NETHER_QUARTZ_ORE = new Block<>(474, 11110, NamespacedKey.parse("minecraft:nether_quartz_ore"), () -> new BlockData(Block.NETHER_QUARTZ_ORE, 11110), () -> Item.NETHER_QUARTZ_ORE);

    public static final Block<HopperData> HOPPER = new Block<>(475, 11111, NamespacedKey.parse("minecraft:hopper"), () -> new HopperData(Block.HOPPER, 11111), () -> Item.HOPPER);

    public static final Block<BlockData> QUARTZ_BLOCK = new Block<>(476, 11121, NamespacedKey.parse("minecraft:quartz_block"), () -> new BlockData(Block.QUARTZ_BLOCK, 11121), () -> Item.QUARTZ_BLOCK);

    public static final Block<BlockData> CHISELED_QUARTZ_BLOCK = new Block<>(477, 11122, NamespacedKey.parse("minecraft:chiseled_quartz_block"), () -> new BlockData(Block.CHISELED_QUARTZ_BLOCK, 11122), () -> Item.CHISELED_QUARTZ_BLOCK);

    public static final Block<RotatedPillarData> QUARTZ_PILLAR = new Block<>(478, 11123, NamespacedKey.parse("minecraft:quartz_pillar"), () -> new RotatedPillarData(Block.QUARTZ_PILLAR, 11123), () -> Item.QUARTZ_PILLAR);

    public static final Block<StairData> QUARTZ_STAIRS = new Block<>(479, 11126, NamespacedKey.parse("minecraft:quartz_stairs"), () -> new StairData(Block.QUARTZ_STAIRS, 11126), () -> Item.QUARTZ_STAIRS);

    public static final Block<PoweredRailData> ACTIVATOR_RAIL = new Block<>(480, 11206, NamespacedKey.parse("minecraft:activator_rail"), () -> new PoweredRailData(Block.ACTIVATOR_RAIL, 11206), () -> Item.ACTIVATOR_RAIL);

    public static final Block<DropperData> DROPPER = new Block<>(481, 11230, NamespacedKey.parse("minecraft:dropper"), () -> new DropperData(Block.DROPPER, 11230), () -> Item.DROPPER);

    public static final Block<BlockData> WHITE_TERRACOTTA = new Block<>(482, 11242, NamespacedKey.parse("minecraft:white_terracotta"), () -> new BlockData(Block.WHITE_TERRACOTTA, 11242), () -> Item.WHITE_TERRACOTTA);

    public static final Block<BlockData> ORANGE_TERRACOTTA = new Block<>(483, 11243, NamespacedKey.parse("minecraft:orange_terracotta"), () -> new BlockData(Block.ORANGE_TERRACOTTA, 11243), () -> Item.ORANGE_TERRACOTTA);

    public static final Block<BlockData> MAGENTA_TERRACOTTA = new Block<>(484, 11244, NamespacedKey.parse("minecraft:magenta_terracotta"), () -> new BlockData(Block.MAGENTA_TERRACOTTA, 11244), () -> Item.MAGENTA_TERRACOTTA);

    public static final Block<BlockData> LIGHT_BLUE_TERRACOTTA = new Block<>(485, 11245, NamespacedKey.parse("minecraft:light_blue_terracotta"), () -> new BlockData(Block.LIGHT_BLUE_TERRACOTTA, 11245), () -> Item.LIGHT_BLUE_TERRACOTTA);

    public static final Block<BlockData> YELLOW_TERRACOTTA = new Block<>(486, 11246, NamespacedKey.parse("minecraft:yellow_terracotta"), () -> new BlockData(Block.YELLOW_TERRACOTTA, 11246), () -> Item.YELLOW_TERRACOTTA);

    public static final Block<BlockData> LIME_TERRACOTTA = new Block<>(487, 11247, NamespacedKey.parse("minecraft:lime_terracotta"), () -> new BlockData(Block.LIME_TERRACOTTA, 11247), () -> Item.LIME_TERRACOTTA);

    public static final Block<BlockData> PINK_TERRACOTTA = new Block<>(488, 11248, NamespacedKey.parse("minecraft:pink_terracotta"), () -> new BlockData(Block.PINK_TERRACOTTA, 11248), () -> Item.PINK_TERRACOTTA);

    public static final Block<BlockData> GRAY_TERRACOTTA = new Block<>(489, 11249, NamespacedKey.parse("minecraft:gray_terracotta"), () -> new BlockData(Block.GRAY_TERRACOTTA, 11249), () -> Item.GRAY_TERRACOTTA);

    public static final Block<BlockData> LIGHT_GRAY_TERRACOTTA = new Block<>(490, 11250, NamespacedKey.parse("minecraft:light_gray_terracotta"), () -> new BlockData(Block.LIGHT_GRAY_TERRACOTTA, 11250), () -> Item.LIGHT_GRAY_TERRACOTTA);

    public static final Block<BlockData> CYAN_TERRACOTTA = new Block<>(491, 11251, NamespacedKey.parse("minecraft:cyan_terracotta"), () -> new BlockData(Block.CYAN_TERRACOTTA, 11251), () -> Item.CYAN_TERRACOTTA);

    public static final Block<BlockData> PURPLE_TERRACOTTA = new Block<>(492, 11252, NamespacedKey.parse("minecraft:purple_terracotta"), () -> new BlockData(Block.PURPLE_TERRACOTTA, 11252), () -> Item.PURPLE_TERRACOTTA);

    public static final Block<BlockData> BLUE_TERRACOTTA = new Block<>(493, 11253, NamespacedKey.parse("minecraft:blue_terracotta"), () -> new BlockData(Block.BLUE_TERRACOTTA, 11253), () -> Item.BLUE_TERRACOTTA);

    public static final Block<BlockData> BROWN_TERRACOTTA = new Block<>(494, 11254, NamespacedKey.parse("minecraft:brown_terracotta"), () -> new BlockData(Block.BROWN_TERRACOTTA, 11254), () -> Item.BROWN_TERRACOTTA);

    public static final Block<BlockData> GREEN_TERRACOTTA = new Block<>(495, 11255, NamespacedKey.parse("minecraft:green_terracotta"), () -> new BlockData(Block.GREEN_TERRACOTTA, 11255), () -> Item.GREEN_TERRACOTTA);

    public static final Block<BlockData> RED_TERRACOTTA = new Block<>(496, 11256, NamespacedKey.parse("minecraft:red_terracotta"), () -> new BlockData(Block.RED_TERRACOTTA, 11256), () -> Item.RED_TERRACOTTA);

    public static final Block<BlockData> BLACK_TERRACOTTA = new Block<>(497, 11257, NamespacedKey.parse("minecraft:black_terracotta"), () -> new BlockData(Block.BLACK_TERRACOTTA, 11257), () -> Item.BLACK_TERRACOTTA);

    public static final Block<StainedGlassPaneData> WHITE_STAINED_GLASS_PANE = new Block<>(498, 11258, NamespacedKey.parse("minecraft:white_stained_glass_pane"), () -> new StainedGlassPaneData(Block.WHITE_STAINED_GLASS_PANE, 11258), () -> Item.WHITE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> ORANGE_STAINED_GLASS_PANE = new Block<>(499, 11290, NamespacedKey.parse("minecraft:orange_stained_glass_pane"), () -> new StainedGlassPaneData(Block.ORANGE_STAINED_GLASS_PANE, 11290), () -> Item.ORANGE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> MAGENTA_STAINED_GLASS_PANE = new Block<>(500, 11322, NamespacedKey.parse("minecraft:magenta_stained_glass_pane"), () -> new StainedGlassPaneData(Block.MAGENTA_STAINED_GLASS_PANE, 11322), () -> Item.MAGENTA_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> LIGHT_BLUE_STAINED_GLASS_PANE = new Block<>(501, 11354, NamespacedKey.parse("minecraft:light_blue_stained_glass_pane"), () -> new StainedGlassPaneData(Block.LIGHT_BLUE_STAINED_GLASS_PANE, 11354), () -> Item.LIGHT_BLUE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> YELLOW_STAINED_GLASS_PANE = new Block<>(502, 11386, NamespacedKey.parse("minecraft:yellow_stained_glass_pane"), () -> new StainedGlassPaneData(Block.YELLOW_STAINED_GLASS_PANE, 11386), () -> Item.YELLOW_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> LIME_STAINED_GLASS_PANE = new Block<>(503, 11418, NamespacedKey.parse("minecraft:lime_stained_glass_pane"), () -> new StainedGlassPaneData(Block.LIME_STAINED_GLASS_PANE, 11418), () -> Item.LIME_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> PINK_STAINED_GLASS_PANE = new Block<>(504, 11450, NamespacedKey.parse("minecraft:pink_stained_glass_pane"), () -> new StainedGlassPaneData(Block.PINK_STAINED_GLASS_PANE, 11450), () -> Item.PINK_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> GRAY_STAINED_GLASS_PANE = new Block<>(505, 11482, NamespacedKey.parse("minecraft:gray_stained_glass_pane"), () -> new StainedGlassPaneData(Block.GRAY_STAINED_GLASS_PANE, 11482), () -> Item.GRAY_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> LIGHT_GRAY_STAINED_GLASS_PANE = new Block<>(506, 11514, NamespacedKey.parse("minecraft:light_gray_stained_glass_pane"), () -> new StainedGlassPaneData(Block.LIGHT_GRAY_STAINED_GLASS_PANE, 11514), () -> Item.LIGHT_GRAY_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> CYAN_STAINED_GLASS_PANE = new Block<>(507, 11546, NamespacedKey.parse("minecraft:cyan_stained_glass_pane"), () -> new StainedGlassPaneData(Block.CYAN_STAINED_GLASS_PANE, 11546), () -> Item.CYAN_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> PURPLE_STAINED_GLASS_PANE = new Block<>(508, 11578, NamespacedKey.parse("minecraft:purple_stained_glass_pane"), () -> new StainedGlassPaneData(Block.PURPLE_STAINED_GLASS_PANE, 11578), () -> Item.PURPLE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> BLUE_STAINED_GLASS_PANE = new Block<>(509, 11610, NamespacedKey.parse("minecraft:blue_stained_glass_pane"), () -> new StainedGlassPaneData(Block.BLUE_STAINED_GLASS_PANE, 11610), () -> Item.BLUE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> BROWN_STAINED_GLASS_PANE = new Block<>(510, 11642, NamespacedKey.parse("minecraft:brown_stained_glass_pane"), () -> new StainedGlassPaneData(Block.BROWN_STAINED_GLASS_PANE, 11642), () -> Item.BROWN_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> GREEN_STAINED_GLASS_PANE = new Block<>(511, 11674, NamespacedKey.parse("minecraft:green_stained_glass_pane"), () -> new StainedGlassPaneData(Block.GREEN_STAINED_GLASS_PANE, 11674), () -> Item.GREEN_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> RED_STAINED_GLASS_PANE = new Block<>(512, 11706, NamespacedKey.parse("minecraft:red_stained_glass_pane"), () -> new StainedGlassPaneData(Block.RED_STAINED_GLASS_PANE, 11706), () -> Item.RED_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> BLACK_STAINED_GLASS_PANE = new Block<>(513, 11738, NamespacedKey.parse("minecraft:black_stained_glass_pane"), () -> new StainedGlassPaneData(Block.BLACK_STAINED_GLASS_PANE, 11738), () -> Item.BLACK_STAINED_GLASS_PANE);

    public static final Block<StairData> ACACIA_STAIRS = new Block<>(514, 11770, NamespacedKey.parse("minecraft:acacia_stairs"), () -> new StairData(Block.ACACIA_STAIRS, 11770), () -> Item.ACACIA_STAIRS);

    public static final Block<StairData> CHERRY_STAIRS = new Block<>(515, 11850, NamespacedKey.parse("minecraft:cherry_stairs"), () -> new StairData(Block.CHERRY_STAIRS, 11850), () -> Item.CHERRY_STAIRS);

    public static final Block<StairData> DARK_OAK_STAIRS = new Block<>(516, 11930, NamespacedKey.parse("minecraft:dark_oak_stairs"), () -> new StairData(Block.DARK_OAK_STAIRS, 11930), () -> Item.DARK_OAK_STAIRS);

    public static final Block<StairData> PALE_OAK_STAIRS = new Block<>(517, 12010, NamespacedKey.parse("minecraft:pale_oak_stairs"), () -> new StairData(Block.PALE_OAK_STAIRS, 12010), () -> Item.PALE_OAK_STAIRS);

    public static final Block<StairData> MANGROVE_STAIRS = new Block<>(518, 12090, NamespacedKey.parse("minecraft:mangrove_stairs"), () -> new StairData(Block.MANGROVE_STAIRS, 12090), () -> Item.MANGROVE_STAIRS);

    public static final Block<StairData> BAMBOO_STAIRS = new Block<>(519, 12170, NamespacedKey.parse("minecraft:bamboo_stairs"), () -> new StairData(Block.BAMBOO_STAIRS, 12170), () -> Item.BAMBOO_STAIRS);

    public static final Block<StairData> BAMBOO_MOSAIC_STAIRS = new Block<>(520, 12250, NamespacedKey.parse("minecraft:bamboo_mosaic_stairs"), () -> new StairData(Block.BAMBOO_MOSAIC_STAIRS, 12250), () -> Item.BAMBOO_MOSAIC_STAIRS);

    public static final Block<BlockData> SLIME_BLOCK = new Block<>(521, 12330, NamespacedKey.parse("minecraft:slime_block"), () -> new BlockData(Block.SLIME_BLOCK, 12330), () -> Item.SLIME_BLOCK);

    public static final Block<BarrierData> BARRIER = new Block<>(522, 12331, NamespacedKey.parse("minecraft:barrier"), () -> new BarrierData(Block.BARRIER, 12331), () -> Item.BARRIER);

    public static final Block<LightData> LIGHT = new Block<>(523, 12333, NamespacedKey.parse("minecraft:light"), () -> new LightData(Block.LIGHT, 12333), () -> Item.LIGHT);

    public static final Block<TrapdoorData> IRON_TRAPDOOR = new Block<>(524, 12365, NamespacedKey.parse("minecraft:iron_trapdoor"), () -> new TrapdoorData(Block.IRON_TRAPDOOR, 12365), () -> Item.IRON_TRAPDOOR);

    public static final Block<BlockData> PRISMARINE = new Block<>(525, 12429, NamespacedKey.parse("minecraft:prismarine"), () -> new BlockData(Block.PRISMARINE, 12429), () -> Item.PRISMARINE);

    public static final Block<BlockData> PRISMARINE_BRICKS = new Block<>(526, 12430, NamespacedKey.parse("minecraft:prismarine_bricks"), () -> new BlockData(Block.PRISMARINE_BRICKS, 12430), () -> Item.PRISMARINE_BRICKS);

    public static final Block<BlockData> DARK_PRISMARINE = new Block<>(527, 12431, NamespacedKey.parse("minecraft:dark_prismarine"), () -> new BlockData(Block.DARK_PRISMARINE, 12431), () -> Item.DARK_PRISMARINE);

    public static final Block<StairData> PRISMARINE_STAIRS = new Block<>(528, 12432, NamespacedKey.parse("minecraft:prismarine_stairs"), () -> new StairData(Block.PRISMARINE_STAIRS, 12432), () -> Item.PRISMARINE_STAIRS);

    public static final Block<StairData> PRISMARINE_BRICK_STAIRS = new Block<>(529, 12512, NamespacedKey.parse("minecraft:prismarine_brick_stairs"), () -> new StairData(Block.PRISMARINE_BRICK_STAIRS, 12512), () -> Item.PRISMARINE_BRICK_STAIRS);

    public static final Block<StairData> DARK_PRISMARINE_STAIRS = new Block<>(530, 12592, NamespacedKey.parse("minecraft:dark_prismarine_stairs"), () -> new StairData(Block.DARK_PRISMARINE_STAIRS, 12592), () -> Item.DARK_PRISMARINE_STAIRS);

    public static final Block<SlabData> PRISMARINE_SLAB = new Block<>(531, 12672, NamespacedKey.parse("minecraft:prismarine_slab"), () -> new SlabData(Block.PRISMARINE_SLAB, 12672), () -> Item.PRISMARINE_SLAB);

    public static final Block<SlabData> PRISMARINE_BRICK_SLAB = new Block<>(532, 12678, NamespacedKey.parse("minecraft:prismarine_brick_slab"), () -> new SlabData(Block.PRISMARINE_BRICK_SLAB, 12678), () -> Item.PRISMARINE_BRICK_SLAB);

    public static final Block<SlabData> DARK_PRISMARINE_SLAB = new Block<>(533, 12684, NamespacedKey.parse("minecraft:dark_prismarine_slab"), () -> new SlabData(Block.DARK_PRISMARINE_SLAB, 12684), () -> Item.DARK_PRISMARINE_SLAB);

    public static final Block<BlockData> SEA_LANTERN = new Block<>(534, 12690, NamespacedKey.parse("minecraft:sea_lantern"), () -> new BlockData(Block.SEA_LANTERN, 12690), () -> Item.SEA_LANTERN);

    public static final Block<HayData> HAY_BLOCK = new Block<>(535, 12691, NamespacedKey.parse("minecraft:hay_block"), () -> new HayData(Block.HAY_BLOCK, 12691), () -> Item.HAY_BLOCK);

    public static final Block<BlockData> WHITE_CARPET = new Block<>(536, 12694, NamespacedKey.parse("minecraft:white_carpet"), () -> new BlockData(Block.WHITE_CARPET, 12694), () -> Item.WHITE_CARPET);

    public static final Block<BlockData> ORANGE_CARPET = new Block<>(537, 12695, NamespacedKey.parse("minecraft:orange_carpet"), () -> new BlockData(Block.ORANGE_CARPET, 12695), () -> Item.ORANGE_CARPET);

    public static final Block<BlockData> MAGENTA_CARPET = new Block<>(538, 12696, NamespacedKey.parse("minecraft:magenta_carpet"), () -> new BlockData(Block.MAGENTA_CARPET, 12696), () -> Item.MAGENTA_CARPET);

    public static final Block<BlockData> LIGHT_BLUE_CARPET = new Block<>(539, 12697, NamespacedKey.parse("minecraft:light_blue_carpet"), () -> new BlockData(Block.LIGHT_BLUE_CARPET, 12697), () -> Item.LIGHT_BLUE_CARPET);

    public static final Block<BlockData> YELLOW_CARPET = new Block<>(540, 12698, NamespacedKey.parse("minecraft:yellow_carpet"), () -> new BlockData(Block.YELLOW_CARPET, 12698), () -> Item.YELLOW_CARPET);

    public static final Block<BlockData> LIME_CARPET = new Block<>(541, 12699, NamespacedKey.parse("minecraft:lime_carpet"), () -> new BlockData(Block.LIME_CARPET, 12699), () -> Item.LIME_CARPET);

    public static final Block<BlockData> PINK_CARPET = new Block<>(542, 12700, NamespacedKey.parse("minecraft:pink_carpet"), () -> new BlockData(Block.PINK_CARPET, 12700), () -> Item.PINK_CARPET);

    public static final Block<BlockData> GRAY_CARPET = new Block<>(543, 12701, NamespacedKey.parse("minecraft:gray_carpet"), () -> new BlockData(Block.GRAY_CARPET, 12701), () -> Item.GRAY_CARPET);

    public static final Block<BlockData> LIGHT_GRAY_CARPET = new Block<>(544, 12702, NamespacedKey.parse("minecraft:light_gray_carpet"), () -> new BlockData(Block.LIGHT_GRAY_CARPET, 12702), () -> Item.LIGHT_GRAY_CARPET);

    public static final Block<BlockData> CYAN_CARPET = new Block<>(545, 12703, NamespacedKey.parse("minecraft:cyan_carpet"), () -> new BlockData(Block.CYAN_CARPET, 12703), () -> Item.CYAN_CARPET);

    public static final Block<BlockData> PURPLE_CARPET = new Block<>(546, 12704, NamespacedKey.parse("minecraft:purple_carpet"), () -> new BlockData(Block.PURPLE_CARPET, 12704), () -> Item.PURPLE_CARPET);

    public static final Block<BlockData> BLUE_CARPET = new Block<>(547, 12705, NamespacedKey.parse("minecraft:blue_carpet"), () -> new BlockData(Block.BLUE_CARPET, 12705), () -> Item.BLUE_CARPET);

    public static final Block<BlockData> BROWN_CARPET = new Block<>(548, 12706, NamespacedKey.parse("minecraft:brown_carpet"), () -> new BlockData(Block.BROWN_CARPET, 12706), () -> Item.BROWN_CARPET);

    public static final Block<BlockData> GREEN_CARPET = new Block<>(549, 12707, NamespacedKey.parse("minecraft:green_carpet"), () -> new BlockData(Block.GREEN_CARPET, 12707), () -> Item.GREEN_CARPET);

    public static final Block<BlockData> RED_CARPET = new Block<>(550, 12708, NamespacedKey.parse("minecraft:red_carpet"), () -> new BlockData(Block.RED_CARPET, 12708), () -> Item.RED_CARPET);

    public static final Block<BlockData> BLACK_CARPET = new Block<>(551, 12709, NamespacedKey.parse("minecraft:black_carpet"), () -> new BlockData(Block.BLACK_CARPET, 12709), () -> Item.BLACK_CARPET);

    public static final Block<BlockData> TERRACOTTA = new Block<>(552, 12710, NamespacedKey.parse("minecraft:terracotta"), () -> new BlockData(Block.TERRACOTTA, 12710), () -> Item.TERRACOTTA);

    public static final Block<BlockData> COAL_BLOCK = new Block<>(553, 12711, NamespacedKey.parse("minecraft:coal_block"), () -> new BlockData(Block.COAL_BLOCK, 12711), () -> Item.COAL_BLOCK);

    public static final Block<BlockData> PACKED_ICE = new Block<>(554, 12712, NamespacedKey.parse("minecraft:packed_ice"), () -> new BlockData(Block.PACKED_ICE, 12712), () -> Item.PACKED_ICE);

    public static final Block<TallFlowerData> SUNFLOWER = new Block<>(555, 12713, NamespacedKey.parse("minecraft:sunflower"), () -> new TallFlowerData(Block.SUNFLOWER, 12713), () -> Item.SUNFLOWER);

    public static final Block<TallFlowerData> LILAC = new Block<>(556, 12715, NamespacedKey.parse("minecraft:lilac"), () -> new TallFlowerData(Block.LILAC, 12715), () -> Item.LILAC);

    public static final Block<TallFlowerData> ROSE_BUSH = new Block<>(557, 12717, NamespacedKey.parse("minecraft:rose_bush"), () -> new TallFlowerData(Block.ROSE_BUSH, 12717), () -> Item.ROSE_BUSH);

    public static final Block<TallFlowerData> PEONY = new Block<>(558, 12719, NamespacedKey.parse("minecraft:peony"), () -> new TallFlowerData(Block.PEONY, 12719), () -> Item.PEONY);

    public static final Block<DoublePlantData> TALL_GRASS = new Block<>(559, 12721, NamespacedKey.parse("minecraft:tall_grass"), () -> new DoublePlantData(Block.TALL_GRASS, 12721), () -> Item.TALL_GRASS);

    public static final Block<DoublePlantData> LARGE_FERN = new Block<>(560, 12723, NamespacedKey.parse("minecraft:large_fern"), () -> new DoublePlantData(Block.LARGE_FERN, 12723), () -> Item.LARGE_FERN);

    public static final Block<BannerData> WHITE_BANNER = new Block<>(561, 12725, NamespacedKey.parse("minecraft:white_banner"), () -> new BannerData(Block.WHITE_BANNER, 12725), () -> Item.WHITE_BANNER);

    public static final Block<BannerData> ORANGE_BANNER = new Block<>(562, 12741, NamespacedKey.parse("minecraft:orange_banner"), () -> new BannerData(Block.ORANGE_BANNER, 12741), () -> Item.ORANGE_BANNER);

    public static final Block<BannerData> MAGENTA_BANNER = new Block<>(563, 12757, NamespacedKey.parse("minecraft:magenta_banner"), () -> new BannerData(Block.MAGENTA_BANNER, 12757), () -> Item.MAGENTA_BANNER);

    public static final Block<BannerData> LIGHT_BLUE_BANNER = new Block<>(564, 12773, NamespacedKey.parse("minecraft:light_blue_banner"), () -> new BannerData(Block.LIGHT_BLUE_BANNER, 12773), () -> Item.LIGHT_BLUE_BANNER);

    public static final Block<BannerData> YELLOW_BANNER = new Block<>(565, 12789, NamespacedKey.parse("minecraft:yellow_banner"), () -> new BannerData(Block.YELLOW_BANNER, 12789), () -> Item.YELLOW_BANNER);

    public static final Block<BannerData> LIME_BANNER = new Block<>(566, 12805, NamespacedKey.parse("minecraft:lime_banner"), () -> new BannerData(Block.LIME_BANNER, 12805), () -> Item.LIME_BANNER);

    public static final Block<BannerData> PINK_BANNER = new Block<>(567, 12821, NamespacedKey.parse("minecraft:pink_banner"), () -> new BannerData(Block.PINK_BANNER, 12821), () -> Item.PINK_BANNER);

    public static final Block<BannerData> GRAY_BANNER = new Block<>(568, 12837, NamespacedKey.parse("minecraft:gray_banner"), () -> new BannerData(Block.GRAY_BANNER, 12837), () -> Item.GRAY_BANNER);

    public static final Block<BannerData> LIGHT_GRAY_BANNER = new Block<>(569, 12853, NamespacedKey.parse("minecraft:light_gray_banner"), () -> new BannerData(Block.LIGHT_GRAY_BANNER, 12853), () -> Item.LIGHT_GRAY_BANNER);

    public static final Block<BannerData> CYAN_BANNER = new Block<>(570, 12869, NamespacedKey.parse("minecraft:cyan_banner"), () -> new BannerData(Block.CYAN_BANNER, 12869), () -> Item.CYAN_BANNER);

    public static final Block<BannerData> PURPLE_BANNER = new Block<>(571, 12885, NamespacedKey.parse("minecraft:purple_banner"), () -> new BannerData(Block.PURPLE_BANNER, 12885), () -> Item.PURPLE_BANNER);

    public static final Block<BannerData> BLUE_BANNER = new Block<>(572, 12901, NamespacedKey.parse("minecraft:blue_banner"), () -> new BannerData(Block.BLUE_BANNER, 12901), () -> Item.BLUE_BANNER);

    public static final Block<BannerData> BROWN_BANNER = new Block<>(573, 12917, NamespacedKey.parse("minecraft:brown_banner"), () -> new BannerData(Block.BROWN_BANNER, 12917), () -> Item.BROWN_BANNER);

    public static final Block<BannerData> GREEN_BANNER = new Block<>(574, 12933, NamespacedKey.parse("minecraft:green_banner"), () -> new BannerData(Block.GREEN_BANNER, 12933), () -> Item.GREEN_BANNER);

    public static final Block<BannerData> RED_BANNER = new Block<>(575, 12949, NamespacedKey.parse("minecraft:red_banner"), () -> new BannerData(Block.RED_BANNER, 12949), () -> Item.RED_BANNER);

    public static final Block<BannerData> BLACK_BANNER = new Block<>(576, 12965, NamespacedKey.parse("minecraft:black_banner"), () -> new BannerData(Block.BLACK_BANNER, 12965), () -> Item.BLACK_BANNER);

    public static final Block<WallBannerData> WHITE_WALL_BANNER = new Block<>(577, 12981, NamespacedKey.parse("minecraft:white_wall_banner"), () -> new WallBannerData(Block.WHITE_WALL_BANNER, 12981), null);

    public static final Block<WallBannerData> ORANGE_WALL_BANNER = new Block<>(578, 12985, NamespacedKey.parse("minecraft:orange_wall_banner"), () -> new WallBannerData(Block.ORANGE_WALL_BANNER, 12985), null);

    public static final Block<WallBannerData> MAGENTA_WALL_BANNER = new Block<>(579, 12989, NamespacedKey.parse("minecraft:magenta_wall_banner"), () -> new WallBannerData(Block.MAGENTA_WALL_BANNER, 12989), null);

    public static final Block<WallBannerData> LIGHT_BLUE_WALL_BANNER = new Block<>(580, 12993, NamespacedKey.parse("minecraft:light_blue_wall_banner"), () -> new WallBannerData(Block.LIGHT_BLUE_WALL_BANNER, 12993), null);

    public static final Block<WallBannerData> YELLOW_WALL_BANNER = new Block<>(581, 12997, NamespacedKey.parse("minecraft:yellow_wall_banner"), () -> new WallBannerData(Block.YELLOW_WALL_BANNER, 12997), null);

    public static final Block<WallBannerData> LIME_WALL_BANNER = new Block<>(582, 13001, NamespacedKey.parse("minecraft:lime_wall_banner"), () -> new WallBannerData(Block.LIME_WALL_BANNER, 13001), null);

    public static final Block<WallBannerData> PINK_WALL_BANNER = new Block<>(583, 13005, NamespacedKey.parse("minecraft:pink_wall_banner"), () -> new WallBannerData(Block.PINK_WALL_BANNER, 13005), null);

    public static final Block<WallBannerData> GRAY_WALL_BANNER = new Block<>(584, 13009, NamespacedKey.parse("minecraft:gray_wall_banner"), () -> new WallBannerData(Block.GRAY_WALL_BANNER, 13009), null);

    public static final Block<WallBannerData> LIGHT_GRAY_WALL_BANNER = new Block<>(585, 13013, NamespacedKey.parse("minecraft:light_gray_wall_banner"), () -> new WallBannerData(Block.LIGHT_GRAY_WALL_BANNER, 13013), null);

    public static final Block<WallBannerData> CYAN_WALL_BANNER = new Block<>(586, 13017, NamespacedKey.parse("minecraft:cyan_wall_banner"), () -> new WallBannerData(Block.CYAN_WALL_BANNER, 13017), null);

    public static final Block<WallBannerData> PURPLE_WALL_BANNER = new Block<>(587, 13021, NamespacedKey.parse("minecraft:purple_wall_banner"), () -> new WallBannerData(Block.PURPLE_WALL_BANNER, 13021), null);

    public static final Block<WallBannerData> BLUE_WALL_BANNER = new Block<>(588, 13025, NamespacedKey.parse("minecraft:blue_wall_banner"), () -> new WallBannerData(Block.BLUE_WALL_BANNER, 13025), null);

    public static final Block<WallBannerData> BROWN_WALL_BANNER = new Block<>(589, 13029, NamespacedKey.parse("minecraft:brown_wall_banner"), () -> new WallBannerData(Block.BROWN_WALL_BANNER, 13029), null);

    public static final Block<WallBannerData> GREEN_WALL_BANNER = new Block<>(590, 13033, NamespacedKey.parse("minecraft:green_wall_banner"), () -> new WallBannerData(Block.GREEN_WALL_BANNER, 13033), null);

    public static final Block<WallBannerData> RED_WALL_BANNER = new Block<>(591, 13037, NamespacedKey.parse("minecraft:red_wall_banner"), () -> new WallBannerData(Block.RED_WALL_BANNER, 13037), null);

    public static final Block<WallBannerData> BLACK_WALL_BANNER = new Block<>(592, 13041, NamespacedKey.parse("minecraft:black_wall_banner"), () -> new WallBannerData(Block.BLACK_WALL_BANNER, 13041), null);

    public static final Block<BlockData> RED_SANDSTONE = new Block<>(593, 13045, NamespacedKey.parse("minecraft:red_sandstone"), () -> new BlockData(Block.RED_SANDSTONE, 13045), () -> Item.RED_SANDSTONE);

    public static final Block<BlockData> CHISELED_RED_SANDSTONE = new Block<>(594, 13046, NamespacedKey.parse("minecraft:chiseled_red_sandstone"), () -> new BlockData(Block.CHISELED_RED_SANDSTONE, 13046), () -> Item.CHISELED_RED_SANDSTONE);

    public static final Block<BlockData> CUT_RED_SANDSTONE = new Block<>(595, 13047, NamespacedKey.parse("minecraft:cut_red_sandstone"), () -> new BlockData(Block.CUT_RED_SANDSTONE, 13047), () -> Item.CUT_RED_SANDSTONE);

    public static final Block<StairData> RED_SANDSTONE_STAIRS = new Block<>(596, 13048, NamespacedKey.parse("minecraft:red_sandstone_stairs"), () -> new StairData(Block.RED_SANDSTONE_STAIRS, 13048), () -> Item.RED_SANDSTONE_STAIRS);

    public static final Block<SlabData> OAK_SLAB = new Block<>(597, 13128, NamespacedKey.parse("minecraft:oak_slab"), () -> new SlabData(Block.OAK_SLAB, 13128), () -> Item.OAK_SLAB);

    public static final Block<SlabData> SPRUCE_SLAB = new Block<>(598, 13134, NamespacedKey.parse("minecraft:spruce_slab"), () -> new SlabData(Block.SPRUCE_SLAB, 13134), () -> Item.SPRUCE_SLAB);

    public static final Block<SlabData> BIRCH_SLAB = new Block<>(599, 13140, NamespacedKey.parse("minecraft:birch_slab"), () -> new SlabData(Block.BIRCH_SLAB, 13140), () -> Item.BIRCH_SLAB);

    public static final Block<SlabData> JUNGLE_SLAB = new Block<>(600, 13146, NamespacedKey.parse("minecraft:jungle_slab"), () -> new SlabData(Block.JUNGLE_SLAB, 13146), () -> Item.JUNGLE_SLAB);

    public static final Block<SlabData> ACACIA_SLAB = new Block<>(601, 13152, NamespacedKey.parse("minecraft:acacia_slab"), () -> new SlabData(Block.ACACIA_SLAB, 13152), () -> Item.ACACIA_SLAB);

    public static final Block<SlabData> CHERRY_SLAB = new Block<>(602, 13158, NamespacedKey.parse("minecraft:cherry_slab"), () -> new SlabData(Block.CHERRY_SLAB, 13158), () -> Item.CHERRY_SLAB);

    public static final Block<SlabData> DARK_OAK_SLAB = new Block<>(603, 13164, NamespacedKey.parse("minecraft:dark_oak_slab"), () -> new SlabData(Block.DARK_OAK_SLAB, 13164), () -> Item.DARK_OAK_SLAB);

    public static final Block<SlabData> PALE_OAK_SLAB = new Block<>(604, 13170, NamespacedKey.parse("minecraft:pale_oak_slab"), () -> new SlabData(Block.PALE_OAK_SLAB, 13170), () -> Item.PALE_OAK_SLAB);

    public static final Block<SlabData> MANGROVE_SLAB = new Block<>(605, 13176, NamespacedKey.parse("minecraft:mangrove_slab"), () -> new SlabData(Block.MANGROVE_SLAB, 13176), () -> Item.MANGROVE_SLAB);

    public static final Block<SlabData> BAMBOO_SLAB = new Block<>(606, 13182, NamespacedKey.parse("minecraft:bamboo_slab"), () -> new SlabData(Block.BAMBOO_SLAB, 13182), () -> Item.BAMBOO_SLAB);

    public static final Block<SlabData> BAMBOO_MOSAIC_SLAB = new Block<>(607, 13188, NamespacedKey.parse("minecraft:bamboo_mosaic_slab"), () -> new SlabData(Block.BAMBOO_MOSAIC_SLAB, 13188), () -> Item.BAMBOO_MOSAIC_SLAB);

    public static final Block<SlabData> STONE_SLAB = new Block<>(608, 13194, NamespacedKey.parse("minecraft:stone_slab"), () -> new SlabData(Block.STONE_SLAB, 13194), () -> Item.STONE_SLAB);

    public static final Block<SlabData> SMOOTH_STONE_SLAB = new Block<>(609, 13200, NamespacedKey.parse("minecraft:smooth_stone_slab"), () -> new SlabData(Block.SMOOTH_STONE_SLAB, 13200), () -> Item.SMOOTH_STONE_SLAB);

    public static final Block<SlabData> SANDSTONE_SLAB = new Block<>(610, 13206, NamespacedKey.parse("minecraft:sandstone_slab"), () -> new SlabData(Block.SANDSTONE_SLAB, 13206), () -> Item.SANDSTONE_SLAB);

    public static final Block<SlabData> CUT_SANDSTONE_SLAB = new Block<>(611, 13212, NamespacedKey.parse("minecraft:cut_sandstone_slab"), () -> new SlabData(Block.CUT_SANDSTONE_SLAB, 13212), () -> Item.CUT_SANDSTONE_SLAB);

    public static final Block<SlabData> PETRIFIED_OAK_SLAB = new Block<>(612, 13218, NamespacedKey.parse("minecraft:petrified_oak_slab"), () -> new SlabData(Block.PETRIFIED_OAK_SLAB, 13218), () -> Item.PETRIFIED_OAK_SLAB);

    public static final Block<SlabData> COBBLESTONE_SLAB = new Block<>(613, 13224, NamespacedKey.parse("minecraft:cobblestone_slab"), () -> new SlabData(Block.COBBLESTONE_SLAB, 13224), () -> Item.COBBLESTONE_SLAB);

    public static final Block<SlabData> BRICK_SLAB = new Block<>(614, 13230, NamespacedKey.parse("minecraft:brick_slab"), () -> new SlabData(Block.BRICK_SLAB, 13230), () -> Item.BRICK_SLAB);

    public static final Block<SlabData> STONE_BRICK_SLAB = new Block<>(615, 13236, NamespacedKey.parse("minecraft:stone_brick_slab"), () -> new SlabData(Block.STONE_BRICK_SLAB, 13236), () -> Item.STONE_BRICK_SLAB);

    public static final Block<SlabData> MUD_BRICK_SLAB = new Block<>(616, 13242, NamespacedKey.parse("minecraft:mud_brick_slab"), () -> new SlabData(Block.MUD_BRICK_SLAB, 13242), () -> Item.MUD_BRICK_SLAB);

    public static final Block<SlabData> NETHER_BRICK_SLAB = new Block<>(617, 13248, NamespacedKey.parse("minecraft:nether_brick_slab"), () -> new SlabData(Block.NETHER_BRICK_SLAB, 13248), () -> Item.NETHER_BRICK_SLAB);

    public static final Block<SlabData> QUARTZ_SLAB = new Block<>(618, 13254, NamespacedKey.parse("minecraft:quartz_slab"), () -> new SlabData(Block.QUARTZ_SLAB, 13254), () -> Item.QUARTZ_SLAB);

    public static final Block<SlabData> RED_SANDSTONE_SLAB = new Block<>(619, 13260, NamespacedKey.parse("minecraft:red_sandstone_slab"), () -> new SlabData(Block.RED_SANDSTONE_SLAB, 13260), () -> Item.RED_SANDSTONE_SLAB);

    public static final Block<SlabData> CUT_RED_SANDSTONE_SLAB = new Block<>(620, 13266, NamespacedKey.parse("minecraft:cut_red_sandstone_slab"), () -> new SlabData(Block.CUT_RED_SANDSTONE_SLAB, 13266), () -> Item.CUT_RED_SANDSTONE_SLAB);

    public static final Block<SlabData> PURPUR_SLAB = new Block<>(621, 13272, NamespacedKey.parse("minecraft:purpur_slab"), () -> new SlabData(Block.PURPUR_SLAB, 13272), () -> Item.PURPUR_SLAB);

    public static final Block<BlockData> SMOOTH_STONE = new Block<>(622, 13278, NamespacedKey.parse("minecraft:smooth_stone"), () -> new BlockData(Block.SMOOTH_STONE, 13278), () -> Item.SMOOTH_STONE);

    public static final Block<BlockData> SMOOTH_SANDSTONE = new Block<>(623, 13279, NamespacedKey.parse("minecraft:smooth_sandstone"), () -> new BlockData(Block.SMOOTH_SANDSTONE, 13279), () -> Item.SMOOTH_SANDSTONE);

    public static final Block<BlockData> SMOOTH_QUARTZ = new Block<>(624, 13280, NamespacedKey.parse("minecraft:smooth_quartz"), () -> new BlockData(Block.SMOOTH_QUARTZ, 13280), () -> Item.SMOOTH_QUARTZ);

    public static final Block<BlockData> SMOOTH_RED_SANDSTONE = new Block<>(625, 13281, NamespacedKey.parse("minecraft:smooth_red_sandstone"), () -> new BlockData(Block.SMOOTH_RED_SANDSTONE, 13281), () -> Item.SMOOTH_RED_SANDSTONE);

    public static final Block<FenceGateData> SPRUCE_FENCE_GATE = new Block<>(626, 13282, NamespacedKey.parse("minecraft:spruce_fence_gate"), () -> new FenceGateData(Block.SPRUCE_FENCE_GATE, 13282), () -> Item.SPRUCE_FENCE_GATE);

    public static final Block<FenceGateData> BIRCH_FENCE_GATE = new Block<>(627, 13314, NamespacedKey.parse("minecraft:birch_fence_gate"), () -> new FenceGateData(Block.BIRCH_FENCE_GATE, 13314), () -> Item.BIRCH_FENCE_GATE);

    public static final Block<FenceGateData> JUNGLE_FENCE_GATE = new Block<>(628, 13346, NamespacedKey.parse("minecraft:jungle_fence_gate"), () -> new FenceGateData(Block.JUNGLE_FENCE_GATE, 13346), () -> Item.JUNGLE_FENCE_GATE);

    public static final Block<FenceGateData> ACACIA_FENCE_GATE = new Block<>(629, 13378, NamespacedKey.parse("minecraft:acacia_fence_gate"), () -> new FenceGateData(Block.ACACIA_FENCE_GATE, 13378), () -> Item.ACACIA_FENCE_GATE);

    public static final Block<FenceGateData> CHERRY_FENCE_GATE = new Block<>(630, 13410, NamespacedKey.parse("minecraft:cherry_fence_gate"), () -> new FenceGateData(Block.CHERRY_FENCE_GATE, 13410), () -> Item.CHERRY_FENCE_GATE);

    public static final Block<FenceGateData> DARK_OAK_FENCE_GATE = new Block<>(631, 13442, NamespacedKey.parse("minecraft:dark_oak_fence_gate"), () -> new FenceGateData(Block.DARK_OAK_FENCE_GATE, 13442), () -> Item.DARK_OAK_FENCE_GATE);

    public static final Block<FenceGateData> PALE_OAK_FENCE_GATE = new Block<>(632, 13474, NamespacedKey.parse("minecraft:pale_oak_fence_gate"), () -> new FenceGateData(Block.PALE_OAK_FENCE_GATE, 13474), () -> Item.PALE_OAK_FENCE_GATE);

    public static final Block<FenceGateData> MANGROVE_FENCE_GATE = new Block<>(633, 13506, NamespacedKey.parse("minecraft:mangrove_fence_gate"), () -> new FenceGateData(Block.MANGROVE_FENCE_GATE, 13506), () -> Item.MANGROVE_FENCE_GATE);

    public static final Block<FenceGateData> BAMBOO_FENCE_GATE = new Block<>(634, 13538, NamespacedKey.parse("minecraft:bamboo_fence_gate"), () -> new FenceGateData(Block.BAMBOO_FENCE_GATE, 13538), () -> Item.BAMBOO_FENCE_GATE);

    public static final Block<FenceData> SPRUCE_FENCE = new Block<>(635, 13570, NamespacedKey.parse("minecraft:spruce_fence"), () -> new FenceData(Block.SPRUCE_FENCE, 13570), () -> Item.SPRUCE_FENCE);

    public static final Block<FenceData> BIRCH_FENCE = new Block<>(636, 13602, NamespacedKey.parse("minecraft:birch_fence"), () -> new FenceData(Block.BIRCH_FENCE, 13602), () -> Item.BIRCH_FENCE);

    public static final Block<FenceData> JUNGLE_FENCE = new Block<>(637, 13634, NamespacedKey.parse("minecraft:jungle_fence"), () -> new FenceData(Block.JUNGLE_FENCE, 13634), () -> Item.JUNGLE_FENCE);

    public static final Block<FenceData> ACACIA_FENCE = new Block<>(638, 13666, NamespacedKey.parse("minecraft:acacia_fence"), () -> new FenceData(Block.ACACIA_FENCE, 13666), () -> Item.ACACIA_FENCE);

    public static final Block<FenceData> CHERRY_FENCE = new Block<>(639, 13698, NamespacedKey.parse("minecraft:cherry_fence"), () -> new FenceData(Block.CHERRY_FENCE, 13698), () -> Item.CHERRY_FENCE);

    public static final Block<FenceData> DARK_OAK_FENCE = new Block<>(640, 13730, NamespacedKey.parse("minecraft:dark_oak_fence"), () -> new FenceData(Block.DARK_OAK_FENCE, 13730), () -> Item.DARK_OAK_FENCE);

    public static final Block<FenceData> PALE_OAK_FENCE = new Block<>(641, 13762, NamespacedKey.parse("minecraft:pale_oak_fence"), () -> new FenceData(Block.PALE_OAK_FENCE, 13762), () -> Item.PALE_OAK_FENCE);

    public static final Block<FenceData> MANGROVE_FENCE = new Block<>(642, 13794, NamespacedKey.parse("minecraft:mangrove_fence"), () -> new FenceData(Block.MANGROVE_FENCE, 13794), () -> Item.MANGROVE_FENCE);

    public static final Block<FenceData> BAMBOO_FENCE = new Block<>(643, 13826, NamespacedKey.parse("minecraft:bamboo_fence"), () -> new FenceData(Block.BAMBOO_FENCE, 13826), () -> Item.BAMBOO_FENCE);

    public static final Block<DoorData> SPRUCE_DOOR = new Block<>(644, 13858, NamespacedKey.parse("minecraft:spruce_door"), () -> new DoorData(Block.SPRUCE_DOOR, 13858), () -> Item.SPRUCE_DOOR);

    public static final Block<DoorData> BIRCH_DOOR = new Block<>(645, 13922, NamespacedKey.parse("minecraft:birch_door"), () -> new DoorData(Block.BIRCH_DOOR, 13922), () -> Item.BIRCH_DOOR);

    public static final Block<DoorData> JUNGLE_DOOR = new Block<>(646, 13986, NamespacedKey.parse("minecraft:jungle_door"), () -> new DoorData(Block.JUNGLE_DOOR, 13986), () -> Item.JUNGLE_DOOR);

    public static final Block<DoorData> ACACIA_DOOR = new Block<>(647, 14050, NamespacedKey.parse("minecraft:acacia_door"), () -> new DoorData(Block.ACACIA_DOOR, 14050), () -> Item.ACACIA_DOOR);

    public static final Block<DoorData> CHERRY_DOOR = new Block<>(648, 14114, NamespacedKey.parse("minecraft:cherry_door"), () -> new DoorData(Block.CHERRY_DOOR, 14114), () -> Item.CHERRY_DOOR);

    public static final Block<DoorData> DARK_OAK_DOOR = new Block<>(649, 14178, NamespacedKey.parse("minecraft:dark_oak_door"), () -> new DoorData(Block.DARK_OAK_DOOR, 14178), () -> Item.DARK_OAK_DOOR);

    public static final Block<DoorData> PALE_OAK_DOOR = new Block<>(650, 14242, NamespacedKey.parse("minecraft:pale_oak_door"), () -> new DoorData(Block.PALE_OAK_DOOR, 14242), () -> Item.PALE_OAK_DOOR);

    public static final Block<DoorData> MANGROVE_DOOR = new Block<>(651, 14306, NamespacedKey.parse("minecraft:mangrove_door"), () -> new DoorData(Block.MANGROVE_DOOR, 14306), () -> Item.MANGROVE_DOOR);

    public static final Block<DoorData> BAMBOO_DOOR = new Block<>(652, 14370, NamespacedKey.parse("minecraft:bamboo_door"), () -> new DoorData(Block.BAMBOO_DOOR, 14370), () -> Item.BAMBOO_DOOR);

    public static final Block<EndRodData> END_ROD = new Block<>(653, 14434, NamespacedKey.parse("minecraft:end_rod"), () -> new EndRodData(Block.END_ROD, 14434), () -> Item.END_ROD);

    public static final Block<ChorusPlantData> CHORUS_PLANT = new Block<>(654, 14440, NamespacedKey.parse("minecraft:chorus_plant"), () -> new ChorusPlantData(Block.CHORUS_PLANT, 14440), () -> Item.CHORUS_PLANT);

    public static final Block<ChorusFlowerData> CHORUS_FLOWER = new Block<>(655, 14504, NamespacedKey.parse("minecraft:chorus_flower"), () -> new ChorusFlowerData(Block.CHORUS_FLOWER, 14504), () -> Item.CHORUS_FLOWER);

    public static final Block<BlockData> PURPUR_BLOCK = new Block<>(656, 14510, NamespacedKey.parse("minecraft:purpur_block"), () -> new BlockData(Block.PURPUR_BLOCK, 14510), () -> Item.PURPUR_BLOCK);

    public static final Block<RotatedPillarData> PURPUR_PILLAR = new Block<>(657, 14511, NamespacedKey.parse("minecraft:purpur_pillar"), () -> new RotatedPillarData(Block.PURPUR_PILLAR, 14511), () -> Item.PURPUR_PILLAR);

    public static final Block<StairData> PURPUR_STAIRS = new Block<>(658, 14514, NamespacedKey.parse("minecraft:purpur_stairs"), () -> new StairData(Block.PURPUR_STAIRS, 14514), () -> Item.PURPUR_STAIRS);

    public static final Block<BlockData> END_STONE_BRICKS = new Block<>(659, 14594, NamespacedKey.parse("minecraft:end_stone_bricks"), () -> new BlockData(Block.END_STONE_BRICKS, 14594), () -> Item.END_STONE_BRICKS);

    public static final Block<TorchflowerCropData> TORCHFLOWER_CROP = new Block<>(660, 14595, NamespacedKey.parse("minecraft:torchflower_crop"), () -> new TorchflowerCropData(Block.TORCHFLOWER_CROP, 14595), null);

    public static final Block<PitcherCropData> PITCHER_CROP = new Block<>(661, 14597, NamespacedKey.parse("minecraft:pitcher_crop"), () -> new PitcherCropData(Block.PITCHER_CROP, 14597), null);

    public static final Block<DoublePlantData> PITCHER_PLANT = new Block<>(662, 14607, NamespacedKey.parse("minecraft:pitcher_plant"), () -> new DoublePlantData(Block.PITCHER_PLANT, 14607), () -> Item.PITCHER_PLANT);

    public static final Block<BeetrootData> BEETROOTS = new Block<>(663, 14609, NamespacedKey.parse("minecraft:beetroots"), () -> new BeetrootData(Block.BEETROOTS, 14609), null);

    public static final Block<BlockData> DIRT_PATH = new Block<>(664, 14613, NamespacedKey.parse("minecraft:dirt_path"), () -> new BlockData(Block.DIRT_PATH, 14613), () -> Item.DIRT_PATH);

    public static final Block<BlockData> END_GATEWAY = new Block<>(665, 14614, NamespacedKey.parse("minecraft:end_gateway"), () -> new BlockData(Block.END_GATEWAY, 14614), null);

    public static final Block<CommandData> REPEATING_COMMAND_BLOCK = new Block<>(666, 14615, NamespacedKey.parse("minecraft:repeating_command_block"), () -> new CommandData(Block.REPEATING_COMMAND_BLOCK, 14615), () -> Item.REPEATING_COMMAND_BLOCK);

    public static final Block<CommandData> CHAIN_COMMAND_BLOCK = new Block<>(667, 14627, NamespacedKey.parse("minecraft:chain_command_block"), () -> new CommandData(Block.CHAIN_COMMAND_BLOCK, 14627), () -> Item.CHAIN_COMMAND_BLOCK);

    public static final Block<FrostedIceData> FROSTED_ICE = new Block<>(668, 14639, NamespacedKey.parse("minecraft:frosted_ice"), () -> new FrostedIceData(Block.FROSTED_ICE, 14639), null);

    public static final Block<BlockData> MAGMA_BLOCK = new Block<>(669, 14643, NamespacedKey.parse("minecraft:magma_block"), () -> new BlockData(Block.MAGMA_BLOCK, 14643), () -> Item.MAGMA_BLOCK);

    public static final Block<BlockData> NETHER_WART_BLOCK = new Block<>(670, 14644, NamespacedKey.parse("minecraft:nether_wart_block"), () -> new BlockData(Block.NETHER_WART_BLOCK, 14644), () -> Item.NETHER_WART_BLOCK);

    public static final Block<BlockData> RED_NETHER_BRICKS = new Block<>(671, 14645, NamespacedKey.parse("minecraft:red_nether_bricks"), () -> new BlockData(Block.RED_NETHER_BRICKS, 14645), () -> Item.RED_NETHER_BRICKS);

    public static final Block<RotatedPillarData> BONE_BLOCK = new Block<>(672, 14646, NamespacedKey.parse("minecraft:bone_block"), () -> new RotatedPillarData(Block.BONE_BLOCK, 14646), () -> Item.BONE_BLOCK);

    public static final Block<BlockData> STRUCTURE_VOID = new Block<>(673, 14649, NamespacedKey.parse("minecraft:structure_void"), () -> new BlockData(Block.STRUCTURE_VOID, 14649), () -> Item.STRUCTURE_VOID);

    public static final Block<ObserverData> OBSERVER = new Block<>(674, 14650, NamespacedKey.parse("minecraft:observer"), () -> new ObserverData(Block.OBSERVER, 14650), () -> Item.OBSERVER);

    public static final Block<ShulkerBoxData> SHULKER_BOX = new Block<>(675, 14662, NamespacedKey.parse("minecraft:shulker_box"), () -> new ShulkerBoxData(Block.SHULKER_BOX, 14662), () -> Item.SHULKER_BOX);

    public static final Block<ShulkerBoxData> WHITE_SHULKER_BOX = new Block<>(676, 14668, NamespacedKey.parse("minecraft:white_shulker_box"), () -> new ShulkerBoxData(Block.WHITE_SHULKER_BOX, 14668), () -> Item.WHITE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> ORANGE_SHULKER_BOX = new Block<>(677, 14674, NamespacedKey.parse("minecraft:orange_shulker_box"), () -> new ShulkerBoxData(Block.ORANGE_SHULKER_BOX, 14674), () -> Item.ORANGE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> MAGENTA_SHULKER_BOX = new Block<>(678, 14680, NamespacedKey.parse("minecraft:magenta_shulker_box"), () -> new ShulkerBoxData(Block.MAGENTA_SHULKER_BOX, 14680), () -> Item.MAGENTA_SHULKER_BOX);

    public static final Block<ShulkerBoxData> LIGHT_BLUE_SHULKER_BOX = new Block<>(679, 14686, NamespacedKey.parse("minecraft:light_blue_shulker_box"), () -> new ShulkerBoxData(Block.LIGHT_BLUE_SHULKER_BOX, 14686), () -> Item.LIGHT_BLUE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> YELLOW_SHULKER_BOX = new Block<>(680, 14692, NamespacedKey.parse("minecraft:yellow_shulker_box"), () -> new ShulkerBoxData(Block.YELLOW_SHULKER_BOX, 14692), () -> Item.YELLOW_SHULKER_BOX);

    public static final Block<ShulkerBoxData> LIME_SHULKER_BOX = new Block<>(681, 14698, NamespacedKey.parse("minecraft:lime_shulker_box"), () -> new ShulkerBoxData(Block.LIME_SHULKER_BOX, 14698), () -> Item.LIME_SHULKER_BOX);

    public static final Block<ShulkerBoxData> PINK_SHULKER_BOX = new Block<>(682, 14704, NamespacedKey.parse("minecraft:pink_shulker_box"), () -> new ShulkerBoxData(Block.PINK_SHULKER_BOX, 14704), () -> Item.PINK_SHULKER_BOX);

    public static final Block<ShulkerBoxData> GRAY_SHULKER_BOX = new Block<>(683, 14710, NamespacedKey.parse("minecraft:gray_shulker_box"), () -> new ShulkerBoxData(Block.GRAY_SHULKER_BOX, 14710), () -> Item.GRAY_SHULKER_BOX);

    public static final Block<ShulkerBoxData> LIGHT_GRAY_SHULKER_BOX = new Block<>(684, 14716, NamespacedKey.parse("minecraft:light_gray_shulker_box"), () -> new ShulkerBoxData(Block.LIGHT_GRAY_SHULKER_BOX, 14716), () -> Item.LIGHT_GRAY_SHULKER_BOX);

    public static final Block<ShulkerBoxData> CYAN_SHULKER_BOX = new Block<>(685, 14722, NamespacedKey.parse("minecraft:cyan_shulker_box"), () -> new ShulkerBoxData(Block.CYAN_SHULKER_BOX, 14722), () -> Item.CYAN_SHULKER_BOX);

    public static final Block<ShulkerBoxData> PURPLE_SHULKER_BOX = new Block<>(686, 14728, NamespacedKey.parse("minecraft:purple_shulker_box"), () -> new ShulkerBoxData(Block.PURPLE_SHULKER_BOX, 14728), () -> Item.PURPLE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> BLUE_SHULKER_BOX = new Block<>(687, 14734, NamespacedKey.parse("minecraft:blue_shulker_box"), () -> new ShulkerBoxData(Block.BLUE_SHULKER_BOX, 14734), () -> Item.BLUE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> BROWN_SHULKER_BOX = new Block<>(688, 14740, NamespacedKey.parse("minecraft:brown_shulker_box"), () -> new ShulkerBoxData(Block.BROWN_SHULKER_BOX, 14740), () -> Item.BROWN_SHULKER_BOX);

    public static final Block<ShulkerBoxData> GREEN_SHULKER_BOX = new Block<>(689, 14746, NamespacedKey.parse("minecraft:green_shulker_box"), () -> new ShulkerBoxData(Block.GREEN_SHULKER_BOX, 14746), () -> Item.GREEN_SHULKER_BOX);

    public static final Block<ShulkerBoxData> RED_SHULKER_BOX = new Block<>(690, 14752, NamespacedKey.parse("minecraft:red_shulker_box"), () -> new ShulkerBoxData(Block.RED_SHULKER_BOX, 14752), () -> Item.RED_SHULKER_BOX);

    public static final Block<ShulkerBoxData> BLACK_SHULKER_BOX = new Block<>(691, 14758, NamespacedKey.parse("minecraft:black_shulker_box"), () -> new ShulkerBoxData(Block.BLACK_SHULKER_BOX, 14758), () -> Item.BLACK_SHULKER_BOX);

    public static final Block<GlazedTerracottaData> WHITE_GLAZED_TERRACOTTA = new Block<>(692, 14764, NamespacedKey.parse("minecraft:white_glazed_terracotta"), () -> new GlazedTerracottaData(Block.WHITE_GLAZED_TERRACOTTA, 14764), () -> Item.WHITE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> ORANGE_GLAZED_TERRACOTTA = new Block<>(693, 14768, NamespacedKey.parse("minecraft:orange_glazed_terracotta"), () -> new GlazedTerracottaData(Block.ORANGE_GLAZED_TERRACOTTA, 14768), () -> Item.ORANGE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> MAGENTA_GLAZED_TERRACOTTA = new Block<>(694, 14772, NamespacedKey.parse("minecraft:magenta_glazed_terracotta"), () -> new GlazedTerracottaData(Block.MAGENTA_GLAZED_TERRACOTTA, 14772), () -> Item.MAGENTA_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> LIGHT_BLUE_GLAZED_TERRACOTTA = new Block<>(695, 14776, NamespacedKey.parse("minecraft:light_blue_glazed_terracotta"), () -> new GlazedTerracottaData(Block.LIGHT_BLUE_GLAZED_TERRACOTTA, 14776), () -> Item.LIGHT_BLUE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> YELLOW_GLAZED_TERRACOTTA = new Block<>(696, 14780, NamespacedKey.parse("minecraft:yellow_glazed_terracotta"), () -> new GlazedTerracottaData(Block.YELLOW_GLAZED_TERRACOTTA, 14780), () -> Item.YELLOW_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> LIME_GLAZED_TERRACOTTA = new Block<>(697, 14784, NamespacedKey.parse("minecraft:lime_glazed_terracotta"), () -> new GlazedTerracottaData(Block.LIME_GLAZED_TERRACOTTA, 14784), () -> Item.LIME_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> PINK_GLAZED_TERRACOTTA = new Block<>(698, 14788, NamespacedKey.parse("minecraft:pink_glazed_terracotta"), () -> new GlazedTerracottaData(Block.PINK_GLAZED_TERRACOTTA, 14788), () -> Item.PINK_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> GRAY_GLAZED_TERRACOTTA = new Block<>(699, 14792, NamespacedKey.parse("minecraft:gray_glazed_terracotta"), () -> new GlazedTerracottaData(Block.GRAY_GLAZED_TERRACOTTA, 14792), () -> Item.GRAY_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> LIGHT_GRAY_GLAZED_TERRACOTTA = new Block<>(700, 14796, NamespacedKey.parse("minecraft:light_gray_glazed_terracotta"), () -> new GlazedTerracottaData(Block.LIGHT_GRAY_GLAZED_TERRACOTTA, 14796), () -> Item.LIGHT_GRAY_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> CYAN_GLAZED_TERRACOTTA = new Block<>(701, 14800, NamespacedKey.parse("minecraft:cyan_glazed_terracotta"), () -> new GlazedTerracottaData(Block.CYAN_GLAZED_TERRACOTTA, 14800), () -> Item.CYAN_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> PURPLE_GLAZED_TERRACOTTA = new Block<>(702, 14804, NamespacedKey.parse("minecraft:purple_glazed_terracotta"), () -> new GlazedTerracottaData(Block.PURPLE_GLAZED_TERRACOTTA, 14804), () -> Item.PURPLE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> BLUE_GLAZED_TERRACOTTA = new Block<>(703, 14808, NamespacedKey.parse("minecraft:blue_glazed_terracotta"), () -> new GlazedTerracottaData(Block.BLUE_GLAZED_TERRACOTTA, 14808), () -> Item.BLUE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> BROWN_GLAZED_TERRACOTTA = new Block<>(704, 14812, NamespacedKey.parse("minecraft:brown_glazed_terracotta"), () -> new GlazedTerracottaData(Block.BROWN_GLAZED_TERRACOTTA, 14812), () -> Item.BROWN_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> GREEN_GLAZED_TERRACOTTA = new Block<>(705, 14816, NamespacedKey.parse("minecraft:green_glazed_terracotta"), () -> new GlazedTerracottaData(Block.GREEN_GLAZED_TERRACOTTA, 14816), () -> Item.GREEN_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> RED_GLAZED_TERRACOTTA = new Block<>(706, 14820, NamespacedKey.parse("minecraft:red_glazed_terracotta"), () -> new GlazedTerracottaData(Block.RED_GLAZED_TERRACOTTA, 14820), () -> Item.RED_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> BLACK_GLAZED_TERRACOTTA = new Block<>(707, 14824, NamespacedKey.parse("minecraft:black_glazed_terracotta"), () -> new GlazedTerracottaData(Block.BLACK_GLAZED_TERRACOTTA, 14824), () -> Item.BLACK_GLAZED_TERRACOTTA);

    public static final Block<BlockData> WHITE_CONCRETE = new Block<>(708, 14828, NamespacedKey.parse("minecraft:white_concrete"), () -> new BlockData(Block.WHITE_CONCRETE, 14828), () -> Item.WHITE_CONCRETE);

    public static final Block<BlockData> ORANGE_CONCRETE = new Block<>(709, 14829, NamespacedKey.parse("minecraft:orange_concrete"), () -> new BlockData(Block.ORANGE_CONCRETE, 14829), () -> Item.ORANGE_CONCRETE);

    public static final Block<BlockData> MAGENTA_CONCRETE = new Block<>(710, 14830, NamespacedKey.parse("minecraft:magenta_concrete"), () -> new BlockData(Block.MAGENTA_CONCRETE, 14830), () -> Item.MAGENTA_CONCRETE);

    public static final Block<BlockData> LIGHT_BLUE_CONCRETE = new Block<>(711, 14831, NamespacedKey.parse("minecraft:light_blue_concrete"), () -> new BlockData(Block.LIGHT_BLUE_CONCRETE, 14831), () -> Item.LIGHT_BLUE_CONCRETE);

    public static final Block<BlockData> YELLOW_CONCRETE = new Block<>(712, 14832, NamespacedKey.parse("minecraft:yellow_concrete"), () -> new BlockData(Block.YELLOW_CONCRETE, 14832), () -> Item.YELLOW_CONCRETE);

    public static final Block<BlockData> LIME_CONCRETE = new Block<>(713, 14833, NamespacedKey.parse("minecraft:lime_concrete"), () -> new BlockData(Block.LIME_CONCRETE, 14833), () -> Item.LIME_CONCRETE);

    public static final Block<BlockData> PINK_CONCRETE = new Block<>(714, 14834, NamespacedKey.parse("minecraft:pink_concrete"), () -> new BlockData(Block.PINK_CONCRETE, 14834), () -> Item.PINK_CONCRETE);

    public static final Block<BlockData> GRAY_CONCRETE = new Block<>(715, 14835, NamespacedKey.parse("minecraft:gray_concrete"), () -> new BlockData(Block.GRAY_CONCRETE, 14835), () -> Item.GRAY_CONCRETE);

    public static final Block<BlockData> LIGHT_GRAY_CONCRETE = new Block<>(716, 14836, NamespacedKey.parse("minecraft:light_gray_concrete"), () -> new BlockData(Block.LIGHT_GRAY_CONCRETE, 14836), () -> Item.LIGHT_GRAY_CONCRETE);

    public static final Block<BlockData> CYAN_CONCRETE = new Block<>(717, 14837, NamespacedKey.parse("minecraft:cyan_concrete"), () -> new BlockData(Block.CYAN_CONCRETE, 14837), () -> Item.CYAN_CONCRETE);

    public static final Block<BlockData> PURPLE_CONCRETE = new Block<>(718, 14838, NamespacedKey.parse("minecraft:purple_concrete"), () -> new BlockData(Block.PURPLE_CONCRETE, 14838), () -> Item.PURPLE_CONCRETE);

    public static final Block<BlockData> BLUE_CONCRETE = new Block<>(719, 14839, NamespacedKey.parse("minecraft:blue_concrete"), () -> new BlockData(Block.BLUE_CONCRETE, 14839), () -> Item.BLUE_CONCRETE);

    public static final Block<BlockData> BROWN_CONCRETE = new Block<>(720, 14840, NamespacedKey.parse("minecraft:brown_concrete"), () -> new BlockData(Block.BROWN_CONCRETE, 14840), () -> Item.BROWN_CONCRETE);

    public static final Block<BlockData> GREEN_CONCRETE = new Block<>(721, 14841, NamespacedKey.parse("minecraft:green_concrete"), () -> new BlockData(Block.GREEN_CONCRETE, 14841), () -> Item.GREEN_CONCRETE);

    public static final Block<BlockData> RED_CONCRETE = new Block<>(722, 14842, NamespacedKey.parse("minecraft:red_concrete"), () -> new BlockData(Block.RED_CONCRETE, 14842), () -> Item.RED_CONCRETE);

    public static final Block<BlockData> BLACK_CONCRETE = new Block<>(723, 14843, NamespacedKey.parse("minecraft:black_concrete"), () -> new BlockData(Block.BLACK_CONCRETE, 14843), () -> Item.BLACK_CONCRETE);

    public static final Block<BlockData> WHITE_CONCRETE_POWDER = new Block<>(724, 14844, NamespacedKey.parse("minecraft:white_concrete_powder"), () -> new BlockData(Block.WHITE_CONCRETE_POWDER, 14844), () -> Item.WHITE_CONCRETE_POWDER);

    public static final Block<BlockData> ORANGE_CONCRETE_POWDER = new Block<>(725, 14845, NamespacedKey.parse("minecraft:orange_concrete_powder"), () -> new BlockData(Block.ORANGE_CONCRETE_POWDER, 14845), () -> Item.ORANGE_CONCRETE_POWDER);

    public static final Block<BlockData> MAGENTA_CONCRETE_POWDER = new Block<>(726, 14846, NamespacedKey.parse("minecraft:magenta_concrete_powder"), () -> new BlockData(Block.MAGENTA_CONCRETE_POWDER, 14846), () -> Item.MAGENTA_CONCRETE_POWDER);

    public static final Block<BlockData> LIGHT_BLUE_CONCRETE_POWDER = new Block<>(727, 14847, NamespacedKey.parse("minecraft:light_blue_concrete_powder"), () -> new BlockData(Block.LIGHT_BLUE_CONCRETE_POWDER, 14847), () -> Item.LIGHT_BLUE_CONCRETE_POWDER);

    public static final Block<BlockData> YELLOW_CONCRETE_POWDER = new Block<>(728, 14848, NamespacedKey.parse("minecraft:yellow_concrete_powder"), () -> new BlockData(Block.YELLOW_CONCRETE_POWDER, 14848), () -> Item.YELLOW_CONCRETE_POWDER);

    public static final Block<BlockData> LIME_CONCRETE_POWDER = new Block<>(729, 14849, NamespacedKey.parse("minecraft:lime_concrete_powder"), () -> new BlockData(Block.LIME_CONCRETE_POWDER, 14849), () -> Item.LIME_CONCRETE_POWDER);

    public static final Block<BlockData> PINK_CONCRETE_POWDER = new Block<>(730, 14850, NamespacedKey.parse("minecraft:pink_concrete_powder"), () -> new BlockData(Block.PINK_CONCRETE_POWDER, 14850), () -> Item.PINK_CONCRETE_POWDER);

    public static final Block<BlockData> GRAY_CONCRETE_POWDER = new Block<>(731, 14851, NamespacedKey.parse("minecraft:gray_concrete_powder"), () -> new BlockData(Block.GRAY_CONCRETE_POWDER, 14851), () -> Item.GRAY_CONCRETE_POWDER);

    public static final Block<BlockData> LIGHT_GRAY_CONCRETE_POWDER = new Block<>(732, 14852, NamespacedKey.parse("minecraft:light_gray_concrete_powder"), () -> new BlockData(Block.LIGHT_GRAY_CONCRETE_POWDER, 14852), () -> Item.LIGHT_GRAY_CONCRETE_POWDER);

    public static final Block<BlockData> CYAN_CONCRETE_POWDER = new Block<>(733, 14853, NamespacedKey.parse("minecraft:cyan_concrete_powder"), () -> new BlockData(Block.CYAN_CONCRETE_POWDER, 14853), () -> Item.CYAN_CONCRETE_POWDER);

    public static final Block<BlockData> PURPLE_CONCRETE_POWDER = new Block<>(734, 14854, NamespacedKey.parse("minecraft:purple_concrete_powder"), () -> new BlockData(Block.PURPLE_CONCRETE_POWDER, 14854), () -> Item.PURPLE_CONCRETE_POWDER);

    public static final Block<BlockData> BLUE_CONCRETE_POWDER = new Block<>(735, 14855, NamespacedKey.parse("minecraft:blue_concrete_powder"), () -> new BlockData(Block.BLUE_CONCRETE_POWDER, 14855), () -> Item.BLUE_CONCRETE_POWDER);

    public static final Block<BlockData> BROWN_CONCRETE_POWDER = new Block<>(736, 14856, NamespacedKey.parse("minecraft:brown_concrete_powder"), () -> new BlockData(Block.BROWN_CONCRETE_POWDER, 14856), () -> Item.BROWN_CONCRETE_POWDER);

    public static final Block<BlockData> GREEN_CONCRETE_POWDER = new Block<>(737, 14857, NamespacedKey.parse("minecraft:green_concrete_powder"), () -> new BlockData(Block.GREEN_CONCRETE_POWDER, 14857), () -> Item.GREEN_CONCRETE_POWDER);

    public static final Block<BlockData> RED_CONCRETE_POWDER = new Block<>(738, 14858, NamespacedKey.parse("minecraft:red_concrete_powder"), () -> new BlockData(Block.RED_CONCRETE_POWDER, 14858), () -> Item.RED_CONCRETE_POWDER);

    public static final Block<BlockData> BLACK_CONCRETE_POWDER = new Block<>(739, 14859, NamespacedKey.parse("minecraft:black_concrete_powder"), () -> new BlockData(Block.BLACK_CONCRETE_POWDER, 14859), () -> Item.BLACK_CONCRETE_POWDER);

    public static final Block<KelpData> KELP = new Block<>(740, 14860, NamespacedKey.parse("minecraft:kelp"), () -> new KelpData(Block.KELP, 14860), () -> Item.KELP);

    public static final Block<BlockData> KELP_PLANT = new Block<>(741, 14886, NamespacedKey.parse("minecraft:kelp_plant"), () -> new BlockData(Block.KELP_PLANT, 14886), null);

    public static final Block<BlockData> DRIED_KELP_BLOCK = new Block<>(742, 14887, NamespacedKey.parse("minecraft:dried_kelp_block"), () -> new BlockData(Block.DRIED_KELP_BLOCK, 14887), () -> Item.DRIED_KELP_BLOCK);

    public static final Block<TurtleEggData> TURTLE_EGG = new Block<>(743, 14888, NamespacedKey.parse("minecraft:turtle_egg"), () -> new TurtleEggData(Block.TURTLE_EGG, 14888), () -> Item.TURTLE_EGG);

    public static final Block<SnifferEggData> SNIFFER_EGG = new Block<>(744, 14900, NamespacedKey.parse("minecraft:sniffer_egg"), () -> new SnifferEggData(Block.SNIFFER_EGG, 14900), () -> Item.SNIFFER_EGG);

    public static final Block<DriedGhastData> DRIED_GHAST = new Block<>(745, 14903, NamespacedKey.parse("minecraft:dried_ghast"), () -> new DriedGhastData(Block.DRIED_GHAST, 14903), () -> Item.DRIED_GHAST);

    public static final Block<BlockData> DEAD_TUBE_CORAL_BLOCK = new Block<>(746, 14935, NamespacedKey.parse("minecraft:dead_tube_coral_block"), () -> new BlockData(Block.DEAD_TUBE_CORAL_BLOCK, 14935), () -> Item.DEAD_TUBE_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_BRAIN_CORAL_BLOCK = new Block<>(747, 14936, NamespacedKey.parse("minecraft:dead_brain_coral_block"), () -> new BlockData(Block.DEAD_BRAIN_CORAL_BLOCK, 14936), () -> Item.DEAD_BRAIN_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_BUBBLE_CORAL_BLOCK = new Block<>(748, 14937, NamespacedKey.parse("minecraft:dead_bubble_coral_block"), () -> new BlockData(Block.DEAD_BUBBLE_CORAL_BLOCK, 14937), () -> Item.DEAD_BUBBLE_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_FIRE_CORAL_BLOCK = new Block<>(749, 14938, NamespacedKey.parse("minecraft:dead_fire_coral_block"), () -> new BlockData(Block.DEAD_FIRE_CORAL_BLOCK, 14938), () -> Item.DEAD_FIRE_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_HORN_CORAL_BLOCK = new Block<>(750, 14939, NamespacedKey.parse("minecraft:dead_horn_coral_block"), () -> new BlockData(Block.DEAD_HORN_CORAL_BLOCK, 14939), () -> Item.DEAD_HORN_CORAL_BLOCK);

    public static final Block<BlockData> TUBE_CORAL_BLOCK = new Block<>(751, 14940, NamespacedKey.parse("minecraft:tube_coral_block"), () -> new BlockData(Block.TUBE_CORAL_BLOCK, 14940), () -> Item.TUBE_CORAL_BLOCK);

    public static final Block<BlockData> BRAIN_CORAL_BLOCK = new Block<>(752, 14941, NamespacedKey.parse("minecraft:brain_coral_block"), () -> new BlockData(Block.BRAIN_CORAL_BLOCK, 14941), () -> Item.BRAIN_CORAL_BLOCK);

    public static final Block<BlockData> BUBBLE_CORAL_BLOCK = new Block<>(753, 14942, NamespacedKey.parse("minecraft:bubble_coral_block"), () -> new BlockData(Block.BUBBLE_CORAL_BLOCK, 14942), () -> Item.BUBBLE_CORAL_BLOCK);

    public static final Block<BlockData> FIRE_CORAL_BLOCK = new Block<>(754, 14943, NamespacedKey.parse("minecraft:fire_coral_block"), () -> new BlockData(Block.FIRE_CORAL_BLOCK, 14943), () -> Item.FIRE_CORAL_BLOCK);

    public static final Block<BlockData> HORN_CORAL_BLOCK = new Block<>(755, 14944, NamespacedKey.parse("minecraft:horn_coral_block"), () -> new BlockData(Block.HORN_CORAL_BLOCK, 14944), () -> Item.HORN_CORAL_BLOCK);

    public static final Block<BaseCoralPlantData> DEAD_TUBE_CORAL = new Block<>(756, 14945, NamespacedKey.parse("minecraft:dead_tube_coral"), () -> new BaseCoralPlantData(Block.DEAD_TUBE_CORAL, 14945), () -> Item.DEAD_TUBE_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_BRAIN_CORAL = new Block<>(757, 14947, NamespacedKey.parse("minecraft:dead_brain_coral"), () -> new BaseCoralPlantData(Block.DEAD_BRAIN_CORAL, 14947), () -> Item.DEAD_BRAIN_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_BUBBLE_CORAL = new Block<>(758, 14949, NamespacedKey.parse("minecraft:dead_bubble_coral"), () -> new BaseCoralPlantData(Block.DEAD_BUBBLE_CORAL, 14949), () -> Item.DEAD_BUBBLE_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_FIRE_CORAL = new Block<>(759, 14951, NamespacedKey.parse("minecraft:dead_fire_coral"), () -> new BaseCoralPlantData(Block.DEAD_FIRE_CORAL, 14951), () -> Item.DEAD_FIRE_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_HORN_CORAL = new Block<>(760, 14953, NamespacedKey.parse("minecraft:dead_horn_coral"), () -> new BaseCoralPlantData(Block.DEAD_HORN_CORAL, 14953), () -> Item.DEAD_HORN_CORAL);

    public static final Block<CoralPlantData> TUBE_CORAL = new Block<>(761, 14955, NamespacedKey.parse("minecraft:tube_coral"), () -> new CoralPlantData(Block.TUBE_CORAL, 14955), () -> Item.TUBE_CORAL);

    public static final Block<CoralPlantData> BRAIN_CORAL = new Block<>(762, 14957, NamespacedKey.parse("minecraft:brain_coral"), () -> new CoralPlantData(Block.BRAIN_CORAL, 14957), () -> Item.BRAIN_CORAL);

    public static final Block<CoralPlantData> BUBBLE_CORAL = new Block<>(763, 14959, NamespacedKey.parse("minecraft:bubble_coral"), () -> new CoralPlantData(Block.BUBBLE_CORAL, 14959), () -> Item.BUBBLE_CORAL);

    public static final Block<CoralPlantData> FIRE_CORAL = new Block<>(764, 14961, NamespacedKey.parse("minecraft:fire_coral"), () -> new CoralPlantData(Block.FIRE_CORAL, 14961), () -> Item.FIRE_CORAL);

    public static final Block<CoralPlantData> HORN_CORAL = new Block<>(765, 14963, NamespacedKey.parse("minecraft:horn_coral"), () -> new CoralPlantData(Block.HORN_CORAL, 14963), () -> Item.HORN_CORAL);

    public static final Block<BaseCoralFanData> DEAD_TUBE_CORAL_FAN = new Block<>(766, 14965, NamespacedKey.parse("minecraft:dead_tube_coral_fan"), () -> new BaseCoralFanData(Block.DEAD_TUBE_CORAL_FAN, 14965), () -> Item.DEAD_TUBE_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_BRAIN_CORAL_FAN = new Block<>(767, 14967, NamespacedKey.parse("minecraft:dead_brain_coral_fan"), () -> new BaseCoralFanData(Block.DEAD_BRAIN_CORAL_FAN, 14967), () -> Item.DEAD_BRAIN_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_BUBBLE_CORAL_FAN = new Block<>(768, 14969, NamespacedKey.parse("minecraft:dead_bubble_coral_fan"), () -> new BaseCoralFanData(Block.DEAD_BUBBLE_CORAL_FAN, 14969), () -> Item.DEAD_BUBBLE_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_FIRE_CORAL_FAN = new Block<>(769, 14971, NamespacedKey.parse("minecraft:dead_fire_coral_fan"), () -> new BaseCoralFanData(Block.DEAD_FIRE_CORAL_FAN, 14971), () -> Item.DEAD_FIRE_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_HORN_CORAL_FAN = new Block<>(770, 14973, NamespacedKey.parse("minecraft:dead_horn_coral_fan"), () -> new BaseCoralFanData(Block.DEAD_HORN_CORAL_FAN, 14973), () -> Item.DEAD_HORN_CORAL_FAN);

    public static final Block<CoralFanData> TUBE_CORAL_FAN = new Block<>(771, 14975, NamespacedKey.parse("minecraft:tube_coral_fan"), () -> new CoralFanData(Block.TUBE_CORAL_FAN, 14975), () -> Item.TUBE_CORAL_FAN);

    public static final Block<CoralFanData> BRAIN_CORAL_FAN = new Block<>(772, 14977, NamespacedKey.parse("minecraft:brain_coral_fan"), () -> new CoralFanData(Block.BRAIN_CORAL_FAN, 14977), () -> Item.BRAIN_CORAL_FAN);

    public static final Block<CoralFanData> BUBBLE_CORAL_FAN = new Block<>(773, 14979, NamespacedKey.parse("minecraft:bubble_coral_fan"), () -> new CoralFanData(Block.BUBBLE_CORAL_FAN, 14979), () -> Item.BUBBLE_CORAL_FAN);

    public static final Block<CoralFanData> FIRE_CORAL_FAN = new Block<>(774, 14981, NamespacedKey.parse("minecraft:fire_coral_fan"), () -> new CoralFanData(Block.FIRE_CORAL_FAN, 14981), () -> Item.FIRE_CORAL_FAN);

    public static final Block<CoralFanData> HORN_CORAL_FAN = new Block<>(775, 14983, NamespacedKey.parse("minecraft:horn_coral_fan"), () -> new CoralFanData(Block.HORN_CORAL_FAN, 14983), () -> Item.HORN_CORAL_FAN);

    public static final Block<BaseCoralWallFanData> DEAD_TUBE_CORAL_WALL_FAN = new Block<>(776, 14985, NamespacedKey.parse("minecraft:dead_tube_coral_wall_fan"), () -> new BaseCoralWallFanData(Block.DEAD_TUBE_CORAL_WALL_FAN, 14985), null);

    public static final Block<BaseCoralWallFanData> DEAD_BRAIN_CORAL_WALL_FAN = new Block<>(777, 14993, NamespacedKey.parse("minecraft:dead_brain_coral_wall_fan"), () -> new BaseCoralWallFanData(Block.DEAD_BRAIN_CORAL_WALL_FAN, 14993), null);

    public static final Block<BaseCoralWallFanData> DEAD_BUBBLE_CORAL_WALL_FAN = new Block<>(778, 15001, NamespacedKey.parse("minecraft:dead_bubble_coral_wall_fan"), () -> new BaseCoralWallFanData(Block.DEAD_BUBBLE_CORAL_WALL_FAN, 15001), null);

    public static final Block<BaseCoralWallFanData> DEAD_FIRE_CORAL_WALL_FAN = new Block<>(779, 15009, NamespacedKey.parse("minecraft:dead_fire_coral_wall_fan"), () -> new BaseCoralWallFanData(Block.DEAD_FIRE_CORAL_WALL_FAN, 15009), null);

    public static final Block<BaseCoralWallFanData> DEAD_HORN_CORAL_WALL_FAN = new Block<>(780, 15017, NamespacedKey.parse("minecraft:dead_horn_coral_wall_fan"), () -> new BaseCoralWallFanData(Block.DEAD_HORN_CORAL_WALL_FAN, 15017), null);

    public static final Block<CoralWallFanData> TUBE_CORAL_WALL_FAN = new Block<>(781, 15025, NamespacedKey.parse("minecraft:tube_coral_wall_fan"), () -> new CoralWallFanData(Block.TUBE_CORAL_WALL_FAN, 15025), null);

    public static final Block<CoralWallFanData> BRAIN_CORAL_WALL_FAN = new Block<>(782, 15033, NamespacedKey.parse("minecraft:brain_coral_wall_fan"), () -> new CoralWallFanData(Block.BRAIN_CORAL_WALL_FAN, 15033), null);

    public static final Block<CoralWallFanData> BUBBLE_CORAL_WALL_FAN = new Block<>(783, 15041, NamespacedKey.parse("minecraft:bubble_coral_wall_fan"), () -> new CoralWallFanData(Block.BUBBLE_CORAL_WALL_FAN, 15041), null);

    public static final Block<CoralWallFanData> FIRE_CORAL_WALL_FAN = new Block<>(784, 15049, NamespacedKey.parse("minecraft:fire_coral_wall_fan"), () -> new CoralWallFanData(Block.FIRE_CORAL_WALL_FAN, 15049), null);

    public static final Block<CoralWallFanData> HORN_CORAL_WALL_FAN = new Block<>(785, 15057, NamespacedKey.parse("minecraft:horn_coral_wall_fan"), () -> new CoralWallFanData(Block.HORN_CORAL_WALL_FAN, 15057), null);

    public static final Block<SeaPickleData> SEA_PICKLE = new Block<>(786, 15065, NamespacedKey.parse("minecraft:sea_pickle"), () -> new SeaPickleData(Block.SEA_PICKLE, 15065), () -> Item.SEA_PICKLE);

    public static final Block<BlockData> BLUE_ICE = new Block<>(787, 15073, NamespacedKey.parse("minecraft:blue_ice"), () -> new BlockData(Block.BLUE_ICE, 15073), () -> Item.BLUE_ICE);

    public static final Block<ConduitData> CONDUIT = new Block<>(788, 15074, NamespacedKey.parse("minecraft:conduit"), () -> new ConduitData(Block.CONDUIT, 15074), () -> Item.CONDUIT);

    public static final Block<BlockData> BAMBOO_SAPLING = new Block<>(789, 15076, NamespacedKey.parse("minecraft:bamboo_sapling"), () -> new BlockData(Block.BAMBOO_SAPLING, 15076), null);

    public static final Block<BambooStalkData> BAMBOO = new Block<>(790, 15077, NamespacedKey.parse("minecraft:bamboo"), () -> new BambooStalkData(Block.BAMBOO, 15077), () -> Item.BAMBOO);

    public static final Block<BlockData> POTTED_BAMBOO = new Block<>(791, 15089, NamespacedKey.parse("minecraft:potted_bamboo"), () -> new BlockData(Block.POTTED_BAMBOO, 15089), null);

    public static final Block<BlockData> VOID_AIR = new Block<>(792, 15090, NamespacedKey.parse("minecraft:void_air"), () -> new BlockData(Block.VOID_AIR, 15090), null);

    public static final Block<BlockData> CAVE_AIR = new Block<>(793, 15091, NamespacedKey.parse("minecraft:cave_air"), () -> new BlockData(Block.CAVE_AIR, 15091), null);

    public static final Block<BubbleColumnData> BUBBLE_COLUMN = new Block<>(794, 15092, NamespacedKey.parse("minecraft:bubble_column"), () -> new BubbleColumnData(Block.BUBBLE_COLUMN, 15092), null);

    public static final Block<StairData> POLISHED_GRANITE_STAIRS = new Block<>(795, 15094, NamespacedKey.parse("minecraft:polished_granite_stairs"), () -> new StairData(Block.POLISHED_GRANITE_STAIRS, 15094), () -> Item.POLISHED_GRANITE_STAIRS);

    public static final Block<StairData> SMOOTH_RED_SANDSTONE_STAIRS = new Block<>(796, 15174, NamespacedKey.parse("minecraft:smooth_red_sandstone_stairs"), () -> new StairData(Block.SMOOTH_RED_SANDSTONE_STAIRS, 15174), () -> Item.SMOOTH_RED_SANDSTONE_STAIRS);

    public static final Block<StairData> MOSSY_STONE_BRICK_STAIRS = new Block<>(797, 15254, NamespacedKey.parse("minecraft:mossy_stone_brick_stairs"), () -> new StairData(Block.MOSSY_STONE_BRICK_STAIRS, 15254), () -> Item.MOSSY_STONE_BRICK_STAIRS);

    public static final Block<StairData> POLISHED_DIORITE_STAIRS = new Block<>(798, 15334, NamespacedKey.parse("minecraft:polished_diorite_stairs"), () -> new StairData(Block.POLISHED_DIORITE_STAIRS, 15334), () -> Item.POLISHED_DIORITE_STAIRS);

    public static final Block<StairData> MOSSY_COBBLESTONE_STAIRS = new Block<>(799, 15414, NamespacedKey.parse("minecraft:mossy_cobblestone_stairs"), () -> new StairData(Block.MOSSY_COBBLESTONE_STAIRS, 15414), () -> Item.MOSSY_COBBLESTONE_STAIRS);

    public static final Block<StairData> END_STONE_BRICK_STAIRS = new Block<>(800, 15494, NamespacedKey.parse("minecraft:end_stone_brick_stairs"), () -> new StairData(Block.END_STONE_BRICK_STAIRS, 15494), () -> Item.END_STONE_BRICK_STAIRS);

    public static final Block<StairData> STONE_STAIRS = new Block<>(801, 15574, NamespacedKey.parse("minecraft:stone_stairs"), () -> new StairData(Block.STONE_STAIRS, 15574), () -> Item.STONE_STAIRS);

    public static final Block<StairData> SMOOTH_SANDSTONE_STAIRS = new Block<>(802, 15654, NamespacedKey.parse("minecraft:smooth_sandstone_stairs"), () -> new StairData(Block.SMOOTH_SANDSTONE_STAIRS, 15654), () -> Item.SMOOTH_SANDSTONE_STAIRS);

    public static final Block<StairData> SMOOTH_QUARTZ_STAIRS = new Block<>(803, 15734, NamespacedKey.parse("minecraft:smooth_quartz_stairs"), () -> new StairData(Block.SMOOTH_QUARTZ_STAIRS, 15734), () -> Item.SMOOTH_QUARTZ_STAIRS);

    public static final Block<StairData> GRANITE_STAIRS = new Block<>(804, 15814, NamespacedKey.parse("minecraft:granite_stairs"), () -> new StairData(Block.GRANITE_STAIRS, 15814), () -> Item.GRANITE_STAIRS);

    public static final Block<StairData> ANDESITE_STAIRS = new Block<>(805, 15894, NamespacedKey.parse("minecraft:andesite_stairs"), () -> new StairData(Block.ANDESITE_STAIRS, 15894), () -> Item.ANDESITE_STAIRS);

    public static final Block<StairData> RED_NETHER_BRICK_STAIRS = new Block<>(806, 15974, NamespacedKey.parse("minecraft:red_nether_brick_stairs"), () -> new StairData(Block.RED_NETHER_BRICK_STAIRS, 15974), () -> Item.RED_NETHER_BRICK_STAIRS);

    public static final Block<StairData> POLISHED_ANDESITE_STAIRS = new Block<>(807, 16054, NamespacedKey.parse("minecraft:polished_andesite_stairs"), () -> new StairData(Block.POLISHED_ANDESITE_STAIRS, 16054), () -> Item.POLISHED_ANDESITE_STAIRS);

    public static final Block<StairData> DIORITE_STAIRS = new Block<>(808, 16134, NamespacedKey.parse("minecraft:diorite_stairs"), () -> new StairData(Block.DIORITE_STAIRS, 16134), () -> Item.DIORITE_STAIRS);

    public static final Block<SlabData> POLISHED_GRANITE_SLAB = new Block<>(809, 16214, NamespacedKey.parse("minecraft:polished_granite_slab"), () -> new SlabData(Block.POLISHED_GRANITE_SLAB, 16214), () -> Item.POLISHED_GRANITE_SLAB);

    public static final Block<SlabData> SMOOTH_RED_SANDSTONE_SLAB = new Block<>(810, 16220, NamespacedKey.parse("minecraft:smooth_red_sandstone_slab"), () -> new SlabData(Block.SMOOTH_RED_SANDSTONE_SLAB, 16220), () -> Item.SMOOTH_RED_SANDSTONE_SLAB);

    public static final Block<SlabData> MOSSY_STONE_BRICK_SLAB = new Block<>(811, 16226, NamespacedKey.parse("minecraft:mossy_stone_brick_slab"), () -> new SlabData(Block.MOSSY_STONE_BRICK_SLAB, 16226), () -> Item.MOSSY_STONE_BRICK_SLAB);

    public static final Block<SlabData> POLISHED_DIORITE_SLAB = new Block<>(812, 16232, NamespacedKey.parse("minecraft:polished_diorite_slab"), () -> new SlabData(Block.POLISHED_DIORITE_SLAB, 16232), () -> Item.POLISHED_DIORITE_SLAB);

    public static final Block<SlabData> MOSSY_COBBLESTONE_SLAB = new Block<>(813, 16238, NamespacedKey.parse("minecraft:mossy_cobblestone_slab"), () -> new SlabData(Block.MOSSY_COBBLESTONE_SLAB, 16238), () -> Item.MOSSY_COBBLESTONE_SLAB);

    public static final Block<SlabData> END_STONE_BRICK_SLAB = new Block<>(814, 16244, NamespacedKey.parse("minecraft:end_stone_brick_slab"), () -> new SlabData(Block.END_STONE_BRICK_SLAB, 16244), () -> Item.END_STONE_BRICK_SLAB);

    public static final Block<SlabData> SMOOTH_SANDSTONE_SLAB = new Block<>(815, 16250, NamespacedKey.parse("minecraft:smooth_sandstone_slab"), () -> new SlabData(Block.SMOOTH_SANDSTONE_SLAB, 16250), () -> Item.SMOOTH_SANDSTONE_SLAB);

    public static final Block<SlabData> SMOOTH_QUARTZ_SLAB = new Block<>(816, 16256, NamespacedKey.parse("minecraft:smooth_quartz_slab"), () -> new SlabData(Block.SMOOTH_QUARTZ_SLAB, 16256), () -> Item.SMOOTH_QUARTZ_SLAB);

    public static final Block<SlabData> GRANITE_SLAB = new Block<>(817, 16262, NamespacedKey.parse("minecraft:granite_slab"), () -> new SlabData(Block.GRANITE_SLAB, 16262), () -> Item.GRANITE_SLAB);

    public static final Block<SlabData> ANDESITE_SLAB = new Block<>(818, 16268, NamespacedKey.parse("minecraft:andesite_slab"), () -> new SlabData(Block.ANDESITE_SLAB, 16268), () -> Item.ANDESITE_SLAB);

    public static final Block<SlabData> RED_NETHER_BRICK_SLAB = new Block<>(819, 16274, NamespacedKey.parse("minecraft:red_nether_brick_slab"), () -> new SlabData(Block.RED_NETHER_BRICK_SLAB, 16274), () -> Item.RED_NETHER_BRICK_SLAB);

    public static final Block<SlabData> POLISHED_ANDESITE_SLAB = new Block<>(820, 16280, NamespacedKey.parse("minecraft:polished_andesite_slab"), () -> new SlabData(Block.POLISHED_ANDESITE_SLAB, 16280), () -> Item.POLISHED_ANDESITE_SLAB);

    public static final Block<SlabData> DIORITE_SLAB = new Block<>(821, 16286, NamespacedKey.parse("minecraft:diorite_slab"), () -> new SlabData(Block.DIORITE_SLAB, 16286), () -> Item.DIORITE_SLAB);

    public static final Block<WallData> BRICK_WALL = new Block<>(822, 16292, NamespacedKey.parse("minecraft:brick_wall"), () -> new WallData(Block.BRICK_WALL, 16292), () -> Item.BRICK_WALL);

    public static final Block<WallData> PRISMARINE_WALL = new Block<>(823, 16616, NamespacedKey.parse("minecraft:prismarine_wall"), () -> new WallData(Block.PRISMARINE_WALL, 16616), () -> Item.PRISMARINE_WALL);

    public static final Block<WallData> RED_SANDSTONE_WALL = new Block<>(824, 16940, NamespacedKey.parse("minecraft:red_sandstone_wall"), () -> new WallData(Block.RED_SANDSTONE_WALL, 16940), () -> Item.RED_SANDSTONE_WALL);

    public static final Block<WallData> MOSSY_STONE_BRICK_WALL = new Block<>(825, 17264, NamespacedKey.parse("minecraft:mossy_stone_brick_wall"), () -> new WallData(Block.MOSSY_STONE_BRICK_WALL, 17264), () -> Item.MOSSY_STONE_BRICK_WALL);

    public static final Block<WallData> GRANITE_WALL = new Block<>(826, 17588, NamespacedKey.parse("minecraft:granite_wall"), () -> new WallData(Block.GRANITE_WALL, 17588), () -> Item.GRANITE_WALL);

    public static final Block<WallData> STONE_BRICK_WALL = new Block<>(827, 17912, NamespacedKey.parse("minecraft:stone_brick_wall"), () -> new WallData(Block.STONE_BRICK_WALL, 17912), () -> Item.STONE_BRICK_WALL);

    public static final Block<WallData> MUD_BRICK_WALL = new Block<>(828, 18236, NamespacedKey.parse("minecraft:mud_brick_wall"), () -> new WallData(Block.MUD_BRICK_WALL, 18236), () -> Item.MUD_BRICK_WALL);

    public static final Block<WallData> NETHER_BRICK_WALL = new Block<>(829, 18560, NamespacedKey.parse("minecraft:nether_brick_wall"), () -> new WallData(Block.NETHER_BRICK_WALL, 18560), () -> Item.NETHER_BRICK_WALL);

    public static final Block<WallData> ANDESITE_WALL = new Block<>(830, 18884, NamespacedKey.parse("minecraft:andesite_wall"), () -> new WallData(Block.ANDESITE_WALL, 18884), () -> Item.ANDESITE_WALL);

    public static final Block<WallData> RED_NETHER_BRICK_WALL = new Block<>(831, 19208, NamespacedKey.parse("minecraft:red_nether_brick_wall"), () -> new WallData(Block.RED_NETHER_BRICK_WALL, 19208), () -> Item.RED_NETHER_BRICK_WALL);

    public static final Block<WallData> SANDSTONE_WALL = new Block<>(832, 19532, NamespacedKey.parse("minecraft:sandstone_wall"), () -> new WallData(Block.SANDSTONE_WALL, 19532), () -> Item.SANDSTONE_WALL);

    public static final Block<WallData> END_STONE_BRICK_WALL = new Block<>(833, 19856, NamespacedKey.parse("minecraft:end_stone_brick_wall"), () -> new WallData(Block.END_STONE_BRICK_WALL, 19856), () -> Item.END_STONE_BRICK_WALL);

    public static final Block<WallData> DIORITE_WALL = new Block<>(834, 20180, NamespacedKey.parse("minecraft:diorite_wall"), () -> new WallData(Block.DIORITE_WALL, 20180), () -> Item.DIORITE_WALL);

    public static final Block<ScaffoldingData> SCAFFOLDING = new Block<>(835, 20504, NamespacedKey.parse("minecraft:scaffolding"), () -> new ScaffoldingData(Block.SCAFFOLDING, 20504), () -> Item.SCAFFOLDING);

    public static final Block<LoomData> LOOM = new Block<>(836, 20536, NamespacedKey.parse("minecraft:loom"), () -> new LoomData(Block.LOOM, 20536), () -> Item.LOOM);

    public static final Block<BarrelData> BARREL = new Block<>(837, 20540, NamespacedKey.parse("minecraft:barrel"), () -> new BarrelData(Block.BARREL, 20540), () -> Item.BARREL);

    public static final Block<SmokerData> SMOKER = new Block<>(838, 20552, NamespacedKey.parse("minecraft:smoker"), () -> new SmokerData(Block.SMOKER, 20552), () -> Item.SMOKER);

    public static final Block<BlastFurnaceData> BLAST_FURNACE = new Block<>(839, 20560, NamespacedKey.parse("minecraft:blast_furnace"), () -> new BlastFurnaceData(Block.BLAST_FURNACE, 20560), () -> Item.BLAST_FURNACE);

    public static final Block<BlockData> CARTOGRAPHY_TABLE = new Block<>(840, 20568, NamespacedKey.parse("minecraft:cartography_table"), () -> new BlockData(Block.CARTOGRAPHY_TABLE, 20568), () -> Item.CARTOGRAPHY_TABLE);

    public static final Block<BlockData> FLETCHING_TABLE = new Block<>(841, 20569, NamespacedKey.parse("minecraft:fletching_table"), () -> new BlockData(Block.FLETCHING_TABLE, 20569), () -> Item.FLETCHING_TABLE);

    public static final Block<GrindstoneData> GRINDSTONE = new Block<>(842, 20570, NamespacedKey.parse("minecraft:grindstone"), () -> new GrindstoneData(Block.GRINDSTONE, 20570), () -> Item.GRINDSTONE);

    public static final Block<LecternData> LECTERN = new Block<>(843, 20582, NamespacedKey.parse("minecraft:lectern"), () -> new LecternData(Block.LECTERN, 20582), () -> Item.LECTERN);

    public static final Block<BlockData> SMITHING_TABLE = new Block<>(844, 20598, NamespacedKey.parse("minecraft:smithing_table"), () -> new BlockData(Block.SMITHING_TABLE, 20598), () -> Item.SMITHING_TABLE);

    public static final Block<StonecutterData> STONECUTTER = new Block<>(845, 20599, NamespacedKey.parse("minecraft:stonecutter"), () -> new StonecutterData(Block.STONECUTTER, 20599), () -> Item.STONECUTTER);

    public static final Block<BellData> BELL = new Block<>(846, 20603, NamespacedKey.parse("minecraft:bell"), () -> new BellData(Block.BELL, 20603), () -> Item.BELL);

    public static final Block<LanternData> LANTERN = new Block<>(847, 20635, NamespacedKey.parse("minecraft:lantern"), () -> new LanternData(Block.LANTERN, 20635), () -> Item.LANTERN);

    public static final Block<LanternData> SOUL_LANTERN = new Block<>(848, 20639, NamespacedKey.parse("minecraft:soul_lantern"), () -> new LanternData(Block.SOUL_LANTERN, 20639), () -> Item.SOUL_LANTERN);

    public static final Block<WeatheringLanternData> COPPER_LANTERN = new Block<>(849, 20643, NamespacedKey.parse("minecraft:copper_lantern"), () -> new WeatheringLanternData(Block.COPPER_LANTERN, 20643), () -> Item.COPPER_LANTERN);

    public static final Block<WeatheringLanternData> EXPOSED_COPPER_LANTERN = new Block<>(850, 20647, NamespacedKey.parse("minecraft:exposed_copper_lantern"), () -> new WeatheringLanternData(Block.EXPOSED_COPPER_LANTERN, 20647), () -> Item.EXPOSED_COPPER_LANTERN);

    public static final Block<WeatheringLanternData> WEATHERED_COPPER_LANTERN = new Block<>(851, 20651, NamespacedKey.parse("minecraft:weathered_copper_lantern"), () -> new WeatheringLanternData(Block.WEATHERED_COPPER_LANTERN, 20651), () -> Item.WEATHERED_COPPER_LANTERN);

    public static final Block<WeatheringLanternData> OXIDIZED_COPPER_LANTERN = new Block<>(852, 20655, NamespacedKey.parse("minecraft:oxidized_copper_lantern"), () -> new WeatheringLanternData(Block.OXIDIZED_COPPER_LANTERN, 20655), () -> Item.OXIDIZED_COPPER_LANTERN);

    public static final Block<LanternData> WAXED_COPPER_LANTERN = new Block<>(853, 20659, NamespacedKey.parse("minecraft:waxed_copper_lantern"), () -> new LanternData(Block.WAXED_COPPER_LANTERN, 20659), () -> Item.WAXED_COPPER_LANTERN);

    public static final Block<LanternData> WAXED_EXPOSED_COPPER_LANTERN = new Block<>(854, 20663, NamespacedKey.parse("minecraft:waxed_exposed_copper_lantern"), () -> new LanternData(Block.WAXED_EXPOSED_COPPER_LANTERN, 20663), () -> Item.WAXED_EXPOSED_COPPER_LANTERN);

    public static final Block<LanternData> WAXED_WEATHERED_COPPER_LANTERN = new Block<>(855, 20667, NamespacedKey.parse("minecraft:waxed_weathered_copper_lantern"), () -> new LanternData(Block.WAXED_WEATHERED_COPPER_LANTERN, 20667), () -> Item.WAXED_WEATHERED_COPPER_LANTERN);

    public static final Block<LanternData> WAXED_OXIDIZED_COPPER_LANTERN = new Block<>(856, 20671, NamespacedKey.parse("minecraft:waxed_oxidized_copper_lantern"), () -> new LanternData(Block.WAXED_OXIDIZED_COPPER_LANTERN, 20671), () -> Item.WAXED_OXIDIZED_COPPER_LANTERN);

    public static final Block<CampfireData> CAMPFIRE = new Block<>(857, 20675, NamespacedKey.parse("minecraft:campfire"), () -> new CampfireData(Block.CAMPFIRE, 20675), () -> Item.CAMPFIRE);

    public static final Block<CampfireData> SOUL_CAMPFIRE = new Block<>(858, 20707, NamespacedKey.parse("minecraft:soul_campfire"), () -> new CampfireData(Block.SOUL_CAMPFIRE, 20707), () -> Item.SOUL_CAMPFIRE);

    public static final Block<SweetBerryBushData> SWEET_BERRY_BUSH = new Block<>(859, 20739, NamespacedKey.parse("minecraft:sweet_berry_bush"), () -> new SweetBerryBushData(Block.SWEET_BERRY_BUSH, 20739), null);

    public static final Block<RotatedPillarData> WARPED_STEM = new Block<>(860, 20743, NamespacedKey.parse("minecraft:warped_stem"), () -> new RotatedPillarData(Block.WARPED_STEM, 20743), () -> Item.WARPED_STEM);

    public static final Block<RotatedPillarData> STRIPPED_WARPED_STEM = new Block<>(861, 20746, NamespacedKey.parse("minecraft:stripped_warped_stem"), () -> new RotatedPillarData(Block.STRIPPED_WARPED_STEM, 20746), () -> Item.STRIPPED_WARPED_STEM);

    public static final Block<RotatedPillarData> WARPED_HYPHAE = new Block<>(862, 20749, NamespacedKey.parse("minecraft:warped_hyphae"), () -> new RotatedPillarData(Block.WARPED_HYPHAE, 20749), () -> Item.WARPED_HYPHAE);

    public static final Block<RotatedPillarData> STRIPPED_WARPED_HYPHAE = new Block<>(863, 20752, NamespacedKey.parse("minecraft:stripped_warped_hyphae"), () -> new RotatedPillarData(Block.STRIPPED_WARPED_HYPHAE, 20752), () -> Item.STRIPPED_WARPED_HYPHAE);

    public static final Block<BlockData> WARPED_NYLIUM = new Block<>(864, 20755, NamespacedKey.parse("minecraft:warped_nylium"), () -> new BlockData(Block.WARPED_NYLIUM, 20755), () -> Item.WARPED_NYLIUM);

    public static final Block<BlockData> WARPED_FUNGUS = new Block<>(865, 20756, NamespacedKey.parse("minecraft:warped_fungus"), () -> new BlockData(Block.WARPED_FUNGUS, 20756), () -> Item.WARPED_FUNGUS);

    public static final Block<BlockData> WARPED_WART_BLOCK = new Block<>(866, 20757, NamespacedKey.parse("minecraft:warped_wart_block"), () -> new BlockData(Block.WARPED_WART_BLOCK, 20757), () -> Item.WARPED_WART_BLOCK);

    public static final Block<BlockData> WARPED_ROOTS = new Block<>(867, 20758, NamespacedKey.parse("minecraft:warped_roots"), () -> new BlockData(Block.WARPED_ROOTS, 20758), () -> Item.WARPED_ROOTS);

    public static final Block<BlockData> NETHER_SPROUTS = new Block<>(868, 20759, NamespacedKey.parse("minecraft:nether_sprouts"), () -> new BlockData(Block.NETHER_SPROUTS, 20759), () -> Item.NETHER_SPROUTS);

    public static final Block<RotatedPillarData> CRIMSON_STEM = new Block<>(869, 20760, NamespacedKey.parse("minecraft:crimson_stem"), () -> new RotatedPillarData(Block.CRIMSON_STEM, 20760), () -> Item.CRIMSON_STEM);

    public static final Block<RotatedPillarData> STRIPPED_CRIMSON_STEM = new Block<>(870, 20763, NamespacedKey.parse("minecraft:stripped_crimson_stem"), () -> new RotatedPillarData(Block.STRIPPED_CRIMSON_STEM, 20763), () -> Item.STRIPPED_CRIMSON_STEM);

    public static final Block<RotatedPillarData> CRIMSON_HYPHAE = new Block<>(871, 20766, NamespacedKey.parse("minecraft:crimson_hyphae"), () -> new RotatedPillarData(Block.CRIMSON_HYPHAE, 20766), () -> Item.CRIMSON_HYPHAE);

    public static final Block<RotatedPillarData> STRIPPED_CRIMSON_HYPHAE = new Block<>(872, 20769, NamespacedKey.parse("minecraft:stripped_crimson_hyphae"), () -> new RotatedPillarData(Block.STRIPPED_CRIMSON_HYPHAE, 20769), () -> Item.STRIPPED_CRIMSON_HYPHAE);

    public static final Block<BlockData> CRIMSON_NYLIUM = new Block<>(873, 20772, NamespacedKey.parse("minecraft:crimson_nylium"), () -> new BlockData(Block.CRIMSON_NYLIUM, 20772), () -> Item.CRIMSON_NYLIUM);

    public static final Block<BlockData> CRIMSON_FUNGUS = new Block<>(874, 20773, NamespacedKey.parse("minecraft:crimson_fungus"), () -> new BlockData(Block.CRIMSON_FUNGUS, 20773), () -> Item.CRIMSON_FUNGUS);

    public static final Block<BlockData> SHROOMLIGHT = new Block<>(875, 20774, NamespacedKey.parse("minecraft:shroomlight"), () -> new BlockData(Block.SHROOMLIGHT, 20774), () -> Item.SHROOMLIGHT);

    public static final Block<WeepingVinesData> WEEPING_VINES = new Block<>(876, 20775, NamespacedKey.parse("minecraft:weeping_vines"), () -> new WeepingVinesData(Block.WEEPING_VINES, 20775), () -> Item.WEEPING_VINES);

    public static final Block<BlockData> WEEPING_VINES_PLANT = new Block<>(877, 20801, NamespacedKey.parse("minecraft:weeping_vines_plant"), () -> new BlockData(Block.WEEPING_VINES_PLANT, 20801), null);

    public static final Block<TwistingVinesData> TWISTING_VINES = new Block<>(878, 20802, NamespacedKey.parse("minecraft:twisting_vines"), () -> new TwistingVinesData(Block.TWISTING_VINES, 20802), () -> Item.TWISTING_VINES);

    public static final Block<BlockData> TWISTING_VINES_PLANT = new Block<>(879, 20828, NamespacedKey.parse("minecraft:twisting_vines_plant"), () -> new BlockData(Block.TWISTING_VINES_PLANT, 20828), null);

    public static final Block<BlockData> CRIMSON_ROOTS = new Block<>(880, 20829, NamespacedKey.parse("minecraft:crimson_roots"), () -> new BlockData(Block.CRIMSON_ROOTS, 20829), () -> Item.CRIMSON_ROOTS);

    public static final Block<BlockData> CRIMSON_PLANKS = new Block<>(881, 20830, NamespacedKey.parse("minecraft:crimson_planks"), () -> new BlockData(Block.CRIMSON_PLANKS, 20830), () -> Item.CRIMSON_PLANKS);

    public static final Block<BlockData> WARPED_PLANKS = new Block<>(882, 20831, NamespacedKey.parse("minecraft:warped_planks"), () -> new BlockData(Block.WARPED_PLANKS, 20831), () -> Item.WARPED_PLANKS);

    public static final Block<SlabData> CRIMSON_SLAB = new Block<>(883, 20832, NamespacedKey.parse("minecraft:crimson_slab"), () -> new SlabData(Block.CRIMSON_SLAB, 20832), () -> Item.CRIMSON_SLAB);

    public static final Block<SlabData> WARPED_SLAB = new Block<>(884, 20838, NamespacedKey.parse("minecraft:warped_slab"), () -> new SlabData(Block.WARPED_SLAB, 20838), () -> Item.WARPED_SLAB);

    public static final Block<PressurePlateData> CRIMSON_PRESSURE_PLATE = new Block<>(885, 20844, NamespacedKey.parse("minecraft:crimson_pressure_plate"), () -> new PressurePlateData(Block.CRIMSON_PRESSURE_PLATE, 20844), () -> Item.CRIMSON_PRESSURE_PLATE);

    public static final Block<PressurePlateData> WARPED_PRESSURE_PLATE = new Block<>(886, 20846, NamespacedKey.parse("minecraft:warped_pressure_plate"), () -> new PressurePlateData(Block.WARPED_PRESSURE_PLATE, 20846), () -> Item.WARPED_PRESSURE_PLATE);

    public static final Block<FenceData> CRIMSON_FENCE = new Block<>(887, 20848, NamespacedKey.parse("minecraft:crimson_fence"), () -> new FenceData(Block.CRIMSON_FENCE, 20848), () -> Item.CRIMSON_FENCE);

    public static final Block<FenceData> WARPED_FENCE = new Block<>(888, 20880, NamespacedKey.parse("minecraft:warped_fence"), () -> new FenceData(Block.WARPED_FENCE, 20880), () -> Item.WARPED_FENCE);

    public static final Block<TrapdoorData> CRIMSON_TRAPDOOR = new Block<>(889, 20912, NamespacedKey.parse("minecraft:crimson_trapdoor"), () -> new TrapdoorData(Block.CRIMSON_TRAPDOOR, 20912), () -> Item.CRIMSON_TRAPDOOR);

    public static final Block<TrapdoorData> WARPED_TRAPDOOR = new Block<>(890, 20976, NamespacedKey.parse("minecraft:warped_trapdoor"), () -> new TrapdoorData(Block.WARPED_TRAPDOOR, 20976), () -> Item.WARPED_TRAPDOOR);

    public static final Block<FenceGateData> CRIMSON_FENCE_GATE = new Block<>(891, 21040, NamespacedKey.parse("minecraft:crimson_fence_gate"), () -> new FenceGateData(Block.CRIMSON_FENCE_GATE, 21040), () -> Item.CRIMSON_FENCE_GATE);

    public static final Block<FenceGateData> WARPED_FENCE_GATE = new Block<>(892, 21072, NamespacedKey.parse("minecraft:warped_fence_gate"), () -> new FenceGateData(Block.WARPED_FENCE_GATE, 21072), () -> Item.WARPED_FENCE_GATE);

    public static final Block<StairData> CRIMSON_STAIRS = new Block<>(893, 21104, NamespacedKey.parse("minecraft:crimson_stairs"), () -> new StairData(Block.CRIMSON_STAIRS, 21104), () -> Item.CRIMSON_STAIRS);

    public static final Block<StairData> WARPED_STAIRS = new Block<>(894, 21184, NamespacedKey.parse("minecraft:warped_stairs"), () -> new StairData(Block.WARPED_STAIRS, 21184), () -> Item.WARPED_STAIRS);

    public static final Block<ButtonData> CRIMSON_BUTTON = new Block<>(895, 21264, NamespacedKey.parse("minecraft:crimson_button"), () -> new ButtonData(Block.CRIMSON_BUTTON, 21264), () -> Item.CRIMSON_BUTTON);

    public static final Block<ButtonData> WARPED_BUTTON = new Block<>(896, 21288, NamespacedKey.parse("minecraft:warped_button"), () -> new ButtonData(Block.WARPED_BUTTON, 21288), () -> Item.WARPED_BUTTON);

    public static final Block<DoorData> CRIMSON_DOOR = new Block<>(897, 21312, NamespacedKey.parse("minecraft:crimson_door"), () -> new DoorData(Block.CRIMSON_DOOR, 21312), () -> Item.CRIMSON_DOOR);

    public static final Block<DoorData> WARPED_DOOR = new Block<>(898, 21376, NamespacedKey.parse("minecraft:warped_door"), () -> new DoorData(Block.WARPED_DOOR, 21376), () -> Item.WARPED_DOOR);

    public static final Block<StandingSignData> CRIMSON_SIGN = new Block<>(899, 21440, NamespacedKey.parse("minecraft:crimson_sign"), () -> new StandingSignData(Block.CRIMSON_SIGN, 21440), () -> Item.CRIMSON_SIGN);

    public static final Block<StandingSignData> WARPED_SIGN = new Block<>(900, 21472, NamespacedKey.parse("minecraft:warped_sign"), () -> new StandingSignData(Block.WARPED_SIGN, 21472), () -> Item.WARPED_SIGN);

    public static final Block<WallSignData> CRIMSON_WALL_SIGN = new Block<>(901, 21504, NamespacedKey.parse("minecraft:crimson_wall_sign"), () -> new WallSignData(Block.CRIMSON_WALL_SIGN, 21504), null);

    public static final Block<WallSignData> WARPED_WALL_SIGN = new Block<>(902, 21512, NamespacedKey.parse("minecraft:warped_wall_sign"), () -> new WallSignData(Block.WARPED_WALL_SIGN, 21512), null);

    public static final Block<StructureData> STRUCTURE_BLOCK = new Block<>(903, 21520, NamespacedKey.parse("minecraft:structure_block"), () -> new StructureData(Block.STRUCTURE_BLOCK, 21520), () -> Item.STRUCTURE_BLOCK);

    public static final Block<JigsawData> JIGSAW = new Block<>(904, 21524, NamespacedKey.parse("minecraft:jigsaw"), () -> new JigsawData(Block.JIGSAW, 21524), () -> Item.JIGSAW);

    public static final Block<TestData> TEST_BLOCK = new Block<>(905, 21536, NamespacedKey.parse("minecraft:test_block"), () -> new TestData(Block.TEST_BLOCK, 21536), () -> Item.TEST_BLOCK);

    public static final Block<BlockData> TEST_INSTANCE_BLOCK = new Block<>(906, 21540, NamespacedKey.parse("minecraft:test_instance_block"), () -> new BlockData(Block.TEST_INSTANCE_BLOCK, 21540), () -> Item.TEST_INSTANCE_BLOCK);

    public static final Block<ComposterData> COMPOSTER = new Block<>(907, 21541, NamespacedKey.parse("minecraft:composter"), () -> new ComposterData(Block.COMPOSTER, 21541), () -> Item.COMPOSTER);

    public static final Block<TargetData> TARGET = new Block<>(908, 21550, NamespacedKey.parse("minecraft:target"), () -> new TargetData(Block.TARGET, 21550), () -> Item.TARGET);

    public static final Block<BeehiveData> BEE_NEST = new Block<>(909, 21566, NamespacedKey.parse("minecraft:bee_nest"), () -> new BeehiveData(Block.BEE_NEST, 21566), () -> Item.BEE_NEST);

    public static final Block<BeehiveData> BEEHIVE = new Block<>(910, 21590, NamespacedKey.parse("minecraft:beehive"), () -> new BeehiveData(Block.BEEHIVE, 21590), () -> Item.BEEHIVE);

    public static final Block<BlockData> HONEY_BLOCK = new Block<>(911, 21614, NamespacedKey.parse("minecraft:honey_block"), () -> new BlockData(Block.HONEY_BLOCK, 21614), () -> Item.HONEY_BLOCK);

    public static final Block<BlockData> HONEYCOMB_BLOCK = new Block<>(912, 21615, NamespacedKey.parse("minecraft:honeycomb_block"), () -> new BlockData(Block.HONEYCOMB_BLOCK, 21615), () -> Item.HONEYCOMB_BLOCK);

    public static final Block<BlockData> NETHERITE_BLOCK = new Block<>(913, 21616, NamespacedKey.parse("minecraft:netherite_block"), () -> new BlockData(Block.NETHERITE_BLOCK, 21616), () -> Item.NETHERITE_BLOCK);

    public static final Block<BlockData> ANCIENT_DEBRIS = new Block<>(914, 21617, NamespacedKey.parse("minecraft:ancient_debris"), () -> new BlockData(Block.ANCIENT_DEBRIS, 21617), () -> Item.ANCIENT_DEBRIS);

    public static final Block<BlockData> CRYING_OBSIDIAN = new Block<>(915, 21618, NamespacedKey.parse("minecraft:crying_obsidian"), () -> new BlockData(Block.CRYING_OBSIDIAN, 21618), () -> Item.CRYING_OBSIDIAN);

    public static final Block<RespawnAnchorData> RESPAWN_ANCHOR = new Block<>(916, 21619, NamespacedKey.parse("minecraft:respawn_anchor"), () -> new RespawnAnchorData(Block.RESPAWN_ANCHOR, 21619), () -> Item.RESPAWN_ANCHOR);

    public static final Block<BlockData> POTTED_CRIMSON_FUNGUS = new Block<>(917, 21624, NamespacedKey.parse("minecraft:potted_crimson_fungus"), () -> new BlockData(Block.POTTED_CRIMSON_FUNGUS, 21624), null);

    public static final Block<BlockData> POTTED_WARPED_FUNGUS = new Block<>(918, 21625, NamespacedKey.parse("minecraft:potted_warped_fungus"), () -> new BlockData(Block.POTTED_WARPED_FUNGUS, 21625), null);

    public static final Block<BlockData> POTTED_CRIMSON_ROOTS = new Block<>(919, 21626, NamespacedKey.parse("minecraft:potted_crimson_roots"), () -> new BlockData(Block.POTTED_CRIMSON_ROOTS, 21626), null);

    public static final Block<BlockData> POTTED_WARPED_ROOTS = new Block<>(920, 21627, NamespacedKey.parse("minecraft:potted_warped_roots"), () -> new BlockData(Block.POTTED_WARPED_ROOTS, 21627), null);

    public static final Block<BlockData> LODESTONE = new Block<>(921, 21628, NamespacedKey.parse("minecraft:lodestone"), () -> new BlockData(Block.LODESTONE, 21628), () -> Item.LODESTONE);

    public static final Block<BlockData> BLACKSTONE = new Block<>(922, 21629, NamespacedKey.parse("minecraft:blackstone"), () -> new BlockData(Block.BLACKSTONE, 21629), () -> Item.BLACKSTONE);

    public static final Block<StairData> BLACKSTONE_STAIRS = new Block<>(923, 21630, NamespacedKey.parse("minecraft:blackstone_stairs"), () -> new StairData(Block.BLACKSTONE_STAIRS, 21630), () -> Item.BLACKSTONE_STAIRS);

    public static final Block<WallData> BLACKSTONE_WALL = new Block<>(924, 21710, NamespacedKey.parse("minecraft:blackstone_wall"), () -> new WallData(Block.BLACKSTONE_WALL, 21710), () -> Item.BLACKSTONE_WALL);

    public static final Block<SlabData> BLACKSTONE_SLAB = new Block<>(925, 22034, NamespacedKey.parse("minecraft:blackstone_slab"), () -> new SlabData(Block.BLACKSTONE_SLAB, 22034), () -> Item.BLACKSTONE_SLAB);

    public static final Block<BlockData> POLISHED_BLACKSTONE = new Block<>(926, 22040, NamespacedKey.parse("minecraft:polished_blackstone"), () -> new BlockData(Block.POLISHED_BLACKSTONE, 22040), () -> Item.POLISHED_BLACKSTONE);

    public static final Block<BlockData> POLISHED_BLACKSTONE_BRICKS = new Block<>(927, 22041, NamespacedKey.parse("minecraft:polished_blackstone_bricks"), () -> new BlockData(Block.POLISHED_BLACKSTONE_BRICKS, 22041), () -> Item.POLISHED_BLACKSTONE_BRICKS);

    public static final Block<BlockData> CRACKED_POLISHED_BLACKSTONE_BRICKS = new Block<>(928, 22042, NamespacedKey.parse("minecraft:cracked_polished_blackstone_bricks"), () -> new BlockData(Block.CRACKED_POLISHED_BLACKSTONE_BRICKS, 22042), () -> Item.CRACKED_POLISHED_BLACKSTONE_BRICKS);

    public static final Block<BlockData> CHISELED_POLISHED_BLACKSTONE = new Block<>(929, 22043, NamespacedKey.parse("minecraft:chiseled_polished_blackstone"), () -> new BlockData(Block.CHISELED_POLISHED_BLACKSTONE, 22043), () -> Item.CHISELED_POLISHED_BLACKSTONE);

    public static final Block<SlabData> POLISHED_BLACKSTONE_BRICK_SLAB = new Block<>(930, 22044, NamespacedKey.parse("minecraft:polished_blackstone_brick_slab"), () -> new SlabData(Block.POLISHED_BLACKSTONE_BRICK_SLAB, 22044), () -> Item.POLISHED_BLACKSTONE_BRICK_SLAB);

    public static final Block<StairData> POLISHED_BLACKSTONE_BRICK_STAIRS = new Block<>(931, 22050, NamespacedKey.parse("minecraft:polished_blackstone_brick_stairs"), () -> new StairData(Block.POLISHED_BLACKSTONE_BRICK_STAIRS, 22050), () -> Item.POLISHED_BLACKSTONE_BRICK_STAIRS);

    public static final Block<WallData> POLISHED_BLACKSTONE_BRICK_WALL = new Block<>(932, 22130, NamespacedKey.parse("minecraft:polished_blackstone_brick_wall"), () -> new WallData(Block.POLISHED_BLACKSTONE_BRICK_WALL, 22130), () -> Item.POLISHED_BLACKSTONE_BRICK_WALL);

    public static final Block<BlockData> GILDED_BLACKSTONE = new Block<>(933, 22454, NamespacedKey.parse("minecraft:gilded_blackstone"), () -> new BlockData(Block.GILDED_BLACKSTONE, 22454), () -> Item.GILDED_BLACKSTONE);

    public static final Block<StairData> POLISHED_BLACKSTONE_STAIRS = new Block<>(934, 22455, NamespacedKey.parse("minecraft:polished_blackstone_stairs"), () -> new StairData(Block.POLISHED_BLACKSTONE_STAIRS, 22455), () -> Item.POLISHED_BLACKSTONE_STAIRS);

    public static final Block<SlabData> POLISHED_BLACKSTONE_SLAB = new Block<>(935, 22535, NamespacedKey.parse("minecraft:polished_blackstone_slab"), () -> new SlabData(Block.POLISHED_BLACKSTONE_SLAB, 22535), () -> Item.POLISHED_BLACKSTONE_SLAB);

    public static final Block<PressurePlateData> POLISHED_BLACKSTONE_PRESSURE_PLATE = new Block<>(936, 22541, NamespacedKey.parse("minecraft:polished_blackstone_pressure_plate"), () -> new PressurePlateData(Block.POLISHED_BLACKSTONE_PRESSURE_PLATE, 22541), () -> Item.POLISHED_BLACKSTONE_PRESSURE_PLATE);

    public static final Block<ButtonData> POLISHED_BLACKSTONE_BUTTON = new Block<>(937, 22543, NamespacedKey.parse("minecraft:polished_blackstone_button"), () -> new ButtonData(Block.POLISHED_BLACKSTONE_BUTTON, 22543), () -> Item.POLISHED_BLACKSTONE_BUTTON);

    public static final Block<WallData> POLISHED_BLACKSTONE_WALL = new Block<>(938, 22567, NamespacedKey.parse("minecraft:polished_blackstone_wall"), () -> new WallData(Block.POLISHED_BLACKSTONE_WALL, 22567), () -> Item.POLISHED_BLACKSTONE_WALL);

    public static final Block<BlockData> CHISELED_NETHER_BRICKS = new Block<>(939, 22891, NamespacedKey.parse("minecraft:chiseled_nether_bricks"), () -> new BlockData(Block.CHISELED_NETHER_BRICKS, 22891), () -> Item.CHISELED_NETHER_BRICKS);

    public static final Block<BlockData> CRACKED_NETHER_BRICKS = new Block<>(940, 22892, NamespacedKey.parse("minecraft:cracked_nether_bricks"), () -> new BlockData(Block.CRACKED_NETHER_BRICKS, 22892), () -> Item.CRACKED_NETHER_BRICKS);

    public static final Block<BlockData> QUARTZ_BRICKS = new Block<>(941, 22893, NamespacedKey.parse("minecraft:quartz_bricks"), () -> new BlockData(Block.QUARTZ_BRICKS, 22893), () -> Item.QUARTZ_BRICKS);

    public static final Block<CandleData> CANDLE = new Block<>(942, 22894, NamespacedKey.parse("minecraft:candle"), () -> new CandleData(Block.CANDLE, 22894), () -> Item.CANDLE);

    public static final Block<CandleData> WHITE_CANDLE = new Block<>(943, 22910, NamespacedKey.parse("minecraft:white_candle"), () -> new CandleData(Block.WHITE_CANDLE, 22910), () -> Item.WHITE_CANDLE);

    public static final Block<CandleData> ORANGE_CANDLE = new Block<>(944, 22926, NamespacedKey.parse("minecraft:orange_candle"), () -> new CandleData(Block.ORANGE_CANDLE, 22926), () -> Item.ORANGE_CANDLE);

    public static final Block<CandleData> MAGENTA_CANDLE = new Block<>(945, 22942, NamespacedKey.parse("minecraft:magenta_candle"), () -> new CandleData(Block.MAGENTA_CANDLE, 22942), () -> Item.MAGENTA_CANDLE);

    public static final Block<CandleData> LIGHT_BLUE_CANDLE = new Block<>(946, 22958, NamespacedKey.parse("minecraft:light_blue_candle"), () -> new CandleData(Block.LIGHT_BLUE_CANDLE, 22958), () -> Item.LIGHT_BLUE_CANDLE);

    public static final Block<CandleData> YELLOW_CANDLE = new Block<>(947, 22974, NamespacedKey.parse("minecraft:yellow_candle"), () -> new CandleData(Block.YELLOW_CANDLE, 22974), () -> Item.YELLOW_CANDLE);

    public static final Block<CandleData> LIME_CANDLE = new Block<>(948, 22990, NamespacedKey.parse("minecraft:lime_candle"), () -> new CandleData(Block.LIME_CANDLE, 22990), () -> Item.LIME_CANDLE);

    public static final Block<CandleData> PINK_CANDLE = new Block<>(949, 23006, NamespacedKey.parse("minecraft:pink_candle"), () -> new CandleData(Block.PINK_CANDLE, 23006), () -> Item.PINK_CANDLE);

    public static final Block<CandleData> GRAY_CANDLE = new Block<>(950, 23022, NamespacedKey.parse("minecraft:gray_candle"), () -> new CandleData(Block.GRAY_CANDLE, 23022), () -> Item.GRAY_CANDLE);

    public static final Block<CandleData> LIGHT_GRAY_CANDLE = new Block<>(951, 23038, NamespacedKey.parse("minecraft:light_gray_candle"), () -> new CandleData(Block.LIGHT_GRAY_CANDLE, 23038), () -> Item.LIGHT_GRAY_CANDLE);

    public static final Block<CandleData> CYAN_CANDLE = new Block<>(952, 23054, NamespacedKey.parse("minecraft:cyan_candle"), () -> new CandleData(Block.CYAN_CANDLE, 23054), () -> Item.CYAN_CANDLE);

    public static final Block<CandleData> PURPLE_CANDLE = new Block<>(953, 23070, NamespacedKey.parse("minecraft:purple_candle"), () -> new CandleData(Block.PURPLE_CANDLE, 23070), () -> Item.PURPLE_CANDLE);

    public static final Block<CandleData> BLUE_CANDLE = new Block<>(954, 23086, NamespacedKey.parse("minecraft:blue_candle"), () -> new CandleData(Block.BLUE_CANDLE, 23086), () -> Item.BLUE_CANDLE);

    public static final Block<CandleData> BROWN_CANDLE = new Block<>(955, 23102, NamespacedKey.parse("minecraft:brown_candle"), () -> new CandleData(Block.BROWN_CANDLE, 23102), () -> Item.BROWN_CANDLE);

    public static final Block<CandleData> GREEN_CANDLE = new Block<>(956, 23118, NamespacedKey.parse("minecraft:green_candle"), () -> new CandleData(Block.GREEN_CANDLE, 23118), () -> Item.GREEN_CANDLE);

    public static final Block<CandleData> RED_CANDLE = new Block<>(957, 23134, NamespacedKey.parse("minecraft:red_candle"), () -> new CandleData(Block.RED_CANDLE, 23134), () -> Item.RED_CANDLE);

    public static final Block<CandleData> BLACK_CANDLE = new Block<>(958, 23150, NamespacedKey.parse("minecraft:black_candle"), () -> new CandleData(Block.BLACK_CANDLE, 23150), () -> Item.BLACK_CANDLE);

    public static final Block<CandleCakeData> CANDLE_CAKE = new Block<>(959, 23166, NamespacedKey.parse("minecraft:candle_cake"), () -> new CandleCakeData(Block.CANDLE_CAKE, 23166), null);

    public static final Block<CandleCakeData> WHITE_CANDLE_CAKE = new Block<>(960, 23168, NamespacedKey.parse("minecraft:white_candle_cake"), () -> new CandleCakeData(Block.WHITE_CANDLE_CAKE, 23168), null);

    public static final Block<CandleCakeData> ORANGE_CANDLE_CAKE = new Block<>(961, 23170, NamespacedKey.parse("minecraft:orange_candle_cake"), () -> new CandleCakeData(Block.ORANGE_CANDLE_CAKE, 23170), null);

    public static final Block<CandleCakeData> MAGENTA_CANDLE_CAKE = new Block<>(962, 23172, NamespacedKey.parse("minecraft:magenta_candle_cake"), () -> new CandleCakeData(Block.MAGENTA_CANDLE_CAKE, 23172), null);

    public static final Block<CandleCakeData> LIGHT_BLUE_CANDLE_CAKE = new Block<>(963, 23174, NamespacedKey.parse("minecraft:light_blue_candle_cake"), () -> new CandleCakeData(Block.LIGHT_BLUE_CANDLE_CAKE, 23174), null);

    public static final Block<CandleCakeData> YELLOW_CANDLE_CAKE = new Block<>(964, 23176, NamespacedKey.parse("minecraft:yellow_candle_cake"), () -> new CandleCakeData(Block.YELLOW_CANDLE_CAKE, 23176), null);

    public static final Block<CandleCakeData> LIME_CANDLE_CAKE = new Block<>(965, 23178, NamespacedKey.parse("minecraft:lime_candle_cake"), () -> new CandleCakeData(Block.LIME_CANDLE_CAKE, 23178), null);

    public static final Block<CandleCakeData> PINK_CANDLE_CAKE = new Block<>(966, 23180, NamespacedKey.parse("minecraft:pink_candle_cake"), () -> new CandleCakeData(Block.PINK_CANDLE_CAKE, 23180), null);

    public static final Block<CandleCakeData> GRAY_CANDLE_CAKE = new Block<>(967, 23182, NamespacedKey.parse("minecraft:gray_candle_cake"), () -> new CandleCakeData(Block.GRAY_CANDLE_CAKE, 23182), null);

    public static final Block<CandleCakeData> LIGHT_GRAY_CANDLE_CAKE = new Block<>(968, 23184, NamespacedKey.parse("minecraft:light_gray_candle_cake"), () -> new CandleCakeData(Block.LIGHT_GRAY_CANDLE_CAKE, 23184), null);

    public static final Block<CandleCakeData> CYAN_CANDLE_CAKE = new Block<>(969, 23186, NamespacedKey.parse("minecraft:cyan_candle_cake"), () -> new CandleCakeData(Block.CYAN_CANDLE_CAKE, 23186), null);

    public static final Block<CandleCakeData> PURPLE_CANDLE_CAKE = new Block<>(970, 23188, NamespacedKey.parse("minecraft:purple_candle_cake"), () -> new CandleCakeData(Block.PURPLE_CANDLE_CAKE, 23188), null);

    public static final Block<CandleCakeData> BLUE_CANDLE_CAKE = new Block<>(971, 23190, NamespacedKey.parse("minecraft:blue_candle_cake"), () -> new CandleCakeData(Block.BLUE_CANDLE_CAKE, 23190), null);

    public static final Block<CandleCakeData> BROWN_CANDLE_CAKE = new Block<>(972, 23192, NamespacedKey.parse("minecraft:brown_candle_cake"), () -> new CandleCakeData(Block.BROWN_CANDLE_CAKE, 23192), null);

    public static final Block<CandleCakeData> GREEN_CANDLE_CAKE = new Block<>(973, 23194, NamespacedKey.parse("minecraft:green_candle_cake"), () -> new CandleCakeData(Block.GREEN_CANDLE_CAKE, 23194), null);

    public static final Block<CandleCakeData> RED_CANDLE_CAKE = new Block<>(974, 23196, NamespacedKey.parse("minecraft:red_candle_cake"), () -> new CandleCakeData(Block.RED_CANDLE_CAKE, 23196), null);

    public static final Block<CandleCakeData> BLACK_CANDLE_CAKE = new Block<>(975, 23198, NamespacedKey.parse("minecraft:black_candle_cake"), () -> new CandleCakeData(Block.BLACK_CANDLE_CAKE, 23198), null);

    public static final Block<BlockData> AMETHYST_BLOCK = new Block<>(976, 23200, NamespacedKey.parse("minecraft:amethyst_block"), () -> new BlockData(Block.AMETHYST_BLOCK, 23200), () -> Item.AMETHYST_BLOCK);

    public static final Block<BlockData> BUDDING_AMETHYST = new Block<>(977, 23201, NamespacedKey.parse("minecraft:budding_amethyst"), () -> new BlockData(Block.BUDDING_AMETHYST, 23201), () -> Item.BUDDING_AMETHYST);

    public static final Block<AmethystClusterData> AMETHYST_CLUSTER = new Block<>(978, 23202, NamespacedKey.parse("minecraft:amethyst_cluster"), () -> new AmethystClusterData(Block.AMETHYST_CLUSTER, 23202), () -> Item.AMETHYST_CLUSTER);

    public static final Block<AmethystClusterData> LARGE_AMETHYST_BUD = new Block<>(979, 23214, NamespacedKey.parse("minecraft:large_amethyst_bud"), () -> new AmethystClusterData(Block.LARGE_AMETHYST_BUD, 23214), () -> Item.LARGE_AMETHYST_BUD);

    public static final Block<AmethystClusterData> MEDIUM_AMETHYST_BUD = new Block<>(980, 23226, NamespacedKey.parse("minecraft:medium_amethyst_bud"), () -> new AmethystClusterData(Block.MEDIUM_AMETHYST_BUD, 23226), () -> Item.MEDIUM_AMETHYST_BUD);

    public static final Block<AmethystClusterData> SMALL_AMETHYST_BUD = new Block<>(981, 23238, NamespacedKey.parse("minecraft:small_amethyst_bud"), () -> new AmethystClusterData(Block.SMALL_AMETHYST_BUD, 23238), () -> Item.SMALL_AMETHYST_BUD);

    public static final Block<BlockData> TUFF = new Block<>(982, 23250, NamespacedKey.parse("minecraft:tuff"), () -> new BlockData(Block.TUFF, 23250), () -> Item.TUFF);

    public static final Block<SlabData> TUFF_SLAB = new Block<>(983, 23251, NamespacedKey.parse("minecraft:tuff_slab"), () -> new SlabData(Block.TUFF_SLAB, 23251), () -> Item.TUFF_SLAB);

    public static final Block<StairData> TUFF_STAIRS = new Block<>(984, 23257, NamespacedKey.parse("minecraft:tuff_stairs"), () -> new StairData(Block.TUFF_STAIRS, 23257), () -> Item.TUFF_STAIRS);

    public static final Block<WallData> TUFF_WALL = new Block<>(985, 23337, NamespacedKey.parse("minecraft:tuff_wall"), () -> new WallData(Block.TUFF_WALL, 23337), () -> Item.TUFF_WALL);

    public static final Block<BlockData> POLISHED_TUFF = new Block<>(986, 23661, NamespacedKey.parse("minecraft:polished_tuff"), () -> new BlockData(Block.POLISHED_TUFF, 23661), () -> Item.POLISHED_TUFF);

    public static final Block<SlabData> POLISHED_TUFF_SLAB = new Block<>(987, 23662, NamespacedKey.parse("minecraft:polished_tuff_slab"), () -> new SlabData(Block.POLISHED_TUFF_SLAB, 23662), () -> Item.POLISHED_TUFF_SLAB);

    public static final Block<StairData> POLISHED_TUFF_STAIRS = new Block<>(988, 23668, NamespacedKey.parse("minecraft:polished_tuff_stairs"), () -> new StairData(Block.POLISHED_TUFF_STAIRS, 23668), () -> Item.POLISHED_TUFF_STAIRS);

    public static final Block<WallData> POLISHED_TUFF_WALL = new Block<>(989, 23748, NamespacedKey.parse("minecraft:polished_tuff_wall"), () -> new WallData(Block.POLISHED_TUFF_WALL, 23748), () -> Item.POLISHED_TUFF_WALL);

    public static final Block<BlockData> CHISELED_TUFF = new Block<>(990, 24072, NamespacedKey.parse("minecraft:chiseled_tuff"), () -> new BlockData(Block.CHISELED_TUFF, 24072), () -> Item.CHISELED_TUFF);

    public static final Block<BlockData> TUFF_BRICKS = new Block<>(991, 24073, NamespacedKey.parse("minecraft:tuff_bricks"), () -> new BlockData(Block.TUFF_BRICKS, 24073), () -> Item.TUFF_BRICKS);

    public static final Block<SlabData> TUFF_BRICK_SLAB = new Block<>(992, 24074, NamespacedKey.parse("minecraft:tuff_brick_slab"), () -> new SlabData(Block.TUFF_BRICK_SLAB, 24074), () -> Item.TUFF_BRICK_SLAB);

    public static final Block<StairData> TUFF_BRICK_STAIRS = new Block<>(993, 24080, NamespacedKey.parse("minecraft:tuff_brick_stairs"), () -> new StairData(Block.TUFF_BRICK_STAIRS, 24080), () -> Item.TUFF_BRICK_STAIRS);

    public static final Block<WallData> TUFF_BRICK_WALL = new Block<>(994, 24160, NamespacedKey.parse("minecraft:tuff_brick_wall"), () -> new WallData(Block.TUFF_BRICK_WALL, 24160), () -> Item.TUFF_BRICK_WALL);

    public static final Block<BlockData> CHISELED_TUFF_BRICKS = new Block<>(995, 24484, NamespacedKey.parse("minecraft:chiseled_tuff_bricks"), () -> new BlockData(Block.CHISELED_TUFF_BRICKS, 24484), () -> Item.CHISELED_TUFF_BRICKS);

    public static final Block<BlockData> CALCITE = new Block<>(996, 24485, NamespacedKey.parse("minecraft:calcite"), () -> new BlockData(Block.CALCITE, 24485), () -> Item.CALCITE);

    public static final Block<BlockData> TINTED_GLASS = new Block<>(997, 24486, NamespacedKey.parse("minecraft:tinted_glass"), () -> new BlockData(Block.TINTED_GLASS, 24486), () -> Item.TINTED_GLASS);

    public static final Block<BlockData> POWDER_SNOW = new Block<>(998, 24487, NamespacedKey.parse("minecraft:powder_snow"), () -> new BlockData(Block.POWDER_SNOW, 24487), null);

    public static final Block<SculkSensorData> SCULK_SENSOR = new Block<>(999, 24488, NamespacedKey.parse("minecraft:sculk_sensor"), () -> new SculkSensorData(Block.SCULK_SENSOR, 24488), () -> Item.SCULK_SENSOR);

    public static final Block<CalibratedSculkSensorData> CALIBRATED_SCULK_SENSOR = new Block<>(1000, 24584, NamespacedKey.parse("minecraft:calibrated_sculk_sensor"), () -> new CalibratedSculkSensorData(Block.CALIBRATED_SCULK_SENSOR, 24584), () -> Item.CALIBRATED_SCULK_SENSOR);

    public static final Block<BlockData> SCULK = new Block<>(1001, 24968, NamespacedKey.parse("minecraft:sculk"), () -> new BlockData(Block.SCULK, 24968), () -> Item.SCULK);

    public static final Block<SculkVeinData> SCULK_VEIN = new Block<>(1002, 24969, NamespacedKey.parse("minecraft:sculk_vein"), () -> new SculkVeinData(Block.SCULK_VEIN, 24969), () -> Item.SCULK_VEIN);

    public static final Block<SculkCatalystData> SCULK_CATALYST = new Block<>(1003, 25097, NamespacedKey.parse("minecraft:sculk_catalyst"), () -> new SculkCatalystData(Block.SCULK_CATALYST, 25097), () -> Item.SCULK_CATALYST);

    public static final Block<SculkShriekerData> SCULK_SHRIEKER = new Block<>(1004, 25099, NamespacedKey.parse("minecraft:sculk_shrieker"), () -> new SculkShriekerData(Block.SCULK_SHRIEKER, 25099), () -> Item.SCULK_SHRIEKER);

    public static final Block<BlockData> COPPER_BLOCK = new Block<>(1005, 25107, NamespacedKey.parse("minecraft:copper_block"), () -> new BlockData(Block.COPPER_BLOCK, 25107), () -> Item.COPPER_BLOCK);

    public static final Block<BlockData> EXPOSED_COPPER = new Block<>(1006, 25108, NamespacedKey.parse("minecraft:exposed_copper"), () -> new BlockData(Block.EXPOSED_COPPER, 25108), () -> Item.EXPOSED_COPPER);

    public static final Block<BlockData> WEATHERED_COPPER = new Block<>(1007, 25109, NamespacedKey.parse("minecraft:weathered_copper"), () -> new BlockData(Block.WEATHERED_COPPER, 25109), () -> Item.WEATHERED_COPPER);

    public static final Block<BlockData> OXIDIZED_COPPER = new Block<>(1008, 25110, NamespacedKey.parse("minecraft:oxidized_copper"), () -> new BlockData(Block.OXIDIZED_COPPER, 25110), () -> Item.OXIDIZED_COPPER);

    public static final Block<BlockData> COPPER_ORE = new Block<>(1009, 25111, NamespacedKey.parse("minecraft:copper_ore"), () -> new BlockData(Block.COPPER_ORE, 25111), () -> Item.COPPER_ORE);

    public static final Block<BlockData> DEEPSLATE_COPPER_ORE = new Block<>(1010, 25112, NamespacedKey.parse("minecraft:deepslate_copper_ore"), () -> new BlockData(Block.DEEPSLATE_COPPER_ORE, 25112), () -> Item.DEEPSLATE_COPPER_ORE);

    public static final Block<BlockData> OXIDIZED_CUT_COPPER = new Block<>(1011, 25113, NamespacedKey.parse("minecraft:oxidized_cut_copper"), () -> new BlockData(Block.OXIDIZED_CUT_COPPER, 25113), () -> Item.OXIDIZED_CUT_COPPER);

    public static final Block<BlockData> WEATHERED_CUT_COPPER = new Block<>(1012, 25114, NamespacedKey.parse("minecraft:weathered_cut_copper"), () -> new BlockData(Block.WEATHERED_CUT_COPPER, 25114), () -> Item.WEATHERED_CUT_COPPER);

    public static final Block<BlockData> EXPOSED_CUT_COPPER = new Block<>(1013, 25115, NamespacedKey.parse("minecraft:exposed_cut_copper"), () -> new BlockData(Block.EXPOSED_CUT_COPPER, 25115), () -> Item.EXPOSED_CUT_COPPER);

    public static final Block<BlockData> CUT_COPPER = new Block<>(1014, 25116, NamespacedKey.parse("minecraft:cut_copper"), () -> new BlockData(Block.CUT_COPPER, 25116), () -> Item.CUT_COPPER);

    public static final Block<BlockData> OXIDIZED_CHISELED_COPPER = new Block<>(1015, 25117, NamespacedKey.parse("minecraft:oxidized_chiseled_copper"), () -> new BlockData(Block.OXIDIZED_CHISELED_COPPER, 25117), () -> Item.OXIDIZED_CHISELED_COPPER);

    public static final Block<BlockData> WEATHERED_CHISELED_COPPER = new Block<>(1016, 25118, NamespacedKey.parse("minecraft:weathered_chiseled_copper"), () -> new BlockData(Block.WEATHERED_CHISELED_COPPER, 25118), () -> Item.WEATHERED_CHISELED_COPPER);

    public static final Block<BlockData> EXPOSED_CHISELED_COPPER = new Block<>(1017, 25119, NamespacedKey.parse("minecraft:exposed_chiseled_copper"), () -> new BlockData(Block.EXPOSED_CHISELED_COPPER, 25119), () -> Item.EXPOSED_CHISELED_COPPER);

    public static final Block<BlockData> CHISELED_COPPER = new Block<>(1018, 25120, NamespacedKey.parse("minecraft:chiseled_copper"), () -> new BlockData(Block.CHISELED_COPPER, 25120), () -> Item.CHISELED_COPPER);

    public static final Block<BlockData> WAXED_OXIDIZED_CHISELED_COPPER = new Block<>(1019, 25121, NamespacedKey.parse("minecraft:waxed_oxidized_chiseled_copper"), () -> new BlockData(Block.WAXED_OXIDIZED_CHISELED_COPPER, 25121), () -> Item.WAXED_OXIDIZED_CHISELED_COPPER);

    public static final Block<BlockData> WAXED_WEATHERED_CHISELED_COPPER = new Block<>(1020, 25122, NamespacedKey.parse("minecraft:waxed_weathered_chiseled_copper"), () -> new BlockData(Block.WAXED_WEATHERED_CHISELED_COPPER, 25122), () -> Item.WAXED_WEATHERED_CHISELED_COPPER);

    public static final Block<BlockData> WAXED_EXPOSED_CHISELED_COPPER = new Block<>(1021, 25123, NamespacedKey.parse("minecraft:waxed_exposed_chiseled_copper"), () -> new BlockData(Block.WAXED_EXPOSED_CHISELED_COPPER, 25123), () -> Item.WAXED_EXPOSED_CHISELED_COPPER);

    public static final Block<BlockData> WAXED_CHISELED_COPPER = new Block<>(1022, 25124, NamespacedKey.parse("minecraft:waxed_chiseled_copper"), () -> new BlockData(Block.WAXED_CHISELED_COPPER, 25124), () -> Item.WAXED_CHISELED_COPPER);

    public static final Block<WeatheringCopperStairData> OXIDIZED_CUT_COPPER_STAIRS = new Block<>(1023, 25125, NamespacedKey.parse("minecraft:oxidized_cut_copper_stairs"), () -> new WeatheringCopperStairData(Block.OXIDIZED_CUT_COPPER_STAIRS, 25125), () -> Item.OXIDIZED_CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperStairData> WEATHERED_CUT_COPPER_STAIRS = new Block<>(1024, 25205, NamespacedKey.parse("minecraft:weathered_cut_copper_stairs"), () -> new WeatheringCopperStairData(Block.WEATHERED_CUT_COPPER_STAIRS, 25205), () -> Item.WEATHERED_CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperStairData> EXPOSED_CUT_COPPER_STAIRS = new Block<>(1025, 25285, NamespacedKey.parse("minecraft:exposed_cut_copper_stairs"), () -> new WeatheringCopperStairData(Block.EXPOSED_CUT_COPPER_STAIRS, 25285), () -> Item.EXPOSED_CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperStairData> CUT_COPPER_STAIRS = new Block<>(1026, 25365, NamespacedKey.parse("minecraft:cut_copper_stairs"), () -> new WeatheringCopperStairData(Block.CUT_COPPER_STAIRS, 25365), () -> Item.CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperSlabData> OXIDIZED_CUT_COPPER_SLAB = new Block<>(1027, 25445, NamespacedKey.parse("minecraft:oxidized_cut_copper_slab"), () -> new WeatheringCopperSlabData(Block.OXIDIZED_CUT_COPPER_SLAB, 25445), () -> Item.OXIDIZED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperSlabData> WEATHERED_CUT_COPPER_SLAB = new Block<>(1028, 25451, NamespacedKey.parse("minecraft:weathered_cut_copper_slab"), () -> new WeatheringCopperSlabData(Block.WEATHERED_CUT_COPPER_SLAB, 25451), () -> Item.WEATHERED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperSlabData> EXPOSED_CUT_COPPER_SLAB = new Block<>(1029, 25457, NamespacedKey.parse("minecraft:exposed_cut_copper_slab"), () -> new WeatheringCopperSlabData(Block.EXPOSED_CUT_COPPER_SLAB, 25457), () -> Item.EXPOSED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperSlabData> CUT_COPPER_SLAB = new Block<>(1030, 25463, NamespacedKey.parse("minecraft:cut_copper_slab"), () -> new WeatheringCopperSlabData(Block.CUT_COPPER_SLAB, 25463), () -> Item.CUT_COPPER_SLAB);

    public static final Block<BlockData> WAXED_COPPER_BLOCK = new Block<>(1031, 25469, NamespacedKey.parse("minecraft:waxed_copper_block"), () -> new BlockData(Block.WAXED_COPPER_BLOCK, 25469), () -> Item.WAXED_COPPER_BLOCK);

    public static final Block<BlockData> WAXED_WEATHERED_COPPER = new Block<>(1032, 25470, NamespacedKey.parse("minecraft:waxed_weathered_copper"), () -> new BlockData(Block.WAXED_WEATHERED_COPPER, 25470), () -> Item.WAXED_WEATHERED_COPPER);

    public static final Block<BlockData> WAXED_EXPOSED_COPPER = new Block<>(1033, 25471, NamespacedKey.parse("minecraft:waxed_exposed_copper"), () -> new BlockData(Block.WAXED_EXPOSED_COPPER, 25471), () -> Item.WAXED_EXPOSED_COPPER);

    public static final Block<BlockData> WAXED_OXIDIZED_COPPER = new Block<>(1034, 25472, NamespacedKey.parse("minecraft:waxed_oxidized_copper"), () -> new BlockData(Block.WAXED_OXIDIZED_COPPER, 25472), () -> Item.WAXED_OXIDIZED_COPPER);

    public static final Block<BlockData> WAXED_OXIDIZED_CUT_COPPER = new Block<>(1035, 25473, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper"), () -> new BlockData(Block.WAXED_OXIDIZED_CUT_COPPER, 25473), () -> Item.WAXED_OXIDIZED_CUT_COPPER);

    public static final Block<BlockData> WAXED_WEATHERED_CUT_COPPER = new Block<>(1036, 25474, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper"), () -> new BlockData(Block.WAXED_WEATHERED_CUT_COPPER, 25474), () -> Item.WAXED_WEATHERED_CUT_COPPER);

    public static final Block<BlockData> WAXED_EXPOSED_CUT_COPPER = new Block<>(1037, 25475, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper"), () -> new BlockData(Block.WAXED_EXPOSED_CUT_COPPER, 25475), () -> Item.WAXED_EXPOSED_CUT_COPPER);

    public static final Block<BlockData> WAXED_CUT_COPPER = new Block<>(1038, 25476, NamespacedKey.parse("minecraft:waxed_cut_copper"), () -> new BlockData(Block.WAXED_CUT_COPPER, 25476), () -> Item.WAXED_CUT_COPPER);

    public static final Block<StairData> WAXED_OXIDIZED_CUT_COPPER_STAIRS = new Block<>(1039, 25477, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_stairs"), () -> new StairData(Block.WAXED_OXIDIZED_CUT_COPPER_STAIRS, 25477), () -> Item.WAXED_OXIDIZED_CUT_COPPER_STAIRS);

    public static final Block<StairData> WAXED_WEATHERED_CUT_COPPER_STAIRS = new Block<>(1040, 25557, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_stairs"), () -> new StairData(Block.WAXED_WEATHERED_CUT_COPPER_STAIRS, 25557), () -> Item.WAXED_WEATHERED_CUT_COPPER_STAIRS);

    public static final Block<StairData> WAXED_EXPOSED_CUT_COPPER_STAIRS = new Block<>(1041, 25637, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_stairs"), () -> new StairData(Block.WAXED_EXPOSED_CUT_COPPER_STAIRS, 25637), () -> Item.WAXED_EXPOSED_CUT_COPPER_STAIRS);

    public static final Block<StairData> WAXED_CUT_COPPER_STAIRS = new Block<>(1042, 25717, NamespacedKey.parse("minecraft:waxed_cut_copper_stairs"), () -> new StairData(Block.WAXED_CUT_COPPER_STAIRS, 25717), () -> Item.WAXED_CUT_COPPER_STAIRS);

    public static final Block<SlabData> WAXED_OXIDIZED_CUT_COPPER_SLAB = new Block<>(1043, 25797, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_slab"), () -> new SlabData(Block.WAXED_OXIDIZED_CUT_COPPER_SLAB, 25797), () -> Item.WAXED_OXIDIZED_CUT_COPPER_SLAB);

    public static final Block<SlabData> WAXED_WEATHERED_CUT_COPPER_SLAB = new Block<>(1044, 25803, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_slab"), () -> new SlabData(Block.WAXED_WEATHERED_CUT_COPPER_SLAB, 25803), () -> Item.WAXED_WEATHERED_CUT_COPPER_SLAB);

    public static final Block<SlabData> WAXED_EXPOSED_CUT_COPPER_SLAB = new Block<>(1045, 25809, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_slab"), () -> new SlabData(Block.WAXED_EXPOSED_CUT_COPPER_SLAB, 25809), () -> Item.WAXED_EXPOSED_CUT_COPPER_SLAB);

    public static final Block<SlabData> WAXED_CUT_COPPER_SLAB = new Block<>(1046, 25815, NamespacedKey.parse("minecraft:waxed_cut_copper_slab"), () -> new SlabData(Block.WAXED_CUT_COPPER_SLAB, 25815), () -> Item.WAXED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperDoorData> COPPER_DOOR = new Block<>(1047, 25821, NamespacedKey.parse("minecraft:copper_door"), () -> new WeatheringCopperDoorData(Block.COPPER_DOOR, 25821), () -> Item.COPPER_DOOR);

    public static final Block<WeatheringCopperDoorData> EXPOSED_COPPER_DOOR = new Block<>(1048, 25885, NamespacedKey.parse("minecraft:exposed_copper_door"), () -> new WeatheringCopperDoorData(Block.EXPOSED_COPPER_DOOR, 25885), () -> Item.EXPOSED_COPPER_DOOR);

    public static final Block<WeatheringCopperDoorData> OXIDIZED_COPPER_DOOR = new Block<>(1049, 25949, NamespacedKey.parse("minecraft:oxidized_copper_door"), () -> new WeatheringCopperDoorData(Block.OXIDIZED_COPPER_DOOR, 25949), () -> Item.OXIDIZED_COPPER_DOOR);

    public static final Block<WeatheringCopperDoorData> WEATHERED_COPPER_DOOR = new Block<>(1050, 26013, NamespacedKey.parse("minecraft:weathered_copper_door"), () -> new WeatheringCopperDoorData(Block.WEATHERED_COPPER_DOOR, 26013), () -> Item.WEATHERED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_COPPER_DOOR = new Block<>(1051, 26077, NamespacedKey.parse("minecraft:waxed_copper_door"), () -> new DoorData(Block.WAXED_COPPER_DOOR, 26077), () -> Item.WAXED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_EXPOSED_COPPER_DOOR = new Block<>(1052, 26141, NamespacedKey.parse("minecraft:waxed_exposed_copper_door"), () -> new DoorData(Block.WAXED_EXPOSED_COPPER_DOOR, 26141), () -> Item.WAXED_EXPOSED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_OXIDIZED_COPPER_DOOR = new Block<>(1053, 26205, NamespacedKey.parse("minecraft:waxed_oxidized_copper_door"), () -> new DoorData(Block.WAXED_OXIDIZED_COPPER_DOOR, 26205), () -> Item.WAXED_OXIDIZED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_WEATHERED_COPPER_DOOR = new Block<>(1054, 26269, NamespacedKey.parse("minecraft:waxed_weathered_copper_door"), () -> new DoorData(Block.WAXED_WEATHERED_COPPER_DOOR, 26269), () -> Item.WAXED_WEATHERED_COPPER_DOOR);

    public static final Block<WeatheringCopperTrapDoorData> COPPER_TRAPDOOR = new Block<>(1055, 26333, NamespacedKey.parse("minecraft:copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(Block.COPPER_TRAPDOOR, 26333), () -> Item.COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperTrapDoorData> EXPOSED_COPPER_TRAPDOOR = new Block<>(1056, 26397, NamespacedKey.parse("minecraft:exposed_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(Block.EXPOSED_COPPER_TRAPDOOR, 26397), () -> Item.EXPOSED_COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperTrapDoorData> OXIDIZED_COPPER_TRAPDOOR = new Block<>(1057, 26461, NamespacedKey.parse("minecraft:oxidized_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(Block.OXIDIZED_COPPER_TRAPDOOR, 26461), () -> Item.OXIDIZED_COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperTrapDoorData> WEATHERED_COPPER_TRAPDOOR = new Block<>(1058, 26525, NamespacedKey.parse("minecraft:weathered_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(Block.WEATHERED_COPPER_TRAPDOOR, 26525), () -> Item.WEATHERED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_COPPER_TRAPDOOR = new Block<>(1059, 26589, NamespacedKey.parse("minecraft:waxed_copper_trapdoor"), () -> new TrapdoorData(Block.WAXED_COPPER_TRAPDOOR, 26589), () -> Item.WAXED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_EXPOSED_COPPER_TRAPDOOR = new Block<>(1060, 26653, NamespacedKey.parse("minecraft:waxed_exposed_copper_trapdoor"), () -> new TrapdoorData(Block.WAXED_EXPOSED_COPPER_TRAPDOOR, 26653), () -> Item.WAXED_EXPOSED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_OXIDIZED_COPPER_TRAPDOOR = new Block<>(1061, 26717, NamespacedKey.parse("minecraft:waxed_oxidized_copper_trapdoor"), () -> new TrapdoorData(Block.WAXED_OXIDIZED_COPPER_TRAPDOOR, 26717), () -> Item.WAXED_OXIDIZED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_WEATHERED_COPPER_TRAPDOOR = new Block<>(1062, 26781, NamespacedKey.parse("minecraft:waxed_weathered_copper_trapdoor"), () -> new TrapdoorData(Block.WAXED_WEATHERED_COPPER_TRAPDOOR, 26781), () -> Item.WAXED_WEATHERED_COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperGrateData> COPPER_GRATE = new Block<>(1063, 26845, NamespacedKey.parse("minecraft:copper_grate"), () -> new WeatheringCopperGrateData(Block.COPPER_GRATE, 26845), () -> Item.COPPER_GRATE);

    public static final Block<WeatheringCopperGrateData> EXPOSED_COPPER_GRATE = new Block<>(1064, 26847, NamespacedKey.parse("minecraft:exposed_copper_grate"), () -> new WeatheringCopperGrateData(Block.EXPOSED_COPPER_GRATE, 26847), () -> Item.EXPOSED_COPPER_GRATE);

    public static final Block<WeatheringCopperGrateData> WEATHERED_COPPER_GRATE = new Block<>(1065, 26849, NamespacedKey.parse("minecraft:weathered_copper_grate"), () -> new WeatheringCopperGrateData(Block.WEATHERED_COPPER_GRATE, 26849), () -> Item.WEATHERED_COPPER_GRATE);

    public static final Block<WeatheringCopperGrateData> OXIDIZED_COPPER_GRATE = new Block<>(1066, 26851, NamespacedKey.parse("minecraft:oxidized_copper_grate"), () -> new WeatheringCopperGrateData(Block.OXIDIZED_COPPER_GRATE, 26851), () -> Item.OXIDIZED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_COPPER_GRATE = new Block<>(1067, 26853, NamespacedKey.parse("minecraft:waxed_copper_grate"), () -> new WaterloggedTransparentData(Block.WAXED_COPPER_GRATE, 26853), () -> Item.WAXED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_EXPOSED_COPPER_GRATE = new Block<>(1068, 26855, NamespacedKey.parse("minecraft:waxed_exposed_copper_grate"), () -> new WaterloggedTransparentData(Block.WAXED_EXPOSED_COPPER_GRATE, 26855), () -> Item.WAXED_EXPOSED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_WEATHERED_COPPER_GRATE = new Block<>(1069, 26857, NamespacedKey.parse("minecraft:waxed_weathered_copper_grate"), () -> new WaterloggedTransparentData(Block.WAXED_WEATHERED_COPPER_GRATE, 26857), () -> Item.WAXED_WEATHERED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_OXIDIZED_COPPER_GRATE = new Block<>(1070, 26859, NamespacedKey.parse("minecraft:waxed_oxidized_copper_grate"), () -> new WaterloggedTransparentData(Block.WAXED_OXIDIZED_COPPER_GRATE, 26859), () -> Item.WAXED_OXIDIZED_COPPER_GRATE);

    public static final Block<WeatheringCopperBulbData> COPPER_BULB = new Block<>(1071, 26861, NamespacedKey.parse("minecraft:copper_bulb"), () -> new WeatheringCopperBulbData(Block.COPPER_BULB, 26861), () -> Item.COPPER_BULB);

    public static final Block<WeatheringCopperBulbData> EXPOSED_COPPER_BULB = new Block<>(1072, 26865, NamespacedKey.parse("minecraft:exposed_copper_bulb"), () -> new WeatheringCopperBulbData(Block.EXPOSED_COPPER_BULB, 26865), () -> Item.EXPOSED_COPPER_BULB);

    public static final Block<WeatheringCopperBulbData> WEATHERED_COPPER_BULB = new Block<>(1073, 26869, NamespacedKey.parse("minecraft:weathered_copper_bulb"), () -> new WeatheringCopperBulbData(Block.WEATHERED_COPPER_BULB, 26869), () -> Item.WEATHERED_COPPER_BULB);

    public static final Block<WeatheringCopperBulbData> OXIDIZED_COPPER_BULB = new Block<>(1074, 26873, NamespacedKey.parse("minecraft:oxidized_copper_bulb"), () -> new WeatheringCopperBulbData(Block.OXIDIZED_COPPER_BULB, 26873), () -> Item.OXIDIZED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_COPPER_BULB = new Block<>(1075, 26877, NamespacedKey.parse("minecraft:waxed_copper_bulb"), () -> new CopperBulbBlockData(Block.WAXED_COPPER_BULB, 26877), () -> Item.WAXED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_EXPOSED_COPPER_BULB = new Block<>(1076, 26881, NamespacedKey.parse("minecraft:waxed_exposed_copper_bulb"), () -> new CopperBulbBlockData(Block.WAXED_EXPOSED_COPPER_BULB, 26881), () -> Item.WAXED_EXPOSED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_WEATHERED_COPPER_BULB = new Block<>(1077, 26885, NamespacedKey.parse("minecraft:waxed_weathered_copper_bulb"), () -> new CopperBulbBlockData(Block.WAXED_WEATHERED_COPPER_BULB, 26885), () -> Item.WAXED_WEATHERED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_OXIDIZED_COPPER_BULB = new Block<>(1078, 26889, NamespacedKey.parse("minecraft:waxed_oxidized_copper_bulb"), () -> new CopperBulbBlockData(Block.WAXED_OXIDIZED_COPPER_BULB, 26889), () -> Item.WAXED_OXIDIZED_COPPER_BULB);

    public static final Block<WeatheringCopperChestData> COPPER_CHEST = new Block<>(1079, 26893, NamespacedKey.parse("minecraft:copper_chest"), () -> new WeatheringCopperChestData(Block.COPPER_CHEST, 26893), () -> Item.COPPER_CHEST);

    public static final Block<WeatheringCopperChestData> EXPOSED_COPPER_CHEST = new Block<>(1080, 26917, NamespacedKey.parse("minecraft:exposed_copper_chest"), () -> new WeatheringCopperChestData(Block.EXPOSED_COPPER_CHEST, 26917), () -> Item.EXPOSED_COPPER_CHEST);

    public static final Block<WeatheringCopperChestData> WEATHERED_COPPER_CHEST = new Block<>(1081, 26941, NamespacedKey.parse("minecraft:weathered_copper_chest"), () -> new WeatheringCopperChestData(Block.WEATHERED_COPPER_CHEST, 26941), () -> Item.WEATHERED_COPPER_CHEST);

    public static final Block<WeatheringCopperChestData> OXIDIZED_COPPER_CHEST = new Block<>(1082, 26965, NamespacedKey.parse("minecraft:oxidized_copper_chest"), () -> new WeatheringCopperChestData(Block.OXIDIZED_COPPER_CHEST, 26965), () -> Item.OXIDIZED_COPPER_CHEST);

    public static final Block<CopperChestData> WAXED_COPPER_CHEST = new Block<>(1083, 26989, NamespacedKey.parse("minecraft:waxed_copper_chest"), () -> new CopperChestData(Block.WAXED_COPPER_CHEST, 26989), () -> Item.WAXED_COPPER_CHEST);

    public static final Block<CopperChestData> WAXED_EXPOSED_COPPER_CHEST = new Block<>(1084, 27013, NamespacedKey.parse("minecraft:waxed_exposed_copper_chest"), () -> new CopperChestData(Block.WAXED_EXPOSED_COPPER_CHEST, 27013), () -> Item.WAXED_EXPOSED_COPPER_CHEST);

    public static final Block<CopperChestData> WAXED_WEATHERED_COPPER_CHEST = new Block<>(1085, 27037, NamespacedKey.parse("minecraft:waxed_weathered_copper_chest"), () -> new CopperChestData(Block.WAXED_WEATHERED_COPPER_CHEST, 27037), () -> Item.WAXED_WEATHERED_COPPER_CHEST);

    public static final Block<CopperChestData> WAXED_OXIDIZED_COPPER_CHEST = new Block<>(1086, 27061, NamespacedKey.parse("minecraft:waxed_oxidized_copper_chest"), () -> new CopperChestData(Block.WAXED_OXIDIZED_COPPER_CHEST, 27061), () -> Item.WAXED_OXIDIZED_COPPER_CHEST);

    public static final Block<WeatheringCopperGolemStatueData> COPPER_GOLEM_STATUE = new Block<>(1087, 27085, NamespacedKey.parse("minecraft:copper_golem_statue"), () -> new WeatheringCopperGolemStatueData(Block.COPPER_GOLEM_STATUE, 27085), () -> Item.COPPER_GOLEM_STATUE);

    public static final Block<WeatheringCopperGolemStatueData> EXPOSED_COPPER_GOLEM_STATUE = new Block<>(1088, 27117, NamespacedKey.parse("minecraft:exposed_copper_golem_statue"), () -> new WeatheringCopperGolemStatueData(Block.EXPOSED_COPPER_GOLEM_STATUE, 27117), () -> Item.EXPOSED_COPPER_GOLEM_STATUE);

    public static final Block<WeatheringCopperGolemStatueData> WEATHERED_COPPER_GOLEM_STATUE = new Block<>(1089, 27149, NamespacedKey.parse("minecraft:weathered_copper_golem_statue"), () -> new WeatheringCopperGolemStatueData(Block.WEATHERED_COPPER_GOLEM_STATUE, 27149), () -> Item.WEATHERED_COPPER_GOLEM_STATUE);

    public static final Block<WeatheringCopperGolemStatueData> OXIDIZED_COPPER_GOLEM_STATUE = new Block<>(1090, 27181, NamespacedKey.parse("minecraft:oxidized_copper_golem_statue"), () -> new WeatheringCopperGolemStatueData(Block.OXIDIZED_COPPER_GOLEM_STATUE, 27181), () -> Item.OXIDIZED_COPPER_GOLEM_STATUE);

    public static final Block<CopperGolemStatueData> WAXED_COPPER_GOLEM_STATUE = new Block<>(1091, 27213, NamespacedKey.parse("minecraft:waxed_copper_golem_statue"), () -> new CopperGolemStatueData(Block.WAXED_COPPER_GOLEM_STATUE, 27213), () -> Item.WAXED_COPPER_GOLEM_STATUE);

    public static final Block<CopperGolemStatueData> WAXED_EXPOSED_COPPER_GOLEM_STATUE = new Block<>(1092, 27245, NamespacedKey.parse("minecraft:waxed_exposed_copper_golem_statue"), () -> new CopperGolemStatueData(Block.WAXED_EXPOSED_COPPER_GOLEM_STATUE, 27245), () -> Item.WAXED_EXPOSED_COPPER_GOLEM_STATUE);

    public static final Block<CopperGolemStatueData> WAXED_WEATHERED_COPPER_GOLEM_STATUE = new Block<>(1093, 27277, NamespacedKey.parse("minecraft:waxed_weathered_copper_golem_statue"), () -> new CopperGolemStatueData(Block.WAXED_WEATHERED_COPPER_GOLEM_STATUE, 27277), () -> Item.WAXED_WEATHERED_COPPER_GOLEM_STATUE);

    public static final Block<CopperGolemStatueData> WAXED_OXIDIZED_COPPER_GOLEM_STATUE = new Block<>(1094, 27309, NamespacedKey.parse("minecraft:waxed_oxidized_copper_golem_statue"), () -> new CopperGolemStatueData(Block.WAXED_OXIDIZED_COPPER_GOLEM_STATUE, 27309), () -> Item.WAXED_OXIDIZED_COPPER_GOLEM_STATUE);

    public static final Block<WeatheringLightningRodData> LIGHTNING_ROD = new Block<>(1095, 27341, NamespacedKey.parse("minecraft:lightning_rod"), () -> new WeatheringLightningRodData(Block.LIGHTNING_ROD, 27341), () -> Item.LIGHTNING_ROD);

    public static final Block<WeatheringLightningRodData> EXPOSED_LIGHTNING_ROD = new Block<>(1096, 27365, NamespacedKey.parse("minecraft:exposed_lightning_rod"), () -> new WeatheringLightningRodData(Block.EXPOSED_LIGHTNING_ROD, 27365), () -> Item.EXPOSED_LIGHTNING_ROD);

    public static final Block<WeatheringLightningRodData> WEATHERED_LIGHTNING_ROD = new Block<>(1097, 27389, NamespacedKey.parse("minecraft:weathered_lightning_rod"), () -> new WeatheringLightningRodData(Block.WEATHERED_LIGHTNING_ROD, 27389), () -> Item.WEATHERED_LIGHTNING_ROD);

    public static final Block<WeatheringLightningRodData> OXIDIZED_LIGHTNING_ROD = new Block<>(1098, 27413, NamespacedKey.parse("minecraft:oxidized_lightning_rod"), () -> new WeatheringLightningRodData(Block.OXIDIZED_LIGHTNING_ROD, 27413), () -> Item.OXIDIZED_LIGHTNING_ROD);

    public static final Block<LightningRodData> WAXED_LIGHTNING_ROD = new Block<>(1099, 27437, NamespacedKey.parse("minecraft:waxed_lightning_rod"), () -> new LightningRodData(Block.WAXED_LIGHTNING_ROD, 27437), () -> Item.WAXED_LIGHTNING_ROD);

    public static final Block<LightningRodData> WAXED_EXPOSED_LIGHTNING_ROD = new Block<>(1100, 27461, NamespacedKey.parse("minecraft:waxed_exposed_lightning_rod"), () -> new LightningRodData(Block.WAXED_EXPOSED_LIGHTNING_ROD, 27461), () -> Item.WAXED_EXPOSED_LIGHTNING_ROD);

    public static final Block<LightningRodData> WAXED_WEATHERED_LIGHTNING_ROD = new Block<>(1101, 27485, NamespacedKey.parse("minecraft:waxed_weathered_lightning_rod"), () -> new LightningRodData(Block.WAXED_WEATHERED_LIGHTNING_ROD, 27485), () -> Item.WAXED_WEATHERED_LIGHTNING_ROD);

    public static final Block<LightningRodData> WAXED_OXIDIZED_LIGHTNING_ROD = new Block<>(1102, 27509, NamespacedKey.parse("minecraft:waxed_oxidized_lightning_rod"), () -> new LightningRodData(Block.WAXED_OXIDIZED_LIGHTNING_ROD, 27509), () -> Item.WAXED_OXIDIZED_LIGHTNING_ROD);

    public static final Block<PointedDripstoneData> POINTED_DRIPSTONE = new Block<>(1103, 27533, NamespacedKey.parse("minecraft:pointed_dripstone"), () -> new PointedDripstoneData(Block.POINTED_DRIPSTONE, 27533), () -> Item.POINTED_DRIPSTONE);

    public static final Block<BlockData> DRIPSTONE_BLOCK = new Block<>(1104, 27553, NamespacedKey.parse("minecraft:dripstone_block"), () -> new BlockData(Block.DRIPSTONE_BLOCK, 27553), () -> Item.DRIPSTONE_BLOCK);

    public static final Block<CaveVinesData> CAVE_VINES = new Block<>(1105, 27554, NamespacedKey.parse("minecraft:cave_vines"), () -> new CaveVinesData(Block.CAVE_VINES, 27554), null);

    public static final Block<CaveVinesPlantData> CAVE_VINES_PLANT = new Block<>(1106, 27606, NamespacedKey.parse("minecraft:cave_vines_plant"), () -> new CaveVinesPlantData(Block.CAVE_VINES_PLANT, 27606), null);

    public static final Block<BlockData> SPORE_BLOSSOM = new Block<>(1107, 27608, NamespacedKey.parse("minecraft:spore_blossom"), () -> new BlockData(Block.SPORE_BLOSSOM, 27608), () -> Item.SPORE_BLOSSOM);

    public static final Block<BlockData> AZALEA = new Block<>(1108, 27609, NamespacedKey.parse("minecraft:azalea"), () -> new BlockData(Block.AZALEA, 27609), () -> Item.AZALEA);

    public static final Block<BlockData> FLOWERING_AZALEA = new Block<>(1109, 27610, NamespacedKey.parse("minecraft:flowering_azalea"), () -> new BlockData(Block.FLOWERING_AZALEA, 27610), () -> Item.FLOWERING_AZALEA);

    public static final Block<BlockData> MOSS_CARPET = new Block<>(1110, 27611, NamespacedKey.parse("minecraft:moss_carpet"), () -> new BlockData(Block.MOSS_CARPET, 27611), () -> Item.MOSS_CARPET);

    public static final Block<FlowerBedData> PINK_PETALS = new Block<>(1111, 27612, NamespacedKey.parse("minecraft:pink_petals"), () -> new FlowerBedData(Block.PINK_PETALS, 27612), () -> Item.PINK_PETALS);

    public static final Block<FlowerBedData> WILDFLOWERS = new Block<>(1112, 27628, NamespacedKey.parse("minecraft:wildflowers"), () -> new FlowerBedData(Block.WILDFLOWERS, 27628), () -> Item.WILDFLOWERS);

    public static final Block<LeafLitterData> LEAF_LITTER = new Block<>(1113, 27644, NamespacedKey.parse("minecraft:leaf_litter"), () -> new LeafLitterData(Block.LEAF_LITTER, 27644), () -> Item.LEAF_LITTER);

    public static final Block<BlockData> MOSS_BLOCK = new Block<>(1114, 27660, NamespacedKey.parse("minecraft:moss_block"), () -> new BlockData(Block.MOSS_BLOCK, 27660), () -> Item.MOSS_BLOCK);

    public static final Block<BigDripleafData> BIG_DRIPLEAF = new Block<>(1115, 27661, NamespacedKey.parse("minecraft:big_dripleaf"), () -> new BigDripleafData(Block.BIG_DRIPLEAF, 27661), () -> Item.BIG_DRIPLEAF);

    public static final Block<BigDripleafStemData> BIG_DRIPLEAF_STEM = new Block<>(1116, 27693, NamespacedKey.parse("minecraft:big_dripleaf_stem"), () -> new BigDripleafStemData(Block.BIG_DRIPLEAF_STEM, 27693), null);

    public static final Block<SmallDripleafData> SMALL_DRIPLEAF = new Block<>(1117, 27701, NamespacedKey.parse("minecraft:small_dripleaf"), () -> new SmallDripleafData(Block.SMALL_DRIPLEAF, 27701), () -> Item.SMALL_DRIPLEAF);

    public static final Block<HangingRootsData> HANGING_ROOTS = new Block<>(1118, 27717, NamespacedKey.parse("minecraft:hanging_roots"), () -> new HangingRootsData(Block.HANGING_ROOTS, 27717), () -> Item.HANGING_ROOTS);

    public static final Block<BlockData> ROOTED_DIRT = new Block<>(1119, 27719, NamespacedKey.parse("minecraft:rooted_dirt"), () -> new BlockData(Block.ROOTED_DIRT, 27719), () -> Item.ROOTED_DIRT);

    public static final Block<BlockData> MUD = new Block<>(1120, 27720, NamespacedKey.parse("minecraft:mud"), () -> new BlockData(Block.MUD, 27720), () -> Item.MUD);

    public static final Block<RotatedPillarData> DEEPSLATE = new Block<>(1121, 27721, NamespacedKey.parse("minecraft:deepslate"), () -> new RotatedPillarData(Block.DEEPSLATE, 27721), () -> Item.DEEPSLATE);

    public static final Block<BlockData> COBBLED_DEEPSLATE = new Block<>(1122, 27724, NamespacedKey.parse("minecraft:cobbled_deepslate"), () -> new BlockData(Block.COBBLED_DEEPSLATE, 27724), () -> Item.COBBLED_DEEPSLATE);

    public static final Block<StairData> COBBLED_DEEPSLATE_STAIRS = new Block<>(1123, 27725, NamespacedKey.parse("minecraft:cobbled_deepslate_stairs"), () -> new StairData(Block.COBBLED_DEEPSLATE_STAIRS, 27725), () -> Item.COBBLED_DEEPSLATE_STAIRS);

    public static final Block<SlabData> COBBLED_DEEPSLATE_SLAB = new Block<>(1124, 27805, NamespacedKey.parse("minecraft:cobbled_deepslate_slab"), () -> new SlabData(Block.COBBLED_DEEPSLATE_SLAB, 27805), () -> Item.COBBLED_DEEPSLATE_SLAB);

    public static final Block<WallData> COBBLED_DEEPSLATE_WALL = new Block<>(1125, 27811, NamespacedKey.parse("minecraft:cobbled_deepslate_wall"), () -> new WallData(Block.COBBLED_DEEPSLATE_WALL, 27811), () -> Item.COBBLED_DEEPSLATE_WALL);

    public static final Block<BlockData> POLISHED_DEEPSLATE = new Block<>(1126, 28135, NamespacedKey.parse("minecraft:polished_deepslate"), () -> new BlockData(Block.POLISHED_DEEPSLATE, 28135), () -> Item.POLISHED_DEEPSLATE);

    public static final Block<StairData> POLISHED_DEEPSLATE_STAIRS = new Block<>(1127, 28136, NamespacedKey.parse("minecraft:polished_deepslate_stairs"), () -> new StairData(Block.POLISHED_DEEPSLATE_STAIRS, 28136), () -> Item.POLISHED_DEEPSLATE_STAIRS);

    public static final Block<SlabData> POLISHED_DEEPSLATE_SLAB = new Block<>(1128, 28216, NamespacedKey.parse("minecraft:polished_deepslate_slab"), () -> new SlabData(Block.POLISHED_DEEPSLATE_SLAB, 28216), () -> Item.POLISHED_DEEPSLATE_SLAB);

    public static final Block<WallData> POLISHED_DEEPSLATE_WALL = new Block<>(1129, 28222, NamespacedKey.parse("minecraft:polished_deepslate_wall"), () -> new WallData(Block.POLISHED_DEEPSLATE_WALL, 28222), () -> Item.POLISHED_DEEPSLATE_WALL);

    public static final Block<BlockData> DEEPSLATE_TILES = new Block<>(1130, 28546, NamespacedKey.parse("minecraft:deepslate_tiles"), () -> new BlockData(Block.DEEPSLATE_TILES, 28546), () -> Item.DEEPSLATE_TILES);

    public static final Block<StairData> DEEPSLATE_TILE_STAIRS = new Block<>(1131, 28547, NamespacedKey.parse("minecraft:deepslate_tile_stairs"), () -> new StairData(Block.DEEPSLATE_TILE_STAIRS, 28547), () -> Item.DEEPSLATE_TILE_STAIRS);

    public static final Block<SlabData> DEEPSLATE_TILE_SLAB = new Block<>(1132, 28627, NamespacedKey.parse("minecraft:deepslate_tile_slab"), () -> new SlabData(Block.DEEPSLATE_TILE_SLAB, 28627), () -> Item.DEEPSLATE_TILE_SLAB);

    public static final Block<WallData> DEEPSLATE_TILE_WALL = new Block<>(1133, 28633, NamespacedKey.parse("minecraft:deepslate_tile_wall"), () -> new WallData(Block.DEEPSLATE_TILE_WALL, 28633), () -> Item.DEEPSLATE_TILE_WALL);

    public static final Block<BlockData> DEEPSLATE_BRICKS = new Block<>(1134, 28957, NamespacedKey.parse("minecraft:deepslate_bricks"), () -> new BlockData(Block.DEEPSLATE_BRICKS, 28957), () -> Item.DEEPSLATE_BRICKS);

    public static final Block<StairData> DEEPSLATE_BRICK_STAIRS = new Block<>(1135, 28958, NamespacedKey.parse("minecraft:deepslate_brick_stairs"), () -> new StairData(Block.DEEPSLATE_BRICK_STAIRS, 28958), () -> Item.DEEPSLATE_BRICK_STAIRS);

    public static final Block<SlabData> DEEPSLATE_BRICK_SLAB = new Block<>(1136, 29038, NamespacedKey.parse("minecraft:deepslate_brick_slab"), () -> new SlabData(Block.DEEPSLATE_BRICK_SLAB, 29038), () -> Item.DEEPSLATE_BRICK_SLAB);

    public static final Block<WallData> DEEPSLATE_BRICK_WALL = new Block<>(1137, 29044, NamespacedKey.parse("minecraft:deepslate_brick_wall"), () -> new WallData(Block.DEEPSLATE_BRICK_WALL, 29044), () -> Item.DEEPSLATE_BRICK_WALL);

    public static final Block<BlockData> CHISELED_DEEPSLATE = new Block<>(1138, 29368, NamespacedKey.parse("minecraft:chiseled_deepslate"), () -> new BlockData(Block.CHISELED_DEEPSLATE, 29368), () -> Item.CHISELED_DEEPSLATE);

    public static final Block<BlockData> CRACKED_DEEPSLATE_BRICKS = new Block<>(1139, 29369, NamespacedKey.parse("minecraft:cracked_deepslate_bricks"), () -> new BlockData(Block.CRACKED_DEEPSLATE_BRICKS, 29369), () -> Item.CRACKED_DEEPSLATE_BRICKS);

    public static final Block<BlockData> CRACKED_DEEPSLATE_TILES = new Block<>(1140, 29370, NamespacedKey.parse("minecraft:cracked_deepslate_tiles"), () -> new BlockData(Block.CRACKED_DEEPSLATE_TILES, 29370), () -> Item.CRACKED_DEEPSLATE_TILES);

    public static final Block<InfestedRotatedPillarData> INFESTED_DEEPSLATE = new Block<>(1141, 29371, NamespacedKey.parse("minecraft:infested_deepslate"), () -> new InfestedRotatedPillarData(Block.INFESTED_DEEPSLATE, 29371), () -> Item.INFESTED_DEEPSLATE);

    public static final Block<BlockData> SMOOTH_BASALT = new Block<>(1142, 29374, NamespacedKey.parse("minecraft:smooth_basalt"), () -> new BlockData(Block.SMOOTH_BASALT, 29374), () -> Item.SMOOTH_BASALT);

    public static final Block<BlockData> RAW_IRON_BLOCK = new Block<>(1143, 29375, NamespacedKey.parse("minecraft:raw_iron_block"), () -> new BlockData(Block.RAW_IRON_BLOCK, 29375), () -> Item.RAW_IRON_BLOCK);

    public static final Block<BlockData> RAW_COPPER_BLOCK = new Block<>(1144, 29376, NamespacedKey.parse("minecraft:raw_copper_block"), () -> new BlockData(Block.RAW_COPPER_BLOCK, 29376), () -> Item.RAW_COPPER_BLOCK);

    public static final Block<BlockData> RAW_GOLD_BLOCK = new Block<>(1145, 29377, NamespacedKey.parse("minecraft:raw_gold_block"), () -> new BlockData(Block.RAW_GOLD_BLOCK, 29377), () -> Item.RAW_GOLD_BLOCK);

    public static final Block<BlockData> POTTED_AZALEA_BUSH = new Block<>(1146, 29378, NamespacedKey.parse("minecraft:potted_azalea_bush"), () -> new BlockData(Block.POTTED_AZALEA_BUSH, 29378), null);

    public static final Block<BlockData> POTTED_FLOWERING_AZALEA_BUSH = new Block<>(1147, 29379, NamespacedKey.parse("minecraft:potted_flowering_azalea_bush"), () -> new BlockData(Block.POTTED_FLOWERING_AZALEA_BUSH, 29379), null);

    public static final Block<RotatedPillarData> OCHRE_FROGLIGHT = new Block<>(1148, 29380, NamespacedKey.parse("minecraft:ochre_froglight"), () -> new RotatedPillarData(Block.OCHRE_FROGLIGHT, 29380), () -> Item.OCHRE_FROGLIGHT);

    public static final Block<RotatedPillarData> VERDANT_FROGLIGHT = new Block<>(1149, 29383, NamespacedKey.parse("minecraft:verdant_froglight"), () -> new RotatedPillarData(Block.VERDANT_FROGLIGHT, 29383), () -> Item.VERDANT_FROGLIGHT);

    public static final Block<RotatedPillarData> PEARLESCENT_FROGLIGHT = new Block<>(1150, 29386, NamespacedKey.parse("minecraft:pearlescent_froglight"), () -> new RotatedPillarData(Block.PEARLESCENT_FROGLIGHT, 29386), () -> Item.PEARLESCENT_FROGLIGHT);

    public static final Block<BlockData> FROGSPAWN = new Block<>(1151, 29389, NamespacedKey.parse("minecraft:frogspawn"), () -> new BlockData(Block.FROGSPAWN, 29389), () -> Item.FROGSPAWN);

    public static final Block<BlockData> REINFORCED_DEEPSLATE = new Block<>(1152, 29390, NamespacedKey.parse("minecraft:reinforced_deepslate"), () -> new BlockData(Block.REINFORCED_DEEPSLATE, 29390), () -> Item.REINFORCED_DEEPSLATE);

    public static final Block<DecoratedPotData> DECORATED_POT = new Block<>(1153, 29391, NamespacedKey.parse("minecraft:decorated_pot"), () -> new DecoratedPotData(Block.DECORATED_POT, 29391), () -> Item.DECORATED_POT);

    public static final Block<CrafterData> CRAFTER = new Block<>(1154, 29407, NamespacedKey.parse("minecraft:crafter"), () -> new CrafterData(Block.CRAFTER, 29407), () -> Item.CRAFTER);

    public static final Block<TrialSpawnerData> TRIAL_SPAWNER = new Block<>(1155, 29455, NamespacedKey.parse("minecraft:trial_spawner"), () -> new TrialSpawnerData(Block.TRIAL_SPAWNER, 29455), () -> Item.TRIAL_SPAWNER);

    public static final Block<VaultData> VAULT = new Block<>(1156, 29467, NamespacedKey.parse("minecraft:vault"), () -> new VaultData(Block.VAULT, 29467), () -> Item.VAULT);

    public static final Block<HeavyCoreData> HEAVY_CORE = new Block<>(1157, 29499, NamespacedKey.parse("minecraft:heavy_core"), () -> new HeavyCoreData(Block.HEAVY_CORE, 29499), () -> Item.HEAVY_CORE);

    public static final Block<BlockData> PALE_MOSS_BLOCK = new Block<>(1158, 29501, NamespacedKey.parse("minecraft:pale_moss_block"), () -> new BlockData(Block.PALE_MOSS_BLOCK, 29501), () -> Item.PALE_MOSS_BLOCK);

    public static final Block<MossyCarpetData> PALE_MOSS_CARPET = new Block<>(1159, 29502, NamespacedKey.parse("minecraft:pale_moss_carpet"), () -> new MossyCarpetData(Block.PALE_MOSS_CARPET, 29502), () -> Item.PALE_MOSS_CARPET);

    public static final Block<HangingMossData> PALE_HANGING_MOSS = new Block<>(1160, 29664, NamespacedKey.parse("minecraft:pale_hanging_moss"), () -> new HangingMossData(Block.PALE_HANGING_MOSS, 29664), () -> Item.PALE_HANGING_MOSS);

    public static final Block<BlockData> OPEN_EYEBLOSSOM = new Block<>(1161, 29666, NamespacedKey.parse("minecraft:open_eyeblossom"), () -> new BlockData(Block.OPEN_EYEBLOSSOM, 29666), () -> Item.OPEN_EYEBLOSSOM);

    public static final Block<BlockData> CLOSED_EYEBLOSSOM = new Block<>(1162, 29667, NamespacedKey.parse("minecraft:closed_eyeblossom"), () -> new BlockData(Block.CLOSED_EYEBLOSSOM, 29667), () -> Item.CLOSED_EYEBLOSSOM);

    public static final Block<BlockData> POTTED_OPEN_EYEBLOSSOM = new Block<>(1163, 29668, NamespacedKey.parse("minecraft:potted_open_eyeblossom"), () -> new BlockData(Block.POTTED_OPEN_EYEBLOSSOM, 29668), null);

    public static final Block<BlockData> POTTED_CLOSED_EYEBLOSSOM = new Block<>(1164, 29669, NamespacedKey.parse("minecraft:potted_closed_eyeblossom"), () -> new BlockData(Block.POTTED_CLOSED_EYEBLOSSOM, 29669), null);

    public static final Block<BlockData> FIREFLY_BUSH = new Block<>(1165, 29670, NamespacedKey.parse("minecraft:firefly_bush"), () -> new BlockData(Block.FIREFLY_BUSH, 29670), () -> Item.FIREFLY_BUSH);

    private static final Block<?>[] VALUES = {
            AIR,
            STONE,
            GRANITE,
            POLISHED_GRANITE,
            DIORITE,
            POLISHED_DIORITE,
            ANDESITE,
            POLISHED_ANDESITE,
            GRASS_BLOCK,
            DIRT,
            COARSE_DIRT,
            PODZOL,
            COBBLESTONE,
            OAK_PLANKS,
            SPRUCE_PLANKS,
            BIRCH_PLANKS,
            JUNGLE_PLANKS,
            ACACIA_PLANKS,
            CHERRY_PLANKS,
            DARK_OAK_PLANKS,
            PALE_OAK_WOOD,
            PALE_OAK_PLANKS,
            MANGROVE_PLANKS,
            BAMBOO_PLANKS,
            BAMBOO_MOSAIC,
            OAK_SAPLING,
            SPRUCE_SAPLING,
            BIRCH_SAPLING,
            JUNGLE_SAPLING,
            ACACIA_SAPLING,
            CHERRY_SAPLING,
            DARK_OAK_SAPLING,
            PALE_OAK_SAPLING,
            MANGROVE_PROPAGULE,
            BEDROCK,
            WATER,
            LAVA,
            SAND,
            SUSPICIOUS_SAND,
            RED_SAND,
            GRAVEL,
            SUSPICIOUS_GRAVEL,
            GOLD_ORE,
            DEEPSLATE_GOLD_ORE,
            IRON_ORE,
            DEEPSLATE_IRON_ORE,
            COAL_ORE,
            DEEPSLATE_COAL_ORE,
            NETHER_GOLD_ORE,
            OAK_LOG,
            SPRUCE_LOG,
            BIRCH_LOG,
            JUNGLE_LOG,
            ACACIA_LOG,
            CHERRY_LOG,
            DARK_OAK_LOG,
            PALE_OAK_LOG,
            MANGROVE_LOG,
            MANGROVE_ROOTS,
            MUDDY_MANGROVE_ROOTS,
            BAMBOO_BLOCK,
            STRIPPED_SPRUCE_LOG,
            STRIPPED_BIRCH_LOG,
            STRIPPED_JUNGLE_LOG,
            STRIPPED_ACACIA_LOG,
            STRIPPED_CHERRY_LOG,
            STRIPPED_DARK_OAK_LOG,
            STRIPPED_PALE_OAK_LOG,
            STRIPPED_OAK_LOG,
            STRIPPED_MANGROVE_LOG,
            STRIPPED_BAMBOO_BLOCK,
            OAK_WOOD,
            SPRUCE_WOOD,
            BIRCH_WOOD,
            JUNGLE_WOOD,
            ACACIA_WOOD,
            CHERRY_WOOD,
            DARK_OAK_WOOD,
            MANGROVE_WOOD,
            STRIPPED_OAK_WOOD,
            STRIPPED_SPRUCE_WOOD,
            STRIPPED_BIRCH_WOOD,
            STRIPPED_JUNGLE_WOOD,
            STRIPPED_ACACIA_WOOD,
            STRIPPED_CHERRY_WOOD,
            STRIPPED_DARK_OAK_WOOD,
            STRIPPED_PALE_OAK_WOOD,
            STRIPPED_MANGROVE_WOOD,
            OAK_LEAVES,
            SPRUCE_LEAVES,
            BIRCH_LEAVES,
            JUNGLE_LEAVES,
            ACACIA_LEAVES,
            CHERRY_LEAVES,
            DARK_OAK_LEAVES,
            PALE_OAK_LEAVES,
            MANGROVE_LEAVES,
            AZALEA_LEAVES,
            FLOWERING_AZALEA_LEAVES,
            SPONGE,
            WET_SPONGE,
            GLASS,
            LAPIS_ORE,
            DEEPSLATE_LAPIS_ORE,
            LAPIS_BLOCK,
            DISPENSER,
            SANDSTONE,
            CHISELED_SANDSTONE,
            CUT_SANDSTONE,
            NOTE_BLOCK,
            WHITE_BED,
            ORANGE_BED,
            MAGENTA_BED,
            LIGHT_BLUE_BED,
            YELLOW_BED,
            LIME_BED,
            PINK_BED,
            GRAY_BED,
            LIGHT_GRAY_BED,
            CYAN_BED,
            PURPLE_BED,
            BLUE_BED,
            BROWN_BED,
            GREEN_BED,
            RED_BED,
            BLACK_BED,
            POWERED_RAIL,
            DETECTOR_RAIL,
            STICKY_PISTON,
            COBWEB,
            SHORT_GRASS,
            FERN,
            DEAD_BUSH,
            BUSH,
            SHORT_DRY_GRASS,
            TALL_DRY_GRASS,
            SEAGRASS,
            TALL_SEAGRASS,
            PISTON,
            PISTON_HEAD,
            WHITE_WOOL,
            ORANGE_WOOL,
            MAGENTA_WOOL,
            LIGHT_BLUE_WOOL,
            YELLOW_WOOL,
            LIME_WOOL,
            PINK_WOOL,
            GRAY_WOOL,
            LIGHT_GRAY_WOOL,
            CYAN_WOOL,
            PURPLE_WOOL,
            BLUE_WOOL,
            BROWN_WOOL,
            GREEN_WOOL,
            RED_WOOL,
            BLACK_WOOL,
            MOVING_PISTON,
            DANDELION,
            TORCHFLOWER,
            POPPY,
            BLUE_ORCHID,
            ALLIUM,
            AZURE_BLUET,
            RED_TULIP,
            ORANGE_TULIP,
            WHITE_TULIP,
            PINK_TULIP,
            OXEYE_DAISY,
            CORNFLOWER,
            WITHER_ROSE,
            LILY_OF_THE_VALLEY,
            BROWN_MUSHROOM,
            RED_MUSHROOM,
            GOLD_BLOCK,
            IRON_BLOCK,
            BRICKS,
            TNT,
            BOOKSHELF,
            CHISELED_BOOKSHELF,
            ACACIA_SHELF,
            BAMBOO_SHELF,
            BIRCH_SHELF,
            CHERRY_SHELF,
            CRIMSON_SHELF,
            DARK_OAK_SHELF,
            JUNGLE_SHELF,
            MANGROVE_SHELF,
            OAK_SHELF,
            PALE_OAK_SHELF,
            SPRUCE_SHELF,
            WARPED_SHELF,
            MOSSY_COBBLESTONE,
            OBSIDIAN,
            TORCH,
            WALL_TORCH,
            FIRE,
            SOUL_FIRE,
            SPAWNER,
            CREAKING_HEART,
            OAK_STAIRS,
            CHEST,
            REDSTONE_WIRE,
            DIAMOND_ORE,
            DEEPSLATE_DIAMOND_ORE,
            DIAMOND_BLOCK,
            CRAFTING_TABLE,
            WHEAT,
            FARMLAND,
            FURNACE,
            OAK_SIGN,
            SPRUCE_SIGN,
            BIRCH_SIGN,
            ACACIA_SIGN,
            CHERRY_SIGN,
            JUNGLE_SIGN,
            DARK_OAK_SIGN,
            PALE_OAK_SIGN,
            MANGROVE_SIGN,
            BAMBOO_SIGN,
            OAK_DOOR,
            LADDER,
            RAIL,
            COBBLESTONE_STAIRS,
            OAK_WALL_SIGN,
            SPRUCE_WALL_SIGN,
            BIRCH_WALL_SIGN,
            ACACIA_WALL_SIGN,
            CHERRY_WALL_SIGN,
            JUNGLE_WALL_SIGN,
            DARK_OAK_WALL_SIGN,
            PALE_OAK_WALL_SIGN,
            MANGROVE_WALL_SIGN,
            BAMBOO_WALL_SIGN,
            OAK_HANGING_SIGN,
            SPRUCE_HANGING_SIGN,
            BIRCH_HANGING_SIGN,
            ACACIA_HANGING_SIGN,
            CHERRY_HANGING_SIGN,
            JUNGLE_HANGING_SIGN,
            DARK_OAK_HANGING_SIGN,
            PALE_OAK_HANGING_SIGN,
            CRIMSON_HANGING_SIGN,
            WARPED_HANGING_SIGN,
            MANGROVE_HANGING_SIGN,
            BAMBOO_HANGING_SIGN,
            OAK_WALL_HANGING_SIGN,
            SPRUCE_WALL_HANGING_SIGN,
            BIRCH_WALL_HANGING_SIGN,
            ACACIA_WALL_HANGING_SIGN,
            CHERRY_WALL_HANGING_SIGN,
            JUNGLE_WALL_HANGING_SIGN,
            DARK_OAK_WALL_HANGING_SIGN,
            PALE_OAK_WALL_HANGING_SIGN,
            MANGROVE_WALL_HANGING_SIGN,
            CRIMSON_WALL_HANGING_SIGN,
            WARPED_WALL_HANGING_SIGN,
            BAMBOO_WALL_HANGING_SIGN,
            LEVER,
            STONE_PRESSURE_PLATE,
            IRON_DOOR,
            OAK_PRESSURE_PLATE,
            SPRUCE_PRESSURE_PLATE,
            BIRCH_PRESSURE_PLATE,
            JUNGLE_PRESSURE_PLATE,
            ACACIA_PRESSURE_PLATE,
            CHERRY_PRESSURE_PLATE,
            DARK_OAK_PRESSURE_PLATE,
            PALE_OAK_PRESSURE_PLATE,
            MANGROVE_PRESSURE_PLATE,
            BAMBOO_PRESSURE_PLATE,
            REDSTONE_ORE,
            DEEPSLATE_REDSTONE_ORE,
            REDSTONE_TORCH,
            REDSTONE_WALL_TORCH,
            STONE_BUTTON,
            SNOW,
            ICE,
            SNOW_BLOCK,
            CACTUS,
            CACTUS_FLOWER,
            CLAY,
            SUGAR_CANE,
            JUKEBOX,
            OAK_FENCE,
            NETHERRACK,
            SOUL_SAND,
            SOUL_SOIL,
            BASALT,
            POLISHED_BASALT,
            SOUL_TORCH,
            SOUL_WALL_TORCH,
            COPPER_TORCH,
            COPPER_WALL_TORCH,
            GLOWSTONE,
            NETHER_PORTAL,
            CARVED_PUMPKIN,
            JACK_O_LANTERN,
            CAKE,
            REPEATER,
            WHITE_STAINED_GLASS,
            ORANGE_STAINED_GLASS,
            MAGENTA_STAINED_GLASS,
            LIGHT_BLUE_STAINED_GLASS,
            YELLOW_STAINED_GLASS,
            LIME_STAINED_GLASS,
            PINK_STAINED_GLASS,
            GRAY_STAINED_GLASS,
            LIGHT_GRAY_STAINED_GLASS,
            CYAN_STAINED_GLASS,
            PURPLE_STAINED_GLASS,
            BLUE_STAINED_GLASS,
            BROWN_STAINED_GLASS,
            GREEN_STAINED_GLASS,
            RED_STAINED_GLASS,
            BLACK_STAINED_GLASS,
            OAK_TRAPDOOR,
            SPRUCE_TRAPDOOR,
            BIRCH_TRAPDOOR,
            JUNGLE_TRAPDOOR,
            ACACIA_TRAPDOOR,
            CHERRY_TRAPDOOR,
            DARK_OAK_TRAPDOOR,
            PALE_OAK_TRAPDOOR,
            MANGROVE_TRAPDOOR,
            BAMBOO_TRAPDOOR,
            STONE_BRICKS,
            MOSSY_STONE_BRICKS,
            CRACKED_STONE_BRICKS,
            CHISELED_STONE_BRICKS,
            PACKED_MUD,
            MUD_BRICKS,
            INFESTED_STONE,
            INFESTED_COBBLESTONE,
            INFESTED_STONE_BRICKS,
            INFESTED_MOSSY_STONE_BRICKS,
            INFESTED_CRACKED_STONE_BRICKS,
            INFESTED_CHISELED_STONE_BRICKS,
            BROWN_MUSHROOM_BLOCK,
            RED_MUSHROOM_BLOCK,
            MUSHROOM_STEM,
            IRON_BARS,
            COPPER_BARS,
            EXPOSED_COPPER_BARS,
            WEATHERED_COPPER_BARS,
            OXIDIZED_COPPER_BARS,
            WAXED_COPPER_BARS,
            WAXED_EXPOSED_COPPER_BARS,
            WAXED_WEATHERED_COPPER_BARS,
            WAXED_OXIDIZED_COPPER_BARS,
            IRON_CHAIN,
            COPPER_CHAIN,
            EXPOSED_COPPER_CHAIN,
            WEATHERED_COPPER_CHAIN,
            OXIDIZED_COPPER_CHAIN,
            WAXED_COPPER_CHAIN,
            WAXED_EXPOSED_COPPER_CHAIN,
            WAXED_WEATHERED_COPPER_CHAIN,
            WAXED_OXIDIZED_COPPER_CHAIN,
            GLASS_PANE,
            PUMPKIN,
            MELON,
            ATTACHED_PUMPKIN_STEM,
            ATTACHED_MELON_STEM,
            PUMPKIN_STEM,
            MELON_STEM,
            VINE,
            GLOW_LICHEN,
            RESIN_CLUMP,
            OAK_FENCE_GATE,
            BRICK_STAIRS,
            STONE_BRICK_STAIRS,
            MUD_BRICK_STAIRS,
            MYCELIUM,
            LILY_PAD,
            RESIN_BLOCK,
            RESIN_BRICKS,
            RESIN_BRICK_STAIRS,
            RESIN_BRICK_SLAB,
            RESIN_BRICK_WALL,
            CHISELED_RESIN_BRICKS,
            NETHER_BRICKS,
            NETHER_BRICK_FENCE,
            NETHER_BRICK_STAIRS,
            NETHER_WART,
            ENCHANTING_TABLE,
            BREWING_STAND,
            CAULDRON,
            WATER_CAULDRON,
            LAVA_CAULDRON,
            POWDER_SNOW_CAULDRON,
            END_PORTAL,
            END_PORTAL_FRAME,
            END_STONE,
            DRAGON_EGG,
            REDSTONE_LAMP,
            COCOA,
            SANDSTONE_STAIRS,
            EMERALD_ORE,
            DEEPSLATE_EMERALD_ORE,
            ENDER_CHEST,
            TRIPWIRE_HOOK,
            TRIPWIRE,
            EMERALD_BLOCK,
            SPRUCE_STAIRS,
            BIRCH_STAIRS,
            JUNGLE_STAIRS,
            COMMAND_BLOCK,
            BEACON,
            COBBLESTONE_WALL,
            MOSSY_COBBLESTONE_WALL,
            FLOWER_POT,
            POTTED_TORCHFLOWER,
            POTTED_OAK_SAPLING,
            POTTED_SPRUCE_SAPLING,
            POTTED_BIRCH_SAPLING,
            POTTED_JUNGLE_SAPLING,
            POTTED_ACACIA_SAPLING,
            POTTED_CHERRY_SAPLING,
            POTTED_DARK_OAK_SAPLING,
            POTTED_PALE_OAK_SAPLING,
            POTTED_MANGROVE_PROPAGULE,
            POTTED_FERN,
            POTTED_DANDELION,
            POTTED_POPPY,
            POTTED_BLUE_ORCHID,
            POTTED_ALLIUM,
            POTTED_AZURE_BLUET,
            POTTED_RED_TULIP,
            POTTED_ORANGE_TULIP,
            POTTED_WHITE_TULIP,
            POTTED_PINK_TULIP,
            POTTED_OXEYE_DAISY,
            POTTED_CORNFLOWER,
            POTTED_LILY_OF_THE_VALLEY,
            POTTED_WITHER_ROSE,
            POTTED_RED_MUSHROOM,
            POTTED_BROWN_MUSHROOM,
            POTTED_DEAD_BUSH,
            POTTED_CACTUS,
            CARROTS,
            POTATOES,
            OAK_BUTTON,
            SPRUCE_BUTTON,
            BIRCH_BUTTON,
            JUNGLE_BUTTON,
            ACACIA_BUTTON,
            CHERRY_BUTTON,
            DARK_OAK_BUTTON,
            PALE_OAK_BUTTON,
            MANGROVE_BUTTON,
            BAMBOO_BUTTON,
            SKELETON_SKULL,
            SKELETON_WALL_SKULL,
            WITHER_SKELETON_SKULL,
            WITHER_SKELETON_WALL_SKULL,
            ZOMBIE_HEAD,
            ZOMBIE_WALL_HEAD,
            PLAYER_HEAD,
            PLAYER_WALL_HEAD,
            CREEPER_HEAD,
            CREEPER_WALL_HEAD,
            DRAGON_HEAD,
            DRAGON_WALL_HEAD,
            PIGLIN_HEAD,
            PIGLIN_WALL_HEAD,
            ANVIL,
            CHIPPED_ANVIL,
            DAMAGED_ANVIL,
            TRAPPED_CHEST,
            LIGHT_WEIGHTED_PRESSURE_PLATE,
            HEAVY_WEIGHTED_PRESSURE_PLATE,
            COMPARATOR,
            DAYLIGHT_DETECTOR,
            REDSTONE_BLOCK,
            NETHER_QUARTZ_ORE,
            HOPPER,
            QUARTZ_BLOCK,
            CHISELED_QUARTZ_BLOCK,
            QUARTZ_PILLAR,
            QUARTZ_STAIRS,
            ACTIVATOR_RAIL,
            DROPPER,
            WHITE_TERRACOTTA,
            ORANGE_TERRACOTTA,
            MAGENTA_TERRACOTTA,
            LIGHT_BLUE_TERRACOTTA,
            YELLOW_TERRACOTTA,
            LIME_TERRACOTTA,
            PINK_TERRACOTTA,
            GRAY_TERRACOTTA,
            LIGHT_GRAY_TERRACOTTA,
            CYAN_TERRACOTTA,
            PURPLE_TERRACOTTA,
            BLUE_TERRACOTTA,
            BROWN_TERRACOTTA,
            GREEN_TERRACOTTA,
            RED_TERRACOTTA,
            BLACK_TERRACOTTA,
            WHITE_STAINED_GLASS_PANE,
            ORANGE_STAINED_GLASS_PANE,
            MAGENTA_STAINED_GLASS_PANE,
            LIGHT_BLUE_STAINED_GLASS_PANE,
            YELLOW_STAINED_GLASS_PANE,
            LIME_STAINED_GLASS_PANE,
            PINK_STAINED_GLASS_PANE,
            GRAY_STAINED_GLASS_PANE,
            LIGHT_GRAY_STAINED_GLASS_PANE,
            CYAN_STAINED_GLASS_PANE,
            PURPLE_STAINED_GLASS_PANE,
            BLUE_STAINED_GLASS_PANE,
            BROWN_STAINED_GLASS_PANE,
            GREEN_STAINED_GLASS_PANE,
            RED_STAINED_GLASS_PANE,
            BLACK_STAINED_GLASS_PANE,
            ACACIA_STAIRS,
            CHERRY_STAIRS,
            DARK_OAK_STAIRS,
            PALE_OAK_STAIRS,
            MANGROVE_STAIRS,
            BAMBOO_STAIRS,
            BAMBOO_MOSAIC_STAIRS,
            SLIME_BLOCK,
            BARRIER,
            LIGHT,
            IRON_TRAPDOOR,
            PRISMARINE,
            PRISMARINE_BRICKS,
            DARK_PRISMARINE,
            PRISMARINE_STAIRS,
            PRISMARINE_BRICK_STAIRS,
            DARK_PRISMARINE_STAIRS,
            PRISMARINE_SLAB,
            PRISMARINE_BRICK_SLAB,
            DARK_PRISMARINE_SLAB,
            SEA_LANTERN,
            HAY_BLOCK,
            WHITE_CARPET,
            ORANGE_CARPET,
            MAGENTA_CARPET,
            LIGHT_BLUE_CARPET,
            YELLOW_CARPET,
            LIME_CARPET,
            PINK_CARPET,
            GRAY_CARPET,
            LIGHT_GRAY_CARPET,
            CYAN_CARPET,
            PURPLE_CARPET,
            BLUE_CARPET,
            BROWN_CARPET,
            GREEN_CARPET,
            RED_CARPET,
            BLACK_CARPET,
            TERRACOTTA,
            COAL_BLOCK,
            PACKED_ICE,
            SUNFLOWER,
            LILAC,
            ROSE_BUSH,
            PEONY,
            TALL_GRASS,
            LARGE_FERN,
            WHITE_BANNER,
            ORANGE_BANNER,
            MAGENTA_BANNER,
            LIGHT_BLUE_BANNER,
            YELLOW_BANNER,
            LIME_BANNER,
            PINK_BANNER,
            GRAY_BANNER,
            LIGHT_GRAY_BANNER,
            CYAN_BANNER,
            PURPLE_BANNER,
            BLUE_BANNER,
            BROWN_BANNER,
            GREEN_BANNER,
            RED_BANNER,
            BLACK_BANNER,
            WHITE_WALL_BANNER,
            ORANGE_WALL_BANNER,
            MAGENTA_WALL_BANNER,
            LIGHT_BLUE_WALL_BANNER,
            YELLOW_WALL_BANNER,
            LIME_WALL_BANNER,
            PINK_WALL_BANNER,
            GRAY_WALL_BANNER,
            LIGHT_GRAY_WALL_BANNER,
            CYAN_WALL_BANNER,
            PURPLE_WALL_BANNER,
            BLUE_WALL_BANNER,
            BROWN_WALL_BANNER,
            GREEN_WALL_BANNER,
            RED_WALL_BANNER,
            BLACK_WALL_BANNER,
            RED_SANDSTONE,
            CHISELED_RED_SANDSTONE,
            CUT_RED_SANDSTONE,
            RED_SANDSTONE_STAIRS,
            OAK_SLAB,
            SPRUCE_SLAB,
            BIRCH_SLAB,
            JUNGLE_SLAB,
            ACACIA_SLAB,
            CHERRY_SLAB,
            DARK_OAK_SLAB,
            PALE_OAK_SLAB,
            MANGROVE_SLAB,
            BAMBOO_SLAB,
            BAMBOO_MOSAIC_SLAB,
            STONE_SLAB,
            SMOOTH_STONE_SLAB,
            SANDSTONE_SLAB,
            CUT_SANDSTONE_SLAB,
            PETRIFIED_OAK_SLAB,
            COBBLESTONE_SLAB,
            BRICK_SLAB,
            STONE_BRICK_SLAB,
            MUD_BRICK_SLAB,
            NETHER_BRICK_SLAB,
            QUARTZ_SLAB,
            RED_SANDSTONE_SLAB,
            CUT_RED_SANDSTONE_SLAB,
            PURPUR_SLAB,
            SMOOTH_STONE,
            SMOOTH_SANDSTONE,
            SMOOTH_QUARTZ,
            SMOOTH_RED_SANDSTONE,
            SPRUCE_FENCE_GATE,
            BIRCH_FENCE_GATE,
            JUNGLE_FENCE_GATE,
            ACACIA_FENCE_GATE,
            CHERRY_FENCE_GATE,
            DARK_OAK_FENCE_GATE,
            PALE_OAK_FENCE_GATE,
            MANGROVE_FENCE_GATE,
            BAMBOO_FENCE_GATE,
            SPRUCE_FENCE,
            BIRCH_FENCE,
            JUNGLE_FENCE,
            ACACIA_FENCE,
            CHERRY_FENCE,
            DARK_OAK_FENCE,
            PALE_OAK_FENCE,
            MANGROVE_FENCE,
            BAMBOO_FENCE,
            SPRUCE_DOOR,
            BIRCH_DOOR,
            JUNGLE_DOOR,
            ACACIA_DOOR,
            CHERRY_DOOR,
            DARK_OAK_DOOR,
            PALE_OAK_DOOR,
            MANGROVE_DOOR,
            BAMBOO_DOOR,
            END_ROD,
            CHORUS_PLANT,
            CHORUS_FLOWER,
            PURPUR_BLOCK,
            PURPUR_PILLAR,
            PURPUR_STAIRS,
            END_STONE_BRICKS,
            TORCHFLOWER_CROP,
            PITCHER_CROP,
            PITCHER_PLANT,
            BEETROOTS,
            DIRT_PATH,
            END_GATEWAY,
            REPEATING_COMMAND_BLOCK,
            CHAIN_COMMAND_BLOCK,
            FROSTED_ICE,
            MAGMA_BLOCK,
            NETHER_WART_BLOCK,
            RED_NETHER_BRICKS,
            BONE_BLOCK,
            STRUCTURE_VOID,
            OBSERVER,
            SHULKER_BOX,
            WHITE_SHULKER_BOX,
            ORANGE_SHULKER_BOX,
            MAGENTA_SHULKER_BOX,
            LIGHT_BLUE_SHULKER_BOX,
            YELLOW_SHULKER_BOX,
            LIME_SHULKER_BOX,
            PINK_SHULKER_BOX,
            GRAY_SHULKER_BOX,
            LIGHT_GRAY_SHULKER_BOX,
            CYAN_SHULKER_BOX,
            PURPLE_SHULKER_BOX,
            BLUE_SHULKER_BOX,
            BROWN_SHULKER_BOX,
            GREEN_SHULKER_BOX,
            RED_SHULKER_BOX,
            BLACK_SHULKER_BOX,
            WHITE_GLAZED_TERRACOTTA,
            ORANGE_GLAZED_TERRACOTTA,
            MAGENTA_GLAZED_TERRACOTTA,
            LIGHT_BLUE_GLAZED_TERRACOTTA,
            YELLOW_GLAZED_TERRACOTTA,
            LIME_GLAZED_TERRACOTTA,
            PINK_GLAZED_TERRACOTTA,
            GRAY_GLAZED_TERRACOTTA,
            LIGHT_GRAY_GLAZED_TERRACOTTA,
            CYAN_GLAZED_TERRACOTTA,
            PURPLE_GLAZED_TERRACOTTA,
            BLUE_GLAZED_TERRACOTTA,
            BROWN_GLAZED_TERRACOTTA,
            GREEN_GLAZED_TERRACOTTA,
            RED_GLAZED_TERRACOTTA,
            BLACK_GLAZED_TERRACOTTA,
            WHITE_CONCRETE,
            ORANGE_CONCRETE,
            MAGENTA_CONCRETE,
            LIGHT_BLUE_CONCRETE,
            YELLOW_CONCRETE,
            LIME_CONCRETE,
            PINK_CONCRETE,
            GRAY_CONCRETE,
            LIGHT_GRAY_CONCRETE,
            CYAN_CONCRETE,
            PURPLE_CONCRETE,
            BLUE_CONCRETE,
            BROWN_CONCRETE,
            GREEN_CONCRETE,
            RED_CONCRETE,
            BLACK_CONCRETE,
            WHITE_CONCRETE_POWDER,
            ORANGE_CONCRETE_POWDER,
            MAGENTA_CONCRETE_POWDER,
            LIGHT_BLUE_CONCRETE_POWDER,
            YELLOW_CONCRETE_POWDER,
            LIME_CONCRETE_POWDER,
            PINK_CONCRETE_POWDER,
            GRAY_CONCRETE_POWDER,
            LIGHT_GRAY_CONCRETE_POWDER,
            CYAN_CONCRETE_POWDER,
            PURPLE_CONCRETE_POWDER,
            BLUE_CONCRETE_POWDER,
            BROWN_CONCRETE_POWDER,
            GREEN_CONCRETE_POWDER,
            RED_CONCRETE_POWDER,
            BLACK_CONCRETE_POWDER,
            KELP,
            KELP_PLANT,
            DRIED_KELP_BLOCK,
            TURTLE_EGG,
            SNIFFER_EGG,
            DRIED_GHAST,
            DEAD_TUBE_CORAL_BLOCK,
            DEAD_BRAIN_CORAL_BLOCK,
            DEAD_BUBBLE_CORAL_BLOCK,
            DEAD_FIRE_CORAL_BLOCK,
            DEAD_HORN_CORAL_BLOCK,
            TUBE_CORAL_BLOCK,
            BRAIN_CORAL_BLOCK,
            BUBBLE_CORAL_BLOCK,
            FIRE_CORAL_BLOCK,
            HORN_CORAL_BLOCK,
            DEAD_TUBE_CORAL,
            DEAD_BRAIN_CORAL,
            DEAD_BUBBLE_CORAL,
            DEAD_FIRE_CORAL,
            DEAD_HORN_CORAL,
            TUBE_CORAL,
            BRAIN_CORAL,
            BUBBLE_CORAL,
            FIRE_CORAL,
            HORN_CORAL,
            DEAD_TUBE_CORAL_FAN,
            DEAD_BRAIN_CORAL_FAN,
            DEAD_BUBBLE_CORAL_FAN,
            DEAD_FIRE_CORAL_FAN,
            DEAD_HORN_CORAL_FAN,
            TUBE_CORAL_FAN,
            BRAIN_CORAL_FAN,
            BUBBLE_CORAL_FAN,
            FIRE_CORAL_FAN,
            HORN_CORAL_FAN,
            DEAD_TUBE_CORAL_WALL_FAN,
            DEAD_BRAIN_CORAL_WALL_FAN,
            DEAD_BUBBLE_CORAL_WALL_FAN,
            DEAD_FIRE_CORAL_WALL_FAN,
            DEAD_HORN_CORAL_WALL_FAN,
            TUBE_CORAL_WALL_FAN,
            BRAIN_CORAL_WALL_FAN,
            BUBBLE_CORAL_WALL_FAN,
            FIRE_CORAL_WALL_FAN,
            HORN_CORAL_WALL_FAN,
            SEA_PICKLE,
            BLUE_ICE,
            CONDUIT,
            BAMBOO_SAPLING,
            BAMBOO,
            POTTED_BAMBOO,
            VOID_AIR,
            CAVE_AIR,
            BUBBLE_COLUMN,
            POLISHED_GRANITE_STAIRS,
            SMOOTH_RED_SANDSTONE_STAIRS,
            MOSSY_STONE_BRICK_STAIRS,
            POLISHED_DIORITE_STAIRS,
            MOSSY_COBBLESTONE_STAIRS,
            END_STONE_BRICK_STAIRS,
            STONE_STAIRS,
            SMOOTH_SANDSTONE_STAIRS,
            SMOOTH_QUARTZ_STAIRS,
            GRANITE_STAIRS,
            ANDESITE_STAIRS,
            RED_NETHER_BRICK_STAIRS,
            POLISHED_ANDESITE_STAIRS,
            DIORITE_STAIRS,
            POLISHED_GRANITE_SLAB,
            SMOOTH_RED_SANDSTONE_SLAB,
            MOSSY_STONE_BRICK_SLAB,
            POLISHED_DIORITE_SLAB,
            MOSSY_COBBLESTONE_SLAB,
            END_STONE_BRICK_SLAB,
            SMOOTH_SANDSTONE_SLAB,
            SMOOTH_QUARTZ_SLAB,
            GRANITE_SLAB,
            ANDESITE_SLAB,
            RED_NETHER_BRICK_SLAB,
            POLISHED_ANDESITE_SLAB,
            DIORITE_SLAB,
            BRICK_WALL,
            PRISMARINE_WALL,
            RED_SANDSTONE_WALL,
            MOSSY_STONE_BRICK_WALL,
            GRANITE_WALL,
            STONE_BRICK_WALL,
            MUD_BRICK_WALL,
            NETHER_BRICK_WALL,
            ANDESITE_WALL,
            RED_NETHER_BRICK_WALL,
            SANDSTONE_WALL,
            END_STONE_BRICK_WALL,
            DIORITE_WALL,
            SCAFFOLDING,
            LOOM,
            BARREL,
            SMOKER,
            BLAST_FURNACE,
            CARTOGRAPHY_TABLE,
            FLETCHING_TABLE,
            GRINDSTONE,
            LECTERN,
            SMITHING_TABLE,
            STONECUTTER,
            BELL,
            LANTERN,
            SOUL_LANTERN,
            COPPER_LANTERN,
            EXPOSED_COPPER_LANTERN,
            WEATHERED_COPPER_LANTERN,
            OXIDIZED_COPPER_LANTERN,
            WAXED_COPPER_LANTERN,
            WAXED_EXPOSED_COPPER_LANTERN,
            WAXED_WEATHERED_COPPER_LANTERN,
            WAXED_OXIDIZED_COPPER_LANTERN,
            CAMPFIRE,
            SOUL_CAMPFIRE,
            SWEET_BERRY_BUSH,
            WARPED_STEM,
            STRIPPED_WARPED_STEM,
            WARPED_HYPHAE,
            STRIPPED_WARPED_HYPHAE,
            WARPED_NYLIUM,
            WARPED_FUNGUS,
            WARPED_WART_BLOCK,
            WARPED_ROOTS,
            NETHER_SPROUTS,
            CRIMSON_STEM,
            STRIPPED_CRIMSON_STEM,
            CRIMSON_HYPHAE,
            STRIPPED_CRIMSON_HYPHAE,
            CRIMSON_NYLIUM,
            CRIMSON_FUNGUS,
            SHROOMLIGHT,
            WEEPING_VINES,
            WEEPING_VINES_PLANT,
            TWISTING_VINES,
            TWISTING_VINES_PLANT,
            CRIMSON_ROOTS,
            CRIMSON_PLANKS,
            WARPED_PLANKS,
            CRIMSON_SLAB,
            WARPED_SLAB,
            CRIMSON_PRESSURE_PLATE,
            WARPED_PRESSURE_PLATE,
            CRIMSON_FENCE,
            WARPED_FENCE,
            CRIMSON_TRAPDOOR,
            WARPED_TRAPDOOR,
            CRIMSON_FENCE_GATE,
            WARPED_FENCE_GATE,
            CRIMSON_STAIRS,
            WARPED_STAIRS,
            CRIMSON_BUTTON,
            WARPED_BUTTON,
            CRIMSON_DOOR,
            WARPED_DOOR,
            CRIMSON_SIGN,
            WARPED_SIGN,
            CRIMSON_WALL_SIGN,
            WARPED_WALL_SIGN,
            STRUCTURE_BLOCK,
            JIGSAW,
            TEST_BLOCK,
            TEST_INSTANCE_BLOCK,
            COMPOSTER,
            TARGET,
            BEE_NEST,
            BEEHIVE,
            HONEY_BLOCK,
            HONEYCOMB_BLOCK,
            NETHERITE_BLOCK,
            ANCIENT_DEBRIS,
            CRYING_OBSIDIAN,
            RESPAWN_ANCHOR,
            POTTED_CRIMSON_FUNGUS,
            POTTED_WARPED_FUNGUS,
            POTTED_CRIMSON_ROOTS,
            POTTED_WARPED_ROOTS,
            LODESTONE,
            BLACKSTONE,
            BLACKSTONE_STAIRS,
            BLACKSTONE_WALL,
            BLACKSTONE_SLAB,
            POLISHED_BLACKSTONE,
            POLISHED_BLACKSTONE_BRICKS,
            CRACKED_POLISHED_BLACKSTONE_BRICKS,
            CHISELED_POLISHED_BLACKSTONE,
            POLISHED_BLACKSTONE_BRICK_SLAB,
            POLISHED_BLACKSTONE_BRICK_STAIRS,
            POLISHED_BLACKSTONE_BRICK_WALL,
            GILDED_BLACKSTONE,
            POLISHED_BLACKSTONE_STAIRS,
            POLISHED_BLACKSTONE_SLAB,
            POLISHED_BLACKSTONE_PRESSURE_PLATE,
            POLISHED_BLACKSTONE_BUTTON,
            POLISHED_BLACKSTONE_WALL,
            CHISELED_NETHER_BRICKS,
            CRACKED_NETHER_BRICKS,
            QUARTZ_BRICKS,
            CANDLE,
            WHITE_CANDLE,
            ORANGE_CANDLE,
            MAGENTA_CANDLE,
            LIGHT_BLUE_CANDLE,
            YELLOW_CANDLE,
            LIME_CANDLE,
            PINK_CANDLE,
            GRAY_CANDLE,
            LIGHT_GRAY_CANDLE,
            CYAN_CANDLE,
            PURPLE_CANDLE,
            BLUE_CANDLE,
            BROWN_CANDLE,
            GREEN_CANDLE,
            RED_CANDLE,
            BLACK_CANDLE,
            CANDLE_CAKE,
            WHITE_CANDLE_CAKE,
            ORANGE_CANDLE_CAKE,
            MAGENTA_CANDLE_CAKE,
            LIGHT_BLUE_CANDLE_CAKE,
            YELLOW_CANDLE_CAKE,
            LIME_CANDLE_CAKE,
            PINK_CANDLE_CAKE,
            GRAY_CANDLE_CAKE,
            LIGHT_GRAY_CANDLE_CAKE,
            CYAN_CANDLE_CAKE,
            PURPLE_CANDLE_CAKE,
            BLUE_CANDLE_CAKE,
            BROWN_CANDLE_CAKE,
            GREEN_CANDLE_CAKE,
            RED_CANDLE_CAKE,
            BLACK_CANDLE_CAKE,
            AMETHYST_BLOCK,
            BUDDING_AMETHYST,
            AMETHYST_CLUSTER,
            LARGE_AMETHYST_BUD,
            MEDIUM_AMETHYST_BUD,
            SMALL_AMETHYST_BUD,
            TUFF,
            TUFF_SLAB,
            TUFF_STAIRS,
            TUFF_WALL,
            POLISHED_TUFF,
            POLISHED_TUFF_SLAB,
            POLISHED_TUFF_STAIRS,
            POLISHED_TUFF_WALL,
            CHISELED_TUFF,
            TUFF_BRICKS,
            TUFF_BRICK_SLAB,
            TUFF_BRICK_STAIRS,
            TUFF_BRICK_WALL,
            CHISELED_TUFF_BRICKS,
            CALCITE,
            TINTED_GLASS,
            POWDER_SNOW,
            SCULK_SENSOR,
            CALIBRATED_SCULK_SENSOR,
            SCULK,
            SCULK_VEIN,
            SCULK_CATALYST,
            SCULK_SHRIEKER,
            COPPER_BLOCK,
            EXPOSED_COPPER,
            WEATHERED_COPPER,
            OXIDIZED_COPPER,
            COPPER_ORE,
            DEEPSLATE_COPPER_ORE,
            OXIDIZED_CUT_COPPER,
            WEATHERED_CUT_COPPER,
            EXPOSED_CUT_COPPER,
            CUT_COPPER,
            OXIDIZED_CHISELED_COPPER,
            WEATHERED_CHISELED_COPPER,
            EXPOSED_CHISELED_COPPER,
            CHISELED_COPPER,
            WAXED_OXIDIZED_CHISELED_COPPER,
            WAXED_WEATHERED_CHISELED_COPPER,
            WAXED_EXPOSED_CHISELED_COPPER,
            WAXED_CHISELED_COPPER,
            OXIDIZED_CUT_COPPER_STAIRS,
            WEATHERED_CUT_COPPER_STAIRS,
            EXPOSED_CUT_COPPER_STAIRS,
            CUT_COPPER_STAIRS,
            OXIDIZED_CUT_COPPER_SLAB,
            WEATHERED_CUT_COPPER_SLAB,
            EXPOSED_CUT_COPPER_SLAB,
            CUT_COPPER_SLAB,
            WAXED_COPPER_BLOCK,
            WAXED_WEATHERED_COPPER,
            WAXED_EXPOSED_COPPER,
            WAXED_OXIDIZED_COPPER,
            WAXED_OXIDIZED_CUT_COPPER,
            WAXED_WEATHERED_CUT_COPPER,
            WAXED_EXPOSED_CUT_COPPER,
            WAXED_CUT_COPPER,
            WAXED_OXIDIZED_CUT_COPPER_STAIRS,
            WAXED_WEATHERED_CUT_COPPER_STAIRS,
            WAXED_EXPOSED_CUT_COPPER_STAIRS,
            WAXED_CUT_COPPER_STAIRS,
            WAXED_OXIDIZED_CUT_COPPER_SLAB,
            WAXED_WEATHERED_CUT_COPPER_SLAB,
            WAXED_EXPOSED_CUT_COPPER_SLAB,
            WAXED_CUT_COPPER_SLAB,
            COPPER_DOOR,
            EXPOSED_COPPER_DOOR,
            OXIDIZED_COPPER_DOOR,
            WEATHERED_COPPER_DOOR,
            WAXED_COPPER_DOOR,
            WAXED_EXPOSED_COPPER_DOOR,
            WAXED_OXIDIZED_COPPER_DOOR,
            WAXED_WEATHERED_COPPER_DOOR,
            COPPER_TRAPDOOR,
            EXPOSED_COPPER_TRAPDOOR,
            OXIDIZED_COPPER_TRAPDOOR,
            WEATHERED_COPPER_TRAPDOOR,
            WAXED_COPPER_TRAPDOOR,
            WAXED_EXPOSED_COPPER_TRAPDOOR,
            WAXED_OXIDIZED_COPPER_TRAPDOOR,
            WAXED_WEATHERED_COPPER_TRAPDOOR,
            COPPER_GRATE,
            EXPOSED_COPPER_GRATE,
            WEATHERED_COPPER_GRATE,
            OXIDIZED_COPPER_GRATE,
            WAXED_COPPER_GRATE,
            WAXED_EXPOSED_COPPER_GRATE,
            WAXED_WEATHERED_COPPER_GRATE,
            WAXED_OXIDIZED_COPPER_GRATE,
            COPPER_BULB,
            EXPOSED_COPPER_BULB,
            WEATHERED_COPPER_BULB,
            OXIDIZED_COPPER_BULB,
            WAXED_COPPER_BULB,
            WAXED_EXPOSED_COPPER_BULB,
            WAXED_WEATHERED_COPPER_BULB,
            WAXED_OXIDIZED_COPPER_BULB,
            COPPER_CHEST,
            EXPOSED_COPPER_CHEST,
            WEATHERED_COPPER_CHEST,
            OXIDIZED_COPPER_CHEST,
            WAXED_COPPER_CHEST,
            WAXED_EXPOSED_COPPER_CHEST,
            WAXED_WEATHERED_COPPER_CHEST,
            WAXED_OXIDIZED_COPPER_CHEST,
            COPPER_GOLEM_STATUE,
            EXPOSED_COPPER_GOLEM_STATUE,
            WEATHERED_COPPER_GOLEM_STATUE,
            OXIDIZED_COPPER_GOLEM_STATUE,
            WAXED_COPPER_GOLEM_STATUE,
            WAXED_EXPOSED_COPPER_GOLEM_STATUE,
            WAXED_WEATHERED_COPPER_GOLEM_STATUE,
            WAXED_OXIDIZED_COPPER_GOLEM_STATUE,
            LIGHTNING_ROD,
            EXPOSED_LIGHTNING_ROD,
            WEATHERED_LIGHTNING_ROD,
            OXIDIZED_LIGHTNING_ROD,
            WAXED_LIGHTNING_ROD,
            WAXED_EXPOSED_LIGHTNING_ROD,
            WAXED_WEATHERED_LIGHTNING_ROD,
            WAXED_OXIDIZED_LIGHTNING_ROD,
            POINTED_DRIPSTONE,
            DRIPSTONE_BLOCK,
            CAVE_VINES,
            CAVE_VINES_PLANT,
            SPORE_BLOSSOM,
            AZALEA,
            FLOWERING_AZALEA,
            MOSS_CARPET,
            PINK_PETALS,
            WILDFLOWERS,
            LEAF_LITTER,
            MOSS_BLOCK,
            BIG_DRIPLEAF,
            BIG_DRIPLEAF_STEM,
            SMALL_DRIPLEAF,
            HANGING_ROOTS,
            ROOTED_DIRT,
            MUD,
            DEEPSLATE,
            COBBLED_DEEPSLATE,
            COBBLED_DEEPSLATE_STAIRS,
            COBBLED_DEEPSLATE_SLAB,
            COBBLED_DEEPSLATE_WALL,
            POLISHED_DEEPSLATE,
            POLISHED_DEEPSLATE_STAIRS,
            POLISHED_DEEPSLATE_SLAB,
            POLISHED_DEEPSLATE_WALL,
            DEEPSLATE_TILES,
            DEEPSLATE_TILE_STAIRS,
            DEEPSLATE_TILE_SLAB,
            DEEPSLATE_TILE_WALL,
            DEEPSLATE_BRICKS,
            DEEPSLATE_BRICK_STAIRS,
            DEEPSLATE_BRICK_SLAB,
            DEEPSLATE_BRICK_WALL,
            CHISELED_DEEPSLATE,
            CRACKED_DEEPSLATE_BRICKS,
            CRACKED_DEEPSLATE_TILES,
            INFESTED_DEEPSLATE,
            SMOOTH_BASALT,
            RAW_IRON_BLOCK,
            RAW_COPPER_BLOCK,
            RAW_GOLD_BLOCK,
            POTTED_AZALEA_BUSH,
            POTTED_FLOWERING_AZALEA_BUSH,
            OCHRE_FROGLIGHT,
            VERDANT_FROGLIGHT,
            PEARLESCENT_FROGLIGHT,
            FROGSPAWN,
            REINFORCED_DEEPSLATE,
            DECORATED_POT,
            CRAFTER,
            TRIAL_SPAWNER,
            VAULT,
            HEAVY_CORE,
            PALE_MOSS_BLOCK,
            PALE_MOSS_CARPET,
            PALE_HANGING_MOSS,
            OPEN_EYEBLOSSOM,
            CLOSED_EYEBLOSSOM,
            POTTED_OPEN_EYEBLOSSOM,
            POTTED_CLOSED_EYEBLOSSOM,
            FIREFLY_BUSH,
    };

    private static final List<Block<?>> VALUES_LIST = Collections.unmodifiableList(Arrays.asList(VALUES));

    protected Blocks() {
    }

    public static List<Block<?>> values() {
        return VALUES_LIST;
    }

    public static BuiltInRegistry<Block<?>> createDefaultRegistry(Server server) {
        return new BuiltInRegistry<>(server, RegistryKey.BLOCK).modify(registry -> {
            registry.register(Block.AIR.key(), Block.AIR);
            registry.register(Block.STONE.key(), Block.STONE);
            registry.register(Block.GRANITE.key(), Block.GRANITE);
            registry.register(Block.POLISHED_GRANITE.key(), Block.POLISHED_GRANITE);
            registry.register(Block.DIORITE.key(), Block.DIORITE);
            registry.register(Block.POLISHED_DIORITE.key(), Block.POLISHED_DIORITE);
            registry.register(Block.ANDESITE.key(), Block.ANDESITE);
            registry.register(Block.POLISHED_ANDESITE.key(), Block.POLISHED_ANDESITE);
            registry.register(Block.GRASS_BLOCK.key(), Block.GRASS_BLOCK);
            registry.register(Block.DIRT.key(), Block.DIRT);
            registry.register(Block.COARSE_DIRT.key(), Block.COARSE_DIRT);
            registry.register(Block.PODZOL.key(), Block.PODZOL);
            registry.register(Block.COBBLESTONE.key(), Block.COBBLESTONE);
            registry.register(Block.OAK_PLANKS.key(), Block.OAK_PLANKS);
            registry.register(Block.SPRUCE_PLANKS.key(), Block.SPRUCE_PLANKS);
            registry.register(Block.BIRCH_PLANKS.key(), Block.BIRCH_PLANKS);
            registry.register(Block.JUNGLE_PLANKS.key(), Block.JUNGLE_PLANKS);
            registry.register(Block.ACACIA_PLANKS.key(), Block.ACACIA_PLANKS);
            registry.register(Block.CHERRY_PLANKS.key(), Block.CHERRY_PLANKS);
            registry.register(Block.DARK_OAK_PLANKS.key(), Block.DARK_OAK_PLANKS);
            registry.register(Block.PALE_OAK_WOOD.key(), Block.PALE_OAK_WOOD);
            registry.register(Block.PALE_OAK_PLANKS.key(), Block.PALE_OAK_PLANKS);
            registry.register(Block.MANGROVE_PLANKS.key(), Block.MANGROVE_PLANKS);
            registry.register(Block.BAMBOO_PLANKS.key(), Block.BAMBOO_PLANKS);
            registry.register(Block.BAMBOO_MOSAIC.key(), Block.BAMBOO_MOSAIC);
            registry.register(Block.OAK_SAPLING.key(), Block.OAK_SAPLING);
            registry.register(Block.SPRUCE_SAPLING.key(), Block.SPRUCE_SAPLING);
            registry.register(Block.BIRCH_SAPLING.key(), Block.BIRCH_SAPLING);
            registry.register(Block.JUNGLE_SAPLING.key(), Block.JUNGLE_SAPLING);
            registry.register(Block.ACACIA_SAPLING.key(), Block.ACACIA_SAPLING);
            registry.register(Block.CHERRY_SAPLING.key(), Block.CHERRY_SAPLING);
            registry.register(Block.DARK_OAK_SAPLING.key(), Block.DARK_OAK_SAPLING);
            registry.register(Block.PALE_OAK_SAPLING.key(), Block.PALE_OAK_SAPLING);
            registry.register(Block.MANGROVE_PROPAGULE.key(), Block.MANGROVE_PROPAGULE);
            registry.register(Block.BEDROCK.key(), Block.BEDROCK);
            registry.register(Block.WATER.key(), Block.WATER);
            registry.register(Block.LAVA.key(), Block.LAVA);
            registry.register(Block.SAND.key(), Block.SAND);
            registry.register(Block.SUSPICIOUS_SAND.key(), Block.SUSPICIOUS_SAND);
            registry.register(Block.RED_SAND.key(), Block.RED_SAND);
            registry.register(Block.GRAVEL.key(), Block.GRAVEL);
            registry.register(Block.SUSPICIOUS_GRAVEL.key(), Block.SUSPICIOUS_GRAVEL);
            registry.register(Block.GOLD_ORE.key(), Block.GOLD_ORE);
            registry.register(Block.DEEPSLATE_GOLD_ORE.key(), Block.DEEPSLATE_GOLD_ORE);
            registry.register(Block.IRON_ORE.key(), Block.IRON_ORE);
            registry.register(Block.DEEPSLATE_IRON_ORE.key(), Block.DEEPSLATE_IRON_ORE);
            registry.register(Block.COAL_ORE.key(), Block.COAL_ORE);
            registry.register(Block.DEEPSLATE_COAL_ORE.key(), Block.DEEPSLATE_COAL_ORE);
            registry.register(Block.NETHER_GOLD_ORE.key(), Block.NETHER_GOLD_ORE);
            registry.register(Block.OAK_LOG.key(), Block.OAK_LOG);
            registry.register(Block.SPRUCE_LOG.key(), Block.SPRUCE_LOG);
            registry.register(Block.BIRCH_LOG.key(), Block.BIRCH_LOG);
            registry.register(Block.JUNGLE_LOG.key(), Block.JUNGLE_LOG);
            registry.register(Block.ACACIA_LOG.key(), Block.ACACIA_LOG);
            registry.register(Block.CHERRY_LOG.key(), Block.CHERRY_LOG);
            registry.register(Block.DARK_OAK_LOG.key(), Block.DARK_OAK_LOG);
            registry.register(Block.PALE_OAK_LOG.key(), Block.PALE_OAK_LOG);
            registry.register(Block.MANGROVE_LOG.key(), Block.MANGROVE_LOG);
            registry.register(Block.MANGROVE_ROOTS.key(), Block.MANGROVE_ROOTS);
            registry.register(Block.MUDDY_MANGROVE_ROOTS.key(), Block.MUDDY_MANGROVE_ROOTS);
            registry.register(Block.BAMBOO_BLOCK.key(), Block.BAMBOO_BLOCK);
            registry.register(Block.STRIPPED_SPRUCE_LOG.key(), Block.STRIPPED_SPRUCE_LOG);
            registry.register(Block.STRIPPED_BIRCH_LOG.key(), Block.STRIPPED_BIRCH_LOG);
            registry.register(Block.STRIPPED_JUNGLE_LOG.key(), Block.STRIPPED_JUNGLE_LOG);
            registry.register(Block.STRIPPED_ACACIA_LOG.key(), Block.STRIPPED_ACACIA_LOG);
            registry.register(Block.STRIPPED_CHERRY_LOG.key(), Block.STRIPPED_CHERRY_LOG);
            registry.register(Block.STRIPPED_DARK_OAK_LOG.key(), Block.STRIPPED_DARK_OAK_LOG);
            registry.register(Block.STRIPPED_PALE_OAK_LOG.key(), Block.STRIPPED_PALE_OAK_LOG);
            registry.register(Block.STRIPPED_OAK_LOG.key(), Block.STRIPPED_OAK_LOG);
            registry.register(Block.STRIPPED_MANGROVE_LOG.key(), Block.STRIPPED_MANGROVE_LOG);
            registry.register(Block.STRIPPED_BAMBOO_BLOCK.key(), Block.STRIPPED_BAMBOO_BLOCK);
            registry.register(Block.OAK_WOOD.key(), Block.OAK_WOOD);
            registry.register(Block.SPRUCE_WOOD.key(), Block.SPRUCE_WOOD);
            registry.register(Block.BIRCH_WOOD.key(), Block.BIRCH_WOOD);
            registry.register(Block.JUNGLE_WOOD.key(), Block.JUNGLE_WOOD);
            registry.register(Block.ACACIA_WOOD.key(), Block.ACACIA_WOOD);
            registry.register(Block.CHERRY_WOOD.key(), Block.CHERRY_WOOD);
            registry.register(Block.DARK_OAK_WOOD.key(), Block.DARK_OAK_WOOD);
            registry.register(Block.MANGROVE_WOOD.key(), Block.MANGROVE_WOOD);
            registry.register(Block.STRIPPED_OAK_WOOD.key(), Block.STRIPPED_OAK_WOOD);
            registry.register(Block.STRIPPED_SPRUCE_WOOD.key(), Block.STRIPPED_SPRUCE_WOOD);
            registry.register(Block.STRIPPED_BIRCH_WOOD.key(), Block.STRIPPED_BIRCH_WOOD);
            registry.register(Block.STRIPPED_JUNGLE_WOOD.key(), Block.STRIPPED_JUNGLE_WOOD);
            registry.register(Block.STRIPPED_ACACIA_WOOD.key(), Block.STRIPPED_ACACIA_WOOD);
            registry.register(Block.STRIPPED_CHERRY_WOOD.key(), Block.STRIPPED_CHERRY_WOOD);
            registry.register(Block.STRIPPED_DARK_OAK_WOOD.key(), Block.STRIPPED_DARK_OAK_WOOD);
            registry.register(Block.STRIPPED_PALE_OAK_WOOD.key(), Block.STRIPPED_PALE_OAK_WOOD);
            registry.register(Block.STRIPPED_MANGROVE_WOOD.key(), Block.STRIPPED_MANGROVE_WOOD);
            registry.register(Block.OAK_LEAVES.key(), Block.OAK_LEAVES);
            registry.register(Block.SPRUCE_LEAVES.key(), Block.SPRUCE_LEAVES);
            registry.register(Block.BIRCH_LEAVES.key(), Block.BIRCH_LEAVES);
            registry.register(Block.JUNGLE_LEAVES.key(), Block.JUNGLE_LEAVES);
            registry.register(Block.ACACIA_LEAVES.key(), Block.ACACIA_LEAVES);
            registry.register(Block.CHERRY_LEAVES.key(), Block.CHERRY_LEAVES);
            registry.register(Block.DARK_OAK_LEAVES.key(), Block.DARK_OAK_LEAVES);
            registry.register(Block.PALE_OAK_LEAVES.key(), Block.PALE_OAK_LEAVES);
            registry.register(Block.MANGROVE_LEAVES.key(), Block.MANGROVE_LEAVES);
            registry.register(Block.AZALEA_LEAVES.key(), Block.AZALEA_LEAVES);
            registry.register(Block.FLOWERING_AZALEA_LEAVES.key(), Block.FLOWERING_AZALEA_LEAVES);
            registry.register(Block.SPONGE.key(), Block.SPONGE);
            registry.register(Block.WET_SPONGE.key(), Block.WET_SPONGE);
            registry.register(Block.GLASS.key(), Block.GLASS);
            registry.register(Block.LAPIS_ORE.key(), Block.LAPIS_ORE);
            registry.register(Block.DEEPSLATE_LAPIS_ORE.key(), Block.DEEPSLATE_LAPIS_ORE);
            registry.register(Block.LAPIS_BLOCK.key(), Block.LAPIS_BLOCK);
            registry.register(Block.DISPENSER.key(), Block.DISPENSER);
            registry.register(Block.SANDSTONE.key(), Block.SANDSTONE);
            registry.register(Block.CHISELED_SANDSTONE.key(), Block.CHISELED_SANDSTONE);
            registry.register(Block.CUT_SANDSTONE.key(), Block.CUT_SANDSTONE);
            registry.register(Block.NOTE_BLOCK.key(), Block.NOTE_BLOCK);
            registry.register(Block.WHITE_BED.key(), Block.WHITE_BED);
            registry.register(Block.ORANGE_BED.key(), Block.ORANGE_BED);
            registry.register(Block.MAGENTA_BED.key(), Block.MAGENTA_BED);
            registry.register(Block.LIGHT_BLUE_BED.key(), Block.LIGHT_BLUE_BED);
            registry.register(Block.YELLOW_BED.key(), Block.YELLOW_BED);
            registry.register(Block.LIME_BED.key(), Block.LIME_BED);
            registry.register(Block.PINK_BED.key(), Block.PINK_BED);
            registry.register(Block.GRAY_BED.key(), Block.GRAY_BED);
            registry.register(Block.LIGHT_GRAY_BED.key(), Block.LIGHT_GRAY_BED);
            registry.register(Block.CYAN_BED.key(), Block.CYAN_BED);
            registry.register(Block.PURPLE_BED.key(), Block.PURPLE_BED);
            registry.register(Block.BLUE_BED.key(), Block.BLUE_BED);
            registry.register(Block.BROWN_BED.key(), Block.BROWN_BED);
            registry.register(Block.GREEN_BED.key(), Block.GREEN_BED);
            registry.register(Block.RED_BED.key(), Block.RED_BED);
            registry.register(Block.BLACK_BED.key(), Block.BLACK_BED);
            registry.register(Block.POWERED_RAIL.key(), Block.POWERED_RAIL);
            registry.register(Block.DETECTOR_RAIL.key(), Block.DETECTOR_RAIL);
            registry.register(Block.STICKY_PISTON.key(), Block.STICKY_PISTON);
            registry.register(Block.COBWEB.key(), Block.COBWEB);
            registry.register(Block.SHORT_GRASS.key(), Block.SHORT_GRASS);
            registry.register(Block.FERN.key(), Block.FERN);
            registry.register(Block.DEAD_BUSH.key(), Block.DEAD_BUSH);
            registry.register(Block.BUSH.key(), Block.BUSH);
            registry.register(Block.SHORT_DRY_GRASS.key(), Block.SHORT_DRY_GRASS);
            registry.register(Block.TALL_DRY_GRASS.key(), Block.TALL_DRY_GRASS);
            registry.register(Block.SEAGRASS.key(), Block.SEAGRASS);
            registry.register(Block.TALL_SEAGRASS.key(), Block.TALL_SEAGRASS);
            registry.register(Block.PISTON.key(), Block.PISTON);
            registry.register(Block.PISTON_HEAD.key(), Block.PISTON_HEAD);
            registry.register(Block.WHITE_WOOL.key(), Block.WHITE_WOOL);
            registry.register(Block.ORANGE_WOOL.key(), Block.ORANGE_WOOL);
            registry.register(Block.MAGENTA_WOOL.key(), Block.MAGENTA_WOOL);
            registry.register(Block.LIGHT_BLUE_WOOL.key(), Block.LIGHT_BLUE_WOOL);
            registry.register(Block.YELLOW_WOOL.key(), Block.YELLOW_WOOL);
            registry.register(Block.LIME_WOOL.key(), Block.LIME_WOOL);
            registry.register(Block.PINK_WOOL.key(), Block.PINK_WOOL);
            registry.register(Block.GRAY_WOOL.key(), Block.GRAY_WOOL);
            registry.register(Block.LIGHT_GRAY_WOOL.key(), Block.LIGHT_GRAY_WOOL);
            registry.register(Block.CYAN_WOOL.key(), Block.CYAN_WOOL);
            registry.register(Block.PURPLE_WOOL.key(), Block.PURPLE_WOOL);
            registry.register(Block.BLUE_WOOL.key(), Block.BLUE_WOOL);
            registry.register(Block.BROWN_WOOL.key(), Block.BROWN_WOOL);
            registry.register(Block.GREEN_WOOL.key(), Block.GREEN_WOOL);
            registry.register(Block.RED_WOOL.key(), Block.RED_WOOL);
            registry.register(Block.BLACK_WOOL.key(), Block.BLACK_WOOL);
            registry.register(Block.MOVING_PISTON.key(), Block.MOVING_PISTON);
            registry.register(Block.DANDELION.key(), Block.DANDELION);
            registry.register(Block.TORCHFLOWER.key(), Block.TORCHFLOWER);
            registry.register(Block.POPPY.key(), Block.POPPY);
            registry.register(Block.BLUE_ORCHID.key(), Block.BLUE_ORCHID);
            registry.register(Block.ALLIUM.key(), Block.ALLIUM);
            registry.register(Block.AZURE_BLUET.key(), Block.AZURE_BLUET);
            registry.register(Block.RED_TULIP.key(), Block.RED_TULIP);
            registry.register(Block.ORANGE_TULIP.key(), Block.ORANGE_TULIP);
            registry.register(Block.WHITE_TULIP.key(), Block.WHITE_TULIP);
            registry.register(Block.PINK_TULIP.key(), Block.PINK_TULIP);
            registry.register(Block.OXEYE_DAISY.key(), Block.OXEYE_DAISY);
            registry.register(Block.CORNFLOWER.key(), Block.CORNFLOWER);
            registry.register(Block.WITHER_ROSE.key(), Block.WITHER_ROSE);
            registry.register(Block.LILY_OF_THE_VALLEY.key(), Block.LILY_OF_THE_VALLEY);
            registry.register(Block.BROWN_MUSHROOM.key(), Block.BROWN_MUSHROOM);
            registry.register(Block.RED_MUSHROOM.key(), Block.RED_MUSHROOM);
            registry.register(Block.GOLD_BLOCK.key(), Block.GOLD_BLOCK);
            registry.register(Block.IRON_BLOCK.key(), Block.IRON_BLOCK);
            registry.register(Block.BRICKS.key(), Block.BRICKS);
            registry.register(Block.TNT.key(), Block.TNT);
            registry.register(Block.BOOKSHELF.key(), Block.BOOKSHELF);
            registry.register(Block.CHISELED_BOOKSHELF.key(), Block.CHISELED_BOOKSHELF);
            registry.register(Block.ACACIA_SHELF.key(), Block.ACACIA_SHELF);
            registry.register(Block.BAMBOO_SHELF.key(), Block.BAMBOO_SHELF);
            registry.register(Block.BIRCH_SHELF.key(), Block.BIRCH_SHELF);
            registry.register(Block.CHERRY_SHELF.key(), Block.CHERRY_SHELF);
            registry.register(Block.CRIMSON_SHELF.key(), Block.CRIMSON_SHELF);
            registry.register(Block.DARK_OAK_SHELF.key(), Block.DARK_OAK_SHELF);
            registry.register(Block.JUNGLE_SHELF.key(), Block.JUNGLE_SHELF);
            registry.register(Block.MANGROVE_SHELF.key(), Block.MANGROVE_SHELF);
            registry.register(Block.OAK_SHELF.key(), Block.OAK_SHELF);
            registry.register(Block.PALE_OAK_SHELF.key(), Block.PALE_OAK_SHELF);
            registry.register(Block.SPRUCE_SHELF.key(), Block.SPRUCE_SHELF);
            registry.register(Block.WARPED_SHELF.key(), Block.WARPED_SHELF);
            registry.register(Block.MOSSY_COBBLESTONE.key(), Block.MOSSY_COBBLESTONE);
            registry.register(Block.OBSIDIAN.key(), Block.OBSIDIAN);
            registry.register(Block.TORCH.key(), Block.TORCH);
            registry.register(Block.WALL_TORCH.key(), Block.WALL_TORCH);
            registry.register(Block.FIRE.key(), Block.FIRE);
            registry.register(Block.SOUL_FIRE.key(), Block.SOUL_FIRE);
            registry.register(Block.SPAWNER.key(), Block.SPAWNER);
            registry.register(Block.CREAKING_HEART.key(), Block.CREAKING_HEART);
            registry.register(Block.OAK_STAIRS.key(), Block.OAK_STAIRS);
            registry.register(Block.CHEST.key(), Block.CHEST);
            registry.register(Block.REDSTONE_WIRE.key(), Block.REDSTONE_WIRE);
            registry.register(Block.DIAMOND_ORE.key(), Block.DIAMOND_ORE);
            registry.register(Block.DEEPSLATE_DIAMOND_ORE.key(), Block.DEEPSLATE_DIAMOND_ORE);
            registry.register(Block.DIAMOND_BLOCK.key(), Block.DIAMOND_BLOCK);
            registry.register(Block.CRAFTING_TABLE.key(), Block.CRAFTING_TABLE);
            registry.register(Block.WHEAT.key(), Block.WHEAT);
            registry.register(Block.FARMLAND.key(), Block.FARMLAND);
            registry.register(Block.FURNACE.key(), Block.FURNACE);
            registry.register(Block.OAK_SIGN.key(), Block.OAK_SIGN);
            registry.register(Block.SPRUCE_SIGN.key(), Block.SPRUCE_SIGN);
            registry.register(Block.BIRCH_SIGN.key(), Block.BIRCH_SIGN);
            registry.register(Block.ACACIA_SIGN.key(), Block.ACACIA_SIGN);
            registry.register(Block.CHERRY_SIGN.key(), Block.CHERRY_SIGN);
            registry.register(Block.JUNGLE_SIGN.key(), Block.JUNGLE_SIGN);
            registry.register(Block.DARK_OAK_SIGN.key(), Block.DARK_OAK_SIGN);
            registry.register(Block.PALE_OAK_SIGN.key(), Block.PALE_OAK_SIGN);
            registry.register(Block.MANGROVE_SIGN.key(), Block.MANGROVE_SIGN);
            registry.register(Block.BAMBOO_SIGN.key(), Block.BAMBOO_SIGN);
            registry.register(Block.OAK_DOOR.key(), Block.OAK_DOOR);
            registry.register(Block.LADDER.key(), Block.LADDER);
            registry.register(Block.RAIL.key(), Block.RAIL);
            registry.register(Block.COBBLESTONE_STAIRS.key(), Block.COBBLESTONE_STAIRS);
            registry.register(Block.OAK_WALL_SIGN.key(), Block.OAK_WALL_SIGN);
            registry.register(Block.SPRUCE_WALL_SIGN.key(), Block.SPRUCE_WALL_SIGN);
            registry.register(Block.BIRCH_WALL_SIGN.key(), Block.BIRCH_WALL_SIGN);
            registry.register(Block.ACACIA_WALL_SIGN.key(), Block.ACACIA_WALL_SIGN);
            registry.register(Block.CHERRY_WALL_SIGN.key(), Block.CHERRY_WALL_SIGN);
            registry.register(Block.JUNGLE_WALL_SIGN.key(), Block.JUNGLE_WALL_SIGN);
            registry.register(Block.DARK_OAK_WALL_SIGN.key(), Block.DARK_OAK_WALL_SIGN);
            registry.register(Block.PALE_OAK_WALL_SIGN.key(), Block.PALE_OAK_WALL_SIGN);
            registry.register(Block.MANGROVE_WALL_SIGN.key(), Block.MANGROVE_WALL_SIGN);
            registry.register(Block.BAMBOO_WALL_SIGN.key(), Block.BAMBOO_WALL_SIGN);
            registry.register(Block.OAK_HANGING_SIGN.key(), Block.OAK_HANGING_SIGN);
            registry.register(Block.SPRUCE_HANGING_SIGN.key(), Block.SPRUCE_HANGING_SIGN);
            registry.register(Block.BIRCH_HANGING_SIGN.key(), Block.BIRCH_HANGING_SIGN);
            registry.register(Block.ACACIA_HANGING_SIGN.key(), Block.ACACIA_HANGING_SIGN);
            registry.register(Block.CHERRY_HANGING_SIGN.key(), Block.CHERRY_HANGING_SIGN);
            registry.register(Block.JUNGLE_HANGING_SIGN.key(), Block.JUNGLE_HANGING_SIGN);
            registry.register(Block.DARK_OAK_HANGING_SIGN.key(), Block.DARK_OAK_HANGING_SIGN);
            registry.register(Block.PALE_OAK_HANGING_SIGN.key(), Block.PALE_OAK_HANGING_SIGN);
            registry.register(Block.CRIMSON_HANGING_SIGN.key(), Block.CRIMSON_HANGING_SIGN);
            registry.register(Block.WARPED_HANGING_SIGN.key(), Block.WARPED_HANGING_SIGN);
            registry.register(Block.MANGROVE_HANGING_SIGN.key(), Block.MANGROVE_HANGING_SIGN);
            registry.register(Block.BAMBOO_HANGING_SIGN.key(), Block.BAMBOO_HANGING_SIGN);
            registry.register(Block.OAK_WALL_HANGING_SIGN.key(), Block.OAK_WALL_HANGING_SIGN);
            registry.register(Block.SPRUCE_WALL_HANGING_SIGN.key(), Block.SPRUCE_WALL_HANGING_SIGN);
            registry.register(Block.BIRCH_WALL_HANGING_SIGN.key(), Block.BIRCH_WALL_HANGING_SIGN);
            registry.register(Block.ACACIA_WALL_HANGING_SIGN.key(), Block.ACACIA_WALL_HANGING_SIGN);
            registry.register(Block.CHERRY_WALL_HANGING_SIGN.key(), Block.CHERRY_WALL_HANGING_SIGN);
            registry.register(Block.JUNGLE_WALL_HANGING_SIGN.key(), Block.JUNGLE_WALL_HANGING_SIGN);
            registry.register(Block.DARK_OAK_WALL_HANGING_SIGN.key(), Block.DARK_OAK_WALL_HANGING_SIGN);
            registry.register(Block.PALE_OAK_WALL_HANGING_SIGN.key(), Block.PALE_OAK_WALL_HANGING_SIGN);
            registry.register(Block.MANGROVE_WALL_HANGING_SIGN.key(), Block.MANGROVE_WALL_HANGING_SIGN);
            registry.register(Block.CRIMSON_WALL_HANGING_SIGN.key(), Block.CRIMSON_WALL_HANGING_SIGN);
            registry.register(Block.WARPED_WALL_HANGING_SIGN.key(), Block.WARPED_WALL_HANGING_SIGN);
            registry.register(Block.BAMBOO_WALL_HANGING_SIGN.key(), Block.BAMBOO_WALL_HANGING_SIGN);
            registry.register(Block.LEVER.key(), Block.LEVER);
            registry.register(Block.STONE_PRESSURE_PLATE.key(), Block.STONE_PRESSURE_PLATE);
            registry.register(Block.IRON_DOOR.key(), Block.IRON_DOOR);
            registry.register(Block.OAK_PRESSURE_PLATE.key(), Block.OAK_PRESSURE_PLATE);
            registry.register(Block.SPRUCE_PRESSURE_PLATE.key(), Block.SPRUCE_PRESSURE_PLATE);
            registry.register(Block.BIRCH_PRESSURE_PLATE.key(), Block.BIRCH_PRESSURE_PLATE);
            registry.register(Block.JUNGLE_PRESSURE_PLATE.key(), Block.JUNGLE_PRESSURE_PLATE);
            registry.register(Block.ACACIA_PRESSURE_PLATE.key(), Block.ACACIA_PRESSURE_PLATE);
            registry.register(Block.CHERRY_PRESSURE_PLATE.key(), Block.CHERRY_PRESSURE_PLATE);
            registry.register(Block.DARK_OAK_PRESSURE_PLATE.key(), Block.DARK_OAK_PRESSURE_PLATE);
            registry.register(Block.PALE_OAK_PRESSURE_PLATE.key(), Block.PALE_OAK_PRESSURE_PLATE);
            registry.register(Block.MANGROVE_PRESSURE_PLATE.key(), Block.MANGROVE_PRESSURE_PLATE);
            registry.register(Block.BAMBOO_PRESSURE_PLATE.key(), Block.BAMBOO_PRESSURE_PLATE);
            registry.register(Block.REDSTONE_ORE.key(), Block.REDSTONE_ORE);
            registry.register(Block.DEEPSLATE_REDSTONE_ORE.key(), Block.DEEPSLATE_REDSTONE_ORE);
            registry.register(Block.REDSTONE_TORCH.key(), Block.REDSTONE_TORCH);
            registry.register(Block.REDSTONE_WALL_TORCH.key(), Block.REDSTONE_WALL_TORCH);
            registry.register(Block.STONE_BUTTON.key(), Block.STONE_BUTTON);
            registry.register(Block.SNOW.key(), Block.SNOW);
            registry.register(Block.ICE.key(), Block.ICE);
            registry.register(Block.SNOW_BLOCK.key(), Block.SNOW_BLOCK);
            registry.register(Block.CACTUS.key(), Block.CACTUS);
            registry.register(Block.CACTUS_FLOWER.key(), Block.CACTUS_FLOWER);
            registry.register(Block.CLAY.key(), Block.CLAY);
            registry.register(Block.SUGAR_CANE.key(), Block.SUGAR_CANE);
            registry.register(Block.JUKEBOX.key(), Block.JUKEBOX);
            registry.register(Block.OAK_FENCE.key(), Block.OAK_FENCE);
            registry.register(Block.NETHERRACK.key(), Block.NETHERRACK);
            registry.register(Block.SOUL_SAND.key(), Block.SOUL_SAND);
            registry.register(Block.SOUL_SOIL.key(), Block.SOUL_SOIL);
            registry.register(Block.BASALT.key(), Block.BASALT);
            registry.register(Block.POLISHED_BASALT.key(), Block.POLISHED_BASALT);
            registry.register(Block.SOUL_TORCH.key(), Block.SOUL_TORCH);
            registry.register(Block.SOUL_WALL_TORCH.key(), Block.SOUL_WALL_TORCH);
            registry.register(Block.COPPER_TORCH.key(), Block.COPPER_TORCH);
            registry.register(Block.COPPER_WALL_TORCH.key(), Block.COPPER_WALL_TORCH);
            registry.register(Block.GLOWSTONE.key(), Block.GLOWSTONE);
            registry.register(Block.NETHER_PORTAL.key(), Block.NETHER_PORTAL);
            registry.register(Block.CARVED_PUMPKIN.key(), Block.CARVED_PUMPKIN);
            registry.register(Block.JACK_O_LANTERN.key(), Block.JACK_O_LANTERN);
            registry.register(Block.CAKE.key(), Block.CAKE);
            registry.register(Block.REPEATER.key(), Block.REPEATER);
            registry.register(Block.WHITE_STAINED_GLASS.key(), Block.WHITE_STAINED_GLASS);
            registry.register(Block.ORANGE_STAINED_GLASS.key(), Block.ORANGE_STAINED_GLASS);
            registry.register(Block.MAGENTA_STAINED_GLASS.key(), Block.MAGENTA_STAINED_GLASS);
            registry.register(Block.LIGHT_BLUE_STAINED_GLASS.key(), Block.LIGHT_BLUE_STAINED_GLASS);
            registry.register(Block.YELLOW_STAINED_GLASS.key(), Block.YELLOW_STAINED_GLASS);
            registry.register(Block.LIME_STAINED_GLASS.key(), Block.LIME_STAINED_GLASS);
            registry.register(Block.PINK_STAINED_GLASS.key(), Block.PINK_STAINED_GLASS);
            registry.register(Block.GRAY_STAINED_GLASS.key(), Block.GRAY_STAINED_GLASS);
            registry.register(Block.LIGHT_GRAY_STAINED_GLASS.key(), Block.LIGHT_GRAY_STAINED_GLASS);
            registry.register(Block.CYAN_STAINED_GLASS.key(), Block.CYAN_STAINED_GLASS);
            registry.register(Block.PURPLE_STAINED_GLASS.key(), Block.PURPLE_STAINED_GLASS);
            registry.register(Block.BLUE_STAINED_GLASS.key(), Block.BLUE_STAINED_GLASS);
            registry.register(Block.BROWN_STAINED_GLASS.key(), Block.BROWN_STAINED_GLASS);
            registry.register(Block.GREEN_STAINED_GLASS.key(), Block.GREEN_STAINED_GLASS);
            registry.register(Block.RED_STAINED_GLASS.key(), Block.RED_STAINED_GLASS);
            registry.register(Block.BLACK_STAINED_GLASS.key(), Block.BLACK_STAINED_GLASS);
            registry.register(Block.OAK_TRAPDOOR.key(), Block.OAK_TRAPDOOR);
            registry.register(Block.SPRUCE_TRAPDOOR.key(), Block.SPRUCE_TRAPDOOR);
            registry.register(Block.BIRCH_TRAPDOOR.key(), Block.BIRCH_TRAPDOOR);
            registry.register(Block.JUNGLE_TRAPDOOR.key(), Block.JUNGLE_TRAPDOOR);
            registry.register(Block.ACACIA_TRAPDOOR.key(), Block.ACACIA_TRAPDOOR);
            registry.register(Block.CHERRY_TRAPDOOR.key(), Block.CHERRY_TRAPDOOR);
            registry.register(Block.DARK_OAK_TRAPDOOR.key(), Block.DARK_OAK_TRAPDOOR);
            registry.register(Block.PALE_OAK_TRAPDOOR.key(), Block.PALE_OAK_TRAPDOOR);
            registry.register(Block.MANGROVE_TRAPDOOR.key(), Block.MANGROVE_TRAPDOOR);
            registry.register(Block.BAMBOO_TRAPDOOR.key(), Block.BAMBOO_TRAPDOOR);
            registry.register(Block.STONE_BRICKS.key(), Block.STONE_BRICKS);
            registry.register(Block.MOSSY_STONE_BRICKS.key(), Block.MOSSY_STONE_BRICKS);
            registry.register(Block.CRACKED_STONE_BRICKS.key(), Block.CRACKED_STONE_BRICKS);
            registry.register(Block.CHISELED_STONE_BRICKS.key(), Block.CHISELED_STONE_BRICKS);
            registry.register(Block.PACKED_MUD.key(), Block.PACKED_MUD);
            registry.register(Block.MUD_BRICKS.key(), Block.MUD_BRICKS);
            registry.register(Block.INFESTED_STONE.key(), Block.INFESTED_STONE);
            registry.register(Block.INFESTED_COBBLESTONE.key(), Block.INFESTED_COBBLESTONE);
            registry.register(Block.INFESTED_STONE_BRICKS.key(), Block.INFESTED_STONE_BRICKS);
            registry.register(Block.INFESTED_MOSSY_STONE_BRICKS.key(), Block.INFESTED_MOSSY_STONE_BRICKS);
            registry.register(Block.INFESTED_CRACKED_STONE_BRICKS.key(), Block.INFESTED_CRACKED_STONE_BRICKS);
            registry.register(Block.INFESTED_CHISELED_STONE_BRICKS.key(), Block.INFESTED_CHISELED_STONE_BRICKS);
            registry.register(Block.BROWN_MUSHROOM_BLOCK.key(), Block.BROWN_MUSHROOM_BLOCK);
            registry.register(Block.RED_MUSHROOM_BLOCK.key(), Block.RED_MUSHROOM_BLOCK);
            registry.register(Block.MUSHROOM_STEM.key(), Block.MUSHROOM_STEM);
            registry.register(Block.IRON_BARS.key(), Block.IRON_BARS);
            registry.register(Block.COPPER_BARS.key(), Block.COPPER_BARS);
            registry.register(Block.EXPOSED_COPPER_BARS.key(), Block.EXPOSED_COPPER_BARS);
            registry.register(Block.WEATHERED_COPPER_BARS.key(), Block.WEATHERED_COPPER_BARS);
            registry.register(Block.OXIDIZED_COPPER_BARS.key(), Block.OXIDIZED_COPPER_BARS);
            registry.register(Block.WAXED_COPPER_BARS.key(), Block.WAXED_COPPER_BARS);
            registry.register(Block.WAXED_EXPOSED_COPPER_BARS.key(), Block.WAXED_EXPOSED_COPPER_BARS);
            registry.register(Block.WAXED_WEATHERED_COPPER_BARS.key(), Block.WAXED_WEATHERED_COPPER_BARS);
            registry.register(Block.WAXED_OXIDIZED_COPPER_BARS.key(), Block.WAXED_OXIDIZED_COPPER_BARS);
            registry.register(Block.IRON_CHAIN.key(), Block.IRON_CHAIN);
            registry.register(Block.COPPER_CHAIN.key(), Block.COPPER_CHAIN);
            registry.register(Block.EXPOSED_COPPER_CHAIN.key(), Block.EXPOSED_COPPER_CHAIN);
            registry.register(Block.WEATHERED_COPPER_CHAIN.key(), Block.WEATHERED_COPPER_CHAIN);
            registry.register(Block.OXIDIZED_COPPER_CHAIN.key(), Block.OXIDIZED_COPPER_CHAIN);
            registry.register(Block.WAXED_COPPER_CHAIN.key(), Block.WAXED_COPPER_CHAIN);
            registry.register(Block.WAXED_EXPOSED_COPPER_CHAIN.key(), Block.WAXED_EXPOSED_COPPER_CHAIN);
            registry.register(Block.WAXED_WEATHERED_COPPER_CHAIN.key(), Block.WAXED_WEATHERED_COPPER_CHAIN);
            registry.register(Block.WAXED_OXIDIZED_COPPER_CHAIN.key(), Block.WAXED_OXIDIZED_COPPER_CHAIN);
            registry.register(Block.GLASS_PANE.key(), Block.GLASS_PANE);
            registry.register(Block.PUMPKIN.key(), Block.PUMPKIN);
            registry.register(Block.MELON.key(), Block.MELON);
            registry.register(Block.ATTACHED_PUMPKIN_STEM.key(), Block.ATTACHED_PUMPKIN_STEM);
            registry.register(Block.ATTACHED_MELON_STEM.key(), Block.ATTACHED_MELON_STEM);
            registry.register(Block.PUMPKIN_STEM.key(), Block.PUMPKIN_STEM);
            registry.register(Block.MELON_STEM.key(), Block.MELON_STEM);
            registry.register(Block.VINE.key(), Block.VINE);
            registry.register(Block.GLOW_LICHEN.key(), Block.GLOW_LICHEN);
            registry.register(Block.RESIN_CLUMP.key(), Block.RESIN_CLUMP);
            registry.register(Block.OAK_FENCE_GATE.key(), Block.OAK_FENCE_GATE);
            registry.register(Block.BRICK_STAIRS.key(), Block.BRICK_STAIRS);
            registry.register(Block.STONE_BRICK_STAIRS.key(), Block.STONE_BRICK_STAIRS);
            registry.register(Block.MUD_BRICK_STAIRS.key(), Block.MUD_BRICK_STAIRS);
            registry.register(Block.MYCELIUM.key(), Block.MYCELIUM);
            registry.register(Block.LILY_PAD.key(), Block.LILY_PAD);
            registry.register(Block.RESIN_BLOCK.key(), Block.RESIN_BLOCK);
            registry.register(Block.RESIN_BRICKS.key(), Block.RESIN_BRICKS);
            registry.register(Block.RESIN_BRICK_STAIRS.key(), Block.RESIN_BRICK_STAIRS);
            registry.register(Block.RESIN_BRICK_SLAB.key(), Block.RESIN_BRICK_SLAB);
            registry.register(Block.RESIN_BRICK_WALL.key(), Block.RESIN_BRICK_WALL);
            registry.register(Block.CHISELED_RESIN_BRICKS.key(), Block.CHISELED_RESIN_BRICKS);
            registry.register(Block.NETHER_BRICKS.key(), Block.NETHER_BRICKS);
            registry.register(Block.NETHER_BRICK_FENCE.key(), Block.NETHER_BRICK_FENCE);
            registry.register(Block.NETHER_BRICK_STAIRS.key(), Block.NETHER_BRICK_STAIRS);
            registry.register(Block.NETHER_WART.key(), Block.NETHER_WART);
            registry.register(Block.ENCHANTING_TABLE.key(), Block.ENCHANTING_TABLE);
            registry.register(Block.BREWING_STAND.key(), Block.BREWING_STAND);
            registry.register(Block.CAULDRON.key(), Block.CAULDRON);
            registry.register(Block.WATER_CAULDRON.key(), Block.WATER_CAULDRON);
            registry.register(Block.LAVA_CAULDRON.key(), Block.LAVA_CAULDRON);
            registry.register(Block.POWDER_SNOW_CAULDRON.key(), Block.POWDER_SNOW_CAULDRON);
            registry.register(Block.END_PORTAL.key(), Block.END_PORTAL);
            registry.register(Block.END_PORTAL_FRAME.key(), Block.END_PORTAL_FRAME);
            registry.register(Block.END_STONE.key(), Block.END_STONE);
            registry.register(Block.DRAGON_EGG.key(), Block.DRAGON_EGG);
            registry.register(Block.REDSTONE_LAMP.key(), Block.REDSTONE_LAMP);
            registry.register(Block.COCOA.key(), Block.COCOA);
            registry.register(Block.SANDSTONE_STAIRS.key(), Block.SANDSTONE_STAIRS);
            registry.register(Block.EMERALD_ORE.key(), Block.EMERALD_ORE);
            registry.register(Block.DEEPSLATE_EMERALD_ORE.key(), Block.DEEPSLATE_EMERALD_ORE);
            registry.register(Block.ENDER_CHEST.key(), Block.ENDER_CHEST);
            registry.register(Block.TRIPWIRE_HOOK.key(), Block.TRIPWIRE_HOOK);
            registry.register(Block.TRIPWIRE.key(), Block.TRIPWIRE);
            registry.register(Block.EMERALD_BLOCK.key(), Block.EMERALD_BLOCK);
            registry.register(Block.SPRUCE_STAIRS.key(), Block.SPRUCE_STAIRS);
            registry.register(Block.BIRCH_STAIRS.key(), Block.BIRCH_STAIRS);
            registry.register(Block.JUNGLE_STAIRS.key(), Block.JUNGLE_STAIRS);
            registry.register(Block.COMMAND_BLOCK.key(), Block.COMMAND_BLOCK);
            registry.register(Block.BEACON.key(), Block.BEACON);
            registry.register(Block.COBBLESTONE_WALL.key(), Block.COBBLESTONE_WALL);
            registry.register(Block.MOSSY_COBBLESTONE_WALL.key(), Block.MOSSY_COBBLESTONE_WALL);
            registry.register(Block.FLOWER_POT.key(), Block.FLOWER_POT);
            registry.register(Block.POTTED_TORCHFLOWER.key(), Block.POTTED_TORCHFLOWER);
            registry.register(Block.POTTED_OAK_SAPLING.key(), Block.POTTED_OAK_SAPLING);
            registry.register(Block.POTTED_SPRUCE_SAPLING.key(), Block.POTTED_SPRUCE_SAPLING);
            registry.register(Block.POTTED_BIRCH_SAPLING.key(), Block.POTTED_BIRCH_SAPLING);
            registry.register(Block.POTTED_JUNGLE_SAPLING.key(), Block.POTTED_JUNGLE_SAPLING);
            registry.register(Block.POTTED_ACACIA_SAPLING.key(), Block.POTTED_ACACIA_SAPLING);
            registry.register(Block.POTTED_CHERRY_SAPLING.key(), Block.POTTED_CHERRY_SAPLING);
            registry.register(Block.POTTED_DARK_OAK_SAPLING.key(), Block.POTTED_DARK_OAK_SAPLING);
            registry.register(Block.POTTED_PALE_OAK_SAPLING.key(), Block.POTTED_PALE_OAK_SAPLING);
            registry.register(Block.POTTED_MANGROVE_PROPAGULE.key(), Block.POTTED_MANGROVE_PROPAGULE);
            registry.register(Block.POTTED_FERN.key(), Block.POTTED_FERN);
            registry.register(Block.POTTED_DANDELION.key(), Block.POTTED_DANDELION);
            registry.register(Block.POTTED_POPPY.key(), Block.POTTED_POPPY);
            registry.register(Block.POTTED_BLUE_ORCHID.key(), Block.POTTED_BLUE_ORCHID);
            registry.register(Block.POTTED_ALLIUM.key(), Block.POTTED_ALLIUM);
            registry.register(Block.POTTED_AZURE_BLUET.key(), Block.POTTED_AZURE_BLUET);
            registry.register(Block.POTTED_RED_TULIP.key(), Block.POTTED_RED_TULIP);
            registry.register(Block.POTTED_ORANGE_TULIP.key(), Block.POTTED_ORANGE_TULIP);
            registry.register(Block.POTTED_WHITE_TULIP.key(), Block.POTTED_WHITE_TULIP);
            registry.register(Block.POTTED_PINK_TULIP.key(), Block.POTTED_PINK_TULIP);
            registry.register(Block.POTTED_OXEYE_DAISY.key(), Block.POTTED_OXEYE_DAISY);
            registry.register(Block.POTTED_CORNFLOWER.key(), Block.POTTED_CORNFLOWER);
            registry.register(Block.POTTED_LILY_OF_THE_VALLEY.key(), Block.POTTED_LILY_OF_THE_VALLEY);
            registry.register(Block.POTTED_WITHER_ROSE.key(), Block.POTTED_WITHER_ROSE);
            registry.register(Block.POTTED_RED_MUSHROOM.key(), Block.POTTED_RED_MUSHROOM);
            registry.register(Block.POTTED_BROWN_MUSHROOM.key(), Block.POTTED_BROWN_MUSHROOM);
            registry.register(Block.POTTED_DEAD_BUSH.key(), Block.POTTED_DEAD_BUSH);
            registry.register(Block.POTTED_CACTUS.key(), Block.POTTED_CACTUS);
            registry.register(Block.CARROTS.key(), Block.CARROTS);
            registry.register(Block.POTATOES.key(), Block.POTATOES);
            registry.register(Block.OAK_BUTTON.key(), Block.OAK_BUTTON);
            registry.register(Block.SPRUCE_BUTTON.key(), Block.SPRUCE_BUTTON);
            registry.register(Block.BIRCH_BUTTON.key(), Block.BIRCH_BUTTON);
            registry.register(Block.JUNGLE_BUTTON.key(), Block.JUNGLE_BUTTON);
            registry.register(Block.ACACIA_BUTTON.key(), Block.ACACIA_BUTTON);
            registry.register(Block.CHERRY_BUTTON.key(), Block.CHERRY_BUTTON);
            registry.register(Block.DARK_OAK_BUTTON.key(), Block.DARK_OAK_BUTTON);
            registry.register(Block.PALE_OAK_BUTTON.key(), Block.PALE_OAK_BUTTON);
            registry.register(Block.MANGROVE_BUTTON.key(), Block.MANGROVE_BUTTON);
            registry.register(Block.BAMBOO_BUTTON.key(), Block.BAMBOO_BUTTON);
            registry.register(Block.SKELETON_SKULL.key(), Block.SKELETON_SKULL);
            registry.register(Block.SKELETON_WALL_SKULL.key(), Block.SKELETON_WALL_SKULL);
            registry.register(Block.WITHER_SKELETON_SKULL.key(), Block.WITHER_SKELETON_SKULL);
            registry.register(Block.WITHER_SKELETON_WALL_SKULL.key(), Block.WITHER_SKELETON_WALL_SKULL);
            registry.register(Block.ZOMBIE_HEAD.key(), Block.ZOMBIE_HEAD);
            registry.register(Block.ZOMBIE_WALL_HEAD.key(), Block.ZOMBIE_WALL_HEAD);
            registry.register(Block.PLAYER_HEAD.key(), Block.PLAYER_HEAD);
            registry.register(Block.PLAYER_WALL_HEAD.key(), Block.PLAYER_WALL_HEAD);
            registry.register(Block.CREEPER_HEAD.key(), Block.CREEPER_HEAD);
            registry.register(Block.CREEPER_WALL_HEAD.key(), Block.CREEPER_WALL_HEAD);
            registry.register(Block.DRAGON_HEAD.key(), Block.DRAGON_HEAD);
            registry.register(Block.DRAGON_WALL_HEAD.key(), Block.DRAGON_WALL_HEAD);
            registry.register(Block.PIGLIN_HEAD.key(), Block.PIGLIN_HEAD);
            registry.register(Block.PIGLIN_WALL_HEAD.key(), Block.PIGLIN_WALL_HEAD);
            registry.register(Block.ANVIL.key(), Block.ANVIL);
            registry.register(Block.CHIPPED_ANVIL.key(), Block.CHIPPED_ANVIL);
            registry.register(Block.DAMAGED_ANVIL.key(), Block.DAMAGED_ANVIL);
            registry.register(Block.TRAPPED_CHEST.key(), Block.TRAPPED_CHEST);
            registry.register(Block.LIGHT_WEIGHTED_PRESSURE_PLATE.key(), Block.LIGHT_WEIGHTED_PRESSURE_PLATE);
            registry.register(Block.HEAVY_WEIGHTED_PRESSURE_PLATE.key(), Block.HEAVY_WEIGHTED_PRESSURE_PLATE);
            registry.register(Block.COMPARATOR.key(), Block.COMPARATOR);
            registry.register(Block.DAYLIGHT_DETECTOR.key(), Block.DAYLIGHT_DETECTOR);
            registry.register(Block.REDSTONE_BLOCK.key(), Block.REDSTONE_BLOCK);
            registry.register(Block.NETHER_QUARTZ_ORE.key(), Block.NETHER_QUARTZ_ORE);
            registry.register(Block.HOPPER.key(), Block.HOPPER);
            registry.register(Block.QUARTZ_BLOCK.key(), Block.QUARTZ_BLOCK);
            registry.register(Block.CHISELED_QUARTZ_BLOCK.key(), Block.CHISELED_QUARTZ_BLOCK);
            registry.register(Block.QUARTZ_PILLAR.key(), Block.QUARTZ_PILLAR);
            registry.register(Block.QUARTZ_STAIRS.key(), Block.QUARTZ_STAIRS);
            registry.register(Block.ACTIVATOR_RAIL.key(), Block.ACTIVATOR_RAIL);
            registry.register(Block.DROPPER.key(), Block.DROPPER);
            registry.register(Block.WHITE_TERRACOTTA.key(), Block.WHITE_TERRACOTTA);
            registry.register(Block.ORANGE_TERRACOTTA.key(), Block.ORANGE_TERRACOTTA);
            registry.register(Block.MAGENTA_TERRACOTTA.key(), Block.MAGENTA_TERRACOTTA);
            registry.register(Block.LIGHT_BLUE_TERRACOTTA.key(), Block.LIGHT_BLUE_TERRACOTTA);
            registry.register(Block.YELLOW_TERRACOTTA.key(), Block.YELLOW_TERRACOTTA);
            registry.register(Block.LIME_TERRACOTTA.key(), Block.LIME_TERRACOTTA);
            registry.register(Block.PINK_TERRACOTTA.key(), Block.PINK_TERRACOTTA);
            registry.register(Block.GRAY_TERRACOTTA.key(), Block.GRAY_TERRACOTTA);
            registry.register(Block.LIGHT_GRAY_TERRACOTTA.key(), Block.LIGHT_GRAY_TERRACOTTA);
            registry.register(Block.CYAN_TERRACOTTA.key(), Block.CYAN_TERRACOTTA);
            registry.register(Block.PURPLE_TERRACOTTA.key(), Block.PURPLE_TERRACOTTA);
            registry.register(Block.BLUE_TERRACOTTA.key(), Block.BLUE_TERRACOTTA);
            registry.register(Block.BROWN_TERRACOTTA.key(), Block.BROWN_TERRACOTTA);
            registry.register(Block.GREEN_TERRACOTTA.key(), Block.GREEN_TERRACOTTA);
            registry.register(Block.RED_TERRACOTTA.key(), Block.RED_TERRACOTTA);
            registry.register(Block.BLACK_TERRACOTTA.key(), Block.BLACK_TERRACOTTA);
            registry.register(Block.WHITE_STAINED_GLASS_PANE.key(), Block.WHITE_STAINED_GLASS_PANE);
            registry.register(Block.ORANGE_STAINED_GLASS_PANE.key(), Block.ORANGE_STAINED_GLASS_PANE);
            registry.register(Block.MAGENTA_STAINED_GLASS_PANE.key(), Block.MAGENTA_STAINED_GLASS_PANE);
            registry.register(Block.LIGHT_BLUE_STAINED_GLASS_PANE.key(), Block.LIGHT_BLUE_STAINED_GLASS_PANE);
            registry.register(Block.YELLOW_STAINED_GLASS_PANE.key(), Block.YELLOW_STAINED_GLASS_PANE);
            registry.register(Block.LIME_STAINED_GLASS_PANE.key(), Block.LIME_STAINED_GLASS_PANE);
            registry.register(Block.PINK_STAINED_GLASS_PANE.key(), Block.PINK_STAINED_GLASS_PANE);
            registry.register(Block.GRAY_STAINED_GLASS_PANE.key(), Block.GRAY_STAINED_GLASS_PANE);
            registry.register(Block.LIGHT_GRAY_STAINED_GLASS_PANE.key(), Block.LIGHT_GRAY_STAINED_GLASS_PANE);
            registry.register(Block.CYAN_STAINED_GLASS_PANE.key(), Block.CYAN_STAINED_GLASS_PANE);
            registry.register(Block.PURPLE_STAINED_GLASS_PANE.key(), Block.PURPLE_STAINED_GLASS_PANE);
            registry.register(Block.BLUE_STAINED_GLASS_PANE.key(), Block.BLUE_STAINED_GLASS_PANE);
            registry.register(Block.BROWN_STAINED_GLASS_PANE.key(), Block.BROWN_STAINED_GLASS_PANE);
            registry.register(Block.GREEN_STAINED_GLASS_PANE.key(), Block.GREEN_STAINED_GLASS_PANE);
            registry.register(Block.RED_STAINED_GLASS_PANE.key(), Block.RED_STAINED_GLASS_PANE);
            registry.register(Block.BLACK_STAINED_GLASS_PANE.key(), Block.BLACK_STAINED_GLASS_PANE);
            registry.register(Block.ACACIA_STAIRS.key(), Block.ACACIA_STAIRS);
            registry.register(Block.CHERRY_STAIRS.key(), Block.CHERRY_STAIRS);
            registry.register(Block.DARK_OAK_STAIRS.key(), Block.DARK_OAK_STAIRS);
            registry.register(Block.PALE_OAK_STAIRS.key(), Block.PALE_OAK_STAIRS);
            registry.register(Block.MANGROVE_STAIRS.key(), Block.MANGROVE_STAIRS);
            registry.register(Block.BAMBOO_STAIRS.key(), Block.BAMBOO_STAIRS);
            registry.register(Block.BAMBOO_MOSAIC_STAIRS.key(), Block.BAMBOO_MOSAIC_STAIRS);
            registry.register(Block.SLIME_BLOCK.key(), Block.SLIME_BLOCK);
            registry.register(Block.BARRIER.key(), Block.BARRIER);
            registry.register(Block.LIGHT.key(), Block.LIGHT);
            registry.register(Block.IRON_TRAPDOOR.key(), Block.IRON_TRAPDOOR);
            registry.register(Block.PRISMARINE.key(), Block.PRISMARINE);
            registry.register(Block.PRISMARINE_BRICKS.key(), Block.PRISMARINE_BRICKS);
            registry.register(Block.DARK_PRISMARINE.key(), Block.DARK_PRISMARINE);
            registry.register(Block.PRISMARINE_STAIRS.key(), Block.PRISMARINE_STAIRS);
            registry.register(Block.PRISMARINE_BRICK_STAIRS.key(), Block.PRISMARINE_BRICK_STAIRS);
            registry.register(Block.DARK_PRISMARINE_STAIRS.key(), Block.DARK_PRISMARINE_STAIRS);
            registry.register(Block.PRISMARINE_SLAB.key(), Block.PRISMARINE_SLAB);
            registry.register(Block.PRISMARINE_BRICK_SLAB.key(), Block.PRISMARINE_BRICK_SLAB);
            registry.register(Block.DARK_PRISMARINE_SLAB.key(), Block.DARK_PRISMARINE_SLAB);
            registry.register(Block.SEA_LANTERN.key(), Block.SEA_LANTERN);
            registry.register(Block.HAY_BLOCK.key(), Block.HAY_BLOCK);
            registry.register(Block.WHITE_CARPET.key(), Block.WHITE_CARPET);
            registry.register(Block.ORANGE_CARPET.key(), Block.ORANGE_CARPET);
            registry.register(Block.MAGENTA_CARPET.key(), Block.MAGENTA_CARPET);
            registry.register(Block.LIGHT_BLUE_CARPET.key(), Block.LIGHT_BLUE_CARPET);
            registry.register(Block.YELLOW_CARPET.key(), Block.YELLOW_CARPET);
            registry.register(Block.LIME_CARPET.key(), Block.LIME_CARPET);
            registry.register(Block.PINK_CARPET.key(), Block.PINK_CARPET);
            registry.register(Block.GRAY_CARPET.key(), Block.GRAY_CARPET);
            registry.register(Block.LIGHT_GRAY_CARPET.key(), Block.LIGHT_GRAY_CARPET);
            registry.register(Block.CYAN_CARPET.key(), Block.CYAN_CARPET);
            registry.register(Block.PURPLE_CARPET.key(), Block.PURPLE_CARPET);
            registry.register(Block.BLUE_CARPET.key(), Block.BLUE_CARPET);
            registry.register(Block.BROWN_CARPET.key(), Block.BROWN_CARPET);
            registry.register(Block.GREEN_CARPET.key(), Block.GREEN_CARPET);
            registry.register(Block.RED_CARPET.key(), Block.RED_CARPET);
            registry.register(Block.BLACK_CARPET.key(), Block.BLACK_CARPET);
            registry.register(Block.TERRACOTTA.key(), Block.TERRACOTTA);
            registry.register(Block.COAL_BLOCK.key(), Block.COAL_BLOCK);
            registry.register(Block.PACKED_ICE.key(), Block.PACKED_ICE);
            registry.register(Block.SUNFLOWER.key(), Block.SUNFLOWER);
            registry.register(Block.LILAC.key(), Block.LILAC);
            registry.register(Block.ROSE_BUSH.key(), Block.ROSE_BUSH);
            registry.register(Block.PEONY.key(), Block.PEONY);
            registry.register(Block.TALL_GRASS.key(), Block.TALL_GRASS);
            registry.register(Block.LARGE_FERN.key(), Block.LARGE_FERN);
            registry.register(Block.WHITE_BANNER.key(), Block.WHITE_BANNER);
            registry.register(Block.ORANGE_BANNER.key(), Block.ORANGE_BANNER);
            registry.register(Block.MAGENTA_BANNER.key(), Block.MAGENTA_BANNER);
            registry.register(Block.LIGHT_BLUE_BANNER.key(), Block.LIGHT_BLUE_BANNER);
            registry.register(Block.YELLOW_BANNER.key(), Block.YELLOW_BANNER);
            registry.register(Block.LIME_BANNER.key(), Block.LIME_BANNER);
            registry.register(Block.PINK_BANNER.key(), Block.PINK_BANNER);
            registry.register(Block.GRAY_BANNER.key(), Block.GRAY_BANNER);
            registry.register(Block.LIGHT_GRAY_BANNER.key(), Block.LIGHT_GRAY_BANNER);
            registry.register(Block.CYAN_BANNER.key(), Block.CYAN_BANNER);
            registry.register(Block.PURPLE_BANNER.key(), Block.PURPLE_BANNER);
            registry.register(Block.BLUE_BANNER.key(), Block.BLUE_BANNER);
            registry.register(Block.BROWN_BANNER.key(), Block.BROWN_BANNER);
            registry.register(Block.GREEN_BANNER.key(), Block.GREEN_BANNER);
            registry.register(Block.RED_BANNER.key(), Block.RED_BANNER);
            registry.register(Block.BLACK_BANNER.key(), Block.BLACK_BANNER);
            registry.register(Block.WHITE_WALL_BANNER.key(), Block.WHITE_WALL_BANNER);
            registry.register(Block.ORANGE_WALL_BANNER.key(), Block.ORANGE_WALL_BANNER);
            registry.register(Block.MAGENTA_WALL_BANNER.key(), Block.MAGENTA_WALL_BANNER);
            registry.register(Block.LIGHT_BLUE_WALL_BANNER.key(), Block.LIGHT_BLUE_WALL_BANNER);
            registry.register(Block.YELLOW_WALL_BANNER.key(), Block.YELLOW_WALL_BANNER);
            registry.register(Block.LIME_WALL_BANNER.key(), Block.LIME_WALL_BANNER);
            registry.register(Block.PINK_WALL_BANNER.key(), Block.PINK_WALL_BANNER);
            registry.register(Block.GRAY_WALL_BANNER.key(), Block.GRAY_WALL_BANNER);
            registry.register(Block.LIGHT_GRAY_WALL_BANNER.key(), Block.LIGHT_GRAY_WALL_BANNER);
            registry.register(Block.CYAN_WALL_BANNER.key(), Block.CYAN_WALL_BANNER);
            registry.register(Block.PURPLE_WALL_BANNER.key(), Block.PURPLE_WALL_BANNER);
            registry.register(Block.BLUE_WALL_BANNER.key(), Block.BLUE_WALL_BANNER);
            registry.register(Block.BROWN_WALL_BANNER.key(), Block.BROWN_WALL_BANNER);
            registry.register(Block.GREEN_WALL_BANNER.key(), Block.GREEN_WALL_BANNER);
            registry.register(Block.RED_WALL_BANNER.key(), Block.RED_WALL_BANNER);
            registry.register(Block.BLACK_WALL_BANNER.key(), Block.BLACK_WALL_BANNER);
            registry.register(Block.RED_SANDSTONE.key(), Block.RED_SANDSTONE);
            registry.register(Block.CHISELED_RED_SANDSTONE.key(), Block.CHISELED_RED_SANDSTONE);
            registry.register(Block.CUT_RED_SANDSTONE.key(), Block.CUT_RED_SANDSTONE);
            registry.register(Block.RED_SANDSTONE_STAIRS.key(), Block.RED_SANDSTONE_STAIRS);
            registry.register(Block.OAK_SLAB.key(), Block.OAK_SLAB);
            registry.register(Block.SPRUCE_SLAB.key(), Block.SPRUCE_SLAB);
            registry.register(Block.BIRCH_SLAB.key(), Block.BIRCH_SLAB);
            registry.register(Block.JUNGLE_SLAB.key(), Block.JUNGLE_SLAB);
            registry.register(Block.ACACIA_SLAB.key(), Block.ACACIA_SLAB);
            registry.register(Block.CHERRY_SLAB.key(), Block.CHERRY_SLAB);
            registry.register(Block.DARK_OAK_SLAB.key(), Block.DARK_OAK_SLAB);
            registry.register(Block.PALE_OAK_SLAB.key(), Block.PALE_OAK_SLAB);
            registry.register(Block.MANGROVE_SLAB.key(), Block.MANGROVE_SLAB);
            registry.register(Block.BAMBOO_SLAB.key(), Block.BAMBOO_SLAB);
            registry.register(Block.BAMBOO_MOSAIC_SLAB.key(), Block.BAMBOO_MOSAIC_SLAB);
            registry.register(Block.STONE_SLAB.key(), Block.STONE_SLAB);
            registry.register(Block.SMOOTH_STONE_SLAB.key(), Block.SMOOTH_STONE_SLAB);
            registry.register(Block.SANDSTONE_SLAB.key(), Block.SANDSTONE_SLAB);
            registry.register(Block.CUT_SANDSTONE_SLAB.key(), Block.CUT_SANDSTONE_SLAB);
            registry.register(Block.PETRIFIED_OAK_SLAB.key(), Block.PETRIFIED_OAK_SLAB);
            registry.register(Block.COBBLESTONE_SLAB.key(), Block.COBBLESTONE_SLAB);
            registry.register(Block.BRICK_SLAB.key(), Block.BRICK_SLAB);
            registry.register(Block.STONE_BRICK_SLAB.key(), Block.STONE_BRICK_SLAB);
            registry.register(Block.MUD_BRICK_SLAB.key(), Block.MUD_BRICK_SLAB);
            registry.register(Block.NETHER_BRICK_SLAB.key(), Block.NETHER_BRICK_SLAB);
            registry.register(Block.QUARTZ_SLAB.key(), Block.QUARTZ_SLAB);
            registry.register(Block.RED_SANDSTONE_SLAB.key(), Block.RED_SANDSTONE_SLAB);
            registry.register(Block.CUT_RED_SANDSTONE_SLAB.key(), Block.CUT_RED_SANDSTONE_SLAB);
            registry.register(Block.PURPUR_SLAB.key(), Block.PURPUR_SLAB);
            registry.register(Block.SMOOTH_STONE.key(), Block.SMOOTH_STONE);
            registry.register(Block.SMOOTH_SANDSTONE.key(), Block.SMOOTH_SANDSTONE);
            registry.register(Block.SMOOTH_QUARTZ.key(), Block.SMOOTH_QUARTZ);
            registry.register(Block.SMOOTH_RED_SANDSTONE.key(), Block.SMOOTH_RED_SANDSTONE);
            registry.register(Block.SPRUCE_FENCE_GATE.key(), Block.SPRUCE_FENCE_GATE);
            registry.register(Block.BIRCH_FENCE_GATE.key(), Block.BIRCH_FENCE_GATE);
            registry.register(Block.JUNGLE_FENCE_GATE.key(), Block.JUNGLE_FENCE_GATE);
            registry.register(Block.ACACIA_FENCE_GATE.key(), Block.ACACIA_FENCE_GATE);
            registry.register(Block.CHERRY_FENCE_GATE.key(), Block.CHERRY_FENCE_GATE);
            registry.register(Block.DARK_OAK_FENCE_GATE.key(), Block.DARK_OAK_FENCE_GATE);
            registry.register(Block.PALE_OAK_FENCE_GATE.key(), Block.PALE_OAK_FENCE_GATE);
            registry.register(Block.MANGROVE_FENCE_GATE.key(), Block.MANGROVE_FENCE_GATE);
            registry.register(Block.BAMBOO_FENCE_GATE.key(), Block.BAMBOO_FENCE_GATE);
            registry.register(Block.SPRUCE_FENCE.key(), Block.SPRUCE_FENCE);
            registry.register(Block.BIRCH_FENCE.key(), Block.BIRCH_FENCE);
            registry.register(Block.JUNGLE_FENCE.key(), Block.JUNGLE_FENCE);
            registry.register(Block.ACACIA_FENCE.key(), Block.ACACIA_FENCE);
            registry.register(Block.CHERRY_FENCE.key(), Block.CHERRY_FENCE);
            registry.register(Block.DARK_OAK_FENCE.key(), Block.DARK_OAK_FENCE);
            registry.register(Block.PALE_OAK_FENCE.key(), Block.PALE_OAK_FENCE);
            registry.register(Block.MANGROVE_FENCE.key(), Block.MANGROVE_FENCE);
            registry.register(Block.BAMBOO_FENCE.key(), Block.BAMBOO_FENCE);
            registry.register(Block.SPRUCE_DOOR.key(), Block.SPRUCE_DOOR);
            registry.register(Block.BIRCH_DOOR.key(), Block.BIRCH_DOOR);
            registry.register(Block.JUNGLE_DOOR.key(), Block.JUNGLE_DOOR);
            registry.register(Block.ACACIA_DOOR.key(), Block.ACACIA_DOOR);
            registry.register(Block.CHERRY_DOOR.key(), Block.CHERRY_DOOR);
            registry.register(Block.DARK_OAK_DOOR.key(), Block.DARK_OAK_DOOR);
            registry.register(Block.PALE_OAK_DOOR.key(), Block.PALE_OAK_DOOR);
            registry.register(Block.MANGROVE_DOOR.key(), Block.MANGROVE_DOOR);
            registry.register(Block.BAMBOO_DOOR.key(), Block.BAMBOO_DOOR);
            registry.register(Block.END_ROD.key(), Block.END_ROD);
            registry.register(Block.CHORUS_PLANT.key(), Block.CHORUS_PLANT);
            registry.register(Block.CHORUS_FLOWER.key(), Block.CHORUS_FLOWER);
            registry.register(Block.PURPUR_BLOCK.key(), Block.PURPUR_BLOCK);
            registry.register(Block.PURPUR_PILLAR.key(), Block.PURPUR_PILLAR);
            registry.register(Block.PURPUR_STAIRS.key(), Block.PURPUR_STAIRS);
            registry.register(Block.END_STONE_BRICKS.key(), Block.END_STONE_BRICKS);
            registry.register(Block.TORCHFLOWER_CROP.key(), Block.TORCHFLOWER_CROP);
            registry.register(Block.PITCHER_CROP.key(), Block.PITCHER_CROP);
            registry.register(Block.PITCHER_PLANT.key(), Block.PITCHER_PLANT);
            registry.register(Block.BEETROOTS.key(), Block.BEETROOTS);
            registry.register(Block.DIRT_PATH.key(), Block.DIRT_PATH);
            registry.register(Block.END_GATEWAY.key(), Block.END_GATEWAY);
            registry.register(Block.REPEATING_COMMAND_BLOCK.key(), Block.REPEATING_COMMAND_BLOCK);
            registry.register(Block.CHAIN_COMMAND_BLOCK.key(), Block.CHAIN_COMMAND_BLOCK);
            registry.register(Block.FROSTED_ICE.key(), Block.FROSTED_ICE);
            registry.register(Block.MAGMA_BLOCK.key(), Block.MAGMA_BLOCK);
            registry.register(Block.NETHER_WART_BLOCK.key(), Block.NETHER_WART_BLOCK);
            registry.register(Block.RED_NETHER_BRICKS.key(), Block.RED_NETHER_BRICKS);
            registry.register(Block.BONE_BLOCK.key(), Block.BONE_BLOCK);
            registry.register(Block.STRUCTURE_VOID.key(), Block.STRUCTURE_VOID);
            registry.register(Block.OBSERVER.key(), Block.OBSERVER);
            registry.register(Block.SHULKER_BOX.key(), Block.SHULKER_BOX);
            registry.register(Block.WHITE_SHULKER_BOX.key(), Block.WHITE_SHULKER_BOX);
            registry.register(Block.ORANGE_SHULKER_BOX.key(), Block.ORANGE_SHULKER_BOX);
            registry.register(Block.MAGENTA_SHULKER_BOX.key(), Block.MAGENTA_SHULKER_BOX);
            registry.register(Block.LIGHT_BLUE_SHULKER_BOX.key(), Block.LIGHT_BLUE_SHULKER_BOX);
            registry.register(Block.YELLOW_SHULKER_BOX.key(), Block.YELLOW_SHULKER_BOX);
            registry.register(Block.LIME_SHULKER_BOX.key(), Block.LIME_SHULKER_BOX);
            registry.register(Block.PINK_SHULKER_BOX.key(), Block.PINK_SHULKER_BOX);
            registry.register(Block.GRAY_SHULKER_BOX.key(), Block.GRAY_SHULKER_BOX);
            registry.register(Block.LIGHT_GRAY_SHULKER_BOX.key(), Block.LIGHT_GRAY_SHULKER_BOX);
            registry.register(Block.CYAN_SHULKER_BOX.key(), Block.CYAN_SHULKER_BOX);
            registry.register(Block.PURPLE_SHULKER_BOX.key(), Block.PURPLE_SHULKER_BOX);
            registry.register(Block.BLUE_SHULKER_BOX.key(), Block.BLUE_SHULKER_BOX);
            registry.register(Block.BROWN_SHULKER_BOX.key(), Block.BROWN_SHULKER_BOX);
            registry.register(Block.GREEN_SHULKER_BOX.key(), Block.GREEN_SHULKER_BOX);
            registry.register(Block.RED_SHULKER_BOX.key(), Block.RED_SHULKER_BOX);
            registry.register(Block.BLACK_SHULKER_BOX.key(), Block.BLACK_SHULKER_BOX);
            registry.register(Block.WHITE_GLAZED_TERRACOTTA.key(), Block.WHITE_GLAZED_TERRACOTTA);
            registry.register(Block.ORANGE_GLAZED_TERRACOTTA.key(), Block.ORANGE_GLAZED_TERRACOTTA);
            registry.register(Block.MAGENTA_GLAZED_TERRACOTTA.key(), Block.MAGENTA_GLAZED_TERRACOTTA);
            registry.register(Block.LIGHT_BLUE_GLAZED_TERRACOTTA.key(), Block.LIGHT_BLUE_GLAZED_TERRACOTTA);
            registry.register(Block.YELLOW_GLAZED_TERRACOTTA.key(), Block.YELLOW_GLAZED_TERRACOTTA);
            registry.register(Block.LIME_GLAZED_TERRACOTTA.key(), Block.LIME_GLAZED_TERRACOTTA);
            registry.register(Block.PINK_GLAZED_TERRACOTTA.key(), Block.PINK_GLAZED_TERRACOTTA);
            registry.register(Block.GRAY_GLAZED_TERRACOTTA.key(), Block.GRAY_GLAZED_TERRACOTTA);
            registry.register(Block.LIGHT_GRAY_GLAZED_TERRACOTTA.key(), Block.LIGHT_GRAY_GLAZED_TERRACOTTA);
            registry.register(Block.CYAN_GLAZED_TERRACOTTA.key(), Block.CYAN_GLAZED_TERRACOTTA);
            registry.register(Block.PURPLE_GLAZED_TERRACOTTA.key(), Block.PURPLE_GLAZED_TERRACOTTA);
            registry.register(Block.BLUE_GLAZED_TERRACOTTA.key(), Block.BLUE_GLAZED_TERRACOTTA);
            registry.register(Block.BROWN_GLAZED_TERRACOTTA.key(), Block.BROWN_GLAZED_TERRACOTTA);
            registry.register(Block.GREEN_GLAZED_TERRACOTTA.key(), Block.GREEN_GLAZED_TERRACOTTA);
            registry.register(Block.RED_GLAZED_TERRACOTTA.key(), Block.RED_GLAZED_TERRACOTTA);
            registry.register(Block.BLACK_GLAZED_TERRACOTTA.key(), Block.BLACK_GLAZED_TERRACOTTA);
            registry.register(Block.WHITE_CONCRETE.key(), Block.WHITE_CONCRETE);
            registry.register(Block.ORANGE_CONCRETE.key(), Block.ORANGE_CONCRETE);
            registry.register(Block.MAGENTA_CONCRETE.key(), Block.MAGENTA_CONCRETE);
            registry.register(Block.LIGHT_BLUE_CONCRETE.key(), Block.LIGHT_BLUE_CONCRETE);
            registry.register(Block.YELLOW_CONCRETE.key(), Block.YELLOW_CONCRETE);
            registry.register(Block.LIME_CONCRETE.key(), Block.LIME_CONCRETE);
            registry.register(Block.PINK_CONCRETE.key(), Block.PINK_CONCRETE);
            registry.register(Block.GRAY_CONCRETE.key(), Block.GRAY_CONCRETE);
            registry.register(Block.LIGHT_GRAY_CONCRETE.key(), Block.LIGHT_GRAY_CONCRETE);
            registry.register(Block.CYAN_CONCRETE.key(), Block.CYAN_CONCRETE);
            registry.register(Block.PURPLE_CONCRETE.key(), Block.PURPLE_CONCRETE);
            registry.register(Block.BLUE_CONCRETE.key(), Block.BLUE_CONCRETE);
            registry.register(Block.BROWN_CONCRETE.key(), Block.BROWN_CONCRETE);
            registry.register(Block.GREEN_CONCRETE.key(), Block.GREEN_CONCRETE);
            registry.register(Block.RED_CONCRETE.key(), Block.RED_CONCRETE);
            registry.register(Block.BLACK_CONCRETE.key(), Block.BLACK_CONCRETE);
            registry.register(Block.WHITE_CONCRETE_POWDER.key(), Block.WHITE_CONCRETE_POWDER);
            registry.register(Block.ORANGE_CONCRETE_POWDER.key(), Block.ORANGE_CONCRETE_POWDER);
            registry.register(Block.MAGENTA_CONCRETE_POWDER.key(), Block.MAGENTA_CONCRETE_POWDER);
            registry.register(Block.LIGHT_BLUE_CONCRETE_POWDER.key(), Block.LIGHT_BLUE_CONCRETE_POWDER);
            registry.register(Block.YELLOW_CONCRETE_POWDER.key(), Block.YELLOW_CONCRETE_POWDER);
            registry.register(Block.LIME_CONCRETE_POWDER.key(), Block.LIME_CONCRETE_POWDER);
            registry.register(Block.PINK_CONCRETE_POWDER.key(), Block.PINK_CONCRETE_POWDER);
            registry.register(Block.GRAY_CONCRETE_POWDER.key(), Block.GRAY_CONCRETE_POWDER);
            registry.register(Block.LIGHT_GRAY_CONCRETE_POWDER.key(), Block.LIGHT_GRAY_CONCRETE_POWDER);
            registry.register(Block.CYAN_CONCRETE_POWDER.key(), Block.CYAN_CONCRETE_POWDER);
            registry.register(Block.PURPLE_CONCRETE_POWDER.key(), Block.PURPLE_CONCRETE_POWDER);
            registry.register(Block.BLUE_CONCRETE_POWDER.key(), Block.BLUE_CONCRETE_POWDER);
            registry.register(Block.BROWN_CONCRETE_POWDER.key(), Block.BROWN_CONCRETE_POWDER);
            registry.register(Block.GREEN_CONCRETE_POWDER.key(), Block.GREEN_CONCRETE_POWDER);
            registry.register(Block.RED_CONCRETE_POWDER.key(), Block.RED_CONCRETE_POWDER);
            registry.register(Block.BLACK_CONCRETE_POWDER.key(), Block.BLACK_CONCRETE_POWDER);
            registry.register(Block.KELP.key(), Block.KELP);
            registry.register(Block.KELP_PLANT.key(), Block.KELP_PLANT);
            registry.register(Block.DRIED_KELP_BLOCK.key(), Block.DRIED_KELP_BLOCK);
            registry.register(Block.TURTLE_EGG.key(), Block.TURTLE_EGG);
            registry.register(Block.SNIFFER_EGG.key(), Block.SNIFFER_EGG);
            registry.register(Block.DRIED_GHAST.key(), Block.DRIED_GHAST);
            registry.register(Block.DEAD_TUBE_CORAL_BLOCK.key(), Block.DEAD_TUBE_CORAL_BLOCK);
            registry.register(Block.DEAD_BRAIN_CORAL_BLOCK.key(), Block.DEAD_BRAIN_CORAL_BLOCK);
            registry.register(Block.DEAD_BUBBLE_CORAL_BLOCK.key(), Block.DEAD_BUBBLE_CORAL_BLOCK);
            registry.register(Block.DEAD_FIRE_CORAL_BLOCK.key(), Block.DEAD_FIRE_CORAL_BLOCK);
            registry.register(Block.DEAD_HORN_CORAL_BLOCK.key(), Block.DEAD_HORN_CORAL_BLOCK);
            registry.register(Block.TUBE_CORAL_BLOCK.key(), Block.TUBE_CORAL_BLOCK);
            registry.register(Block.BRAIN_CORAL_BLOCK.key(), Block.BRAIN_CORAL_BLOCK);
            registry.register(Block.BUBBLE_CORAL_BLOCK.key(), Block.BUBBLE_CORAL_BLOCK);
            registry.register(Block.FIRE_CORAL_BLOCK.key(), Block.FIRE_CORAL_BLOCK);
            registry.register(Block.HORN_CORAL_BLOCK.key(), Block.HORN_CORAL_BLOCK);
            registry.register(Block.DEAD_TUBE_CORAL.key(), Block.DEAD_TUBE_CORAL);
            registry.register(Block.DEAD_BRAIN_CORAL.key(), Block.DEAD_BRAIN_CORAL);
            registry.register(Block.DEAD_BUBBLE_CORAL.key(), Block.DEAD_BUBBLE_CORAL);
            registry.register(Block.DEAD_FIRE_CORAL.key(), Block.DEAD_FIRE_CORAL);
            registry.register(Block.DEAD_HORN_CORAL.key(), Block.DEAD_HORN_CORAL);
            registry.register(Block.TUBE_CORAL.key(), Block.TUBE_CORAL);
            registry.register(Block.BRAIN_CORAL.key(), Block.BRAIN_CORAL);
            registry.register(Block.BUBBLE_CORAL.key(), Block.BUBBLE_CORAL);
            registry.register(Block.FIRE_CORAL.key(), Block.FIRE_CORAL);
            registry.register(Block.HORN_CORAL.key(), Block.HORN_CORAL);
            registry.register(Block.DEAD_TUBE_CORAL_FAN.key(), Block.DEAD_TUBE_CORAL_FAN);
            registry.register(Block.DEAD_BRAIN_CORAL_FAN.key(), Block.DEAD_BRAIN_CORAL_FAN);
            registry.register(Block.DEAD_BUBBLE_CORAL_FAN.key(), Block.DEAD_BUBBLE_CORAL_FAN);
            registry.register(Block.DEAD_FIRE_CORAL_FAN.key(), Block.DEAD_FIRE_CORAL_FAN);
            registry.register(Block.DEAD_HORN_CORAL_FAN.key(), Block.DEAD_HORN_CORAL_FAN);
            registry.register(Block.TUBE_CORAL_FAN.key(), Block.TUBE_CORAL_FAN);
            registry.register(Block.BRAIN_CORAL_FAN.key(), Block.BRAIN_CORAL_FAN);
            registry.register(Block.BUBBLE_CORAL_FAN.key(), Block.BUBBLE_CORAL_FAN);
            registry.register(Block.FIRE_CORAL_FAN.key(), Block.FIRE_CORAL_FAN);
            registry.register(Block.HORN_CORAL_FAN.key(), Block.HORN_CORAL_FAN);
            registry.register(Block.DEAD_TUBE_CORAL_WALL_FAN.key(), Block.DEAD_TUBE_CORAL_WALL_FAN);
            registry.register(Block.DEAD_BRAIN_CORAL_WALL_FAN.key(), Block.DEAD_BRAIN_CORAL_WALL_FAN);
            registry.register(Block.DEAD_BUBBLE_CORAL_WALL_FAN.key(), Block.DEAD_BUBBLE_CORAL_WALL_FAN);
            registry.register(Block.DEAD_FIRE_CORAL_WALL_FAN.key(), Block.DEAD_FIRE_CORAL_WALL_FAN);
            registry.register(Block.DEAD_HORN_CORAL_WALL_FAN.key(), Block.DEAD_HORN_CORAL_WALL_FAN);
            registry.register(Block.TUBE_CORAL_WALL_FAN.key(), Block.TUBE_CORAL_WALL_FAN);
            registry.register(Block.BRAIN_CORAL_WALL_FAN.key(), Block.BRAIN_CORAL_WALL_FAN);
            registry.register(Block.BUBBLE_CORAL_WALL_FAN.key(), Block.BUBBLE_CORAL_WALL_FAN);
            registry.register(Block.FIRE_CORAL_WALL_FAN.key(), Block.FIRE_CORAL_WALL_FAN);
            registry.register(Block.HORN_CORAL_WALL_FAN.key(), Block.HORN_CORAL_WALL_FAN);
            registry.register(Block.SEA_PICKLE.key(), Block.SEA_PICKLE);
            registry.register(Block.BLUE_ICE.key(), Block.BLUE_ICE);
            registry.register(Block.CONDUIT.key(), Block.CONDUIT);
            registry.register(Block.BAMBOO_SAPLING.key(), Block.BAMBOO_SAPLING);
            registry.register(Block.BAMBOO.key(), Block.BAMBOO);
            registry.register(Block.POTTED_BAMBOO.key(), Block.POTTED_BAMBOO);
            registry.register(Block.VOID_AIR.key(), Block.VOID_AIR);
            registry.register(Block.CAVE_AIR.key(), Block.CAVE_AIR);
            registry.register(Block.BUBBLE_COLUMN.key(), Block.BUBBLE_COLUMN);
            registry.register(Block.POLISHED_GRANITE_STAIRS.key(), Block.POLISHED_GRANITE_STAIRS);
            registry.register(Block.SMOOTH_RED_SANDSTONE_STAIRS.key(), Block.SMOOTH_RED_SANDSTONE_STAIRS);
            registry.register(Block.MOSSY_STONE_BRICK_STAIRS.key(), Block.MOSSY_STONE_BRICK_STAIRS);
            registry.register(Block.POLISHED_DIORITE_STAIRS.key(), Block.POLISHED_DIORITE_STAIRS);
            registry.register(Block.MOSSY_COBBLESTONE_STAIRS.key(), Block.MOSSY_COBBLESTONE_STAIRS);
            registry.register(Block.END_STONE_BRICK_STAIRS.key(), Block.END_STONE_BRICK_STAIRS);
            registry.register(Block.STONE_STAIRS.key(), Block.STONE_STAIRS);
            registry.register(Block.SMOOTH_SANDSTONE_STAIRS.key(), Block.SMOOTH_SANDSTONE_STAIRS);
            registry.register(Block.SMOOTH_QUARTZ_STAIRS.key(), Block.SMOOTH_QUARTZ_STAIRS);
            registry.register(Block.GRANITE_STAIRS.key(), Block.GRANITE_STAIRS);
            registry.register(Block.ANDESITE_STAIRS.key(), Block.ANDESITE_STAIRS);
            registry.register(Block.RED_NETHER_BRICK_STAIRS.key(), Block.RED_NETHER_BRICK_STAIRS);
            registry.register(Block.POLISHED_ANDESITE_STAIRS.key(), Block.POLISHED_ANDESITE_STAIRS);
            registry.register(Block.DIORITE_STAIRS.key(), Block.DIORITE_STAIRS);
            registry.register(Block.POLISHED_GRANITE_SLAB.key(), Block.POLISHED_GRANITE_SLAB);
            registry.register(Block.SMOOTH_RED_SANDSTONE_SLAB.key(), Block.SMOOTH_RED_SANDSTONE_SLAB);
            registry.register(Block.MOSSY_STONE_BRICK_SLAB.key(), Block.MOSSY_STONE_BRICK_SLAB);
            registry.register(Block.POLISHED_DIORITE_SLAB.key(), Block.POLISHED_DIORITE_SLAB);
            registry.register(Block.MOSSY_COBBLESTONE_SLAB.key(), Block.MOSSY_COBBLESTONE_SLAB);
            registry.register(Block.END_STONE_BRICK_SLAB.key(), Block.END_STONE_BRICK_SLAB);
            registry.register(Block.SMOOTH_SANDSTONE_SLAB.key(), Block.SMOOTH_SANDSTONE_SLAB);
            registry.register(Block.SMOOTH_QUARTZ_SLAB.key(), Block.SMOOTH_QUARTZ_SLAB);
            registry.register(Block.GRANITE_SLAB.key(), Block.GRANITE_SLAB);
            registry.register(Block.ANDESITE_SLAB.key(), Block.ANDESITE_SLAB);
            registry.register(Block.RED_NETHER_BRICK_SLAB.key(), Block.RED_NETHER_BRICK_SLAB);
            registry.register(Block.POLISHED_ANDESITE_SLAB.key(), Block.POLISHED_ANDESITE_SLAB);
            registry.register(Block.DIORITE_SLAB.key(), Block.DIORITE_SLAB);
            registry.register(Block.BRICK_WALL.key(), Block.BRICK_WALL);
            registry.register(Block.PRISMARINE_WALL.key(), Block.PRISMARINE_WALL);
            registry.register(Block.RED_SANDSTONE_WALL.key(), Block.RED_SANDSTONE_WALL);
            registry.register(Block.MOSSY_STONE_BRICK_WALL.key(), Block.MOSSY_STONE_BRICK_WALL);
            registry.register(Block.GRANITE_WALL.key(), Block.GRANITE_WALL);
            registry.register(Block.STONE_BRICK_WALL.key(), Block.STONE_BRICK_WALL);
            registry.register(Block.MUD_BRICK_WALL.key(), Block.MUD_BRICK_WALL);
            registry.register(Block.NETHER_BRICK_WALL.key(), Block.NETHER_BRICK_WALL);
            registry.register(Block.ANDESITE_WALL.key(), Block.ANDESITE_WALL);
            registry.register(Block.RED_NETHER_BRICK_WALL.key(), Block.RED_NETHER_BRICK_WALL);
            registry.register(Block.SANDSTONE_WALL.key(), Block.SANDSTONE_WALL);
            registry.register(Block.END_STONE_BRICK_WALL.key(), Block.END_STONE_BRICK_WALL);
            registry.register(Block.DIORITE_WALL.key(), Block.DIORITE_WALL);
            registry.register(Block.SCAFFOLDING.key(), Block.SCAFFOLDING);
            registry.register(Block.LOOM.key(), Block.LOOM);
            registry.register(Block.BARREL.key(), Block.BARREL);
            registry.register(Block.SMOKER.key(), Block.SMOKER);
            registry.register(Block.BLAST_FURNACE.key(), Block.BLAST_FURNACE);
            registry.register(Block.CARTOGRAPHY_TABLE.key(), Block.CARTOGRAPHY_TABLE);
            registry.register(Block.FLETCHING_TABLE.key(), Block.FLETCHING_TABLE);
            registry.register(Block.GRINDSTONE.key(), Block.GRINDSTONE);
            registry.register(Block.LECTERN.key(), Block.LECTERN);
            registry.register(Block.SMITHING_TABLE.key(), Block.SMITHING_TABLE);
            registry.register(Block.STONECUTTER.key(), Block.STONECUTTER);
            registry.register(Block.BELL.key(), Block.BELL);
            registry.register(Block.LANTERN.key(), Block.LANTERN);
            registry.register(Block.SOUL_LANTERN.key(), Block.SOUL_LANTERN);
            registry.register(Block.COPPER_LANTERN.key(), Block.COPPER_LANTERN);
            registry.register(Block.EXPOSED_COPPER_LANTERN.key(), Block.EXPOSED_COPPER_LANTERN);
            registry.register(Block.WEATHERED_COPPER_LANTERN.key(), Block.WEATHERED_COPPER_LANTERN);
            registry.register(Block.OXIDIZED_COPPER_LANTERN.key(), Block.OXIDIZED_COPPER_LANTERN);
            registry.register(Block.WAXED_COPPER_LANTERN.key(), Block.WAXED_COPPER_LANTERN);
            registry.register(Block.WAXED_EXPOSED_COPPER_LANTERN.key(), Block.WAXED_EXPOSED_COPPER_LANTERN);
            registry.register(Block.WAXED_WEATHERED_COPPER_LANTERN.key(), Block.WAXED_WEATHERED_COPPER_LANTERN);
            registry.register(Block.WAXED_OXIDIZED_COPPER_LANTERN.key(), Block.WAXED_OXIDIZED_COPPER_LANTERN);
            registry.register(Block.CAMPFIRE.key(), Block.CAMPFIRE);
            registry.register(Block.SOUL_CAMPFIRE.key(), Block.SOUL_CAMPFIRE);
            registry.register(Block.SWEET_BERRY_BUSH.key(), Block.SWEET_BERRY_BUSH);
            registry.register(Block.WARPED_STEM.key(), Block.WARPED_STEM);
            registry.register(Block.STRIPPED_WARPED_STEM.key(), Block.STRIPPED_WARPED_STEM);
            registry.register(Block.WARPED_HYPHAE.key(), Block.WARPED_HYPHAE);
            registry.register(Block.STRIPPED_WARPED_HYPHAE.key(), Block.STRIPPED_WARPED_HYPHAE);
            registry.register(Block.WARPED_NYLIUM.key(), Block.WARPED_NYLIUM);
            registry.register(Block.WARPED_FUNGUS.key(), Block.WARPED_FUNGUS);
            registry.register(Block.WARPED_WART_BLOCK.key(), Block.WARPED_WART_BLOCK);
            registry.register(Block.WARPED_ROOTS.key(), Block.WARPED_ROOTS);
            registry.register(Block.NETHER_SPROUTS.key(), Block.NETHER_SPROUTS);
            registry.register(Block.CRIMSON_STEM.key(), Block.CRIMSON_STEM);
            registry.register(Block.STRIPPED_CRIMSON_STEM.key(), Block.STRIPPED_CRIMSON_STEM);
            registry.register(Block.CRIMSON_HYPHAE.key(), Block.CRIMSON_HYPHAE);
            registry.register(Block.STRIPPED_CRIMSON_HYPHAE.key(), Block.STRIPPED_CRIMSON_HYPHAE);
            registry.register(Block.CRIMSON_NYLIUM.key(), Block.CRIMSON_NYLIUM);
            registry.register(Block.CRIMSON_FUNGUS.key(), Block.CRIMSON_FUNGUS);
            registry.register(Block.SHROOMLIGHT.key(), Block.SHROOMLIGHT);
            registry.register(Block.WEEPING_VINES.key(), Block.WEEPING_VINES);
            registry.register(Block.WEEPING_VINES_PLANT.key(), Block.WEEPING_VINES_PLANT);
            registry.register(Block.TWISTING_VINES.key(), Block.TWISTING_VINES);
            registry.register(Block.TWISTING_VINES_PLANT.key(), Block.TWISTING_VINES_PLANT);
            registry.register(Block.CRIMSON_ROOTS.key(), Block.CRIMSON_ROOTS);
            registry.register(Block.CRIMSON_PLANKS.key(), Block.CRIMSON_PLANKS);
            registry.register(Block.WARPED_PLANKS.key(), Block.WARPED_PLANKS);
            registry.register(Block.CRIMSON_SLAB.key(), Block.CRIMSON_SLAB);
            registry.register(Block.WARPED_SLAB.key(), Block.WARPED_SLAB);
            registry.register(Block.CRIMSON_PRESSURE_PLATE.key(), Block.CRIMSON_PRESSURE_PLATE);
            registry.register(Block.WARPED_PRESSURE_PLATE.key(), Block.WARPED_PRESSURE_PLATE);
            registry.register(Block.CRIMSON_FENCE.key(), Block.CRIMSON_FENCE);
            registry.register(Block.WARPED_FENCE.key(), Block.WARPED_FENCE);
            registry.register(Block.CRIMSON_TRAPDOOR.key(), Block.CRIMSON_TRAPDOOR);
            registry.register(Block.WARPED_TRAPDOOR.key(), Block.WARPED_TRAPDOOR);
            registry.register(Block.CRIMSON_FENCE_GATE.key(), Block.CRIMSON_FENCE_GATE);
            registry.register(Block.WARPED_FENCE_GATE.key(), Block.WARPED_FENCE_GATE);
            registry.register(Block.CRIMSON_STAIRS.key(), Block.CRIMSON_STAIRS);
            registry.register(Block.WARPED_STAIRS.key(), Block.WARPED_STAIRS);
            registry.register(Block.CRIMSON_BUTTON.key(), Block.CRIMSON_BUTTON);
            registry.register(Block.WARPED_BUTTON.key(), Block.WARPED_BUTTON);
            registry.register(Block.CRIMSON_DOOR.key(), Block.CRIMSON_DOOR);
            registry.register(Block.WARPED_DOOR.key(), Block.WARPED_DOOR);
            registry.register(Block.CRIMSON_SIGN.key(), Block.CRIMSON_SIGN);
            registry.register(Block.WARPED_SIGN.key(), Block.WARPED_SIGN);
            registry.register(Block.CRIMSON_WALL_SIGN.key(), Block.CRIMSON_WALL_SIGN);
            registry.register(Block.WARPED_WALL_SIGN.key(), Block.WARPED_WALL_SIGN);
            registry.register(Block.STRUCTURE_BLOCK.key(), Block.STRUCTURE_BLOCK);
            registry.register(Block.JIGSAW.key(), Block.JIGSAW);
            registry.register(Block.TEST_BLOCK.key(), Block.TEST_BLOCK);
            registry.register(Block.TEST_INSTANCE_BLOCK.key(), Block.TEST_INSTANCE_BLOCK);
            registry.register(Block.COMPOSTER.key(), Block.COMPOSTER);
            registry.register(Block.TARGET.key(), Block.TARGET);
            registry.register(Block.BEE_NEST.key(), Block.BEE_NEST);
            registry.register(Block.BEEHIVE.key(), Block.BEEHIVE);
            registry.register(Block.HONEY_BLOCK.key(), Block.HONEY_BLOCK);
            registry.register(Block.HONEYCOMB_BLOCK.key(), Block.HONEYCOMB_BLOCK);
            registry.register(Block.NETHERITE_BLOCK.key(), Block.NETHERITE_BLOCK);
            registry.register(Block.ANCIENT_DEBRIS.key(), Block.ANCIENT_DEBRIS);
            registry.register(Block.CRYING_OBSIDIAN.key(), Block.CRYING_OBSIDIAN);
            registry.register(Block.RESPAWN_ANCHOR.key(), Block.RESPAWN_ANCHOR);
            registry.register(Block.POTTED_CRIMSON_FUNGUS.key(), Block.POTTED_CRIMSON_FUNGUS);
            registry.register(Block.POTTED_WARPED_FUNGUS.key(), Block.POTTED_WARPED_FUNGUS);
            registry.register(Block.POTTED_CRIMSON_ROOTS.key(), Block.POTTED_CRIMSON_ROOTS);
            registry.register(Block.POTTED_WARPED_ROOTS.key(), Block.POTTED_WARPED_ROOTS);
            registry.register(Block.LODESTONE.key(), Block.LODESTONE);
            registry.register(Block.BLACKSTONE.key(), Block.BLACKSTONE);
            registry.register(Block.BLACKSTONE_STAIRS.key(), Block.BLACKSTONE_STAIRS);
            registry.register(Block.BLACKSTONE_WALL.key(), Block.BLACKSTONE_WALL);
            registry.register(Block.BLACKSTONE_SLAB.key(), Block.BLACKSTONE_SLAB);
            registry.register(Block.POLISHED_BLACKSTONE.key(), Block.POLISHED_BLACKSTONE);
            registry.register(Block.POLISHED_BLACKSTONE_BRICKS.key(), Block.POLISHED_BLACKSTONE_BRICKS);
            registry.register(Block.CRACKED_POLISHED_BLACKSTONE_BRICKS.key(), Block.CRACKED_POLISHED_BLACKSTONE_BRICKS);
            registry.register(Block.CHISELED_POLISHED_BLACKSTONE.key(), Block.CHISELED_POLISHED_BLACKSTONE);
            registry.register(Block.POLISHED_BLACKSTONE_BRICK_SLAB.key(), Block.POLISHED_BLACKSTONE_BRICK_SLAB);
            registry.register(Block.POLISHED_BLACKSTONE_BRICK_STAIRS.key(), Block.POLISHED_BLACKSTONE_BRICK_STAIRS);
            registry.register(Block.POLISHED_BLACKSTONE_BRICK_WALL.key(), Block.POLISHED_BLACKSTONE_BRICK_WALL);
            registry.register(Block.GILDED_BLACKSTONE.key(), Block.GILDED_BLACKSTONE);
            registry.register(Block.POLISHED_BLACKSTONE_STAIRS.key(), Block.POLISHED_BLACKSTONE_STAIRS);
            registry.register(Block.POLISHED_BLACKSTONE_SLAB.key(), Block.POLISHED_BLACKSTONE_SLAB);
            registry.register(Block.POLISHED_BLACKSTONE_PRESSURE_PLATE.key(), Block.POLISHED_BLACKSTONE_PRESSURE_PLATE);
            registry.register(Block.POLISHED_BLACKSTONE_BUTTON.key(), Block.POLISHED_BLACKSTONE_BUTTON);
            registry.register(Block.POLISHED_BLACKSTONE_WALL.key(), Block.POLISHED_BLACKSTONE_WALL);
            registry.register(Block.CHISELED_NETHER_BRICKS.key(), Block.CHISELED_NETHER_BRICKS);
            registry.register(Block.CRACKED_NETHER_BRICKS.key(), Block.CRACKED_NETHER_BRICKS);
            registry.register(Block.QUARTZ_BRICKS.key(), Block.QUARTZ_BRICKS);
            registry.register(Block.CANDLE.key(), Block.CANDLE);
            registry.register(Block.WHITE_CANDLE.key(), Block.WHITE_CANDLE);
            registry.register(Block.ORANGE_CANDLE.key(), Block.ORANGE_CANDLE);
            registry.register(Block.MAGENTA_CANDLE.key(), Block.MAGENTA_CANDLE);
            registry.register(Block.LIGHT_BLUE_CANDLE.key(), Block.LIGHT_BLUE_CANDLE);
            registry.register(Block.YELLOW_CANDLE.key(), Block.YELLOW_CANDLE);
            registry.register(Block.LIME_CANDLE.key(), Block.LIME_CANDLE);
            registry.register(Block.PINK_CANDLE.key(), Block.PINK_CANDLE);
            registry.register(Block.GRAY_CANDLE.key(), Block.GRAY_CANDLE);
            registry.register(Block.LIGHT_GRAY_CANDLE.key(), Block.LIGHT_GRAY_CANDLE);
            registry.register(Block.CYAN_CANDLE.key(), Block.CYAN_CANDLE);
            registry.register(Block.PURPLE_CANDLE.key(), Block.PURPLE_CANDLE);
            registry.register(Block.BLUE_CANDLE.key(), Block.BLUE_CANDLE);
            registry.register(Block.BROWN_CANDLE.key(), Block.BROWN_CANDLE);
            registry.register(Block.GREEN_CANDLE.key(), Block.GREEN_CANDLE);
            registry.register(Block.RED_CANDLE.key(), Block.RED_CANDLE);
            registry.register(Block.BLACK_CANDLE.key(), Block.BLACK_CANDLE);
            registry.register(Block.CANDLE_CAKE.key(), Block.CANDLE_CAKE);
            registry.register(Block.WHITE_CANDLE_CAKE.key(), Block.WHITE_CANDLE_CAKE);
            registry.register(Block.ORANGE_CANDLE_CAKE.key(), Block.ORANGE_CANDLE_CAKE);
            registry.register(Block.MAGENTA_CANDLE_CAKE.key(), Block.MAGENTA_CANDLE_CAKE);
            registry.register(Block.LIGHT_BLUE_CANDLE_CAKE.key(), Block.LIGHT_BLUE_CANDLE_CAKE);
            registry.register(Block.YELLOW_CANDLE_CAKE.key(), Block.YELLOW_CANDLE_CAKE);
            registry.register(Block.LIME_CANDLE_CAKE.key(), Block.LIME_CANDLE_CAKE);
            registry.register(Block.PINK_CANDLE_CAKE.key(), Block.PINK_CANDLE_CAKE);
            registry.register(Block.GRAY_CANDLE_CAKE.key(), Block.GRAY_CANDLE_CAKE);
            registry.register(Block.LIGHT_GRAY_CANDLE_CAKE.key(), Block.LIGHT_GRAY_CANDLE_CAKE);
            registry.register(Block.CYAN_CANDLE_CAKE.key(), Block.CYAN_CANDLE_CAKE);
            registry.register(Block.PURPLE_CANDLE_CAKE.key(), Block.PURPLE_CANDLE_CAKE);
            registry.register(Block.BLUE_CANDLE_CAKE.key(), Block.BLUE_CANDLE_CAKE);
            registry.register(Block.BROWN_CANDLE_CAKE.key(), Block.BROWN_CANDLE_CAKE);
            registry.register(Block.GREEN_CANDLE_CAKE.key(), Block.GREEN_CANDLE_CAKE);
            registry.register(Block.RED_CANDLE_CAKE.key(), Block.RED_CANDLE_CAKE);
            registry.register(Block.BLACK_CANDLE_CAKE.key(), Block.BLACK_CANDLE_CAKE);
            registry.register(Block.AMETHYST_BLOCK.key(), Block.AMETHYST_BLOCK);
            registry.register(Block.BUDDING_AMETHYST.key(), Block.BUDDING_AMETHYST);
            registry.register(Block.AMETHYST_CLUSTER.key(), Block.AMETHYST_CLUSTER);
            registry.register(Block.LARGE_AMETHYST_BUD.key(), Block.LARGE_AMETHYST_BUD);
            registry.register(Block.MEDIUM_AMETHYST_BUD.key(), Block.MEDIUM_AMETHYST_BUD);
            registry.register(Block.SMALL_AMETHYST_BUD.key(), Block.SMALL_AMETHYST_BUD);
            registry.register(Block.TUFF.key(), Block.TUFF);
            registry.register(Block.TUFF_SLAB.key(), Block.TUFF_SLAB);
            registry.register(Block.TUFF_STAIRS.key(), Block.TUFF_STAIRS);
            registry.register(Block.TUFF_WALL.key(), Block.TUFF_WALL);
            registry.register(Block.POLISHED_TUFF.key(), Block.POLISHED_TUFF);
            registry.register(Block.POLISHED_TUFF_SLAB.key(), Block.POLISHED_TUFF_SLAB);
            registry.register(Block.POLISHED_TUFF_STAIRS.key(), Block.POLISHED_TUFF_STAIRS);
            registry.register(Block.POLISHED_TUFF_WALL.key(), Block.POLISHED_TUFF_WALL);
            registry.register(Block.CHISELED_TUFF.key(), Block.CHISELED_TUFF);
            registry.register(Block.TUFF_BRICKS.key(), Block.TUFF_BRICKS);
            registry.register(Block.TUFF_BRICK_SLAB.key(), Block.TUFF_BRICK_SLAB);
            registry.register(Block.TUFF_BRICK_STAIRS.key(), Block.TUFF_BRICK_STAIRS);
            registry.register(Block.TUFF_BRICK_WALL.key(), Block.TUFF_BRICK_WALL);
            registry.register(Block.CHISELED_TUFF_BRICKS.key(), Block.CHISELED_TUFF_BRICKS);
            registry.register(Block.CALCITE.key(), Block.CALCITE);
            registry.register(Block.TINTED_GLASS.key(), Block.TINTED_GLASS);
            registry.register(Block.POWDER_SNOW.key(), Block.POWDER_SNOW);
            registry.register(Block.SCULK_SENSOR.key(), Block.SCULK_SENSOR);
            registry.register(Block.CALIBRATED_SCULK_SENSOR.key(), Block.CALIBRATED_SCULK_SENSOR);
            registry.register(Block.SCULK.key(), Block.SCULK);
            registry.register(Block.SCULK_VEIN.key(), Block.SCULK_VEIN);
            registry.register(Block.SCULK_CATALYST.key(), Block.SCULK_CATALYST);
            registry.register(Block.SCULK_SHRIEKER.key(), Block.SCULK_SHRIEKER);
            registry.register(Block.COPPER_BLOCK.key(), Block.COPPER_BLOCK);
            registry.register(Block.EXPOSED_COPPER.key(), Block.EXPOSED_COPPER);
            registry.register(Block.WEATHERED_COPPER.key(), Block.WEATHERED_COPPER);
            registry.register(Block.OXIDIZED_COPPER.key(), Block.OXIDIZED_COPPER);
            registry.register(Block.COPPER_ORE.key(), Block.COPPER_ORE);
            registry.register(Block.DEEPSLATE_COPPER_ORE.key(), Block.DEEPSLATE_COPPER_ORE);
            registry.register(Block.OXIDIZED_CUT_COPPER.key(), Block.OXIDIZED_CUT_COPPER);
            registry.register(Block.WEATHERED_CUT_COPPER.key(), Block.WEATHERED_CUT_COPPER);
            registry.register(Block.EXPOSED_CUT_COPPER.key(), Block.EXPOSED_CUT_COPPER);
            registry.register(Block.CUT_COPPER.key(), Block.CUT_COPPER);
            registry.register(Block.OXIDIZED_CHISELED_COPPER.key(), Block.OXIDIZED_CHISELED_COPPER);
            registry.register(Block.WEATHERED_CHISELED_COPPER.key(), Block.WEATHERED_CHISELED_COPPER);
            registry.register(Block.EXPOSED_CHISELED_COPPER.key(), Block.EXPOSED_CHISELED_COPPER);
            registry.register(Block.CHISELED_COPPER.key(), Block.CHISELED_COPPER);
            registry.register(Block.WAXED_OXIDIZED_CHISELED_COPPER.key(), Block.WAXED_OXIDIZED_CHISELED_COPPER);
            registry.register(Block.WAXED_WEATHERED_CHISELED_COPPER.key(), Block.WAXED_WEATHERED_CHISELED_COPPER);
            registry.register(Block.WAXED_EXPOSED_CHISELED_COPPER.key(), Block.WAXED_EXPOSED_CHISELED_COPPER);
            registry.register(Block.WAXED_CHISELED_COPPER.key(), Block.WAXED_CHISELED_COPPER);
            registry.register(Block.OXIDIZED_CUT_COPPER_STAIRS.key(), Block.OXIDIZED_CUT_COPPER_STAIRS);
            registry.register(Block.WEATHERED_CUT_COPPER_STAIRS.key(), Block.WEATHERED_CUT_COPPER_STAIRS);
            registry.register(Block.EXPOSED_CUT_COPPER_STAIRS.key(), Block.EXPOSED_CUT_COPPER_STAIRS);
            registry.register(Block.CUT_COPPER_STAIRS.key(), Block.CUT_COPPER_STAIRS);
            registry.register(Block.OXIDIZED_CUT_COPPER_SLAB.key(), Block.OXIDIZED_CUT_COPPER_SLAB);
            registry.register(Block.WEATHERED_CUT_COPPER_SLAB.key(), Block.WEATHERED_CUT_COPPER_SLAB);
            registry.register(Block.EXPOSED_CUT_COPPER_SLAB.key(), Block.EXPOSED_CUT_COPPER_SLAB);
            registry.register(Block.CUT_COPPER_SLAB.key(), Block.CUT_COPPER_SLAB);
            registry.register(Block.WAXED_COPPER_BLOCK.key(), Block.WAXED_COPPER_BLOCK);
            registry.register(Block.WAXED_WEATHERED_COPPER.key(), Block.WAXED_WEATHERED_COPPER);
            registry.register(Block.WAXED_EXPOSED_COPPER.key(), Block.WAXED_EXPOSED_COPPER);
            registry.register(Block.WAXED_OXIDIZED_COPPER.key(), Block.WAXED_OXIDIZED_COPPER);
            registry.register(Block.WAXED_OXIDIZED_CUT_COPPER.key(), Block.WAXED_OXIDIZED_CUT_COPPER);
            registry.register(Block.WAXED_WEATHERED_CUT_COPPER.key(), Block.WAXED_WEATHERED_CUT_COPPER);
            registry.register(Block.WAXED_EXPOSED_CUT_COPPER.key(), Block.WAXED_EXPOSED_CUT_COPPER);
            registry.register(Block.WAXED_CUT_COPPER.key(), Block.WAXED_CUT_COPPER);
            registry.register(Block.WAXED_OXIDIZED_CUT_COPPER_STAIRS.key(), Block.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
            registry.register(Block.WAXED_WEATHERED_CUT_COPPER_STAIRS.key(), Block.WAXED_WEATHERED_CUT_COPPER_STAIRS);
            registry.register(Block.WAXED_EXPOSED_CUT_COPPER_STAIRS.key(), Block.WAXED_EXPOSED_CUT_COPPER_STAIRS);
            registry.register(Block.WAXED_CUT_COPPER_STAIRS.key(), Block.WAXED_CUT_COPPER_STAIRS);
            registry.register(Block.WAXED_OXIDIZED_CUT_COPPER_SLAB.key(), Block.WAXED_OXIDIZED_CUT_COPPER_SLAB);
            registry.register(Block.WAXED_WEATHERED_CUT_COPPER_SLAB.key(), Block.WAXED_WEATHERED_CUT_COPPER_SLAB);
            registry.register(Block.WAXED_EXPOSED_CUT_COPPER_SLAB.key(), Block.WAXED_EXPOSED_CUT_COPPER_SLAB);
            registry.register(Block.WAXED_CUT_COPPER_SLAB.key(), Block.WAXED_CUT_COPPER_SLAB);
            registry.register(Block.COPPER_DOOR.key(), Block.COPPER_DOOR);
            registry.register(Block.EXPOSED_COPPER_DOOR.key(), Block.EXPOSED_COPPER_DOOR);
            registry.register(Block.OXIDIZED_COPPER_DOOR.key(), Block.OXIDIZED_COPPER_DOOR);
            registry.register(Block.WEATHERED_COPPER_DOOR.key(), Block.WEATHERED_COPPER_DOOR);
            registry.register(Block.WAXED_COPPER_DOOR.key(), Block.WAXED_COPPER_DOOR);
            registry.register(Block.WAXED_EXPOSED_COPPER_DOOR.key(), Block.WAXED_EXPOSED_COPPER_DOOR);
            registry.register(Block.WAXED_OXIDIZED_COPPER_DOOR.key(), Block.WAXED_OXIDIZED_COPPER_DOOR);
            registry.register(Block.WAXED_WEATHERED_COPPER_DOOR.key(), Block.WAXED_WEATHERED_COPPER_DOOR);
            registry.register(Block.COPPER_TRAPDOOR.key(), Block.COPPER_TRAPDOOR);
            registry.register(Block.EXPOSED_COPPER_TRAPDOOR.key(), Block.EXPOSED_COPPER_TRAPDOOR);
            registry.register(Block.OXIDIZED_COPPER_TRAPDOOR.key(), Block.OXIDIZED_COPPER_TRAPDOOR);
            registry.register(Block.WEATHERED_COPPER_TRAPDOOR.key(), Block.WEATHERED_COPPER_TRAPDOOR);
            registry.register(Block.WAXED_COPPER_TRAPDOOR.key(), Block.WAXED_COPPER_TRAPDOOR);
            registry.register(Block.WAXED_EXPOSED_COPPER_TRAPDOOR.key(), Block.WAXED_EXPOSED_COPPER_TRAPDOOR);
            registry.register(Block.WAXED_OXIDIZED_COPPER_TRAPDOOR.key(), Block.WAXED_OXIDIZED_COPPER_TRAPDOOR);
            registry.register(Block.WAXED_WEATHERED_COPPER_TRAPDOOR.key(), Block.WAXED_WEATHERED_COPPER_TRAPDOOR);
            registry.register(Block.COPPER_GRATE.key(), Block.COPPER_GRATE);
            registry.register(Block.EXPOSED_COPPER_GRATE.key(), Block.EXPOSED_COPPER_GRATE);
            registry.register(Block.WEATHERED_COPPER_GRATE.key(), Block.WEATHERED_COPPER_GRATE);
            registry.register(Block.OXIDIZED_COPPER_GRATE.key(), Block.OXIDIZED_COPPER_GRATE);
            registry.register(Block.WAXED_COPPER_GRATE.key(), Block.WAXED_COPPER_GRATE);
            registry.register(Block.WAXED_EXPOSED_COPPER_GRATE.key(), Block.WAXED_EXPOSED_COPPER_GRATE);
            registry.register(Block.WAXED_WEATHERED_COPPER_GRATE.key(), Block.WAXED_WEATHERED_COPPER_GRATE);
            registry.register(Block.WAXED_OXIDIZED_COPPER_GRATE.key(), Block.WAXED_OXIDIZED_COPPER_GRATE);
            registry.register(Block.COPPER_BULB.key(), Block.COPPER_BULB);
            registry.register(Block.EXPOSED_COPPER_BULB.key(), Block.EXPOSED_COPPER_BULB);
            registry.register(Block.WEATHERED_COPPER_BULB.key(), Block.WEATHERED_COPPER_BULB);
            registry.register(Block.OXIDIZED_COPPER_BULB.key(), Block.OXIDIZED_COPPER_BULB);
            registry.register(Block.WAXED_COPPER_BULB.key(), Block.WAXED_COPPER_BULB);
            registry.register(Block.WAXED_EXPOSED_COPPER_BULB.key(), Block.WAXED_EXPOSED_COPPER_BULB);
            registry.register(Block.WAXED_WEATHERED_COPPER_BULB.key(), Block.WAXED_WEATHERED_COPPER_BULB);
            registry.register(Block.WAXED_OXIDIZED_COPPER_BULB.key(), Block.WAXED_OXIDIZED_COPPER_BULB);
            registry.register(Block.COPPER_CHEST.key(), Block.COPPER_CHEST);
            registry.register(Block.EXPOSED_COPPER_CHEST.key(), Block.EXPOSED_COPPER_CHEST);
            registry.register(Block.WEATHERED_COPPER_CHEST.key(), Block.WEATHERED_COPPER_CHEST);
            registry.register(Block.OXIDIZED_COPPER_CHEST.key(), Block.OXIDIZED_COPPER_CHEST);
            registry.register(Block.WAXED_COPPER_CHEST.key(), Block.WAXED_COPPER_CHEST);
            registry.register(Block.WAXED_EXPOSED_COPPER_CHEST.key(), Block.WAXED_EXPOSED_COPPER_CHEST);
            registry.register(Block.WAXED_WEATHERED_COPPER_CHEST.key(), Block.WAXED_WEATHERED_COPPER_CHEST);
            registry.register(Block.WAXED_OXIDIZED_COPPER_CHEST.key(), Block.WAXED_OXIDIZED_COPPER_CHEST);
            registry.register(Block.COPPER_GOLEM_STATUE.key(), Block.COPPER_GOLEM_STATUE);
            registry.register(Block.EXPOSED_COPPER_GOLEM_STATUE.key(), Block.EXPOSED_COPPER_GOLEM_STATUE);
            registry.register(Block.WEATHERED_COPPER_GOLEM_STATUE.key(), Block.WEATHERED_COPPER_GOLEM_STATUE);
            registry.register(Block.OXIDIZED_COPPER_GOLEM_STATUE.key(), Block.OXIDIZED_COPPER_GOLEM_STATUE);
            registry.register(Block.WAXED_COPPER_GOLEM_STATUE.key(), Block.WAXED_COPPER_GOLEM_STATUE);
            registry.register(Block.WAXED_EXPOSED_COPPER_GOLEM_STATUE.key(), Block.WAXED_EXPOSED_COPPER_GOLEM_STATUE);
            registry.register(Block.WAXED_WEATHERED_COPPER_GOLEM_STATUE.key(), Block.WAXED_WEATHERED_COPPER_GOLEM_STATUE);
            registry.register(Block.WAXED_OXIDIZED_COPPER_GOLEM_STATUE.key(), Block.WAXED_OXIDIZED_COPPER_GOLEM_STATUE);
            registry.register(Block.LIGHTNING_ROD.key(), Block.LIGHTNING_ROD);
            registry.register(Block.EXPOSED_LIGHTNING_ROD.key(), Block.EXPOSED_LIGHTNING_ROD);
            registry.register(Block.WEATHERED_LIGHTNING_ROD.key(), Block.WEATHERED_LIGHTNING_ROD);
            registry.register(Block.OXIDIZED_LIGHTNING_ROD.key(), Block.OXIDIZED_LIGHTNING_ROD);
            registry.register(Block.WAXED_LIGHTNING_ROD.key(), Block.WAXED_LIGHTNING_ROD);
            registry.register(Block.WAXED_EXPOSED_LIGHTNING_ROD.key(), Block.WAXED_EXPOSED_LIGHTNING_ROD);
            registry.register(Block.WAXED_WEATHERED_LIGHTNING_ROD.key(), Block.WAXED_WEATHERED_LIGHTNING_ROD);
            registry.register(Block.WAXED_OXIDIZED_LIGHTNING_ROD.key(), Block.WAXED_OXIDIZED_LIGHTNING_ROD);
            registry.register(Block.POINTED_DRIPSTONE.key(), Block.POINTED_DRIPSTONE);
            registry.register(Block.DRIPSTONE_BLOCK.key(), Block.DRIPSTONE_BLOCK);
            registry.register(Block.CAVE_VINES.key(), Block.CAVE_VINES);
            registry.register(Block.CAVE_VINES_PLANT.key(), Block.CAVE_VINES_PLANT);
            registry.register(Block.SPORE_BLOSSOM.key(), Block.SPORE_BLOSSOM);
            registry.register(Block.AZALEA.key(), Block.AZALEA);
            registry.register(Block.FLOWERING_AZALEA.key(), Block.FLOWERING_AZALEA);
            registry.register(Block.MOSS_CARPET.key(), Block.MOSS_CARPET);
            registry.register(Block.PINK_PETALS.key(), Block.PINK_PETALS);
            registry.register(Block.WILDFLOWERS.key(), Block.WILDFLOWERS);
            registry.register(Block.LEAF_LITTER.key(), Block.LEAF_LITTER);
            registry.register(Block.MOSS_BLOCK.key(), Block.MOSS_BLOCK);
            registry.register(Block.BIG_DRIPLEAF.key(), Block.BIG_DRIPLEAF);
            registry.register(Block.BIG_DRIPLEAF_STEM.key(), Block.BIG_DRIPLEAF_STEM);
            registry.register(Block.SMALL_DRIPLEAF.key(), Block.SMALL_DRIPLEAF);
            registry.register(Block.HANGING_ROOTS.key(), Block.HANGING_ROOTS);
            registry.register(Block.ROOTED_DIRT.key(), Block.ROOTED_DIRT);
            registry.register(Block.MUD.key(), Block.MUD);
            registry.register(Block.DEEPSLATE.key(), Block.DEEPSLATE);
            registry.register(Block.COBBLED_DEEPSLATE.key(), Block.COBBLED_DEEPSLATE);
            registry.register(Block.COBBLED_DEEPSLATE_STAIRS.key(), Block.COBBLED_DEEPSLATE_STAIRS);
            registry.register(Block.COBBLED_DEEPSLATE_SLAB.key(), Block.COBBLED_DEEPSLATE_SLAB);
            registry.register(Block.COBBLED_DEEPSLATE_WALL.key(), Block.COBBLED_DEEPSLATE_WALL);
            registry.register(Block.POLISHED_DEEPSLATE.key(), Block.POLISHED_DEEPSLATE);
            registry.register(Block.POLISHED_DEEPSLATE_STAIRS.key(), Block.POLISHED_DEEPSLATE_STAIRS);
            registry.register(Block.POLISHED_DEEPSLATE_SLAB.key(), Block.POLISHED_DEEPSLATE_SLAB);
            registry.register(Block.POLISHED_DEEPSLATE_WALL.key(), Block.POLISHED_DEEPSLATE_WALL);
            registry.register(Block.DEEPSLATE_TILES.key(), Block.DEEPSLATE_TILES);
            registry.register(Block.DEEPSLATE_TILE_STAIRS.key(), Block.DEEPSLATE_TILE_STAIRS);
            registry.register(Block.DEEPSLATE_TILE_SLAB.key(), Block.DEEPSLATE_TILE_SLAB);
            registry.register(Block.DEEPSLATE_TILE_WALL.key(), Block.DEEPSLATE_TILE_WALL);
            registry.register(Block.DEEPSLATE_BRICKS.key(), Block.DEEPSLATE_BRICKS);
            registry.register(Block.DEEPSLATE_BRICK_STAIRS.key(), Block.DEEPSLATE_BRICK_STAIRS);
            registry.register(Block.DEEPSLATE_BRICK_SLAB.key(), Block.DEEPSLATE_BRICK_SLAB);
            registry.register(Block.DEEPSLATE_BRICK_WALL.key(), Block.DEEPSLATE_BRICK_WALL);
            registry.register(Block.CHISELED_DEEPSLATE.key(), Block.CHISELED_DEEPSLATE);
            registry.register(Block.CRACKED_DEEPSLATE_BRICKS.key(), Block.CRACKED_DEEPSLATE_BRICKS);
            registry.register(Block.CRACKED_DEEPSLATE_TILES.key(), Block.CRACKED_DEEPSLATE_TILES);
            registry.register(Block.INFESTED_DEEPSLATE.key(), Block.INFESTED_DEEPSLATE);
            registry.register(Block.SMOOTH_BASALT.key(), Block.SMOOTH_BASALT);
            registry.register(Block.RAW_IRON_BLOCK.key(), Block.RAW_IRON_BLOCK);
            registry.register(Block.RAW_COPPER_BLOCK.key(), Block.RAW_COPPER_BLOCK);
            registry.register(Block.RAW_GOLD_BLOCK.key(), Block.RAW_GOLD_BLOCK);
            registry.register(Block.POTTED_AZALEA_BUSH.key(), Block.POTTED_AZALEA_BUSH);
            registry.register(Block.POTTED_FLOWERING_AZALEA_BUSH.key(), Block.POTTED_FLOWERING_AZALEA_BUSH);
            registry.register(Block.OCHRE_FROGLIGHT.key(), Block.OCHRE_FROGLIGHT);
            registry.register(Block.VERDANT_FROGLIGHT.key(), Block.VERDANT_FROGLIGHT);
            registry.register(Block.PEARLESCENT_FROGLIGHT.key(), Block.PEARLESCENT_FROGLIGHT);
            registry.register(Block.FROGSPAWN.key(), Block.FROGSPAWN);
            registry.register(Block.REINFORCED_DEEPSLATE.key(), Block.REINFORCED_DEEPSLATE);
            registry.register(Block.DECORATED_POT.key(), Block.DECORATED_POT);
            registry.register(Block.CRAFTER.key(), Block.CRAFTER);
            registry.register(Block.TRIAL_SPAWNER.key(), Block.TRIAL_SPAWNER);
            registry.register(Block.VAULT.key(), Block.VAULT);
            registry.register(Block.HEAVY_CORE.key(), Block.HEAVY_CORE);
            registry.register(Block.PALE_MOSS_BLOCK.key(), Block.PALE_MOSS_BLOCK);
            registry.register(Block.PALE_MOSS_CARPET.key(), Block.PALE_MOSS_CARPET);
            registry.register(Block.PALE_HANGING_MOSS.key(), Block.PALE_HANGING_MOSS);
            registry.register(Block.OPEN_EYEBLOSSOM.key(), Block.OPEN_EYEBLOSSOM);
            registry.register(Block.CLOSED_EYEBLOSSOM.key(), Block.CLOSED_EYEBLOSSOM);
            registry.register(Block.POTTED_OPEN_EYEBLOSSOM.key(), Block.POTTED_OPEN_EYEBLOSSOM);
            registry.register(Block.POTTED_CLOSED_EYEBLOSSOM.key(), Block.POTTED_CLOSED_EYEBLOSSOM);
            registry.register(Block.FIREFLY_BUSH.key(), Block.FIREFLY_BUSH);
            registry.registerTag(NamespacedKey.minecraft("acacia_logs"), Tags.ACACIA_LOGS);
            registry.registerTag(NamespacedKey.minecraft("air"), Tags.AIR);
            registry.registerTag(NamespacedKey.minecraft("all_hanging_signs"), Tags.ALL_HANGING_SIGNS);
            registry.registerTag(NamespacedKey.minecraft("all_signs"), Tags.ALL_SIGNS);
            registry.registerTag(NamespacedKey.minecraft("ancient_city_replaceable"), Tags.ANCIENT_CITY_REPLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("animals_spawnable_on"), Tags.ANIMALS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("anvil"), Tags.ANVIL);
            registry.registerTag(NamespacedKey.minecraft("armadillo_spawnable_on"), Tags.ARMADILLO_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("axolotls_spawnable_on"), Tags.AXOLOTLS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("azalea_grows_on"), Tags.AZALEA_GROWS_ON);
            registry.registerTag(NamespacedKey.minecraft("azalea_root_replaceable"), Tags.AZALEA_ROOT_REPLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("badlands_terracotta"), Tags.BADLANDS_TERRACOTTA);
            registry.registerTag(NamespacedKey.minecraft("bamboo_blocks"), Tags.BAMBOO_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("bamboo_plantable_on"), Tags.BAMBOO_PLANTABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("banners"), Tags.BANNERS);
            registry.registerTag(NamespacedKey.minecraft("bars"), Tags.BARS);
            registry.registerTag(NamespacedKey.minecraft("base_stone_nether"), Tags.BASE_STONE_NETHER);
            registry.registerTag(NamespacedKey.minecraft("base_stone_overworld"), Tags.BASE_STONE_OVERWORLD);
            registry.registerTag(NamespacedKey.minecraft("bats_spawnable_on"), Tags.BATS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("beacon_base_blocks"), Tags.BEACON_BASE_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("beds"), Tags.BEDS);
            registry.registerTag(NamespacedKey.minecraft("bee_attractive"), Tags.BEE_ATTRACTIVE);
            registry.registerTag(NamespacedKey.minecraft("bee_growables"), Tags.BEE_GROWABLES);
            registry.registerTag(NamespacedKey.minecraft("beehives"), Tags.BEEHIVES);
            registry.registerTag(NamespacedKey.minecraft("big_dripleaf_placeable"), Tags.BIG_DRIPLEAF_PLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("birch_logs"), Tags.BIRCH_LOGS);
            registry.registerTag(NamespacedKey.minecraft("blocks_wind_charge_explosions"), Tags.BLOCKS_WIND_CHARGE_EXPLOSIONS);
            registry.registerTag(NamespacedKey.minecraft("buttons"), Tags.BUTTONS);
            registry.registerTag(NamespacedKey.minecraft("camel_sand_step_sound_blocks"), Tags.CAMEL_SAND_STEP_SOUND_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("camels_spawnable_on"), Tags.CAMELS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("campfires"), Tags.CAMPFIRES);
            registry.registerTag(NamespacedKey.minecraft("can_glide_through"), Tags.CAN_GLIDE_THROUGH);
            registry.registerTag(NamespacedKey.minecraft("candle_cakes"), Tags.CANDLE_CAKES);
            registry.registerTag(NamespacedKey.minecraft("candles"), Tags.CANDLES);
            registry.registerTag(NamespacedKey.minecraft("cauldrons"), Tags.CAULDRONS);
            registry.registerTag(NamespacedKey.minecraft("cave_vines"), Tags.CAVE_VINES);
            registry.registerTag(NamespacedKey.minecraft("ceiling_hanging_signs"), Tags.CEILING_HANGING_SIGNS);
            registry.registerTag(NamespacedKey.minecraft("chains"), Tags.CHAINS);
            registry.registerTag(NamespacedKey.minecraft("cherry_logs"), Tags.CHERRY_LOGS);
            registry.registerTag(NamespacedKey.minecraft("climbable"), Tags.CLIMBABLE);
            registry.registerTag(NamespacedKey.minecraft("coal_ores"), Tags.COAL_ORES);
            registry.registerTag(NamespacedKey.minecraft("combination_step_sound_blocks"), Tags.COMBINATION_STEP_SOUND_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("completes_find_tree_tutorial"), Tags.COMPLETES_FIND_TREE_TUTORIAL);
            registry.registerTag(NamespacedKey.minecraft("concrete_powder"), Tags.CONCRETE_POWDER);
            registry.registerTag(NamespacedKey.minecraft("convertable_to_mud"), Tags.CONVERTABLE_TO_MUD);
            registry.registerTag(NamespacedKey.minecraft("copper"), Tags.COPPER);
            registry.registerTag(NamespacedKey.minecraft("copper_chests"), Tags.COPPER_CHESTS);
            registry.registerTag(NamespacedKey.minecraft("copper_golem_statues"), Tags.COPPER_GOLEM_STATUES);
            registry.registerTag(NamespacedKey.minecraft("copper_ores"), Tags.COPPER_ORES);
            registry.registerTag(NamespacedKey.minecraft("coral_blocks"), Tags.CORAL_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("coral_plants"), Tags.CORAL_PLANTS);
            registry.registerTag(NamespacedKey.minecraft("corals"), Tags.CORALS);
            registry.registerTag(NamespacedKey.minecraft("crimson_stems"), Tags.CRIMSON_STEMS);
            registry.registerTag(NamespacedKey.minecraft("crops"), Tags.CROPS);
            registry.registerTag(NamespacedKey.minecraft("crystal_sound_blocks"), Tags.CRYSTAL_SOUND_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("dampens_vibrations"), Tags.DAMPENS_VIBRATIONS);
            registry.registerTag(NamespacedKey.minecraft("dark_oak_logs"), Tags.DARK_OAK_LOGS);
            registry.registerTag(NamespacedKey.minecraft("deepslate_ore_replaceables"), Tags.DEEPSLATE_ORE_REPLACEABLES);
            registry.registerTag(NamespacedKey.minecraft("diamond_ores"), Tags.DIAMOND_ORES);
            registry.registerTag(NamespacedKey.minecraft("dirt"), Tags.DIRT);
            registry.registerTag(NamespacedKey.minecraft("does_not_block_hoppers"), Tags.DOES_NOT_BLOCK_HOPPERS);
            registry.registerTag(NamespacedKey.minecraft("doors"), Tags.DOORS);
            registry.registerTag(NamespacedKey.minecraft("dragon_immune"), Tags.DRAGON_IMMUNE);
            registry.registerTag(NamespacedKey.minecraft("dragon_transparent"), Tags.DRAGON_TRANSPARENT);
            registry.registerTag(NamespacedKey.minecraft("dripstone_replaceable_blocks"), Tags.DRIPSTONE_REPLACEABLE_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("dry_vegetation_may_place_on"), Tags.DRY_VEGETATION_MAY_PLACE_ON);
            registry.registerTag(NamespacedKey.minecraft("edible_for_sheep"), Tags.EDIBLE_FOR_SHEEP);
            registry.registerTag(NamespacedKey.minecraft("emerald_ores"), Tags.EMERALD_ORES);
            registry.registerTag(NamespacedKey.minecraft("enchantment_power_provider"), Tags.ENCHANTMENT_POWER_PROVIDER);
            registry.registerTag(NamespacedKey.minecraft("enchantment_power_transmitter"), Tags.ENCHANTMENT_POWER_TRANSMITTER);
            registry.registerTag(NamespacedKey.minecraft("enderman_holdable"), Tags.ENDERMAN_HOLDABLE);
            registry.registerTag(NamespacedKey.minecraft("fall_damage_resetting"), Tags.FALL_DAMAGE_RESETTING);
            registry.registerTag(NamespacedKey.minecraft("features_cannot_replace"), Tags.FEATURES_CANNOT_REPLACE);
            registry.registerTag(NamespacedKey.minecraft("fence_gates"), Tags.FENCE_GATES);
            registry.registerTag(NamespacedKey.minecraft("fences"), Tags.FENCES);
            registry.registerTag(NamespacedKey.minecraft("fire"), Tags.FIRE);
            registry.registerTag(NamespacedKey.minecraft("flower_pots"), Tags.FLOWER_POTS);
            registry.registerTag(NamespacedKey.minecraft("flowers"), Tags.FLOWERS);
            registry.registerTag(NamespacedKey.minecraft("foxes_spawnable_on"), Tags.FOXES_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("frog_prefer_jump_to"), Tags.FROG_PREFER_JUMP_TO);
            registry.registerTag(NamespacedKey.minecraft("frogs_spawnable_on"), Tags.FROGS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("geode_invalid_blocks"), Tags.GEODE_INVALID_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("goats_spawnable_on"), Tags.GOATS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("gold_ores"), Tags.GOLD_ORES);
            registry.registerTag(NamespacedKey.minecraft("guarded_by_piglins"), Tags.GUARDED_BY_PIGLINS);
            registry.registerTag(NamespacedKey.minecraft("happy_ghast_avoids"), Tags.HAPPY_GHAST_AVOIDS);
            registry.registerTag(NamespacedKey.minecraft("hoglin_repellents"), Tags.HOGLIN_REPELLENTS);
            registry.registerTag(NamespacedKey.minecraft("ice"), Tags.ICE);
            registry.registerTag(NamespacedKey.minecraft("impermeable"), Tags.IMPERMEABLE);
            registry.registerTag(NamespacedKey.minecraft("incorrect_for_copper_tool"), Tags.INCORRECT_FOR_COPPER_TOOL);
            registry.registerTag(NamespacedKey.minecraft("incorrect_for_diamond_tool"), Tags.INCORRECT_FOR_DIAMOND_TOOL);
            registry.registerTag(NamespacedKey.minecraft("incorrect_for_gold_tool"), Tags.INCORRECT_FOR_GOLD_TOOL);
            registry.registerTag(NamespacedKey.minecraft("incorrect_for_iron_tool"), Tags.INCORRECT_FOR_IRON_TOOL);
            registry.registerTag(NamespacedKey.minecraft("incorrect_for_netherite_tool"), Tags.INCORRECT_FOR_NETHERITE_TOOL);
            registry.registerTag(NamespacedKey.minecraft("incorrect_for_stone_tool"), Tags.INCORRECT_FOR_STONE_TOOL);
            registry.registerTag(NamespacedKey.minecraft("incorrect_for_wooden_tool"), Tags.INCORRECT_FOR_WOODEN_TOOL);
            registry.registerTag(NamespacedKey.minecraft("infiniburn_end"), Tags.INFINIBURN_END);
            registry.registerTag(NamespacedKey.minecraft("infiniburn_nether"), Tags.INFINIBURN_NETHER);
            registry.registerTag(NamespacedKey.minecraft("infiniburn_overworld"), Tags.INFINIBURN_OVERWORLD);
            registry.registerTag(NamespacedKey.minecraft("inside_step_sound_blocks"), Tags.INSIDE_STEP_SOUND_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("invalid_spawn_inside"), Tags.INVALID_SPAWN_INSIDE);
            registry.registerTag(NamespacedKey.minecraft("iron_ores"), Tags.IRON_ORES);
            registry.registerTag(NamespacedKey.minecraft("jungle_logs"), Tags.JUNGLE_LOGS);
            registry.registerTag(NamespacedKey.minecraft("lanterns"), Tags.LANTERNS);
            registry.registerTag(NamespacedKey.minecraft("lapis_ores"), Tags.LAPIS_ORES);
            registry.registerTag(NamespacedKey.minecraft("lava_pool_stone_cannot_replace"), Tags.LAVA_POOL_STONE_CANNOT_REPLACE);
            registry.registerTag(NamespacedKey.minecraft("leaves"), Tags.LEAVES);
            registry.registerTag(NamespacedKey.minecraft("lightning_rods"), Tags.LIGHTNING_RODS);
            registry.registerTag(NamespacedKey.minecraft("logs"), Tags.LOGS);
            registry.registerTag(NamespacedKey.minecraft("logs_that_burn"), Tags.LOGS_THAT_BURN);
            registry.registerTag(NamespacedKey.minecraft("lush_ground_replaceable"), Tags.LUSH_GROUND_REPLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("maintains_farmland"), Tags.MAINTAINS_FARMLAND);
            registry.registerTag(NamespacedKey.minecraft("mangrove_logs"), Tags.MANGROVE_LOGS);
            registry.registerTag(NamespacedKey.minecraft("mangrove_logs_can_grow_through"), Tags.MANGROVE_LOGS_CAN_GROW_THROUGH);
            registry.registerTag(NamespacedKey.minecraft("mangrove_roots_can_grow_through"), Tags.MANGROVE_ROOTS_CAN_GROW_THROUGH);
            registry.registerTag(NamespacedKey.minecraft("mineable/axe"), Tags.MINEABLE_AXE);
            registry.registerTag(NamespacedKey.minecraft("mineable/hoe"), Tags.MINEABLE_HOE);
            registry.registerTag(NamespacedKey.minecraft("mineable/pickaxe"), Tags.MINEABLE_PICKAXE);
            registry.registerTag(NamespacedKey.minecraft("mineable/shovel"), Tags.MINEABLE_SHOVEL);
            registry.registerTag(NamespacedKey.minecraft("mob_interactable_doors"), Tags.MOB_INTERACTABLE_DOORS);
            registry.registerTag(NamespacedKey.minecraft("mooshrooms_spawnable_on"), Tags.MOOSHROOMS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("moss_replaceable"), Tags.MOSS_REPLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("mushroom_grow_block"), Tags.MUSHROOM_GROW_BLOCK);
            registry.registerTag(NamespacedKey.minecraft("needs_diamond_tool"), Tags.NEEDS_DIAMOND_TOOL);
            registry.registerTag(NamespacedKey.minecraft("needs_iron_tool"), Tags.NEEDS_IRON_TOOL);
            registry.registerTag(NamespacedKey.minecraft("needs_stone_tool"), Tags.NEEDS_STONE_TOOL);
            registry.registerTag(NamespacedKey.minecraft("nether_carver_replaceables"), Tags.NETHER_CARVER_REPLACEABLES);
            registry.registerTag(NamespacedKey.minecraft("nylium"), Tags.NYLIUM);
            registry.registerTag(NamespacedKey.minecraft("oak_logs"), Tags.OAK_LOGS);
            registry.registerTag(NamespacedKey.minecraft("occludes_vibration_signals"), Tags.OCCLUDES_VIBRATION_SIGNALS);
            registry.registerTag(NamespacedKey.minecraft("overworld_carver_replaceables"), Tags.OVERWORLD_CARVER_REPLACEABLES);
            registry.registerTag(NamespacedKey.minecraft("overworld_natural_logs"), Tags.OVERWORLD_NATURAL_LOGS);
            registry.registerTag(NamespacedKey.minecraft("pale_oak_logs"), Tags.PALE_OAK_LOGS);
            registry.registerTag(NamespacedKey.minecraft("parrots_spawnable_on"), Tags.PARROTS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("piglin_repellents"), Tags.PIGLIN_REPELLENTS);
            registry.registerTag(NamespacedKey.minecraft("planks"), Tags.PLANKS);
            registry.registerTag(NamespacedKey.minecraft("polar_bears_spawnable_on_alternate"), Tags.POLAR_BEARS_SPAWNABLE_ON_ALTERNATE);
            registry.registerTag(NamespacedKey.minecraft("portals"), Tags.PORTALS);
            registry.registerTag(NamespacedKey.minecraft("pressure_plates"), Tags.PRESSURE_PLATES);
            registry.registerTag(NamespacedKey.minecraft("prevent_mob_spawning_inside"), Tags.PREVENT_MOB_SPAWNING_INSIDE);
            registry.registerTag(NamespacedKey.minecraft("rabbits_spawnable_on"), Tags.RABBITS_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("rails"), Tags.RAILS);
            registry.registerTag(NamespacedKey.minecraft("redstone_ores"), Tags.REDSTONE_ORES);
            registry.registerTag(NamespacedKey.minecraft("replaceable"), Tags.REPLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("replaceable_by_mushrooms"), Tags.REPLACEABLE_BY_MUSHROOMS);
            registry.registerTag(NamespacedKey.minecraft("replaceable_by_trees"), Tags.REPLACEABLE_BY_TREES);
            registry.registerTag(NamespacedKey.minecraft("sand"), Tags.SAND);
            registry.registerTag(NamespacedKey.minecraft("saplings"), Tags.SAPLINGS);
            registry.registerTag(NamespacedKey.minecraft("sculk_replaceable"), Tags.SCULK_REPLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("sculk_replaceable_world_gen"), Tags.SCULK_REPLACEABLE_WORLD_GEN);
            registry.registerTag(NamespacedKey.minecraft("shulker_boxes"), Tags.SHULKER_BOXES);
            registry.registerTag(NamespacedKey.minecraft("signs"), Tags.SIGNS);
            registry.registerTag(NamespacedKey.minecraft("slabs"), Tags.SLABS);
            registry.registerTag(NamespacedKey.minecraft("small_dripleaf_placeable"), Tags.SMALL_DRIPLEAF_PLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("small_flowers"), Tags.SMALL_FLOWERS);
            registry.registerTag(NamespacedKey.minecraft("smelts_to_glass"), Tags.SMELTS_TO_GLASS);
            registry.registerTag(NamespacedKey.minecraft("snaps_goat_horn"), Tags.SNAPS_GOAT_HORN);
            registry.registerTag(NamespacedKey.minecraft("sniffer_diggable_block"), Tags.SNIFFER_DIGGABLE_BLOCK);
            registry.registerTag(NamespacedKey.minecraft("sniffer_egg_hatch_boost"), Tags.SNIFFER_EGG_HATCH_BOOST);
            registry.registerTag(NamespacedKey.minecraft("snow"), Tags.SNOW);
            registry.registerTag(NamespacedKey.minecraft("snow_layer_can_survive_on"), Tags.SNOW_LAYER_CAN_SURVIVE_ON);
            registry.registerTag(NamespacedKey.minecraft("snow_layer_cannot_survive_on"), Tags.SNOW_LAYER_CANNOT_SURVIVE_ON);
            registry.registerTag(NamespacedKey.minecraft("soul_fire_base_blocks"), Tags.SOUL_FIRE_BASE_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("soul_speed_blocks"), Tags.SOUL_SPEED_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("spruce_logs"), Tags.SPRUCE_LOGS);
            registry.registerTag(NamespacedKey.minecraft("stairs"), Tags.STAIRS);
            registry.registerTag(NamespacedKey.minecraft("standing_signs"), Tags.STANDING_SIGNS);
            registry.registerTag(NamespacedKey.minecraft("stone_bricks"), Tags.STONE_BRICKS);
            registry.registerTag(NamespacedKey.minecraft("stone_buttons"), Tags.STONE_BUTTONS);
            registry.registerTag(NamespacedKey.minecraft("stone_ore_replaceables"), Tags.STONE_ORE_REPLACEABLES);
            registry.registerTag(NamespacedKey.minecraft("stone_pressure_plates"), Tags.STONE_PRESSURE_PLATES);
            registry.registerTag(NamespacedKey.minecraft("strider_warm_blocks"), Tags.STRIDER_WARM_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("sword_efficient"), Tags.SWORD_EFFICIENT);
            registry.registerTag(NamespacedKey.minecraft("sword_instantly_mines"), Tags.SWORD_INSTANTLY_MINES);
            registry.registerTag(NamespacedKey.minecraft("terracotta"), Tags.TERRACOTTA);
            registry.registerTag(NamespacedKey.minecraft("trail_ruins_replaceable"), Tags.TRAIL_RUINS_REPLACEABLE);
            registry.registerTag(NamespacedKey.minecraft("trapdoors"), Tags.TRAPDOORS);
            registry.registerTag(NamespacedKey.minecraft("triggers_ambient_desert_dry_vegetation_block_sounds"), Tags.TRIGGERS_AMBIENT_DESERT_DRY_VEGETATION_BLOCK_SOUNDS);
            registry.registerTag(NamespacedKey.minecraft("triggers_ambient_desert_sand_block_sounds"), Tags.TRIGGERS_AMBIENT_DESERT_SAND_BLOCK_SOUNDS);
            registry.registerTag(NamespacedKey.minecraft("triggers_ambient_dried_ghast_block_sounds"), Tags.TRIGGERS_AMBIENT_DRIED_GHAST_BLOCK_SOUNDS);
            registry.registerTag(NamespacedKey.minecraft("underwater_bonemeals"), Tags.UNDERWATER_BONEMEALS);
            registry.registerTag(NamespacedKey.minecraft("unstable_bottom_center"), Tags.UNSTABLE_BOTTOM_CENTER);
            registry.registerTag(NamespacedKey.minecraft("valid_spawn"), Tags.VALID_SPAWN);
            registry.registerTag(NamespacedKey.minecraft("vibration_resonators"), Tags.VIBRATION_RESONATORS);
            registry.registerTag(NamespacedKey.minecraft("wall_corals"), Tags.WALL_CORALS);
            registry.registerTag(NamespacedKey.minecraft("wall_hanging_signs"), Tags.WALL_HANGING_SIGNS);
            registry.registerTag(NamespacedKey.minecraft("wall_post_override"), Tags.WALL_POST_OVERRIDE);
            registry.registerTag(NamespacedKey.minecraft("wall_signs"), Tags.WALL_SIGNS);
            registry.registerTag(NamespacedKey.minecraft("walls"), Tags.WALLS);
            registry.registerTag(NamespacedKey.minecraft("warped_stems"), Tags.WARPED_STEMS);
            registry.registerTag(NamespacedKey.minecraft("wart_blocks"), Tags.WART_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("wither_immune"), Tags.WITHER_IMMUNE);
            registry.registerTag(NamespacedKey.minecraft("wither_summon_base_blocks"), Tags.WITHER_SUMMON_BASE_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("wolves_spawnable_on"), Tags.WOLVES_SPAWNABLE_ON);
            registry.registerTag(NamespacedKey.minecraft("wooden_buttons"), Tags.WOODEN_BUTTONS);
            registry.registerTag(NamespacedKey.minecraft("wooden_doors"), Tags.WOODEN_DOORS);
            registry.registerTag(NamespacedKey.minecraft("wooden_fences"), Tags.WOODEN_FENCES);
            registry.registerTag(NamespacedKey.minecraft("wooden_pressure_plates"), Tags.WOODEN_PRESSURE_PLATES);
            registry.registerTag(NamespacedKey.minecraft("wooden_shelves"), Tags.WOODEN_SHELVES);
            registry.registerTag(NamespacedKey.minecraft("wooden_slabs"), Tags.WOODEN_SLABS);
            registry.registerTag(NamespacedKey.minecraft("wooden_stairs"), Tags.WOODEN_STAIRS);
            registry.registerTag(NamespacedKey.minecraft("wooden_trapdoors"), Tags.WOODEN_TRAPDOORS);
            registry.registerTag(NamespacedKey.minecraft("wool"), Tags.WOOL);
            registry.registerTag(NamespacedKey.minecraft("wool_carpets"), Tags.WOOL_CARPETS);
        });
    }

    public static final class Tags {
        public static final Tag<Block<?>> ACACIA_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:acacia_log"))
                .resource(NamespacedKey.parse("minecraft:acacia_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_acacia_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_acacia_wood"))
                .build();

        public static final Tag<Block<?>> AIR = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:air"))
                .resource(NamespacedKey.parse("minecraft:void_air"))
                .resource(NamespacedKey.parse("minecraft:cave_air"))
                .build();

        public static final Tag<Block<?>> ALL_HANGING_SIGNS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:ceiling_hanging_signs"))
                .tag(NamespacedKey.parse("minecraft:wall_hanging_signs"))
                .build();

        public static final Tag<Block<?>> ALL_SIGNS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:signs"))
                .tag(NamespacedKey.parse("minecraft:all_hanging_signs"))
                .build();

        public static final Tag<Block<?>> ANCIENT_CITY_REPLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:deepslate"))
                .resource(NamespacedKey.parse("minecraft:deepslate_bricks"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tiles"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tile_slab"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tile_wall"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate"))
                .resource(NamespacedKey.parse("minecraft:cracked_deepslate_bricks"))
                .resource(NamespacedKey.parse("minecraft:cracked_deepslate_tiles"))
                .resource(NamespacedKey.parse("minecraft:gray_wool"))
                .build();

        public static final Tag<Block<?>> ANIMALS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .build();

        public static final Tag<Block<?>> ANVIL = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:anvil"))
                .resource(NamespacedKey.parse("minecraft:chipped_anvil"))
                .resource(NamespacedKey.parse("minecraft:damaged_anvil"))
                .build();

        public static final Tag<Block<?>> ARMADILLO_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:animals_spawnable_on"))
                .tag(NamespacedKey.parse("minecraft:badlands_terracotta"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .build();

        public static final Tag<Block<?>> AXOLOTLS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:clay"))
                .build();

        public static final Tag<Block<?>> AZALEA_GROWS_ON = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .tag(NamespacedKey.parse("minecraft:sand"))
                .tag(NamespacedKey.parse("minecraft:terracotta"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:powder_snow"))
                .build();

        public static final Tag<Block<?>> AZALEA_ROOT_REPLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:base_stone_overworld"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .tag(NamespacedKey.parse("minecraft:terracotta"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .resource(NamespacedKey.parse("minecraft:clay"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:powder_snow"))
                .build();

        public static final Tag<Block<?>> BADLANDS_TERRACOTTA = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:terracotta"))
                .resource(NamespacedKey.parse("minecraft:white_terracotta"))
                .resource(NamespacedKey.parse("minecraft:yellow_terracotta"))
                .resource(NamespacedKey.parse("minecraft:orange_terracotta"))
                .resource(NamespacedKey.parse("minecraft:red_terracotta"))
                .resource(NamespacedKey.parse("minecraft:brown_terracotta"))
                .resource(NamespacedKey.parse("minecraft:light_gray_terracotta"))
                .build();

        public static final Tag<Block<?>> BAMBOO_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:bamboo_block"))
                .resource(NamespacedKey.parse("minecraft:stripped_bamboo_block"))
                .build();

        public static final Tag<Block<?>> BAMBOO_PLANTABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:sand"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:bamboo"))
                .resource(NamespacedKey.parse("minecraft:bamboo_sapling"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .resource(NamespacedKey.parse("minecraft:suspicious_gravel"))
                .build();

        public static final Tag<Block<?>> BANNERS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:white_banner"))
                .resource(NamespacedKey.parse("minecraft:orange_banner"))
                .resource(NamespacedKey.parse("minecraft:magenta_banner"))
                .resource(NamespacedKey.parse("minecraft:light_blue_banner"))
                .resource(NamespacedKey.parse("minecraft:yellow_banner"))
                .resource(NamespacedKey.parse("minecraft:lime_banner"))
                .resource(NamespacedKey.parse("minecraft:pink_banner"))
                .resource(NamespacedKey.parse("minecraft:gray_banner"))
                .resource(NamespacedKey.parse("minecraft:light_gray_banner"))
                .resource(NamespacedKey.parse("minecraft:cyan_banner"))
                .resource(NamespacedKey.parse("minecraft:purple_banner"))
                .resource(NamespacedKey.parse("minecraft:blue_banner"))
                .resource(NamespacedKey.parse("minecraft:brown_banner"))
                .resource(NamespacedKey.parse("minecraft:green_banner"))
                .resource(NamespacedKey.parse("minecraft:red_banner"))
                .resource(NamespacedKey.parse("minecraft:black_banner"))
                .resource(NamespacedKey.parse("minecraft:white_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:orange_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:magenta_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:light_blue_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:yellow_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:lime_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:pink_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:gray_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:light_gray_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:cyan_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:purple_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:blue_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:brown_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:green_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:red_wall_banner"))
                .resource(NamespacedKey.parse("minecraft:black_wall_banner"))
                .build();

        public static final Tag<Block<?>> BARS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:iron_bars"))
                .resource(NamespacedKey.parse("minecraft:copper_bars"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_bars"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_bars"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_bars"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_bars"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_bars"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_bars"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_bars"))
                .build();

        public static final Tag<Block<?>> BASE_STONE_NETHER = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:netherrack"))
                .resource(NamespacedKey.parse("minecraft:basalt"))
                .resource(NamespacedKey.parse("minecraft:blackstone"))
                .build();

        public static final Tag<Block<?>> BASE_STONE_OVERWORLD = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:stone"))
                .resource(NamespacedKey.parse("minecraft:granite"))
                .resource(NamespacedKey.parse("minecraft:diorite"))
                .resource(NamespacedKey.parse("minecraft:andesite"))
                .resource(NamespacedKey.parse("minecraft:tuff"))
                .resource(NamespacedKey.parse("minecraft:deepslate"))
                .build();

        public static final Tag<Block<?>> BATS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:base_stone_overworld"))
                .build();

        public static final Tag<Block<?>> BEACON_BASE_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:netherite_block"))
                .resource(NamespacedKey.parse("minecraft:emerald_block"))
                .resource(NamespacedKey.parse("minecraft:diamond_block"))
                .resource(NamespacedKey.parse("minecraft:gold_block"))
                .resource(NamespacedKey.parse("minecraft:iron_block"))
                .build();

        public static final Tag<Block<?>> BEDS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:red_bed"))
                .resource(NamespacedKey.parse("minecraft:black_bed"))
                .resource(NamespacedKey.parse("minecraft:blue_bed"))
                .resource(NamespacedKey.parse("minecraft:brown_bed"))
                .resource(NamespacedKey.parse("minecraft:cyan_bed"))
                .resource(NamespacedKey.parse("minecraft:gray_bed"))
                .resource(NamespacedKey.parse("minecraft:green_bed"))
                .resource(NamespacedKey.parse("minecraft:light_blue_bed"))
                .resource(NamespacedKey.parse("minecraft:light_gray_bed"))
                .resource(NamespacedKey.parse("minecraft:lime_bed"))
                .resource(NamespacedKey.parse("minecraft:magenta_bed"))
                .resource(NamespacedKey.parse("minecraft:orange_bed"))
                .resource(NamespacedKey.parse("minecraft:pink_bed"))
                .resource(NamespacedKey.parse("minecraft:purple_bed"))
                .resource(NamespacedKey.parse("minecraft:white_bed"))
                .resource(NamespacedKey.parse("minecraft:yellow_bed"))
                .build();

        public static final Tag<Block<?>> BEE_ATTRACTIVE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:dandelion"))
                .resource(NamespacedKey.parse("minecraft:open_eyeblossom"))
                .resource(NamespacedKey.parse("minecraft:poppy"))
                .resource(NamespacedKey.parse("minecraft:blue_orchid"))
                .resource(NamespacedKey.parse("minecraft:allium"))
                .resource(NamespacedKey.parse("minecraft:azure_bluet"))
                .resource(NamespacedKey.parse("minecraft:red_tulip"))
                .resource(NamespacedKey.parse("minecraft:orange_tulip"))
                .resource(NamespacedKey.parse("minecraft:white_tulip"))
                .resource(NamespacedKey.parse("minecraft:pink_tulip"))
                .resource(NamespacedKey.parse("minecraft:oxeye_daisy"))
                .resource(NamespacedKey.parse("minecraft:cornflower"))
                .resource(NamespacedKey.parse("minecraft:lily_of_the_valley"))
                .resource(NamespacedKey.parse("minecraft:wither_rose"))
                .resource(NamespacedKey.parse("minecraft:torchflower"))
                .resource(NamespacedKey.parse("minecraft:sunflower"))
                .resource(NamespacedKey.parse("minecraft:lilac"))
                .resource(NamespacedKey.parse("minecraft:peony"))
                .resource(NamespacedKey.parse("minecraft:rose_bush"))
                .resource(NamespacedKey.parse("minecraft:pitcher_plant"))
                .resource(NamespacedKey.parse("minecraft:flowering_azalea_leaves"))
                .resource(NamespacedKey.parse("minecraft:flowering_azalea"))
                .resource(NamespacedKey.parse("minecraft:mangrove_propagule"))
                .resource(NamespacedKey.parse("minecraft:cherry_leaves"))
                .resource(NamespacedKey.parse("minecraft:pink_petals"))
                .resource(NamespacedKey.parse("minecraft:wildflowers"))
                .resource(NamespacedKey.parse("minecraft:chorus_flower"))
                .resource(NamespacedKey.parse("minecraft:spore_blossom"))
                .resource(NamespacedKey.parse("minecraft:cactus_flower"))
                .build();

        public static final Tag<Block<?>> BEE_GROWABLES = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:crops"))
                .resource(NamespacedKey.parse("minecraft:sweet_berry_bush"))
                .resource(NamespacedKey.parse("minecraft:cave_vines"))
                .resource(NamespacedKey.parse("minecraft:cave_vines_plant"))
                .build();

        public static final Tag<Block<?>> BEEHIVES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:bee_nest"))
                .resource(NamespacedKey.parse("minecraft:beehive"))
                .build();

        public static final Tag<Block<?>> BIG_DRIPLEAF_PLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:small_dripleaf_placeable"))
                .resource(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .resource(NamespacedKey.parse("minecraft:mycelium"))
                .resource(NamespacedKey.parse("minecraft:rooted_dirt"))
                .resource(NamespacedKey.parse("minecraft:moss_block"))
                .resource(NamespacedKey.parse("minecraft:mud"))
                .resource(NamespacedKey.parse("minecraft:muddy_mangrove_roots"))
                .resource(NamespacedKey.parse("minecraft:farmland"))
                .build();

        public static final Tag<Block<?>> BIRCH_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:birch_log"))
                .resource(NamespacedKey.parse("minecraft:birch_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_birch_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_birch_wood"))
                .build();

        public static final Tag<Block<?>> BLOCKS_WIND_CHARGE_EXPLOSIONS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:barrier"))
                .resource(NamespacedKey.parse("minecraft:bedrock"))
                .build();

        public static final Tag<Block<?>> BUTTONS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wooden_buttons"))
                .tag(NamespacedKey.parse("minecraft:stone_buttons"))
                .build();

        public static final Tag<Block<?>> CAMEL_SAND_STEP_SOUND_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:sand"))
                .tag(NamespacedKey.parse("minecraft:concrete_powder"))
                .build();

        public static final Tag<Block<?>> CAMELS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:sand"))
                .build();

        public static final Tag<Block<?>> CAMPFIRES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:campfire"))
                .resource(NamespacedKey.parse("minecraft:soul_campfire"))
                .build();

        public static final Tag<Block<?>> CAN_GLIDE_THROUGH = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:vine"))
                .resource(NamespacedKey.parse("minecraft:twisting_vines"))
                .resource(NamespacedKey.parse("minecraft:twisting_vines_plant"))
                .resource(NamespacedKey.parse("minecraft:weeping_vines"))
                .resource(NamespacedKey.parse("minecraft:weeping_vines_plant"))
                .tag(NamespacedKey.parse("minecraft:cave_vines"))
                .build();

        public static final Tag<Block<?>> CANDLE_CAKES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:candle_cake"))
                .resource(NamespacedKey.parse("minecraft:white_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:orange_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:magenta_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:light_blue_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:yellow_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:lime_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:pink_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:gray_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:light_gray_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:cyan_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:purple_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:blue_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:brown_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:green_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:red_candle_cake"))
                .resource(NamespacedKey.parse("minecraft:black_candle_cake"))
                .build();

        public static final Tag<Block<?>> CANDLES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:candle"))
                .resource(NamespacedKey.parse("minecraft:white_candle"))
                .resource(NamespacedKey.parse("minecraft:orange_candle"))
                .resource(NamespacedKey.parse("minecraft:magenta_candle"))
                .resource(NamespacedKey.parse("minecraft:light_blue_candle"))
                .resource(NamespacedKey.parse("minecraft:yellow_candle"))
                .resource(NamespacedKey.parse("minecraft:lime_candle"))
                .resource(NamespacedKey.parse("minecraft:pink_candle"))
                .resource(NamespacedKey.parse("minecraft:gray_candle"))
                .resource(NamespacedKey.parse("minecraft:light_gray_candle"))
                .resource(NamespacedKey.parse("minecraft:cyan_candle"))
                .resource(NamespacedKey.parse("minecraft:purple_candle"))
                .resource(NamespacedKey.parse("minecraft:blue_candle"))
                .resource(NamespacedKey.parse("minecraft:brown_candle"))
                .resource(NamespacedKey.parse("minecraft:green_candle"))
                .resource(NamespacedKey.parse("minecraft:red_candle"))
                .resource(NamespacedKey.parse("minecraft:black_candle"))
                .build();

        public static final Tag<Block<?>> CAULDRONS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:cauldron"))
                .resource(NamespacedKey.parse("minecraft:water_cauldron"))
                .resource(NamespacedKey.parse("minecraft:lava_cauldron"))
                .resource(NamespacedKey.parse("minecraft:powder_snow_cauldron"))
                .build();

        public static final Tag<Block<?>> CAVE_VINES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:cave_vines_plant"))
                .resource(NamespacedKey.parse("minecraft:cave_vines"))
                .build();

        public static final Tag<Block<?>> CEILING_HANGING_SIGNS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:spruce_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:birch_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:acacia_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:cherry_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:jungle_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:crimson_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:warped_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:mangrove_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:bamboo_hanging_sign"))
                .build();

        public static final Tag<Block<?>> CHAINS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:iron_chain"))
                .resource(NamespacedKey.parse("minecraft:copper_chain"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_chain"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_chain"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_chain"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_chain"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_chain"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_chain"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_chain"))
                .build();

        public static final Tag<Block<?>> CHERRY_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:cherry_log"))
                .resource(NamespacedKey.parse("minecraft:cherry_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_cherry_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_cherry_wood"))
                .build();

        public static final Tag<Block<?>> CLIMBABLE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:ladder"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .resource(NamespacedKey.parse("minecraft:scaffolding"))
                .resource(NamespacedKey.parse("minecraft:weeping_vines"))
                .resource(NamespacedKey.parse("minecraft:weeping_vines_plant"))
                .resource(NamespacedKey.parse("minecraft:twisting_vines"))
                .resource(NamespacedKey.parse("minecraft:twisting_vines_plant"))
                .resource(NamespacedKey.parse("minecraft:cave_vines"))
                .resource(NamespacedKey.parse("minecraft:cave_vines_plant"))
                .build();

        public static final Tag<Block<?>> COAL_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:coal_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_coal_ore"))
                .build();

        public static final Tag<Block<?>> COMBINATION_STEP_SOUND_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wool_carpets"))
                .resource(NamespacedKey.parse("minecraft:moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:pale_moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:nether_sprouts"))
                .resource(NamespacedKey.parse("minecraft:warped_roots"))
                .resource(NamespacedKey.parse("minecraft:crimson_roots"))
                .resource(NamespacedKey.parse("minecraft:resin_clump"))
                .build();

        public static final Tag<Block<?>> COMPLETES_FIND_TREE_TUTORIAL = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:logs"))
                .tag(NamespacedKey.parse("minecraft:leaves"))
                .tag(NamespacedKey.parse("minecraft:wart_blocks"))
                .build();

        public static final Tag<Block<?>> CONCRETE_POWDER = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:white_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:orange_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:magenta_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:light_blue_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:yellow_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:lime_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:pink_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:gray_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:light_gray_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:cyan_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:purple_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:blue_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:brown_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:green_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:red_concrete_powder"))
                .resource(NamespacedKey.parse("minecraft:black_concrete_powder"))
                .build();

        public static final Tag<Block<?>> CONVERTABLE_TO_MUD = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .resource(NamespacedKey.parse("minecraft:rooted_dirt"))
                .build();

        public static final Tag<Block<?>> COPPER = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:copper_block"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_block"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper"))
                .build();

        public static final Tag<Block<?>> COPPER_CHESTS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:copper_chest"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_chest"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_chest"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_chest"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_chest"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_chest"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_chest"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_chest"))
                .build();

        public static final Tag<Block<?>> COPPER_GOLEM_STATUES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:copper_golem_statue"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_golem_statue"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_golem_statue"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_golem_statue"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_golem_statue"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_golem_statue"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_golem_statue"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_golem_statue"))
                .build();

        public static final Tag<Block<?>> COPPER_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:copper_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_copper_ore"))
                .build();

        public static final Tag<Block<?>> CORAL_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:tube_coral_block"))
                .resource(NamespacedKey.parse("minecraft:brain_coral_block"))
                .resource(NamespacedKey.parse("minecraft:bubble_coral_block"))
                .resource(NamespacedKey.parse("minecraft:fire_coral_block"))
                .resource(NamespacedKey.parse("minecraft:horn_coral_block"))
                .build();

        public static final Tag<Block<?>> CORAL_PLANTS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:tube_coral"))
                .resource(NamespacedKey.parse("minecraft:brain_coral"))
                .resource(NamespacedKey.parse("minecraft:bubble_coral"))
                .resource(NamespacedKey.parse("minecraft:fire_coral"))
                .resource(NamespacedKey.parse("minecraft:horn_coral"))
                .build();

        public static final Tag<Block<?>> CORALS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:coral_plants"))
                .resource(NamespacedKey.parse("minecraft:tube_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:brain_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:bubble_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:fire_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:horn_coral_fan"))
                .build();

        public static final Tag<Block<?>> CRIMSON_STEMS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:crimson_stem"))
                .resource(NamespacedKey.parse("minecraft:stripped_crimson_stem"))
                .resource(NamespacedKey.parse("minecraft:crimson_hyphae"))
                .resource(NamespacedKey.parse("minecraft:stripped_crimson_hyphae"))
                .build();

        public static final Tag<Block<?>> CROPS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:beetroots"))
                .resource(NamespacedKey.parse("minecraft:carrots"))
                .resource(NamespacedKey.parse("minecraft:potatoes"))
                .resource(NamespacedKey.parse("minecraft:wheat"))
                .resource(NamespacedKey.parse("minecraft:melon_stem"))
                .resource(NamespacedKey.parse("minecraft:pumpkin_stem"))
                .resource(NamespacedKey.parse("minecraft:torchflower_crop"))
                .resource(NamespacedKey.parse("minecraft:pitcher_crop"))
                .build();

        public static final Tag<Block<?>> CRYSTAL_SOUND_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:amethyst_block"))
                .resource(NamespacedKey.parse("minecraft:budding_amethyst"))
                .build();

        public static final Tag<Block<?>> DAMPENS_VIBRATIONS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wool"))
                .tag(NamespacedKey.parse("minecraft:wool_carpets"))
                .build();

        public static final Tag<Block<?>> DARK_OAK_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:dark_oak_log"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_dark_oak_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_dark_oak_wood"))
                .build();

        public static final Tag<Block<?>> DEEPSLATE_ORE_REPLACEABLES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:deepslate"))
                .resource(NamespacedKey.parse("minecraft:tuff"))
                .build();

        public static final Tag<Block<?>> DIAMOND_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:diamond_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_diamond_ore"))
                .build();

        public static final Tag<Block<?>> DIRT = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .resource(NamespacedKey.parse("minecraft:mycelium"))
                .resource(NamespacedKey.parse("minecraft:rooted_dirt"))
                .resource(NamespacedKey.parse("minecraft:moss_block"))
                .resource(NamespacedKey.parse("minecraft:pale_moss_block"))
                .resource(NamespacedKey.parse("minecraft:mud"))
                .resource(NamespacedKey.parse("minecraft:muddy_mangrove_roots"))
                .build();

        public static final Tag<Block<?>> DOES_NOT_BLOCK_HOPPERS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:beehives"))
                .build();

        public static final Tag<Block<?>> DOORS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wooden_doors"))
                .resource(NamespacedKey.parse("minecraft:copper_door"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_door"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_door"))
                .resource(NamespacedKey.parse("minecraft:iron_door"))
                .build();

        public static final Tag<Block<?>> DRAGON_IMMUNE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:barrier"))
                .resource(NamespacedKey.parse("minecraft:bedrock"))
                .resource(NamespacedKey.parse("minecraft:end_portal"))
                .resource(NamespacedKey.parse("minecraft:end_portal_frame"))
                .resource(NamespacedKey.parse("minecraft:end_gateway"))
                .resource(NamespacedKey.parse("minecraft:command_block"))
                .resource(NamespacedKey.parse("minecraft:repeating_command_block"))
                .resource(NamespacedKey.parse("minecraft:chain_command_block"))
                .resource(NamespacedKey.parse("minecraft:structure_block"))
                .resource(NamespacedKey.parse("minecraft:jigsaw"))
                .resource(NamespacedKey.parse("minecraft:moving_piston"))
                .resource(NamespacedKey.parse("minecraft:obsidian"))
                .resource(NamespacedKey.parse("minecraft:crying_obsidian"))
                .resource(NamespacedKey.parse("minecraft:end_stone"))
                .resource(NamespacedKey.parse("minecraft:iron_bars"))
                .resource(NamespacedKey.parse("minecraft:respawn_anchor"))
                .resource(NamespacedKey.parse("minecraft:reinforced_deepslate"))
                .resource(NamespacedKey.parse("minecraft:test_block"))
                .resource(NamespacedKey.parse("minecraft:test_instance_block"))
                .build();

        public static final Tag<Block<?>> DRAGON_TRANSPARENT = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:light"))
                .tag(NamespacedKey.parse("minecraft:fire"))
                .build();

        public static final Tag<Block<?>> DRIPSTONE_REPLACEABLE_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:base_stone_overworld"))
                .build();

        public static final Tag<Block<?>> DRY_VEGETATION_MAY_PLACE_ON = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:sand"))
                .tag(NamespacedKey.parse("minecraft:terracotta"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:farmland"))
                .build();

        public static final Tag<Block<?>> EDIBLE_FOR_SHEEP = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:short_grass"))
                .resource(NamespacedKey.parse("minecraft:short_dry_grass"))
                .resource(NamespacedKey.parse("minecraft:tall_dry_grass"))
                .resource(NamespacedKey.parse("minecraft:fern"))
                .build();

        public static final Tag<Block<?>> EMERALD_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:emerald_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_emerald_ore"))
                .build();

        public static final Tag<Block<?>> ENCHANTMENT_POWER_PROVIDER = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:bookshelf"))
                .build();

        public static final Tag<Block<?>> ENCHANTMENT_POWER_TRANSMITTER = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:replaceable"))
                .build();

        public static final Tag<Block<?>> ENDERMAN_HOLDABLE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:small_flowers"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .resource(NamespacedKey.parse("minecraft:brown_mushroom"))
                .resource(NamespacedKey.parse("minecraft:red_mushroom"))
                .resource(NamespacedKey.parse("minecraft:tnt"))
                .resource(NamespacedKey.parse("minecraft:cactus"))
                .resource(NamespacedKey.parse("minecraft:clay"))
                .resource(NamespacedKey.parse("minecraft:pumpkin"))
                .resource(NamespacedKey.parse("minecraft:carved_pumpkin"))
                .resource(NamespacedKey.parse("minecraft:melon"))
                .resource(NamespacedKey.parse("minecraft:crimson_fungus"))
                .resource(NamespacedKey.parse("minecraft:crimson_nylium"))
                .resource(NamespacedKey.parse("minecraft:crimson_roots"))
                .resource(NamespacedKey.parse("minecraft:warped_fungus"))
                .resource(NamespacedKey.parse("minecraft:warped_nylium"))
                .resource(NamespacedKey.parse("minecraft:warped_roots"))
                .resource(NamespacedKey.parse("minecraft:cactus_flower"))
                .build();

        public static final Tag<Block<?>> FALL_DAMAGE_RESETTING = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:climbable"))
                .resource(NamespacedKey.parse("minecraft:sweet_berry_bush"))
                .resource(NamespacedKey.parse("minecraft:cobweb"))
                .build();

        public static final Tag<Block<?>> FEATURES_CANNOT_REPLACE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:bedrock"))
                .resource(NamespacedKey.parse("minecraft:spawner"))
                .resource(NamespacedKey.parse("minecraft:chest"))
                .resource(NamespacedKey.parse("minecraft:end_portal_frame"))
                .resource(NamespacedKey.parse("minecraft:reinforced_deepslate"))
                .resource(NamespacedKey.parse("minecraft:trial_spawner"))
                .resource(NamespacedKey.parse("minecraft:vault"))
                .build();

        public static final Tag<Block<?>> FENCE_GATES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:acacia_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:birch_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:jungle_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:oak_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:spruce_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:crimson_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:warped_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:mangrove_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:bamboo_fence_gate"))
                .resource(NamespacedKey.parse("minecraft:cherry_fence_gate"))
                .build();

        public static final Tag<Block<?>> FENCES = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wooden_fences"))
                .resource(NamespacedKey.parse("minecraft:nether_brick_fence"))
                .build();

        public static final Tag<Block<?>> FIRE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:fire"))
                .resource(NamespacedKey.parse("minecraft:soul_fire"))
                .build();

        public static final Tag<Block<?>> FLOWER_POTS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:flower_pot"))
                .resource(NamespacedKey.parse("minecraft:potted_open_eyeblossom"))
                .resource(NamespacedKey.parse("minecraft:potted_closed_eyeblossom"))
                .resource(NamespacedKey.parse("minecraft:potted_poppy"))
                .resource(NamespacedKey.parse("minecraft:potted_blue_orchid"))
                .resource(NamespacedKey.parse("minecraft:potted_allium"))
                .resource(NamespacedKey.parse("minecraft:potted_azure_bluet"))
                .resource(NamespacedKey.parse("minecraft:potted_red_tulip"))
                .resource(NamespacedKey.parse("minecraft:potted_orange_tulip"))
                .resource(NamespacedKey.parse("minecraft:potted_white_tulip"))
                .resource(NamespacedKey.parse("minecraft:potted_pink_tulip"))
                .resource(NamespacedKey.parse("minecraft:potted_oxeye_daisy"))
                .resource(NamespacedKey.parse("minecraft:potted_dandelion"))
                .resource(NamespacedKey.parse("minecraft:potted_oak_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_spruce_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_birch_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_jungle_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_acacia_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_dark_oak_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_pale_oak_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_red_mushroom"))
                .resource(NamespacedKey.parse("minecraft:potted_brown_mushroom"))
                .resource(NamespacedKey.parse("minecraft:potted_dead_bush"))
                .resource(NamespacedKey.parse("minecraft:potted_fern"))
                .resource(NamespacedKey.parse("minecraft:potted_cactus"))
                .resource(NamespacedKey.parse("minecraft:potted_cornflower"))
                .resource(NamespacedKey.parse("minecraft:potted_lily_of_the_valley"))
                .resource(NamespacedKey.parse("minecraft:potted_wither_rose"))
                .resource(NamespacedKey.parse("minecraft:potted_bamboo"))
                .resource(NamespacedKey.parse("minecraft:potted_crimson_fungus"))
                .resource(NamespacedKey.parse("minecraft:potted_warped_fungus"))
                .resource(NamespacedKey.parse("minecraft:potted_crimson_roots"))
                .resource(NamespacedKey.parse("minecraft:potted_warped_roots"))
                .resource(NamespacedKey.parse("minecraft:potted_azalea_bush"))
                .resource(NamespacedKey.parse("minecraft:potted_flowering_azalea_bush"))
                .resource(NamespacedKey.parse("minecraft:potted_mangrove_propagule"))
                .resource(NamespacedKey.parse("minecraft:potted_cherry_sapling"))
                .resource(NamespacedKey.parse("minecraft:potted_torchflower"))
                .build();

        public static final Tag<Block<?>> FLOWERS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:small_flowers"))
                .resource(NamespacedKey.parse("minecraft:sunflower"))
                .resource(NamespacedKey.parse("minecraft:lilac"))
                .resource(NamespacedKey.parse("minecraft:peony"))
                .resource(NamespacedKey.parse("minecraft:rose_bush"))
                .resource(NamespacedKey.parse("minecraft:pitcher_plant"))
                .resource(NamespacedKey.parse("minecraft:flowering_azalea_leaves"))
                .resource(NamespacedKey.parse("minecraft:flowering_azalea"))
                .resource(NamespacedKey.parse("minecraft:mangrove_propagule"))
                .resource(NamespacedKey.parse("minecraft:cherry_leaves"))
                .resource(NamespacedKey.parse("minecraft:pink_petals"))
                .resource(NamespacedKey.parse("minecraft:wildflowers"))
                .resource(NamespacedKey.parse("minecraft:chorus_flower"))
                .resource(NamespacedKey.parse("minecraft:spore_blossom"))
                .resource(NamespacedKey.parse("minecraft:cactus_flower"))
                .build();

        public static final Tag<Block<?>> FOXES_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .build();

        public static final Tag<Block<?>> FROG_PREFER_JUMP_TO = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:lily_pad"))
                .resource(NamespacedKey.parse("minecraft:big_dripleaf"))
                .build();

        public static final Tag<Block<?>> FROGS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:mud"))
                .resource(NamespacedKey.parse("minecraft:mangrove_roots"))
                .resource(NamespacedKey.parse("minecraft:muddy_mangrove_roots"))
                .build();

        public static final Tag<Block<?>> GEODE_INVALID_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:bedrock"))
                .resource(NamespacedKey.parse("minecraft:water"))
                .resource(NamespacedKey.parse("minecraft:lava"))
                .resource(NamespacedKey.parse("minecraft:ice"))
                .resource(NamespacedKey.parse("minecraft:packed_ice"))
                .resource(NamespacedKey.parse("minecraft:blue_ice"))
                .build();

        public static final Tag<Block<?>> GOATS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:animals_spawnable_on"))
                .resource(NamespacedKey.parse("minecraft:stone"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:packed_ice"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .build();

        public static final Tag<Block<?>> GOLD_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:gold_ore"))
                .resource(NamespacedKey.parse("minecraft:nether_gold_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_gold_ore"))
                .build();

        public static final Tag<Block<?>> GUARDED_BY_PIGLINS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:copper_chests"))
                .resource(NamespacedKey.parse("minecraft:gold_block"))
                .resource(NamespacedKey.parse("minecraft:barrel"))
                .resource(NamespacedKey.parse("minecraft:chest"))
                .resource(NamespacedKey.parse("minecraft:ender_chest"))
                .resource(NamespacedKey.parse("minecraft:gilded_blackstone"))
                .resource(NamespacedKey.parse("minecraft:trapped_chest"))
                .resource(NamespacedKey.parse("minecraft:raw_gold_block"))
                .tag(NamespacedKey.parse("minecraft:shulker_boxes"))
                .tag(NamespacedKey.parse("minecraft:gold_ores"))
                .build();

        public static final Tag<Block<?>> HAPPY_GHAST_AVOIDS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:sweet_berry_bush"))
                .resource(NamespacedKey.parse("minecraft:cactus"))
                .resource(NamespacedKey.parse("minecraft:wither_rose"))
                .resource(NamespacedKey.parse("minecraft:magma_block"))
                .resource(NamespacedKey.parse("minecraft:fire"))
                .resource(NamespacedKey.parse("minecraft:pointed_dripstone"))
                .build();

        public static final Tag<Block<?>> HOGLIN_REPELLENTS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:warped_fungus"))
                .resource(NamespacedKey.parse("minecraft:potted_warped_fungus"))
                .resource(NamespacedKey.parse("minecraft:nether_portal"))
                .resource(NamespacedKey.parse("minecraft:respawn_anchor"))
                .build();

        public static final Tag<Block<?>> ICE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:ice"))
                .resource(NamespacedKey.parse("minecraft:packed_ice"))
                .resource(NamespacedKey.parse("minecraft:blue_ice"))
                .resource(NamespacedKey.parse("minecraft:frosted_ice"))
                .build();

        public static final Tag<Block<?>> IMPERMEABLE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:glass"))
                .resource(NamespacedKey.parse("minecraft:white_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:orange_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:magenta_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:light_blue_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:yellow_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:lime_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:pink_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:gray_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:light_gray_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:cyan_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:purple_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:blue_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:brown_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:green_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:red_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:black_stained_glass"))
                .resource(NamespacedKey.parse("minecraft:tinted_glass"))
                .resource(NamespacedKey.parse("minecraft:barrier"))
                .build();

        public static final Tag<Block<?>> INCORRECT_FOR_COPPER_TOOL = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:needs_diamond_tool"))
                .tag(NamespacedKey.parse("minecraft:needs_iron_tool"))
                .build();

        public static final Tag<Block<?>> INCORRECT_FOR_DIAMOND_TOOL = Tag.builder(RegistryKey.BLOCK)
                .build();

        public static final Tag<Block<?>> INCORRECT_FOR_GOLD_TOOL = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:needs_diamond_tool"))
                .tag(NamespacedKey.parse("minecraft:needs_iron_tool"))
                .tag(NamespacedKey.parse("minecraft:needs_stone_tool"))
                .build();

        public static final Tag<Block<?>> INCORRECT_FOR_IRON_TOOL = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:needs_diamond_tool"))
                .build();

        public static final Tag<Block<?>> INCORRECT_FOR_NETHERITE_TOOL = Tag.builder(RegistryKey.BLOCK)
                .build();

        public static final Tag<Block<?>> INCORRECT_FOR_STONE_TOOL = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:needs_diamond_tool"))
                .tag(NamespacedKey.parse("minecraft:needs_iron_tool"))
                .build();

        public static final Tag<Block<?>> INCORRECT_FOR_WOODEN_TOOL = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:needs_diamond_tool"))
                .tag(NamespacedKey.parse("minecraft:needs_iron_tool"))
                .tag(NamespacedKey.parse("minecraft:needs_stone_tool"))
                .build();

        public static final Tag<Block<?>> INFINIBURN_END = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:infiniburn_overworld"))
                .resource(NamespacedKey.parse("minecraft:bedrock"))
                .build();

        public static final Tag<Block<?>> INFINIBURN_NETHER = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:infiniburn_overworld"))
                .build();

        public static final Tag<Block<?>> INFINIBURN_OVERWORLD = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:netherrack"))
                .resource(NamespacedKey.parse("minecraft:magma_block"))
                .build();

        public static final Tag<Block<?>> INSIDE_STEP_SOUND_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:powder_snow"))
                .resource(NamespacedKey.parse("minecraft:sculk_vein"))
                .resource(NamespacedKey.parse("minecraft:glow_lichen"))
                .resource(NamespacedKey.parse("minecraft:lily_pad"))
                .resource(NamespacedKey.parse("minecraft:small_amethyst_bud"))
                .resource(NamespacedKey.parse("minecraft:pink_petals"))
                .resource(NamespacedKey.parse("minecraft:wildflowers"))
                .resource(NamespacedKey.parse("minecraft:leaf_litter"))
                .build();

        public static final Tag<Block<?>> INVALID_SPAWN_INSIDE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:end_portal"))
                .resource(NamespacedKey.parse("minecraft:end_gateway"))
                .build();

        public static final Tag<Block<?>> IRON_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:iron_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_iron_ore"))
                .build();

        public static final Tag<Block<?>> JUNGLE_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:jungle_log"))
                .resource(NamespacedKey.parse("minecraft:jungle_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_jungle_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_jungle_wood"))
                .build();

        public static final Tag<Block<?>> LANTERNS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:lantern"))
                .resource(NamespacedKey.parse("minecraft:soul_lantern"))
                .resource(NamespacedKey.parse("minecraft:copper_lantern"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_lantern"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_lantern"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_lantern"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_lantern"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_lantern"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_lantern"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_lantern"))
                .build();

        public static final Tag<Block<?>> LAPIS_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:lapis_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_lapis_ore"))
                .build();

        public static final Tag<Block<?>> LAVA_POOL_STONE_CANNOT_REPLACE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:features_cannot_replace"))
                .tag(NamespacedKey.parse("minecraft:leaves"))
                .tag(NamespacedKey.parse("minecraft:logs"))
                .build();

        public static final Tag<Block<?>> LEAVES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:jungle_leaves"))
                .resource(NamespacedKey.parse("minecraft:oak_leaves"))
                .resource(NamespacedKey.parse("minecraft:spruce_leaves"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_leaves"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_leaves"))
                .resource(NamespacedKey.parse("minecraft:acacia_leaves"))
                .resource(NamespacedKey.parse("minecraft:birch_leaves"))
                .resource(NamespacedKey.parse("minecraft:azalea_leaves"))
                .resource(NamespacedKey.parse("minecraft:flowering_azalea_leaves"))
                .resource(NamespacedKey.parse("minecraft:mangrove_leaves"))
                .resource(NamespacedKey.parse("minecraft:cherry_leaves"))
                .build();

        public static final Tag<Block<?>> LIGHTNING_RODS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:lightning_rod"))
                .resource(NamespacedKey.parse("minecraft:exposed_lightning_rod"))
                .resource(NamespacedKey.parse("minecraft:weathered_lightning_rod"))
                .resource(NamespacedKey.parse("minecraft:oxidized_lightning_rod"))
                .resource(NamespacedKey.parse("minecraft:waxed_lightning_rod"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_lightning_rod"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_lightning_rod"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_lightning_rod"))
                .build();

        public static final Tag<Block<?>> LOGS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:logs_that_burn"))
                .tag(NamespacedKey.parse("minecraft:crimson_stems"))
                .tag(NamespacedKey.parse("minecraft:warped_stems"))
                .build();

        public static final Tag<Block<?>> LOGS_THAT_BURN = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:dark_oak_logs"))
                .tag(NamespacedKey.parse("minecraft:pale_oak_logs"))
                .tag(NamespacedKey.parse("minecraft:oak_logs"))
                .tag(NamespacedKey.parse("minecraft:acacia_logs"))
                .tag(NamespacedKey.parse("minecraft:birch_logs"))
                .tag(NamespacedKey.parse("minecraft:jungle_logs"))
                .tag(NamespacedKey.parse("minecraft:spruce_logs"))
                .tag(NamespacedKey.parse("minecraft:mangrove_logs"))
                .tag(NamespacedKey.parse("minecraft:cherry_logs"))
                .build();

        public static final Tag<Block<?>> LUSH_GROUND_REPLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:moss_replaceable"))
                .resource(NamespacedKey.parse("minecraft:clay"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .build();

        public static final Tag<Block<?>> MAINTAINS_FARMLAND = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:pumpkin_stem"))
                .resource(NamespacedKey.parse("minecraft:attached_pumpkin_stem"))
                .resource(NamespacedKey.parse("minecraft:melon_stem"))
                .resource(NamespacedKey.parse("minecraft:attached_melon_stem"))
                .resource(NamespacedKey.parse("minecraft:beetroots"))
                .resource(NamespacedKey.parse("minecraft:carrots"))
                .resource(NamespacedKey.parse("minecraft:potatoes"))
                .resource(NamespacedKey.parse("minecraft:torchflower_crop"))
                .resource(NamespacedKey.parse("minecraft:torchflower"))
                .resource(NamespacedKey.parse("minecraft:pitcher_crop"))
                .resource(NamespacedKey.parse("minecraft:wheat"))
                .build();

        public static final Tag<Block<?>> MANGROVE_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:mangrove_log"))
                .resource(NamespacedKey.parse("minecraft:mangrove_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_mangrove_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_mangrove_wood"))
                .build();

        public static final Tag<Block<?>> MANGROVE_LOGS_CAN_GROW_THROUGH = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:mud"))
                .resource(NamespacedKey.parse("minecraft:muddy_mangrove_roots"))
                .resource(NamespacedKey.parse("minecraft:mangrove_roots"))
                .resource(NamespacedKey.parse("minecraft:mangrove_leaves"))
                .resource(NamespacedKey.parse("minecraft:mangrove_log"))
                .resource(NamespacedKey.parse("minecraft:mangrove_propagule"))
                .resource(NamespacedKey.parse("minecraft:moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .build();

        public static final Tag<Block<?>> MANGROVE_ROOTS_CAN_GROW_THROUGH = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:mud"))
                .resource(NamespacedKey.parse("minecraft:muddy_mangrove_roots"))
                .resource(NamespacedKey.parse("minecraft:mangrove_roots"))
                .resource(NamespacedKey.parse("minecraft:moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .resource(NamespacedKey.parse("minecraft:mangrove_propagule"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .build();

        public static final Tag<Block<?>> MINEABLE_AXE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:note_block"))
                .resource(NamespacedKey.parse("minecraft:bamboo"))
                .resource(NamespacedKey.parse("minecraft:barrel"))
                .resource(NamespacedKey.parse("minecraft:bee_nest"))
                .resource(NamespacedKey.parse("minecraft:beehive"))
                .resource(NamespacedKey.parse("minecraft:big_dripleaf_stem"))
                .resource(NamespacedKey.parse("minecraft:big_dripleaf"))
                .resource(NamespacedKey.parse("minecraft:bookshelf"))
                .resource(NamespacedKey.parse("minecraft:brown_mushroom_block"))
                .resource(NamespacedKey.parse("minecraft:campfire"))
                .resource(NamespacedKey.parse("minecraft:cartography_table"))
                .resource(NamespacedKey.parse("minecraft:carved_pumpkin"))
                .resource(NamespacedKey.parse("minecraft:chest"))
                .resource(NamespacedKey.parse("minecraft:chorus_flower"))
                .resource(NamespacedKey.parse("minecraft:chorus_plant"))
                .resource(NamespacedKey.parse("minecraft:cocoa"))
                .resource(NamespacedKey.parse("minecraft:composter"))
                .resource(NamespacedKey.parse("minecraft:crafting_table"))
                .resource(NamespacedKey.parse("minecraft:daylight_detector"))
                .resource(NamespacedKey.parse("minecraft:fletching_table"))
                .resource(NamespacedKey.parse("minecraft:glow_lichen"))
                .resource(NamespacedKey.parse("minecraft:jack_o_lantern"))
                .resource(NamespacedKey.parse("minecraft:jukebox"))
                .resource(NamespacedKey.parse("minecraft:ladder"))
                .resource(NamespacedKey.parse("minecraft:lectern"))
                .resource(NamespacedKey.parse("minecraft:loom"))
                .resource(NamespacedKey.parse("minecraft:melon"))
                .resource(NamespacedKey.parse("minecraft:mushroom_stem"))
                .resource(NamespacedKey.parse("minecraft:pumpkin"))
                .resource(NamespacedKey.parse("minecraft:red_mushroom_block"))
                .resource(NamespacedKey.parse("minecraft:smithing_table"))
                .resource(NamespacedKey.parse("minecraft:soul_campfire"))
                .resource(NamespacedKey.parse("minecraft:trapped_chest"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .tag(NamespacedKey.parse("minecraft:banners"))
                .tag(NamespacedKey.parse("minecraft:fence_gates"))
                .tag(NamespacedKey.parse("minecraft:logs"))
                .tag(NamespacedKey.parse("minecraft:planks"))
                .tag(NamespacedKey.parse("minecraft:signs"))
                .tag(NamespacedKey.parse("minecraft:wooden_buttons"))
                .tag(NamespacedKey.parse("minecraft:wooden_doors"))
                .tag(NamespacedKey.parse("minecraft:wooden_fences"))
                .tag(NamespacedKey.parse("minecraft:wooden_pressure_plates"))
                .tag(NamespacedKey.parse("minecraft:wooden_slabs"))
                .tag(NamespacedKey.parse("minecraft:wooden_stairs"))
                .tag(NamespacedKey.parse("minecraft:wooden_trapdoors"))
                .resource(NamespacedKey.parse("minecraft:mangrove_roots"))
                .tag(NamespacedKey.parse("minecraft:all_hanging_signs"))
                .resource(NamespacedKey.parse("minecraft:bamboo_mosaic"))
                .resource(NamespacedKey.parse("minecraft:bamboo_mosaic_slab"))
                .resource(NamespacedKey.parse("minecraft:bamboo_mosaic_stairs"))
                .tag(NamespacedKey.parse("minecraft:bamboo_blocks"))
                .resource(NamespacedKey.parse("minecraft:chiseled_bookshelf"))
                .tag(NamespacedKey.parse("minecraft:wooden_shelves"))
                .resource(NamespacedKey.parse("minecraft:creaking_heart"))
                .build();

        public static final Tag<Block<?>> MINEABLE_HOE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:leaves"))
                .resource(NamespacedKey.parse("minecraft:nether_wart_block"))
                .resource(NamespacedKey.parse("minecraft:warped_wart_block"))
                .resource(NamespacedKey.parse("minecraft:hay_block"))
                .resource(NamespacedKey.parse("minecraft:dried_kelp_block"))
                .resource(NamespacedKey.parse("minecraft:target"))
                .resource(NamespacedKey.parse("minecraft:shroomlight"))
                .resource(NamespacedKey.parse("minecraft:sponge"))
                .resource(NamespacedKey.parse("minecraft:wet_sponge"))
                .resource(NamespacedKey.parse("minecraft:sculk_sensor"))
                .resource(NamespacedKey.parse("minecraft:calibrated_sculk_sensor"))
                .resource(NamespacedKey.parse("minecraft:moss_block"))
                .resource(NamespacedKey.parse("minecraft:moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:pale_moss_block"))
                .resource(NamespacedKey.parse("minecraft:pale_moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:sculk"))
                .resource(NamespacedKey.parse("minecraft:sculk_catalyst"))
                .resource(NamespacedKey.parse("minecraft:sculk_vein"))
                .resource(NamespacedKey.parse("minecraft:sculk_shrieker"))
                .build();

        public static final Tag<Block<?>> MINEABLE_PICKAXE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:stone"))
                .resource(NamespacedKey.parse("minecraft:granite"))
                .resource(NamespacedKey.parse("minecraft:polished_granite"))
                .resource(NamespacedKey.parse("minecraft:diorite"))
                .resource(NamespacedKey.parse("minecraft:polished_diorite"))
                .resource(NamespacedKey.parse("minecraft:andesite"))
                .resource(NamespacedKey.parse("minecraft:polished_andesite"))
                .resource(NamespacedKey.parse("minecraft:cobblestone"))
                .resource(NamespacedKey.parse("minecraft:gold_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_gold_ore"))
                .resource(NamespacedKey.parse("minecraft:iron_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_iron_ore"))
                .resource(NamespacedKey.parse("minecraft:coal_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_coal_ore"))
                .resource(NamespacedKey.parse("minecraft:nether_gold_ore"))
                .resource(NamespacedKey.parse("minecraft:lapis_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_lapis_ore"))
                .resource(NamespacedKey.parse("minecraft:lapis_block"))
                .resource(NamespacedKey.parse("minecraft:dispenser"))
                .resource(NamespacedKey.parse("minecraft:sandstone"))
                .resource(NamespacedKey.parse("minecraft:chiseled_sandstone"))
                .resource(NamespacedKey.parse("minecraft:cut_sandstone"))
                .resource(NamespacedKey.parse("minecraft:gold_block"))
                .resource(NamespacedKey.parse("minecraft:iron_block"))
                .resource(NamespacedKey.parse("minecraft:bricks"))
                .resource(NamespacedKey.parse("minecraft:mossy_cobblestone"))
                .resource(NamespacedKey.parse("minecraft:obsidian"))
                .resource(NamespacedKey.parse("minecraft:spawner"))
                .resource(NamespacedKey.parse("minecraft:diamond_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_diamond_ore"))
                .resource(NamespacedKey.parse("minecraft:diamond_block"))
                .resource(NamespacedKey.parse("minecraft:furnace"))
                .resource(NamespacedKey.parse("minecraft:cobblestone_stairs"))
                .resource(NamespacedKey.parse("minecraft:stone_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:iron_door"))
                .resource(NamespacedKey.parse("minecraft:redstone_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_redstone_ore"))
                .resource(NamespacedKey.parse("minecraft:netherrack"))
                .resource(NamespacedKey.parse("minecraft:basalt"))
                .resource(NamespacedKey.parse("minecraft:polished_basalt"))
                .resource(NamespacedKey.parse("minecraft:stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:mossy_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:cracked_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:chiseled_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:stone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:nether_bricks"))
                .resource(NamespacedKey.parse("minecraft:nether_brick_fence"))
                .resource(NamespacedKey.parse("minecraft:nether_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:enchanting_table"))
                .resource(NamespacedKey.parse("minecraft:brewing_stand"))
                .resource(NamespacedKey.parse("minecraft:end_stone"))
                .resource(NamespacedKey.parse("minecraft:sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:emerald_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_emerald_ore"))
                .resource(NamespacedKey.parse("minecraft:ender_chest"))
                .resource(NamespacedKey.parse("minecraft:emerald_block"))
                .resource(NamespacedKey.parse("minecraft:light_weighted_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:heavy_weighted_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:redstone_block"))
                .resource(NamespacedKey.parse("minecraft:nether_quartz_ore"))
                .resource(NamespacedKey.parse("minecraft:hopper"))
                .resource(NamespacedKey.parse("minecraft:quartz_block"))
                .resource(NamespacedKey.parse("minecraft:chiseled_quartz_block"))
                .resource(NamespacedKey.parse("minecraft:quartz_pillar"))
                .resource(NamespacedKey.parse("minecraft:quartz_stairs"))
                .resource(NamespacedKey.parse("minecraft:dropper"))
                .resource(NamespacedKey.parse("minecraft:white_terracotta"))
                .resource(NamespacedKey.parse("minecraft:orange_terracotta"))
                .resource(NamespacedKey.parse("minecraft:magenta_terracotta"))
                .resource(NamespacedKey.parse("minecraft:light_blue_terracotta"))
                .resource(NamespacedKey.parse("minecraft:yellow_terracotta"))
                .resource(NamespacedKey.parse("minecraft:lime_terracotta"))
                .resource(NamespacedKey.parse("minecraft:pink_terracotta"))
                .resource(NamespacedKey.parse("minecraft:gray_terracotta"))
                .resource(NamespacedKey.parse("minecraft:light_gray_terracotta"))
                .resource(NamespacedKey.parse("minecraft:cyan_terracotta"))
                .resource(NamespacedKey.parse("minecraft:purple_terracotta"))
                .resource(NamespacedKey.parse("minecraft:blue_terracotta"))
                .resource(NamespacedKey.parse("minecraft:brown_terracotta"))
                .resource(NamespacedKey.parse("minecraft:green_terracotta"))
                .resource(NamespacedKey.parse("minecraft:red_terracotta"))
                .resource(NamespacedKey.parse("minecraft:black_terracotta"))
                .resource(NamespacedKey.parse("minecraft:iron_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:prismarine"))
                .resource(NamespacedKey.parse("minecraft:prismarine_bricks"))
                .resource(NamespacedKey.parse("minecraft:dark_prismarine"))
                .resource(NamespacedKey.parse("minecraft:prismarine_stairs"))
                .resource(NamespacedKey.parse("minecraft:prismarine_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:dark_prismarine_stairs"))
                .resource(NamespacedKey.parse("minecraft:prismarine_slab"))
                .resource(NamespacedKey.parse("minecraft:prismarine_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:dark_prismarine_slab"))
                .resource(NamespacedKey.parse("minecraft:terracotta"))
                .resource(NamespacedKey.parse("minecraft:coal_block"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone"))
                .resource(NamespacedKey.parse("minecraft:chiseled_red_sandstone"))
                .resource(NamespacedKey.parse("minecraft:cut_red_sandstone"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:stone_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_stone_slab"))
                .resource(NamespacedKey.parse("minecraft:sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:cut_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:petrified_oak_slab"))
                .resource(NamespacedKey.parse("minecraft:cobblestone_slab"))
                .resource(NamespacedKey.parse("minecraft:brick_slab"))
                .resource(NamespacedKey.parse("minecraft:stone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:nether_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:quartz_slab"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:cut_red_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:purpur_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_stone"))
                .resource(NamespacedKey.parse("minecraft:smooth_sandstone"))
                .resource(NamespacedKey.parse("minecraft:smooth_quartz"))
                .resource(NamespacedKey.parse("minecraft:smooth_red_sandstone"))
                .resource(NamespacedKey.parse("minecraft:purpur_block"))
                .resource(NamespacedKey.parse("minecraft:purpur_pillar"))
                .resource(NamespacedKey.parse("minecraft:purpur_stairs"))
                .resource(NamespacedKey.parse("minecraft:end_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:magma_block"))
                .resource(NamespacedKey.parse("minecraft:red_nether_bricks"))
                .resource(NamespacedKey.parse("minecraft:bone_block"))
                .resource(NamespacedKey.parse("minecraft:observer"))
                .resource(NamespacedKey.parse("minecraft:white_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:orange_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:magenta_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:light_blue_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:yellow_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:lime_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:pink_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:gray_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:light_gray_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:cyan_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:purple_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:blue_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:brown_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:green_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:red_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:black_glazed_terracotta"))
                .resource(NamespacedKey.parse("minecraft:white_concrete"))
                .resource(NamespacedKey.parse("minecraft:orange_concrete"))
                .resource(NamespacedKey.parse("minecraft:magenta_concrete"))
                .resource(NamespacedKey.parse("minecraft:light_blue_concrete"))
                .resource(NamespacedKey.parse("minecraft:yellow_concrete"))
                .resource(NamespacedKey.parse("minecraft:lime_concrete"))
                .resource(NamespacedKey.parse("minecraft:pink_concrete"))
                .resource(NamespacedKey.parse("minecraft:gray_concrete"))
                .resource(NamespacedKey.parse("minecraft:light_gray_concrete"))
                .resource(NamespacedKey.parse("minecraft:cyan_concrete"))
                .resource(NamespacedKey.parse("minecraft:purple_concrete"))
                .resource(NamespacedKey.parse("minecraft:blue_concrete"))
                .resource(NamespacedKey.parse("minecraft:brown_concrete"))
                .resource(NamespacedKey.parse("minecraft:green_concrete"))
                .resource(NamespacedKey.parse("minecraft:red_concrete"))
                .resource(NamespacedKey.parse("minecraft:black_concrete"))
                .resource(NamespacedKey.parse("minecraft:dead_tube_coral_block"))
                .resource(NamespacedKey.parse("minecraft:dead_brain_coral_block"))
                .resource(NamespacedKey.parse("minecraft:dead_bubble_coral_block"))
                .resource(NamespacedKey.parse("minecraft:dead_fire_coral_block"))
                .resource(NamespacedKey.parse("minecraft:dead_horn_coral_block"))
                .resource(NamespacedKey.parse("minecraft:tube_coral_block"))
                .resource(NamespacedKey.parse("minecraft:brain_coral_block"))
                .resource(NamespacedKey.parse("minecraft:bubble_coral_block"))
                .resource(NamespacedKey.parse("minecraft:fire_coral_block"))
                .resource(NamespacedKey.parse("minecraft:horn_coral_block"))
                .resource(NamespacedKey.parse("minecraft:dead_tube_coral"))
                .resource(NamespacedKey.parse("minecraft:dead_brain_coral"))
                .resource(NamespacedKey.parse("minecraft:dead_bubble_coral"))
                .resource(NamespacedKey.parse("minecraft:dead_fire_coral"))
                .resource(NamespacedKey.parse("minecraft:dead_horn_coral"))
                .resource(NamespacedKey.parse("minecraft:dead_tube_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_brain_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_bubble_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_fire_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_horn_coral_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_tube_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_brain_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_bubble_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_fire_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:dead_horn_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:polished_granite_stairs"))
                .resource(NamespacedKey.parse("minecraft:smooth_red_sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:mossy_stone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_diorite_stairs"))
                .resource(NamespacedKey.parse("minecraft:mossy_cobblestone_stairs"))
                .resource(NamespacedKey.parse("minecraft:end_stone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:stone_stairs"))
                .resource(NamespacedKey.parse("minecraft:smooth_sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:smooth_quartz_stairs"))
                .resource(NamespacedKey.parse("minecraft:granite_stairs"))
                .resource(NamespacedKey.parse("minecraft:andesite_stairs"))
                .resource(NamespacedKey.parse("minecraft:red_nether_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_andesite_stairs"))
                .resource(NamespacedKey.parse("minecraft:diorite_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_granite_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_red_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:mossy_stone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_diorite_slab"))
                .resource(NamespacedKey.parse("minecraft:mossy_cobblestone_slab"))
                .resource(NamespacedKey.parse("minecraft:end_stone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_quartz_slab"))
                .resource(NamespacedKey.parse("minecraft:granite_slab"))
                .resource(NamespacedKey.parse("minecraft:andesite_slab"))
                .resource(NamespacedKey.parse("minecraft:red_nether_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_andesite_slab"))
                .resource(NamespacedKey.parse("minecraft:diorite_slab"))
                .resource(NamespacedKey.parse("minecraft:smoker"))
                .resource(NamespacedKey.parse("minecraft:blast_furnace"))
                .resource(NamespacedKey.parse("minecraft:grindstone"))
                .resource(NamespacedKey.parse("minecraft:stonecutter"))
                .resource(NamespacedKey.parse("minecraft:bell"))
                .resource(NamespacedKey.parse("minecraft:warped_nylium"))
                .resource(NamespacedKey.parse("minecraft:crimson_nylium"))
                .resource(NamespacedKey.parse("minecraft:netherite_block"))
                .resource(NamespacedKey.parse("minecraft:ancient_debris"))
                .resource(NamespacedKey.parse("minecraft:crying_obsidian"))
                .resource(NamespacedKey.parse("minecraft:respawn_anchor"))
                .resource(NamespacedKey.parse("minecraft:lodestone"))
                .resource(NamespacedKey.parse("minecraft:blackstone"))
                .resource(NamespacedKey.parse("minecraft:blackstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:blackstone_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_bricks"))
                .resource(NamespacedKey.parse("minecraft:cracked_polished_blackstone_bricks"))
                .resource(NamespacedKey.parse("minecraft:chiseled_polished_blackstone"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:gilded_blackstone"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:chiseled_nether_bricks"))
                .resource(NamespacedKey.parse("minecraft:cracked_nether_bricks"))
                .resource(NamespacedKey.parse("minecraft:quartz_bricks"))
                .resource(NamespacedKey.parse("minecraft:tuff"))
                .resource(NamespacedKey.parse("minecraft:calcite"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper"))
                .resource(NamespacedKey.parse("minecraft:copper_block"))
                .resource(NamespacedKey.parse("minecraft:copper_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_copper_ore"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:cut_copper"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_block"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:pointed_dripstone"))
                .resource(NamespacedKey.parse("minecraft:dripstone_block"))
                .resource(NamespacedKey.parse("minecraft:deepslate"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate_stairs"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_deepslate"))
                .resource(NamespacedKey.parse("minecraft:polished_deepslate_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_deepslate_slab"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tiles"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tile_stairs"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tile_slab"))
                .resource(NamespacedKey.parse("minecraft:deepslate_bricks"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:chiseled_deepslate"))
                .resource(NamespacedKey.parse("minecraft:cracked_deepslate_bricks"))
                .resource(NamespacedKey.parse("minecraft:cracked_deepslate_tiles"))
                .resource(NamespacedKey.parse("minecraft:smooth_basalt"))
                .resource(NamespacedKey.parse("minecraft:raw_iron_block"))
                .resource(NamespacedKey.parse("minecraft:raw_copper_block"))
                .resource(NamespacedKey.parse("minecraft:raw_gold_block"))
                .resource(NamespacedKey.parse("minecraft:ice"))
                .resource(NamespacedKey.parse("minecraft:packed_ice"))
                .resource(NamespacedKey.parse("minecraft:blue_ice"))
                .resource(NamespacedKey.parse("minecraft:piston"))
                .resource(NamespacedKey.parse("minecraft:sticky_piston"))
                .resource(NamespacedKey.parse("minecraft:piston_head"))
                .resource(NamespacedKey.parse("minecraft:amethyst_cluster"))
                .resource(NamespacedKey.parse("minecraft:small_amethyst_bud"))
                .resource(NamespacedKey.parse("minecraft:medium_amethyst_bud"))
                .resource(NamespacedKey.parse("minecraft:large_amethyst_bud"))
                .resource(NamespacedKey.parse("minecraft:amethyst_block"))
                .resource(NamespacedKey.parse("minecraft:budding_amethyst"))
                .resource(NamespacedKey.parse("minecraft:infested_cobblestone"))
                .resource(NamespacedKey.parse("minecraft:infested_chiseled_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:infested_cracked_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:infested_deepslate"))
                .resource(NamespacedKey.parse("minecraft:infested_stone"))
                .resource(NamespacedKey.parse("minecraft:infested_mossy_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:infested_stone_bricks"))
                .tag(NamespacedKey.parse("minecraft:stone_buttons"))
                .tag(NamespacedKey.parse("minecraft:walls"))
                .tag(NamespacedKey.parse("minecraft:shulker_boxes"))
                .tag(NamespacedKey.parse("minecraft:anvil"))
                .tag(NamespacedKey.parse("minecraft:cauldrons"))
                .tag(NamespacedKey.parse("minecraft:rails"))
                .resource(NamespacedKey.parse("minecraft:conduit"))
                .resource(NamespacedKey.parse("minecraft:mud_bricks"))
                .resource(NamespacedKey.parse("minecraft:mud_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:mud_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:packed_mud"))
                .resource(NamespacedKey.parse("minecraft:crafter"))
                .resource(NamespacedKey.parse("minecraft:tuff_slab"))
                .resource(NamespacedKey.parse("minecraft:tuff_stairs"))
                .resource(NamespacedKey.parse("minecraft:tuff_wall"))
                .resource(NamespacedKey.parse("minecraft:chiseled_tuff"))
                .resource(NamespacedKey.parse("minecraft:polished_tuff"))
                .resource(NamespacedKey.parse("minecraft:polished_tuff_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_tuff_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_tuff_wall"))
                .resource(NamespacedKey.parse("minecraft:tuff_bricks"))
                .resource(NamespacedKey.parse("minecraft:tuff_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:tuff_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:tuff_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:chiseled_tuff_bricks"))
                .resource(NamespacedKey.parse("minecraft:chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:exposed_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:weathered_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:oxidized_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:copper_grate"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:copper_door"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_door"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_door"))
                .resource(NamespacedKey.parse("minecraft:copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:heavy_core"))
                .resource(NamespacedKey.parse("minecraft:resin_bricks"))
                .resource(NamespacedKey.parse("minecraft:resin_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:resin_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:resin_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:chiseled_resin_bricks"))
                .tag(NamespacedKey.parse("minecraft:copper_chests"))
                .tag(NamespacedKey.parse("minecraft:copper_golem_statues"))
                .tag(NamespacedKey.parse("minecraft:lightning_rods"))
                .tag(NamespacedKey.parse("minecraft:lanterns"))
                .tag(NamespacedKey.parse("minecraft:chains"))
                .tag(NamespacedKey.parse("minecraft:bars"))
                .build();

        public static final Tag<Block<?>> MINEABLE_SHOVEL = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:clay"))
                .resource(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .resource(NamespacedKey.parse("minecraft:farmland"))
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .resource(NamespacedKey.parse("minecraft:mycelium"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:dirt_path"))
                .resource(NamespacedKey.parse("minecraft:soul_soil"))
                .resource(NamespacedKey.parse("minecraft:rooted_dirt"))
                .resource(NamespacedKey.parse("minecraft:muddy_mangrove_roots"))
                .resource(NamespacedKey.parse("minecraft:mud"))
                .resource(NamespacedKey.parse("minecraft:suspicious_sand"))
                .resource(NamespacedKey.parse("minecraft:suspicious_gravel"))
                .tag(NamespacedKey.parse("minecraft:concrete_powder"))
                .build();

        public static final Tag<Block<?>> MOB_INTERACTABLE_DOORS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wooden_doors"))
                .resource(NamespacedKey.parse("minecraft:copper_door"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_door"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_door"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_door"))
                .build();

        public static final Tag<Block<?>> MOOSHROOMS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:mycelium"))
                .build();

        public static final Tag<Block<?>> MOSS_REPLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:base_stone_overworld"))
                .tag(NamespacedKey.parse("minecraft:cave_vines"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .build();

        public static final Tag<Block<?>> MUSHROOM_GROW_BLOCK = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:mycelium"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .resource(NamespacedKey.parse("minecraft:crimson_nylium"))
                .resource(NamespacedKey.parse("minecraft:warped_nylium"))
                .build();

        public static final Tag<Block<?>> NEEDS_DIAMOND_TOOL = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:obsidian"))
                .resource(NamespacedKey.parse("minecraft:crying_obsidian"))
                .resource(NamespacedKey.parse("minecraft:netherite_block"))
                .resource(NamespacedKey.parse("minecraft:respawn_anchor"))
                .resource(NamespacedKey.parse("minecraft:ancient_debris"))
                .build();

        public static final Tag<Block<?>> NEEDS_IRON_TOOL = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:diamond_block"))
                .resource(NamespacedKey.parse("minecraft:diamond_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_diamond_ore"))
                .resource(NamespacedKey.parse("minecraft:emerald_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_emerald_ore"))
                .resource(NamespacedKey.parse("minecraft:emerald_block"))
                .resource(NamespacedKey.parse("minecraft:gold_block"))
                .resource(NamespacedKey.parse("minecraft:raw_gold_block"))
                .resource(NamespacedKey.parse("minecraft:gold_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_gold_ore"))
                .resource(NamespacedKey.parse("minecraft:redstone_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_redstone_ore"))
                .build();

        public static final Tag<Block<?>> NEEDS_STONE_TOOL = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:iron_block"))
                .resource(NamespacedKey.parse("minecraft:raw_iron_block"))
                .resource(NamespacedKey.parse("minecraft:iron_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_iron_ore"))
                .resource(NamespacedKey.parse("minecraft:lapis_block"))
                .resource(NamespacedKey.parse("minecraft:lapis_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_lapis_ore"))
                .resource(NamespacedKey.parse("minecraft:copper_block"))
                .resource(NamespacedKey.parse("minecraft:raw_copper_block"))
                .resource(NamespacedKey.parse("minecraft:copper_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_copper_ore"))
                .resource(NamespacedKey.parse("minecraft:cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:cut_copper"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_block"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper"))
                .resource(NamespacedKey.parse("minecraft:crafter"))
                .resource(NamespacedKey.parse("minecraft:chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:exposed_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:weathered_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:oxidized_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_chiseled_copper"))
                .resource(NamespacedKey.parse("minecraft:copper_grate"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_grate"))
                .resource(NamespacedKey.parse("minecraft:copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_bulb"))
                .resource(NamespacedKey.parse("minecraft:copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_trapdoor"))
                .tag(NamespacedKey.parse("minecraft:copper_chests"))
                .tag(NamespacedKey.parse("minecraft:lightning_rods"))
                .build();

        public static final Tag<Block<?>> NETHER_CARVER_REPLACEABLES = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:base_stone_overworld"))
                .tag(NamespacedKey.parse("minecraft:base_stone_nether"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .tag(NamespacedKey.parse("minecraft:nylium"))
                .tag(NamespacedKey.parse("minecraft:wart_blocks"))
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:soul_soil"))
                .build();

        public static final Tag<Block<?>> NYLIUM = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:crimson_nylium"))
                .resource(NamespacedKey.parse("minecraft:warped_nylium"))
                .build();

        public static final Tag<Block<?>> OAK_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_log"))
                .resource(NamespacedKey.parse("minecraft:oak_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_oak_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_oak_wood"))
                .build();

        public static final Tag<Block<?>> OCCLUDES_VIBRATION_SIGNALS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wool"))
                .build();

        public static final Tag<Block<?>> OVERWORLD_CARVER_REPLACEABLES = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:base_stone_overworld"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .tag(NamespacedKey.parse("minecraft:sand"))
                .tag(NamespacedKey.parse("minecraft:terracotta"))
                .tag(NamespacedKey.parse("minecraft:iron_ores"))
                .tag(NamespacedKey.parse("minecraft:copper_ores"))
                .tag(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:water"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .resource(NamespacedKey.parse("minecraft:suspicious_gravel"))
                .resource(NamespacedKey.parse("minecraft:sandstone"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone"))
                .resource(NamespacedKey.parse("minecraft:calcite"))
                .resource(NamespacedKey.parse("minecraft:packed_ice"))
                .resource(NamespacedKey.parse("minecraft:raw_iron_block"))
                .resource(NamespacedKey.parse("minecraft:raw_copper_block"))
                .build();

        public static final Tag<Block<?>> OVERWORLD_NATURAL_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:acacia_log"))
                .resource(NamespacedKey.parse("minecraft:birch_log"))
                .resource(NamespacedKey.parse("minecraft:oak_log"))
                .resource(NamespacedKey.parse("minecraft:jungle_log"))
                .resource(NamespacedKey.parse("minecraft:spruce_log"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_log"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_log"))
                .resource(NamespacedKey.parse("minecraft:mangrove_log"))
                .resource(NamespacedKey.parse("minecraft:cherry_log"))
                .build();

        public static final Tag<Block<?>> PALE_OAK_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:pale_oak_log"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_pale_oak_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_pale_oak_wood"))
                .build();

        public static final Tag<Block<?>> PARROTS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:air"))
                .tag(NamespacedKey.parse("minecraft:leaves"))
                .tag(NamespacedKey.parse("minecraft:logs"))
                .build();

        public static final Tag<Block<?>> PIGLIN_REPELLENTS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:soul_fire"))
                .resource(NamespacedKey.parse("minecraft:soul_torch"))
                .resource(NamespacedKey.parse("minecraft:soul_lantern"))
                .resource(NamespacedKey.parse("minecraft:soul_wall_torch"))
                .resource(NamespacedKey.parse("minecraft:soul_campfire"))
                .build();

        public static final Tag<Block<?>> PLANKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_planks"))
                .resource(NamespacedKey.parse("minecraft:spruce_planks"))
                .resource(NamespacedKey.parse("minecraft:birch_planks"))
                .resource(NamespacedKey.parse("minecraft:jungle_planks"))
                .resource(NamespacedKey.parse("minecraft:acacia_planks"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_planks"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_planks"))
                .resource(NamespacedKey.parse("minecraft:crimson_planks"))
                .resource(NamespacedKey.parse("minecraft:warped_planks"))
                .resource(NamespacedKey.parse("minecraft:mangrove_planks"))
                .resource(NamespacedKey.parse("minecraft:bamboo_planks"))
                .resource(NamespacedKey.parse("minecraft:cherry_planks"))
                .build();

        public static final Tag<Block<?>> POLAR_BEARS_SPAWNABLE_ON_ALTERNATE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:ice"))
                .build();

        public static final Tag<Block<?>> PORTALS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:nether_portal"))
                .resource(NamespacedKey.parse("minecraft:end_portal"))
                .resource(NamespacedKey.parse("minecraft:end_gateway"))
                .build();

        public static final Tag<Block<?>> PRESSURE_PLATES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:light_weighted_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:heavy_weighted_pressure_plate"))
                .tag(NamespacedKey.parse("minecraft:wooden_pressure_plates"))
                .tag(NamespacedKey.parse("minecraft:stone_pressure_plates"))
                .build();

        public static final Tag<Block<?>> PREVENT_MOB_SPAWNING_INSIDE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:rails"))
                .build();

        public static final Tag<Block<?>> RABBITS_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .build();

        public static final Tag<Block<?>> RAILS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:rail"))
                .resource(NamespacedKey.parse("minecraft:powered_rail"))
                .resource(NamespacedKey.parse("minecraft:detector_rail"))
                .resource(NamespacedKey.parse("minecraft:activator_rail"))
                .build();

        public static final Tag<Block<?>> REDSTONE_ORES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:redstone_ore"))
                .resource(NamespacedKey.parse("minecraft:deepslate_redstone_ore"))
                .build();

        public static final Tag<Block<?>> REPLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:air"))
                .resource(NamespacedKey.parse("minecraft:water"))
                .resource(NamespacedKey.parse("minecraft:lava"))
                .resource(NamespacedKey.parse("minecraft:short_grass"))
                .resource(NamespacedKey.parse("minecraft:fern"))
                .resource(NamespacedKey.parse("minecraft:dead_bush"))
                .resource(NamespacedKey.parse("minecraft:bush"))
                .resource(NamespacedKey.parse("minecraft:short_dry_grass"))
                .resource(NamespacedKey.parse("minecraft:tall_dry_grass"))
                .resource(NamespacedKey.parse("minecraft:seagrass"))
                .resource(NamespacedKey.parse("minecraft:tall_seagrass"))
                .resource(NamespacedKey.parse("minecraft:fire"))
                .resource(NamespacedKey.parse("minecraft:soul_fire"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .resource(NamespacedKey.parse("minecraft:glow_lichen"))
                .resource(NamespacedKey.parse("minecraft:resin_clump"))
                .resource(NamespacedKey.parse("minecraft:light"))
                .resource(NamespacedKey.parse("minecraft:tall_grass"))
                .resource(NamespacedKey.parse("minecraft:large_fern"))
                .resource(NamespacedKey.parse("minecraft:structure_void"))
                .resource(NamespacedKey.parse("minecraft:void_air"))
                .resource(NamespacedKey.parse("minecraft:cave_air"))
                .resource(NamespacedKey.parse("minecraft:bubble_column"))
                .resource(NamespacedKey.parse("minecraft:warped_roots"))
                .resource(NamespacedKey.parse("minecraft:nether_sprouts"))
                .resource(NamespacedKey.parse("minecraft:crimson_roots"))
                .resource(NamespacedKey.parse("minecraft:leaf_litter"))
                .resource(NamespacedKey.parse("minecraft:hanging_roots"))
                .build();

        public static final Tag<Block<?>> REPLACEABLE_BY_MUSHROOMS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:leaves"))
                .tag(NamespacedKey.parse("minecraft:small_flowers"))
                .resource(NamespacedKey.parse("minecraft:pale_moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:short_grass"))
                .resource(NamespacedKey.parse("minecraft:fern"))
                .resource(NamespacedKey.parse("minecraft:dead_bush"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .resource(NamespacedKey.parse("minecraft:glow_lichen"))
                .resource(NamespacedKey.parse("minecraft:sunflower"))
                .resource(NamespacedKey.parse("minecraft:lilac"))
                .resource(NamespacedKey.parse("minecraft:rose_bush"))
                .resource(NamespacedKey.parse("minecraft:peony"))
                .resource(NamespacedKey.parse("minecraft:tall_grass"))
                .resource(NamespacedKey.parse("minecraft:large_fern"))
                .resource(NamespacedKey.parse("minecraft:hanging_roots"))
                .resource(NamespacedKey.parse("minecraft:pitcher_plant"))
                .resource(NamespacedKey.parse("minecraft:water"))
                .resource(NamespacedKey.parse("minecraft:seagrass"))
                .resource(NamespacedKey.parse("minecraft:tall_seagrass"))
                .resource(NamespacedKey.parse("minecraft:brown_mushroom"))
                .resource(NamespacedKey.parse("minecraft:red_mushroom"))
                .resource(NamespacedKey.parse("minecraft:brown_mushroom_block"))
                .resource(NamespacedKey.parse("minecraft:red_mushroom_block"))
                .resource(NamespacedKey.parse("minecraft:warped_roots"))
                .resource(NamespacedKey.parse("minecraft:nether_sprouts"))
                .resource(NamespacedKey.parse("minecraft:crimson_roots"))
                .resource(NamespacedKey.parse("minecraft:leaf_litter"))
                .resource(NamespacedKey.parse("minecraft:short_dry_grass"))
                .resource(NamespacedKey.parse("minecraft:tall_dry_grass"))
                .resource(NamespacedKey.parse("minecraft:bush"))
                .resource(NamespacedKey.parse("minecraft:firefly_bush"))
                .build();

        public static final Tag<Block<?>> REPLACEABLE_BY_TREES = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:leaves"))
                .tag(NamespacedKey.parse("minecraft:small_flowers"))
                .resource(NamespacedKey.parse("minecraft:pale_moss_carpet"))
                .resource(NamespacedKey.parse("minecraft:short_grass"))
                .resource(NamespacedKey.parse("minecraft:fern"))
                .resource(NamespacedKey.parse("minecraft:dead_bush"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .resource(NamespacedKey.parse("minecraft:glow_lichen"))
                .resource(NamespacedKey.parse("minecraft:sunflower"))
                .resource(NamespacedKey.parse("minecraft:lilac"))
                .resource(NamespacedKey.parse("minecraft:rose_bush"))
                .resource(NamespacedKey.parse("minecraft:peony"))
                .resource(NamespacedKey.parse("minecraft:tall_grass"))
                .resource(NamespacedKey.parse("minecraft:large_fern"))
                .resource(NamespacedKey.parse("minecraft:hanging_roots"))
                .resource(NamespacedKey.parse("minecraft:pitcher_plant"))
                .resource(NamespacedKey.parse("minecraft:water"))
                .resource(NamespacedKey.parse("minecraft:seagrass"))
                .resource(NamespacedKey.parse("minecraft:tall_seagrass"))
                .resource(NamespacedKey.parse("minecraft:bush"))
                .resource(NamespacedKey.parse("minecraft:firefly_bush"))
                .resource(NamespacedKey.parse("minecraft:warped_roots"))
                .resource(NamespacedKey.parse("minecraft:nether_sprouts"))
                .resource(NamespacedKey.parse("minecraft:crimson_roots"))
                .resource(NamespacedKey.parse("minecraft:leaf_litter"))
                .resource(NamespacedKey.parse("minecraft:short_dry_grass"))
                .resource(NamespacedKey.parse("minecraft:tall_dry_grass"))
                .build();

        public static final Tag<Block<?>> SAND = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .resource(NamespacedKey.parse("minecraft:suspicious_sand"))
                .build();

        public static final Tag<Block<?>> SAPLINGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_sapling"))
                .resource(NamespacedKey.parse("minecraft:spruce_sapling"))
                .resource(NamespacedKey.parse("minecraft:birch_sapling"))
                .resource(NamespacedKey.parse("minecraft:jungle_sapling"))
                .resource(NamespacedKey.parse("minecraft:acacia_sapling"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_sapling"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_sapling"))
                .resource(NamespacedKey.parse("minecraft:azalea"))
                .resource(NamespacedKey.parse("minecraft:flowering_azalea"))
                .resource(NamespacedKey.parse("minecraft:mangrove_propagule"))
                .resource(NamespacedKey.parse("minecraft:cherry_sapling"))
                .build();

        public static final Tag<Block<?>> SCULK_REPLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:base_stone_overworld"))
                .tag(NamespacedKey.parse("minecraft:dirt"))
                .tag(NamespacedKey.parse("minecraft:terracotta"))
                .tag(NamespacedKey.parse("minecraft:nylium"))
                .tag(NamespacedKey.parse("minecraft:base_stone_nether"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:soul_soil"))
                .resource(NamespacedKey.parse("minecraft:calcite"))
                .resource(NamespacedKey.parse("minecraft:smooth_basalt"))
                .resource(NamespacedKey.parse("minecraft:clay"))
                .resource(NamespacedKey.parse("minecraft:dripstone_block"))
                .resource(NamespacedKey.parse("minecraft:end_stone"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone"))
                .resource(NamespacedKey.parse("minecraft:sandstone"))
                .build();

        public static final Tag<Block<?>> SCULK_REPLACEABLE_WORLD_GEN = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:sculk_replaceable"))
                .resource(NamespacedKey.parse("minecraft:deepslate_bricks"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tiles"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate"))
                .resource(NamespacedKey.parse("minecraft:cracked_deepslate_bricks"))
                .resource(NamespacedKey.parse("minecraft:cracked_deepslate_tiles"))
                .resource(NamespacedKey.parse("minecraft:polished_deepslate"))
                .build();

        public static final Tag<Block<?>> SHULKER_BOXES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:shulker_box"))
                .resource(NamespacedKey.parse("minecraft:black_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:blue_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:brown_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:cyan_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:gray_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:green_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:light_blue_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:light_gray_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:lime_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:magenta_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:orange_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:pink_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:purple_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:red_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:white_shulker_box"))
                .resource(NamespacedKey.parse("minecraft:yellow_shulker_box"))
                .build();

        public static final Tag<Block<?>> SIGNS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:standing_signs"))
                .tag(NamespacedKey.parse("minecraft:wall_signs"))
                .build();

        public static final Tag<Block<?>> SLABS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wooden_slabs"))
                .resource(NamespacedKey.parse("minecraft:bamboo_mosaic_slab"))
                .resource(NamespacedKey.parse("minecraft:stone_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_stone_slab"))
                .resource(NamespacedKey.parse("minecraft:stone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:purpur_slab"))
                .resource(NamespacedKey.parse("minecraft:quartz_slab"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:brick_slab"))
                .resource(NamespacedKey.parse("minecraft:cobblestone_slab"))
                .resource(NamespacedKey.parse("minecraft:nether_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:petrified_oak_slab"))
                .resource(NamespacedKey.parse("minecraft:prismarine_slab"))
                .resource(NamespacedKey.parse("minecraft:prismarine_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:dark_prismarine_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_granite_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_red_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:mossy_stone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_diorite_slab"))
                .resource(NamespacedKey.parse("minecraft:mossy_cobblestone_slab"))
                .resource(NamespacedKey.parse("minecraft:end_stone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:smooth_quartz_slab"))
                .resource(NamespacedKey.parse("minecraft:granite_slab"))
                .resource(NamespacedKey.parse("minecraft:andesite_slab"))
                .resource(NamespacedKey.parse("minecraft:red_nether_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_andesite_slab"))
                .resource(NamespacedKey.parse("minecraft:diorite_slab"))
                .resource(NamespacedKey.parse("minecraft:cut_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:cut_red_sandstone_slab"))
                .resource(NamespacedKey.parse("minecraft:blackstone_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_slab"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_deepslate_slab"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tile_slab"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_slab"))
                .resource(NamespacedKey.parse("minecraft:mud_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:tuff_slab"))
                .resource(NamespacedKey.parse("minecraft:polished_tuff_slab"))
                .resource(NamespacedKey.parse("minecraft:tuff_brick_slab"))
                .resource(NamespacedKey.parse("minecraft:resin_brick_slab"))
                .build();

        public static final Tag<Block<?>> SMALL_DRIPLEAF_PLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:clay"))
                .resource(NamespacedKey.parse("minecraft:moss_block"))
                .build();

        public static final Tag<Block<?>> SMALL_FLOWERS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:dandelion"))
                .resource(NamespacedKey.parse("minecraft:open_eyeblossom"))
                .resource(NamespacedKey.parse("minecraft:poppy"))
                .resource(NamespacedKey.parse("minecraft:blue_orchid"))
                .resource(NamespacedKey.parse("minecraft:allium"))
                .resource(NamespacedKey.parse("minecraft:azure_bluet"))
                .resource(NamespacedKey.parse("minecraft:red_tulip"))
                .resource(NamespacedKey.parse("minecraft:orange_tulip"))
                .resource(NamespacedKey.parse("minecraft:white_tulip"))
                .resource(NamespacedKey.parse("minecraft:pink_tulip"))
                .resource(NamespacedKey.parse("minecraft:oxeye_daisy"))
                .resource(NamespacedKey.parse("minecraft:cornflower"))
                .resource(NamespacedKey.parse("minecraft:lily_of_the_valley"))
                .resource(NamespacedKey.parse("minecraft:wither_rose"))
                .resource(NamespacedKey.parse("minecraft:torchflower"))
                .resource(NamespacedKey.parse("minecraft:closed_eyeblossom"))
                .build();

        public static final Tag<Block<?>> SMELTS_TO_GLASS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .build();

        public static final Tag<Block<?>> SNAPS_GOAT_HORN = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:overworld_natural_logs"))
                .resource(NamespacedKey.parse("minecraft:stone"))
                .resource(NamespacedKey.parse("minecraft:packed_ice"))
                .resource(NamespacedKey.parse("minecraft:iron_ore"))
                .resource(NamespacedKey.parse("minecraft:coal_ore"))
                .resource(NamespacedKey.parse("minecraft:copper_ore"))
                .resource(NamespacedKey.parse("minecraft:emerald_ore"))
                .build();

        public static final Tag<Block<?>> SNIFFER_DIGGABLE_BLOCK = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:dirt"))
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .resource(NamespacedKey.parse("minecraft:rooted_dirt"))
                .resource(NamespacedKey.parse("minecraft:moss_block"))
                .resource(NamespacedKey.parse("minecraft:pale_moss_block"))
                .resource(NamespacedKey.parse("minecraft:mud"))
                .resource(NamespacedKey.parse("minecraft:muddy_mangrove_roots"))
                .build();

        public static final Tag<Block<?>> SNIFFER_EGG_HATCH_BOOST = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:moss_block"))
                .build();

        public static final Tag<Block<?>> SNOW = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:powder_snow"))
                .build();

        public static final Tag<Block<?>> SNOW_LAYER_CAN_SURVIVE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:honey_block"))
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:mud"))
                .build();

        public static final Tag<Block<?>> SNOW_LAYER_CANNOT_SURVIVE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:ice"))
                .resource(NamespacedKey.parse("minecraft:packed_ice"))
                .resource(NamespacedKey.parse("minecraft:barrier"))
                .build();

        public static final Tag<Block<?>> SOUL_FIRE_BASE_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:soul_soil"))
                .build();

        public static final Tag<Block<?>> SOUL_SPEED_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:soul_soil"))
                .build();

        public static final Tag<Block<?>> SPRUCE_LOGS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:spruce_log"))
                .resource(NamespacedKey.parse("minecraft:spruce_wood"))
                .resource(NamespacedKey.parse("minecraft:stripped_spruce_log"))
                .resource(NamespacedKey.parse("minecraft:stripped_spruce_wood"))
                .build();

        public static final Tag<Block<?>> STAIRS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wooden_stairs"))
                .resource(NamespacedKey.parse("minecraft:bamboo_mosaic_stairs"))
                .resource(NamespacedKey.parse("minecraft:cobblestone_stairs"))
                .resource(NamespacedKey.parse("minecraft:sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:nether_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:stone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:purpur_stairs"))
                .resource(NamespacedKey.parse("minecraft:quartz_stairs"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:prismarine_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:prismarine_stairs"))
                .resource(NamespacedKey.parse("minecraft:dark_prismarine_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_granite_stairs"))
                .resource(NamespacedKey.parse("minecraft:smooth_red_sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:mossy_stone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_diorite_stairs"))
                .resource(NamespacedKey.parse("minecraft:mossy_cobblestone_stairs"))
                .resource(NamespacedKey.parse("minecraft:end_stone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:stone_stairs"))
                .resource(NamespacedKey.parse("minecraft:smooth_sandstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:smooth_quartz_stairs"))
                .resource(NamespacedKey.parse("minecraft:granite_stairs"))
                .resource(NamespacedKey.parse("minecraft:andesite_stairs"))
                .resource(NamespacedKey.parse("minecraft:red_nether_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_andesite_stairs"))
                .resource(NamespacedKey.parse("minecraft:diorite_stairs"))
                .resource(NamespacedKey.parse("minecraft:blackstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_stairs"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_deepslate_stairs"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tile_stairs"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:oxidized_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:weathered_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:exposed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_stairs"))
                .resource(NamespacedKey.parse("minecraft:mud_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:tuff_stairs"))
                .resource(NamespacedKey.parse("minecraft:polished_tuff_stairs"))
                .resource(NamespacedKey.parse("minecraft:tuff_brick_stairs"))
                .resource(NamespacedKey.parse("minecraft:resin_brick_stairs"))
                .build();

        public static final Tag<Block<?>> STANDING_SIGNS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_sign"))
                .resource(NamespacedKey.parse("minecraft:spruce_sign"))
                .resource(NamespacedKey.parse("minecraft:birch_sign"))
                .resource(NamespacedKey.parse("minecraft:acacia_sign"))
                .resource(NamespacedKey.parse("minecraft:jungle_sign"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_sign"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_sign"))
                .resource(NamespacedKey.parse("minecraft:crimson_sign"))
                .resource(NamespacedKey.parse("minecraft:warped_sign"))
                .resource(NamespacedKey.parse("minecraft:mangrove_sign"))
                .resource(NamespacedKey.parse("minecraft:bamboo_sign"))
                .resource(NamespacedKey.parse("minecraft:cherry_sign"))
                .build();

        public static final Tag<Block<?>> STONE_BRICKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:mossy_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:cracked_stone_bricks"))
                .resource(NamespacedKey.parse("minecraft:chiseled_stone_bricks"))
                .build();

        public static final Tag<Block<?>> STONE_BUTTONS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:stone_button"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_button"))
                .build();

        public static final Tag<Block<?>> STONE_ORE_REPLACEABLES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:stone"))
                .resource(NamespacedKey.parse("minecraft:granite"))
                .resource(NamespacedKey.parse("minecraft:diorite"))
                .resource(NamespacedKey.parse("minecraft:andesite"))
                .build();

        public static final Tag<Block<?>> STONE_PRESSURE_PLATES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:stone_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_pressure_plate"))
                .build();

        public static final Tag<Block<?>> STRIDER_WARM_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:lava"))
                .build();

        public static final Tag<Block<?>> SWORD_EFFICIENT = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:leaves"))
                .resource(NamespacedKey.parse("minecraft:vine"))
                .resource(NamespacedKey.parse("minecraft:glow_lichen"))
                .resource(NamespacedKey.parse("minecraft:pumpkin"))
                .resource(NamespacedKey.parse("minecraft:carved_pumpkin"))
                .resource(NamespacedKey.parse("minecraft:jack_o_lantern"))
                .resource(NamespacedKey.parse("minecraft:melon"))
                .resource(NamespacedKey.parse("minecraft:cocoa"))
                .resource(NamespacedKey.parse("minecraft:big_dripleaf"))
                .resource(NamespacedKey.parse("minecraft:big_dripleaf_stem"))
                .resource(NamespacedKey.parse("minecraft:chorus_plant"))
                .resource(NamespacedKey.parse("minecraft:chorus_flower"))
                .build();

        public static final Tag<Block<?>> SWORD_INSTANTLY_MINES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:bamboo"))
                .resource(NamespacedKey.parse("minecraft:bamboo_sapling"))
                .build();

        public static final Tag<Block<?>> TERRACOTTA = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:terracotta"))
                .resource(NamespacedKey.parse("minecraft:white_terracotta"))
                .resource(NamespacedKey.parse("minecraft:orange_terracotta"))
                .resource(NamespacedKey.parse("minecraft:magenta_terracotta"))
                .resource(NamespacedKey.parse("minecraft:light_blue_terracotta"))
                .resource(NamespacedKey.parse("minecraft:yellow_terracotta"))
                .resource(NamespacedKey.parse("minecraft:lime_terracotta"))
                .resource(NamespacedKey.parse("minecraft:pink_terracotta"))
                .resource(NamespacedKey.parse("minecraft:gray_terracotta"))
                .resource(NamespacedKey.parse("minecraft:light_gray_terracotta"))
                .resource(NamespacedKey.parse("minecraft:cyan_terracotta"))
                .resource(NamespacedKey.parse("minecraft:purple_terracotta"))
                .resource(NamespacedKey.parse("minecraft:blue_terracotta"))
                .resource(NamespacedKey.parse("minecraft:brown_terracotta"))
                .resource(NamespacedKey.parse("minecraft:green_terracotta"))
                .resource(NamespacedKey.parse("minecraft:red_terracotta"))
                .resource(NamespacedKey.parse("minecraft:black_terracotta"))
                .build();

        public static final Tag<Block<?>> TRAIL_RUINS_REPLACEABLE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:gravel"))
                .build();

        public static final Tag<Block<?>> TRAPDOORS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:wooden_trapdoors"))
                .resource(NamespacedKey.parse("minecraft:iron_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:exposed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:weathered_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:oxidized_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_exposed_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_weathered_copper_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:waxed_oxidized_copper_trapdoor"))
                .build();

        public static final Tag<Block<?>> TRIGGERS_AMBIENT_DESERT_DRY_VEGETATION_BLOCK_SOUNDS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:terracotta"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .build();

        public static final Tag<Block<?>> TRIGGERS_AMBIENT_DESERT_SAND_BLOCK_SOUNDS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
                .build();

        public static final Tag<Block<?>> TRIGGERS_AMBIENT_DRIED_GHAST_BLOCK_SOUNDS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:soul_soil"))
                .build();

        public static final Tag<Block<?>> UNDERWATER_BONEMEALS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:seagrass"))
                .tag(NamespacedKey.parse("minecraft:corals"))
                .tag(NamespacedKey.parse("minecraft:wall_corals"))
                .build();

        public static final Tag<Block<?>> UNSTABLE_BOTTOM_CENTER = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:fence_gates"))
                .build();

        public static final Tag<Block<?>> VALID_SPAWN = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .build();

        public static final Tag<Block<?>> VIBRATION_RESONATORS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:amethyst_block"))
                .build();

        public static final Tag<Block<?>> WALL_CORALS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:tube_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:brain_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:bubble_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:fire_coral_wall_fan"))
                .resource(NamespacedKey.parse("minecraft:horn_coral_wall_fan"))
                .build();

        public static final Tag<Block<?>> WALL_HANGING_SIGNS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:spruce_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:birch_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:acacia_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:cherry_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:jungle_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:crimson_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:warped_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:mangrove_wall_hanging_sign"))
                .resource(NamespacedKey.parse("minecraft:bamboo_wall_hanging_sign"))
                .build();

        public static final Tag<Block<?>> WALL_POST_OVERRIDE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:torch"))
                .resource(NamespacedKey.parse("minecraft:soul_torch"))
                .resource(NamespacedKey.parse("minecraft:redstone_torch"))
                .resource(NamespacedKey.parse("minecraft:copper_torch"))
                .resource(NamespacedKey.parse("minecraft:tripwire"))
                .tag(NamespacedKey.parse("minecraft:signs"))
                .tag(NamespacedKey.parse("minecraft:banners"))
                .tag(NamespacedKey.parse("minecraft:pressure_plates"))
                .resource(NamespacedKey.parse("minecraft:cactus_flower"))
                .build();

        public static final Tag<Block<?>> WALL_SIGNS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:spruce_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:birch_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:acacia_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:jungle_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:crimson_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:warped_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:mangrove_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:bamboo_wall_sign"))
                .resource(NamespacedKey.parse("minecraft:cherry_wall_sign"))
                .build();

        public static final Tag<Block<?>> WALLS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:cobblestone_wall"))
                .resource(NamespacedKey.parse("minecraft:mossy_cobblestone_wall"))
                .resource(NamespacedKey.parse("minecraft:brick_wall"))
                .resource(NamespacedKey.parse("minecraft:prismarine_wall"))
                .resource(NamespacedKey.parse("minecraft:red_sandstone_wall"))
                .resource(NamespacedKey.parse("minecraft:mossy_stone_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:granite_wall"))
                .resource(NamespacedKey.parse("minecraft:stone_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:nether_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:andesite_wall"))
                .resource(NamespacedKey.parse("minecraft:red_nether_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:sandstone_wall"))
                .resource(NamespacedKey.parse("minecraft:end_stone_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:diorite_wall"))
                .resource(NamespacedKey.parse("minecraft:blackstone_wall"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:polished_blackstone_wall"))
                .resource(NamespacedKey.parse("minecraft:cobbled_deepslate_wall"))
                .resource(NamespacedKey.parse("minecraft:polished_deepslate_wall"))
                .resource(NamespacedKey.parse("minecraft:deepslate_tile_wall"))
                .resource(NamespacedKey.parse("minecraft:deepslate_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:mud_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:tuff_wall"))
                .resource(NamespacedKey.parse("minecraft:polished_tuff_wall"))
                .resource(NamespacedKey.parse("minecraft:tuff_brick_wall"))
                .resource(NamespacedKey.parse("minecraft:resin_brick_wall"))
                .build();

        public static final Tag<Block<?>> WARPED_STEMS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:warped_stem"))
                .resource(NamespacedKey.parse("minecraft:stripped_warped_stem"))
                .resource(NamespacedKey.parse("minecraft:warped_hyphae"))
                .resource(NamespacedKey.parse("minecraft:stripped_warped_hyphae"))
                .build();

        public static final Tag<Block<?>> WART_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:nether_wart_block"))
                .resource(NamespacedKey.parse("minecraft:warped_wart_block"))
                .build();

        public static final Tag<Block<?>> WITHER_IMMUNE = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:barrier"))
                .resource(NamespacedKey.parse("minecraft:bedrock"))
                .resource(NamespacedKey.parse("minecraft:end_portal"))
                .resource(NamespacedKey.parse("minecraft:end_portal_frame"))
                .resource(NamespacedKey.parse("minecraft:end_gateway"))
                .resource(NamespacedKey.parse("minecraft:command_block"))
                .resource(NamespacedKey.parse("minecraft:repeating_command_block"))
                .resource(NamespacedKey.parse("minecraft:chain_command_block"))
                .resource(NamespacedKey.parse("minecraft:structure_block"))
                .resource(NamespacedKey.parse("minecraft:jigsaw"))
                .resource(NamespacedKey.parse("minecraft:moving_piston"))
                .resource(NamespacedKey.parse("minecraft:light"))
                .resource(NamespacedKey.parse("minecraft:reinforced_deepslate"))
                .resource(NamespacedKey.parse("minecraft:test_block"))
                .resource(NamespacedKey.parse("minecraft:test_instance_block"))
                .build();

        public static final Tag<Block<?>> WITHER_SUMMON_BASE_BLOCKS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:soul_sand"))
                .resource(NamespacedKey.parse("minecraft:soul_soil"))
                .build();

        public static final Tag<Block<?>> WOLVES_SPAWNABLE_ON = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:grass_block"))
                .resource(NamespacedKey.parse("minecraft:snow"))
                .resource(NamespacedKey.parse("minecraft:snow_block"))
                .resource(NamespacedKey.parse("minecraft:coarse_dirt"))
                .resource(NamespacedKey.parse("minecraft:podzol"))
                .build();

        public static final Tag<Block<?>> WOODEN_BUTTONS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_button"))
                .resource(NamespacedKey.parse("minecraft:spruce_button"))
                .resource(NamespacedKey.parse("minecraft:birch_button"))
                .resource(NamespacedKey.parse("minecraft:jungle_button"))
                .resource(NamespacedKey.parse("minecraft:acacia_button"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_button"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_button"))
                .resource(NamespacedKey.parse("minecraft:crimson_button"))
                .resource(NamespacedKey.parse("minecraft:warped_button"))
                .resource(NamespacedKey.parse("minecraft:mangrove_button"))
                .resource(NamespacedKey.parse("minecraft:bamboo_button"))
                .resource(NamespacedKey.parse("minecraft:cherry_button"))
                .build();

        public static final Tag<Block<?>> WOODEN_DOORS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_door"))
                .resource(NamespacedKey.parse("minecraft:spruce_door"))
                .resource(NamespacedKey.parse("minecraft:birch_door"))
                .resource(NamespacedKey.parse("minecraft:jungle_door"))
                .resource(NamespacedKey.parse("minecraft:acacia_door"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_door"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_door"))
                .resource(NamespacedKey.parse("minecraft:crimson_door"))
                .resource(NamespacedKey.parse("minecraft:warped_door"))
                .resource(NamespacedKey.parse("minecraft:mangrove_door"))
                .resource(NamespacedKey.parse("minecraft:bamboo_door"))
                .resource(NamespacedKey.parse("minecraft:cherry_door"))
                .build();

        public static final Tag<Block<?>> WOODEN_FENCES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_fence"))
                .resource(NamespacedKey.parse("minecraft:acacia_fence"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_fence"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_fence"))
                .resource(NamespacedKey.parse("minecraft:spruce_fence"))
                .resource(NamespacedKey.parse("minecraft:birch_fence"))
                .resource(NamespacedKey.parse("minecraft:jungle_fence"))
                .resource(NamespacedKey.parse("minecraft:crimson_fence"))
                .resource(NamespacedKey.parse("minecraft:warped_fence"))
                .resource(NamespacedKey.parse("minecraft:mangrove_fence"))
                .resource(NamespacedKey.parse("minecraft:bamboo_fence"))
                .resource(NamespacedKey.parse("minecraft:cherry_fence"))
                .build();

        public static final Tag<Block<?>> WOODEN_PRESSURE_PLATES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:spruce_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:birch_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:jungle_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:acacia_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:crimson_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:warped_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:mangrove_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:bamboo_pressure_plate"))
                .resource(NamespacedKey.parse("minecraft:cherry_pressure_plate"))
                .build();

        public static final Tag<Block<?>> WOODEN_SHELVES = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:acacia_shelf"))
                .resource(NamespacedKey.parse("minecraft:bamboo_shelf"))
                .resource(NamespacedKey.parse("minecraft:birch_shelf"))
                .resource(NamespacedKey.parse("minecraft:cherry_shelf"))
                .resource(NamespacedKey.parse("minecraft:crimson_shelf"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_shelf"))
                .resource(NamespacedKey.parse("minecraft:jungle_shelf"))
                .resource(NamespacedKey.parse("minecraft:mangrove_shelf"))
                .resource(NamespacedKey.parse("minecraft:oak_shelf"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_shelf"))
                .resource(NamespacedKey.parse("minecraft:spruce_shelf"))
                .resource(NamespacedKey.parse("minecraft:warped_shelf"))
                .build();

        public static final Tag<Block<?>> WOODEN_SLABS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_slab"))
                .resource(NamespacedKey.parse("minecraft:spruce_slab"))
                .resource(NamespacedKey.parse("minecraft:birch_slab"))
                .resource(NamespacedKey.parse("minecraft:jungle_slab"))
                .resource(NamespacedKey.parse("minecraft:acacia_slab"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_slab"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_slab"))
                .resource(NamespacedKey.parse("minecraft:crimson_slab"))
                .resource(NamespacedKey.parse("minecraft:warped_slab"))
                .resource(NamespacedKey.parse("minecraft:mangrove_slab"))
                .resource(NamespacedKey.parse("minecraft:bamboo_slab"))
                .resource(NamespacedKey.parse("minecraft:cherry_slab"))
                .build();

        public static final Tag<Block<?>> WOODEN_STAIRS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:oak_stairs"))
                .resource(NamespacedKey.parse("minecraft:spruce_stairs"))
                .resource(NamespacedKey.parse("minecraft:birch_stairs"))
                .resource(NamespacedKey.parse("minecraft:jungle_stairs"))
                .resource(NamespacedKey.parse("minecraft:acacia_stairs"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_stairs"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_stairs"))
                .resource(NamespacedKey.parse("minecraft:crimson_stairs"))
                .resource(NamespacedKey.parse("minecraft:warped_stairs"))
                .resource(NamespacedKey.parse("minecraft:mangrove_stairs"))
                .resource(NamespacedKey.parse("minecraft:bamboo_stairs"))
                .resource(NamespacedKey.parse("minecraft:cherry_stairs"))
                .build();

        public static final Tag<Block<?>> WOODEN_TRAPDOORS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:acacia_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:birch_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:dark_oak_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:pale_oak_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:jungle_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:oak_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:spruce_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:crimson_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:warped_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:mangrove_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:bamboo_trapdoor"))
                .resource(NamespacedKey.parse("minecraft:cherry_trapdoor"))
                .build();

        public static final Tag<Block<?>> WOOL = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:white_wool"))
                .resource(NamespacedKey.parse("minecraft:orange_wool"))
                .resource(NamespacedKey.parse("minecraft:magenta_wool"))
                .resource(NamespacedKey.parse("minecraft:light_blue_wool"))
                .resource(NamespacedKey.parse("minecraft:yellow_wool"))
                .resource(NamespacedKey.parse("minecraft:lime_wool"))
                .resource(NamespacedKey.parse("minecraft:pink_wool"))
                .resource(NamespacedKey.parse("minecraft:gray_wool"))
                .resource(NamespacedKey.parse("minecraft:light_gray_wool"))
                .resource(NamespacedKey.parse("minecraft:cyan_wool"))
                .resource(NamespacedKey.parse("minecraft:purple_wool"))
                .resource(NamespacedKey.parse("minecraft:blue_wool"))
                .resource(NamespacedKey.parse("minecraft:brown_wool"))
                .resource(NamespacedKey.parse("minecraft:green_wool"))
                .resource(NamespacedKey.parse("minecraft:red_wool"))
                .resource(NamespacedKey.parse("minecraft:black_wool"))
                .build();

        public static final Tag<Block<?>> WOOL_CARPETS = Tag.builder(RegistryKey.BLOCK)
                .resource(NamespacedKey.parse("minecraft:white_carpet"))
                .resource(NamespacedKey.parse("minecraft:orange_carpet"))
                .resource(NamespacedKey.parse("minecraft:magenta_carpet"))
                .resource(NamespacedKey.parse("minecraft:light_blue_carpet"))
                .resource(NamespacedKey.parse("minecraft:yellow_carpet"))
                .resource(NamespacedKey.parse("minecraft:lime_carpet"))
                .resource(NamespacedKey.parse("minecraft:pink_carpet"))
                .resource(NamespacedKey.parse("minecraft:gray_carpet"))
                .resource(NamespacedKey.parse("minecraft:light_gray_carpet"))
                .resource(NamespacedKey.parse("minecraft:cyan_carpet"))
                .resource(NamespacedKey.parse("minecraft:purple_carpet"))
                .resource(NamespacedKey.parse("minecraft:blue_carpet"))
                .resource(NamespacedKey.parse("minecraft:brown_carpet"))
                .resource(NamespacedKey.parse("minecraft:green_carpet"))
                .resource(NamespacedKey.parse("minecraft:red_carpet"))
                .resource(NamespacedKey.parse("minecraft:black_carpet"))
                .build();

        private Tags() {
        }
    }
}
