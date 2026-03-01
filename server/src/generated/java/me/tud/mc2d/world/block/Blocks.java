package me.tud.mc2d.world.block;

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
import me.tud.mc2d.world.blockdata.WeatheringCopperBulbData;
import me.tud.mc2d.world.blockdata.WeatheringCopperDoorData;
import me.tud.mc2d.world.blockdata.WeatheringCopperGrateData;
import me.tud.mc2d.world.blockdata.WeatheringCopperSlabData;
import me.tud.mc2d.world.blockdata.WeatheringCopperStairData;
import me.tud.mc2d.world.blockdata.WeatheringCopperTrapDoorData;
import me.tud.mc2d.world.blockdata.WeepingVinesData;
import me.tud.mc2d.world.blockdata.WeightedPressurePlateData;
import me.tud.mc2d.world.blockdata.WitherSkullData;
import me.tud.mc2d.world.blockdata.WitherWallSkullData;

/**
 * This class contains autogenerated code. Please do <b>NOT</b> edit manually.
 */
@Generated("me.tud.mc2d.generators.blocks.BlocksGenerator")
sealed class Blocks permits Block {
    public static final Block<BlockData> AIR = new Block<>(0, NamespacedKey.parse("minecraft:air"), () -> new BlockData(0), Item.AIR);

    public static final Block<BlockData> STONE = new Block<>(1, NamespacedKey.parse("minecraft:stone"), () -> new BlockData(1), Item.STONE);

    public static final Block<BlockData> GRANITE = new Block<>(2, NamespacedKey.parse("minecraft:granite"), () -> new BlockData(2), Item.GRANITE);

    public static final Block<BlockData> POLISHED_GRANITE = new Block<>(3, NamespacedKey.parse("minecraft:polished_granite"), () -> new BlockData(3), Item.POLISHED_GRANITE);

    public static final Block<BlockData> DIORITE = new Block<>(4, NamespacedKey.parse("minecraft:diorite"), () -> new BlockData(4), Item.DIORITE);

    public static final Block<BlockData> POLISHED_DIORITE = new Block<>(5, NamespacedKey.parse("minecraft:polished_diorite"), () -> new BlockData(5), Item.POLISHED_DIORITE);

    public static final Block<BlockData> ANDESITE = new Block<>(6, NamespacedKey.parse("minecraft:andesite"), () -> new BlockData(6), Item.ANDESITE);

    public static final Block<BlockData> POLISHED_ANDESITE = new Block<>(7, NamespacedKey.parse("minecraft:polished_andesite"), () -> new BlockData(7), Item.POLISHED_ANDESITE);

    public static final Block<GrassData> GRASS_BLOCK = new Block<>(8, NamespacedKey.parse("minecraft:grass_block"), () -> new GrassData(8), Item.GRASS_BLOCK);

    public static final Block<BlockData> DIRT = new Block<>(9, NamespacedKey.parse("minecraft:dirt"), () -> new BlockData(10), Item.DIRT);

    public static final Block<BlockData> COARSE_DIRT = new Block<>(10, NamespacedKey.parse("minecraft:coarse_dirt"), () -> new BlockData(11), Item.COARSE_DIRT);

    public static final Block<SnowyDirtData> PODZOL = new Block<>(11, NamespacedKey.parse("minecraft:podzol"), () -> new SnowyDirtData(12), Item.PODZOL);

    public static final Block<BlockData> COBBLESTONE = new Block<>(12, NamespacedKey.parse("minecraft:cobblestone"), () -> new BlockData(14), Item.COBBLESTONE);

    public static final Block<BlockData> OAK_PLANKS = new Block<>(13, NamespacedKey.parse("minecraft:oak_planks"), () -> new BlockData(15), Item.OAK_PLANKS);

    public static final Block<BlockData> SPRUCE_PLANKS = new Block<>(14, NamespacedKey.parse("minecraft:spruce_planks"), () -> new BlockData(16), Item.SPRUCE_PLANKS);

    public static final Block<BlockData> BIRCH_PLANKS = new Block<>(15, NamespacedKey.parse("minecraft:birch_planks"), () -> new BlockData(17), Item.BIRCH_PLANKS);

    public static final Block<BlockData> JUNGLE_PLANKS = new Block<>(16, NamespacedKey.parse("minecraft:jungle_planks"), () -> new BlockData(18), Item.JUNGLE_PLANKS);

    public static final Block<BlockData> ACACIA_PLANKS = new Block<>(17, NamespacedKey.parse("minecraft:acacia_planks"), () -> new BlockData(19), Item.ACACIA_PLANKS);

    public static final Block<BlockData> CHERRY_PLANKS = new Block<>(18, NamespacedKey.parse("minecraft:cherry_planks"), () -> new BlockData(20), Item.CHERRY_PLANKS);

    public static final Block<BlockData> DARK_OAK_PLANKS = new Block<>(19, NamespacedKey.parse("minecraft:dark_oak_planks"), () -> new BlockData(21), Item.DARK_OAK_PLANKS);

    public static final Block<RotatedPillarData> PALE_OAK_WOOD = new Block<>(20, NamespacedKey.parse("minecraft:pale_oak_wood"), () -> new RotatedPillarData(22), Item.PALE_OAK_WOOD);

    public static final Block<BlockData> PALE_OAK_PLANKS = new Block<>(21, NamespacedKey.parse("minecraft:pale_oak_planks"), () -> new BlockData(25), Item.PALE_OAK_PLANKS);

    public static final Block<BlockData> MANGROVE_PLANKS = new Block<>(22, NamespacedKey.parse("minecraft:mangrove_planks"), () -> new BlockData(26), Item.MANGROVE_PLANKS);

    public static final Block<BlockData> BAMBOO_PLANKS = new Block<>(23, NamespacedKey.parse("minecraft:bamboo_planks"), () -> new BlockData(27), Item.BAMBOO_PLANKS);

    public static final Block<BlockData> BAMBOO_MOSAIC = new Block<>(24, NamespacedKey.parse("minecraft:bamboo_mosaic"), () -> new BlockData(28), Item.BAMBOO_MOSAIC);

    public static final Block<SaplingData> OAK_SAPLING = new Block<>(25, NamespacedKey.parse("minecraft:oak_sapling"), () -> new SaplingData(29), Item.OAK_SAPLING);

    public static final Block<SaplingData> SPRUCE_SAPLING = new Block<>(26, NamespacedKey.parse("minecraft:spruce_sapling"), () -> new SaplingData(31), Item.SPRUCE_SAPLING);

    public static final Block<SaplingData> BIRCH_SAPLING = new Block<>(27, NamespacedKey.parse("minecraft:birch_sapling"), () -> new SaplingData(33), Item.BIRCH_SAPLING);

    public static final Block<SaplingData> JUNGLE_SAPLING = new Block<>(28, NamespacedKey.parse("minecraft:jungle_sapling"), () -> new SaplingData(35), Item.JUNGLE_SAPLING);

    public static final Block<SaplingData> ACACIA_SAPLING = new Block<>(29, NamespacedKey.parse("minecraft:acacia_sapling"), () -> new SaplingData(37), Item.ACACIA_SAPLING);

    public static final Block<SaplingData> CHERRY_SAPLING = new Block<>(30, NamespacedKey.parse("minecraft:cherry_sapling"), () -> new SaplingData(39), Item.CHERRY_SAPLING);

    public static final Block<SaplingData> DARK_OAK_SAPLING = new Block<>(31, NamespacedKey.parse("minecraft:dark_oak_sapling"), () -> new SaplingData(41), Item.DARK_OAK_SAPLING);

    public static final Block<SaplingData> PALE_OAK_SAPLING = new Block<>(32, NamespacedKey.parse("minecraft:pale_oak_sapling"), () -> new SaplingData(43), Item.PALE_OAK_SAPLING);

    public static final Block<MangrovePropaguleData> MANGROVE_PROPAGULE = new Block<>(33, NamespacedKey.parse("minecraft:mangrove_propagule"), () -> new MangrovePropaguleData(45), Item.MANGROVE_PROPAGULE);

    public static final Block<BlockData> BEDROCK = new Block<>(34, NamespacedKey.parse("minecraft:bedrock"), () -> new BlockData(85), Item.BEDROCK);

    public static final Block<LiquidData> WATER = new Block<>(35, NamespacedKey.parse("minecraft:water"), () -> new LiquidData(86), null);

    public static final Block<LiquidData> LAVA = new Block<>(36, NamespacedKey.parse("minecraft:lava"), () -> new LiquidData(102), null);

    public static final Block<BlockData> SAND = new Block<>(37, NamespacedKey.parse("minecraft:sand"), () -> new BlockData(118), Item.SAND);

    public static final Block<BrushableData> SUSPICIOUS_SAND = new Block<>(38, NamespacedKey.parse("minecraft:suspicious_sand"), () -> new BrushableData(119), Item.SUSPICIOUS_SAND);

    public static final Block<BlockData> RED_SAND = new Block<>(39, NamespacedKey.parse("minecraft:red_sand"), () -> new BlockData(123), Item.RED_SAND);

    public static final Block<BlockData> GRAVEL = new Block<>(40, NamespacedKey.parse("minecraft:gravel"), () -> new BlockData(124), Item.GRAVEL);

    public static final Block<BrushableData> SUSPICIOUS_GRAVEL = new Block<>(41, NamespacedKey.parse("minecraft:suspicious_gravel"), () -> new BrushableData(125), Item.SUSPICIOUS_GRAVEL);

    public static final Block<BlockData> GOLD_ORE = new Block<>(42, NamespacedKey.parse("minecraft:gold_ore"), () -> new BlockData(129), Item.GOLD_ORE);

    public static final Block<BlockData> DEEPSLATE_GOLD_ORE = new Block<>(43, NamespacedKey.parse("minecraft:deepslate_gold_ore"), () -> new BlockData(130), Item.DEEPSLATE_GOLD_ORE);

    public static final Block<BlockData> IRON_ORE = new Block<>(44, NamespacedKey.parse("minecraft:iron_ore"), () -> new BlockData(131), Item.IRON_ORE);

    public static final Block<BlockData> DEEPSLATE_IRON_ORE = new Block<>(45, NamespacedKey.parse("minecraft:deepslate_iron_ore"), () -> new BlockData(132), Item.DEEPSLATE_IRON_ORE);

    public static final Block<BlockData> COAL_ORE = new Block<>(46, NamespacedKey.parse("minecraft:coal_ore"), () -> new BlockData(133), Item.COAL_ORE);

    public static final Block<BlockData> DEEPSLATE_COAL_ORE = new Block<>(47, NamespacedKey.parse("minecraft:deepslate_coal_ore"), () -> new BlockData(134), Item.DEEPSLATE_COAL_ORE);

    public static final Block<BlockData> NETHER_GOLD_ORE = new Block<>(48, NamespacedKey.parse("minecraft:nether_gold_ore"), () -> new BlockData(135), Item.NETHER_GOLD_ORE);

    public static final Block<RotatedPillarData> OAK_LOG = new Block<>(49, NamespacedKey.parse("minecraft:oak_log"), () -> new RotatedPillarData(136), Item.OAK_LOG);

    public static final Block<RotatedPillarData> SPRUCE_LOG = new Block<>(50, NamespacedKey.parse("minecraft:spruce_log"), () -> new RotatedPillarData(139), Item.SPRUCE_LOG);

    public static final Block<RotatedPillarData> BIRCH_LOG = new Block<>(51, NamespacedKey.parse("minecraft:birch_log"), () -> new RotatedPillarData(142), Item.BIRCH_LOG);

    public static final Block<RotatedPillarData> JUNGLE_LOG = new Block<>(52, NamespacedKey.parse("minecraft:jungle_log"), () -> new RotatedPillarData(145), Item.JUNGLE_LOG);

    public static final Block<RotatedPillarData> ACACIA_LOG = new Block<>(53, NamespacedKey.parse("minecraft:acacia_log"), () -> new RotatedPillarData(148), Item.ACACIA_LOG);

    public static final Block<RotatedPillarData> CHERRY_LOG = new Block<>(54, NamespacedKey.parse("minecraft:cherry_log"), () -> new RotatedPillarData(151), Item.CHERRY_LOG);

    public static final Block<RotatedPillarData> DARK_OAK_LOG = new Block<>(55, NamespacedKey.parse("minecraft:dark_oak_log"), () -> new RotatedPillarData(154), Item.DARK_OAK_LOG);

    public static final Block<RotatedPillarData> PALE_OAK_LOG = new Block<>(56, NamespacedKey.parse("minecraft:pale_oak_log"), () -> new RotatedPillarData(157), Item.PALE_OAK_LOG);

    public static final Block<RotatedPillarData> MANGROVE_LOG = new Block<>(57, NamespacedKey.parse("minecraft:mangrove_log"), () -> new RotatedPillarData(160), Item.MANGROVE_LOG);

    public static final Block<MangroveRootsData> MANGROVE_ROOTS = new Block<>(58, NamespacedKey.parse("minecraft:mangrove_roots"), () -> new MangroveRootsData(163), Item.MANGROVE_ROOTS);

    public static final Block<RotatedPillarData> MUDDY_MANGROVE_ROOTS = new Block<>(59, NamespacedKey.parse("minecraft:muddy_mangrove_roots"), () -> new RotatedPillarData(165), Item.MUDDY_MANGROVE_ROOTS);

    public static final Block<RotatedPillarData> BAMBOO_BLOCK = new Block<>(60, NamespacedKey.parse("minecraft:bamboo_block"), () -> new RotatedPillarData(168), Item.BAMBOO_BLOCK);

    public static final Block<RotatedPillarData> STRIPPED_SPRUCE_LOG = new Block<>(61, NamespacedKey.parse("minecraft:stripped_spruce_log"), () -> new RotatedPillarData(171), Item.STRIPPED_SPRUCE_LOG);

    public static final Block<RotatedPillarData> STRIPPED_BIRCH_LOG = new Block<>(62, NamespacedKey.parse("minecraft:stripped_birch_log"), () -> new RotatedPillarData(174), Item.STRIPPED_BIRCH_LOG);

    public static final Block<RotatedPillarData> STRIPPED_JUNGLE_LOG = new Block<>(63, NamespacedKey.parse("minecraft:stripped_jungle_log"), () -> new RotatedPillarData(177), Item.STRIPPED_JUNGLE_LOG);

    public static final Block<RotatedPillarData> STRIPPED_ACACIA_LOG = new Block<>(64, NamespacedKey.parse("minecraft:stripped_acacia_log"), () -> new RotatedPillarData(180), Item.STRIPPED_ACACIA_LOG);

    public static final Block<RotatedPillarData> STRIPPED_CHERRY_LOG = new Block<>(65, NamespacedKey.parse("minecraft:stripped_cherry_log"), () -> new RotatedPillarData(183), Item.STRIPPED_CHERRY_LOG);

    public static final Block<RotatedPillarData> STRIPPED_DARK_OAK_LOG = new Block<>(66, NamespacedKey.parse("minecraft:stripped_dark_oak_log"), () -> new RotatedPillarData(186), Item.STRIPPED_DARK_OAK_LOG);

    public static final Block<RotatedPillarData> STRIPPED_PALE_OAK_LOG = new Block<>(67, NamespacedKey.parse("minecraft:stripped_pale_oak_log"), () -> new RotatedPillarData(189), Item.STRIPPED_PALE_OAK_LOG);

    public static final Block<RotatedPillarData> STRIPPED_OAK_LOG = new Block<>(68, NamespacedKey.parse("minecraft:stripped_oak_log"), () -> new RotatedPillarData(192), Item.STRIPPED_OAK_LOG);

    public static final Block<RotatedPillarData> STRIPPED_MANGROVE_LOG = new Block<>(69, NamespacedKey.parse("minecraft:stripped_mangrove_log"), () -> new RotatedPillarData(195), Item.STRIPPED_MANGROVE_LOG);

    public static final Block<RotatedPillarData> STRIPPED_BAMBOO_BLOCK = new Block<>(70, NamespacedKey.parse("minecraft:stripped_bamboo_block"), () -> new RotatedPillarData(198), Item.STRIPPED_BAMBOO_BLOCK);

    public static final Block<RotatedPillarData> OAK_WOOD = new Block<>(71, NamespacedKey.parse("minecraft:oak_wood"), () -> new RotatedPillarData(201), Item.OAK_WOOD);

    public static final Block<RotatedPillarData> SPRUCE_WOOD = new Block<>(72, NamespacedKey.parse("minecraft:spruce_wood"), () -> new RotatedPillarData(204), Item.SPRUCE_WOOD);

    public static final Block<RotatedPillarData> BIRCH_WOOD = new Block<>(73, NamespacedKey.parse("minecraft:birch_wood"), () -> new RotatedPillarData(207), Item.BIRCH_WOOD);

    public static final Block<RotatedPillarData> JUNGLE_WOOD = new Block<>(74, NamespacedKey.parse("minecraft:jungle_wood"), () -> new RotatedPillarData(210), Item.JUNGLE_WOOD);

    public static final Block<RotatedPillarData> ACACIA_WOOD = new Block<>(75, NamespacedKey.parse("minecraft:acacia_wood"), () -> new RotatedPillarData(213), Item.ACACIA_WOOD);

    public static final Block<RotatedPillarData> CHERRY_WOOD = new Block<>(76, NamespacedKey.parse("minecraft:cherry_wood"), () -> new RotatedPillarData(216), Item.CHERRY_WOOD);

    public static final Block<RotatedPillarData> DARK_OAK_WOOD = new Block<>(77, NamespacedKey.parse("minecraft:dark_oak_wood"), () -> new RotatedPillarData(219), Item.DARK_OAK_WOOD);

    public static final Block<RotatedPillarData> MANGROVE_WOOD = new Block<>(78, NamespacedKey.parse("minecraft:mangrove_wood"), () -> new RotatedPillarData(222), Item.MANGROVE_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_OAK_WOOD = new Block<>(79, NamespacedKey.parse("minecraft:stripped_oak_wood"), () -> new RotatedPillarData(225), Item.STRIPPED_OAK_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_SPRUCE_WOOD = new Block<>(80, NamespacedKey.parse("minecraft:stripped_spruce_wood"), () -> new RotatedPillarData(228), Item.STRIPPED_SPRUCE_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_BIRCH_WOOD = new Block<>(81, NamespacedKey.parse("minecraft:stripped_birch_wood"), () -> new RotatedPillarData(231), Item.STRIPPED_BIRCH_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_JUNGLE_WOOD = new Block<>(82, NamespacedKey.parse("minecraft:stripped_jungle_wood"), () -> new RotatedPillarData(234), Item.STRIPPED_JUNGLE_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_ACACIA_WOOD = new Block<>(83, NamespacedKey.parse("minecraft:stripped_acacia_wood"), () -> new RotatedPillarData(237), Item.STRIPPED_ACACIA_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_CHERRY_WOOD = new Block<>(84, NamespacedKey.parse("minecraft:stripped_cherry_wood"), () -> new RotatedPillarData(240), Item.STRIPPED_CHERRY_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_DARK_OAK_WOOD = new Block<>(85, NamespacedKey.parse("minecraft:stripped_dark_oak_wood"), () -> new RotatedPillarData(243), Item.STRIPPED_DARK_OAK_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_PALE_OAK_WOOD = new Block<>(86, NamespacedKey.parse("minecraft:stripped_pale_oak_wood"), () -> new RotatedPillarData(246), Item.STRIPPED_PALE_OAK_WOOD);

    public static final Block<RotatedPillarData> STRIPPED_MANGROVE_WOOD = new Block<>(87, NamespacedKey.parse("minecraft:stripped_mangrove_wood"), () -> new RotatedPillarData(249), Item.STRIPPED_MANGROVE_WOOD);

    public static final Block<TintedParticleLeavesData> OAK_LEAVES = new Block<>(88, NamespacedKey.parse("minecraft:oak_leaves"), () -> new TintedParticleLeavesData(252), Item.OAK_LEAVES);

    public static final Block<TintedParticleLeavesData> SPRUCE_LEAVES = new Block<>(89, NamespacedKey.parse("minecraft:spruce_leaves"), () -> new TintedParticleLeavesData(280), Item.SPRUCE_LEAVES);

    public static final Block<TintedParticleLeavesData> BIRCH_LEAVES = new Block<>(90, NamespacedKey.parse("minecraft:birch_leaves"), () -> new TintedParticleLeavesData(308), Item.BIRCH_LEAVES);

    public static final Block<TintedParticleLeavesData> JUNGLE_LEAVES = new Block<>(91, NamespacedKey.parse("minecraft:jungle_leaves"), () -> new TintedParticleLeavesData(336), Item.JUNGLE_LEAVES);

    public static final Block<TintedParticleLeavesData> ACACIA_LEAVES = new Block<>(92, NamespacedKey.parse("minecraft:acacia_leaves"), () -> new TintedParticleLeavesData(364), Item.ACACIA_LEAVES);

    public static final Block<UntintedParticleLeavesData> CHERRY_LEAVES = new Block<>(93, NamespacedKey.parse("minecraft:cherry_leaves"), () -> new UntintedParticleLeavesData(392), Item.CHERRY_LEAVES);

    public static final Block<TintedParticleLeavesData> DARK_OAK_LEAVES = new Block<>(94, NamespacedKey.parse("minecraft:dark_oak_leaves"), () -> new TintedParticleLeavesData(420), Item.DARK_OAK_LEAVES);

    public static final Block<UntintedParticleLeavesData> PALE_OAK_LEAVES = new Block<>(95, NamespacedKey.parse("minecraft:pale_oak_leaves"), () -> new UntintedParticleLeavesData(448), Item.PALE_OAK_LEAVES);

    public static final Block<MangroveLeavesData> MANGROVE_LEAVES = new Block<>(96, NamespacedKey.parse("minecraft:mangrove_leaves"), () -> new MangroveLeavesData(476), Item.MANGROVE_LEAVES);

    public static final Block<UntintedParticleLeavesData> AZALEA_LEAVES = new Block<>(97, NamespacedKey.parse("minecraft:azalea_leaves"), () -> new UntintedParticleLeavesData(504), Item.AZALEA_LEAVES);

    public static final Block<UntintedParticleLeavesData> FLOWERING_AZALEA_LEAVES = new Block<>(98, NamespacedKey.parse("minecraft:flowering_azalea_leaves"), () -> new UntintedParticleLeavesData(532), Item.FLOWERING_AZALEA_LEAVES);

    public static final Block<BlockData> SPONGE = new Block<>(99, NamespacedKey.parse("minecraft:sponge"), () -> new BlockData(560), Item.SPONGE);

    public static final Block<BlockData> WET_SPONGE = new Block<>(100, NamespacedKey.parse("minecraft:wet_sponge"), () -> new BlockData(561), Item.WET_SPONGE);

    public static final Block<BlockData> GLASS = new Block<>(101, NamespacedKey.parse("minecraft:glass"), () -> new BlockData(562), Item.GLASS);

    public static final Block<BlockData> LAPIS_ORE = new Block<>(102, NamespacedKey.parse("minecraft:lapis_ore"), () -> new BlockData(563), Item.LAPIS_ORE);

    public static final Block<BlockData> DEEPSLATE_LAPIS_ORE = new Block<>(103, NamespacedKey.parse("minecraft:deepslate_lapis_ore"), () -> new BlockData(564), Item.DEEPSLATE_LAPIS_ORE);

    public static final Block<BlockData> LAPIS_BLOCK = new Block<>(104, NamespacedKey.parse("minecraft:lapis_block"), () -> new BlockData(565), Item.LAPIS_BLOCK);

    public static final Block<DispenserData> DISPENSER = new Block<>(105, NamespacedKey.parse("minecraft:dispenser"), () -> new DispenserData(566), Item.DISPENSER);

    public static final Block<BlockData> SANDSTONE = new Block<>(106, NamespacedKey.parse("minecraft:sandstone"), () -> new BlockData(578), Item.SANDSTONE);

    public static final Block<BlockData> CHISELED_SANDSTONE = new Block<>(107, NamespacedKey.parse("minecraft:chiseled_sandstone"), () -> new BlockData(579), Item.CHISELED_SANDSTONE);

    public static final Block<BlockData> CUT_SANDSTONE = new Block<>(108, NamespacedKey.parse("minecraft:cut_sandstone"), () -> new BlockData(580), Item.CUT_SANDSTONE);

    public static final Block<NoteData> NOTE_BLOCK = new Block<>(109, NamespacedKey.parse("minecraft:note_block"), () -> new NoteData(581), Item.NOTE_BLOCK);

    public static final Block<BedData> WHITE_BED = new Block<>(110, NamespacedKey.parse("minecraft:white_bed"), () -> new BedData(1731), Item.WHITE_BED);

    public static final Block<BedData> ORANGE_BED = new Block<>(111, NamespacedKey.parse("minecraft:orange_bed"), () -> new BedData(1747), Item.ORANGE_BED);

    public static final Block<BedData> MAGENTA_BED = new Block<>(112, NamespacedKey.parse("minecraft:magenta_bed"), () -> new BedData(1763), Item.MAGENTA_BED);

    public static final Block<BedData> LIGHT_BLUE_BED = new Block<>(113, NamespacedKey.parse("minecraft:light_blue_bed"), () -> new BedData(1779), Item.LIGHT_BLUE_BED);

    public static final Block<BedData> YELLOW_BED = new Block<>(114, NamespacedKey.parse("minecraft:yellow_bed"), () -> new BedData(1795), Item.YELLOW_BED);

    public static final Block<BedData> LIME_BED = new Block<>(115, NamespacedKey.parse("minecraft:lime_bed"), () -> new BedData(1811), Item.LIME_BED);

    public static final Block<BedData> PINK_BED = new Block<>(116, NamespacedKey.parse("minecraft:pink_bed"), () -> new BedData(1827), Item.PINK_BED);

    public static final Block<BedData> GRAY_BED = new Block<>(117, NamespacedKey.parse("minecraft:gray_bed"), () -> new BedData(1843), Item.GRAY_BED);

    public static final Block<BedData> LIGHT_GRAY_BED = new Block<>(118, NamespacedKey.parse("minecraft:light_gray_bed"), () -> new BedData(1859), Item.LIGHT_GRAY_BED);

    public static final Block<BedData> CYAN_BED = new Block<>(119, NamespacedKey.parse("minecraft:cyan_bed"), () -> new BedData(1875), Item.CYAN_BED);

    public static final Block<BedData> PURPLE_BED = new Block<>(120, NamespacedKey.parse("minecraft:purple_bed"), () -> new BedData(1891), Item.PURPLE_BED);

    public static final Block<BedData> BLUE_BED = new Block<>(121, NamespacedKey.parse("minecraft:blue_bed"), () -> new BedData(1907), Item.BLUE_BED);

    public static final Block<BedData> BROWN_BED = new Block<>(122, NamespacedKey.parse("minecraft:brown_bed"), () -> new BedData(1923), Item.BROWN_BED);

    public static final Block<BedData> GREEN_BED = new Block<>(123, NamespacedKey.parse("minecraft:green_bed"), () -> new BedData(1939), Item.GREEN_BED);

    public static final Block<BedData> RED_BED = new Block<>(124, NamespacedKey.parse("minecraft:red_bed"), () -> new BedData(1955), Item.RED_BED);

    public static final Block<BedData> BLACK_BED = new Block<>(125, NamespacedKey.parse("minecraft:black_bed"), () -> new BedData(1971), Item.BLACK_BED);

    public static final Block<PoweredRailData> POWERED_RAIL = new Block<>(126, NamespacedKey.parse("minecraft:powered_rail"), () -> new PoweredRailData(1987), Item.POWERED_RAIL);

    public static final Block<DetectorRailData> DETECTOR_RAIL = new Block<>(127, NamespacedKey.parse("minecraft:detector_rail"), () -> new DetectorRailData(2011), Item.DETECTOR_RAIL);

    public static final Block<PistonBaseData> STICKY_PISTON = new Block<>(128, NamespacedKey.parse("minecraft:sticky_piston"), () -> new PistonBaseData(2035), Item.STICKY_PISTON);

    public static final Block<BlockData> COBWEB = new Block<>(129, NamespacedKey.parse("minecraft:cobweb"), () -> new BlockData(2047), Item.COBWEB);

    public static final Block<BlockData> SHORT_GRASS = new Block<>(130, NamespacedKey.parse("minecraft:short_grass"), () -> new BlockData(2048), Item.SHORT_GRASS);

    public static final Block<BlockData> FERN = new Block<>(131, NamespacedKey.parse("minecraft:fern"), () -> new BlockData(2049), Item.FERN);

    public static final Block<BlockData> DEAD_BUSH = new Block<>(132, NamespacedKey.parse("minecraft:dead_bush"), () -> new BlockData(2050), Item.DEAD_BUSH);

    public static final Block<BlockData> BUSH = new Block<>(133, NamespacedKey.parse("minecraft:bush"), () -> new BlockData(2051), Item.BUSH);

    public static final Block<BlockData> SHORT_DRY_GRASS = new Block<>(134, NamespacedKey.parse("minecraft:short_dry_grass"), () -> new BlockData(2052), Item.SHORT_DRY_GRASS);

    public static final Block<BlockData> TALL_DRY_GRASS = new Block<>(135, NamespacedKey.parse("minecraft:tall_dry_grass"), () -> new BlockData(2053), Item.TALL_DRY_GRASS);

    public static final Block<BlockData> SEAGRASS = new Block<>(136, NamespacedKey.parse("minecraft:seagrass"), () -> new BlockData(2054), Item.SEAGRASS);

    public static final Block<TallSeagrassData> TALL_SEAGRASS = new Block<>(137, NamespacedKey.parse("minecraft:tall_seagrass"), () -> new TallSeagrassData(2055), null);

    public static final Block<PistonBaseData> PISTON = new Block<>(138, NamespacedKey.parse("minecraft:piston"), () -> new PistonBaseData(2057), Item.PISTON);

    public static final Block<PistonHeadData> PISTON_HEAD = new Block<>(139, NamespacedKey.parse("minecraft:piston_head"), () -> new PistonHeadData(2069), null);

    public static final Block<BlockData> WHITE_WOOL = new Block<>(140, NamespacedKey.parse("minecraft:white_wool"), () -> new BlockData(2093), Item.WHITE_WOOL);

    public static final Block<BlockData> ORANGE_WOOL = new Block<>(141, NamespacedKey.parse("minecraft:orange_wool"), () -> new BlockData(2094), Item.ORANGE_WOOL);

    public static final Block<BlockData> MAGENTA_WOOL = new Block<>(142, NamespacedKey.parse("minecraft:magenta_wool"), () -> new BlockData(2095), Item.MAGENTA_WOOL);

    public static final Block<BlockData> LIGHT_BLUE_WOOL = new Block<>(143, NamespacedKey.parse("minecraft:light_blue_wool"), () -> new BlockData(2096), Item.LIGHT_BLUE_WOOL);

    public static final Block<BlockData> YELLOW_WOOL = new Block<>(144, NamespacedKey.parse("minecraft:yellow_wool"), () -> new BlockData(2097), Item.YELLOW_WOOL);

    public static final Block<BlockData> LIME_WOOL = new Block<>(145, NamespacedKey.parse("minecraft:lime_wool"), () -> new BlockData(2098), Item.LIME_WOOL);

    public static final Block<BlockData> PINK_WOOL = new Block<>(146, NamespacedKey.parse("minecraft:pink_wool"), () -> new BlockData(2099), Item.PINK_WOOL);

    public static final Block<BlockData> GRAY_WOOL = new Block<>(147, NamespacedKey.parse("minecraft:gray_wool"), () -> new BlockData(2100), Item.GRAY_WOOL);

    public static final Block<BlockData> LIGHT_GRAY_WOOL = new Block<>(148, NamespacedKey.parse("minecraft:light_gray_wool"), () -> new BlockData(2101), Item.LIGHT_GRAY_WOOL);

    public static final Block<BlockData> CYAN_WOOL = new Block<>(149, NamespacedKey.parse("minecraft:cyan_wool"), () -> new BlockData(2102), Item.CYAN_WOOL);

    public static final Block<BlockData> PURPLE_WOOL = new Block<>(150, NamespacedKey.parse("minecraft:purple_wool"), () -> new BlockData(2103), Item.PURPLE_WOOL);

    public static final Block<BlockData> BLUE_WOOL = new Block<>(151, NamespacedKey.parse("minecraft:blue_wool"), () -> new BlockData(2104), Item.BLUE_WOOL);

    public static final Block<BlockData> BROWN_WOOL = new Block<>(152, NamespacedKey.parse("minecraft:brown_wool"), () -> new BlockData(2105), Item.BROWN_WOOL);

    public static final Block<BlockData> GREEN_WOOL = new Block<>(153, NamespacedKey.parse("minecraft:green_wool"), () -> new BlockData(2106), Item.GREEN_WOOL);

    public static final Block<BlockData> RED_WOOL = new Block<>(154, NamespacedKey.parse("minecraft:red_wool"), () -> new BlockData(2107), Item.RED_WOOL);

    public static final Block<BlockData> BLACK_WOOL = new Block<>(155, NamespacedKey.parse("minecraft:black_wool"), () -> new BlockData(2108), Item.BLACK_WOOL);

    public static final Block<MovingPistonData> MOVING_PISTON = new Block<>(156, NamespacedKey.parse("minecraft:moving_piston"), () -> new MovingPistonData(2109), null);

    public static final Block<BlockData> DANDELION = new Block<>(157, NamespacedKey.parse("minecraft:dandelion"), () -> new BlockData(2121), Item.DANDELION);

    public static final Block<BlockData> TORCHFLOWER = new Block<>(158, NamespacedKey.parse("minecraft:torchflower"), () -> new BlockData(2122), Item.TORCHFLOWER);

    public static final Block<BlockData> POPPY = new Block<>(159, NamespacedKey.parse("minecraft:poppy"), () -> new BlockData(2123), Item.POPPY);

    public static final Block<BlockData> BLUE_ORCHID = new Block<>(160, NamespacedKey.parse("minecraft:blue_orchid"), () -> new BlockData(2124), Item.BLUE_ORCHID);

    public static final Block<BlockData> ALLIUM = new Block<>(161, NamespacedKey.parse("minecraft:allium"), () -> new BlockData(2125), Item.ALLIUM);

    public static final Block<BlockData> AZURE_BLUET = new Block<>(162, NamespacedKey.parse("minecraft:azure_bluet"), () -> new BlockData(2126), Item.AZURE_BLUET);

    public static final Block<BlockData> RED_TULIP = new Block<>(163, NamespacedKey.parse("minecraft:red_tulip"), () -> new BlockData(2127), Item.RED_TULIP);

    public static final Block<BlockData> ORANGE_TULIP = new Block<>(164, NamespacedKey.parse("minecraft:orange_tulip"), () -> new BlockData(2128), Item.ORANGE_TULIP);

    public static final Block<BlockData> WHITE_TULIP = new Block<>(165, NamespacedKey.parse("minecraft:white_tulip"), () -> new BlockData(2129), Item.WHITE_TULIP);

    public static final Block<BlockData> PINK_TULIP = new Block<>(166, NamespacedKey.parse("minecraft:pink_tulip"), () -> new BlockData(2130), Item.PINK_TULIP);

    public static final Block<BlockData> OXEYE_DAISY = new Block<>(167, NamespacedKey.parse("minecraft:oxeye_daisy"), () -> new BlockData(2131), Item.OXEYE_DAISY);

    public static final Block<BlockData> CORNFLOWER = new Block<>(168, NamespacedKey.parse("minecraft:cornflower"), () -> new BlockData(2132), Item.CORNFLOWER);

    public static final Block<BlockData> WITHER_ROSE = new Block<>(169, NamespacedKey.parse("minecraft:wither_rose"), () -> new BlockData(2133), Item.WITHER_ROSE);

    public static final Block<BlockData> LILY_OF_THE_VALLEY = new Block<>(170, NamespacedKey.parse("minecraft:lily_of_the_valley"), () -> new BlockData(2134), Item.LILY_OF_THE_VALLEY);

    public static final Block<BlockData> BROWN_MUSHROOM = new Block<>(171, NamespacedKey.parse("minecraft:brown_mushroom"), () -> new BlockData(2135), Item.BROWN_MUSHROOM);

    public static final Block<BlockData> RED_MUSHROOM = new Block<>(172, NamespacedKey.parse("minecraft:red_mushroom"), () -> new BlockData(2136), Item.RED_MUSHROOM);

    public static final Block<BlockData> GOLD_BLOCK = new Block<>(173, NamespacedKey.parse("minecraft:gold_block"), () -> new BlockData(2137), Item.GOLD_BLOCK);

    public static final Block<BlockData> IRON_BLOCK = new Block<>(174, NamespacedKey.parse("minecraft:iron_block"), () -> new BlockData(2138), Item.IRON_BLOCK);

    public static final Block<BlockData> BRICKS = new Block<>(175, NamespacedKey.parse("minecraft:bricks"), () -> new BlockData(2139), Item.BRICKS);

    public static final Block<TntData> TNT = new Block<>(176, NamespacedKey.parse("minecraft:tnt"), () -> new TntData(2140), Item.TNT);

    public static final Block<BlockData> BOOKSHELF = new Block<>(177, NamespacedKey.parse("minecraft:bookshelf"), () -> new BlockData(2142), Item.BOOKSHELF);

    public static final Block<ChiseledBookShelfData> CHISELED_BOOKSHELF = new Block<>(178, NamespacedKey.parse("minecraft:chiseled_bookshelf"), () -> new ChiseledBookShelfData(2143), Item.CHISELED_BOOKSHELF);

    public static final Block<BlockData> MOSSY_COBBLESTONE = new Block<>(179, NamespacedKey.parse("minecraft:mossy_cobblestone"), () -> new BlockData(2399), Item.MOSSY_COBBLESTONE);

    public static final Block<BlockData> OBSIDIAN = new Block<>(180, NamespacedKey.parse("minecraft:obsidian"), () -> new BlockData(2400), Item.OBSIDIAN);

    public static final Block<BlockData> TORCH = new Block<>(181, NamespacedKey.parse("minecraft:torch"), () -> new BlockData(2401), Item.TORCH);

    public static final Block<WallTorchData> WALL_TORCH = new Block<>(182, NamespacedKey.parse("minecraft:wall_torch"), () -> new WallTorchData(2402), null);

    public static final Block<FireData> FIRE = new Block<>(183, NamespacedKey.parse("minecraft:fire"), () -> new FireData(2406), null);

    public static final Block<BlockData> SOUL_FIRE = new Block<>(184, NamespacedKey.parse("minecraft:soul_fire"), () -> new BlockData(2918), null);

    public static final Block<BlockData> SPAWNER = new Block<>(185, NamespacedKey.parse("minecraft:spawner"), () -> new BlockData(2919), Item.SPAWNER);

    public static final Block<CreakingHeartData> CREAKING_HEART = new Block<>(186, NamespacedKey.parse("minecraft:creaking_heart"), () -> new CreakingHeartData(2920), Item.CREAKING_HEART);

    public static final Block<StairData> OAK_STAIRS = new Block<>(187, NamespacedKey.parse("minecraft:oak_stairs"), () -> new StairData(2938), Item.OAK_STAIRS);

    public static final Block<ChestData> CHEST = new Block<>(188, NamespacedKey.parse("minecraft:chest"), () -> new ChestData(3018), Item.CHEST);

    public static final Block<RedstoneWireData> REDSTONE_WIRE = new Block<>(189, NamespacedKey.parse("minecraft:redstone_wire"), () -> new RedstoneWireData(3042), null);

    public static final Block<BlockData> DIAMOND_ORE = new Block<>(190, NamespacedKey.parse("minecraft:diamond_ore"), () -> new BlockData(4338), Item.DIAMOND_ORE);

    public static final Block<BlockData> DEEPSLATE_DIAMOND_ORE = new Block<>(191, NamespacedKey.parse("minecraft:deepslate_diamond_ore"), () -> new BlockData(4339), Item.DEEPSLATE_DIAMOND_ORE);

    public static final Block<BlockData> DIAMOND_BLOCK = new Block<>(192, NamespacedKey.parse("minecraft:diamond_block"), () -> new BlockData(4340), Item.DIAMOND_BLOCK);

    public static final Block<BlockData> CRAFTING_TABLE = new Block<>(193, NamespacedKey.parse("minecraft:crafting_table"), () -> new BlockData(4341), Item.CRAFTING_TABLE);

    public static final Block<CropData> WHEAT = new Block<>(194, NamespacedKey.parse("minecraft:wheat"), () -> new CropData(4342), Item.WHEAT);

    public static final Block<FarmData> FARMLAND = new Block<>(195, NamespacedKey.parse("minecraft:farmland"), () -> new FarmData(4350), Item.FARMLAND);

    public static final Block<FurnaceData> FURNACE = new Block<>(196, NamespacedKey.parse("minecraft:furnace"), () -> new FurnaceData(4358), Item.FURNACE);

    public static final Block<StandingSignData> OAK_SIGN = new Block<>(197, NamespacedKey.parse("minecraft:oak_sign"), () -> new StandingSignData(4366), Item.OAK_SIGN);

    public static final Block<StandingSignData> SPRUCE_SIGN = new Block<>(198, NamespacedKey.parse("minecraft:spruce_sign"), () -> new StandingSignData(4398), Item.SPRUCE_SIGN);

    public static final Block<StandingSignData> BIRCH_SIGN = new Block<>(199, NamespacedKey.parse("minecraft:birch_sign"), () -> new StandingSignData(4430), Item.BIRCH_SIGN);

    public static final Block<StandingSignData> ACACIA_SIGN = new Block<>(200, NamespacedKey.parse("minecraft:acacia_sign"), () -> new StandingSignData(4462), Item.ACACIA_SIGN);

    public static final Block<StandingSignData> CHERRY_SIGN = new Block<>(201, NamespacedKey.parse("minecraft:cherry_sign"), () -> new StandingSignData(4494), Item.CHERRY_SIGN);

    public static final Block<StandingSignData> JUNGLE_SIGN = new Block<>(202, NamespacedKey.parse("minecraft:jungle_sign"), () -> new StandingSignData(4526), Item.JUNGLE_SIGN);

    public static final Block<StandingSignData> DARK_OAK_SIGN = new Block<>(203, NamespacedKey.parse("minecraft:dark_oak_sign"), () -> new StandingSignData(4558), Item.DARK_OAK_SIGN);

    public static final Block<StandingSignData> PALE_OAK_SIGN = new Block<>(204, NamespacedKey.parse("minecraft:pale_oak_sign"), () -> new StandingSignData(4590), Item.PALE_OAK_SIGN);

    public static final Block<StandingSignData> MANGROVE_SIGN = new Block<>(205, NamespacedKey.parse("minecraft:mangrove_sign"), () -> new StandingSignData(4622), Item.MANGROVE_SIGN);

    public static final Block<StandingSignData> BAMBOO_SIGN = new Block<>(206, NamespacedKey.parse("minecraft:bamboo_sign"), () -> new StandingSignData(4654), Item.BAMBOO_SIGN);

    public static final Block<DoorData> OAK_DOOR = new Block<>(207, NamespacedKey.parse("minecraft:oak_door"), () -> new DoorData(4686), Item.OAK_DOOR);

    public static final Block<LadderData> LADDER = new Block<>(208, NamespacedKey.parse("minecraft:ladder"), () -> new LadderData(4750), Item.LADDER);

    public static final Block<RailData> RAIL = new Block<>(209, NamespacedKey.parse("minecraft:rail"), () -> new RailData(4758), Item.RAIL);

    public static final Block<StairData> COBBLESTONE_STAIRS = new Block<>(210, NamespacedKey.parse("minecraft:cobblestone_stairs"), () -> new StairData(4778), Item.COBBLESTONE_STAIRS);

    public static final Block<WallSignData> OAK_WALL_SIGN = new Block<>(211, NamespacedKey.parse("minecraft:oak_wall_sign"), () -> new WallSignData(4858), null);

    public static final Block<WallSignData> SPRUCE_WALL_SIGN = new Block<>(212, NamespacedKey.parse("minecraft:spruce_wall_sign"), () -> new WallSignData(4866), null);

    public static final Block<WallSignData> BIRCH_WALL_SIGN = new Block<>(213, NamespacedKey.parse("minecraft:birch_wall_sign"), () -> new WallSignData(4874), null);

    public static final Block<WallSignData> ACACIA_WALL_SIGN = new Block<>(214, NamespacedKey.parse("minecraft:acacia_wall_sign"), () -> new WallSignData(4882), null);

    public static final Block<WallSignData> CHERRY_WALL_SIGN = new Block<>(215, NamespacedKey.parse("minecraft:cherry_wall_sign"), () -> new WallSignData(4890), null);

    public static final Block<WallSignData> JUNGLE_WALL_SIGN = new Block<>(216, NamespacedKey.parse("minecraft:jungle_wall_sign"), () -> new WallSignData(4898), null);

    public static final Block<WallSignData> DARK_OAK_WALL_SIGN = new Block<>(217, NamespacedKey.parse("minecraft:dark_oak_wall_sign"), () -> new WallSignData(4906), null);

    public static final Block<WallSignData> PALE_OAK_WALL_SIGN = new Block<>(218, NamespacedKey.parse("minecraft:pale_oak_wall_sign"), () -> new WallSignData(4914), null);

    public static final Block<WallSignData> MANGROVE_WALL_SIGN = new Block<>(219, NamespacedKey.parse("minecraft:mangrove_wall_sign"), () -> new WallSignData(4922), null);

    public static final Block<WallSignData> BAMBOO_WALL_SIGN = new Block<>(220, NamespacedKey.parse("minecraft:bamboo_wall_sign"), () -> new WallSignData(4930), null);

    public static final Block<CeilingHangingSignData> OAK_HANGING_SIGN = new Block<>(221, NamespacedKey.parse("minecraft:oak_hanging_sign"), () -> new CeilingHangingSignData(4938), Item.OAK_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> SPRUCE_HANGING_SIGN = new Block<>(222, NamespacedKey.parse("minecraft:spruce_hanging_sign"), () -> new CeilingHangingSignData(5002), Item.SPRUCE_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> BIRCH_HANGING_SIGN = new Block<>(223, NamespacedKey.parse("minecraft:birch_hanging_sign"), () -> new CeilingHangingSignData(5066), Item.BIRCH_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> ACACIA_HANGING_SIGN = new Block<>(224, NamespacedKey.parse("minecraft:acacia_hanging_sign"), () -> new CeilingHangingSignData(5130), Item.ACACIA_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> CHERRY_HANGING_SIGN = new Block<>(225, NamespacedKey.parse("minecraft:cherry_hanging_sign"), () -> new CeilingHangingSignData(5194), Item.CHERRY_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> JUNGLE_HANGING_SIGN = new Block<>(226, NamespacedKey.parse("minecraft:jungle_hanging_sign"), () -> new CeilingHangingSignData(5258), Item.JUNGLE_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> DARK_OAK_HANGING_SIGN = new Block<>(227, NamespacedKey.parse("minecraft:dark_oak_hanging_sign"), () -> new CeilingHangingSignData(5322), Item.DARK_OAK_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> PALE_OAK_HANGING_SIGN = new Block<>(228, NamespacedKey.parse("minecraft:pale_oak_hanging_sign"), () -> new CeilingHangingSignData(5386), Item.PALE_OAK_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> CRIMSON_HANGING_SIGN = new Block<>(229, NamespacedKey.parse("minecraft:crimson_hanging_sign"), () -> new CeilingHangingSignData(5450), Item.CRIMSON_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> WARPED_HANGING_SIGN = new Block<>(230, NamespacedKey.parse("minecraft:warped_hanging_sign"), () -> new CeilingHangingSignData(5514), Item.WARPED_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> MANGROVE_HANGING_SIGN = new Block<>(231, NamespacedKey.parse("minecraft:mangrove_hanging_sign"), () -> new CeilingHangingSignData(5578), Item.MANGROVE_HANGING_SIGN);

    public static final Block<CeilingHangingSignData> BAMBOO_HANGING_SIGN = new Block<>(232, NamespacedKey.parse("minecraft:bamboo_hanging_sign"), () -> new CeilingHangingSignData(5642), Item.BAMBOO_HANGING_SIGN);

    public static final Block<WallHangingSignData> OAK_WALL_HANGING_SIGN = new Block<>(233, NamespacedKey.parse("minecraft:oak_wall_hanging_sign"), () -> new WallHangingSignData(5706), null);

    public static final Block<WallHangingSignData> SPRUCE_WALL_HANGING_SIGN = new Block<>(234, NamespacedKey.parse("minecraft:spruce_wall_hanging_sign"), () -> new WallHangingSignData(5714), null);

    public static final Block<WallHangingSignData> BIRCH_WALL_HANGING_SIGN = new Block<>(235, NamespacedKey.parse("minecraft:birch_wall_hanging_sign"), () -> new WallHangingSignData(5722), null);

    public static final Block<WallHangingSignData> ACACIA_WALL_HANGING_SIGN = new Block<>(236, NamespacedKey.parse("minecraft:acacia_wall_hanging_sign"), () -> new WallHangingSignData(5730), null);

    public static final Block<WallHangingSignData> CHERRY_WALL_HANGING_SIGN = new Block<>(237, NamespacedKey.parse("minecraft:cherry_wall_hanging_sign"), () -> new WallHangingSignData(5738), null);

    public static final Block<WallHangingSignData> JUNGLE_WALL_HANGING_SIGN = new Block<>(238, NamespacedKey.parse("minecraft:jungle_wall_hanging_sign"), () -> new WallHangingSignData(5746), null);

    public static final Block<WallHangingSignData> DARK_OAK_WALL_HANGING_SIGN = new Block<>(239, NamespacedKey.parse("minecraft:dark_oak_wall_hanging_sign"), () -> new WallHangingSignData(5754), null);

    public static final Block<WallHangingSignData> PALE_OAK_WALL_HANGING_SIGN = new Block<>(240, NamespacedKey.parse("minecraft:pale_oak_wall_hanging_sign"), () -> new WallHangingSignData(5762), null);

    public static final Block<WallHangingSignData> MANGROVE_WALL_HANGING_SIGN = new Block<>(241, NamespacedKey.parse("minecraft:mangrove_wall_hanging_sign"), () -> new WallHangingSignData(5770), null);

    public static final Block<WallHangingSignData> CRIMSON_WALL_HANGING_SIGN = new Block<>(242, NamespacedKey.parse("minecraft:crimson_wall_hanging_sign"), () -> new WallHangingSignData(5778), null);

    public static final Block<WallHangingSignData> WARPED_WALL_HANGING_SIGN = new Block<>(243, NamespacedKey.parse("minecraft:warped_wall_hanging_sign"), () -> new WallHangingSignData(5786), null);

    public static final Block<WallHangingSignData> BAMBOO_WALL_HANGING_SIGN = new Block<>(244, NamespacedKey.parse("minecraft:bamboo_wall_hanging_sign"), () -> new WallHangingSignData(5794), null);

    public static final Block<LeverData> LEVER = new Block<>(245, NamespacedKey.parse("minecraft:lever"), () -> new LeverData(5802), Item.LEVER);

    public static final Block<PressurePlateData> STONE_PRESSURE_PLATE = new Block<>(246, NamespacedKey.parse("minecraft:stone_pressure_plate"), () -> new PressurePlateData(5826), Item.STONE_PRESSURE_PLATE);

    public static final Block<DoorData> IRON_DOOR = new Block<>(247, NamespacedKey.parse("minecraft:iron_door"), () -> new DoorData(5828), Item.IRON_DOOR);

    public static final Block<PressurePlateData> OAK_PRESSURE_PLATE = new Block<>(248, NamespacedKey.parse("minecraft:oak_pressure_plate"), () -> new PressurePlateData(5892), Item.OAK_PRESSURE_PLATE);

    public static final Block<PressurePlateData> SPRUCE_PRESSURE_PLATE = new Block<>(249, NamespacedKey.parse("minecraft:spruce_pressure_plate"), () -> new PressurePlateData(5894), Item.SPRUCE_PRESSURE_PLATE);

    public static final Block<PressurePlateData> BIRCH_PRESSURE_PLATE = new Block<>(250, NamespacedKey.parse("minecraft:birch_pressure_plate"), () -> new PressurePlateData(5896), Item.BIRCH_PRESSURE_PLATE);

    public static final Block<PressurePlateData> JUNGLE_PRESSURE_PLATE = new Block<>(251, NamespacedKey.parse("minecraft:jungle_pressure_plate"), () -> new PressurePlateData(5898), Item.JUNGLE_PRESSURE_PLATE);

    public static final Block<PressurePlateData> ACACIA_PRESSURE_PLATE = new Block<>(252, NamespacedKey.parse("minecraft:acacia_pressure_plate"), () -> new PressurePlateData(5900), Item.ACACIA_PRESSURE_PLATE);

    public static final Block<PressurePlateData> CHERRY_PRESSURE_PLATE = new Block<>(253, NamespacedKey.parse("minecraft:cherry_pressure_plate"), () -> new PressurePlateData(5902), Item.CHERRY_PRESSURE_PLATE);

    public static final Block<PressurePlateData> DARK_OAK_PRESSURE_PLATE = new Block<>(254, NamespacedKey.parse("minecraft:dark_oak_pressure_plate"), () -> new PressurePlateData(5904), Item.DARK_OAK_PRESSURE_PLATE);

    public static final Block<PressurePlateData> PALE_OAK_PRESSURE_PLATE = new Block<>(255, NamespacedKey.parse("minecraft:pale_oak_pressure_plate"), () -> new PressurePlateData(5906), Item.PALE_OAK_PRESSURE_PLATE);

    public static final Block<PressurePlateData> MANGROVE_PRESSURE_PLATE = new Block<>(256, NamespacedKey.parse("minecraft:mangrove_pressure_plate"), () -> new PressurePlateData(5908), Item.MANGROVE_PRESSURE_PLATE);

    public static final Block<PressurePlateData> BAMBOO_PRESSURE_PLATE = new Block<>(257, NamespacedKey.parse("minecraft:bamboo_pressure_plate"), () -> new PressurePlateData(5910), Item.BAMBOO_PRESSURE_PLATE);

    public static final Block<RedstoneOreData> REDSTONE_ORE = new Block<>(258, NamespacedKey.parse("minecraft:redstone_ore"), () -> new RedstoneOreData(5912), Item.REDSTONE_ORE);

    public static final Block<RedstoneOreData> DEEPSLATE_REDSTONE_ORE = new Block<>(259, NamespacedKey.parse("minecraft:deepslate_redstone_ore"), () -> new RedstoneOreData(5914), Item.DEEPSLATE_REDSTONE_ORE);

    public static final Block<RedstoneTorchData> REDSTONE_TORCH = new Block<>(260, NamespacedKey.parse("minecraft:redstone_torch"), () -> new RedstoneTorchData(5916), Item.REDSTONE_TORCH);

    public static final Block<RedstoneWallTorchData> REDSTONE_WALL_TORCH = new Block<>(261, NamespacedKey.parse("minecraft:redstone_wall_torch"), () -> new RedstoneWallTorchData(5918), null);

    public static final Block<ButtonData> STONE_BUTTON = new Block<>(262, NamespacedKey.parse("minecraft:stone_button"), () -> new ButtonData(5926), Item.STONE_BUTTON);

    public static final Block<SnowLayerData> SNOW = new Block<>(263, NamespacedKey.parse("minecraft:snow"), () -> new SnowLayerData(5950), Item.SNOW);

    public static final Block<BlockData> ICE = new Block<>(264, NamespacedKey.parse("minecraft:ice"), () -> new BlockData(5958), Item.ICE);

    public static final Block<BlockData> SNOW_BLOCK = new Block<>(265, NamespacedKey.parse("minecraft:snow_block"), () -> new BlockData(5959), Item.SNOW_BLOCK);

    public static final Block<CactusData> CACTUS = new Block<>(266, NamespacedKey.parse("minecraft:cactus"), () -> new CactusData(5960), Item.CACTUS);

    public static final Block<BlockData> CACTUS_FLOWER = new Block<>(267, NamespacedKey.parse("minecraft:cactus_flower"), () -> new BlockData(5976), Item.CACTUS_FLOWER);

    public static final Block<BlockData> CLAY = new Block<>(268, NamespacedKey.parse("minecraft:clay"), () -> new BlockData(5977), Item.CLAY);

    public static final Block<SugarCaneData> SUGAR_CANE = new Block<>(269, NamespacedKey.parse("minecraft:sugar_cane"), () -> new SugarCaneData(5978), Item.SUGAR_CANE);

    public static final Block<JukeboxData> JUKEBOX = new Block<>(270, NamespacedKey.parse("minecraft:jukebox"), () -> new JukeboxData(5994), Item.JUKEBOX);

    public static final Block<FenceData> OAK_FENCE = new Block<>(271, NamespacedKey.parse("minecraft:oak_fence"), () -> new FenceData(5996), Item.OAK_FENCE);

    public static final Block<BlockData> NETHERRACK = new Block<>(272, NamespacedKey.parse("minecraft:netherrack"), () -> new BlockData(6028), Item.NETHERRACK);

    public static final Block<BlockData> SOUL_SAND = new Block<>(273, NamespacedKey.parse("minecraft:soul_sand"), () -> new BlockData(6029), Item.SOUL_SAND);

    public static final Block<BlockData> SOUL_SOIL = new Block<>(274, NamespacedKey.parse("minecraft:soul_soil"), () -> new BlockData(6030), Item.SOUL_SOIL);

    public static final Block<RotatedPillarData> BASALT = new Block<>(275, NamespacedKey.parse("minecraft:basalt"), () -> new RotatedPillarData(6031), Item.BASALT);

    public static final Block<RotatedPillarData> POLISHED_BASALT = new Block<>(276, NamespacedKey.parse("minecraft:polished_basalt"), () -> new RotatedPillarData(6034), Item.POLISHED_BASALT);

    public static final Block<BlockData> SOUL_TORCH = new Block<>(277, NamespacedKey.parse("minecraft:soul_torch"), () -> new BlockData(6037), Item.SOUL_TORCH);

    public static final Block<WallTorchData> SOUL_WALL_TORCH = new Block<>(278, NamespacedKey.parse("minecraft:soul_wall_torch"), () -> new WallTorchData(6038), null);

    public static final Block<BlockData> GLOWSTONE = new Block<>(279, NamespacedKey.parse("minecraft:glowstone"), () -> new BlockData(6042), Item.GLOWSTONE);

    public static final Block<NetherPortalData> NETHER_PORTAL = new Block<>(280, NamespacedKey.parse("minecraft:nether_portal"), () -> new NetherPortalData(6043), null);

    public static final Block<JackOLanternData> CARVED_PUMPKIN = new Block<>(281, NamespacedKey.parse("minecraft:carved_pumpkin"), () -> new JackOLanternData(6045), Item.CARVED_PUMPKIN);

    public static final Block<JackOLanternData> JACK_O_LANTERN = new Block<>(282, NamespacedKey.parse("minecraft:jack_o_lantern"), () -> new JackOLanternData(6049), Item.JACK_O_LANTERN);

    public static final Block<CakeData> CAKE = new Block<>(283, NamespacedKey.parse("minecraft:cake"), () -> new CakeData(6053), Item.CAKE);

    public static final Block<RepeaterData> REPEATER = new Block<>(284, NamespacedKey.parse("minecraft:repeater"), () -> new RepeaterData(6060), Item.REPEATER);

    public static final Block<BlockData> WHITE_STAINED_GLASS = new Block<>(285, NamespacedKey.parse("minecraft:white_stained_glass"), () -> new BlockData(6124), Item.WHITE_STAINED_GLASS);

    public static final Block<BlockData> ORANGE_STAINED_GLASS = new Block<>(286, NamespacedKey.parse("minecraft:orange_stained_glass"), () -> new BlockData(6125), Item.ORANGE_STAINED_GLASS);

    public static final Block<BlockData> MAGENTA_STAINED_GLASS = new Block<>(287, NamespacedKey.parse("minecraft:magenta_stained_glass"), () -> new BlockData(6126), Item.MAGENTA_STAINED_GLASS);

    public static final Block<BlockData> LIGHT_BLUE_STAINED_GLASS = new Block<>(288, NamespacedKey.parse("minecraft:light_blue_stained_glass"), () -> new BlockData(6127), Item.LIGHT_BLUE_STAINED_GLASS);

    public static final Block<BlockData> YELLOW_STAINED_GLASS = new Block<>(289, NamespacedKey.parse("minecraft:yellow_stained_glass"), () -> new BlockData(6128), Item.YELLOW_STAINED_GLASS);

    public static final Block<BlockData> LIME_STAINED_GLASS = new Block<>(290, NamespacedKey.parse("minecraft:lime_stained_glass"), () -> new BlockData(6129), Item.LIME_STAINED_GLASS);

    public static final Block<BlockData> PINK_STAINED_GLASS = new Block<>(291, NamespacedKey.parse("minecraft:pink_stained_glass"), () -> new BlockData(6130), Item.PINK_STAINED_GLASS);

    public static final Block<BlockData> GRAY_STAINED_GLASS = new Block<>(292, NamespacedKey.parse("minecraft:gray_stained_glass"), () -> new BlockData(6131), Item.GRAY_STAINED_GLASS);

    public static final Block<BlockData> LIGHT_GRAY_STAINED_GLASS = new Block<>(293, NamespacedKey.parse("minecraft:light_gray_stained_glass"), () -> new BlockData(6132), Item.LIGHT_GRAY_STAINED_GLASS);

    public static final Block<BlockData> CYAN_STAINED_GLASS = new Block<>(294, NamespacedKey.parse("minecraft:cyan_stained_glass"), () -> new BlockData(6133), Item.CYAN_STAINED_GLASS);

    public static final Block<BlockData> PURPLE_STAINED_GLASS = new Block<>(295, NamespacedKey.parse("minecraft:purple_stained_glass"), () -> new BlockData(6134), Item.PURPLE_STAINED_GLASS);

    public static final Block<BlockData> BLUE_STAINED_GLASS = new Block<>(296, NamespacedKey.parse("minecraft:blue_stained_glass"), () -> new BlockData(6135), Item.BLUE_STAINED_GLASS);

    public static final Block<BlockData> BROWN_STAINED_GLASS = new Block<>(297, NamespacedKey.parse("minecraft:brown_stained_glass"), () -> new BlockData(6136), Item.BROWN_STAINED_GLASS);

    public static final Block<BlockData> GREEN_STAINED_GLASS = new Block<>(298, NamespacedKey.parse("minecraft:green_stained_glass"), () -> new BlockData(6137), Item.GREEN_STAINED_GLASS);

    public static final Block<BlockData> RED_STAINED_GLASS = new Block<>(299, NamespacedKey.parse("minecraft:red_stained_glass"), () -> new BlockData(6138), Item.RED_STAINED_GLASS);

    public static final Block<BlockData> BLACK_STAINED_GLASS = new Block<>(300, NamespacedKey.parse("minecraft:black_stained_glass"), () -> new BlockData(6139), Item.BLACK_STAINED_GLASS);

    public static final Block<TrapdoorData> OAK_TRAPDOOR = new Block<>(301, NamespacedKey.parse("minecraft:oak_trapdoor"), () -> new TrapdoorData(6140), Item.OAK_TRAPDOOR);

    public static final Block<TrapdoorData> SPRUCE_TRAPDOOR = new Block<>(302, NamespacedKey.parse("minecraft:spruce_trapdoor"), () -> new TrapdoorData(6204), Item.SPRUCE_TRAPDOOR);

    public static final Block<TrapdoorData> BIRCH_TRAPDOOR = new Block<>(303, NamespacedKey.parse("minecraft:birch_trapdoor"), () -> new TrapdoorData(6268), Item.BIRCH_TRAPDOOR);

    public static final Block<TrapdoorData> JUNGLE_TRAPDOOR = new Block<>(304, NamespacedKey.parse("minecraft:jungle_trapdoor"), () -> new TrapdoorData(6332), Item.JUNGLE_TRAPDOOR);

    public static final Block<TrapdoorData> ACACIA_TRAPDOOR = new Block<>(305, NamespacedKey.parse("minecraft:acacia_trapdoor"), () -> new TrapdoorData(6396), Item.ACACIA_TRAPDOOR);

    public static final Block<TrapdoorData> CHERRY_TRAPDOOR = new Block<>(306, NamespacedKey.parse("minecraft:cherry_trapdoor"), () -> new TrapdoorData(6460), Item.CHERRY_TRAPDOOR);

    public static final Block<TrapdoorData> DARK_OAK_TRAPDOOR = new Block<>(307, NamespacedKey.parse("minecraft:dark_oak_trapdoor"), () -> new TrapdoorData(6524), Item.DARK_OAK_TRAPDOOR);

    public static final Block<TrapdoorData> PALE_OAK_TRAPDOOR = new Block<>(308, NamespacedKey.parse("minecraft:pale_oak_trapdoor"), () -> new TrapdoorData(6588), Item.PALE_OAK_TRAPDOOR);

    public static final Block<TrapdoorData> MANGROVE_TRAPDOOR = new Block<>(309, NamespacedKey.parse("minecraft:mangrove_trapdoor"), () -> new TrapdoorData(6652), Item.MANGROVE_TRAPDOOR);

    public static final Block<TrapdoorData> BAMBOO_TRAPDOOR = new Block<>(310, NamespacedKey.parse("minecraft:bamboo_trapdoor"), () -> new TrapdoorData(6716), Item.BAMBOO_TRAPDOOR);

    public static final Block<BlockData> STONE_BRICKS = new Block<>(311, NamespacedKey.parse("minecraft:stone_bricks"), () -> new BlockData(6780), Item.STONE_BRICKS);

    public static final Block<BlockData> MOSSY_STONE_BRICKS = new Block<>(312, NamespacedKey.parse("minecraft:mossy_stone_bricks"), () -> new BlockData(6781), Item.MOSSY_STONE_BRICKS);

    public static final Block<BlockData> CRACKED_STONE_BRICKS = new Block<>(313, NamespacedKey.parse("minecraft:cracked_stone_bricks"), () -> new BlockData(6782), Item.CRACKED_STONE_BRICKS);

    public static final Block<BlockData> CHISELED_STONE_BRICKS = new Block<>(314, NamespacedKey.parse("minecraft:chiseled_stone_bricks"), () -> new BlockData(6783), Item.CHISELED_STONE_BRICKS);

    public static final Block<BlockData> PACKED_MUD = new Block<>(315, NamespacedKey.parse("minecraft:packed_mud"), () -> new BlockData(6784), Item.PACKED_MUD);

    public static final Block<BlockData> MUD_BRICKS = new Block<>(316, NamespacedKey.parse("minecraft:mud_bricks"), () -> new BlockData(6785), Item.MUD_BRICKS);

    public static final Block<BlockData> INFESTED_STONE = new Block<>(317, NamespacedKey.parse("minecraft:infested_stone"), () -> new BlockData(6786), Item.INFESTED_STONE);

    public static final Block<BlockData> INFESTED_COBBLESTONE = new Block<>(318, NamespacedKey.parse("minecraft:infested_cobblestone"), () -> new BlockData(6787), Item.INFESTED_COBBLESTONE);

    public static final Block<BlockData> INFESTED_STONE_BRICKS = new Block<>(319, NamespacedKey.parse("minecraft:infested_stone_bricks"), () -> new BlockData(6788), Item.INFESTED_STONE_BRICKS);

    public static final Block<BlockData> INFESTED_MOSSY_STONE_BRICKS = new Block<>(320, NamespacedKey.parse("minecraft:infested_mossy_stone_bricks"), () -> new BlockData(6789), Item.INFESTED_MOSSY_STONE_BRICKS);

    public static final Block<BlockData> INFESTED_CRACKED_STONE_BRICKS = new Block<>(321, NamespacedKey.parse("minecraft:infested_cracked_stone_bricks"), () -> new BlockData(6790), Item.INFESTED_CRACKED_STONE_BRICKS);

    public static final Block<BlockData> INFESTED_CHISELED_STONE_BRICKS = new Block<>(322, NamespacedKey.parse("minecraft:infested_chiseled_stone_bricks"), () -> new BlockData(6791), Item.INFESTED_CHISELED_STONE_BRICKS);

    public static final Block<HugeMushroomData> BROWN_MUSHROOM_BLOCK = new Block<>(323, NamespacedKey.parse("minecraft:brown_mushroom_block"), () -> new HugeMushroomData(6792), Item.BROWN_MUSHROOM_BLOCK);

    public static final Block<HugeMushroomData> RED_MUSHROOM_BLOCK = new Block<>(324, NamespacedKey.parse("minecraft:red_mushroom_block"), () -> new HugeMushroomData(6856), Item.RED_MUSHROOM_BLOCK);

    public static final Block<HugeMushroomData> MUSHROOM_STEM = new Block<>(325, NamespacedKey.parse("minecraft:mushroom_stem"), () -> new HugeMushroomData(6920), Item.MUSHROOM_STEM);

    public static final Block<IronBarsData> IRON_BARS = new Block<>(326, NamespacedKey.parse("minecraft:iron_bars"), () -> new IronBarsData(6984), Item.IRON_BARS);

    public static final Block<ChainData> CHAIN = new Block<>(327, NamespacedKey.parse("minecraft:chain"), () -> new ChainData(7016), Item.CHAIN);

    public static final Block<IronBarsData> GLASS_PANE = new Block<>(328, NamespacedKey.parse("minecraft:glass_pane"), () -> new IronBarsData(7022), Item.GLASS_PANE);

    public static final Block<BlockData> PUMPKIN = new Block<>(329, NamespacedKey.parse("minecraft:pumpkin"), () -> new BlockData(7054), Item.PUMPKIN);

    public static final Block<BlockData> MELON = new Block<>(330, NamespacedKey.parse("minecraft:melon"), () -> new BlockData(7055), Item.MELON);

    public static final Block<AttachedStemData> ATTACHED_PUMPKIN_STEM = new Block<>(331, NamespacedKey.parse("minecraft:attached_pumpkin_stem"), () -> new AttachedStemData(7056), null);

    public static final Block<AttachedStemData> ATTACHED_MELON_STEM = new Block<>(332, NamespacedKey.parse("minecraft:attached_melon_stem"), () -> new AttachedStemData(7060), null);

    public static final Block<StemData> PUMPKIN_STEM = new Block<>(333, NamespacedKey.parse("minecraft:pumpkin_stem"), () -> new StemData(7064), null);

    public static final Block<StemData> MELON_STEM = new Block<>(334, NamespacedKey.parse("minecraft:melon_stem"), () -> new StemData(7072), null);

    public static final Block<VineData> VINE = new Block<>(335, NamespacedKey.parse("minecraft:vine"), () -> new VineData(7080), Item.VINE);

    public static final Block<GlowLichenData> GLOW_LICHEN = new Block<>(336, NamespacedKey.parse("minecraft:glow_lichen"), () -> new GlowLichenData(7112), Item.GLOW_LICHEN);

    public static final Block<MultifaceData> RESIN_CLUMP = new Block<>(337, NamespacedKey.parse("minecraft:resin_clump"), () -> new MultifaceData(7240), Item.RESIN_CLUMP);

    public static final Block<FenceGateData> OAK_FENCE_GATE = new Block<>(338, NamespacedKey.parse("minecraft:oak_fence_gate"), () -> new FenceGateData(7368), Item.OAK_FENCE_GATE);

    public static final Block<StairData> BRICK_STAIRS = new Block<>(339, NamespacedKey.parse("minecraft:brick_stairs"), () -> new StairData(7400), Item.BRICK_STAIRS);

    public static final Block<StairData> STONE_BRICK_STAIRS = new Block<>(340, NamespacedKey.parse("minecraft:stone_brick_stairs"), () -> new StairData(7480), Item.STONE_BRICK_STAIRS);

    public static final Block<StairData> MUD_BRICK_STAIRS = new Block<>(341, NamespacedKey.parse("minecraft:mud_brick_stairs"), () -> new StairData(7560), Item.MUD_BRICK_STAIRS);

    public static final Block<MyceliumData> MYCELIUM = new Block<>(342, NamespacedKey.parse("minecraft:mycelium"), () -> new MyceliumData(7640), Item.MYCELIUM);

    public static final Block<BlockData> LILY_PAD = new Block<>(343, NamespacedKey.parse("minecraft:lily_pad"), () -> new BlockData(7642), Item.LILY_PAD);

    public static final Block<BlockData> RESIN_BLOCK = new Block<>(344, NamespacedKey.parse("minecraft:resin_block"), () -> new BlockData(7643), Item.RESIN_BLOCK);

    public static final Block<BlockData> RESIN_BRICKS = new Block<>(345, NamespacedKey.parse("minecraft:resin_bricks"), () -> new BlockData(7644), Item.RESIN_BRICKS);

    public static final Block<StairData> RESIN_BRICK_STAIRS = new Block<>(346, NamespacedKey.parse("minecraft:resin_brick_stairs"), () -> new StairData(7645), Item.RESIN_BRICK_STAIRS);

    public static final Block<SlabData> RESIN_BRICK_SLAB = new Block<>(347, NamespacedKey.parse("minecraft:resin_brick_slab"), () -> new SlabData(7725), Item.RESIN_BRICK_SLAB);

    public static final Block<WallData> RESIN_BRICK_WALL = new Block<>(348, NamespacedKey.parse("minecraft:resin_brick_wall"), () -> new WallData(7731), Item.RESIN_BRICK_WALL);

    public static final Block<BlockData> CHISELED_RESIN_BRICKS = new Block<>(349, NamespacedKey.parse("minecraft:chiseled_resin_bricks"), () -> new BlockData(8055), Item.CHISELED_RESIN_BRICKS);

    public static final Block<BlockData> NETHER_BRICKS = new Block<>(350, NamespacedKey.parse("minecraft:nether_bricks"), () -> new BlockData(8056), Item.NETHER_BRICKS);

    public static final Block<FenceData> NETHER_BRICK_FENCE = new Block<>(351, NamespacedKey.parse("minecraft:nether_brick_fence"), () -> new FenceData(8057), Item.NETHER_BRICK_FENCE);

    public static final Block<StairData> NETHER_BRICK_STAIRS = new Block<>(352, NamespacedKey.parse("minecraft:nether_brick_stairs"), () -> new StairData(8089), Item.NETHER_BRICK_STAIRS);

    public static final Block<NetherWartData> NETHER_WART = new Block<>(353, NamespacedKey.parse("minecraft:nether_wart"), () -> new NetherWartData(8169), Item.NETHER_WART);

    public static final Block<BlockData> ENCHANTING_TABLE = new Block<>(354, NamespacedKey.parse("minecraft:enchanting_table"), () -> new BlockData(8173), Item.ENCHANTING_TABLE);

    public static final Block<BrewingStandData> BREWING_STAND = new Block<>(355, NamespacedKey.parse("minecraft:brewing_stand"), () -> new BrewingStandData(8174), Item.BREWING_STAND);

    public static final Block<BlockData> CAULDRON = new Block<>(356, NamespacedKey.parse("minecraft:cauldron"), () -> new BlockData(8182), Item.CAULDRON);

    public static final Block<LayeredCauldronData> WATER_CAULDRON = new Block<>(357, NamespacedKey.parse("minecraft:water_cauldron"), () -> new LayeredCauldronData(8183), null);

    public static final Block<BlockData> LAVA_CAULDRON = new Block<>(358, NamespacedKey.parse("minecraft:lava_cauldron"), () -> new BlockData(8186), null);

    public static final Block<LayeredCauldronData> POWDER_SNOW_CAULDRON = new Block<>(359, NamespacedKey.parse("minecraft:powder_snow_cauldron"), () -> new LayeredCauldronData(8187), null);

    public static final Block<BlockData> END_PORTAL = new Block<>(360, NamespacedKey.parse("minecraft:end_portal"), () -> new BlockData(8190), null);

    public static final Block<EndPortalFrameData> END_PORTAL_FRAME = new Block<>(361, NamespacedKey.parse("minecraft:end_portal_frame"), () -> new EndPortalFrameData(8191), Item.END_PORTAL_FRAME);

    public static final Block<BlockData> END_STONE = new Block<>(362, NamespacedKey.parse("minecraft:end_stone"), () -> new BlockData(8199), Item.END_STONE);

    public static final Block<BlockData> DRAGON_EGG = new Block<>(363, NamespacedKey.parse("minecraft:dragon_egg"), () -> new BlockData(8200), Item.DRAGON_EGG);

    public static final Block<RedstoneLampData> REDSTONE_LAMP = new Block<>(364, NamespacedKey.parse("minecraft:redstone_lamp"), () -> new RedstoneLampData(8201), Item.REDSTONE_LAMP);

    public static final Block<CocoaData> COCOA = new Block<>(365, NamespacedKey.parse("minecraft:cocoa"), () -> new CocoaData(8203), null);

    public static final Block<StairData> SANDSTONE_STAIRS = new Block<>(366, NamespacedKey.parse("minecraft:sandstone_stairs"), () -> new StairData(8215), Item.SANDSTONE_STAIRS);

    public static final Block<BlockData> EMERALD_ORE = new Block<>(367, NamespacedKey.parse("minecraft:emerald_ore"), () -> new BlockData(8295), Item.EMERALD_ORE);

    public static final Block<BlockData> DEEPSLATE_EMERALD_ORE = new Block<>(368, NamespacedKey.parse("minecraft:deepslate_emerald_ore"), () -> new BlockData(8296), Item.DEEPSLATE_EMERALD_ORE);

    public static final Block<EnderChestData> ENDER_CHEST = new Block<>(369, NamespacedKey.parse("minecraft:ender_chest"), () -> new EnderChestData(8297), Item.ENDER_CHEST);

    public static final Block<TripWireHookData> TRIPWIRE_HOOK = new Block<>(370, NamespacedKey.parse("minecraft:tripwire_hook"), () -> new TripWireHookData(8305), Item.TRIPWIRE_HOOK);

    public static final Block<TripwireData> TRIPWIRE = new Block<>(371, NamespacedKey.parse("minecraft:tripwire"), () -> new TripwireData(8321), null);

    public static final Block<BlockData> EMERALD_BLOCK = new Block<>(372, NamespacedKey.parse("minecraft:emerald_block"), () -> new BlockData(8449), Item.EMERALD_BLOCK);

    public static final Block<StairData> SPRUCE_STAIRS = new Block<>(373, NamespacedKey.parse("minecraft:spruce_stairs"), () -> new StairData(8450), Item.SPRUCE_STAIRS);

    public static final Block<StairData> BIRCH_STAIRS = new Block<>(374, NamespacedKey.parse("minecraft:birch_stairs"), () -> new StairData(8530), Item.BIRCH_STAIRS);

    public static final Block<StairData> JUNGLE_STAIRS = new Block<>(375, NamespacedKey.parse("minecraft:jungle_stairs"), () -> new StairData(8610), Item.JUNGLE_STAIRS);

    public static final Block<CommandData> COMMAND_BLOCK = new Block<>(376, NamespacedKey.parse("minecraft:command_block"), () -> new CommandData(8690), Item.COMMAND_BLOCK);

    public static final Block<BlockData> BEACON = new Block<>(377, NamespacedKey.parse("minecraft:beacon"), () -> new BlockData(8702), Item.BEACON);

    public static final Block<WallData> COBBLESTONE_WALL = new Block<>(378, NamespacedKey.parse("minecraft:cobblestone_wall"), () -> new WallData(8703), Item.COBBLESTONE_WALL);

    public static final Block<WallData> MOSSY_COBBLESTONE_WALL = new Block<>(379, NamespacedKey.parse("minecraft:mossy_cobblestone_wall"), () -> new WallData(9027), Item.MOSSY_COBBLESTONE_WALL);

    public static final Block<BlockData> FLOWER_POT = new Block<>(380, NamespacedKey.parse("minecraft:flower_pot"), () -> new BlockData(9351), Item.FLOWER_POT);

    public static final Block<BlockData> POTTED_TORCHFLOWER = new Block<>(381, NamespacedKey.parse("minecraft:potted_torchflower"), () -> new BlockData(9352), null);

    public static final Block<BlockData> POTTED_OAK_SAPLING = new Block<>(382, NamespacedKey.parse("minecraft:potted_oak_sapling"), () -> new BlockData(9353), null);

    public static final Block<BlockData> POTTED_SPRUCE_SAPLING = new Block<>(383, NamespacedKey.parse("minecraft:potted_spruce_sapling"), () -> new BlockData(9354), null);

    public static final Block<BlockData> POTTED_BIRCH_SAPLING = new Block<>(384, NamespacedKey.parse("minecraft:potted_birch_sapling"), () -> new BlockData(9355), null);

    public static final Block<BlockData> POTTED_JUNGLE_SAPLING = new Block<>(385, NamespacedKey.parse("minecraft:potted_jungle_sapling"), () -> new BlockData(9356), null);

    public static final Block<BlockData> POTTED_ACACIA_SAPLING = new Block<>(386, NamespacedKey.parse("minecraft:potted_acacia_sapling"), () -> new BlockData(9357), null);

    public static final Block<BlockData> POTTED_CHERRY_SAPLING = new Block<>(387, NamespacedKey.parse("minecraft:potted_cherry_sapling"), () -> new BlockData(9358), null);

    public static final Block<BlockData> POTTED_DARK_OAK_SAPLING = new Block<>(388, NamespacedKey.parse("minecraft:potted_dark_oak_sapling"), () -> new BlockData(9359), null);

    public static final Block<BlockData> POTTED_PALE_OAK_SAPLING = new Block<>(389, NamespacedKey.parse("minecraft:potted_pale_oak_sapling"), () -> new BlockData(9360), null);

    public static final Block<BlockData> POTTED_MANGROVE_PROPAGULE = new Block<>(390, NamespacedKey.parse("minecraft:potted_mangrove_propagule"), () -> new BlockData(9361), null);

    public static final Block<BlockData> POTTED_FERN = new Block<>(391, NamespacedKey.parse("minecraft:potted_fern"), () -> new BlockData(9362), null);

    public static final Block<BlockData> POTTED_DANDELION = new Block<>(392, NamespacedKey.parse("minecraft:potted_dandelion"), () -> new BlockData(9363), null);

    public static final Block<BlockData> POTTED_POPPY = new Block<>(393, NamespacedKey.parse("minecraft:potted_poppy"), () -> new BlockData(9364), null);

    public static final Block<BlockData> POTTED_BLUE_ORCHID = new Block<>(394, NamespacedKey.parse("minecraft:potted_blue_orchid"), () -> new BlockData(9365), null);

    public static final Block<BlockData> POTTED_ALLIUM = new Block<>(395, NamespacedKey.parse("minecraft:potted_allium"), () -> new BlockData(9366), null);

    public static final Block<BlockData> POTTED_AZURE_BLUET = new Block<>(396, NamespacedKey.parse("minecraft:potted_azure_bluet"), () -> new BlockData(9367), null);

    public static final Block<BlockData> POTTED_RED_TULIP = new Block<>(397, NamespacedKey.parse("minecraft:potted_red_tulip"), () -> new BlockData(9368), null);

    public static final Block<BlockData> POTTED_ORANGE_TULIP = new Block<>(398, NamespacedKey.parse("minecraft:potted_orange_tulip"), () -> new BlockData(9369), null);

    public static final Block<BlockData> POTTED_WHITE_TULIP = new Block<>(399, NamespacedKey.parse("minecraft:potted_white_tulip"), () -> new BlockData(9370), null);

    public static final Block<BlockData> POTTED_PINK_TULIP = new Block<>(400, NamespacedKey.parse("minecraft:potted_pink_tulip"), () -> new BlockData(9371), null);

    public static final Block<BlockData> POTTED_OXEYE_DAISY = new Block<>(401, NamespacedKey.parse("minecraft:potted_oxeye_daisy"), () -> new BlockData(9372), null);

    public static final Block<BlockData> POTTED_CORNFLOWER = new Block<>(402, NamespacedKey.parse("minecraft:potted_cornflower"), () -> new BlockData(9373), null);

    public static final Block<BlockData> POTTED_LILY_OF_THE_VALLEY = new Block<>(403, NamespacedKey.parse("minecraft:potted_lily_of_the_valley"), () -> new BlockData(9374), null);

    public static final Block<BlockData> POTTED_WITHER_ROSE = new Block<>(404, NamespacedKey.parse("minecraft:potted_wither_rose"), () -> new BlockData(9375), null);

    public static final Block<BlockData> POTTED_RED_MUSHROOM = new Block<>(405, NamespacedKey.parse("minecraft:potted_red_mushroom"), () -> new BlockData(9376), null);

    public static final Block<BlockData> POTTED_BROWN_MUSHROOM = new Block<>(406, NamespacedKey.parse("minecraft:potted_brown_mushroom"), () -> new BlockData(9377), null);

    public static final Block<BlockData> POTTED_DEAD_BUSH = new Block<>(407, NamespacedKey.parse("minecraft:potted_dead_bush"), () -> new BlockData(9378), null);

    public static final Block<BlockData> POTTED_CACTUS = new Block<>(408, NamespacedKey.parse("minecraft:potted_cactus"), () -> new BlockData(9379), null);

    public static final Block<CarrotData> CARROTS = new Block<>(409, NamespacedKey.parse("minecraft:carrots"), () -> new CarrotData(9380), null);

    public static final Block<PotatoData> POTATOES = new Block<>(410, NamespacedKey.parse("minecraft:potatoes"), () -> new PotatoData(9388), null);

    public static final Block<ButtonData> OAK_BUTTON = new Block<>(411, NamespacedKey.parse("minecraft:oak_button"), () -> new ButtonData(9396), Item.OAK_BUTTON);

    public static final Block<ButtonData> SPRUCE_BUTTON = new Block<>(412, NamespacedKey.parse("minecraft:spruce_button"), () -> new ButtonData(9420), Item.SPRUCE_BUTTON);

    public static final Block<ButtonData> BIRCH_BUTTON = new Block<>(413, NamespacedKey.parse("minecraft:birch_button"), () -> new ButtonData(9444), Item.BIRCH_BUTTON);

    public static final Block<ButtonData> JUNGLE_BUTTON = new Block<>(414, NamespacedKey.parse("minecraft:jungle_button"), () -> new ButtonData(9468), Item.JUNGLE_BUTTON);

    public static final Block<ButtonData> ACACIA_BUTTON = new Block<>(415, NamespacedKey.parse("minecraft:acacia_button"), () -> new ButtonData(9492), Item.ACACIA_BUTTON);

    public static final Block<ButtonData> CHERRY_BUTTON = new Block<>(416, NamespacedKey.parse("minecraft:cherry_button"), () -> new ButtonData(9516), Item.CHERRY_BUTTON);

    public static final Block<ButtonData> DARK_OAK_BUTTON = new Block<>(417, NamespacedKey.parse("minecraft:dark_oak_button"), () -> new ButtonData(9540), Item.DARK_OAK_BUTTON);

    public static final Block<ButtonData> PALE_OAK_BUTTON = new Block<>(418, NamespacedKey.parse("minecraft:pale_oak_button"), () -> new ButtonData(9564), Item.PALE_OAK_BUTTON);

    public static final Block<ButtonData> MANGROVE_BUTTON = new Block<>(419, NamespacedKey.parse("minecraft:mangrove_button"), () -> new ButtonData(9588), Item.MANGROVE_BUTTON);

    public static final Block<ButtonData> BAMBOO_BUTTON = new Block<>(420, NamespacedKey.parse("minecraft:bamboo_button"), () -> new ButtonData(9612), Item.BAMBOO_BUTTON);

    public static final Block<SkullData> SKELETON_SKULL = new Block<>(421, NamespacedKey.parse("minecraft:skeleton_skull"), () -> new SkullData(9636), Item.SKELETON_SKULL);

    public static final Block<WallSkullData> SKELETON_WALL_SKULL = new Block<>(422, NamespacedKey.parse("minecraft:skeleton_wall_skull"), () -> new WallSkullData(9668), null);

    public static final Block<WitherSkullData> WITHER_SKELETON_SKULL = new Block<>(423, NamespacedKey.parse("minecraft:wither_skeleton_skull"), () -> new WitherSkullData(9676), Item.WITHER_SKELETON_SKULL);

    public static final Block<WitherWallSkullData> WITHER_SKELETON_WALL_SKULL = new Block<>(424, NamespacedKey.parse("minecraft:wither_skeleton_wall_skull"), () -> new WitherWallSkullData(9708), null);

    public static final Block<SkullData> ZOMBIE_HEAD = new Block<>(425, NamespacedKey.parse("minecraft:zombie_head"), () -> new SkullData(9716), Item.ZOMBIE_HEAD);

    public static final Block<WallSkullData> ZOMBIE_WALL_HEAD = new Block<>(426, NamespacedKey.parse("minecraft:zombie_wall_head"), () -> new WallSkullData(9748), null);

    public static final Block<PlayerHeadData> PLAYER_HEAD = new Block<>(427, NamespacedKey.parse("minecraft:player_head"), () -> new PlayerHeadData(9756), Item.PLAYER_HEAD);

    public static final Block<PlayerWallHeadData> PLAYER_WALL_HEAD = new Block<>(428, NamespacedKey.parse("minecraft:player_wall_head"), () -> new PlayerWallHeadData(9788), null);

    public static final Block<SkullData> CREEPER_HEAD = new Block<>(429, NamespacedKey.parse("minecraft:creeper_head"), () -> new SkullData(9796), Item.CREEPER_HEAD);

    public static final Block<WallSkullData> CREEPER_WALL_HEAD = new Block<>(430, NamespacedKey.parse("minecraft:creeper_wall_head"), () -> new WallSkullData(9828), null);

    public static final Block<SkullData> DRAGON_HEAD = new Block<>(431, NamespacedKey.parse("minecraft:dragon_head"), () -> new SkullData(9836), Item.DRAGON_HEAD);

    public static final Block<WallSkullData> DRAGON_WALL_HEAD = new Block<>(432, NamespacedKey.parse("minecraft:dragon_wall_head"), () -> new WallSkullData(9868), null);

    public static final Block<SkullData> PIGLIN_HEAD = new Block<>(433, NamespacedKey.parse("minecraft:piglin_head"), () -> new SkullData(9876), Item.PIGLIN_HEAD);

    public static final Block<PiglinwallskullData> PIGLIN_WALL_HEAD = new Block<>(434, NamespacedKey.parse("minecraft:piglin_wall_head"), () -> new PiglinwallskullData(9908), null);

    public static final Block<AnvilData> ANVIL = new Block<>(435, NamespacedKey.parse("minecraft:anvil"), () -> new AnvilData(9916), Item.ANVIL);

    public static final Block<AnvilData> CHIPPED_ANVIL = new Block<>(436, NamespacedKey.parse("minecraft:chipped_anvil"), () -> new AnvilData(9920), Item.CHIPPED_ANVIL);

    public static final Block<AnvilData> DAMAGED_ANVIL = new Block<>(437, NamespacedKey.parse("minecraft:damaged_anvil"), () -> new AnvilData(9924), Item.DAMAGED_ANVIL);

    public static final Block<TrappedChestData> TRAPPED_CHEST = new Block<>(438, NamespacedKey.parse("minecraft:trapped_chest"), () -> new TrappedChestData(9928), Item.TRAPPED_CHEST);

    public static final Block<WeightedPressurePlateData> LIGHT_WEIGHTED_PRESSURE_PLATE = new Block<>(439, NamespacedKey.parse("minecraft:light_weighted_pressure_plate"), () -> new WeightedPressurePlateData(9952), Item.LIGHT_WEIGHTED_PRESSURE_PLATE);

    public static final Block<WeightedPressurePlateData> HEAVY_WEIGHTED_PRESSURE_PLATE = new Block<>(440, NamespacedKey.parse("minecraft:heavy_weighted_pressure_plate"), () -> new WeightedPressurePlateData(9968), Item.HEAVY_WEIGHTED_PRESSURE_PLATE);

    public static final Block<ComparatorData> COMPARATOR = new Block<>(441, NamespacedKey.parse("minecraft:comparator"), () -> new ComparatorData(9984), Item.COMPARATOR);

    public static final Block<DaylightDetectorData> DAYLIGHT_DETECTOR = new Block<>(442, NamespacedKey.parse("minecraft:daylight_detector"), () -> new DaylightDetectorData(10000), Item.DAYLIGHT_DETECTOR);

    public static final Block<BlockData> REDSTONE_BLOCK = new Block<>(443, NamespacedKey.parse("minecraft:redstone_block"), () -> new BlockData(10032), Item.REDSTONE_BLOCK);

    public static final Block<BlockData> NETHER_QUARTZ_ORE = new Block<>(444, NamespacedKey.parse("minecraft:nether_quartz_ore"), () -> new BlockData(10033), Item.NETHER_QUARTZ_ORE);

    public static final Block<HopperData> HOPPER = new Block<>(445, NamespacedKey.parse("minecraft:hopper"), () -> new HopperData(10034), Item.HOPPER);

    public static final Block<BlockData> QUARTZ_BLOCK = new Block<>(446, NamespacedKey.parse("minecraft:quartz_block"), () -> new BlockData(10044), Item.QUARTZ_BLOCK);

    public static final Block<BlockData> CHISELED_QUARTZ_BLOCK = new Block<>(447, NamespacedKey.parse("minecraft:chiseled_quartz_block"), () -> new BlockData(10045), Item.CHISELED_QUARTZ_BLOCK);

    public static final Block<RotatedPillarData> QUARTZ_PILLAR = new Block<>(448, NamespacedKey.parse("minecraft:quartz_pillar"), () -> new RotatedPillarData(10046), Item.QUARTZ_PILLAR);

    public static final Block<StairData> QUARTZ_STAIRS = new Block<>(449, NamespacedKey.parse("minecraft:quartz_stairs"), () -> new StairData(10049), Item.QUARTZ_STAIRS);

    public static final Block<PoweredRailData> ACTIVATOR_RAIL = new Block<>(450, NamespacedKey.parse("minecraft:activator_rail"), () -> new PoweredRailData(10129), Item.ACTIVATOR_RAIL);

    public static final Block<DropperData> DROPPER = new Block<>(451, NamespacedKey.parse("minecraft:dropper"), () -> new DropperData(10153), Item.DROPPER);

    public static final Block<BlockData> WHITE_TERRACOTTA = new Block<>(452, NamespacedKey.parse("minecraft:white_terracotta"), () -> new BlockData(10165), Item.WHITE_TERRACOTTA);

    public static final Block<BlockData> ORANGE_TERRACOTTA = new Block<>(453, NamespacedKey.parse("minecraft:orange_terracotta"), () -> new BlockData(10166), Item.ORANGE_TERRACOTTA);

    public static final Block<BlockData> MAGENTA_TERRACOTTA = new Block<>(454, NamespacedKey.parse("minecraft:magenta_terracotta"), () -> new BlockData(10167), Item.MAGENTA_TERRACOTTA);

    public static final Block<BlockData> LIGHT_BLUE_TERRACOTTA = new Block<>(455, NamespacedKey.parse("minecraft:light_blue_terracotta"), () -> new BlockData(10168), Item.LIGHT_BLUE_TERRACOTTA);

    public static final Block<BlockData> YELLOW_TERRACOTTA = new Block<>(456, NamespacedKey.parse("minecraft:yellow_terracotta"), () -> new BlockData(10169), Item.YELLOW_TERRACOTTA);

    public static final Block<BlockData> LIME_TERRACOTTA = new Block<>(457, NamespacedKey.parse("minecraft:lime_terracotta"), () -> new BlockData(10170), Item.LIME_TERRACOTTA);

    public static final Block<BlockData> PINK_TERRACOTTA = new Block<>(458, NamespacedKey.parse("minecraft:pink_terracotta"), () -> new BlockData(10171), Item.PINK_TERRACOTTA);

    public static final Block<BlockData> GRAY_TERRACOTTA = new Block<>(459, NamespacedKey.parse("minecraft:gray_terracotta"), () -> new BlockData(10172), Item.GRAY_TERRACOTTA);

    public static final Block<BlockData> LIGHT_GRAY_TERRACOTTA = new Block<>(460, NamespacedKey.parse("minecraft:light_gray_terracotta"), () -> new BlockData(10173), Item.LIGHT_GRAY_TERRACOTTA);

    public static final Block<BlockData> CYAN_TERRACOTTA = new Block<>(461, NamespacedKey.parse("minecraft:cyan_terracotta"), () -> new BlockData(10174), Item.CYAN_TERRACOTTA);

    public static final Block<BlockData> PURPLE_TERRACOTTA = new Block<>(462, NamespacedKey.parse("minecraft:purple_terracotta"), () -> new BlockData(10175), Item.PURPLE_TERRACOTTA);

    public static final Block<BlockData> BLUE_TERRACOTTA = new Block<>(463, NamespacedKey.parse("minecraft:blue_terracotta"), () -> new BlockData(10176), Item.BLUE_TERRACOTTA);

    public static final Block<BlockData> BROWN_TERRACOTTA = new Block<>(464, NamespacedKey.parse("minecraft:brown_terracotta"), () -> new BlockData(10177), Item.BROWN_TERRACOTTA);

    public static final Block<BlockData> GREEN_TERRACOTTA = new Block<>(465, NamespacedKey.parse("minecraft:green_terracotta"), () -> new BlockData(10178), Item.GREEN_TERRACOTTA);

    public static final Block<BlockData> RED_TERRACOTTA = new Block<>(466, NamespacedKey.parse("minecraft:red_terracotta"), () -> new BlockData(10179), Item.RED_TERRACOTTA);

    public static final Block<BlockData> BLACK_TERRACOTTA = new Block<>(467, NamespacedKey.parse("minecraft:black_terracotta"), () -> new BlockData(10180), Item.BLACK_TERRACOTTA);

    public static final Block<StainedGlassPaneData> WHITE_STAINED_GLASS_PANE = new Block<>(468, NamespacedKey.parse("minecraft:white_stained_glass_pane"), () -> new StainedGlassPaneData(10181), Item.WHITE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> ORANGE_STAINED_GLASS_PANE = new Block<>(469, NamespacedKey.parse("minecraft:orange_stained_glass_pane"), () -> new StainedGlassPaneData(10213), Item.ORANGE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> MAGENTA_STAINED_GLASS_PANE = new Block<>(470, NamespacedKey.parse("minecraft:magenta_stained_glass_pane"), () -> new StainedGlassPaneData(10245), Item.MAGENTA_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> LIGHT_BLUE_STAINED_GLASS_PANE = new Block<>(471, NamespacedKey.parse("minecraft:light_blue_stained_glass_pane"), () -> new StainedGlassPaneData(10277), Item.LIGHT_BLUE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> YELLOW_STAINED_GLASS_PANE = new Block<>(472, NamespacedKey.parse("minecraft:yellow_stained_glass_pane"), () -> new StainedGlassPaneData(10309), Item.YELLOW_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> LIME_STAINED_GLASS_PANE = new Block<>(473, NamespacedKey.parse("minecraft:lime_stained_glass_pane"), () -> new StainedGlassPaneData(10341), Item.LIME_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> PINK_STAINED_GLASS_PANE = new Block<>(474, NamespacedKey.parse("minecraft:pink_stained_glass_pane"), () -> new StainedGlassPaneData(10373), Item.PINK_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> GRAY_STAINED_GLASS_PANE = new Block<>(475, NamespacedKey.parse("minecraft:gray_stained_glass_pane"), () -> new StainedGlassPaneData(10405), Item.GRAY_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> LIGHT_GRAY_STAINED_GLASS_PANE = new Block<>(476, NamespacedKey.parse("minecraft:light_gray_stained_glass_pane"), () -> new StainedGlassPaneData(10437), Item.LIGHT_GRAY_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> CYAN_STAINED_GLASS_PANE = new Block<>(477, NamespacedKey.parse("minecraft:cyan_stained_glass_pane"), () -> new StainedGlassPaneData(10469), Item.CYAN_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> PURPLE_STAINED_GLASS_PANE = new Block<>(478, NamespacedKey.parse("minecraft:purple_stained_glass_pane"), () -> new StainedGlassPaneData(10501), Item.PURPLE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> BLUE_STAINED_GLASS_PANE = new Block<>(479, NamespacedKey.parse("minecraft:blue_stained_glass_pane"), () -> new StainedGlassPaneData(10533), Item.BLUE_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> BROWN_STAINED_GLASS_PANE = new Block<>(480, NamespacedKey.parse("minecraft:brown_stained_glass_pane"), () -> new StainedGlassPaneData(10565), Item.BROWN_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> GREEN_STAINED_GLASS_PANE = new Block<>(481, NamespacedKey.parse("minecraft:green_stained_glass_pane"), () -> new StainedGlassPaneData(10597), Item.GREEN_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> RED_STAINED_GLASS_PANE = new Block<>(482, NamespacedKey.parse("minecraft:red_stained_glass_pane"), () -> new StainedGlassPaneData(10629), Item.RED_STAINED_GLASS_PANE);

    public static final Block<StainedGlassPaneData> BLACK_STAINED_GLASS_PANE = new Block<>(483, NamespacedKey.parse("minecraft:black_stained_glass_pane"), () -> new StainedGlassPaneData(10661), Item.BLACK_STAINED_GLASS_PANE);

    public static final Block<StairData> ACACIA_STAIRS = new Block<>(484, NamespacedKey.parse("minecraft:acacia_stairs"), () -> new StairData(10693), Item.ACACIA_STAIRS);

    public static final Block<StairData> CHERRY_STAIRS = new Block<>(485, NamespacedKey.parse("minecraft:cherry_stairs"), () -> new StairData(10773), Item.CHERRY_STAIRS);

    public static final Block<StairData> DARK_OAK_STAIRS = new Block<>(486, NamespacedKey.parse("minecraft:dark_oak_stairs"), () -> new StairData(10853), Item.DARK_OAK_STAIRS);

    public static final Block<StairData> PALE_OAK_STAIRS = new Block<>(487, NamespacedKey.parse("minecraft:pale_oak_stairs"), () -> new StairData(10933), Item.PALE_OAK_STAIRS);

    public static final Block<StairData> MANGROVE_STAIRS = new Block<>(488, NamespacedKey.parse("minecraft:mangrove_stairs"), () -> new StairData(11013), Item.MANGROVE_STAIRS);

    public static final Block<StairData> BAMBOO_STAIRS = new Block<>(489, NamespacedKey.parse("minecraft:bamboo_stairs"), () -> new StairData(11093), Item.BAMBOO_STAIRS);

    public static final Block<StairData> BAMBOO_MOSAIC_STAIRS = new Block<>(490, NamespacedKey.parse("minecraft:bamboo_mosaic_stairs"), () -> new StairData(11173), Item.BAMBOO_MOSAIC_STAIRS);

    public static final Block<BlockData> SLIME_BLOCK = new Block<>(491, NamespacedKey.parse("minecraft:slime_block"), () -> new BlockData(11253), Item.SLIME_BLOCK);

    public static final Block<BarrierData> BARRIER = new Block<>(492, NamespacedKey.parse("minecraft:barrier"), () -> new BarrierData(11254), Item.BARRIER);

    public static final Block<LightData> LIGHT = new Block<>(493, NamespacedKey.parse("minecraft:light"), () -> new LightData(11256), Item.LIGHT);

    public static final Block<TrapdoorData> IRON_TRAPDOOR = new Block<>(494, NamespacedKey.parse("minecraft:iron_trapdoor"), () -> new TrapdoorData(11288), Item.IRON_TRAPDOOR);

    public static final Block<BlockData> PRISMARINE = new Block<>(495, NamespacedKey.parse("minecraft:prismarine"), () -> new BlockData(11352), Item.PRISMARINE);

    public static final Block<BlockData> PRISMARINE_BRICKS = new Block<>(496, NamespacedKey.parse("minecraft:prismarine_bricks"), () -> new BlockData(11353), Item.PRISMARINE_BRICKS);

    public static final Block<BlockData> DARK_PRISMARINE = new Block<>(497, NamespacedKey.parse("minecraft:dark_prismarine"), () -> new BlockData(11354), Item.DARK_PRISMARINE);

    public static final Block<StairData> PRISMARINE_STAIRS = new Block<>(498, NamespacedKey.parse("minecraft:prismarine_stairs"), () -> new StairData(11355), Item.PRISMARINE_STAIRS);

    public static final Block<StairData> PRISMARINE_BRICK_STAIRS = new Block<>(499, NamespacedKey.parse("minecraft:prismarine_brick_stairs"), () -> new StairData(11435), Item.PRISMARINE_BRICK_STAIRS);

    public static final Block<StairData> DARK_PRISMARINE_STAIRS = new Block<>(500, NamespacedKey.parse("minecraft:dark_prismarine_stairs"), () -> new StairData(11515), Item.DARK_PRISMARINE_STAIRS);

    public static final Block<SlabData> PRISMARINE_SLAB = new Block<>(501, NamespacedKey.parse("minecraft:prismarine_slab"), () -> new SlabData(11595), Item.PRISMARINE_SLAB);

    public static final Block<SlabData> PRISMARINE_BRICK_SLAB = new Block<>(502, NamespacedKey.parse("minecraft:prismarine_brick_slab"), () -> new SlabData(11601), Item.PRISMARINE_BRICK_SLAB);

    public static final Block<SlabData> DARK_PRISMARINE_SLAB = new Block<>(503, NamespacedKey.parse("minecraft:dark_prismarine_slab"), () -> new SlabData(11607), Item.DARK_PRISMARINE_SLAB);

    public static final Block<BlockData> SEA_LANTERN = new Block<>(504, NamespacedKey.parse("minecraft:sea_lantern"), () -> new BlockData(11613), Item.SEA_LANTERN);

    public static final Block<HayData> HAY_BLOCK = new Block<>(505, NamespacedKey.parse("minecraft:hay_block"), () -> new HayData(11614), Item.HAY_BLOCK);

    public static final Block<BlockData> WHITE_CARPET = new Block<>(506, NamespacedKey.parse("minecraft:white_carpet"), () -> new BlockData(11617), Item.WHITE_CARPET);

    public static final Block<BlockData> ORANGE_CARPET = new Block<>(507, NamespacedKey.parse("minecraft:orange_carpet"), () -> new BlockData(11618), Item.ORANGE_CARPET);

    public static final Block<BlockData> MAGENTA_CARPET = new Block<>(508, NamespacedKey.parse("minecraft:magenta_carpet"), () -> new BlockData(11619), Item.MAGENTA_CARPET);

    public static final Block<BlockData> LIGHT_BLUE_CARPET = new Block<>(509, NamespacedKey.parse("minecraft:light_blue_carpet"), () -> new BlockData(11620), Item.LIGHT_BLUE_CARPET);

    public static final Block<BlockData> YELLOW_CARPET = new Block<>(510, NamespacedKey.parse("minecraft:yellow_carpet"), () -> new BlockData(11621), Item.YELLOW_CARPET);

    public static final Block<BlockData> LIME_CARPET = new Block<>(511, NamespacedKey.parse("minecraft:lime_carpet"), () -> new BlockData(11622), Item.LIME_CARPET);

    public static final Block<BlockData> PINK_CARPET = new Block<>(512, NamespacedKey.parse("minecraft:pink_carpet"), () -> new BlockData(11623), Item.PINK_CARPET);

    public static final Block<BlockData> GRAY_CARPET = new Block<>(513, NamespacedKey.parse("minecraft:gray_carpet"), () -> new BlockData(11624), Item.GRAY_CARPET);

    public static final Block<BlockData> LIGHT_GRAY_CARPET = new Block<>(514, NamespacedKey.parse("minecraft:light_gray_carpet"), () -> new BlockData(11625), Item.LIGHT_GRAY_CARPET);

    public static final Block<BlockData> CYAN_CARPET = new Block<>(515, NamespacedKey.parse("minecraft:cyan_carpet"), () -> new BlockData(11626), Item.CYAN_CARPET);

    public static final Block<BlockData> PURPLE_CARPET = new Block<>(516, NamespacedKey.parse("minecraft:purple_carpet"), () -> new BlockData(11627), Item.PURPLE_CARPET);

    public static final Block<BlockData> BLUE_CARPET = new Block<>(517, NamespacedKey.parse("minecraft:blue_carpet"), () -> new BlockData(11628), Item.BLUE_CARPET);

    public static final Block<BlockData> BROWN_CARPET = new Block<>(518, NamespacedKey.parse("minecraft:brown_carpet"), () -> new BlockData(11629), Item.BROWN_CARPET);

    public static final Block<BlockData> GREEN_CARPET = new Block<>(519, NamespacedKey.parse("minecraft:green_carpet"), () -> new BlockData(11630), Item.GREEN_CARPET);

    public static final Block<BlockData> RED_CARPET = new Block<>(520, NamespacedKey.parse("minecraft:red_carpet"), () -> new BlockData(11631), Item.RED_CARPET);

    public static final Block<BlockData> BLACK_CARPET = new Block<>(521, NamespacedKey.parse("minecraft:black_carpet"), () -> new BlockData(11632), Item.BLACK_CARPET);

    public static final Block<BlockData> TERRACOTTA = new Block<>(522, NamespacedKey.parse("minecraft:terracotta"), () -> new BlockData(11633), Item.TERRACOTTA);

    public static final Block<BlockData> COAL_BLOCK = new Block<>(523, NamespacedKey.parse("minecraft:coal_block"), () -> new BlockData(11634), Item.COAL_BLOCK);

    public static final Block<BlockData> PACKED_ICE = new Block<>(524, NamespacedKey.parse("minecraft:packed_ice"), () -> new BlockData(11635), Item.PACKED_ICE);

    public static final Block<TallFlowerData> SUNFLOWER = new Block<>(525, NamespacedKey.parse("minecraft:sunflower"), () -> new TallFlowerData(11636), Item.SUNFLOWER);

    public static final Block<TallFlowerData> LILAC = new Block<>(526, NamespacedKey.parse("minecraft:lilac"), () -> new TallFlowerData(11638), Item.LILAC);

    public static final Block<TallFlowerData> ROSE_BUSH = new Block<>(527, NamespacedKey.parse("minecraft:rose_bush"), () -> new TallFlowerData(11640), Item.ROSE_BUSH);

    public static final Block<TallFlowerData> PEONY = new Block<>(528, NamespacedKey.parse("minecraft:peony"), () -> new TallFlowerData(11642), Item.PEONY);

    public static final Block<DoublePlantData> TALL_GRASS = new Block<>(529, NamespacedKey.parse("minecraft:tall_grass"), () -> new DoublePlantData(11644), Item.TALL_GRASS);

    public static final Block<DoublePlantData> LARGE_FERN = new Block<>(530, NamespacedKey.parse("minecraft:large_fern"), () -> new DoublePlantData(11646), Item.LARGE_FERN);

    public static final Block<BannerData> WHITE_BANNER = new Block<>(531, NamespacedKey.parse("minecraft:white_banner"), () -> new BannerData(11648), Item.WHITE_BANNER);

    public static final Block<BannerData> ORANGE_BANNER = new Block<>(532, NamespacedKey.parse("minecraft:orange_banner"), () -> new BannerData(11664), Item.ORANGE_BANNER);

    public static final Block<BannerData> MAGENTA_BANNER = new Block<>(533, NamespacedKey.parse("minecraft:magenta_banner"), () -> new BannerData(11680), Item.MAGENTA_BANNER);

    public static final Block<BannerData> LIGHT_BLUE_BANNER = new Block<>(534, NamespacedKey.parse("minecraft:light_blue_banner"), () -> new BannerData(11696), Item.LIGHT_BLUE_BANNER);

    public static final Block<BannerData> YELLOW_BANNER = new Block<>(535, NamespacedKey.parse("minecraft:yellow_banner"), () -> new BannerData(11712), Item.YELLOW_BANNER);

    public static final Block<BannerData> LIME_BANNER = new Block<>(536, NamespacedKey.parse("minecraft:lime_banner"), () -> new BannerData(11728), Item.LIME_BANNER);

    public static final Block<BannerData> PINK_BANNER = new Block<>(537, NamespacedKey.parse("minecraft:pink_banner"), () -> new BannerData(11744), Item.PINK_BANNER);

    public static final Block<BannerData> GRAY_BANNER = new Block<>(538, NamespacedKey.parse("minecraft:gray_banner"), () -> new BannerData(11760), Item.GRAY_BANNER);

    public static final Block<BannerData> LIGHT_GRAY_BANNER = new Block<>(539, NamespacedKey.parse("minecraft:light_gray_banner"), () -> new BannerData(11776), Item.LIGHT_GRAY_BANNER);

    public static final Block<BannerData> CYAN_BANNER = new Block<>(540, NamespacedKey.parse("minecraft:cyan_banner"), () -> new BannerData(11792), Item.CYAN_BANNER);

    public static final Block<BannerData> PURPLE_BANNER = new Block<>(541, NamespacedKey.parse("minecraft:purple_banner"), () -> new BannerData(11808), Item.PURPLE_BANNER);

    public static final Block<BannerData> BLUE_BANNER = new Block<>(542, NamespacedKey.parse("minecraft:blue_banner"), () -> new BannerData(11824), Item.BLUE_BANNER);

    public static final Block<BannerData> BROWN_BANNER = new Block<>(543, NamespacedKey.parse("minecraft:brown_banner"), () -> new BannerData(11840), Item.BROWN_BANNER);

    public static final Block<BannerData> GREEN_BANNER = new Block<>(544, NamespacedKey.parse("minecraft:green_banner"), () -> new BannerData(11856), Item.GREEN_BANNER);

    public static final Block<BannerData> RED_BANNER = new Block<>(545, NamespacedKey.parse("minecraft:red_banner"), () -> new BannerData(11872), Item.RED_BANNER);

    public static final Block<BannerData> BLACK_BANNER = new Block<>(546, NamespacedKey.parse("minecraft:black_banner"), () -> new BannerData(11888), Item.BLACK_BANNER);

    public static final Block<WallBannerData> WHITE_WALL_BANNER = new Block<>(547, NamespacedKey.parse("minecraft:white_wall_banner"), () -> new WallBannerData(11904), null);

    public static final Block<WallBannerData> ORANGE_WALL_BANNER = new Block<>(548, NamespacedKey.parse("minecraft:orange_wall_banner"), () -> new WallBannerData(11908), null);

    public static final Block<WallBannerData> MAGENTA_WALL_BANNER = new Block<>(549, NamespacedKey.parse("minecraft:magenta_wall_banner"), () -> new WallBannerData(11912), null);

    public static final Block<WallBannerData> LIGHT_BLUE_WALL_BANNER = new Block<>(550, NamespacedKey.parse("minecraft:light_blue_wall_banner"), () -> new WallBannerData(11916), null);

    public static final Block<WallBannerData> YELLOW_WALL_BANNER = new Block<>(551, NamespacedKey.parse("minecraft:yellow_wall_banner"), () -> new WallBannerData(11920), null);

    public static final Block<WallBannerData> LIME_WALL_BANNER = new Block<>(552, NamespacedKey.parse("minecraft:lime_wall_banner"), () -> new WallBannerData(11924), null);

    public static final Block<WallBannerData> PINK_WALL_BANNER = new Block<>(553, NamespacedKey.parse("minecraft:pink_wall_banner"), () -> new WallBannerData(11928), null);

    public static final Block<WallBannerData> GRAY_WALL_BANNER = new Block<>(554, NamespacedKey.parse("minecraft:gray_wall_banner"), () -> new WallBannerData(11932), null);

    public static final Block<WallBannerData> LIGHT_GRAY_WALL_BANNER = new Block<>(555, NamespacedKey.parse("minecraft:light_gray_wall_banner"), () -> new WallBannerData(11936), null);

    public static final Block<WallBannerData> CYAN_WALL_BANNER = new Block<>(556, NamespacedKey.parse("minecraft:cyan_wall_banner"), () -> new WallBannerData(11940), null);

    public static final Block<WallBannerData> PURPLE_WALL_BANNER = new Block<>(557, NamespacedKey.parse("minecraft:purple_wall_banner"), () -> new WallBannerData(11944), null);

    public static final Block<WallBannerData> BLUE_WALL_BANNER = new Block<>(558, NamespacedKey.parse("minecraft:blue_wall_banner"), () -> new WallBannerData(11948), null);

    public static final Block<WallBannerData> BROWN_WALL_BANNER = new Block<>(559, NamespacedKey.parse("minecraft:brown_wall_banner"), () -> new WallBannerData(11952), null);

    public static final Block<WallBannerData> GREEN_WALL_BANNER = new Block<>(560, NamespacedKey.parse("minecraft:green_wall_banner"), () -> new WallBannerData(11956), null);

    public static final Block<WallBannerData> RED_WALL_BANNER = new Block<>(561, NamespacedKey.parse("minecraft:red_wall_banner"), () -> new WallBannerData(11960), null);

    public static final Block<WallBannerData> BLACK_WALL_BANNER = new Block<>(562, NamespacedKey.parse("minecraft:black_wall_banner"), () -> new WallBannerData(11964), null);

    public static final Block<BlockData> RED_SANDSTONE = new Block<>(563, NamespacedKey.parse("minecraft:red_sandstone"), () -> new BlockData(11968), Item.RED_SANDSTONE);

    public static final Block<BlockData> CHISELED_RED_SANDSTONE = new Block<>(564, NamespacedKey.parse("minecraft:chiseled_red_sandstone"), () -> new BlockData(11969), Item.CHISELED_RED_SANDSTONE);

    public static final Block<BlockData> CUT_RED_SANDSTONE = new Block<>(565, NamespacedKey.parse("minecraft:cut_red_sandstone"), () -> new BlockData(11970), Item.CUT_RED_SANDSTONE);

    public static final Block<StairData> RED_SANDSTONE_STAIRS = new Block<>(566, NamespacedKey.parse("minecraft:red_sandstone_stairs"), () -> new StairData(11971), Item.RED_SANDSTONE_STAIRS);

    public static final Block<SlabData> OAK_SLAB = new Block<>(567, NamespacedKey.parse("minecraft:oak_slab"), () -> new SlabData(12051), Item.OAK_SLAB);

    public static final Block<SlabData> SPRUCE_SLAB = new Block<>(568, NamespacedKey.parse("minecraft:spruce_slab"), () -> new SlabData(12057), Item.SPRUCE_SLAB);

    public static final Block<SlabData> BIRCH_SLAB = new Block<>(569, NamespacedKey.parse("minecraft:birch_slab"), () -> new SlabData(12063), Item.BIRCH_SLAB);

    public static final Block<SlabData> JUNGLE_SLAB = new Block<>(570, NamespacedKey.parse("minecraft:jungle_slab"), () -> new SlabData(12069), Item.JUNGLE_SLAB);

    public static final Block<SlabData> ACACIA_SLAB = new Block<>(571, NamespacedKey.parse("minecraft:acacia_slab"), () -> new SlabData(12075), Item.ACACIA_SLAB);

    public static final Block<SlabData> CHERRY_SLAB = new Block<>(572, NamespacedKey.parse("minecraft:cherry_slab"), () -> new SlabData(12081), Item.CHERRY_SLAB);

    public static final Block<SlabData> DARK_OAK_SLAB = new Block<>(573, NamespacedKey.parse("minecraft:dark_oak_slab"), () -> new SlabData(12087), Item.DARK_OAK_SLAB);

    public static final Block<SlabData> PALE_OAK_SLAB = new Block<>(574, NamespacedKey.parse("minecraft:pale_oak_slab"), () -> new SlabData(12093), Item.PALE_OAK_SLAB);

    public static final Block<SlabData> MANGROVE_SLAB = new Block<>(575, NamespacedKey.parse("minecraft:mangrove_slab"), () -> new SlabData(12099), Item.MANGROVE_SLAB);

    public static final Block<SlabData> BAMBOO_SLAB = new Block<>(576, NamespacedKey.parse("minecraft:bamboo_slab"), () -> new SlabData(12105), Item.BAMBOO_SLAB);

    public static final Block<SlabData> BAMBOO_MOSAIC_SLAB = new Block<>(577, NamespacedKey.parse("minecraft:bamboo_mosaic_slab"), () -> new SlabData(12111), Item.BAMBOO_MOSAIC_SLAB);

    public static final Block<SlabData> STONE_SLAB = new Block<>(578, NamespacedKey.parse("minecraft:stone_slab"), () -> new SlabData(12117), Item.STONE_SLAB);

    public static final Block<SlabData> SMOOTH_STONE_SLAB = new Block<>(579, NamespacedKey.parse("minecraft:smooth_stone_slab"), () -> new SlabData(12123), Item.SMOOTH_STONE_SLAB);

    public static final Block<SlabData> SANDSTONE_SLAB = new Block<>(580, NamespacedKey.parse("minecraft:sandstone_slab"), () -> new SlabData(12129), Item.SANDSTONE_SLAB);

    public static final Block<SlabData> CUT_SANDSTONE_SLAB = new Block<>(581, NamespacedKey.parse("minecraft:cut_sandstone_slab"), () -> new SlabData(12135), Item.CUT_SANDSTONE_SLAB);

    public static final Block<SlabData> PETRIFIED_OAK_SLAB = new Block<>(582, NamespacedKey.parse("minecraft:petrified_oak_slab"), () -> new SlabData(12141), Item.PETRIFIED_OAK_SLAB);

    public static final Block<SlabData> COBBLESTONE_SLAB = new Block<>(583, NamespacedKey.parse("minecraft:cobblestone_slab"), () -> new SlabData(12147), Item.COBBLESTONE_SLAB);

    public static final Block<SlabData> BRICK_SLAB = new Block<>(584, NamespacedKey.parse("minecraft:brick_slab"), () -> new SlabData(12153), Item.BRICK_SLAB);

    public static final Block<SlabData> STONE_BRICK_SLAB = new Block<>(585, NamespacedKey.parse("minecraft:stone_brick_slab"), () -> new SlabData(12159), Item.STONE_BRICK_SLAB);

    public static final Block<SlabData> MUD_BRICK_SLAB = new Block<>(586, NamespacedKey.parse("minecraft:mud_brick_slab"), () -> new SlabData(12165), Item.MUD_BRICK_SLAB);

    public static final Block<SlabData> NETHER_BRICK_SLAB = new Block<>(587, NamespacedKey.parse("minecraft:nether_brick_slab"), () -> new SlabData(12171), Item.NETHER_BRICK_SLAB);

    public static final Block<SlabData> QUARTZ_SLAB = new Block<>(588, NamespacedKey.parse("minecraft:quartz_slab"), () -> new SlabData(12177), Item.QUARTZ_SLAB);

    public static final Block<SlabData> RED_SANDSTONE_SLAB = new Block<>(589, NamespacedKey.parse("minecraft:red_sandstone_slab"), () -> new SlabData(12183), Item.RED_SANDSTONE_SLAB);

    public static final Block<SlabData> CUT_RED_SANDSTONE_SLAB = new Block<>(590, NamespacedKey.parse("minecraft:cut_red_sandstone_slab"), () -> new SlabData(12189), Item.CUT_RED_SANDSTONE_SLAB);

    public static final Block<SlabData> PURPUR_SLAB = new Block<>(591, NamespacedKey.parse("minecraft:purpur_slab"), () -> new SlabData(12195), Item.PURPUR_SLAB);

    public static final Block<BlockData> SMOOTH_STONE = new Block<>(592, NamespacedKey.parse("minecraft:smooth_stone"), () -> new BlockData(12201), Item.SMOOTH_STONE);

    public static final Block<BlockData> SMOOTH_SANDSTONE = new Block<>(593, NamespacedKey.parse("minecraft:smooth_sandstone"), () -> new BlockData(12202), Item.SMOOTH_SANDSTONE);

    public static final Block<BlockData> SMOOTH_QUARTZ = new Block<>(594, NamespacedKey.parse("minecraft:smooth_quartz"), () -> new BlockData(12203), Item.SMOOTH_QUARTZ);

    public static final Block<BlockData> SMOOTH_RED_SANDSTONE = new Block<>(595, NamespacedKey.parse("minecraft:smooth_red_sandstone"), () -> new BlockData(12204), Item.SMOOTH_RED_SANDSTONE);

    public static final Block<FenceGateData> SPRUCE_FENCE_GATE = new Block<>(596, NamespacedKey.parse("minecraft:spruce_fence_gate"), () -> new FenceGateData(12205), Item.SPRUCE_FENCE_GATE);

    public static final Block<FenceGateData> BIRCH_FENCE_GATE = new Block<>(597, NamespacedKey.parse("minecraft:birch_fence_gate"), () -> new FenceGateData(12237), Item.BIRCH_FENCE_GATE);

    public static final Block<FenceGateData> JUNGLE_FENCE_GATE = new Block<>(598, NamespacedKey.parse("minecraft:jungle_fence_gate"), () -> new FenceGateData(12269), Item.JUNGLE_FENCE_GATE);

    public static final Block<FenceGateData> ACACIA_FENCE_GATE = new Block<>(599, NamespacedKey.parse("minecraft:acacia_fence_gate"), () -> new FenceGateData(12301), Item.ACACIA_FENCE_GATE);

    public static final Block<FenceGateData> CHERRY_FENCE_GATE = new Block<>(600, NamespacedKey.parse("minecraft:cherry_fence_gate"), () -> new FenceGateData(12333), Item.CHERRY_FENCE_GATE);

    public static final Block<FenceGateData> DARK_OAK_FENCE_GATE = new Block<>(601, NamespacedKey.parse("minecraft:dark_oak_fence_gate"), () -> new FenceGateData(12365), Item.DARK_OAK_FENCE_GATE);

    public static final Block<FenceGateData> PALE_OAK_FENCE_GATE = new Block<>(602, NamespacedKey.parse("minecraft:pale_oak_fence_gate"), () -> new FenceGateData(12397), Item.PALE_OAK_FENCE_GATE);

    public static final Block<FenceGateData> MANGROVE_FENCE_GATE = new Block<>(603, NamespacedKey.parse("minecraft:mangrove_fence_gate"), () -> new FenceGateData(12429), Item.MANGROVE_FENCE_GATE);

    public static final Block<FenceGateData> BAMBOO_FENCE_GATE = new Block<>(604, NamespacedKey.parse("minecraft:bamboo_fence_gate"), () -> new FenceGateData(12461), Item.BAMBOO_FENCE_GATE);

    public static final Block<FenceData> SPRUCE_FENCE = new Block<>(605, NamespacedKey.parse("minecraft:spruce_fence"), () -> new FenceData(12493), Item.SPRUCE_FENCE);

    public static final Block<FenceData> BIRCH_FENCE = new Block<>(606, NamespacedKey.parse("minecraft:birch_fence"), () -> new FenceData(12525), Item.BIRCH_FENCE);

    public static final Block<FenceData> JUNGLE_FENCE = new Block<>(607, NamespacedKey.parse("minecraft:jungle_fence"), () -> new FenceData(12557), Item.JUNGLE_FENCE);

    public static final Block<FenceData> ACACIA_FENCE = new Block<>(608, NamespacedKey.parse("minecraft:acacia_fence"), () -> new FenceData(12589), Item.ACACIA_FENCE);

    public static final Block<FenceData> CHERRY_FENCE = new Block<>(609, NamespacedKey.parse("minecraft:cherry_fence"), () -> new FenceData(12621), Item.CHERRY_FENCE);

    public static final Block<FenceData> DARK_OAK_FENCE = new Block<>(610, NamespacedKey.parse("minecraft:dark_oak_fence"), () -> new FenceData(12653), Item.DARK_OAK_FENCE);

    public static final Block<FenceData> PALE_OAK_FENCE = new Block<>(611, NamespacedKey.parse("minecraft:pale_oak_fence"), () -> new FenceData(12685), Item.PALE_OAK_FENCE);

    public static final Block<FenceData> MANGROVE_FENCE = new Block<>(612, NamespacedKey.parse("minecraft:mangrove_fence"), () -> new FenceData(12717), Item.MANGROVE_FENCE);

    public static final Block<FenceData> BAMBOO_FENCE = new Block<>(613, NamespacedKey.parse("minecraft:bamboo_fence"), () -> new FenceData(12749), Item.BAMBOO_FENCE);

    public static final Block<DoorData> SPRUCE_DOOR = new Block<>(614, NamespacedKey.parse("minecraft:spruce_door"), () -> new DoorData(12781), Item.SPRUCE_DOOR);

    public static final Block<DoorData> BIRCH_DOOR = new Block<>(615, NamespacedKey.parse("minecraft:birch_door"), () -> new DoorData(12845), Item.BIRCH_DOOR);

    public static final Block<DoorData> JUNGLE_DOOR = new Block<>(616, NamespacedKey.parse("minecraft:jungle_door"), () -> new DoorData(12909), Item.JUNGLE_DOOR);

    public static final Block<DoorData> ACACIA_DOOR = new Block<>(617, NamespacedKey.parse("minecraft:acacia_door"), () -> new DoorData(12973), Item.ACACIA_DOOR);

    public static final Block<DoorData> CHERRY_DOOR = new Block<>(618, NamespacedKey.parse("minecraft:cherry_door"), () -> new DoorData(13037), Item.CHERRY_DOOR);

    public static final Block<DoorData> DARK_OAK_DOOR = new Block<>(619, NamespacedKey.parse("minecraft:dark_oak_door"), () -> new DoorData(13101), Item.DARK_OAK_DOOR);

    public static final Block<DoorData> PALE_OAK_DOOR = new Block<>(620, NamespacedKey.parse("minecraft:pale_oak_door"), () -> new DoorData(13165), Item.PALE_OAK_DOOR);

    public static final Block<DoorData> MANGROVE_DOOR = new Block<>(621, NamespacedKey.parse("minecraft:mangrove_door"), () -> new DoorData(13229), Item.MANGROVE_DOOR);

    public static final Block<DoorData> BAMBOO_DOOR = new Block<>(622, NamespacedKey.parse("minecraft:bamboo_door"), () -> new DoorData(13293), Item.BAMBOO_DOOR);

    public static final Block<EndRodData> END_ROD = new Block<>(623, NamespacedKey.parse("minecraft:end_rod"), () -> new EndRodData(13357), Item.END_ROD);

    public static final Block<ChorusPlantData> CHORUS_PLANT = new Block<>(624, NamespacedKey.parse("minecraft:chorus_plant"), () -> new ChorusPlantData(13363), Item.CHORUS_PLANT);

    public static final Block<ChorusFlowerData> CHORUS_FLOWER = new Block<>(625, NamespacedKey.parse("minecraft:chorus_flower"), () -> new ChorusFlowerData(13427), Item.CHORUS_FLOWER);

    public static final Block<BlockData> PURPUR_BLOCK = new Block<>(626, NamespacedKey.parse("minecraft:purpur_block"), () -> new BlockData(13433), Item.PURPUR_BLOCK);

    public static final Block<RotatedPillarData> PURPUR_PILLAR = new Block<>(627, NamespacedKey.parse("minecraft:purpur_pillar"), () -> new RotatedPillarData(13434), Item.PURPUR_PILLAR);

    public static final Block<StairData> PURPUR_STAIRS = new Block<>(628, NamespacedKey.parse("minecraft:purpur_stairs"), () -> new StairData(13437), Item.PURPUR_STAIRS);

    public static final Block<BlockData> END_STONE_BRICKS = new Block<>(629, NamespacedKey.parse("minecraft:end_stone_bricks"), () -> new BlockData(13517), Item.END_STONE_BRICKS);

    public static final Block<TorchflowerCropData> TORCHFLOWER_CROP = new Block<>(630, NamespacedKey.parse("minecraft:torchflower_crop"), () -> new TorchflowerCropData(13518), null);

    public static final Block<PitcherCropData> PITCHER_CROP = new Block<>(631, NamespacedKey.parse("minecraft:pitcher_crop"), () -> new PitcherCropData(13520), null);

    public static final Block<DoublePlantData> PITCHER_PLANT = new Block<>(632, NamespacedKey.parse("minecraft:pitcher_plant"), () -> new DoublePlantData(13530), Item.PITCHER_PLANT);

    public static final Block<BeetrootData> BEETROOTS = new Block<>(633, NamespacedKey.parse("minecraft:beetroots"), () -> new BeetrootData(13532), null);

    public static final Block<BlockData> DIRT_PATH = new Block<>(634, NamespacedKey.parse("minecraft:dirt_path"), () -> new BlockData(13536), Item.DIRT_PATH);

    public static final Block<BlockData> END_GATEWAY = new Block<>(635, NamespacedKey.parse("minecraft:end_gateway"), () -> new BlockData(13537), null);

    public static final Block<CommandData> REPEATING_COMMAND_BLOCK = new Block<>(636, NamespacedKey.parse("minecraft:repeating_command_block"), () -> new CommandData(13538), Item.REPEATING_COMMAND_BLOCK);

    public static final Block<CommandData> CHAIN_COMMAND_BLOCK = new Block<>(637, NamespacedKey.parse("minecraft:chain_command_block"), () -> new CommandData(13550), Item.CHAIN_COMMAND_BLOCK);

    public static final Block<FrostedIceData> FROSTED_ICE = new Block<>(638, NamespacedKey.parse("minecraft:frosted_ice"), () -> new FrostedIceData(13562), null);

    public static final Block<BlockData> MAGMA_BLOCK = new Block<>(639, NamespacedKey.parse("minecraft:magma_block"), () -> new BlockData(13566), Item.MAGMA_BLOCK);

    public static final Block<BlockData> NETHER_WART_BLOCK = new Block<>(640, NamespacedKey.parse("minecraft:nether_wart_block"), () -> new BlockData(13567), Item.NETHER_WART_BLOCK);

    public static final Block<BlockData> RED_NETHER_BRICKS = new Block<>(641, NamespacedKey.parse("minecraft:red_nether_bricks"), () -> new BlockData(13568), Item.RED_NETHER_BRICKS);

    public static final Block<RotatedPillarData> BONE_BLOCK = new Block<>(642, NamespacedKey.parse("minecraft:bone_block"), () -> new RotatedPillarData(13569), Item.BONE_BLOCK);

    public static final Block<BlockData> STRUCTURE_VOID = new Block<>(643, NamespacedKey.parse("minecraft:structure_void"), () -> new BlockData(13572), Item.STRUCTURE_VOID);

    public static final Block<ObserverData> OBSERVER = new Block<>(644, NamespacedKey.parse("minecraft:observer"), () -> new ObserverData(13573), Item.OBSERVER);

    public static final Block<ShulkerBoxData> SHULKER_BOX = new Block<>(645, NamespacedKey.parse("minecraft:shulker_box"), () -> new ShulkerBoxData(13585), Item.SHULKER_BOX);

    public static final Block<ShulkerBoxData> WHITE_SHULKER_BOX = new Block<>(646, NamespacedKey.parse("minecraft:white_shulker_box"), () -> new ShulkerBoxData(13591), Item.WHITE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> ORANGE_SHULKER_BOX = new Block<>(647, NamespacedKey.parse("minecraft:orange_shulker_box"), () -> new ShulkerBoxData(13597), Item.ORANGE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> MAGENTA_SHULKER_BOX = new Block<>(648, NamespacedKey.parse("minecraft:magenta_shulker_box"), () -> new ShulkerBoxData(13603), Item.MAGENTA_SHULKER_BOX);

    public static final Block<ShulkerBoxData> LIGHT_BLUE_SHULKER_BOX = new Block<>(649, NamespacedKey.parse("minecraft:light_blue_shulker_box"), () -> new ShulkerBoxData(13609), Item.LIGHT_BLUE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> YELLOW_SHULKER_BOX = new Block<>(650, NamespacedKey.parse("minecraft:yellow_shulker_box"), () -> new ShulkerBoxData(13615), Item.YELLOW_SHULKER_BOX);

    public static final Block<ShulkerBoxData> LIME_SHULKER_BOX = new Block<>(651, NamespacedKey.parse("minecraft:lime_shulker_box"), () -> new ShulkerBoxData(13621), Item.LIME_SHULKER_BOX);

    public static final Block<ShulkerBoxData> PINK_SHULKER_BOX = new Block<>(652, NamespacedKey.parse("minecraft:pink_shulker_box"), () -> new ShulkerBoxData(13627), Item.PINK_SHULKER_BOX);

    public static final Block<ShulkerBoxData> GRAY_SHULKER_BOX = new Block<>(653, NamespacedKey.parse("minecraft:gray_shulker_box"), () -> new ShulkerBoxData(13633), Item.GRAY_SHULKER_BOX);

    public static final Block<ShulkerBoxData> LIGHT_GRAY_SHULKER_BOX = new Block<>(654, NamespacedKey.parse("minecraft:light_gray_shulker_box"), () -> new ShulkerBoxData(13639), Item.LIGHT_GRAY_SHULKER_BOX);

    public static final Block<ShulkerBoxData> CYAN_SHULKER_BOX = new Block<>(655, NamespacedKey.parse("minecraft:cyan_shulker_box"), () -> new ShulkerBoxData(13645), Item.CYAN_SHULKER_BOX);

    public static final Block<ShulkerBoxData> PURPLE_SHULKER_BOX = new Block<>(656, NamespacedKey.parse("minecraft:purple_shulker_box"), () -> new ShulkerBoxData(13651), Item.PURPLE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> BLUE_SHULKER_BOX = new Block<>(657, NamespacedKey.parse("minecraft:blue_shulker_box"), () -> new ShulkerBoxData(13657), Item.BLUE_SHULKER_BOX);

    public static final Block<ShulkerBoxData> BROWN_SHULKER_BOX = new Block<>(658, NamespacedKey.parse("minecraft:brown_shulker_box"), () -> new ShulkerBoxData(13663), Item.BROWN_SHULKER_BOX);

    public static final Block<ShulkerBoxData> GREEN_SHULKER_BOX = new Block<>(659, NamespacedKey.parse("minecraft:green_shulker_box"), () -> new ShulkerBoxData(13669), Item.GREEN_SHULKER_BOX);

    public static final Block<ShulkerBoxData> RED_SHULKER_BOX = new Block<>(660, NamespacedKey.parse("minecraft:red_shulker_box"), () -> new ShulkerBoxData(13675), Item.RED_SHULKER_BOX);

    public static final Block<ShulkerBoxData> BLACK_SHULKER_BOX = new Block<>(661, NamespacedKey.parse("minecraft:black_shulker_box"), () -> new ShulkerBoxData(13681), Item.BLACK_SHULKER_BOX);

    public static final Block<GlazedTerracottaData> WHITE_GLAZED_TERRACOTTA = new Block<>(662, NamespacedKey.parse("minecraft:white_glazed_terracotta"), () -> new GlazedTerracottaData(13687), Item.WHITE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> ORANGE_GLAZED_TERRACOTTA = new Block<>(663, NamespacedKey.parse("minecraft:orange_glazed_terracotta"), () -> new GlazedTerracottaData(13691), Item.ORANGE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> MAGENTA_GLAZED_TERRACOTTA = new Block<>(664, NamespacedKey.parse("minecraft:magenta_glazed_terracotta"), () -> new GlazedTerracottaData(13695), Item.MAGENTA_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> LIGHT_BLUE_GLAZED_TERRACOTTA = new Block<>(665, NamespacedKey.parse("minecraft:light_blue_glazed_terracotta"), () -> new GlazedTerracottaData(13699), Item.LIGHT_BLUE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> YELLOW_GLAZED_TERRACOTTA = new Block<>(666, NamespacedKey.parse("minecraft:yellow_glazed_terracotta"), () -> new GlazedTerracottaData(13703), Item.YELLOW_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> LIME_GLAZED_TERRACOTTA = new Block<>(667, NamespacedKey.parse("minecraft:lime_glazed_terracotta"), () -> new GlazedTerracottaData(13707), Item.LIME_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> PINK_GLAZED_TERRACOTTA = new Block<>(668, NamespacedKey.parse("minecraft:pink_glazed_terracotta"), () -> new GlazedTerracottaData(13711), Item.PINK_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> GRAY_GLAZED_TERRACOTTA = new Block<>(669, NamespacedKey.parse("minecraft:gray_glazed_terracotta"), () -> new GlazedTerracottaData(13715), Item.GRAY_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> LIGHT_GRAY_GLAZED_TERRACOTTA = new Block<>(670, NamespacedKey.parse("minecraft:light_gray_glazed_terracotta"), () -> new GlazedTerracottaData(13719), Item.LIGHT_GRAY_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> CYAN_GLAZED_TERRACOTTA = new Block<>(671, NamespacedKey.parse("minecraft:cyan_glazed_terracotta"), () -> new GlazedTerracottaData(13723), Item.CYAN_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> PURPLE_GLAZED_TERRACOTTA = new Block<>(672, NamespacedKey.parse("minecraft:purple_glazed_terracotta"), () -> new GlazedTerracottaData(13727), Item.PURPLE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> BLUE_GLAZED_TERRACOTTA = new Block<>(673, NamespacedKey.parse("minecraft:blue_glazed_terracotta"), () -> new GlazedTerracottaData(13731), Item.BLUE_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> BROWN_GLAZED_TERRACOTTA = new Block<>(674, NamespacedKey.parse("minecraft:brown_glazed_terracotta"), () -> new GlazedTerracottaData(13735), Item.BROWN_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> GREEN_GLAZED_TERRACOTTA = new Block<>(675, NamespacedKey.parse("minecraft:green_glazed_terracotta"), () -> new GlazedTerracottaData(13739), Item.GREEN_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> RED_GLAZED_TERRACOTTA = new Block<>(676, NamespacedKey.parse("minecraft:red_glazed_terracotta"), () -> new GlazedTerracottaData(13743), Item.RED_GLAZED_TERRACOTTA);

    public static final Block<GlazedTerracottaData> BLACK_GLAZED_TERRACOTTA = new Block<>(677, NamespacedKey.parse("minecraft:black_glazed_terracotta"), () -> new GlazedTerracottaData(13747), Item.BLACK_GLAZED_TERRACOTTA);

    public static final Block<BlockData> WHITE_CONCRETE = new Block<>(678, NamespacedKey.parse("minecraft:white_concrete"), () -> new BlockData(13751), Item.WHITE_CONCRETE);

    public static final Block<BlockData> ORANGE_CONCRETE = new Block<>(679, NamespacedKey.parse("minecraft:orange_concrete"), () -> new BlockData(13752), Item.ORANGE_CONCRETE);

    public static final Block<BlockData> MAGENTA_CONCRETE = new Block<>(680, NamespacedKey.parse("minecraft:magenta_concrete"), () -> new BlockData(13753), Item.MAGENTA_CONCRETE);

    public static final Block<BlockData> LIGHT_BLUE_CONCRETE = new Block<>(681, NamespacedKey.parse("minecraft:light_blue_concrete"), () -> new BlockData(13754), Item.LIGHT_BLUE_CONCRETE);

    public static final Block<BlockData> YELLOW_CONCRETE = new Block<>(682, NamespacedKey.parse("minecraft:yellow_concrete"), () -> new BlockData(13755), Item.YELLOW_CONCRETE);

    public static final Block<BlockData> LIME_CONCRETE = new Block<>(683, NamespacedKey.parse("minecraft:lime_concrete"), () -> new BlockData(13756), Item.LIME_CONCRETE);

    public static final Block<BlockData> PINK_CONCRETE = new Block<>(684, NamespacedKey.parse("minecraft:pink_concrete"), () -> new BlockData(13757), Item.PINK_CONCRETE);

    public static final Block<BlockData> GRAY_CONCRETE = new Block<>(685, NamespacedKey.parse("minecraft:gray_concrete"), () -> new BlockData(13758), Item.GRAY_CONCRETE);

    public static final Block<BlockData> LIGHT_GRAY_CONCRETE = new Block<>(686, NamespacedKey.parse("minecraft:light_gray_concrete"), () -> new BlockData(13759), Item.LIGHT_GRAY_CONCRETE);

    public static final Block<BlockData> CYAN_CONCRETE = new Block<>(687, NamespacedKey.parse("minecraft:cyan_concrete"), () -> new BlockData(13760), Item.CYAN_CONCRETE);

    public static final Block<BlockData> PURPLE_CONCRETE = new Block<>(688, NamespacedKey.parse("minecraft:purple_concrete"), () -> new BlockData(13761), Item.PURPLE_CONCRETE);

    public static final Block<BlockData> BLUE_CONCRETE = new Block<>(689, NamespacedKey.parse("minecraft:blue_concrete"), () -> new BlockData(13762), Item.BLUE_CONCRETE);

    public static final Block<BlockData> BROWN_CONCRETE = new Block<>(690, NamespacedKey.parse("minecraft:brown_concrete"), () -> new BlockData(13763), Item.BROWN_CONCRETE);

    public static final Block<BlockData> GREEN_CONCRETE = new Block<>(691, NamespacedKey.parse("minecraft:green_concrete"), () -> new BlockData(13764), Item.GREEN_CONCRETE);

    public static final Block<BlockData> RED_CONCRETE = new Block<>(692, NamespacedKey.parse("minecraft:red_concrete"), () -> new BlockData(13765), Item.RED_CONCRETE);

    public static final Block<BlockData> BLACK_CONCRETE = new Block<>(693, NamespacedKey.parse("minecraft:black_concrete"), () -> new BlockData(13766), Item.BLACK_CONCRETE);

    public static final Block<BlockData> WHITE_CONCRETE_POWDER = new Block<>(694, NamespacedKey.parse("minecraft:white_concrete_powder"), () -> new BlockData(13767), Item.WHITE_CONCRETE_POWDER);

    public static final Block<BlockData> ORANGE_CONCRETE_POWDER = new Block<>(695, NamespacedKey.parse("minecraft:orange_concrete_powder"), () -> new BlockData(13768), Item.ORANGE_CONCRETE_POWDER);

    public static final Block<BlockData> MAGENTA_CONCRETE_POWDER = new Block<>(696, NamespacedKey.parse("minecraft:magenta_concrete_powder"), () -> new BlockData(13769), Item.MAGENTA_CONCRETE_POWDER);

    public static final Block<BlockData> LIGHT_BLUE_CONCRETE_POWDER = new Block<>(697, NamespacedKey.parse("minecraft:light_blue_concrete_powder"), () -> new BlockData(13770), Item.LIGHT_BLUE_CONCRETE_POWDER);

    public static final Block<BlockData> YELLOW_CONCRETE_POWDER = new Block<>(698, NamespacedKey.parse("minecraft:yellow_concrete_powder"), () -> new BlockData(13771), Item.YELLOW_CONCRETE_POWDER);

    public static final Block<BlockData> LIME_CONCRETE_POWDER = new Block<>(699, NamespacedKey.parse("minecraft:lime_concrete_powder"), () -> new BlockData(13772), Item.LIME_CONCRETE_POWDER);

    public static final Block<BlockData> PINK_CONCRETE_POWDER = new Block<>(700, NamespacedKey.parse("minecraft:pink_concrete_powder"), () -> new BlockData(13773), Item.PINK_CONCRETE_POWDER);

    public static final Block<BlockData> GRAY_CONCRETE_POWDER = new Block<>(701, NamespacedKey.parse("minecraft:gray_concrete_powder"), () -> new BlockData(13774), Item.GRAY_CONCRETE_POWDER);

    public static final Block<BlockData> LIGHT_GRAY_CONCRETE_POWDER = new Block<>(702, NamespacedKey.parse("minecraft:light_gray_concrete_powder"), () -> new BlockData(13775), Item.LIGHT_GRAY_CONCRETE_POWDER);

    public static final Block<BlockData> CYAN_CONCRETE_POWDER = new Block<>(703, NamespacedKey.parse("minecraft:cyan_concrete_powder"), () -> new BlockData(13776), Item.CYAN_CONCRETE_POWDER);

    public static final Block<BlockData> PURPLE_CONCRETE_POWDER = new Block<>(704, NamespacedKey.parse("minecraft:purple_concrete_powder"), () -> new BlockData(13777), Item.PURPLE_CONCRETE_POWDER);

    public static final Block<BlockData> BLUE_CONCRETE_POWDER = new Block<>(705, NamespacedKey.parse("minecraft:blue_concrete_powder"), () -> new BlockData(13778), Item.BLUE_CONCRETE_POWDER);

    public static final Block<BlockData> BROWN_CONCRETE_POWDER = new Block<>(706, NamespacedKey.parse("minecraft:brown_concrete_powder"), () -> new BlockData(13779), Item.BROWN_CONCRETE_POWDER);

    public static final Block<BlockData> GREEN_CONCRETE_POWDER = new Block<>(707, NamespacedKey.parse("minecraft:green_concrete_powder"), () -> new BlockData(13780), Item.GREEN_CONCRETE_POWDER);

    public static final Block<BlockData> RED_CONCRETE_POWDER = new Block<>(708, NamespacedKey.parse("minecraft:red_concrete_powder"), () -> new BlockData(13781), Item.RED_CONCRETE_POWDER);

    public static final Block<BlockData> BLACK_CONCRETE_POWDER = new Block<>(709, NamespacedKey.parse("minecraft:black_concrete_powder"), () -> new BlockData(13782), Item.BLACK_CONCRETE_POWDER);

    public static final Block<KelpData> KELP = new Block<>(710, NamespacedKey.parse("minecraft:kelp"), () -> new KelpData(13783), Item.KELP);

    public static final Block<BlockData> KELP_PLANT = new Block<>(711, NamespacedKey.parse("minecraft:kelp_plant"), () -> new BlockData(13809), null);

    public static final Block<BlockData> DRIED_KELP_BLOCK = new Block<>(712, NamespacedKey.parse("minecraft:dried_kelp_block"), () -> new BlockData(13810), Item.DRIED_KELP_BLOCK);

    public static final Block<TurtleEggData> TURTLE_EGG = new Block<>(713, NamespacedKey.parse("minecraft:turtle_egg"), () -> new TurtleEggData(13811), Item.TURTLE_EGG);

    public static final Block<SnifferEggData> SNIFFER_EGG = new Block<>(714, NamespacedKey.parse("minecraft:sniffer_egg"), () -> new SnifferEggData(13823), Item.SNIFFER_EGG);

    public static final Block<BlockData> DEAD_TUBE_CORAL_BLOCK = new Block<>(715, NamespacedKey.parse("minecraft:dead_tube_coral_block"), () -> new BlockData(13826), Item.DEAD_TUBE_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_BRAIN_CORAL_BLOCK = new Block<>(716, NamespacedKey.parse("minecraft:dead_brain_coral_block"), () -> new BlockData(13827), Item.DEAD_BRAIN_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_BUBBLE_CORAL_BLOCK = new Block<>(717, NamespacedKey.parse("minecraft:dead_bubble_coral_block"), () -> new BlockData(13828), Item.DEAD_BUBBLE_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_FIRE_CORAL_BLOCK = new Block<>(718, NamespacedKey.parse("minecraft:dead_fire_coral_block"), () -> new BlockData(13829), Item.DEAD_FIRE_CORAL_BLOCK);

    public static final Block<BlockData> DEAD_HORN_CORAL_BLOCK = new Block<>(719, NamespacedKey.parse("minecraft:dead_horn_coral_block"), () -> new BlockData(13830), Item.DEAD_HORN_CORAL_BLOCK);

    public static final Block<BlockData> TUBE_CORAL_BLOCK = new Block<>(720, NamespacedKey.parse("minecraft:tube_coral_block"), () -> new BlockData(13831), Item.TUBE_CORAL_BLOCK);

    public static final Block<BlockData> BRAIN_CORAL_BLOCK = new Block<>(721, NamespacedKey.parse("minecraft:brain_coral_block"), () -> new BlockData(13832), Item.BRAIN_CORAL_BLOCK);

    public static final Block<BlockData> BUBBLE_CORAL_BLOCK = new Block<>(722, NamespacedKey.parse("minecraft:bubble_coral_block"), () -> new BlockData(13833), Item.BUBBLE_CORAL_BLOCK);

    public static final Block<BlockData> FIRE_CORAL_BLOCK = new Block<>(723, NamespacedKey.parse("minecraft:fire_coral_block"), () -> new BlockData(13834), Item.FIRE_CORAL_BLOCK);

    public static final Block<BlockData> HORN_CORAL_BLOCK = new Block<>(724, NamespacedKey.parse("minecraft:horn_coral_block"), () -> new BlockData(13835), Item.HORN_CORAL_BLOCK);

    public static final Block<BaseCoralPlantData> DEAD_TUBE_CORAL = new Block<>(725, NamespacedKey.parse("minecraft:dead_tube_coral"), () -> new BaseCoralPlantData(13836), Item.DEAD_TUBE_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_BRAIN_CORAL = new Block<>(726, NamespacedKey.parse("minecraft:dead_brain_coral"), () -> new BaseCoralPlantData(13838), Item.DEAD_BRAIN_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_BUBBLE_CORAL = new Block<>(727, NamespacedKey.parse("minecraft:dead_bubble_coral"), () -> new BaseCoralPlantData(13840), Item.DEAD_BUBBLE_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_FIRE_CORAL = new Block<>(728, NamespacedKey.parse("minecraft:dead_fire_coral"), () -> new BaseCoralPlantData(13842), Item.DEAD_FIRE_CORAL);

    public static final Block<BaseCoralPlantData> DEAD_HORN_CORAL = new Block<>(729, NamespacedKey.parse("minecraft:dead_horn_coral"), () -> new BaseCoralPlantData(13844), Item.DEAD_HORN_CORAL);

    public static final Block<CoralPlantData> TUBE_CORAL = new Block<>(730, NamespacedKey.parse("minecraft:tube_coral"), () -> new CoralPlantData(13846), Item.TUBE_CORAL);

    public static final Block<CoralPlantData> BRAIN_CORAL = new Block<>(731, NamespacedKey.parse("minecraft:brain_coral"), () -> new CoralPlantData(13848), Item.BRAIN_CORAL);

    public static final Block<CoralPlantData> BUBBLE_CORAL = new Block<>(732, NamespacedKey.parse("minecraft:bubble_coral"), () -> new CoralPlantData(13850), Item.BUBBLE_CORAL);

    public static final Block<CoralPlantData> FIRE_CORAL = new Block<>(733, NamespacedKey.parse("minecraft:fire_coral"), () -> new CoralPlantData(13852), Item.FIRE_CORAL);

    public static final Block<CoralPlantData> HORN_CORAL = new Block<>(734, NamespacedKey.parse("minecraft:horn_coral"), () -> new CoralPlantData(13854), Item.HORN_CORAL);

    public static final Block<BaseCoralFanData> DEAD_TUBE_CORAL_FAN = new Block<>(735, NamespacedKey.parse("minecraft:dead_tube_coral_fan"), () -> new BaseCoralFanData(13856), Item.DEAD_TUBE_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_BRAIN_CORAL_FAN = new Block<>(736, NamespacedKey.parse("minecraft:dead_brain_coral_fan"), () -> new BaseCoralFanData(13858), Item.DEAD_BRAIN_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_BUBBLE_CORAL_FAN = new Block<>(737, NamespacedKey.parse("minecraft:dead_bubble_coral_fan"), () -> new BaseCoralFanData(13860), Item.DEAD_BUBBLE_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_FIRE_CORAL_FAN = new Block<>(738, NamespacedKey.parse("minecraft:dead_fire_coral_fan"), () -> new BaseCoralFanData(13862), Item.DEAD_FIRE_CORAL_FAN);

    public static final Block<BaseCoralFanData> DEAD_HORN_CORAL_FAN = new Block<>(739, NamespacedKey.parse("minecraft:dead_horn_coral_fan"), () -> new BaseCoralFanData(13864), Item.DEAD_HORN_CORAL_FAN);

    public static final Block<CoralFanData> TUBE_CORAL_FAN = new Block<>(740, NamespacedKey.parse("minecraft:tube_coral_fan"), () -> new CoralFanData(13866), Item.TUBE_CORAL_FAN);

    public static final Block<CoralFanData> BRAIN_CORAL_FAN = new Block<>(741, NamespacedKey.parse("minecraft:brain_coral_fan"), () -> new CoralFanData(13868), Item.BRAIN_CORAL_FAN);

    public static final Block<CoralFanData> BUBBLE_CORAL_FAN = new Block<>(742, NamespacedKey.parse("minecraft:bubble_coral_fan"), () -> new CoralFanData(13870), Item.BUBBLE_CORAL_FAN);

    public static final Block<CoralFanData> FIRE_CORAL_FAN = new Block<>(743, NamespacedKey.parse("minecraft:fire_coral_fan"), () -> new CoralFanData(13872), Item.FIRE_CORAL_FAN);

    public static final Block<CoralFanData> HORN_CORAL_FAN = new Block<>(744, NamespacedKey.parse("minecraft:horn_coral_fan"), () -> new CoralFanData(13874), Item.HORN_CORAL_FAN);

    public static final Block<BaseCoralWallFanData> DEAD_TUBE_CORAL_WALL_FAN = new Block<>(745, NamespacedKey.parse("minecraft:dead_tube_coral_wall_fan"), () -> new BaseCoralWallFanData(13876), null);

    public static final Block<BaseCoralWallFanData> DEAD_BRAIN_CORAL_WALL_FAN = new Block<>(746, NamespacedKey.parse("minecraft:dead_brain_coral_wall_fan"), () -> new BaseCoralWallFanData(13884), null);

    public static final Block<BaseCoralWallFanData> DEAD_BUBBLE_CORAL_WALL_FAN = new Block<>(747, NamespacedKey.parse("minecraft:dead_bubble_coral_wall_fan"), () -> new BaseCoralWallFanData(13892), null);

    public static final Block<BaseCoralWallFanData> DEAD_FIRE_CORAL_WALL_FAN = new Block<>(748, NamespacedKey.parse("minecraft:dead_fire_coral_wall_fan"), () -> new BaseCoralWallFanData(13900), null);

    public static final Block<BaseCoralWallFanData> DEAD_HORN_CORAL_WALL_FAN = new Block<>(749, NamespacedKey.parse("minecraft:dead_horn_coral_wall_fan"), () -> new BaseCoralWallFanData(13908), null);

    public static final Block<CoralWallFanData> TUBE_CORAL_WALL_FAN = new Block<>(750, NamespacedKey.parse("minecraft:tube_coral_wall_fan"), () -> new CoralWallFanData(13916), null);

    public static final Block<CoralWallFanData> BRAIN_CORAL_WALL_FAN = new Block<>(751, NamespacedKey.parse("minecraft:brain_coral_wall_fan"), () -> new CoralWallFanData(13924), null);

    public static final Block<CoralWallFanData> BUBBLE_CORAL_WALL_FAN = new Block<>(752, NamespacedKey.parse("minecraft:bubble_coral_wall_fan"), () -> new CoralWallFanData(13932), null);

    public static final Block<CoralWallFanData> FIRE_CORAL_WALL_FAN = new Block<>(753, NamespacedKey.parse("minecraft:fire_coral_wall_fan"), () -> new CoralWallFanData(13940), null);

    public static final Block<CoralWallFanData> HORN_CORAL_WALL_FAN = new Block<>(754, NamespacedKey.parse("minecraft:horn_coral_wall_fan"), () -> new CoralWallFanData(13948), null);

    public static final Block<SeaPickleData> SEA_PICKLE = new Block<>(755, NamespacedKey.parse("minecraft:sea_pickle"), () -> new SeaPickleData(13956), Item.SEA_PICKLE);

    public static final Block<BlockData> BLUE_ICE = new Block<>(756, NamespacedKey.parse("minecraft:blue_ice"), () -> new BlockData(13964), Item.BLUE_ICE);

    public static final Block<ConduitData> CONDUIT = new Block<>(757, NamespacedKey.parse("minecraft:conduit"), () -> new ConduitData(13965), Item.CONDUIT);

    public static final Block<BlockData> BAMBOO_SAPLING = new Block<>(758, NamespacedKey.parse("minecraft:bamboo_sapling"), () -> new BlockData(13967), null);

    public static final Block<BambooStalkData> BAMBOO = new Block<>(759, NamespacedKey.parse("minecraft:bamboo"), () -> new BambooStalkData(13968), Item.BAMBOO);

    public static final Block<BlockData> POTTED_BAMBOO = new Block<>(760, NamespacedKey.parse("minecraft:potted_bamboo"), () -> new BlockData(13980), null);

    public static final Block<BlockData> VOID_AIR = new Block<>(761, NamespacedKey.parse("minecraft:void_air"), () -> new BlockData(13981), null);

    public static final Block<BlockData> CAVE_AIR = new Block<>(762, NamespacedKey.parse("minecraft:cave_air"), () -> new BlockData(13982), null);

    public static final Block<BubbleColumnData> BUBBLE_COLUMN = new Block<>(763, NamespacedKey.parse("minecraft:bubble_column"), () -> new BubbleColumnData(13983), null);

    public static final Block<StairData> POLISHED_GRANITE_STAIRS = new Block<>(764, NamespacedKey.parse("minecraft:polished_granite_stairs"), () -> new StairData(13985), Item.POLISHED_GRANITE_STAIRS);

    public static final Block<StairData> SMOOTH_RED_SANDSTONE_STAIRS = new Block<>(765, NamespacedKey.parse("minecraft:smooth_red_sandstone_stairs"), () -> new StairData(14065), Item.SMOOTH_RED_SANDSTONE_STAIRS);

    public static final Block<StairData> MOSSY_STONE_BRICK_STAIRS = new Block<>(766, NamespacedKey.parse("minecraft:mossy_stone_brick_stairs"), () -> new StairData(14145), Item.MOSSY_STONE_BRICK_STAIRS);

    public static final Block<StairData> POLISHED_DIORITE_STAIRS = new Block<>(767, NamespacedKey.parse("minecraft:polished_diorite_stairs"), () -> new StairData(14225), Item.POLISHED_DIORITE_STAIRS);

    public static final Block<StairData> MOSSY_COBBLESTONE_STAIRS = new Block<>(768, NamespacedKey.parse("minecraft:mossy_cobblestone_stairs"), () -> new StairData(14305), Item.MOSSY_COBBLESTONE_STAIRS);

    public static final Block<StairData> END_STONE_BRICK_STAIRS = new Block<>(769, NamespacedKey.parse("minecraft:end_stone_brick_stairs"), () -> new StairData(14385), Item.END_STONE_BRICK_STAIRS);

    public static final Block<StairData> STONE_STAIRS = new Block<>(770, NamespacedKey.parse("minecraft:stone_stairs"), () -> new StairData(14465), Item.STONE_STAIRS);

    public static final Block<StairData> SMOOTH_SANDSTONE_STAIRS = new Block<>(771, NamespacedKey.parse("minecraft:smooth_sandstone_stairs"), () -> new StairData(14545), Item.SMOOTH_SANDSTONE_STAIRS);

    public static final Block<StairData> SMOOTH_QUARTZ_STAIRS = new Block<>(772, NamespacedKey.parse("minecraft:smooth_quartz_stairs"), () -> new StairData(14625), Item.SMOOTH_QUARTZ_STAIRS);

    public static final Block<StairData> GRANITE_STAIRS = new Block<>(773, NamespacedKey.parse("minecraft:granite_stairs"), () -> new StairData(14705), Item.GRANITE_STAIRS);

    public static final Block<StairData> ANDESITE_STAIRS = new Block<>(774, NamespacedKey.parse("minecraft:andesite_stairs"), () -> new StairData(14785), Item.ANDESITE_STAIRS);

    public static final Block<StairData> RED_NETHER_BRICK_STAIRS = new Block<>(775, NamespacedKey.parse("minecraft:red_nether_brick_stairs"), () -> new StairData(14865), Item.RED_NETHER_BRICK_STAIRS);

    public static final Block<StairData> POLISHED_ANDESITE_STAIRS = new Block<>(776, NamespacedKey.parse("minecraft:polished_andesite_stairs"), () -> new StairData(14945), Item.POLISHED_ANDESITE_STAIRS);

    public static final Block<StairData> DIORITE_STAIRS = new Block<>(777, NamespacedKey.parse("minecraft:diorite_stairs"), () -> new StairData(15025), Item.DIORITE_STAIRS);

    public static final Block<SlabData> POLISHED_GRANITE_SLAB = new Block<>(778, NamespacedKey.parse("minecraft:polished_granite_slab"), () -> new SlabData(15105), Item.POLISHED_GRANITE_SLAB);

    public static final Block<SlabData> SMOOTH_RED_SANDSTONE_SLAB = new Block<>(779, NamespacedKey.parse("minecraft:smooth_red_sandstone_slab"), () -> new SlabData(15111), Item.SMOOTH_RED_SANDSTONE_SLAB);

    public static final Block<SlabData> MOSSY_STONE_BRICK_SLAB = new Block<>(780, NamespacedKey.parse("minecraft:mossy_stone_brick_slab"), () -> new SlabData(15117), Item.MOSSY_STONE_BRICK_SLAB);

    public static final Block<SlabData> POLISHED_DIORITE_SLAB = new Block<>(781, NamespacedKey.parse("minecraft:polished_diorite_slab"), () -> new SlabData(15123), Item.POLISHED_DIORITE_SLAB);

    public static final Block<SlabData> MOSSY_COBBLESTONE_SLAB = new Block<>(782, NamespacedKey.parse("minecraft:mossy_cobblestone_slab"), () -> new SlabData(15129), Item.MOSSY_COBBLESTONE_SLAB);

    public static final Block<SlabData> END_STONE_BRICK_SLAB = new Block<>(783, NamespacedKey.parse("minecraft:end_stone_brick_slab"), () -> new SlabData(15135), Item.END_STONE_BRICK_SLAB);

    public static final Block<SlabData> SMOOTH_SANDSTONE_SLAB = new Block<>(784, NamespacedKey.parse("minecraft:smooth_sandstone_slab"), () -> new SlabData(15141), Item.SMOOTH_SANDSTONE_SLAB);

    public static final Block<SlabData> SMOOTH_QUARTZ_SLAB = new Block<>(785, NamespacedKey.parse("minecraft:smooth_quartz_slab"), () -> new SlabData(15147), Item.SMOOTH_QUARTZ_SLAB);

    public static final Block<SlabData> GRANITE_SLAB = new Block<>(786, NamespacedKey.parse("minecraft:granite_slab"), () -> new SlabData(15153), Item.GRANITE_SLAB);

    public static final Block<SlabData> ANDESITE_SLAB = new Block<>(787, NamespacedKey.parse("minecraft:andesite_slab"), () -> new SlabData(15159), Item.ANDESITE_SLAB);

    public static final Block<SlabData> RED_NETHER_BRICK_SLAB = new Block<>(788, NamespacedKey.parse("minecraft:red_nether_brick_slab"), () -> new SlabData(15165), Item.RED_NETHER_BRICK_SLAB);

    public static final Block<SlabData> POLISHED_ANDESITE_SLAB = new Block<>(789, NamespacedKey.parse("minecraft:polished_andesite_slab"), () -> new SlabData(15171), Item.POLISHED_ANDESITE_SLAB);

    public static final Block<SlabData> DIORITE_SLAB = new Block<>(790, NamespacedKey.parse("minecraft:diorite_slab"), () -> new SlabData(15177), Item.DIORITE_SLAB);

    public static final Block<WallData> BRICK_WALL = new Block<>(791, NamespacedKey.parse("minecraft:brick_wall"), () -> new WallData(15183), Item.BRICK_WALL);

    public static final Block<WallData> PRISMARINE_WALL = new Block<>(792, NamespacedKey.parse("minecraft:prismarine_wall"), () -> new WallData(15507), Item.PRISMARINE_WALL);

    public static final Block<WallData> RED_SANDSTONE_WALL = new Block<>(793, NamespacedKey.parse("minecraft:red_sandstone_wall"), () -> new WallData(15831), Item.RED_SANDSTONE_WALL);

    public static final Block<WallData> MOSSY_STONE_BRICK_WALL = new Block<>(794, NamespacedKey.parse("minecraft:mossy_stone_brick_wall"), () -> new WallData(16155), Item.MOSSY_STONE_BRICK_WALL);

    public static final Block<WallData> GRANITE_WALL = new Block<>(795, NamespacedKey.parse("minecraft:granite_wall"), () -> new WallData(16479), Item.GRANITE_WALL);

    public static final Block<WallData> STONE_BRICK_WALL = new Block<>(796, NamespacedKey.parse("minecraft:stone_brick_wall"), () -> new WallData(16803), Item.STONE_BRICK_WALL);

    public static final Block<WallData> MUD_BRICK_WALL = new Block<>(797, NamespacedKey.parse("minecraft:mud_brick_wall"), () -> new WallData(17127), Item.MUD_BRICK_WALL);

    public static final Block<WallData> NETHER_BRICK_WALL = new Block<>(798, NamespacedKey.parse("minecraft:nether_brick_wall"), () -> new WallData(17451), Item.NETHER_BRICK_WALL);

    public static final Block<WallData> ANDESITE_WALL = new Block<>(799, NamespacedKey.parse("minecraft:andesite_wall"), () -> new WallData(17775), Item.ANDESITE_WALL);

    public static final Block<WallData> RED_NETHER_BRICK_WALL = new Block<>(800, NamespacedKey.parse("minecraft:red_nether_brick_wall"), () -> new WallData(18099), Item.RED_NETHER_BRICK_WALL);

    public static final Block<WallData> SANDSTONE_WALL = new Block<>(801, NamespacedKey.parse("minecraft:sandstone_wall"), () -> new WallData(18423), Item.SANDSTONE_WALL);

    public static final Block<WallData> END_STONE_BRICK_WALL = new Block<>(802, NamespacedKey.parse("minecraft:end_stone_brick_wall"), () -> new WallData(18747), Item.END_STONE_BRICK_WALL);

    public static final Block<WallData> DIORITE_WALL = new Block<>(803, NamespacedKey.parse("minecraft:diorite_wall"), () -> new WallData(19071), Item.DIORITE_WALL);

    public static final Block<ScaffoldingData> SCAFFOLDING = new Block<>(804, NamespacedKey.parse("minecraft:scaffolding"), () -> new ScaffoldingData(19395), Item.SCAFFOLDING);

    public static final Block<LoomData> LOOM = new Block<>(805, NamespacedKey.parse("minecraft:loom"), () -> new LoomData(19427), Item.LOOM);

    public static final Block<BarrelData> BARREL = new Block<>(806, NamespacedKey.parse("minecraft:barrel"), () -> new BarrelData(19431), Item.BARREL);

    public static final Block<SmokerData> SMOKER = new Block<>(807, NamespacedKey.parse("minecraft:smoker"), () -> new SmokerData(19443), Item.SMOKER);

    public static final Block<BlastFurnaceData> BLAST_FURNACE = new Block<>(808, NamespacedKey.parse("minecraft:blast_furnace"), () -> new BlastFurnaceData(19451), Item.BLAST_FURNACE);

    public static final Block<BlockData> CARTOGRAPHY_TABLE = new Block<>(809, NamespacedKey.parse("minecraft:cartography_table"), () -> new BlockData(19459), Item.CARTOGRAPHY_TABLE);

    public static final Block<BlockData> FLETCHING_TABLE = new Block<>(810, NamespacedKey.parse("minecraft:fletching_table"), () -> new BlockData(19460), Item.FLETCHING_TABLE);

    public static final Block<GrindstoneData> GRINDSTONE = new Block<>(811, NamespacedKey.parse("minecraft:grindstone"), () -> new GrindstoneData(19461), Item.GRINDSTONE);

    public static final Block<LecternData> LECTERN = new Block<>(812, NamespacedKey.parse("minecraft:lectern"), () -> new LecternData(19473), Item.LECTERN);

    public static final Block<BlockData> SMITHING_TABLE = new Block<>(813, NamespacedKey.parse("minecraft:smithing_table"), () -> new BlockData(19489), Item.SMITHING_TABLE);

    public static final Block<StonecutterData> STONECUTTER = new Block<>(814, NamespacedKey.parse("minecraft:stonecutter"), () -> new StonecutterData(19490), Item.STONECUTTER);

    public static final Block<BellData> BELL = new Block<>(815, NamespacedKey.parse("minecraft:bell"), () -> new BellData(19494), Item.BELL);

    public static final Block<LanternData> LANTERN = new Block<>(816, NamespacedKey.parse("minecraft:lantern"), () -> new LanternData(19526), Item.LANTERN);

    public static final Block<LanternData> SOUL_LANTERN = new Block<>(817, NamespacedKey.parse("minecraft:soul_lantern"), () -> new LanternData(19530), Item.SOUL_LANTERN);

    public static final Block<CampfireData> CAMPFIRE = new Block<>(818, NamespacedKey.parse("minecraft:campfire"), () -> new CampfireData(19534), Item.CAMPFIRE);

    public static final Block<CampfireData> SOUL_CAMPFIRE = new Block<>(819, NamespacedKey.parse("minecraft:soul_campfire"), () -> new CampfireData(19566), Item.SOUL_CAMPFIRE);

    public static final Block<SweetBerryBushData> SWEET_BERRY_BUSH = new Block<>(820, NamespacedKey.parse("minecraft:sweet_berry_bush"), () -> new SweetBerryBushData(19598), null);

    public static final Block<RotatedPillarData> WARPED_STEM = new Block<>(821, NamespacedKey.parse("minecraft:warped_stem"), () -> new RotatedPillarData(19602), Item.WARPED_STEM);

    public static final Block<RotatedPillarData> STRIPPED_WARPED_STEM = new Block<>(822, NamespacedKey.parse("minecraft:stripped_warped_stem"), () -> new RotatedPillarData(19605), Item.STRIPPED_WARPED_STEM);

    public static final Block<RotatedPillarData> WARPED_HYPHAE = new Block<>(823, NamespacedKey.parse("minecraft:warped_hyphae"), () -> new RotatedPillarData(19608), Item.WARPED_HYPHAE);

    public static final Block<RotatedPillarData> STRIPPED_WARPED_HYPHAE = new Block<>(824, NamespacedKey.parse("minecraft:stripped_warped_hyphae"), () -> new RotatedPillarData(19611), Item.STRIPPED_WARPED_HYPHAE);

    public static final Block<BlockData> WARPED_NYLIUM = new Block<>(825, NamespacedKey.parse("minecraft:warped_nylium"), () -> new BlockData(19614), Item.WARPED_NYLIUM);

    public static final Block<BlockData> WARPED_FUNGUS = new Block<>(826, NamespacedKey.parse("minecraft:warped_fungus"), () -> new BlockData(19615), Item.WARPED_FUNGUS);

    public static final Block<BlockData> WARPED_WART_BLOCK = new Block<>(827, NamespacedKey.parse("minecraft:warped_wart_block"), () -> new BlockData(19616), Item.WARPED_WART_BLOCK);

    public static final Block<BlockData> WARPED_ROOTS = new Block<>(828, NamespacedKey.parse("minecraft:warped_roots"), () -> new BlockData(19617), Item.WARPED_ROOTS);

    public static final Block<BlockData> NETHER_SPROUTS = new Block<>(829, NamespacedKey.parse("minecraft:nether_sprouts"), () -> new BlockData(19618), Item.NETHER_SPROUTS);

    public static final Block<RotatedPillarData> CRIMSON_STEM = new Block<>(830, NamespacedKey.parse("minecraft:crimson_stem"), () -> new RotatedPillarData(19619), Item.CRIMSON_STEM);

    public static final Block<RotatedPillarData> STRIPPED_CRIMSON_STEM = new Block<>(831, NamespacedKey.parse("minecraft:stripped_crimson_stem"), () -> new RotatedPillarData(19622), Item.STRIPPED_CRIMSON_STEM);

    public static final Block<RotatedPillarData> CRIMSON_HYPHAE = new Block<>(832, NamespacedKey.parse("minecraft:crimson_hyphae"), () -> new RotatedPillarData(19625), Item.CRIMSON_HYPHAE);

    public static final Block<RotatedPillarData> STRIPPED_CRIMSON_HYPHAE = new Block<>(833, NamespacedKey.parse("minecraft:stripped_crimson_hyphae"), () -> new RotatedPillarData(19628), Item.STRIPPED_CRIMSON_HYPHAE);

    public static final Block<BlockData> CRIMSON_NYLIUM = new Block<>(834, NamespacedKey.parse("minecraft:crimson_nylium"), () -> new BlockData(19631), Item.CRIMSON_NYLIUM);

    public static final Block<BlockData> CRIMSON_FUNGUS = new Block<>(835, NamespacedKey.parse("minecraft:crimson_fungus"), () -> new BlockData(19632), Item.CRIMSON_FUNGUS);

    public static final Block<BlockData> SHROOMLIGHT = new Block<>(836, NamespacedKey.parse("minecraft:shroomlight"), () -> new BlockData(19633), Item.SHROOMLIGHT);

    public static final Block<WeepingVinesData> WEEPING_VINES = new Block<>(837, NamespacedKey.parse("minecraft:weeping_vines"), () -> new WeepingVinesData(19634), Item.WEEPING_VINES);

    public static final Block<BlockData> WEEPING_VINES_PLANT = new Block<>(838, NamespacedKey.parse("minecraft:weeping_vines_plant"), () -> new BlockData(19660), null);

    public static final Block<TwistingVinesData> TWISTING_VINES = new Block<>(839, NamespacedKey.parse("minecraft:twisting_vines"), () -> new TwistingVinesData(19661), Item.TWISTING_VINES);

    public static final Block<BlockData> TWISTING_VINES_PLANT = new Block<>(840, NamespacedKey.parse("minecraft:twisting_vines_plant"), () -> new BlockData(19687), null);

    public static final Block<BlockData> CRIMSON_ROOTS = new Block<>(841, NamespacedKey.parse("minecraft:crimson_roots"), () -> new BlockData(19688), Item.CRIMSON_ROOTS);

    public static final Block<BlockData> CRIMSON_PLANKS = new Block<>(842, NamespacedKey.parse("minecraft:crimson_planks"), () -> new BlockData(19689), Item.CRIMSON_PLANKS);

    public static final Block<BlockData> WARPED_PLANKS = new Block<>(843, NamespacedKey.parse("minecraft:warped_planks"), () -> new BlockData(19690), Item.WARPED_PLANKS);

    public static final Block<SlabData> CRIMSON_SLAB = new Block<>(844, NamespacedKey.parse("minecraft:crimson_slab"), () -> new SlabData(19691), Item.CRIMSON_SLAB);

    public static final Block<SlabData> WARPED_SLAB = new Block<>(845, NamespacedKey.parse("minecraft:warped_slab"), () -> new SlabData(19697), Item.WARPED_SLAB);

    public static final Block<PressurePlateData> CRIMSON_PRESSURE_PLATE = new Block<>(846, NamespacedKey.parse("minecraft:crimson_pressure_plate"), () -> new PressurePlateData(19703), Item.CRIMSON_PRESSURE_PLATE);

    public static final Block<PressurePlateData> WARPED_PRESSURE_PLATE = new Block<>(847, NamespacedKey.parse("minecraft:warped_pressure_plate"), () -> new PressurePlateData(19705), Item.WARPED_PRESSURE_PLATE);

    public static final Block<FenceData> CRIMSON_FENCE = new Block<>(848, NamespacedKey.parse("minecraft:crimson_fence"), () -> new FenceData(19707), Item.CRIMSON_FENCE);

    public static final Block<FenceData> WARPED_FENCE = new Block<>(849, NamespacedKey.parse("minecraft:warped_fence"), () -> new FenceData(19739), Item.WARPED_FENCE);

    public static final Block<TrapdoorData> CRIMSON_TRAPDOOR = new Block<>(850, NamespacedKey.parse("minecraft:crimson_trapdoor"), () -> new TrapdoorData(19771), Item.CRIMSON_TRAPDOOR);

    public static final Block<TrapdoorData> WARPED_TRAPDOOR = new Block<>(851, NamespacedKey.parse("minecraft:warped_trapdoor"), () -> new TrapdoorData(19835), Item.WARPED_TRAPDOOR);

    public static final Block<FenceGateData> CRIMSON_FENCE_GATE = new Block<>(852, NamespacedKey.parse("minecraft:crimson_fence_gate"), () -> new FenceGateData(19899), Item.CRIMSON_FENCE_GATE);

    public static final Block<FenceGateData> WARPED_FENCE_GATE = new Block<>(853, NamespacedKey.parse("minecraft:warped_fence_gate"), () -> new FenceGateData(19931), Item.WARPED_FENCE_GATE);

    public static final Block<StairData> CRIMSON_STAIRS = new Block<>(854, NamespacedKey.parse("minecraft:crimson_stairs"), () -> new StairData(19963), Item.CRIMSON_STAIRS);

    public static final Block<StairData> WARPED_STAIRS = new Block<>(855, NamespacedKey.parse("minecraft:warped_stairs"), () -> new StairData(20043), Item.WARPED_STAIRS);

    public static final Block<ButtonData> CRIMSON_BUTTON = new Block<>(856, NamespacedKey.parse("minecraft:crimson_button"), () -> new ButtonData(20123), Item.CRIMSON_BUTTON);

    public static final Block<ButtonData> WARPED_BUTTON = new Block<>(857, NamespacedKey.parse("minecraft:warped_button"), () -> new ButtonData(20147), Item.WARPED_BUTTON);

    public static final Block<DoorData> CRIMSON_DOOR = new Block<>(858, NamespacedKey.parse("minecraft:crimson_door"), () -> new DoorData(20171), Item.CRIMSON_DOOR);

    public static final Block<DoorData> WARPED_DOOR = new Block<>(859, NamespacedKey.parse("minecraft:warped_door"), () -> new DoorData(20235), Item.WARPED_DOOR);

    public static final Block<StandingSignData> CRIMSON_SIGN = new Block<>(860, NamespacedKey.parse("minecraft:crimson_sign"), () -> new StandingSignData(20299), Item.CRIMSON_SIGN);

    public static final Block<StandingSignData> WARPED_SIGN = new Block<>(861, NamespacedKey.parse("minecraft:warped_sign"), () -> new StandingSignData(20331), Item.WARPED_SIGN);

    public static final Block<WallSignData> CRIMSON_WALL_SIGN = new Block<>(862, NamespacedKey.parse("minecraft:crimson_wall_sign"), () -> new WallSignData(20363), null);

    public static final Block<WallSignData> WARPED_WALL_SIGN = new Block<>(863, NamespacedKey.parse("minecraft:warped_wall_sign"), () -> new WallSignData(20371), null);

    public static final Block<StructureData> STRUCTURE_BLOCK = new Block<>(864, NamespacedKey.parse("minecraft:structure_block"), () -> new StructureData(20379), Item.STRUCTURE_BLOCK);

    public static final Block<JigsawData> JIGSAW = new Block<>(865, NamespacedKey.parse("minecraft:jigsaw"), () -> new JigsawData(20383), Item.JIGSAW);

    public static final Block<TestData> TEST_BLOCK = new Block<>(866, NamespacedKey.parse("minecraft:test_block"), () -> new TestData(20395), Item.TEST_BLOCK);

    public static final Block<BlockData> TEST_INSTANCE_BLOCK = new Block<>(867, NamespacedKey.parse("minecraft:test_instance_block"), () -> new BlockData(20399), Item.TEST_INSTANCE_BLOCK);

    public static final Block<ComposterData> COMPOSTER = new Block<>(868, NamespacedKey.parse("minecraft:composter"), () -> new ComposterData(20400), Item.COMPOSTER);

    public static final Block<TargetData> TARGET = new Block<>(869, NamespacedKey.parse("minecraft:target"), () -> new TargetData(20409), Item.TARGET);

    public static final Block<BeehiveData> BEE_NEST = new Block<>(870, NamespacedKey.parse("minecraft:bee_nest"), () -> new BeehiveData(20425), Item.BEE_NEST);

    public static final Block<BeehiveData> BEEHIVE = new Block<>(871, NamespacedKey.parse("minecraft:beehive"), () -> new BeehiveData(20449), Item.BEEHIVE);

    public static final Block<BlockData> HONEY_BLOCK = new Block<>(872, NamespacedKey.parse("minecraft:honey_block"), () -> new BlockData(20473), Item.HONEY_BLOCK);

    public static final Block<BlockData> HONEYCOMB_BLOCK = new Block<>(873, NamespacedKey.parse("minecraft:honeycomb_block"), () -> new BlockData(20474), Item.HONEYCOMB_BLOCK);

    public static final Block<BlockData> NETHERITE_BLOCK = new Block<>(874, NamespacedKey.parse("minecraft:netherite_block"), () -> new BlockData(20475), Item.NETHERITE_BLOCK);

    public static final Block<BlockData> ANCIENT_DEBRIS = new Block<>(875, NamespacedKey.parse("minecraft:ancient_debris"), () -> new BlockData(20476), Item.ANCIENT_DEBRIS);

    public static final Block<BlockData> CRYING_OBSIDIAN = new Block<>(876, NamespacedKey.parse("minecraft:crying_obsidian"), () -> new BlockData(20477), Item.CRYING_OBSIDIAN);

    public static final Block<RespawnAnchorData> RESPAWN_ANCHOR = new Block<>(877, NamespacedKey.parse("minecraft:respawn_anchor"), () -> new RespawnAnchorData(20478), Item.RESPAWN_ANCHOR);

    public static final Block<BlockData> POTTED_CRIMSON_FUNGUS = new Block<>(878, NamespacedKey.parse("minecraft:potted_crimson_fungus"), () -> new BlockData(20483), null);

    public static final Block<BlockData> POTTED_WARPED_FUNGUS = new Block<>(879, NamespacedKey.parse("minecraft:potted_warped_fungus"), () -> new BlockData(20484), null);

    public static final Block<BlockData> POTTED_CRIMSON_ROOTS = new Block<>(880, NamespacedKey.parse("minecraft:potted_crimson_roots"), () -> new BlockData(20485), null);

    public static final Block<BlockData> POTTED_WARPED_ROOTS = new Block<>(881, NamespacedKey.parse("minecraft:potted_warped_roots"), () -> new BlockData(20486), null);

    public static final Block<BlockData> LODESTONE = new Block<>(882, NamespacedKey.parse("minecraft:lodestone"), () -> new BlockData(20487), Item.LODESTONE);

    public static final Block<BlockData> BLACKSTONE = new Block<>(883, NamespacedKey.parse("minecraft:blackstone"), () -> new BlockData(20488), Item.BLACKSTONE);

    public static final Block<StairData> BLACKSTONE_STAIRS = new Block<>(884, NamespacedKey.parse("minecraft:blackstone_stairs"), () -> new StairData(20489), Item.BLACKSTONE_STAIRS);

    public static final Block<WallData> BLACKSTONE_WALL = new Block<>(885, NamespacedKey.parse("minecraft:blackstone_wall"), () -> new WallData(20569), Item.BLACKSTONE_WALL);

    public static final Block<SlabData> BLACKSTONE_SLAB = new Block<>(886, NamespacedKey.parse("minecraft:blackstone_slab"), () -> new SlabData(20893), Item.BLACKSTONE_SLAB);

    public static final Block<BlockData> POLISHED_BLACKSTONE = new Block<>(887, NamespacedKey.parse("minecraft:polished_blackstone"), () -> new BlockData(20899), Item.POLISHED_BLACKSTONE);

    public static final Block<BlockData> POLISHED_BLACKSTONE_BRICKS = new Block<>(888, NamespacedKey.parse("minecraft:polished_blackstone_bricks"), () -> new BlockData(20900), Item.POLISHED_BLACKSTONE_BRICKS);

    public static final Block<BlockData> CRACKED_POLISHED_BLACKSTONE_BRICKS = new Block<>(889, NamespacedKey.parse("minecraft:cracked_polished_blackstone_bricks"), () -> new BlockData(20901), Item.CRACKED_POLISHED_BLACKSTONE_BRICKS);

    public static final Block<BlockData> CHISELED_POLISHED_BLACKSTONE = new Block<>(890, NamespacedKey.parse("minecraft:chiseled_polished_blackstone"), () -> new BlockData(20902), Item.CHISELED_POLISHED_BLACKSTONE);

    public static final Block<SlabData> POLISHED_BLACKSTONE_BRICK_SLAB = new Block<>(891, NamespacedKey.parse("minecraft:polished_blackstone_brick_slab"), () -> new SlabData(20903), Item.POLISHED_BLACKSTONE_BRICK_SLAB);

    public static final Block<StairData> POLISHED_BLACKSTONE_BRICK_STAIRS = new Block<>(892, NamespacedKey.parse("minecraft:polished_blackstone_brick_stairs"), () -> new StairData(20909), Item.POLISHED_BLACKSTONE_BRICK_STAIRS);

    public static final Block<WallData> POLISHED_BLACKSTONE_BRICK_WALL = new Block<>(893, NamespacedKey.parse("minecraft:polished_blackstone_brick_wall"), () -> new WallData(20989), Item.POLISHED_BLACKSTONE_BRICK_WALL);

    public static final Block<BlockData> GILDED_BLACKSTONE = new Block<>(894, NamespacedKey.parse("minecraft:gilded_blackstone"), () -> new BlockData(21313), Item.GILDED_BLACKSTONE);

    public static final Block<StairData> POLISHED_BLACKSTONE_STAIRS = new Block<>(895, NamespacedKey.parse("minecraft:polished_blackstone_stairs"), () -> new StairData(21314), Item.POLISHED_BLACKSTONE_STAIRS);

    public static final Block<SlabData> POLISHED_BLACKSTONE_SLAB = new Block<>(896, NamespacedKey.parse("minecraft:polished_blackstone_slab"), () -> new SlabData(21394), Item.POLISHED_BLACKSTONE_SLAB);

    public static final Block<PressurePlateData> POLISHED_BLACKSTONE_PRESSURE_PLATE = new Block<>(897, NamespacedKey.parse("minecraft:polished_blackstone_pressure_plate"), () -> new PressurePlateData(21400), Item.POLISHED_BLACKSTONE_PRESSURE_PLATE);

    public static final Block<ButtonData> POLISHED_BLACKSTONE_BUTTON = new Block<>(898, NamespacedKey.parse("minecraft:polished_blackstone_button"), () -> new ButtonData(21402), Item.POLISHED_BLACKSTONE_BUTTON);

    public static final Block<WallData> POLISHED_BLACKSTONE_WALL = new Block<>(899, NamespacedKey.parse("minecraft:polished_blackstone_wall"), () -> new WallData(21426), Item.POLISHED_BLACKSTONE_WALL);

    public static final Block<BlockData> CHISELED_NETHER_BRICKS = new Block<>(900, NamespacedKey.parse("minecraft:chiseled_nether_bricks"), () -> new BlockData(21750), Item.CHISELED_NETHER_BRICKS);

    public static final Block<BlockData> CRACKED_NETHER_BRICKS = new Block<>(901, NamespacedKey.parse("minecraft:cracked_nether_bricks"), () -> new BlockData(21751), Item.CRACKED_NETHER_BRICKS);

    public static final Block<BlockData> QUARTZ_BRICKS = new Block<>(902, NamespacedKey.parse("minecraft:quartz_bricks"), () -> new BlockData(21752), Item.QUARTZ_BRICKS);

    public static final Block<CandleData> CANDLE = new Block<>(903, NamespacedKey.parse("minecraft:candle"), () -> new CandleData(21753), Item.CANDLE);

    public static final Block<CandleData> WHITE_CANDLE = new Block<>(904, NamespacedKey.parse("minecraft:white_candle"), () -> new CandleData(21769), Item.WHITE_CANDLE);

    public static final Block<CandleData> ORANGE_CANDLE = new Block<>(905, NamespacedKey.parse("minecraft:orange_candle"), () -> new CandleData(21785), Item.ORANGE_CANDLE);

    public static final Block<CandleData> MAGENTA_CANDLE = new Block<>(906, NamespacedKey.parse("minecraft:magenta_candle"), () -> new CandleData(21801), Item.MAGENTA_CANDLE);

    public static final Block<CandleData> LIGHT_BLUE_CANDLE = new Block<>(907, NamespacedKey.parse("minecraft:light_blue_candle"), () -> new CandleData(21817), Item.LIGHT_BLUE_CANDLE);

    public static final Block<CandleData> YELLOW_CANDLE = new Block<>(908, NamespacedKey.parse("minecraft:yellow_candle"), () -> new CandleData(21833), Item.YELLOW_CANDLE);

    public static final Block<CandleData> LIME_CANDLE = new Block<>(909, NamespacedKey.parse("minecraft:lime_candle"), () -> new CandleData(21849), Item.LIME_CANDLE);

    public static final Block<CandleData> PINK_CANDLE = new Block<>(910, NamespacedKey.parse("minecraft:pink_candle"), () -> new CandleData(21865), Item.PINK_CANDLE);

    public static final Block<CandleData> GRAY_CANDLE = new Block<>(911, NamespacedKey.parse("minecraft:gray_candle"), () -> new CandleData(21881), Item.GRAY_CANDLE);

    public static final Block<CandleData> LIGHT_GRAY_CANDLE = new Block<>(912, NamespacedKey.parse("minecraft:light_gray_candle"), () -> new CandleData(21897), Item.LIGHT_GRAY_CANDLE);

    public static final Block<CandleData> CYAN_CANDLE = new Block<>(913, NamespacedKey.parse("minecraft:cyan_candle"), () -> new CandleData(21913), Item.CYAN_CANDLE);

    public static final Block<CandleData> PURPLE_CANDLE = new Block<>(914, NamespacedKey.parse("minecraft:purple_candle"), () -> new CandleData(21929), Item.PURPLE_CANDLE);

    public static final Block<CandleData> BLUE_CANDLE = new Block<>(915, NamespacedKey.parse("minecraft:blue_candle"), () -> new CandleData(21945), Item.BLUE_CANDLE);

    public static final Block<CandleData> BROWN_CANDLE = new Block<>(916, NamespacedKey.parse("minecraft:brown_candle"), () -> new CandleData(21961), Item.BROWN_CANDLE);

    public static final Block<CandleData> GREEN_CANDLE = new Block<>(917, NamespacedKey.parse("minecraft:green_candle"), () -> new CandleData(21977), Item.GREEN_CANDLE);

    public static final Block<CandleData> RED_CANDLE = new Block<>(918, NamespacedKey.parse("minecraft:red_candle"), () -> new CandleData(21993), Item.RED_CANDLE);

    public static final Block<CandleData> BLACK_CANDLE = new Block<>(919, NamespacedKey.parse("minecraft:black_candle"), () -> new CandleData(22009), Item.BLACK_CANDLE);

    public static final Block<CandleCakeData> CANDLE_CAKE = new Block<>(920, NamespacedKey.parse("minecraft:candle_cake"), () -> new CandleCakeData(22025), null);

    public static final Block<CandleCakeData> WHITE_CANDLE_CAKE = new Block<>(921, NamespacedKey.parse("minecraft:white_candle_cake"), () -> new CandleCakeData(22027), null);

    public static final Block<CandleCakeData> ORANGE_CANDLE_CAKE = new Block<>(922, NamespacedKey.parse("minecraft:orange_candle_cake"), () -> new CandleCakeData(22029), null);

    public static final Block<CandleCakeData> MAGENTA_CANDLE_CAKE = new Block<>(923, NamespacedKey.parse("minecraft:magenta_candle_cake"), () -> new CandleCakeData(22031), null);

    public static final Block<CandleCakeData> LIGHT_BLUE_CANDLE_CAKE = new Block<>(924, NamespacedKey.parse("minecraft:light_blue_candle_cake"), () -> new CandleCakeData(22033), null);

    public static final Block<CandleCakeData> YELLOW_CANDLE_CAKE = new Block<>(925, NamespacedKey.parse("minecraft:yellow_candle_cake"), () -> new CandleCakeData(22035), null);

    public static final Block<CandleCakeData> LIME_CANDLE_CAKE = new Block<>(926, NamespacedKey.parse("minecraft:lime_candle_cake"), () -> new CandleCakeData(22037), null);

    public static final Block<CandleCakeData> PINK_CANDLE_CAKE = new Block<>(927, NamespacedKey.parse("minecraft:pink_candle_cake"), () -> new CandleCakeData(22039), null);

    public static final Block<CandleCakeData> GRAY_CANDLE_CAKE = new Block<>(928, NamespacedKey.parse("minecraft:gray_candle_cake"), () -> new CandleCakeData(22041), null);

    public static final Block<CandleCakeData> LIGHT_GRAY_CANDLE_CAKE = new Block<>(929, NamespacedKey.parse("minecraft:light_gray_candle_cake"), () -> new CandleCakeData(22043), null);

    public static final Block<CandleCakeData> CYAN_CANDLE_CAKE = new Block<>(930, NamespacedKey.parse("minecraft:cyan_candle_cake"), () -> new CandleCakeData(22045), null);

    public static final Block<CandleCakeData> PURPLE_CANDLE_CAKE = new Block<>(931, NamespacedKey.parse("minecraft:purple_candle_cake"), () -> new CandleCakeData(22047), null);

    public static final Block<CandleCakeData> BLUE_CANDLE_CAKE = new Block<>(932, NamespacedKey.parse("minecraft:blue_candle_cake"), () -> new CandleCakeData(22049), null);

    public static final Block<CandleCakeData> BROWN_CANDLE_CAKE = new Block<>(933, NamespacedKey.parse("minecraft:brown_candle_cake"), () -> new CandleCakeData(22051), null);

    public static final Block<CandleCakeData> GREEN_CANDLE_CAKE = new Block<>(934, NamespacedKey.parse("minecraft:green_candle_cake"), () -> new CandleCakeData(22053), null);

    public static final Block<CandleCakeData> RED_CANDLE_CAKE = new Block<>(935, NamespacedKey.parse("minecraft:red_candle_cake"), () -> new CandleCakeData(22055), null);

    public static final Block<CandleCakeData> BLACK_CANDLE_CAKE = new Block<>(936, NamespacedKey.parse("minecraft:black_candle_cake"), () -> new CandleCakeData(22057), null);

    public static final Block<BlockData> AMETHYST_BLOCK = new Block<>(937, NamespacedKey.parse("minecraft:amethyst_block"), () -> new BlockData(22059), Item.AMETHYST_BLOCK);

    public static final Block<BlockData> BUDDING_AMETHYST = new Block<>(938, NamespacedKey.parse("minecraft:budding_amethyst"), () -> new BlockData(22060), Item.BUDDING_AMETHYST);

    public static final Block<AmethystClusterData> AMETHYST_CLUSTER = new Block<>(939, NamespacedKey.parse("minecraft:amethyst_cluster"), () -> new AmethystClusterData(22061), Item.AMETHYST_CLUSTER);

    public static final Block<AmethystClusterData> LARGE_AMETHYST_BUD = new Block<>(940, NamespacedKey.parse("minecraft:large_amethyst_bud"), () -> new AmethystClusterData(22073), Item.LARGE_AMETHYST_BUD);

    public static final Block<AmethystClusterData> MEDIUM_AMETHYST_BUD = new Block<>(941, NamespacedKey.parse("minecraft:medium_amethyst_bud"), () -> new AmethystClusterData(22085), Item.MEDIUM_AMETHYST_BUD);

    public static final Block<AmethystClusterData> SMALL_AMETHYST_BUD = new Block<>(942, NamespacedKey.parse("minecraft:small_amethyst_bud"), () -> new AmethystClusterData(22097), Item.SMALL_AMETHYST_BUD);

    public static final Block<BlockData> TUFF = new Block<>(943, NamespacedKey.parse("minecraft:tuff"), () -> new BlockData(22109), Item.TUFF);

    public static final Block<SlabData> TUFF_SLAB = new Block<>(944, NamespacedKey.parse("minecraft:tuff_slab"), () -> new SlabData(22110), Item.TUFF_SLAB);

    public static final Block<StairData> TUFF_STAIRS = new Block<>(945, NamespacedKey.parse("minecraft:tuff_stairs"), () -> new StairData(22116), Item.TUFF_STAIRS);

    public static final Block<WallData> TUFF_WALL = new Block<>(946, NamespacedKey.parse("minecraft:tuff_wall"), () -> new WallData(22196), Item.TUFF_WALL);

    public static final Block<BlockData> POLISHED_TUFF = new Block<>(947, NamespacedKey.parse("minecraft:polished_tuff"), () -> new BlockData(22520), Item.POLISHED_TUFF);

    public static final Block<SlabData> POLISHED_TUFF_SLAB = new Block<>(948, NamespacedKey.parse("minecraft:polished_tuff_slab"), () -> new SlabData(22521), Item.POLISHED_TUFF_SLAB);

    public static final Block<StairData> POLISHED_TUFF_STAIRS = new Block<>(949, NamespacedKey.parse("minecraft:polished_tuff_stairs"), () -> new StairData(22527), Item.POLISHED_TUFF_STAIRS);

    public static final Block<WallData> POLISHED_TUFF_WALL = new Block<>(950, NamespacedKey.parse("minecraft:polished_tuff_wall"), () -> new WallData(22607), Item.POLISHED_TUFF_WALL);

    public static final Block<BlockData> CHISELED_TUFF = new Block<>(951, NamespacedKey.parse("minecraft:chiseled_tuff"), () -> new BlockData(22931), Item.CHISELED_TUFF);

    public static final Block<BlockData> TUFF_BRICKS = new Block<>(952, NamespacedKey.parse("minecraft:tuff_bricks"), () -> new BlockData(22932), Item.TUFF_BRICKS);

    public static final Block<SlabData> TUFF_BRICK_SLAB = new Block<>(953, NamespacedKey.parse("minecraft:tuff_brick_slab"), () -> new SlabData(22933), Item.TUFF_BRICK_SLAB);

    public static final Block<StairData> TUFF_BRICK_STAIRS = new Block<>(954, NamespacedKey.parse("minecraft:tuff_brick_stairs"), () -> new StairData(22939), Item.TUFF_BRICK_STAIRS);

    public static final Block<WallData> TUFF_BRICK_WALL = new Block<>(955, NamespacedKey.parse("minecraft:tuff_brick_wall"), () -> new WallData(23019), Item.TUFF_BRICK_WALL);

    public static final Block<BlockData> CHISELED_TUFF_BRICKS = new Block<>(956, NamespacedKey.parse("minecraft:chiseled_tuff_bricks"), () -> new BlockData(23343), Item.CHISELED_TUFF_BRICKS);

    public static final Block<BlockData> CALCITE = new Block<>(957, NamespacedKey.parse("minecraft:calcite"), () -> new BlockData(23344), Item.CALCITE);

    public static final Block<BlockData> TINTED_GLASS = new Block<>(958, NamespacedKey.parse("minecraft:tinted_glass"), () -> new BlockData(23345), Item.TINTED_GLASS);

    public static final Block<BlockData> POWDER_SNOW = new Block<>(959, NamespacedKey.parse("minecraft:powder_snow"), () -> new BlockData(23346), null);

    public static final Block<SculkSensorData> SCULK_SENSOR = new Block<>(960, NamespacedKey.parse("minecraft:sculk_sensor"), () -> new SculkSensorData(23347), Item.SCULK_SENSOR);

    public static final Block<CalibratedSculkSensorData> CALIBRATED_SCULK_SENSOR = new Block<>(961, NamespacedKey.parse("minecraft:calibrated_sculk_sensor"), () -> new CalibratedSculkSensorData(23443), Item.CALIBRATED_SCULK_SENSOR);

    public static final Block<BlockData> SCULK = new Block<>(962, NamespacedKey.parse("minecraft:sculk"), () -> new BlockData(23827), Item.SCULK);

    public static final Block<SculkVeinData> SCULK_VEIN = new Block<>(963, NamespacedKey.parse("minecraft:sculk_vein"), () -> new SculkVeinData(23828), Item.SCULK_VEIN);

    public static final Block<SculkCatalystData> SCULK_CATALYST = new Block<>(964, NamespacedKey.parse("minecraft:sculk_catalyst"), () -> new SculkCatalystData(23956), Item.SCULK_CATALYST);

    public static final Block<SculkShriekerData> SCULK_SHRIEKER = new Block<>(965, NamespacedKey.parse("minecraft:sculk_shrieker"), () -> new SculkShriekerData(23958), Item.SCULK_SHRIEKER);

    public static final Block<BlockData> COPPER_BLOCK = new Block<>(966, NamespacedKey.parse("minecraft:copper_block"), () -> new BlockData(23966), Item.COPPER_BLOCK);

    public static final Block<BlockData> EXPOSED_COPPER = new Block<>(967, NamespacedKey.parse("minecraft:exposed_copper"), () -> new BlockData(23967), Item.EXPOSED_COPPER);

    public static final Block<BlockData> WEATHERED_COPPER = new Block<>(968, NamespacedKey.parse("minecraft:weathered_copper"), () -> new BlockData(23968), Item.WEATHERED_COPPER);

    public static final Block<BlockData> OXIDIZED_COPPER = new Block<>(969, NamespacedKey.parse("minecraft:oxidized_copper"), () -> new BlockData(23969), Item.OXIDIZED_COPPER);

    public static final Block<BlockData> COPPER_ORE = new Block<>(970, NamespacedKey.parse("minecraft:copper_ore"), () -> new BlockData(23970), Item.COPPER_ORE);

    public static final Block<BlockData> DEEPSLATE_COPPER_ORE = new Block<>(971, NamespacedKey.parse("minecraft:deepslate_copper_ore"), () -> new BlockData(23971), Item.DEEPSLATE_COPPER_ORE);

    public static final Block<BlockData> OXIDIZED_CUT_COPPER = new Block<>(972, NamespacedKey.parse("minecraft:oxidized_cut_copper"), () -> new BlockData(23972), Item.OXIDIZED_CUT_COPPER);

    public static final Block<BlockData> WEATHERED_CUT_COPPER = new Block<>(973, NamespacedKey.parse("minecraft:weathered_cut_copper"), () -> new BlockData(23973), Item.WEATHERED_CUT_COPPER);

    public static final Block<BlockData> EXPOSED_CUT_COPPER = new Block<>(974, NamespacedKey.parse("minecraft:exposed_cut_copper"), () -> new BlockData(23974), Item.EXPOSED_CUT_COPPER);

    public static final Block<BlockData> CUT_COPPER = new Block<>(975, NamespacedKey.parse("minecraft:cut_copper"), () -> new BlockData(23975), Item.CUT_COPPER);

    public static final Block<BlockData> OXIDIZED_CHISELED_COPPER = new Block<>(976, NamespacedKey.parse("minecraft:oxidized_chiseled_copper"), () -> new BlockData(23976), Item.OXIDIZED_CHISELED_COPPER);

    public static final Block<BlockData> WEATHERED_CHISELED_COPPER = new Block<>(977, NamespacedKey.parse("minecraft:weathered_chiseled_copper"), () -> new BlockData(23977), Item.WEATHERED_CHISELED_COPPER);

    public static final Block<BlockData> EXPOSED_CHISELED_COPPER = new Block<>(978, NamespacedKey.parse("minecraft:exposed_chiseled_copper"), () -> new BlockData(23978), Item.EXPOSED_CHISELED_COPPER);

    public static final Block<BlockData> CHISELED_COPPER = new Block<>(979, NamespacedKey.parse("minecraft:chiseled_copper"), () -> new BlockData(23979), Item.CHISELED_COPPER);

    public static final Block<BlockData> WAXED_OXIDIZED_CHISELED_COPPER = new Block<>(980, NamespacedKey.parse("minecraft:waxed_oxidized_chiseled_copper"), () -> new BlockData(23980), Item.WAXED_OXIDIZED_CHISELED_COPPER);

    public static final Block<BlockData> WAXED_WEATHERED_CHISELED_COPPER = new Block<>(981, NamespacedKey.parse("minecraft:waxed_weathered_chiseled_copper"), () -> new BlockData(23981), Item.WAXED_WEATHERED_CHISELED_COPPER);

    public static final Block<BlockData> WAXED_EXPOSED_CHISELED_COPPER = new Block<>(982, NamespacedKey.parse("minecraft:waxed_exposed_chiseled_copper"), () -> new BlockData(23982), Item.WAXED_EXPOSED_CHISELED_COPPER);

    public static final Block<BlockData> WAXED_CHISELED_COPPER = new Block<>(983, NamespacedKey.parse("minecraft:waxed_chiseled_copper"), () -> new BlockData(23983), Item.WAXED_CHISELED_COPPER);

    public static final Block<WeatheringCopperStairData> OXIDIZED_CUT_COPPER_STAIRS = new Block<>(984, NamespacedKey.parse("minecraft:oxidized_cut_copper_stairs"), () -> new WeatheringCopperStairData(23984), Item.OXIDIZED_CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperStairData> WEATHERED_CUT_COPPER_STAIRS = new Block<>(985, NamespacedKey.parse("minecraft:weathered_cut_copper_stairs"), () -> new WeatheringCopperStairData(24064), Item.WEATHERED_CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperStairData> EXPOSED_CUT_COPPER_STAIRS = new Block<>(986, NamespacedKey.parse("minecraft:exposed_cut_copper_stairs"), () -> new WeatheringCopperStairData(24144), Item.EXPOSED_CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperStairData> CUT_COPPER_STAIRS = new Block<>(987, NamespacedKey.parse("minecraft:cut_copper_stairs"), () -> new WeatheringCopperStairData(24224), Item.CUT_COPPER_STAIRS);

    public static final Block<WeatheringCopperSlabData> OXIDIZED_CUT_COPPER_SLAB = new Block<>(988, NamespacedKey.parse("minecraft:oxidized_cut_copper_slab"), () -> new WeatheringCopperSlabData(24304), Item.OXIDIZED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperSlabData> WEATHERED_CUT_COPPER_SLAB = new Block<>(989, NamespacedKey.parse("minecraft:weathered_cut_copper_slab"), () -> new WeatheringCopperSlabData(24310), Item.WEATHERED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperSlabData> EXPOSED_CUT_COPPER_SLAB = new Block<>(990, NamespacedKey.parse("minecraft:exposed_cut_copper_slab"), () -> new WeatheringCopperSlabData(24316), Item.EXPOSED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperSlabData> CUT_COPPER_SLAB = new Block<>(991, NamespacedKey.parse("minecraft:cut_copper_slab"), () -> new WeatheringCopperSlabData(24322), Item.CUT_COPPER_SLAB);

    public static final Block<BlockData> WAXED_COPPER_BLOCK = new Block<>(992, NamespacedKey.parse("minecraft:waxed_copper_block"), () -> new BlockData(24328), Item.WAXED_COPPER_BLOCK);

    public static final Block<BlockData> WAXED_WEATHERED_COPPER = new Block<>(993, NamespacedKey.parse("minecraft:waxed_weathered_copper"), () -> new BlockData(24329), Item.WAXED_WEATHERED_COPPER);

    public static final Block<BlockData> WAXED_EXPOSED_COPPER = new Block<>(994, NamespacedKey.parse("minecraft:waxed_exposed_copper"), () -> new BlockData(24330), Item.WAXED_EXPOSED_COPPER);

    public static final Block<BlockData> WAXED_OXIDIZED_COPPER = new Block<>(995, NamespacedKey.parse("minecraft:waxed_oxidized_copper"), () -> new BlockData(24331), Item.WAXED_OXIDIZED_COPPER);

    public static final Block<BlockData> WAXED_OXIDIZED_CUT_COPPER = new Block<>(996, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper"), () -> new BlockData(24332), Item.WAXED_OXIDIZED_CUT_COPPER);

    public static final Block<BlockData> WAXED_WEATHERED_CUT_COPPER = new Block<>(997, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper"), () -> new BlockData(24333), Item.WAXED_WEATHERED_CUT_COPPER);

    public static final Block<BlockData> WAXED_EXPOSED_CUT_COPPER = new Block<>(998, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper"), () -> new BlockData(24334), Item.WAXED_EXPOSED_CUT_COPPER);

    public static final Block<BlockData> WAXED_CUT_COPPER = new Block<>(999, NamespacedKey.parse("minecraft:waxed_cut_copper"), () -> new BlockData(24335), Item.WAXED_CUT_COPPER);

    public static final Block<StairData> WAXED_OXIDIZED_CUT_COPPER_STAIRS = new Block<>(1000, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_stairs"), () -> new StairData(24336), Item.WAXED_OXIDIZED_CUT_COPPER_STAIRS);

    public static final Block<StairData> WAXED_WEATHERED_CUT_COPPER_STAIRS = new Block<>(1001, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_stairs"), () -> new StairData(24416), Item.WAXED_WEATHERED_CUT_COPPER_STAIRS);

    public static final Block<StairData> WAXED_EXPOSED_CUT_COPPER_STAIRS = new Block<>(1002, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_stairs"), () -> new StairData(24496), Item.WAXED_EXPOSED_CUT_COPPER_STAIRS);

    public static final Block<StairData> WAXED_CUT_COPPER_STAIRS = new Block<>(1003, NamespacedKey.parse("minecraft:waxed_cut_copper_stairs"), () -> new StairData(24576), Item.WAXED_CUT_COPPER_STAIRS);

    public static final Block<SlabData> WAXED_OXIDIZED_CUT_COPPER_SLAB = new Block<>(1004, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_slab"), () -> new SlabData(24656), Item.WAXED_OXIDIZED_CUT_COPPER_SLAB);

    public static final Block<SlabData> WAXED_WEATHERED_CUT_COPPER_SLAB = new Block<>(1005, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_slab"), () -> new SlabData(24662), Item.WAXED_WEATHERED_CUT_COPPER_SLAB);

    public static final Block<SlabData> WAXED_EXPOSED_CUT_COPPER_SLAB = new Block<>(1006, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_slab"), () -> new SlabData(24668), Item.WAXED_EXPOSED_CUT_COPPER_SLAB);

    public static final Block<SlabData> WAXED_CUT_COPPER_SLAB = new Block<>(1007, NamespacedKey.parse("minecraft:waxed_cut_copper_slab"), () -> new SlabData(24674), Item.WAXED_CUT_COPPER_SLAB);

    public static final Block<WeatheringCopperDoorData> COPPER_DOOR = new Block<>(1008, NamespacedKey.parse("minecraft:copper_door"), () -> new WeatheringCopperDoorData(24680), Item.COPPER_DOOR);

    public static final Block<WeatheringCopperDoorData> EXPOSED_COPPER_DOOR = new Block<>(1009, NamespacedKey.parse("minecraft:exposed_copper_door"), () -> new WeatheringCopperDoorData(24744), Item.EXPOSED_COPPER_DOOR);

    public static final Block<WeatheringCopperDoorData> OXIDIZED_COPPER_DOOR = new Block<>(1010, NamespacedKey.parse("minecraft:oxidized_copper_door"), () -> new WeatheringCopperDoorData(24808), Item.OXIDIZED_COPPER_DOOR);

    public static final Block<WeatheringCopperDoorData> WEATHERED_COPPER_DOOR = new Block<>(1011, NamespacedKey.parse("minecraft:weathered_copper_door"), () -> new WeatheringCopperDoorData(24872), Item.WEATHERED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_COPPER_DOOR = new Block<>(1012, NamespacedKey.parse("minecraft:waxed_copper_door"), () -> new DoorData(24936), Item.WAXED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_EXPOSED_COPPER_DOOR = new Block<>(1013, NamespacedKey.parse("minecraft:waxed_exposed_copper_door"), () -> new DoorData(25000), Item.WAXED_EXPOSED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_OXIDIZED_COPPER_DOOR = new Block<>(1014, NamespacedKey.parse("minecraft:waxed_oxidized_copper_door"), () -> new DoorData(25064), Item.WAXED_OXIDIZED_COPPER_DOOR);

    public static final Block<DoorData> WAXED_WEATHERED_COPPER_DOOR = new Block<>(1015, NamespacedKey.parse("minecraft:waxed_weathered_copper_door"), () -> new DoorData(25128), Item.WAXED_WEATHERED_COPPER_DOOR);

    public static final Block<WeatheringCopperTrapDoorData> COPPER_TRAPDOOR = new Block<>(1016, NamespacedKey.parse("minecraft:copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25192), Item.COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperTrapDoorData> EXPOSED_COPPER_TRAPDOOR = new Block<>(1017, NamespacedKey.parse("minecraft:exposed_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25256), Item.EXPOSED_COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperTrapDoorData> OXIDIZED_COPPER_TRAPDOOR = new Block<>(1018, NamespacedKey.parse("minecraft:oxidized_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25320), Item.OXIDIZED_COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperTrapDoorData> WEATHERED_COPPER_TRAPDOOR = new Block<>(1019, NamespacedKey.parse("minecraft:weathered_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25384), Item.WEATHERED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_COPPER_TRAPDOOR = new Block<>(1020, NamespacedKey.parse("minecraft:waxed_copper_trapdoor"), () -> new TrapdoorData(25448), Item.WAXED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_EXPOSED_COPPER_TRAPDOOR = new Block<>(1021, NamespacedKey.parse("minecraft:waxed_exposed_copper_trapdoor"), () -> new TrapdoorData(25512), Item.WAXED_EXPOSED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_OXIDIZED_COPPER_TRAPDOOR = new Block<>(1022, NamespacedKey.parse("minecraft:waxed_oxidized_copper_trapdoor"), () -> new TrapdoorData(25576), Item.WAXED_OXIDIZED_COPPER_TRAPDOOR);

    public static final Block<TrapdoorData> WAXED_WEATHERED_COPPER_TRAPDOOR = new Block<>(1023, NamespacedKey.parse("minecraft:waxed_weathered_copper_trapdoor"), () -> new TrapdoorData(25640), Item.WAXED_WEATHERED_COPPER_TRAPDOOR);

    public static final Block<WeatheringCopperGrateData> COPPER_GRATE = new Block<>(1024, NamespacedKey.parse("minecraft:copper_grate"), () -> new WeatheringCopperGrateData(25704), Item.COPPER_GRATE);

    public static final Block<WeatheringCopperGrateData> EXPOSED_COPPER_GRATE = new Block<>(1025, NamespacedKey.parse("minecraft:exposed_copper_grate"), () -> new WeatheringCopperGrateData(25706), Item.EXPOSED_COPPER_GRATE);

    public static final Block<WeatheringCopperGrateData> WEATHERED_COPPER_GRATE = new Block<>(1026, NamespacedKey.parse("minecraft:weathered_copper_grate"), () -> new WeatheringCopperGrateData(25708), Item.WEATHERED_COPPER_GRATE);

    public static final Block<WeatheringCopperGrateData> OXIDIZED_COPPER_GRATE = new Block<>(1027, NamespacedKey.parse("minecraft:oxidized_copper_grate"), () -> new WeatheringCopperGrateData(25710), Item.OXIDIZED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_COPPER_GRATE = new Block<>(1028, NamespacedKey.parse("minecraft:waxed_copper_grate"), () -> new WaterloggedTransparentData(25712), Item.WAXED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_EXPOSED_COPPER_GRATE = new Block<>(1029, NamespacedKey.parse("minecraft:waxed_exposed_copper_grate"), () -> new WaterloggedTransparentData(25714), Item.WAXED_EXPOSED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_WEATHERED_COPPER_GRATE = new Block<>(1030, NamespacedKey.parse("minecraft:waxed_weathered_copper_grate"), () -> new WaterloggedTransparentData(25716), Item.WAXED_WEATHERED_COPPER_GRATE);

    public static final Block<WaterloggedTransparentData> WAXED_OXIDIZED_COPPER_GRATE = new Block<>(1031, NamespacedKey.parse("minecraft:waxed_oxidized_copper_grate"), () -> new WaterloggedTransparentData(25718), Item.WAXED_OXIDIZED_COPPER_GRATE);

    public static final Block<WeatheringCopperBulbData> COPPER_BULB = new Block<>(1032, NamespacedKey.parse("minecraft:copper_bulb"), () -> new WeatheringCopperBulbData(25720), Item.COPPER_BULB);

    public static final Block<WeatheringCopperBulbData> EXPOSED_COPPER_BULB = new Block<>(1033, NamespacedKey.parse("minecraft:exposed_copper_bulb"), () -> new WeatheringCopperBulbData(25724), Item.EXPOSED_COPPER_BULB);

    public static final Block<WeatheringCopperBulbData> WEATHERED_COPPER_BULB = new Block<>(1034, NamespacedKey.parse("minecraft:weathered_copper_bulb"), () -> new WeatheringCopperBulbData(25728), Item.WEATHERED_COPPER_BULB);

    public static final Block<WeatheringCopperBulbData> OXIDIZED_COPPER_BULB = new Block<>(1035, NamespacedKey.parse("minecraft:oxidized_copper_bulb"), () -> new WeatheringCopperBulbData(25732), Item.OXIDIZED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_COPPER_BULB = new Block<>(1036, NamespacedKey.parse("minecraft:waxed_copper_bulb"), () -> new CopperBulbBlockData(25736), Item.WAXED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_EXPOSED_COPPER_BULB = new Block<>(1037, NamespacedKey.parse("minecraft:waxed_exposed_copper_bulb"), () -> new CopperBulbBlockData(25740), Item.WAXED_EXPOSED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_WEATHERED_COPPER_BULB = new Block<>(1038, NamespacedKey.parse("minecraft:waxed_weathered_copper_bulb"), () -> new CopperBulbBlockData(25744), Item.WAXED_WEATHERED_COPPER_BULB);

    public static final Block<CopperBulbBlockData> WAXED_OXIDIZED_COPPER_BULB = new Block<>(1039, NamespacedKey.parse("minecraft:waxed_oxidized_copper_bulb"), () -> new CopperBulbBlockData(25748), Item.WAXED_OXIDIZED_COPPER_BULB);

    public static final Block<LightningRodData> LIGHTNING_ROD = new Block<>(1040, NamespacedKey.parse("minecraft:lightning_rod"), () -> new LightningRodData(25752), Item.LIGHTNING_ROD);

    public static final Block<PointedDripstoneData> POINTED_DRIPSTONE = new Block<>(1041, NamespacedKey.parse("minecraft:pointed_dripstone"), () -> new PointedDripstoneData(25776), Item.POINTED_DRIPSTONE);

    public static final Block<BlockData> DRIPSTONE_BLOCK = new Block<>(1042, NamespacedKey.parse("minecraft:dripstone_block"), () -> new BlockData(25796), Item.DRIPSTONE_BLOCK);

    public static final Block<CaveVinesData> CAVE_VINES = new Block<>(1043, NamespacedKey.parse("minecraft:cave_vines"), () -> new CaveVinesData(25797), null);

    public static final Block<CaveVinesPlantData> CAVE_VINES_PLANT = new Block<>(1044, NamespacedKey.parse("minecraft:cave_vines_plant"), () -> new CaveVinesPlantData(25849), null);

    public static final Block<BlockData> SPORE_BLOSSOM = new Block<>(1045, NamespacedKey.parse("minecraft:spore_blossom"), () -> new BlockData(25851), Item.SPORE_BLOSSOM);

    public static final Block<BlockData> AZALEA = new Block<>(1046, NamespacedKey.parse("minecraft:azalea"), () -> new BlockData(25852), Item.AZALEA);

    public static final Block<BlockData> FLOWERING_AZALEA = new Block<>(1047, NamespacedKey.parse("minecraft:flowering_azalea"), () -> new BlockData(25853), Item.FLOWERING_AZALEA);

    public static final Block<BlockData> MOSS_CARPET = new Block<>(1048, NamespacedKey.parse("minecraft:moss_carpet"), () -> new BlockData(25854), Item.MOSS_CARPET);

    public static final Block<FlowerBedData> PINK_PETALS = new Block<>(1049, NamespacedKey.parse("minecraft:pink_petals"), () -> new FlowerBedData(25855), Item.PINK_PETALS);

    public static final Block<FlowerBedData> WILDFLOWERS = new Block<>(1050, NamespacedKey.parse("minecraft:wildflowers"), () -> new FlowerBedData(25871), Item.WILDFLOWERS);

    public static final Block<LeafLitterData> LEAF_LITTER = new Block<>(1051, NamespacedKey.parse("minecraft:leaf_litter"), () -> new LeafLitterData(25887), Item.LEAF_LITTER);

    public static final Block<BlockData> MOSS_BLOCK = new Block<>(1052, NamespacedKey.parse("minecraft:moss_block"), () -> new BlockData(25903), Item.MOSS_BLOCK);

    public static final Block<BigDripleafData> BIG_DRIPLEAF = new Block<>(1053, NamespacedKey.parse("minecraft:big_dripleaf"), () -> new BigDripleafData(25904), Item.BIG_DRIPLEAF);

    public static final Block<BigDripleafStemData> BIG_DRIPLEAF_STEM = new Block<>(1054, NamespacedKey.parse("minecraft:big_dripleaf_stem"), () -> new BigDripleafStemData(25936), null);

    public static final Block<SmallDripleafData> SMALL_DRIPLEAF = new Block<>(1055, NamespacedKey.parse("minecraft:small_dripleaf"), () -> new SmallDripleafData(25944), Item.SMALL_DRIPLEAF);

    public static final Block<HangingRootsData> HANGING_ROOTS = new Block<>(1056, NamespacedKey.parse("minecraft:hanging_roots"), () -> new HangingRootsData(25960), Item.HANGING_ROOTS);

    public static final Block<BlockData> ROOTED_DIRT = new Block<>(1057, NamespacedKey.parse("minecraft:rooted_dirt"), () -> new BlockData(25962), Item.ROOTED_DIRT);

    public static final Block<BlockData> MUD = new Block<>(1058, NamespacedKey.parse("minecraft:mud"), () -> new BlockData(25963), Item.MUD);

    public static final Block<RotatedPillarData> DEEPSLATE = new Block<>(1059, NamespacedKey.parse("minecraft:deepslate"), () -> new RotatedPillarData(25964), Item.DEEPSLATE);

    public static final Block<BlockData> COBBLED_DEEPSLATE = new Block<>(1060, NamespacedKey.parse("minecraft:cobbled_deepslate"), () -> new BlockData(25967), Item.COBBLED_DEEPSLATE);

    public static final Block<StairData> COBBLED_DEEPSLATE_STAIRS = new Block<>(1061, NamespacedKey.parse("minecraft:cobbled_deepslate_stairs"), () -> new StairData(25968), Item.COBBLED_DEEPSLATE_STAIRS);

    public static final Block<SlabData> COBBLED_DEEPSLATE_SLAB = new Block<>(1062, NamespacedKey.parse("minecraft:cobbled_deepslate_slab"), () -> new SlabData(26048), Item.COBBLED_DEEPSLATE_SLAB);

    public static final Block<WallData> COBBLED_DEEPSLATE_WALL = new Block<>(1063, NamespacedKey.parse("minecraft:cobbled_deepslate_wall"), () -> new WallData(26054), Item.COBBLED_DEEPSLATE_WALL);

    public static final Block<BlockData> POLISHED_DEEPSLATE = new Block<>(1064, NamespacedKey.parse("minecraft:polished_deepslate"), () -> new BlockData(26378), Item.POLISHED_DEEPSLATE);

    public static final Block<StairData> POLISHED_DEEPSLATE_STAIRS = new Block<>(1065, NamespacedKey.parse("minecraft:polished_deepslate_stairs"), () -> new StairData(26379), Item.POLISHED_DEEPSLATE_STAIRS);

    public static final Block<SlabData> POLISHED_DEEPSLATE_SLAB = new Block<>(1066, NamespacedKey.parse("minecraft:polished_deepslate_slab"), () -> new SlabData(26459), Item.POLISHED_DEEPSLATE_SLAB);

    public static final Block<WallData> POLISHED_DEEPSLATE_WALL = new Block<>(1067, NamespacedKey.parse("minecraft:polished_deepslate_wall"), () -> new WallData(26465), Item.POLISHED_DEEPSLATE_WALL);

    public static final Block<BlockData> DEEPSLATE_TILES = new Block<>(1068, NamespacedKey.parse("minecraft:deepslate_tiles"), () -> new BlockData(26789), Item.DEEPSLATE_TILES);

    public static final Block<StairData> DEEPSLATE_TILE_STAIRS = new Block<>(1069, NamespacedKey.parse("minecraft:deepslate_tile_stairs"), () -> new StairData(26790), Item.DEEPSLATE_TILE_STAIRS);

    public static final Block<SlabData> DEEPSLATE_TILE_SLAB = new Block<>(1070, NamespacedKey.parse("minecraft:deepslate_tile_slab"), () -> new SlabData(26870), Item.DEEPSLATE_TILE_SLAB);

    public static final Block<WallData> DEEPSLATE_TILE_WALL = new Block<>(1071, NamespacedKey.parse("minecraft:deepslate_tile_wall"), () -> new WallData(26876), Item.DEEPSLATE_TILE_WALL);

    public static final Block<BlockData> DEEPSLATE_BRICKS = new Block<>(1072, NamespacedKey.parse("minecraft:deepslate_bricks"), () -> new BlockData(27200), Item.DEEPSLATE_BRICKS);

    public static final Block<StairData> DEEPSLATE_BRICK_STAIRS = new Block<>(1073, NamespacedKey.parse("minecraft:deepslate_brick_stairs"), () -> new StairData(27201), Item.DEEPSLATE_BRICK_STAIRS);

    public static final Block<SlabData> DEEPSLATE_BRICK_SLAB = new Block<>(1074, NamespacedKey.parse("minecraft:deepslate_brick_slab"), () -> new SlabData(27281), Item.DEEPSLATE_BRICK_SLAB);

    public static final Block<WallData> DEEPSLATE_BRICK_WALL = new Block<>(1075, NamespacedKey.parse("minecraft:deepslate_brick_wall"), () -> new WallData(27287), Item.DEEPSLATE_BRICK_WALL);

    public static final Block<BlockData> CHISELED_DEEPSLATE = new Block<>(1076, NamespacedKey.parse("minecraft:chiseled_deepslate"), () -> new BlockData(27611), Item.CHISELED_DEEPSLATE);

    public static final Block<BlockData> CRACKED_DEEPSLATE_BRICKS = new Block<>(1077, NamespacedKey.parse("minecraft:cracked_deepslate_bricks"), () -> new BlockData(27612), Item.CRACKED_DEEPSLATE_BRICKS);

    public static final Block<BlockData> CRACKED_DEEPSLATE_TILES = new Block<>(1078, NamespacedKey.parse("minecraft:cracked_deepslate_tiles"), () -> new BlockData(27613), Item.CRACKED_DEEPSLATE_TILES);

    public static final Block<InfestedRotatedPillarData> INFESTED_DEEPSLATE = new Block<>(1079, NamespacedKey.parse("minecraft:infested_deepslate"), () -> new InfestedRotatedPillarData(27614), Item.INFESTED_DEEPSLATE);

    public static final Block<BlockData> SMOOTH_BASALT = new Block<>(1080, NamespacedKey.parse("minecraft:smooth_basalt"), () -> new BlockData(27617), Item.SMOOTH_BASALT);

    public static final Block<BlockData> RAW_IRON_BLOCK = new Block<>(1081, NamespacedKey.parse("minecraft:raw_iron_block"), () -> new BlockData(27618), Item.RAW_IRON_BLOCK);

    public static final Block<BlockData> RAW_COPPER_BLOCK = new Block<>(1082, NamespacedKey.parse("minecraft:raw_copper_block"), () -> new BlockData(27619), Item.RAW_COPPER_BLOCK);

    public static final Block<BlockData> RAW_GOLD_BLOCK = new Block<>(1083, NamespacedKey.parse("minecraft:raw_gold_block"), () -> new BlockData(27620), Item.RAW_GOLD_BLOCK);

    public static final Block<BlockData> POTTED_AZALEA_BUSH = new Block<>(1084, NamespacedKey.parse("minecraft:potted_azalea_bush"), () -> new BlockData(27621), null);

    public static final Block<BlockData> POTTED_FLOWERING_AZALEA_BUSH = new Block<>(1085, NamespacedKey.parse("minecraft:potted_flowering_azalea_bush"), () -> new BlockData(27622), null);

    public static final Block<RotatedPillarData> OCHRE_FROGLIGHT = new Block<>(1086, NamespacedKey.parse("minecraft:ochre_froglight"), () -> new RotatedPillarData(27623), Item.OCHRE_FROGLIGHT);

    public static final Block<RotatedPillarData> VERDANT_FROGLIGHT = new Block<>(1087, NamespacedKey.parse("minecraft:verdant_froglight"), () -> new RotatedPillarData(27626), Item.VERDANT_FROGLIGHT);

    public static final Block<RotatedPillarData> PEARLESCENT_FROGLIGHT = new Block<>(1088, NamespacedKey.parse("minecraft:pearlescent_froglight"), () -> new RotatedPillarData(27629), Item.PEARLESCENT_FROGLIGHT);

    public static final Block<BlockData> FROGSPAWN = new Block<>(1089, NamespacedKey.parse("minecraft:frogspawn"), () -> new BlockData(27632), Item.FROGSPAWN);

    public static final Block<BlockData> REINFORCED_DEEPSLATE = new Block<>(1090, NamespacedKey.parse("minecraft:reinforced_deepslate"), () -> new BlockData(27633), Item.REINFORCED_DEEPSLATE);

    public static final Block<DecoratedPotData> DECORATED_POT = new Block<>(1091, NamespacedKey.parse("minecraft:decorated_pot"), () -> new DecoratedPotData(27634), Item.DECORATED_POT);

    public static final Block<CrafterData> CRAFTER = new Block<>(1092, NamespacedKey.parse("minecraft:crafter"), () -> new CrafterData(27650), Item.CRAFTER);

    public static final Block<TrialSpawnerData> TRIAL_SPAWNER = new Block<>(1093, NamespacedKey.parse("minecraft:trial_spawner"), () -> new TrialSpawnerData(27698), Item.TRIAL_SPAWNER);

    public static final Block<VaultData> VAULT = new Block<>(1094, NamespacedKey.parse("minecraft:vault"), () -> new VaultData(27710), Item.VAULT);

    public static final Block<HeavyCoreData> HEAVY_CORE = new Block<>(1095, NamespacedKey.parse("minecraft:heavy_core"), () -> new HeavyCoreData(27742), Item.HEAVY_CORE);

    public static final Block<BlockData> PALE_MOSS_BLOCK = new Block<>(1096, NamespacedKey.parse("minecraft:pale_moss_block"), () -> new BlockData(27744), Item.PALE_MOSS_BLOCK);

    public static final Block<MossyCarpetData> PALE_MOSS_CARPET = new Block<>(1097, NamespacedKey.parse("minecraft:pale_moss_carpet"), () -> new MossyCarpetData(27745), Item.PALE_MOSS_CARPET);

    public static final Block<HangingMossData> PALE_HANGING_MOSS = new Block<>(1098, NamespacedKey.parse("minecraft:pale_hanging_moss"), () -> new HangingMossData(27907), Item.PALE_HANGING_MOSS);

    public static final Block<BlockData> OPEN_EYEBLOSSOM = new Block<>(1099, NamespacedKey.parse("minecraft:open_eyeblossom"), () -> new BlockData(27909), Item.OPEN_EYEBLOSSOM);

    public static final Block<BlockData> CLOSED_EYEBLOSSOM = new Block<>(1100, NamespacedKey.parse("minecraft:closed_eyeblossom"), () -> new BlockData(27910), Item.CLOSED_EYEBLOSSOM);

    public static final Block<BlockData> POTTED_OPEN_EYEBLOSSOM = new Block<>(1101, NamespacedKey.parse("minecraft:potted_open_eyeblossom"), () -> new BlockData(27911), null);

    public static final Block<BlockData> POTTED_CLOSED_EYEBLOSSOM = new Block<>(1102, NamespacedKey.parse("minecraft:potted_closed_eyeblossom"), () -> new BlockData(27912), null);

    public static final Block<BlockData> FIREFLY_BUSH = new Block<>(1103, NamespacedKey.parse("minecraft:firefly_bush"), () -> new BlockData(27913), Item.FIREFLY_BUSH);

    protected Blocks() {
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
            registry.register(Block.CHAIN.key(), Block.CHAIN);
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
            registry.register(Block.LIGHTNING_ROD.key(), Block.LIGHTNING_ROD);
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
            registry.registerTag(NamespacedKey.minecraft("candle_cakes"), Tags.CANDLE_CAKES);
            registry.registerTag(NamespacedKey.minecraft("candles"), Tags.CANDLES);
            registry.registerTag(NamespacedKey.minecraft("cauldrons"), Tags.CAULDRONS);
            registry.registerTag(NamespacedKey.minecraft("cave_vines"), Tags.CAVE_VINES);
            registry.registerTag(NamespacedKey.minecraft("ceiling_hanging_signs"), Tags.CEILING_HANGING_SIGNS);
            registry.registerTag(NamespacedKey.minecraft("cherry_logs"), Tags.CHERRY_LOGS);
            registry.registerTag(NamespacedKey.minecraft("climbable"), Tags.CLIMBABLE);
            registry.registerTag(NamespacedKey.minecraft("coal_ores"), Tags.COAL_ORES);
            registry.registerTag(NamespacedKey.minecraft("combination_step_sound_blocks"), Tags.COMBINATION_STEP_SOUND_BLOCKS);
            registry.registerTag(NamespacedKey.minecraft("completes_find_tree_tutorial"), Tags.COMPLETES_FIND_TREE_TUTORIAL);
            registry.registerTag(NamespacedKey.minecraft("concrete_powder"), Tags.CONCRETE_POWDER);
            registry.registerTag(NamespacedKey.minecraft("convertable_to_mud"), Tags.CONVERTABLE_TO_MUD);
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
            registry.registerTag(NamespacedKey.minecraft("hoglin_repellents"), Tags.HOGLIN_REPELLENTS);
            registry.registerTag(NamespacedKey.minecraft("ice"), Tags.ICE);
            registry.registerTag(NamespacedKey.minecraft("impermeable"), Tags.IMPERMEABLE);
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
            registry.registerTag(NamespacedKey.minecraft("lapis_ores"), Tags.LAPIS_ORES);
            registry.registerTag(NamespacedKey.minecraft("lava_pool_stone_cannot_replace"), Tags.LAVA_POOL_STONE_CANNOT_REPLACE);
            registry.registerTag(NamespacedKey.minecraft("leaves"), Tags.LEAVES);
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
            registry.registerTag(NamespacedKey.minecraft("plays_ambient_desert_block_sounds"), Tags.PLAYS_AMBIENT_DESERT_BLOCK_SOUNDS);
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
                .resource(NamespacedKey.parse("minecraft:iron_bars"))
                .resource(NamespacedKey.parse("minecraft:chain"))
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
                .resource(NamespacedKey.parse("minecraft:lantern"))
                .resource(NamespacedKey.parse("minecraft:soul_lantern"))
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
                .resource(NamespacedKey.parse("minecraft:lightning_rod"))
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
                .resource(NamespacedKey.parse("minecraft:lightning_rod"))
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

        public static final Tag<Block<?>> PLAYS_AMBIENT_DESERT_BLOCK_SOUNDS = Tag.builder(RegistryKey.BLOCK)
                .tag(NamespacedKey.parse("minecraft:terracotta"))
                .resource(NamespacedKey.parse("minecraft:sand"))
                .resource(NamespacedKey.parse("minecraft:red_sand"))
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
