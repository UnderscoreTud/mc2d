package me.tud.mc2d.world.block;

import javax.annotation.processing.Generated;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.registry.BuiltInRegistry;
import me.tud.mc2d.registry.RegistryKey;
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
    public static final Block<BlockData> AIR = new Block<>(0, NamespacedKey.parse("minecraft:air"), () -> new BlockData(0));

    public static final Block<BlockData> STONE = new Block<>(1, NamespacedKey.parse("minecraft:stone"), () -> new BlockData(1));

    public static final Block<BlockData> GRANITE = new Block<>(2, NamespacedKey.parse("minecraft:granite"), () -> new BlockData(2));

    public static final Block<BlockData> POLISHED_GRANITE = new Block<>(3, NamespacedKey.parse("minecraft:polished_granite"), () -> new BlockData(3));

    public static final Block<BlockData> DIORITE = new Block<>(4, NamespacedKey.parse("minecraft:diorite"), () -> new BlockData(4));

    public static final Block<BlockData> POLISHED_DIORITE = new Block<>(5, NamespacedKey.parse("minecraft:polished_diorite"), () -> new BlockData(5));

    public static final Block<BlockData> ANDESITE = new Block<>(6, NamespacedKey.parse("minecraft:andesite"), () -> new BlockData(6));

    public static final Block<BlockData> POLISHED_ANDESITE = new Block<>(7, NamespacedKey.parse("minecraft:polished_andesite"), () -> new BlockData(7));

    public static final Block<GrassData> GRASS_BLOCK = new Block<>(8, NamespacedKey.parse("minecraft:grass_block"), () -> new GrassData(8));

    public static final Block<BlockData> DIRT = new Block<>(9, NamespacedKey.parse("minecraft:dirt"), () -> new BlockData(10));

    public static final Block<BlockData> COARSE_DIRT = new Block<>(10, NamespacedKey.parse("minecraft:coarse_dirt"), () -> new BlockData(11));

    public static final Block<SnowyDirtData> PODZOL = new Block<>(11, NamespacedKey.parse("minecraft:podzol"), () -> new SnowyDirtData(12));

    public static final Block<BlockData> COBBLESTONE = new Block<>(12, NamespacedKey.parse("minecraft:cobblestone"), () -> new BlockData(14));

    public static final Block<BlockData> OAK_PLANKS = new Block<>(13, NamespacedKey.parse("minecraft:oak_planks"), () -> new BlockData(15));

    public static final Block<BlockData> SPRUCE_PLANKS = new Block<>(14, NamespacedKey.parse("minecraft:spruce_planks"), () -> new BlockData(16));

    public static final Block<BlockData> BIRCH_PLANKS = new Block<>(15, NamespacedKey.parse("minecraft:birch_planks"), () -> new BlockData(17));

    public static final Block<BlockData> JUNGLE_PLANKS = new Block<>(16, NamespacedKey.parse("minecraft:jungle_planks"), () -> new BlockData(18));

    public static final Block<BlockData> ACACIA_PLANKS = new Block<>(17, NamespacedKey.parse("minecraft:acacia_planks"), () -> new BlockData(19));

    public static final Block<BlockData> CHERRY_PLANKS = new Block<>(18, NamespacedKey.parse("minecraft:cherry_planks"), () -> new BlockData(20));

    public static final Block<BlockData> DARK_OAK_PLANKS = new Block<>(19, NamespacedKey.parse("minecraft:dark_oak_planks"), () -> new BlockData(21));

    public static final Block<RotatedPillarData> PALE_OAK_WOOD = new Block<>(20, NamespacedKey.parse("minecraft:pale_oak_wood"), () -> new RotatedPillarData(22));

    public static final Block<BlockData> PALE_OAK_PLANKS = new Block<>(21, NamespacedKey.parse("minecraft:pale_oak_planks"), () -> new BlockData(25));

    public static final Block<BlockData> MANGROVE_PLANKS = new Block<>(22, NamespacedKey.parse("minecraft:mangrove_planks"), () -> new BlockData(26));

    public static final Block<BlockData> BAMBOO_PLANKS = new Block<>(23, NamespacedKey.parse("minecraft:bamboo_planks"), () -> new BlockData(27));

    public static final Block<BlockData> BAMBOO_MOSAIC = new Block<>(24, NamespacedKey.parse("minecraft:bamboo_mosaic"), () -> new BlockData(28));

    public static final Block<SaplingData> OAK_SAPLING = new Block<>(25, NamespacedKey.parse("minecraft:oak_sapling"), () -> new SaplingData(29));

    public static final Block<SaplingData> SPRUCE_SAPLING = new Block<>(26, NamespacedKey.parse("minecraft:spruce_sapling"), () -> new SaplingData(31));

    public static final Block<SaplingData> BIRCH_SAPLING = new Block<>(27, NamespacedKey.parse("minecraft:birch_sapling"), () -> new SaplingData(33));

    public static final Block<SaplingData> JUNGLE_SAPLING = new Block<>(28, NamespacedKey.parse("minecraft:jungle_sapling"), () -> new SaplingData(35));

    public static final Block<SaplingData> ACACIA_SAPLING = new Block<>(29, NamespacedKey.parse("minecraft:acacia_sapling"), () -> new SaplingData(37));

    public static final Block<SaplingData> CHERRY_SAPLING = new Block<>(30, NamespacedKey.parse("minecraft:cherry_sapling"), () -> new SaplingData(39));

    public static final Block<SaplingData> DARK_OAK_SAPLING = new Block<>(31, NamespacedKey.parse("minecraft:dark_oak_sapling"), () -> new SaplingData(41));

    public static final Block<SaplingData> PALE_OAK_SAPLING = new Block<>(32, NamespacedKey.parse("minecraft:pale_oak_sapling"), () -> new SaplingData(43));

    public static final Block<MangrovePropaguleData> MANGROVE_PROPAGULE = new Block<>(33, NamespacedKey.parse("minecraft:mangrove_propagule"), () -> new MangrovePropaguleData(45));

    public static final Block<BlockData> BEDROCK = new Block<>(34, NamespacedKey.parse("minecraft:bedrock"), () -> new BlockData(85));

    public static final Block<LiquidData> WATER = new Block<>(35, NamespacedKey.parse("minecraft:water"), () -> new LiquidData(86));

    public static final Block<LiquidData> LAVA = new Block<>(36, NamespacedKey.parse("minecraft:lava"), () -> new LiquidData(102));

    public static final Block<BlockData> SAND = new Block<>(37, NamespacedKey.parse("minecraft:sand"), () -> new BlockData(118));

    public static final Block<BrushableData> SUSPICIOUS_SAND = new Block<>(38, NamespacedKey.parse("minecraft:suspicious_sand"), () -> new BrushableData(119));

    public static final Block<BlockData> RED_SAND = new Block<>(39, NamespacedKey.parse("minecraft:red_sand"), () -> new BlockData(123));

    public static final Block<BlockData> GRAVEL = new Block<>(40, NamespacedKey.parse("minecraft:gravel"), () -> new BlockData(124));

    public static final Block<BrushableData> SUSPICIOUS_GRAVEL = new Block<>(41, NamespacedKey.parse("minecraft:suspicious_gravel"), () -> new BrushableData(125));

    public static final Block<BlockData> GOLD_ORE = new Block<>(42, NamespacedKey.parse("minecraft:gold_ore"), () -> new BlockData(129));

    public static final Block<BlockData> DEEPSLATE_GOLD_ORE = new Block<>(43, NamespacedKey.parse("minecraft:deepslate_gold_ore"), () -> new BlockData(130));

    public static final Block<BlockData> IRON_ORE = new Block<>(44, NamespacedKey.parse("minecraft:iron_ore"), () -> new BlockData(131));

    public static final Block<BlockData> DEEPSLATE_IRON_ORE = new Block<>(45, NamespacedKey.parse("minecraft:deepslate_iron_ore"), () -> new BlockData(132));

    public static final Block<BlockData> COAL_ORE = new Block<>(46, NamespacedKey.parse("minecraft:coal_ore"), () -> new BlockData(133));

    public static final Block<BlockData> DEEPSLATE_COAL_ORE = new Block<>(47, NamespacedKey.parse("minecraft:deepslate_coal_ore"), () -> new BlockData(134));

    public static final Block<BlockData> NETHER_GOLD_ORE = new Block<>(48, NamespacedKey.parse("minecraft:nether_gold_ore"), () -> new BlockData(135));

    public static final Block<RotatedPillarData> OAK_LOG = new Block<>(49, NamespacedKey.parse("minecraft:oak_log"), () -> new RotatedPillarData(136));

    public static final Block<RotatedPillarData> SPRUCE_LOG = new Block<>(50, NamespacedKey.parse("minecraft:spruce_log"), () -> new RotatedPillarData(139));

    public static final Block<RotatedPillarData> BIRCH_LOG = new Block<>(51, NamespacedKey.parse("minecraft:birch_log"), () -> new RotatedPillarData(142));

    public static final Block<RotatedPillarData> JUNGLE_LOG = new Block<>(52, NamespacedKey.parse("minecraft:jungle_log"), () -> new RotatedPillarData(145));

    public static final Block<RotatedPillarData> ACACIA_LOG = new Block<>(53, NamespacedKey.parse("minecraft:acacia_log"), () -> new RotatedPillarData(148));

    public static final Block<RotatedPillarData> CHERRY_LOG = new Block<>(54, NamespacedKey.parse("minecraft:cherry_log"), () -> new RotatedPillarData(151));

    public static final Block<RotatedPillarData> DARK_OAK_LOG = new Block<>(55, NamespacedKey.parse("minecraft:dark_oak_log"), () -> new RotatedPillarData(154));

    public static final Block<RotatedPillarData> PALE_OAK_LOG = new Block<>(56, NamespacedKey.parse("minecraft:pale_oak_log"), () -> new RotatedPillarData(157));

    public static final Block<RotatedPillarData> MANGROVE_LOG = new Block<>(57, NamespacedKey.parse("minecraft:mangrove_log"), () -> new RotatedPillarData(160));

    public static final Block<MangroveRootsData> MANGROVE_ROOTS = new Block<>(58, NamespacedKey.parse("minecraft:mangrove_roots"), () -> new MangroveRootsData(163));

    public static final Block<RotatedPillarData> MUDDY_MANGROVE_ROOTS = new Block<>(59, NamespacedKey.parse("minecraft:muddy_mangrove_roots"), () -> new RotatedPillarData(165));

    public static final Block<RotatedPillarData> BAMBOO_BLOCK = new Block<>(60, NamespacedKey.parse("minecraft:bamboo_block"), () -> new RotatedPillarData(168));

    public static final Block<RotatedPillarData> STRIPPED_SPRUCE_LOG = new Block<>(61, NamespacedKey.parse("minecraft:stripped_spruce_log"), () -> new RotatedPillarData(171));

    public static final Block<RotatedPillarData> STRIPPED_BIRCH_LOG = new Block<>(62, NamespacedKey.parse("minecraft:stripped_birch_log"), () -> new RotatedPillarData(174));

    public static final Block<RotatedPillarData> STRIPPED_JUNGLE_LOG = new Block<>(63, NamespacedKey.parse("minecraft:stripped_jungle_log"), () -> new RotatedPillarData(177));

    public static final Block<RotatedPillarData> STRIPPED_ACACIA_LOG = new Block<>(64, NamespacedKey.parse("minecraft:stripped_acacia_log"), () -> new RotatedPillarData(180));

    public static final Block<RotatedPillarData> STRIPPED_CHERRY_LOG = new Block<>(65, NamespacedKey.parse("minecraft:stripped_cherry_log"), () -> new RotatedPillarData(183));

    public static final Block<RotatedPillarData> STRIPPED_DARK_OAK_LOG = new Block<>(66, NamespacedKey.parse("minecraft:stripped_dark_oak_log"), () -> new RotatedPillarData(186));

    public static final Block<RotatedPillarData> STRIPPED_PALE_OAK_LOG = new Block<>(67, NamespacedKey.parse("minecraft:stripped_pale_oak_log"), () -> new RotatedPillarData(189));

    public static final Block<RotatedPillarData> STRIPPED_OAK_LOG = new Block<>(68, NamespacedKey.parse("minecraft:stripped_oak_log"), () -> new RotatedPillarData(192));

    public static final Block<RotatedPillarData> STRIPPED_MANGROVE_LOG = new Block<>(69, NamespacedKey.parse("minecraft:stripped_mangrove_log"), () -> new RotatedPillarData(195));

    public static final Block<RotatedPillarData> STRIPPED_BAMBOO_BLOCK = new Block<>(70, NamespacedKey.parse("minecraft:stripped_bamboo_block"), () -> new RotatedPillarData(198));

    public static final Block<RotatedPillarData> OAK_WOOD = new Block<>(71, NamespacedKey.parse("minecraft:oak_wood"), () -> new RotatedPillarData(201));

    public static final Block<RotatedPillarData> SPRUCE_WOOD = new Block<>(72, NamespacedKey.parse("minecraft:spruce_wood"), () -> new RotatedPillarData(204));

    public static final Block<RotatedPillarData> BIRCH_WOOD = new Block<>(73, NamespacedKey.parse("minecraft:birch_wood"), () -> new RotatedPillarData(207));

    public static final Block<RotatedPillarData> JUNGLE_WOOD = new Block<>(74, NamespacedKey.parse("minecraft:jungle_wood"), () -> new RotatedPillarData(210));

    public static final Block<RotatedPillarData> ACACIA_WOOD = new Block<>(75, NamespacedKey.parse("minecraft:acacia_wood"), () -> new RotatedPillarData(213));

    public static final Block<RotatedPillarData> CHERRY_WOOD = new Block<>(76, NamespacedKey.parse("minecraft:cherry_wood"), () -> new RotatedPillarData(216));

    public static final Block<RotatedPillarData> DARK_OAK_WOOD = new Block<>(77, NamespacedKey.parse("minecraft:dark_oak_wood"), () -> new RotatedPillarData(219));

    public static final Block<RotatedPillarData> MANGROVE_WOOD = new Block<>(78, NamespacedKey.parse("minecraft:mangrove_wood"), () -> new RotatedPillarData(222));

    public static final Block<RotatedPillarData> STRIPPED_OAK_WOOD = new Block<>(79, NamespacedKey.parse("minecraft:stripped_oak_wood"), () -> new RotatedPillarData(225));

    public static final Block<RotatedPillarData> STRIPPED_SPRUCE_WOOD = new Block<>(80, NamespacedKey.parse("minecraft:stripped_spruce_wood"), () -> new RotatedPillarData(228));

    public static final Block<RotatedPillarData> STRIPPED_BIRCH_WOOD = new Block<>(81, NamespacedKey.parse("minecraft:stripped_birch_wood"), () -> new RotatedPillarData(231));

    public static final Block<RotatedPillarData> STRIPPED_JUNGLE_WOOD = new Block<>(82, NamespacedKey.parse("minecraft:stripped_jungle_wood"), () -> new RotatedPillarData(234));

    public static final Block<RotatedPillarData> STRIPPED_ACACIA_WOOD = new Block<>(83, NamespacedKey.parse("minecraft:stripped_acacia_wood"), () -> new RotatedPillarData(237));

    public static final Block<RotatedPillarData> STRIPPED_CHERRY_WOOD = new Block<>(84, NamespacedKey.parse("minecraft:stripped_cherry_wood"), () -> new RotatedPillarData(240));

    public static final Block<RotatedPillarData> STRIPPED_DARK_OAK_WOOD = new Block<>(85, NamespacedKey.parse("minecraft:stripped_dark_oak_wood"), () -> new RotatedPillarData(243));

    public static final Block<RotatedPillarData> STRIPPED_PALE_OAK_WOOD = new Block<>(86, NamespacedKey.parse("minecraft:stripped_pale_oak_wood"), () -> new RotatedPillarData(246));

    public static final Block<RotatedPillarData> STRIPPED_MANGROVE_WOOD = new Block<>(87, NamespacedKey.parse("minecraft:stripped_mangrove_wood"), () -> new RotatedPillarData(249));

    public static final Block<TintedParticleLeavesData> OAK_LEAVES = new Block<>(88, NamespacedKey.parse("minecraft:oak_leaves"), () -> new TintedParticleLeavesData(252));

    public static final Block<TintedParticleLeavesData> SPRUCE_LEAVES = new Block<>(89, NamespacedKey.parse("minecraft:spruce_leaves"), () -> new TintedParticleLeavesData(280));

    public static final Block<TintedParticleLeavesData> BIRCH_LEAVES = new Block<>(90, NamespacedKey.parse("minecraft:birch_leaves"), () -> new TintedParticleLeavesData(308));

    public static final Block<TintedParticleLeavesData> JUNGLE_LEAVES = new Block<>(91, NamespacedKey.parse("minecraft:jungle_leaves"), () -> new TintedParticleLeavesData(336));

    public static final Block<TintedParticleLeavesData> ACACIA_LEAVES = new Block<>(92, NamespacedKey.parse("minecraft:acacia_leaves"), () -> new TintedParticleLeavesData(364));

    public static final Block<UntintedParticleLeavesData> CHERRY_LEAVES = new Block<>(93, NamespacedKey.parse("minecraft:cherry_leaves"), () -> new UntintedParticleLeavesData(392));

    public static final Block<TintedParticleLeavesData> DARK_OAK_LEAVES = new Block<>(94, NamespacedKey.parse("minecraft:dark_oak_leaves"), () -> new TintedParticleLeavesData(420));

    public static final Block<UntintedParticleLeavesData> PALE_OAK_LEAVES = new Block<>(95, NamespacedKey.parse("minecraft:pale_oak_leaves"), () -> new UntintedParticleLeavesData(448));

    public static final Block<MangroveLeavesData> MANGROVE_LEAVES = new Block<>(96, NamespacedKey.parse("minecraft:mangrove_leaves"), () -> new MangroveLeavesData(476));

    public static final Block<UntintedParticleLeavesData> AZALEA_LEAVES = new Block<>(97, NamespacedKey.parse("minecraft:azalea_leaves"), () -> new UntintedParticleLeavesData(504));

    public static final Block<UntintedParticleLeavesData> FLOWERING_AZALEA_LEAVES = new Block<>(98, NamespacedKey.parse("minecraft:flowering_azalea_leaves"), () -> new UntintedParticleLeavesData(532));

    public static final Block<BlockData> SPONGE = new Block<>(99, NamespacedKey.parse("minecraft:sponge"), () -> new BlockData(560));

    public static final Block<BlockData> WET_SPONGE = new Block<>(100, NamespacedKey.parse("minecraft:wet_sponge"), () -> new BlockData(561));

    public static final Block<BlockData> GLASS = new Block<>(101, NamespacedKey.parse("minecraft:glass"), () -> new BlockData(562));

    public static final Block<BlockData> LAPIS_ORE = new Block<>(102, NamespacedKey.parse("minecraft:lapis_ore"), () -> new BlockData(563));

    public static final Block<BlockData> DEEPSLATE_LAPIS_ORE = new Block<>(103, NamespacedKey.parse("minecraft:deepslate_lapis_ore"), () -> new BlockData(564));

    public static final Block<BlockData> LAPIS_BLOCK = new Block<>(104, NamespacedKey.parse("minecraft:lapis_block"), () -> new BlockData(565));

    public static final Block<DispenserData> DISPENSER = new Block<>(105, NamespacedKey.parse("minecraft:dispenser"), () -> new DispenserData(566));

    public static final Block<BlockData> SANDSTONE = new Block<>(106, NamespacedKey.parse("minecraft:sandstone"), () -> new BlockData(578));

    public static final Block<BlockData> CHISELED_SANDSTONE = new Block<>(107, NamespacedKey.parse("minecraft:chiseled_sandstone"), () -> new BlockData(579));

    public static final Block<BlockData> CUT_SANDSTONE = new Block<>(108, NamespacedKey.parse("minecraft:cut_sandstone"), () -> new BlockData(580));

    public static final Block<NoteData> NOTE_BLOCK = new Block<>(109, NamespacedKey.parse("minecraft:note_block"), () -> new NoteData(581));

    public static final Block<BedData> WHITE_BED = new Block<>(110, NamespacedKey.parse("minecraft:white_bed"), () -> new BedData(1731));

    public static final Block<BedData> ORANGE_BED = new Block<>(111, NamespacedKey.parse("minecraft:orange_bed"), () -> new BedData(1747));

    public static final Block<BedData> MAGENTA_BED = new Block<>(112, NamespacedKey.parse("minecraft:magenta_bed"), () -> new BedData(1763));

    public static final Block<BedData> LIGHT_BLUE_BED = new Block<>(113, NamespacedKey.parse("minecraft:light_blue_bed"), () -> new BedData(1779));

    public static final Block<BedData> YELLOW_BED = new Block<>(114, NamespacedKey.parse("minecraft:yellow_bed"), () -> new BedData(1795));

    public static final Block<BedData> LIME_BED = new Block<>(115, NamespacedKey.parse("minecraft:lime_bed"), () -> new BedData(1811));

    public static final Block<BedData> PINK_BED = new Block<>(116, NamespacedKey.parse("minecraft:pink_bed"), () -> new BedData(1827));

    public static final Block<BedData> GRAY_BED = new Block<>(117, NamespacedKey.parse("minecraft:gray_bed"), () -> new BedData(1843));

    public static final Block<BedData> LIGHT_GRAY_BED = new Block<>(118, NamespacedKey.parse("minecraft:light_gray_bed"), () -> new BedData(1859));

    public static final Block<BedData> CYAN_BED = new Block<>(119, NamespacedKey.parse("minecraft:cyan_bed"), () -> new BedData(1875));

    public static final Block<BedData> PURPLE_BED = new Block<>(120, NamespacedKey.parse("minecraft:purple_bed"), () -> new BedData(1891));

    public static final Block<BedData> BLUE_BED = new Block<>(121, NamespacedKey.parse("minecraft:blue_bed"), () -> new BedData(1907));

    public static final Block<BedData> BROWN_BED = new Block<>(122, NamespacedKey.parse("minecraft:brown_bed"), () -> new BedData(1923));

    public static final Block<BedData> GREEN_BED = new Block<>(123, NamespacedKey.parse("minecraft:green_bed"), () -> new BedData(1939));

    public static final Block<BedData> RED_BED = new Block<>(124, NamespacedKey.parse("minecraft:red_bed"), () -> new BedData(1955));

    public static final Block<BedData> BLACK_BED = new Block<>(125, NamespacedKey.parse("minecraft:black_bed"), () -> new BedData(1971));

    public static final Block<PoweredRailData> POWERED_RAIL = new Block<>(126, NamespacedKey.parse("minecraft:powered_rail"), () -> new PoweredRailData(1987));

    public static final Block<DetectorRailData> DETECTOR_RAIL = new Block<>(127, NamespacedKey.parse("minecraft:detector_rail"), () -> new DetectorRailData(2011));

    public static final Block<PistonBaseData> STICKY_PISTON = new Block<>(128, NamespacedKey.parse("minecraft:sticky_piston"), () -> new PistonBaseData(2035));

    public static final Block<BlockData> COBWEB = new Block<>(129, NamespacedKey.parse("minecraft:cobweb"), () -> new BlockData(2047));

    public static final Block<BlockData> SHORT_GRASS = new Block<>(130, NamespacedKey.parse("minecraft:short_grass"), () -> new BlockData(2048));

    public static final Block<BlockData> FERN = new Block<>(131, NamespacedKey.parse("minecraft:fern"), () -> new BlockData(2049));

    public static final Block<BlockData> DEAD_BUSH = new Block<>(132, NamespacedKey.parse("minecraft:dead_bush"), () -> new BlockData(2050));

    public static final Block<BlockData> BUSH = new Block<>(133, NamespacedKey.parse("minecraft:bush"), () -> new BlockData(2051));

    public static final Block<BlockData> SHORT_DRY_GRASS = new Block<>(134, NamespacedKey.parse("minecraft:short_dry_grass"), () -> new BlockData(2052));

    public static final Block<BlockData> TALL_DRY_GRASS = new Block<>(135, NamespacedKey.parse("minecraft:tall_dry_grass"), () -> new BlockData(2053));

    public static final Block<BlockData> SEAGRASS = new Block<>(136, NamespacedKey.parse("minecraft:seagrass"), () -> new BlockData(2054));

    public static final Block<TallSeagrassData> TALL_SEAGRASS = new Block<>(137, NamespacedKey.parse("minecraft:tall_seagrass"), () -> new TallSeagrassData(2055));

    public static final Block<PistonBaseData> PISTON = new Block<>(138, NamespacedKey.parse("minecraft:piston"), () -> new PistonBaseData(2057));

    public static final Block<PistonHeadData> PISTON_HEAD = new Block<>(139, NamespacedKey.parse("minecraft:piston_head"), () -> new PistonHeadData(2069));

    public static final Block<BlockData> WHITE_WOOL = new Block<>(140, NamespacedKey.parse("minecraft:white_wool"), () -> new BlockData(2093));

    public static final Block<BlockData> ORANGE_WOOL = new Block<>(141, NamespacedKey.parse("minecraft:orange_wool"), () -> new BlockData(2094));

    public static final Block<BlockData> MAGENTA_WOOL = new Block<>(142, NamespacedKey.parse("minecraft:magenta_wool"), () -> new BlockData(2095));

    public static final Block<BlockData> LIGHT_BLUE_WOOL = new Block<>(143, NamespacedKey.parse("minecraft:light_blue_wool"), () -> new BlockData(2096));

    public static final Block<BlockData> YELLOW_WOOL = new Block<>(144, NamespacedKey.parse("minecraft:yellow_wool"), () -> new BlockData(2097));

    public static final Block<BlockData> LIME_WOOL = new Block<>(145, NamespacedKey.parse("minecraft:lime_wool"), () -> new BlockData(2098));

    public static final Block<BlockData> PINK_WOOL = new Block<>(146, NamespacedKey.parse("minecraft:pink_wool"), () -> new BlockData(2099));

    public static final Block<BlockData> GRAY_WOOL = new Block<>(147, NamespacedKey.parse("minecraft:gray_wool"), () -> new BlockData(2100));

    public static final Block<BlockData> LIGHT_GRAY_WOOL = new Block<>(148, NamespacedKey.parse("minecraft:light_gray_wool"), () -> new BlockData(2101));

    public static final Block<BlockData> CYAN_WOOL = new Block<>(149, NamespacedKey.parse("minecraft:cyan_wool"), () -> new BlockData(2102));

    public static final Block<BlockData> PURPLE_WOOL = new Block<>(150, NamespacedKey.parse("minecraft:purple_wool"), () -> new BlockData(2103));

    public static final Block<BlockData> BLUE_WOOL = new Block<>(151, NamespacedKey.parse("minecraft:blue_wool"), () -> new BlockData(2104));

    public static final Block<BlockData> BROWN_WOOL = new Block<>(152, NamespacedKey.parse("minecraft:brown_wool"), () -> new BlockData(2105));

    public static final Block<BlockData> GREEN_WOOL = new Block<>(153, NamespacedKey.parse("minecraft:green_wool"), () -> new BlockData(2106));

    public static final Block<BlockData> RED_WOOL = new Block<>(154, NamespacedKey.parse("minecraft:red_wool"), () -> new BlockData(2107));

    public static final Block<BlockData> BLACK_WOOL = new Block<>(155, NamespacedKey.parse("minecraft:black_wool"), () -> new BlockData(2108));

    public static final Block<MovingPistonData> MOVING_PISTON = new Block<>(156, NamespacedKey.parse("minecraft:moving_piston"), () -> new MovingPistonData(2109));

    public static final Block<BlockData> DANDELION = new Block<>(157, NamespacedKey.parse("minecraft:dandelion"), () -> new BlockData(2121));

    public static final Block<BlockData> TORCHFLOWER = new Block<>(158, NamespacedKey.parse("minecraft:torchflower"), () -> new BlockData(2122));

    public static final Block<BlockData> POPPY = new Block<>(159, NamespacedKey.parse("minecraft:poppy"), () -> new BlockData(2123));

    public static final Block<BlockData> BLUE_ORCHID = new Block<>(160, NamespacedKey.parse("minecraft:blue_orchid"), () -> new BlockData(2124));

    public static final Block<BlockData> ALLIUM = new Block<>(161, NamespacedKey.parse("minecraft:allium"), () -> new BlockData(2125));

    public static final Block<BlockData> AZURE_BLUET = new Block<>(162, NamespacedKey.parse("minecraft:azure_bluet"), () -> new BlockData(2126));

    public static final Block<BlockData> RED_TULIP = new Block<>(163, NamespacedKey.parse("minecraft:red_tulip"), () -> new BlockData(2127));

    public static final Block<BlockData> ORANGE_TULIP = new Block<>(164, NamespacedKey.parse("minecraft:orange_tulip"), () -> new BlockData(2128));

    public static final Block<BlockData> WHITE_TULIP = new Block<>(165, NamespacedKey.parse("minecraft:white_tulip"), () -> new BlockData(2129));

    public static final Block<BlockData> PINK_TULIP = new Block<>(166, NamespacedKey.parse("minecraft:pink_tulip"), () -> new BlockData(2130));

    public static final Block<BlockData> OXEYE_DAISY = new Block<>(167, NamespacedKey.parse("minecraft:oxeye_daisy"), () -> new BlockData(2131));

    public static final Block<BlockData> CORNFLOWER = new Block<>(168, NamespacedKey.parse("minecraft:cornflower"), () -> new BlockData(2132));

    public static final Block<BlockData> WITHER_ROSE = new Block<>(169, NamespacedKey.parse("minecraft:wither_rose"), () -> new BlockData(2133));

    public static final Block<BlockData> LILY_OF_THE_VALLEY = new Block<>(170, NamespacedKey.parse("minecraft:lily_of_the_valley"), () -> new BlockData(2134));

    public static final Block<BlockData> BROWN_MUSHROOM = new Block<>(171, NamespacedKey.parse("minecraft:brown_mushroom"), () -> new BlockData(2135));

    public static final Block<BlockData> RED_MUSHROOM = new Block<>(172, NamespacedKey.parse("minecraft:red_mushroom"), () -> new BlockData(2136));

    public static final Block<BlockData> GOLD_BLOCK = new Block<>(173, NamespacedKey.parse("minecraft:gold_block"), () -> new BlockData(2137));

    public static final Block<BlockData> IRON_BLOCK = new Block<>(174, NamespacedKey.parse("minecraft:iron_block"), () -> new BlockData(2138));

    public static final Block<BlockData> BRICKS = new Block<>(175, NamespacedKey.parse("minecraft:bricks"), () -> new BlockData(2139));

    public static final Block<TntData> TNT = new Block<>(176, NamespacedKey.parse("minecraft:tnt"), () -> new TntData(2140));

    public static final Block<BlockData> BOOKSHELF = new Block<>(177, NamespacedKey.parse("minecraft:bookshelf"), () -> new BlockData(2142));

    public static final Block<ChiseledBookShelfData> CHISELED_BOOKSHELF = new Block<>(178, NamespacedKey.parse("minecraft:chiseled_bookshelf"), () -> new ChiseledBookShelfData(2143));

    public static final Block<BlockData> MOSSY_COBBLESTONE = new Block<>(179, NamespacedKey.parse("minecraft:mossy_cobblestone"), () -> new BlockData(2399));

    public static final Block<BlockData> OBSIDIAN = new Block<>(180, NamespacedKey.parse("minecraft:obsidian"), () -> new BlockData(2400));

    public static final Block<BlockData> TORCH = new Block<>(181, NamespacedKey.parse("minecraft:torch"), () -> new BlockData(2401));

    public static final Block<WallTorchData> WALL_TORCH = new Block<>(182, NamespacedKey.parse("minecraft:wall_torch"), () -> new WallTorchData(2402));

    public static final Block<FireData> FIRE = new Block<>(183, NamespacedKey.parse("minecraft:fire"), () -> new FireData(2406));

    public static final Block<BlockData> SOUL_FIRE = new Block<>(184, NamespacedKey.parse("minecraft:soul_fire"), () -> new BlockData(2918));

    public static final Block<BlockData> SPAWNER = new Block<>(185, NamespacedKey.parse("minecraft:spawner"), () -> new BlockData(2919));

    public static final Block<CreakingHeartData> CREAKING_HEART = new Block<>(186, NamespacedKey.parse("minecraft:creaking_heart"), () -> new CreakingHeartData(2920));

    public static final Block<StairData> OAK_STAIRS = new Block<>(187, NamespacedKey.parse("minecraft:oak_stairs"), () -> new StairData(2938));

    public static final Block<ChestData> CHEST = new Block<>(188, NamespacedKey.parse("minecraft:chest"), () -> new ChestData(3018));

    public static final Block<RedstoneWireData> REDSTONE_WIRE = new Block<>(189, NamespacedKey.parse("minecraft:redstone_wire"), () -> new RedstoneWireData(3042));

    public static final Block<BlockData> DIAMOND_ORE = new Block<>(190, NamespacedKey.parse("minecraft:diamond_ore"), () -> new BlockData(4338));

    public static final Block<BlockData> DEEPSLATE_DIAMOND_ORE = new Block<>(191, NamespacedKey.parse("minecraft:deepslate_diamond_ore"), () -> new BlockData(4339));

    public static final Block<BlockData> DIAMOND_BLOCK = new Block<>(192, NamespacedKey.parse("minecraft:diamond_block"), () -> new BlockData(4340));

    public static final Block<BlockData> CRAFTING_TABLE = new Block<>(193, NamespacedKey.parse("minecraft:crafting_table"), () -> new BlockData(4341));

    public static final Block<CropData> WHEAT = new Block<>(194, NamespacedKey.parse("minecraft:wheat"), () -> new CropData(4342));

    public static final Block<FarmData> FARMLAND = new Block<>(195, NamespacedKey.parse("minecraft:farmland"), () -> new FarmData(4350));

    public static final Block<FurnaceData> FURNACE = new Block<>(196, NamespacedKey.parse("minecraft:furnace"), () -> new FurnaceData(4358));

    public static final Block<StandingSignData> OAK_SIGN = new Block<>(197, NamespacedKey.parse("minecraft:oak_sign"), () -> new StandingSignData(4366));

    public static final Block<StandingSignData> SPRUCE_SIGN = new Block<>(198, NamespacedKey.parse("minecraft:spruce_sign"), () -> new StandingSignData(4398));

    public static final Block<StandingSignData> BIRCH_SIGN = new Block<>(199, NamespacedKey.parse("minecraft:birch_sign"), () -> new StandingSignData(4430));

    public static final Block<StandingSignData> ACACIA_SIGN = new Block<>(200, NamespacedKey.parse("minecraft:acacia_sign"), () -> new StandingSignData(4462));

    public static final Block<StandingSignData> CHERRY_SIGN = new Block<>(201, NamespacedKey.parse("minecraft:cherry_sign"), () -> new StandingSignData(4494));

    public static final Block<StandingSignData> JUNGLE_SIGN = new Block<>(202, NamespacedKey.parse("minecraft:jungle_sign"), () -> new StandingSignData(4526));

    public static final Block<StandingSignData> DARK_OAK_SIGN = new Block<>(203, NamespacedKey.parse("minecraft:dark_oak_sign"), () -> new StandingSignData(4558));

    public static final Block<StandingSignData> PALE_OAK_SIGN = new Block<>(204, NamespacedKey.parse("minecraft:pale_oak_sign"), () -> new StandingSignData(4590));

    public static final Block<StandingSignData> MANGROVE_SIGN = new Block<>(205, NamespacedKey.parse("minecraft:mangrove_sign"), () -> new StandingSignData(4622));

    public static final Block<StandingSignData> BAMBOO_SIGN = new Block<>(206, NamespacedKey.parse("minecraft:bamboo_sign"), () -> new StandingSignData(4654));

    public static final Block<DoorData> OAK_DOOR = new Block<>(207, NamespacedKey.parse("minecraft:oak_door"), () -> new DoorData(4686));

    public static final Block<LadderData> LADDER = new Block<>(208, NamespacedKey.parse("minecraft:ladder"), () -> new LadderData(4750));

    public static final Block<RailData> RAIL = new Block<>(209, NamespacedKey.parse("minecraft:rail"), () -> new RailData(4758));

    public static final Block<StairData> COBBLESTONE_STAIRS = new Block<>(210, NamespacedKey.parse("minecraft:cobblestone_stairs"), () -> new StairData(4778));

    public static final Block<WallSignData> OAK_WALL_SIGN = new Block<>(211, NamespacedKey.parse("minecraft:oak_wall_sign"), () -> new WallSignData(4858));

    public static final Block<WallSignData> SPRUCE_WALL_SIGN = new Block<>(212, NamespacedKey.parse("minecraft:spruce_wall_sign"), () -> new WallSignData(4866));

    public static final Block<WallSignData> BIRCH_WALL_SIGN = new Block<>(213, NamespacedKey.parse("minecraft:birch_wall_sign"), () -> new WallSignData(4874));

    public static final Block<WallSignData> ACACIA_WALL_SIGN = new Block<>(214, NamespacedKey.parse("minecraft:acacia_wall_sign"), () -> new WallSignData(4882));

    public static final Block<WallSignData> CHERRY_WALL_SIGN = new Block<>(215, NamespacedKey.parse("minecraft:cherry_wall_sign"), () -> new WallSignData(4890));

    public static final Block<WallSignData> JUNGLE_WALL_SIGN = new Block<>(216, NamespacedKey.parse("minecraft:jungle_wall_sign"), () -> new WallSignData(4898));

    public static final Block<WallSignData> DARK_OAK_WALL_SIGN = new Block<>(217, NamespacedKey.parse("minecraft:dark_oak_wall_sign"), () -> new WallSignData(4906));

    public static final Block<WallSignData> PALE_OAK_WALL_SIGN = new Block<>(218, NamespacedKey.parse("minecraft:pale_oak_wall_sign"), () -> new WallSignData(4914));

    public static final Block<WallSignData> MANGROVE_WALL_SIGN = new Block<>(219, NamespacedKey.parse("minecraft:mangrove_wall_sign"), () -> new WallSignData(4922));

    public static final Block<WallSignData> BAMBOO_WALL_SIGN = new Block<>(220, NamespacedKey.parse("minecraft:bamboo_wall_sign"), () -> new WallSignData(4930));

    public static final Block<CeilingHangingSignData> OAK_HANGING_SIGN = new Block<>(221, NamespacedKey.parse("minecraft:oak_hanging_sign"), () -> new CeilingHangingSignData(4938));

    public static final Block<CeilingHangingSignData> SPRUCE_HANGING_SIGN = new Block<>(222, NamespacedKey.parse("minecraft:spruce_hanging_sign"), () -> new CeilingHangingSignData(5002));

    public static final Block<CeilingHangingSignData> BIRCH_HANGING_SIGN = new Block<>(223, NamespacedKey.parse("minecraft:birch_hanging_sign"), () -> new CeilingHangingSignData(5066));

    public static final Block<CeilingHangingSignData> ACACIA_HANGING_SIGN = new Block<>(224, NamespacedKey.parse("minecraft:acacia_hanging_sign"), () -> new CeilingHangingSignData(5130));

    public static final Block<CeilingHangingSignData> CHERRY_HANGING_SIGN = new Block<>(225, NamespacedKey.parse("minecraft:cherry_hanging_sign"), () -> new CeilingHangingSignData(5194));

    public static final Block<CeilingHangingSignData> JUNGLE_HANGING_SIGN = new Block<>(226, NamespacedKey.parse("minecraft:jungle_hanging_sign"), () -> new CeilingHangingSignData(5258));

    public static final Block<CeilingHangingSignData> DARK_OAK_HANGING_SIGN = new Block<>(227, NamespacedKey.parse("minecraft:dark_oak_hanging_sign"), () -> new CeilingHangingSignData(5322));

    public static final Block<CeilingHangingSignData> PALE_OAK_HANGING_SIGN = new Block<>(228, NamespacedKey.parse("minecraft:pale_oak_hanging_sign"), () -> new CeilingHangingSignData(5386));

    public static final Block<CeilingHangingSignData> CRIMSON_HANGING_SIGN = new Block<>(229, NamespacedKey.parse("minecraft:crimson_hanging_sign"), () -> new CeilingHangingSignData(5450));

    public static final Block<CeilingHangingSignData> WARPED_HANGING_SIGN = new Block<>(230, NamespacedKey.parse("minecraft:warped_hanging_sign"), () -> new CeilingHangingSignData(5514));

    public static final Block<CeilingHangingSignData> MANGROVE_HANGING_SIGN = new Block<>(231, NamespacedKey.parse("minecraft:mangrove_hanging_sign"), () -> new CeilingHangingSignData(5578));

    public static final Block<CeilingHangingSignData> BAMBOO_HANGING_SIGN = new Block<>(232, NamespacedKey.parse("minecraft:bamboo_hanging_sign"), () -> new CeilingHangingSignData(5642));

    public static final Block<WallHangingSignData> OAK_WALL_HANGING_SIGN = new Block<>(233, NamespacedKey.parse("minecraft:oak_wall_hanging_sign"), () -> new WallHangingSignData(5706));

    public static final Block<WallHangingSignData> SPRUCE_WALL_HANGING_SIGN = new Block<>(234, NamespacedKey.parse("minecraft:spruce_wall_hanging_sign"), () -> new WallHangingSignData(5714));

    public static final Block<WallHangingSignData> BIRCH_WALL_HANGING_SIGN = new Block<>(235, NamespacedKey.parse("minecraft:birch_wall_hanging_sign"), () -> new WallHangingSignData(5722));

    public static final Block<WallHangingSignData> ACACIA_WALL_HANGING_SIGN = new Block<>(236, NamespacedKey.parse("minecraft:acacia_wall_hanging_sign"), () -> new WallHangingSignData(5730));

    public static final Block<WallHangingSignData> CHERRY_WALL_HANGING_SIGN = new Block<>(237, NamespacedKey.parse("minecraft:cherry_wall_hanging_sign"), () -> new WallHangingSignData(5738));

    public static final Block<WallHangingSignData> JUNGLE_WALL_HANGING_SIGN = new Block<>(238, NamespacedKey.parse("minecraft:jungle_wall_hanging_sign"), () -> new WallHangingSignData(5746));

    public static final Block<WallHangingSignData> DARK_OAK_WALL_HANGING_SIGN = new Block<>(239, NamespacedKey.parse("minecraft:dark_oak_wall_hanging_sign"), () -> new WallHangingSignData(5754));

    public static final Block<WallHangingSignData> PALE_OAK_WALL_HANGING_SIGN = new Block<>(240, NamespacedKey.parse("minecraft:pale_oak_wall_hanging_sign"), () -> new WallHangingSignData(5762));

    public static final Block<WallHangingSignData> MANGROVE_WALL_HANGING_SIGN = new Block<>(241, NamespacedKey.parse("minecraft:mangrove_wall_hanging_sign"), () -> new WallHangingSignData(5770));

    public static final Block<WallHangingSignData> CRIMSON_WALL_HANGING_SIGN = new Block<>(242, NamespacedKey.parse("minecraft:crimson_wall_hanging_sign"), () -> new WallHangingSignData(5778));

    public static final Block<WallHangingSignData> WARPED_WALL_HANGING_SIGN = new Block<>(243, NamespacedKey.parse("minecraft:warped_wall_hanging_sign"), () -> new WallHangingSignData(5786));

    public static final Block<WallHangingSignData> BAMBOO_WALL_HANGING_SIGN = new Block<>(244, NamespacedKey.parse("minecraft:bamboo_wall_hanging_sign"), () -> new WallHangingSignData(5794));

    public static final Block<LeverData> LEVER = new Block<>(245, NamespacedKey.parse("minecraft:lever"), () -> new LeverData(5802));

    public static final Block<PressurePlateData> STONE_PRESSURE_PLATE = new Block<>(246, NamespacedKey.parse("minecraft:stone_pressure_plate"), () -> new PressurePlateData(5826));

    public static final Block<DoorData> IRON_DOOR = new Block<>(247, NamespacedKey.parse("minecraft:iron_door"), () -> new DoorData(5828));

    public static final Block<PressurePlateData> OAK_PRESSURE_PLATE = new Block<>(248, NamespacedKey.parse("minecraft:oak_pressure_plate"), () -> new PressurePlateData(5892));

    public static final Block<PressurePlateData> SPRUCE_PRESSURE_PLATE = new Block<>(249, NamespacedKey.parse("minecraft:spruce_pressure_plate"), () -> new PressurePlateData(5894));

    public static final Block<PressurePlateData> BIRCH_PRESSURE_PLATE = new Block<>(250, NamespacedKey.parse("minecraft:birch_pressure_plate"), () -> new PressurePlateData(5896));

    public static final Block<PressurePlateData> JUNGLE_PRESSURE_PLATE = new Block<>(251, NamespacedKey.parse("minecraft:jungle_pressure_plate"), () -> new PressurePlateData(5898));

    public static final Block<PressurePlateData> ACACIA_PRESSURE_PLATE = new Block<>(252, NamespacedKey.parse("minecraft:acacia_pressure_plate"), () -> new PressurePlateData(5900));

    public static final Block<PressurePlateData> CHERRY_PRESSURE_PLATE = new Block<>(253, NamespacedKey.parse("minecraft:cherry_pressure_plate"), () -> new PressurePlateData(5902));

    public static final Block<PressurePlateData> DARK_OAK_PRESSURE_PLATE = new Block<>(254, NamespacedKey.parse("minecraft:dark_oak_pressure_plate"), () -> new PressurePlateData(5904));

    public static final Block<PressurePlateData> PALE_OAK_PRESSURE_PLATE = new Block<>(255, NamespacedKey.parse("minecraft:pale_oak_pressure_plate"), () -> new PressurePlateData(5906));

    public static final Block<PressurePlateData> MANGROVE_PRESSURE_PLATE = new Block<>(256, NamespacedKey.parse("minecraft:mangrove_pressure_plate"), () -> new PressurePlateData(5908));

    public static final Block<PressurePlateData> BAMBOO_PRESSURE_PLATE = new Block<>(257, NamespacedKey.parse("minecraft:bamboo_pressure_plate"), () -> new PressurePlateData(5910));

    public static final Block<RedstoneOreData> REDSTONE_ORE = new Block<>(258, NamespacedKey.parse("minecraft:redstone_ore"), () -> new RedstoneOreData(5912));

    public static final Block<RedstoneOreData> DEEPSLATE_REDSTONE_ORE = new Block<>(259, NamespacedKey.parse("minecraft:deepslate_redstone_ore"), () -> new RedstoneOreData(5914));

    public static final Block<RedstoneTorchData> REDSTONE_TORCH = new Block<>(260, NamespacedKey.parse("minecraft:redstone_torch"), () -> new RedstoneTorchData(5916));

    public static final Block<RedstoneWallTorchData> REDSTONE_WALL_TORCH = new Block<>(261, NamespacedKey.parse("minecraft:redstone_wall_torch"), () -> new RedstoneWallTorchData(5918));

    public static final Block<ButtonData> STONE_BUTTON = new Block<>(262, NamespacedKey.parse("minecraft:stone_button"), () -> new ButtonData(5926));

    public static final Block<SnowLayerData> SNOW = new Block<>(263, NamespacedKey.parse("minecraft:snow"), () -> new SnowLayerData(5950));

    public static final Block<BlockData> ICE = new Block<>(264, NamespacedKey.parse("minecraft:ice"), () -> new BlockData(5958));

    public static final Block<BlockData> SNOW_BLOCK = new Block<>(265, NamespacedKey.parse("minecraft:snow_block"), () -> new BlockData(5959));

    public static final Block<CactusData> CACTUS = new Block<>(266, NamespacedKey.parse("minecraft:cactus"), () -> new CactusData(5960));

    public static final Block<BlockData> CACTUS_FLOWER = new Block<>(267, NamespacedKey.parse("minecraft:cactus_flower"), () -> new BlockData(5976));

    public static final Block<BlockData> CLAY = new Block<>(268, NamespacedKey.parse("minecraft:clay"), () -> new BlockData(5977));

    public static final Block<SugarCaneData> SUGAR_CANE = new Block<>(269, NamespacedKey.parse("minecraft:sugar_cane"), () -> new SugarCaneData(5978));

    public static final Block<JukeboxData> JUKEBOX = new Block<>(270, NamespacedKey.parse("minecraft:jukebox"), () -> new JukeboxData(5994));

    public static final Block<FenceData> OAK_FENCE = new Block<>(271, NamespacedKey.parse("minecraft:oak_fence"), () -> new FenceData(5996));

    public static final Block<BlockData> NETHERRACK = new Block<>(272, NamespacedKey.parse("minecraft:netherrack"), () -> new BlockData(6028));

    public static final Block<BlockData> SOUL_SAND = new Block<>(273, NamespacedKey.parse("minecraft:soul_sand"), () -> new BlockData(6029));

    public static final Block<BlockData> SOUL_SOIL = new Block<>(274, NamespacedKey.parse("minecraft:soul_soil"), () -> new BlockData(6030));

    public static final Block<RotatedPillarData> BASALT = new Block<>(275, NamespacedKey.parse("minecraft:basalt"), () -> new RotatedPillarData(6031));

    public static final Block<RotatedPillarData> POLISHED_BASALT = new Block<>(276, NamespacedKey.parse("minecraft:polished_basalt"), () -> new RotatedPillarData(6034));

    public static final Block<BlockData> SOUL_TORCH = new Block<>(277, NamespacedKey.parse("minecraft:soul_torch"), () -> new BlockData(6037));

    public static final Block<WallTorchData> SOUL_WALL_TORCH = new Block<>(278, NamespacedKey.parse("minecraft:soul_wall_torch"), () -> new WallTorchData(6038));

    public static final Block<BlockData> GLOWSTONE = new Block<>(279, NamespacedKey.parse("minecraft:glowstone"), () -> new BlockData(6042));

    public static final Block<NetherPortalData> NETHER_PORTAL = new Block<>(280, NamespacedKey.parse("minecraft:nether_portal"), () -> new NetherPortalData(6043));

    public static final Block<JackOLanternData> CARVED_PUMPKIN = new Block<>(281, NamespacedKey.parse("minecraft:carved_pumpkin"), () -> new JackOLanternData(6045));

    public static final Block<JackOLanternData> JACK_O_LANTERN = new Block<>(282, NamespacedKey.parse("minecraft:jack_o_lantern"), () -> new JackOLanternData(6049));

    public static final Block<CakeData> CAKE = new Block<>(283, NamespacedKey.parse("minecraft:cake"), () -> new CakeData(6053));

    public static final Block<RepeaterData> REPEATER = new Block<>(284, NamespacedKey.parse("minecraft:repeater"), () -> new RepeaterData(6060));

    public static final Block<BlockData> WHITE_STAINED_GLASS = new Block<>(285, NamespacedKey.parse("minecraft:white_stained_glass"), () -> new BlockData(6124));

    public static final Block<BlockData> ORANGE_STAINED_GLASS = new Block<>(286, NamespacedKey.parse("minecraft:orange_stained_glass"), () -> new BlockData(6125));

    public static final Block<BlockData> MAGENTA_STAINED_GLASS = new Block<>(287, NamespacedKey.parse("minecraft:magenta_stained_glass"), () -> new BlockData(6126));

    public static final Block<BlockData> LIGHT_BLUE_STAINED_GLASS = new Block<>(288, NamespacedKey.parse("minecraft:light_blue_stained_glass"), () -> new BlockData(6127));

    public static final Block<BlockData> YELLOW_STAINED_GLASS = new Block<>(289, NamespacedKey.parse("minecraft:yellow_stained_glass"), () -> new BlockData(6128));

    public static final Block<BlockData> LIME_STAINED_GLASS = new Block<>(290, NamespacedKey.parse("minecraft:lime_stained_glass"), () -> new BlockData(6129));

    public static final Block<BlockData> PINK_STAINED_GLASS = new Block<>(291, NamespacedKey.parse("minecraft:pink_stained_glass"), () -> new BlockData(6130));

    public static final Block<BlockData> GRAY_STAINED_GLASS = new Block<>(292, NamespacedKey.parse("minecraft:gray_stained_glass"), () -> new BlockData(6131));

    public static final Block<BlockData> LIGHT_GRAY_STAINED_GLASS = new Block<>(293, NamespacedKey.parse("minecraft:light_gray_stained_glass"), () -> new BlockData(6132));

    public static final Block<BlockData> CYAN_STAINED_GLASS = new Block<>(294, NamespacedKey.parse("minecraft:cyan_stained_glass"), () -> new BlockData(6133));

    public static final Block<BlockData> PURPLE_STAINED_GLASS = new Block<>(295, NamespacedKey.parse("minecraft:purple_stained_glass"), () -> new BlockData(6134));

    public static final Block<BlockData> BLUE_STAINED_GLASS = new Block<>(296, NamespacedKey.parse("minecraft:blue_stained_glass"), () -> new BlockData(6135));

    public static final Block<BlockData> BROWN_STAINED_GLASS = new Block<>(297, NamespacedKey.parse("minecraft:brown_stained_glass"), () -> new BlockData(6136));

    public static final Block<BlockData> GREEN_STAINED_GLASS = new Block<>(298, NamespacedKey.parse("minecraft:green_stained_glass"), () -> new BlockData(6137));

    public static final Block<BlockData> RED_STAINED_GLASS = new Block<>(299, NamespacedKey.parse("minecraft:red_stained_glass"), () -> new BlockData(6138));

    public static final Block<BlockData> BLACK_STAINED_GLASS = new Block<>(300, NamespacedKey.parse("minecraft:black_stained_glass"), () -> new BlockData(6139));

    public static final Block<TrapdoorData> OAK_TRAPDOOR = new Block<>(301, NamespacedKey.parse("minecraft:oak_trapdoor"), () -> new TrapdoorData(6140));

    public static final Block<TrapdoorData> SPRUCE_TRAPDOOR = new Block<>(302, NamespacedKey.parse("minecraft:spruce_trapdoor"), () -> new TrapdoorData(6204));

    public static final Block<TrapdoorData> BIRCH_TRAPDOOR = new Block<>(303, NamespacedKey.parse("minecraft:birch_trapdoor"), () -> new TrapdoorData(6268));

    public static final Block<TrapdoorData> JUNGLE_TRAPDOOR = new Block<>(304, NamespacedKey.parse("minecraft:jungle_trapdoor"), () -> new TrapdoorData(6332));

    public static final Block<TrapdoorData> ACACIA_TRAPDOOR = new Block<>(305, NamespacedKey.parse("minecraft:acacia_trapdoor"), () -> new TrapdoorData(6396));

    public static final Block<TrapdoorData> CHERRY_TRAPDOOR = new Block<>(306, NamespacedKey.parse("minecraft:cherry_trapdoor"), () -> new TrapdoorData(6460));

    public static final Block<TrapdoorData> DARK_OAK_TRAPDOOR = new Block<>(307, NamespacedKey.parse("minecraft:dark_oak_trapdoor"), () -> new TrapdoorData(6524));

    public static final Block<TrapdoorData> PALE_OAK_TRAPDOOR = new Block<>(308, NamespacedKey.parse("minecraft:pale_oak_trapdoor"), () -> new TrapdoorData(6588));

    public static final Block<TrapdoorData> MANGROVE_TRAPDOOR = new Block<>(309, NamespacedKey.parse("minecraft:mangrove_trapdoor"), () -> new TrapdoorData(6652));

    public static final Block<TrapdoorData> BAMBOO_TRAPDOOR = new Block<>(310, NamespacedKey.parse("minecraft:bamboo_trapdoor"), () -> new TrapdoorData(6716));

    public static final Block<BlockData> STONE_BRICKS = new Block<>(311, NamespacedKey.parse("minecraft:stone_bricks"), () -> new BlockData(6780));

    public static final Block<BlockData> MOSSY_STONE_BRICKS = new Block<>(312, NamespacedKey.parse("minecraft:mossy_stone_bricks"), () -> new BlockData(6781));

    public static final Block<BlockData> CRACKED_STONE_BRICKS = new Block<>(313, NamespacedKey.parse("minecraft:cracked_stone_bricks"), () -> new BlockData(6782));

    public static final Block<BlockData> CHISELED_STONE_BRICKS = new Block<>(314, NamespacedKey.parse("minecraft:chiseled_stone_bricks"), () -> new BlockData(6783));

    public static final Block<BlockData> PACKED_MUD = new Block<>(315, NamespacedKey.parse("minecraft:packed_mud"), () -> new BlockData(6784));

    public static final Block<BlockData> MUD_BRICKS = new Block<>(316, NamespacedKey.parse("minecraft:mud_bricks"), () -> new BlockData(6785));

    public static final Block<BlockData> INFESTED_STONE = new Block<>(317, NamespacedKey.parse("minecraft:infested_stone"), () -> new BlockData(6786));

    public static final Block<BlockData> INFESTED_COBBLESTONE = new Block<>(318, NamespacedKey.parse("minecraft:infested_cobblestone"), () -> new BlockData(6787));

    public static final Block<BlockData> INFESTED_STONE_BRICKS = new Block<>(319, NamespacedKey.parse("minecraft:infested_stone_bricks"), () -> new BlockData(6788));

    public static final Block<BlockData> INFESTED_MOSSY_STONE_BRICKS = new Block<>(320, NamespacedKey.parse("minecraft:infested_mossy_stone_bricks"), () -> new BlockData(6789));

    public static final Block<BlockData> INFESTED_CRACKED_STONE_BRICKS = new Block<>(321, NamespacedKey.parse("minecraft:infested_cracked_stone_bricks"), () -> new BlockData(6790));

    public static final Block<BlockData> INFESTED_CHISELED_STONE_BRICKS = new Block<>(322, NamespacedKey.parse("minecraft:infested_chiseled_stone_bricks"), () -> new BlockData(6791));

    public static final Block<HugeMushroomData> BROWN_MUSHROOM_BLOCK = new Block<>(323, NamespacedKey.parse("minecraft:brown_mushroom_block"), () -> new HugeMushroomData(6792));

    public static final Block<HugeMushroomData> RED_MUSHROOM_BLOCK = new Block<>(324, NamespacedKey.parse("minecraft:red_mushroom_block"), () -> new HugeMushroomData(6856));

    public static final Block<HugeMushroomData> MUSHROOM_STEM = new Block<>(325, NamespacedKey.parse("minecraft:mushroom_stem"), () -> new HugeMushroomData(6920));

    public static final Block<IronBarsData> IRON_BARS = new Block<>(326, NamespacedKey.parse("minecraft:iron_bars"), () -> new IronBarsData(6984));

    public static final Block<ChainData> CHAIN = new Block<>(327, NamespacedKey.parse("minecraft:chain"), () -> new ChainData(7016));

    public static final Block<IronBarsData> GLASS_PANE = new Block<>(328, NamespacedKey.parse("minecraft:glass_pane"), () -> new IronBarsData(7022));

    public static final Block<BlockData> PUMPKIN = new Block<>(329, NamespacedKey.parse("minecraft:pumpkin"), () -> new BlockData(7054));

    public static final Block<BlockData> MELON = new Block<>(330, NamespacedKey.parse("minecraft:melon"), () -> new BlockData(7055));

    public static final Block<AttachedStemData> ATTACHED_PUMPKIN_STEM = new Block<>(331, NamespacedKey.parse("minecraft:attached_pumpkin_stem"), () -> new AttachedStemData(7056));

    public static final Block<AttachedStemData> ATTACHED_MELON_STEM = new Block<>(332, NamespacedKey.parse("minecraft:attached_melon_stem"), () -> new AttachedStemData(7060));

    public static final Block<StemData> PUMPKIN_STEM = new Block<>(333, NamespacedKey.parse("minecraft:pumpkin_stem"), () -> new StemData(7064));

    public static final Block<StemData> MELON_STEM = new Block<>(334, NamespacedKey.parse("minecraft:melon_stem"), () -> new StemData(7072));

    public static final Block<VineData> VINE = new Block<>(335, NamespacedKey.parse("minecraft:vine"), () -> new VineData(7080));

    public static final Block<GlowLichenData> GLOW_LICHEN = new Block<>(336, NamespacedKey.parse("minecraft:glow_lichen"), () -> new GlowLichenData(7112));

    public static final Block<MultifaceData> RESIN_CLUMP = new Block<>(337, NamespacedKey.parse("minecraft:resin_clump"), () -> new MultifaceData(7240));

    public static final Block<FenceGateData> OAK_FENCE_GATE = new Block<>(338, NamespacedKey.parse("minecraft:oak_fence_gate"), () -> new FenceGateData(7368));

    public static final Block<StairData> BRICK_STAIRS = new Block<>(339, NamespacedKey.parse("minecraft:brick_stairs"), () -> new StairData(7400));

    public static final Block<StairData> STONE_BRICK_STAIRS = new Block<>(340, NamespacedKey.parse("minecraft:stone_brick_stairs"), () -> new StairData(7480));

    public static final Block<StairData> MUD_BRICK_STAIRS = new Block<>(341, NamespacedKey.parse("minecraft:mud_brick_stairs"), () -> new StairData(7560));

    public static final Block<MyceliumData> MYCELIUM = new Block<>(342, NamespacedKey.parse("minecraft:mycelium"), () -> new MyceliumData(7640));

    public static final Block<BlockData> LILY_PAD = new Block<>(343, NamespacedKey.parse("minecraft:lily_pad"), () -> new BlockData(7642));

    public static final Block<BlockData> RESIN_BLOCK = new Block<>(344, NamespacedKey.parse("minecraft:resin_block"), () -> new BlockData(7643));

    public static final Block<BlockData> RESIN_BRICKS = new Block<>(345, NamespacedKey.parse("minecraft:resin_bricks"), () -> new BlockData(7644));

    public static final Block<StairData> RESIN_BRICK_STAIRS = new Block<>(346, NamespacedKey.parse("minecraft:resin_brick_stairs"), () -> new StairData(7645));

    public static final Block<SlabData> RESIN_BRICK_SLAB = new Block<>(347, NamespacedKey.parse("minecraft:resin_brick_slab"), () -> new SlabData(7725));

    public static final Block<WallData> RESIN_BRICK_WALL = new Block<>(348, NamespacedKey.parse("minecraft:resin_brick_wall"), () -> new WallData(7731));

    public static final Block<BlockData> CHISELED_RESIN_BRICKS = new Block<>(349, NamespacedKey.parse("minecraft:chiseled_resin_bricks"), () -> new BlockData(8055));

    public static final Block<BlockData> NETHER_BRICKS = new Block<>(350, NamespacedKey.parse("minecraft:nether_bricks"), () -> new BlockData(8056));

    public static final Block<FenceData> NETHER_BRICK_FENCE = new Block<>(351, NamespacedKey.parse("minecraft:nether_brick_fence"), () -> new FenceData(8057));

    public static final Block<StairData> NETHER_BRICK_STAIRS = new Block<>(352, NamespacedKey.parse("minecraft:nether_brick_stairs"), () -> new StairData(8089));

    public static final Block<NetherWartData> NETHER_WART = new Block<>(353, NamespacedKey.parse("minecraft:nether_wart"), () -> new NetherWartData(8169));

    public static final Block<BlockData> ENCHANTING_TABLE = new Block<>(354, NamespacedKey.parse("minecraft:enchanting_table"), () -> new BlockData(8173));

    public static final Block<BrewingStandData> BREWING_STAND = new Block<>(355, NamespacedKey.parse("minecraft:brewing_stand"), () -> new BrewingStandData(8174));

    public static final Block<BlockData> CAULDRON = new Block<>(356, NamespacedKey.parse("minecraft:cauldron"), () -> new BlockData(8182));

    public static final Block<LayeredCauldronData> WATER_CAULDRON = new Block<>(357, NamespacedKey.parse("minecraft:water_cauldron"), () -> new LayeredCauldronData(8183));

    public static final Block<BlockData> LAVA_CAULDRON = new Block<>(358, NamespacedKey.parse("minecraft:lava_cauldron"), () -> new BlockData(8186));

    public static final Block<LayeredCauldronData> POWDER_SNOW_CAULDRON = new Block<>(359, NamespacedKey.parse("minecraft:powder_snow_cauldron"), () -> new LayeredCauldronData(8187));

    public static final Block<BlockData> END_PORTAL = new Block<>(360, NamespacedKey.parse("minecraft:end_portal"), () -> new BlockData(8190));

    public static final Block<EndPortalFrameData> END_PORTAL_FRAME = new Block<>(361, NamespacedKey.parse("minecraft:end_portal_frame"), () -> new EndPortalFrameData(8191));

    public static final Block<BlockData> END_STONE = new Block<>(362, NamespacedKey.parse("minecraft:end_stone"), () -> new BlockData(8199));

    public static final Block<BlockData> DRAGON_EGG = new Block<>(363, NamespacedKey.parse("minecraft:dragon_egg"), () -> new BlockData(8200));

    public static final Block<RedstoneLampData> REDSTONE_LAMP = new Block<>(364, NamespacedKey.parse("minecraft:redstone_lamp"), () -> new RedstoneLampData(8201));

    public static final Block<CocoaData> COCOA = new Block<>(365, NamespacedKey.parse("minecraft:cocoa"), () -> new CocoaData(8203));

    public static final Block<StairData> SANDSTONE_STAIRS = new Block<>(366, NamespacedKey.parse("minecraft:sandstone_stairs"), () -> new StairData(8215));

    public static final Block<BlockData> EMERALD_ORE = new Block<>(367, NamespacedKey.parse("minecraft:emerald_ore"), () -> new BlockData(8295));

    public static final Block<BlockData> DEEPSLATE_EMERALD_ORE = new Block<>(368, NamespacedKey.parse("minecraft:deepslate_emerald_ore"), () -> new BlockData(8296));

    public static final Block<EnderChestData> ENDER_CHEST = new Block<>(369, NamespacedKey.parse("minecraft:ender_chest"), () -> new EnderChestData(8297));

    public static final Block<TripWireHookData> TRIPWIRE_HOOK = new Block<>(370, NamespacedKey.parse("minecraft:tripwire_hook"), () -> new TripWireHookData(8305));

    public static final Block<TripwireData> TRIPWIRE = new Block<>(371, NamespacedKey.parse("minecraft:tripwire"), () -> new TripwireData(8321));

    public static final Block<BlockData> EMERALD_BLOCK = new Block<>(372, NamespacedKey.parse("minecraft:emerald_block"), () -> new BlockData(8449));

    public static final Block<StairData> SPRUCE_STAIRS = new Block<>(373, NamespacedKey.parse("minecraft:spruce_stairs"), () -> new StairData(8450));

    public static final Block<StairData> BIRCH_STAIRS = new Block<>(374, NamespacedKey.parse("minecraft:birch_stairs"), () -> new StairData(8530));

    public static final Block<StairData> JUNGLE_STAIRS = new Block<>(375, NamespacedKey.parse("minecraft:jungle_stairs"), () -> new StairData(8610));

    public static final Block<CommandData> COMMAND_BLOCK = new Block<>(376, NamespacedKey.parse("minecraft:command_block"), () -> new CommandData(8690));

    public static final Block<BlockData> BEACON = new Block<>(377, NamespacedKey.parse("minecraft:beacon"), () -> new BlockData(8702));

    public static final Block<WallData> COBBLESTONE_WALL = new Block<>(378, NamespacedKey.parse("minecraft:cobblestone_wall"), () -> new WallData(8703));

    public static final Block<WallData> MOSSY_COBBLESTONE_WALL = new Block<>(379, NamespacedKey.parse("minecraft:mossy_cobblestone_wall"), () -> new WallData(9027));

    public static final Block<BlockData> FLOWER_POT = new Block<>(380, NamespacedKey.parse("minecraft:flower_pot"), () -> new BlockData(9351));

    public static final Block<BlockData> POTTED_TORCHFLOWER = new Block<>(381, NamespacedKey.parse("minecraft:potted_torchflower"), () -> new BlockData(9352));

    public static final Block<BlockData> POTTED_OAK_SAPLING = new Block<>(382, NamespacedKey.parse("minecraft:potted_oak_sapling"), () -> new BlockData(9353));

    public static final Block<BlockData> POTTED_SPRUCE_SAPLING = new Block<>(383, NamespacedKey.parse("minecraft:potted_spruce_sapling"), () -> new BlockData(9354));

    public static final Block<BlockData> POTTED_BIRCH_SAPLING = new Block<>(384, NamespacedKey.parse("minecraft:potted_birch_sapling"), () -> new BlockData(9355));

    public static final Block<BlockData> POTTED_JUNGLE_SAPLING = new Block<>(385, NamespacedKey.parse("minecraft:potted_jungle_sapling"), () -> new BlockData(9356));

    public static final Block<BlockData> POTTED_ACACIA_SAPLING = new Block<>(386, NamespacedKey.parse("minecraft:potted_acacia_sapling"), () -> new BlockData(9357));

    public static final Block<BlockData> POTTED_CHERRY_SAPLING = new Block<>(387, NamespacedKey.parse("minecraft:potted_cherry_sapling"), () -> new BlockData(9358));

    public static final Block<BlockData> POTTED_DARK_OAK_SAPLING = new Block<>(388, NamespacedKey.parse("minecraft:potted_dark_oak_sapling"), () -> new BlockData(9359));

    public static final Block<BlockData> POTTED_PALE_OAK_SAPLING = new Block<>(389, NamespacedKey.parse("minecraft:potted_pale_oak_sapling"), () -> new BlockData(9360));

    public static final Block<BlockData> POTTED_MANGROVE_PROPAGULE = new Block<>(390, NamespacedKey.parse("minecraft:potted_mangrove_propagule"), () -> new BlockData(9361));

    public static final Block<BlockData> POTTED_FERN = new Block<>(391, NamespacedKey.parse("minecraft:potted_fern"), () -> new BlockData(9362));

    public static final Block<BlockData> POTTED_DANDELION = new Block<>(392, NamespacedKey.parse("minecraft:potted_dandelion"), () -> new BlockData(9363));

    public static final Block<BlockData> POTTED_POPPY = new Block<>(393, NamespacedKey.parse("minecraft:potted_poppy"), () -> new BlockData(9364));

    public static final Block<BlockData> POTTED_BLUE_ORCHID = new Block<>(394, NamespacedKey.parse("minecraft:potted_blue_orchid"), () -> new BlockData(9365));

    public static final Block<BlockData> POTTED_ALLIUM = new Block<>(395, NamespacedKey.parse("minecraft:potted_allium"), () -> new BlockData(9366));

    public static final Block<BlockData> POTTED_AZURE_BLUET = new Block<>(396, NamespacedKey.parse("minecraft:potted_azure_bluet"), () -> new BlockData(9367));

    public static final Block<BlockData> POTTED_RED_TULIP = new Block<>(397, NamespacedKey.parse("minecraft:potted_red_tulip"), () -> new BlockData(9368));

    public static final Block<BlockData> POTTED_ORANGE_TULIP = new Block<>(398, NamespacedKey.parse("minecraft:potted_orange_tulip"), () -> new BlockData(9369));

    public static final Block<BlockData> POTTED_WHITE_TULIP = new Block<>(399, NamespacedKey.parse("minecraft:potted_white_tulip"), () -> new BlockData(9370));

    public static final Block<BlockData> POTTED_PINK_TULIP = new Block<>(400, NamespacedKey.parse("minecraft:potted_pink_tulip"), () -> new BlockData(9371));

    public static final Block<BlockData> POTTED_OXEYE_DAISY = new Block<>(401, NamespacedKey.parse("minecraft:potted_oxeye_daisy"), () -> new BlockData(9372));

    public static final Block<BlockData> POTTED_CORNFLOWER = new Block<>(402, NamespacedKey.parse("minecraft:potted_cornflower"), () -> new BlockData(9373));

    public static final Block<BlockData> POTTED_LILY_OF_THE_VALLEY = new Block<>(403, NamespacedKey.parse("minecraft:potted_lily_of_the_valley"), () -> new BlockData(9374));

    public static final Block<BlockData> POTTED_WITHER_ROSE = new Block<>(404, NamespacedKey.parse("minecraft:potted_wither_rose"), () -> new BlockData(9375));

    public static final Block<BlockData> POTTED_RED_MUSHROOM = new Block<>(405, NamespacedKey.parse("minecraft:potted_red_mushroom"), () -> new BlockData(9376));

    public static final Block<BlockData> POTTED_BROWN_MUSHROOM = new Block<>(406, NamespacedKey.parse("minecraft:potted_brown_mushroom"), () -> new BlockData(9377));

    public static final Block<BlockData> POTTED_DEAD_BUSH = new Block<>(407, NamespacedKey.parse("minecraft:potted_dead_bush"), () -> new BlockData(9378));

    public static final Block<BlockData> POTTED_CACTUS = new Block<>(408, NamespacedKey.parse("minecraft:potted_cactus"), () -> new BlockData(9379));

    public static final Block<CarrotData> CARROTS = new Block<>(409, NamespacedKey.parse("minecraft:carrots"), () -> new CarrotData(9380));

    public static final Block<PotatoData> POTATOES = new Block<>(410, NamespacedKey.parse("minecraft:potatoes"), () -> new PotatoData(9388));

    public static final Block<ButtonData> OAK_BUTTON = new Block<>(411, NamespacedKey.parse("minecraft:oak_button"), () -> new ButtonData(9396));

    public static final Block<ButtonData> SPRUCE_BUTTON = new Block<>(412, NamespacedKey.parse("minecraft:spruce_button"), () -> new ButtonData(9420));

    public static final Block<ButtonData> BIRCH_BUTTON = new Block<>(413, NamespacedKey.parse("minecraft:birch_button"), () -> new ButtonData(9444));

    public static final Block<ButtonData> JUNGLE_BUTTON = new Block<>(414, NamespacedKey.parse("minecraft:jungle_button"), () -> new ButtonData(9468));

    public static final Block<ButtonData> ACACIA_BUTTON = new Block<>(415, NamespacedKey.parse("minecraft:acacia_button"), () -> new ButtonData(9492));

    public static final Block<ButtonData> CHERRY_BUTTON = new Block<>(416, NamespacedKey.parse("minecraft:cherry_button"), () -> new ButtonData(9516));

    public static final Block<ButtonData> DARK_OAK_BUTTON = new Block<>(417, NamespacedKey.parse("minecraft:dark_oak_button"), () -> new ButtonData(9540));

    public static final Block<ButtonData> PALE_OAK_BUTTON = new Block<>(418, NamespacedKey.parse("minecraft:pale_oak_button"), () -> new ButtonData(9564));

    public static final Block<ButtonData> MANGROVE_BUTTON = new Block<>(419, NamespacedKey.parse("minecraft:mangrove_button"), () -> new ButtonData(9588));

    public static final Block<ButtonData> BAMBOO_BUTTON = new Block<>(420, NamespacedKey.parse("minecraft:bamboo_button"), () -> new ButtonData(9612));

    public static final Block<SkullData> SKELETON_SKULL = new Block<>(421, NamespacedKey.parse("minecraft:skeleton_skull"), () -> new SkullData(9636));

    public static final Block<WallSkullData> SKELETON_WALL_SKULL = new Block<>(422, NamespacedKey.parse("minecraft:skeleton_wall_skull"), () -> new WallSkullData(9668));

    public static final Block<WitherSkullData> WITHER_SKELETON_SKULL = new Block<>(423, NamespacedKey.parse("minecraft:wither_skeleton_skull"), () -> new WitherSkullData(9676));

    public static final Block<WitherWallSkullData> WITHER_SKELETON_WALL_SKULL = new Block<>(424, NamespacedKey.parse("minecraft:wither_skeleton_wall_skull"), () -> new WitherWallSkullData(9708));

    public static final Block<SkullData> ZOMBIE_HEAD = new Block<>(425, NamespacedKey.parse("minecraft:zombie_head"), () -> new SkullData(9716));

    public static final Block<WallSkullData> ZOMBIE_WALL_HEAD = new Block<>(426, NamespacedKey.parse("minecraft:zombie_wall_head"), () -> new WallSkullData(9748));

    public static final Block<PlayerHeadData> PLAYER_HEAD = new Block<>(427, NamespacedKey.parse("minecraft:player_head"), () -> new PlayerHeadData(9756));

    public static final Block<PlayerWallHeadData> PLAYER_WALL_HEAD = new Block<>(428, NamespacedKey.parse("minecraft:player_wall_head"), () -> new PlayerWallHeadData(9788));

    public static final Block<SkullData> CREEPER_HEAD = new Block<>(429, NamespacedKey.parse("minecraft:creeper_head"), () -> new SkullData(9796));

    public static final Block<WallSkullData> CREEPER_WALL_HEAD = new Block<>(430, NamespacedKey.parse("minecraft:creeper_wall_head"), () -> new WallSkullData(9828));

    public static final Block<SkullData> DRAGON_HEAD = new Block<>(431, NamespacedKey.parse("minecraft:dragon_head"), () -> new SkullData(9836));

    public static final Block<WallSkullData> DRAGON_WALL_HEAD = new Block<>(432, NamespacedKey.parse("minecraft:dragon_wall_head"), () -> new WallSkullData(9868));

    public static final Block<SkullData> PIGLIN_HEAD = new Block<>(433, NamespacedKey.parse("minecraft:piglin_head"), () -> new SkullData(9876));

    public static final Block<PiglinwallskullData> PIGLIN_WALL_HEAD = new Block<>(434, NamespacedKey.parse("minecraft:piglin_wall_head"), () -> new PiglinwallskullData(9908));

    public static final Block<AnvilData> ANVIL = new Block<>(435, NamespacedKey.parse("minecraft:anvil"), () -> new AnvilData(9916));

    public static final Block<AnvilData> CHIPPED_ANVIL = new Block<>(436, NamespacedKey.parse("minecraft:chipped_anvil"), () -> new AnvilData(9920));

    public static final Block<AnvilData> DAMAGED_ANVIL = new Block<>(437, NamespacedKey.parse("minecraft:damaged_anvil"), () -> new AnvilData(9924));

    public static final Block<TrappedChestData> TRAPPED_CHEST = new Block<>(438, NamespacedKey.parse("minecraft:trapped_chest"), () -> new TrappedChestData(9928));

    public static final Block<WeightedPressurePlateData> LIGHT_WEIGHTED_PRESSURE_PLATE = new Block<>(439, NamespacedKey.parse("minecraft:light_weighted_pressure_plate"), () -> new WeightedPressurePlateData(9952));

    public static final Block<WeightedPressurePlateData> HEAVY_WEIGHTED_PRESSURE_PLATE = new Block<>(440, NamespacedKey.parse("minecraft:heavy_weighted_pressure_plate"), () -> new WeightedPressurePlateData(9968));

    public static final Block<ComparatorData> COMPARATOR = new Block<>(441, NamespacedKey.parse("minecraft:comparator"), () -> new ComparatorData(9984));

    public static final Block<DaylightDetectorData> DAYLIGHT_DETECTOR = new Block<>(442, NamespacedKey.parse("minecraft:daylight_detector"), () -> new DaylightDetectorData(10000));

    public static final Block<BlockData> REDSTONE_BLOCK = new Block<>(443, NamespacedKey.parse("minecraft:redstone_block"), () -> new BlockData(10032));

    public static final Block<BlockData> NETHER_QUARTZ_ORE = new Block<>(444, NamespacedKey.parse("minecraft:nether_quartz_ore"), () -> new BlockData(10033));

    public static final Block<HopperData> HOPPER = new Block<>(445, NamespacedKey.parse("minecraft:hopper"), () -> new HopperData(10034));

    public static final Block<BlockData> QUARTZ_BLOCK = new Block<>(446, NamespacedKey.parse("minecraft:quartz_block"), () -> new BlockData(10044));

    public static final Block<BlockData> CHISELED_QUARTZ_BLOCK = new Block<>(447, NamespacedKey.parse("minecraft:chiseled_quartz_block"), () -> new BlockData(10045));

    public static final Block<RotatedPillarData> QUARTZ_PILLAR = new Block<>(448, NamespacedKey.parse("minecraft:quartz_pillar"), () -> new RotatedPillarData(10046));

    public static final Block<StairData> QUARTZ_STAIRS = new Block<>(449, NamespacedKey.parse("minecraft:quartz_stairs"), () -> new StairData(10049));

    public static final Block<PoweredRailData> ACTIVATOR_RAIL = new Block<>(450, NamespacedKey.parse("minecraft:activator_rail"), () -> new PoweredRailData(10129));

    public static final Block<DropperData> DROPPER = new Block<>(451, NamespacedKey.parse("minecraft:dropper"), () -> new DropperData(10153));

    public static final Block<BlockData> WHITE_TERRACOTTA = new Block<>(452, NamespacedKey.parse("minecraft:white_terracotta"), () -> new BlockData(10165));

    public static final Block<BlockData> ORANGE_TERRACOTTA = new Block<>(453, NamespacedKey.parse("minecraft:orange_terracotta"), () -> new BlockData(10166));

    public static final Block<BlockData> MAGENTA_TERRACOTTA = new Block<>(454, NamespacedKey.parse("minecraft:magenta_terracotta"), () -> new BlockData(10167));

    public static final Block<BlockData> LIGHT_BLUE_TERRACOTTA = new Block<>(455, NamespacedKey.parse("minecraft:light_blue_terracotta"), () -> new BlockData(10168));

    public static final Block<BlockData> YELLOW_TERRACOTTA = new Block<>(456, NamespacedKey.parse("minecraft:yellow_terracotta"), () -> new BlockData(10169));

    public static final Block<BlockData> LIME_TERRACOTTA = new Block<>(457, NamespacedKey.parse("minecraft:lime_terracotta"), () -> new BlockData(10170));

    public static final Block<BlockData> PINK_TERRACOTTA = new Block<>(458, NamespacedKey.parse("minecraft:pink_terracotta"), () -> new BlockData(10171));

    public static final Block<BlockData> GRAY_TERRACOTTA = new Block<>(459, NamespacedKey.parse("minecraft:gray_terracotta"), () -> new BlockData(10172));

    public static final Block<BlockData> LIGHT_GRAY_TERRACOTTA = new Block<>(460, NamespacedKey.parse("minecraft:light_gray_terracotta"), () -> new BlockData(10173));

    public static final Block<BlockData> CYAN_TERRACOTTA = new Block<>(461, NamespacedKey.parse("minecraft:cyan_terracotta"), () -> new BlockData(10174));

    public static final Block<BlockData> PURPLE_TERRACOTTA = new Block<>(462, NamespacedKey.parse("minecraft:purple_terracotta"), () -> new BlockData(10175));

    public static final Block<BlockData> BLUE_TERRACOTTA = new Block<>(463, NamespacedKey.parse("minecraft:blue_terracotta"), () -> new BlockData(10176));

    public static final Block<BlockData> BROWN_TERRACOTTA = new Block<>(464, NamespacedKey.parse("minecraft:brown_terracotta"), () -> new BlockData(10177));

    public static final Block<BlockData> GREEN_TERRACOTTA = new Block<>(465, NamespacedKey.parse("minecraft:green_terracotta"), () -> new BlockData(10178));

    public static final Block<BlockData> RED_TERRACOTTA = new Block<>(466, NamespacedKey.parse("minecraft:red_terracotta"), () -> new BlockData(10179));

    public static final Block<BlockData> BLACK_TERRACOTTA = new Block<>(467, NamespacedKey.parse("minecraft:black_terracotta"), () -> new BlockData(10180));

    public static final Block<StainedGlassPaneData> WHITE_STAINED_GLASS_PANE = new Block<>(468, NamespacedKey.parse("minecraft:white_stained_glass_pane"), () -> new StainedGlassPaneData(10181));

    public static final Block<StainedGlassPaneData> ORANGE_STAINED_GLASS_PANE = new Block<>(469, NamespacedKey.parse("minecraft:orange_stained_glass_pane"), () -> new StainedGlassPaneData(10213));

    public static final Block<StainedGlassPaneData> MAGENTA_STAINED_GLASS_PANE = new Block<>(470, NamespacedKey.parse("minecraft:magenta_stained_glass_pane"), () -> new StainedGlassPaneData(10245));

    public static final Block<StainedGlassPaneData> LIGHT_BLUE_STAINED_GLASS_PANE = new Block<>(471, NamespacedKey.parse("minecraft:light_blue_stained_glass_pane"), () -> new StainedGlassPaneData(10277));

    public static final Block<StainedGlassPaneData> YELLOW_STAINED_GLASS_PANE = new Block<>(472, NamespacedKey.parse("minecraft:yellow_stained_glass_pane"), () -> new StainedGlassPaneData(10309));

    public static final Block<StainedGlassPaneData> LIME_STAINED_GLASS_PANE = new Block<>(473, NamespacedKey.parse("minecraft:lime_stained_glass_pane"), () -> new StainedGlassPaneData(10341));

    public static final Block<StainedGlassPaneData> PINK_STAINED_GLASS_PANE = new Block<>(474, NamespacedKey.parse("minecraft:pink_stained_glass_pane"), () -> new StainedGlassPaneData(10373));

    public static final Block<StainedGlassPaneData> GRAY_STAINED_GLASS_PANE = new Block<>(475, NamespacedKey.parse("minecraft:gray_stained_glass_pane"), () -> new StainedGlassPaneData(10405));

    public static final Block<StainedGlassPaneData> LIGHT_GRAY_STAINED_GLASS_PANE = new Block<>(476, NamespacedKey.parse("minecraft:light_gray_stained_glass_pane"), () -> new StainedGlassPaneData(10437));

    public static final Block<StainedGlassPaneData> CYAN_STAINED_GLASS_PANE = new Block<>(477, NamespacedKey.parse("minecraft:cyan_stained_glass_pane"), () -> new StainedGlassPaneData(10469));

    public static final Block<StainedGlassPaneData> PURPLE_STAINED_GLASS_PANE = new Block<>(478, NamespacedKey.parse("minecraft:purple_stained_glass_pane"), () -> new StainedGlassPaneData(10501));

    public static final Block<StainedGlassPaneData> BLUE_STAINED_GLASS_PANE = new Block<>(479, NamespacedKey.parse("minecraft:blue_stained_glass_pane"), () -> new StainedGlassPaneData(10533));

    public static final Block<StainedGlassPaneData> BROWN_STAINED_GLASS_PANE = new Block<>(480, NamespacedKey.parse("minecraft:brown_stained_glass_pane"), () -> new StainedGlassPaneData(10565));

    public static final Block<StainedGlassPaneData> GREEN_STAINED_GLASS_PANE = new Block<>(481, NamespacedKey.parse("minecraft:green_stained_glass_pane"), () -> new StainedGlassPaneData(10597));

    public static final Block<StainedGlassPaneData> RED_STAINED_GLASS_PANE = new Block<>(482, NamespacedKey.parse("minecraft:red_stained_glass_pane"), () -> new StainedGlassPaneData(10629));

    public static final Block<StainedGlassPaneData> BLACK_STAINED_GLASS_PANE = new Block<>(483, NamespacedKey.parse("minecraft:black_stained_glass_pane"), () -> new StainedGlassPaneData(10661));

    public static final Block<StairData> ACACIA_STAIRS = new Block<>(484, NamespacedKey.parse("minecraft:acacia_stairs"), () -> new StairData(10693));

    public static final Block<StairData> CHERRY_STAIRS = new Block<>(485, NamespacedKey.parse("minecraft:cherry_stairs"), () -> new StairData(10773));

    public static final Block<StairData> DARK_OAK_STAIRS = new Block<>(486, NamespacedKey.parse("minecraft:dark_oak_stairs"), () -> new StairData(10853));

    public static final Block<StairData> PALE_OAK_STAIRS = new Block<>(487, NamespacedKey.parse("minecraft:pale_oak_stairs"), () -> new StairData(10933));

    public static final Block<StairData> MANGROVE_STAIRS = new Block<>(488, NamespacedKey.parse("minecraft:mangrove_stairs"), () -> new StairData(11013));

    public static final Block<StairData> BAMBOO_STAIRS = new Block<>(489, NamespacedKey.parse("minecraft:bamboo_stairs"), () -> new StairData(11093));

    public static final Block<StairData> BAMBOO_MOSAIC_STAIRS = new Block<>(490, NamespacedKey.parse("minecraft:bamboo_mosaic_stairs"), () -> new StairData(11173));

    public static final Block<BlockData> SLIME_BLOCK = new Block<>(491, NamespacedKey.parse("minecraft:slime_block"), () -> new BlockData(11253));

    public static final Block<BarrierData> BARRIER = new Block<>(492, NamespacedKey.parse("minecraft:barrier"), () -> new BarrierData(11254));

    public static final Block<LightData> LIGHT = new Block<>(493, NamespacedKey.parse("minecraft:light"), () -> new LightData(11256));

    public static final Block<TrapdoorData> IRON_TRAPDOOR = new Block<>(494, NamespacedKey.parse("minecraft:iron_trapdoor"), () -> new TrapdoorData(11288));

    public static final Block<BlockData> PRISMARINE = new Block<>(495, NamespacedKey.parse("minecraft:prismarine"), () -> new BlockData(11352));

    public static final Block<BlockData> PRISMARINE_BRICKS = new Block<>(496, NamespacedKey.parse("minecraft:prismarine_bricks"), () -> new BlockData(11353));

    public static final Block<BlockData> DARK_PRISMARINE = new Block<>(497, NamespacedKey.parse("minecraft:dark_prismarine"), () -> new BlockData(11354));

    public static final Block<StairData> PRISMARINE_STAIRS = new Block<>(498, NamespacedKey.parse("minecraft:prismarine_stairs"), () -> new StairData(11355));

    public static final Block<StairData> PRISMARINE_BRICK_STAIRS = new Block<>(499, NamespacedKey.parse("minecraft:prismarine_brick_stairs"), () -> new StairData(11435));

    public static final Block<StairData> DARK_PRISMARINE_STAIRS = new Block<>(500, NamespacedKey.parse("minecraft:dark_prismarine_stairs"), () -> new StairData(11515));

    public static final Block<SlabData> PRISMARINE_SLAB = new Block<>(501, NamespacedKey.parse("minecraft:prismarine_slab"), () -> new SlabData(11595));

    public static final Block<SlabData> PRISMARINE_BRICK_SLAB = new Block<>(502, NamespacedKey.parse("minecraft:prismarine_brick_slab"), () -> new SlabData(11601));

    public static final Block<SlabData> DARK_PRISMARINE_SLAB = new Block<>(503, NamespacedKey.parse("minecraft:dark_prismarine_slab"), () -> new SlabData(11607));

    public static final Block<BlockData> SEA_LANTERN = new Block<>(504, NamespacedKey.parse("minecraft:sea_lantern"), () -> new BlockData(11613));

    public static final Block<HayData> HAY_BLOCK = new Block<>(505, NamespacedKey.parse("minecraft:hay_block"), () -> new HayData(11614));

    public static final Block<BlockData> WHITE_CARPET = new Block<>(506, NamespacedKey.parse("minecraft:white_carpet"), () -> new BlockData(11617));

    public static final Block<BlockData> ORANGE_CARPET = new Block<>(507, NamespacedKey.parse("minecraft:orange_carpet"), () -> new BlockData(11618));

    public static final Block<BlockData> MAGENTA_CARPET = new Block<>(508, NamespacedKey.parse("minecraft:magenta_carpet"), () -> new BlockData(11619));

    public static final Block<BlockData> LIGHT_BLUE_CARPET = new Block<>(509, NamespacedKey.parse("minecraft:light_blue_carpet"), () -> new BlockData(11620));

    public static final Block<BlockData> YELLOW_CARPET = new Block<>(510, NamespacedKey.parse("minecraft:yellow_carpet"), () -> new BlockData(11621));

    public static final Block<BlockData> LIME_CARPET = new Block<>(511, NamespacedKey.parse("minecraft:lime_carpet"), () -> new BlockData(11622));

    public static final Block<BlockData> PINK_CARPET = new Block<>(512, NamespacedKey.parse("minecraft:pink_carpet"), () -> new BlockData(11623));

    public static final Block<BlockData> GRAY_CARPET = new Block<>(513, NamespacedKey.parse("minecraft:gray_carpet"), () -> new BlockData(11624));

    public static final Block<BlockData> LIGHT_GRAY_CARPET = new Block<>(514, NamespacedKey.parse("minecraft:light_gray_carpet"), () -> new BlockData(11625));

    public static final Block<BlockData> CYAN_CARPET = new Block<>(515, NamespacedKey.parse("minecraft:cyan_carpet"), () -> new BlockData(11626));

    public static final Block<BlockData> PURPLE_CARPET = new Block<>(516, NamespacedKey.parse("minecraft:purple_carpet"), () -> new BlockData(11627));

    public static final Block<BlockData> BLUE_CARPET = new Block<>(517, NamespacedKey.parse("minecraft:blue_carpet"), () -> new BlockData(11628));

    public static final Block<BlockData> BROWN_CARPET = new Block<>(518, NamespacedKey.parse("minecraft:brown_carpet"), () -> new BlockData(11629));

    public static final Block<BlockData> GREEN_CARPET = new Block<>(519, NamespacedKey.parse("minecraft:green_carpet"), () -> new BlockData(11630));

    public static final Block<BlockData> RED_CARPET = new Block<>(520, NamespacedKey.parse("minecraft:red_carpet"), () -> new BlockData(11631));

    public static final Block<BlockData> BLACK_CARPET = new Block<>(521, NamespacedKey.parse("minecraft:black_carpet"), () -> new BlockData(11632));

    public static final Block<BlockData> TERRACOTTA = new Block<>(522, NamespacedKey.parse("minecraft:terracotta"), () -> new BlockData(11633));

    public static final Block<BlockData> COAL_BLOCK = new Block<>(523, NamespacedKey.parse("minecraft:coal_block"), () -> new BlockData(11634));

    public static final Block<BlockData> PACKED_ICE = new Block<>(524, NamespacedKey.parse("minecraft:packed_ice"), () -> new BlockData(11635));

    public static final Block<TallFlowerData> SUNFLOWER = new Block<>(525, NamespacedKey.parse("minecraft:sunflower"), () -> new TallFlowerData(11636));

    public static final Block<TallFlowerData> LILAC = new Block<>(526, NamespacedKey.parse("minecraft:lilac"), () -> new TallFlowerData(11638));

    public static final Block<TallFlowerData> ROSE_BUSH = new Block<>(527, NamespacedKey.parse("minecraft:rose_bush"), () -> new TallFlowerData(11640));

    public static final Block<TallFlowerData> PEONY = new Block<>(528, NamespacedKey.parse("minecraft:peony"), () -> new TallFlowerData(11642));

    public static final Block<DoublePlantData> TALL_GRASS = new Block<>(529, NamespacedKey.parse("minecraft:tall_grass"), () -> new DoublePlantData(11644));

    public static final Block<DoublePlantData> LARGE_FERN = new Block<>(530, NamespacedKey.parse("minecraft:large_fern"), () -> new DoublePlantData(11646));

    public static final Block<BannerData> WHITE_BANNER = new Block<>(531, NamespacedKey.parse("minecraft:white_banner"), () -> new BannerData(11648));

    public static final Block<BannerData> ORANGE_BANNER = new Block<>(532, NamespacedKey.parse("minecraft:orange_banner"), () -> new BannerData(11664));

    public static final Block<BannerData> MAGENTA_BANNER = new Block<>(533, NamespacedKey.parse("minecraft:magenta_banner"), () -> new BannerData(11680));

    public static final Block<BannerData> LIGHT_BLUE_BANNER = new Block<>(534, NamespacedKey.parse("minecraft:light_blue_banner"), () -> new BannerData(11696));

    public static final Block<BannerData> YELLOW_BANNER = new Block<>(535, NamespacedKey.parse("minecraft:yellow_banner"), () -> new BannerData(11712));

    public static final Block<BannerData> LIME_BANNER = new Block<>(536, NamespacedKey.parse("minecraft:lime_banner"), () -> new BannerData(11728));

    public static final Block<BannerData> PINK_BANNER = new Block<>(537, NamespacedKey.parse("minecraft:pink_banner"), () -> new BannerData(11744));

    public static final Block<BannerData> GRAY_BANNER = new Block<>(538, NamespacedKey.parse("minecraft:gray_banner"), () -> new BannerData(11760));

    public static final Block<BannerData> LIGHT_GRAY_BANNER = new Block<>(539, NamespacedKey.parse("minecraft:light_gray_banner"), () -> new BannerData(11776));

    public static final Block<BannerData> CYAN_BANNER = new Block<>(540, NamespacedKey.parse("minecraft:cyan_banner"), () -> new BannerData(11792));

    public static final Block<BannerData> PURPLE_BANNER = new Block<>(541, NamespacedKey.parse("minecraft:purple_banner"), () -> new BannerData(11808));

    public static final Block<BannerData> BLUE_BANNER = new Block<>(542, NamespacedKey.parse("minecraft:blue_banner"), () -> new BannerData(11824));

    public static final Block<BannerData> BROWN_BANNER = new Block<>(543, NamespacedKey.parse("minecraft:brown_banner"), () -> new BannerData(11840));

    public static final Block<BannerData> GREEN_BANNER = new Block<>(544, NamespacedKey.parse("minecraft:green_banner"), () -> new BannerData(11856));

    public static final Block<BannerData> RED_BANNER = new Block<>(545, NamespacedKey.parse("minecraft:red_banner"), () -> new BannerData(11872));

    public static final Block<BannerData> BLACK_BANNER = new Block<>(546, NamespacedKey.parse("minecraft:black_banner"), () -> new BannerData(11888));

    public static final Block<WallBannerData> WHITE_WALL_BANNER = new Block<>(547, NamespacedKey.parse("minecraft:white_wall_banner"), () -> new WallBannerData(11904));

    public static final Block<WallBannerData> ORANGE_WALL_BANNER = new Block<>(548, NamespacedKey.parse("minecraft:orange_wall_banner"), () -> new WallBannerData(11908));

    public static final Block<WallBannerData> MAGENTA_WALL_BANNER = new Block<>(549, NamespacedKey.parse("minecraft:magenta_wall_banner"), () -> new WallBannerData(11912));

    public static final Block<WallBannerData> LIGHT_BLUE_WALL_BANNER = new Block<>(550, NamespacedKey.parse("minecraft:light_blue_wall_banner"), () -> new WallBannerData(11916));

    public static final Block<WallBannerData> YELLOW_WALL_BANNER = new Block<>(551, NamespacedKey.parse("minecraft:yellow_wall_banner"), () -> new WallBannerData(11920));

    public static final Block<WallBannerData> LIME_WALL_BANNER = new Block<>(552, NamespacedKey.parse("minecraft:lime_wall_banner"), () -> new WallBannerData(11924));

    public static final Block<WallBannerData> PINK_WALL_BANNER = new Block<>(553, NamespacedKey.parse("minecraft:pink_wall_banner"), () -> new WallBannerData(11928));

    public static final Block<WallBannerData> GRAY_WALL_BANNER = new Block<>(554, NamespacedKey.parse("minecraft:gray_wall_banner"), () -> new WallBannerData(11932));

    public static final Block<WallBannerData> LIGHT_GRAY_WALL_BANNER = new Block<>(555, NamespacedKey.parse("minecraft:light_gray_wall_banner"), () -> new WallBannerData(11936));

    public static final Block<WallBannerData> CYAN_WALL_BANNER = new Block<>(556, NamespacedKey.parse("minecraft:cyan_wall_banner"), () -> new WallBannerData(11940));

    public static final Block<WallBannerData> PURPLE_WALL_BANNER = new Block<>(557, NamespacedKey.parse("minecraft:purple_wall_banner"), () -> new WallBannerData(11944));

    public static final Block<WallBannerData> BLUE_WALL_BANNER = new Block<>(558, NamespacedKey.parse("minecraft:blue_wall_banner"), () -> new WallBannerData(11948));

    public static final Block<WallBannerData> BROWN_WALL_BANNER = new Block<>(559, NamespacedKey.parse("minecraft:brown_wall_banner"), () -> new WallBannerData(11952));

    public static final Block<WallBannerData> GREEN_WALL_BANNER = new Block<>(560, NamespacedKey.parse("minecraft:green_wall_banner"), () -> new WallBannerData(11956));

    public static final Block<WallBannerData> RED_WALL_BANNER = new Block<>(561, NamespacedKey.parse("minecraft:red_wall_banner"), () -> new WallBannerData(11960));

    public static final Block<WallBannerData> BLACK_WALL_BANNER = new Block<>(562, NamespacedKey.parse("minecraft:black_wall_banner"), () -> new WallBannerData(11964));

    public static final Block<BlockData> RED_SANDSTONE = new Block<>(563, NamespacedKey.parse("minecraft:red_sandstone"), () -> new BlockData(11968));

    public static final Block<BlockData> CHISELED_RED_SANDSTONE = new Block<>(564, NamespacedKey.parse("minecraft:chiseled_red_sandstone"), () -> new BlockData(11969));

    public static final Block<BlockData> CUT_RED_SANDSTONE = new Block<>(565, NamespacedKey.parse("minecraft:cut_red_sandstone"), () -> new BlockData(11970));

    public static final Block<StairData> RED_SANDSTONE_STAIRS = new Block<>(566, NamespacedKey.parse("minecraft:red_sandstone_stairs"), () -> new StairData(11971));

    public static final Block<SlabData> OAK_SLAB = new Block<>(567, NamespacedKey.parse("minecraft:oak_slab"), () -> new SlabData(12051));

    public static final Block<SlabData> SPRUCE_SLAB = new Block<>(568, NamespacedKey.parse("minecraft:spruce_slab"), () -> new SlabData(12057));

    public static final Block<SlabData> BIRCH_SLAB = new Block<>(569, NamespacedKey.parse("minecraft:birch_slab"), () -> new SlabData(12063));

    public static final Block<SlabData> JUNGLE_SLAB = new Block<>(570, NamespacedKey.parse("minecraft:jungle_slab"), () -> new SlabData(12069));

    public static final Block<SlabData> ACACIA_SLAB = new Block<>(571, NamespacedKey.parse("minecraft:acacia_slab"), () -> new SlabData(12075));

    public static final Block<SlabData> CHERRY_SLAB = new Block<>(572, NamespacedKey.parse("minecraft:cherry_slab"), () -> new SlabData(12081));

    public static final Block<SlabData> DARK_OAK_SLAB = new Block<>(573, NamespacedKey.parse("minecraft:dark_oak_slab"), () -> new SlabData(12087));

    public static final Block<SlabData> PALE_OAK_SLAB = new Block<>(574, NamespacedKey.parse("minecraft:pale_oak_slab"), () -> new SlabData(12093));

    public static final Block<SlabData> MANGROVE_SLAB = new Block<>(575, NamespacedKey.parse("minecraft:mangrove_slab"), () -> new SlabData(12099));

    public static final Block<SlabData> BAMBOO_SLAB = new Block<>(576, NamespacedKey.parse("minecraft:bamboo_slab"), () -> new SlabData(12105));

    public static final Block<SlabData> BAMBOO_MOSAIC_SLAB = new Block<>(577, NamespacedKey.parse("minecraft:bamboo_mosaic_slab"), () -> new SlabData(12111));

    public static final Block<SlabData> STONE_SLAB = new Block<>(578, NamespacedKey.parse("minecraft:stone_slab"), () -> new SlabData(12117));

    public static final Block<SlabData> SMOOTH_STONE_SLAB = new Block<>(579, NamespacedKey.parse("minecraft:smooth_stone_slab"), () -> new SlabData(12123));

    public static final Block<SlabData> SANDSTONE_SLAB = new Block<>(580, NamespacedKey.parse("minecraft:sandstone_slab"), () -> new SlabData(12129));

    public static final Block<SlabData> CUT_SANDSTONE_SLAB = new Block<>(581, NamespacedKey.parse("minecraft:cut_sandstone_slab"), () -> new SlabData(12135));

    public static final Block<SlabData> PETRIFIED_OAK_SLAB = new Block<>(582, NamespacedKey.parse("minecraft:petrified_oak_slab"), () -> new SlabData(12141));

    public static final Block<SlabData> COBBLESTONE_SLAB = new Block<>(583, NamespacedKey.parse("minecraft:cobblestone_slab"), () -> new SlabData(12147));

    public static final Block<SlabData> BRICK_SLAB = new Block<>(584, NamespacedKey.parse("minecraft:brick_slab"), () -> new SlabData(12153));

    public static final Block<SlabData> STONE_BRICK_SLAB = new Block<>(585, NamespacedKey.parse("minecraft:stone_brick_slab"), () -> new SlabData(12159));

    public static final Block<SlabData> MUD_BRICK_SLAB = new Block<>(586, NamespacedKey.parse("minecraft:mud_brick_slab"), () -> new SlabData(12165));

    public static final Block<SlabData> NETHER_BRICK_SLAB = new Block<>(587, NamespacedKey.parse("minecraft:nether_brick_slab"), () -> new SlabData(12171));

    public static final Block<SlabData> QUARTZ_SLAB = new Block<>(588, NamespacedKey.parse("minecraft:quartz_slab"), () -> new SlabData(12177));

    public static final Block<SlabData> RED_SANDSTONE_SLAB = new Block<>(589, NamespacedKey.parse("minecraft:red_sandstone_slab"), () -> new SlabData(12183));

    public static final Block<SlabData> CUT_RED_SANDSTONE_SLAB = new Block<>(590, NamespacedKey.parse("minecraft:cut_red_sandstone_slab"), () -> new SlabData(12189));

    public static final Block<SlabData> PURPUR_SLAB = new Block<>(591, NamespacedKey.parse("minecraft:purpur_slab"), () -> new SlabData(12195));

    public static final Block<BlockData> SMOOTH_STONE = new Block<>(592, NamespacedKey.parse("minecraft:smooth_stone"), () -> new BlockData(12201));

    public static final Block<BlockData> SMOOTH_SANDSTONE = new Block<>(593, NamespacedKey.parse("minecraft:smooth_sandstone"), () -> new BlockData(12202));

    public static final Block<BlockData> SMOOTH_QUARTZ = new Block<>(594, NamespacedKey.parse("minecraft:smooth_quartz"), () -> new BlockData(12203));

    public static final Block<BlockData> SMOOTH_RED_SANDSTONE = new Block<>(595, NamespacedKey.parse("minecraft:smooth_red_sandstone"), () -> new BlockData(12204));

    public static final Block<FenceGateData> SPRUCE_FENCE_GATE = new Block<>(596, NamespacedKey.parse("minecraft:spruce_fence_gate"), () -> new FenceGateData(12205));

    public static final Block<FenceGateData> BIRCH_FENCE_GATE = new Block<>(597, NamespacedKey.parse("minecraft:birch_fence_gate"), () -> new FenceGateData(12237));

    public static final Block<FenceGateData> JUNGLE_FENCE_GATE = new Block<>(598, NamespacedKey.parse("minecraft:jungle_fence_gate"), () -> new FenceGateData(12269));

    public static final Block<FenceGateData> ACACIA_FENCE_GATE = new Block<>(599, NamespacedKey.parse("minecraft:acacia_fence_gate"), () -> new FenceGateData(12301));

    public static final Block<FenceGateData> CHERRY_FENCE_GATE = new Block<>(600, NamespacedKey.parse("minecraft:cherry_fence_gate"), () -> new FenceGateData(12333));

    public static final Block<FenceGateData> DARK_OAK_FENCE_GATE = new Block<>(601, NamespacedKey.parse("minecraft:dark_oak_fence_gate"), () -> new FenceGateData(12365));

    public static final Block<FenceGateData> PALE_OAK_FENCE_GATE = new Block<>(602, NamespacedKey.parse("minecraft:pale_oak_fence_gate"), () -> new FenceGateData(12397));

    public static final Block<FenceGateData> MANGROVE_FENCE_GATE = new Block<>(603, NamespacedKey.parse("minecraft:mangrove_fence_gate"), () -> new FenceGateData(12429));

    public static final Block<FenceGateData> BAMBOO_FENCE_GATE = new Block<>(604, NamespacedKey.parse("minecraft:bamboo_fence_gate"), () -> new FenceGateData(12461));

    public static final Block<FenceData> SPRUCE_FENCE = new Block<>(605, NamespacedKey.parse("minecraft:spruce_fence"), () -> new FenceData(12493));

    public static final Block<FenceData> BIRCH_FENCE = new Block<>(606, NamespacedKey.parse("minecraft:birch_fence"), () -> new FenceData(12525));

    public static final Block<FenceData> JUNGLE_FENCE = new Block<>(607, NamespacedKey.parse("minecraft:jungle_fence"), () -> new FenceData(12557));

    public static final Block<FenceData> ACACIA_FENCE = new Block<>(608, NamespacedKey.parse("minecraft:acacia_fence"), () -> new FenceData(12589));

    public static final Block<FenceData> CHERRY_FENCE = new Block<>(609, NamespacedKey.parse("minecraft:cherry_fence"), () -> new FenceData(12621));

    public static final Block<FenceData> DARK_OAK_FENCE = new Block<>(610, NamespacedKey.parse("minecraft:dark_oak_fence"), () -> new FenceData(12653));

    public static final Block<FenceData> PALE_OAK_FENCE = new Block<>(611, NamespacedKey.parse("minecraft:pale_oak_fence"), () -> new FenceData(12685));

    public static final Block<FenceData> MANGROVE_FENCE = new Block<>(612, NamespacedKey.parse("minecraft:mangrove_fence"), () -> new FenceData(12717));

    public static final Block<FenceData> BAMBOO_FENCE = new Block<>(613, NamespacedKey.parse("minecraft:bamboo_fence"), () -> new FenceData(12749));

    public static final Block<DoorData> SPRUCE_DOOR = new Block<>(614, NamespacedKey.parse("minecraft:spruce_door"), () -> new DoorData(12781));

    public static final Block<DoorData> BIRCH_DOOR = new Block<>(615, NamespacedKey.parse("minecraft:birch_door"), () -> new DoorData(12845));

    public static final Block<DoorData> JUNGLE_DOOR = new Block<>(616, NamespacedKey.parse("minecraft:jungle_door"), () -> new DoorData(12909));

    public static final Block<DoorData> ACACIA_DOOR = new Block<>(617, NamespacedKey.parse("minecraft:acacia_door"), () -> new DoorData(12973));

    public static final Block<DoorData> CHERRY_DOOR = new Block<>(618, NamespacedKey.parse("minecraft:cherry_door"), () -> new DoorData(13037));

    public static final Block<DoorData> DARK_OAK_DOOR = new Block<>(619, NamespacedKey.parse("minecraft:dark_oak_door"), () -> new DoorData(13101));

    public static final Block<DoorData> PALE_OAK_DOOR = new Block<>(620, NamespacedKey.parse("minecraft:pale_oak_door"), () -> new DoorData(13165));

    public static final Block<DoorData> MANGROVE_DOOR = new Block<>(621, NamespacedKey.parse("minecraft:mangrove_door"), () -> new DoorData(13229));

    public static final Block<DoorData> BAMBOO_DOOR = new Block<>(622, NamespacedKey.parse("minecraft:bamboo_door"), () -> new DoorData(13293));

    public static final Block<EndRodData> END_ROD = new Block<>(623, NamespacedKey.parse("minecraft:end_rod"), () -> new EndRodData(13357));

    public static final Block<ChorusPlantData> CHORUS_PLANT = new Block<>(624, NamespacedKey.parse("minecraft:chorus_plant"), () -> new ChorusPlantData(13363));

    public static final Block<ChorusFlowerData> CHORUS_FLOWER = new Block<>(625, NamespacedKey.parse("minecraft:chorus_flower"), () -> new ChorusFlowerData(13427));

    public static final Block<BlockData> PURPUR_BLOCK = new Block<>(626, NamespacedKey.parse("minecraft:purpur_block"), () -> new BlockData(13433));

    public static final Block<RotatedPillarData> PURPUR_PILLAR = new Block<>(627, NamespacedKey.parse("minecraft:purpur_pillar"), () -> new RotatedPillarData(13434));

    public static final Block<StairData> PURPUR_STAIRS = new Block<>(628, NamespacedKey.parse("minecraft:purpur_stairs"), () -> new StairData(13437));

    public static final Block<BlockData> END_STONE_BRICKS = new Block<>(629, NamespacedKey.parse("minecraft:end_stone_bricks"), () -> new BlockData(13517));

    public static final Block<TorchflowerCropData> TORCHFLOWER_CROP = new Block<>(630, NamespacedKey.parse("minecraft:torchflower_crop"), () -> new TorchflowerCropData(13518));

    public static final Block<PitcherCropData> PITCHER_CROP = new Block<>(631, NamespacedKey.parse("minecraft:pitcher_crop"), () -> new PitcherCropData(13520));

    public static final Block<DoublePlantData> PITCHER_PLANT = new Block<>(632, NamespacedKey.parse("minecraft:pitcher_plant"), () -> new DoublePlantData(13530));

    public static final Block<BeetrootData> BEETROOTS = new Block<>(633, NamespacedKey.parse("minecraft:beetroots"), () -> new BeetrootData(13532));

    public static final Block<BlockData> DIRT_PATH = new Block<>(634, NamespacedKey.parse("minecraft:dirt_path"), () -> new BlockData(13536));

    public static final Block<BlockData> END_GATEWAY = new Block<>(635, NamespacedKey.parse("minecraft:end_gateway"), () -> new BlockData(13537));

    public static final Block<CommandData> REPEATING_COMMAND_BLOCK = new Block<>(636, NamespacedKey.parse("minecraft:repeating_command_block"), () -> new CommandData(13538));

    public static final Block<CommandData> CHAIN_COMMAND_BLOCK = new Block<>(637, NamespacedKey.parse("minecraft:chain_command_block"), () -> new CommandData(13550));

    public static final Block<FrostedIceData> FROSTED_ICE = new Block<>(638, NamespacedKey.parse("minecraft:frosted_ice"), () -> new FrostedIceData(13562));

    public static final Block<BlockData> MAGMA_BLOCK = new Block<>(639, NamespacedKey.parse("minecraft:magma_block"), () -> new BlockData(13566));

    public static final Block<BlockData> NETHER_WART_BLOCK = new Block<>(640, NamespacedKey.parse("minecraft:nether_wart_block"), () -> new BlockData(13567));

    public static final Block<BlockData> RED_NETHER_BRICKS = new Block<>(641, NamespacedKey.parse("minecraft:red_nether_bricks"), () -> new BlockData(13568));

    public static final Block<RotatedPillarData> BONE_BLOCK = new Block<>(642, NamespacedKey.parse("minecraft:bone_block"), () -> new RotatedPillarData(13569));

    public static final Block<BlockData> STRUCTURE_VOID = new Block<>(643, NamespacedKey.parse("minecraft:structure_void"), () -> new BlockData(13572));

    public static final Block<ObserverData> OBSERVER = new Block<>(644, NamespacedKey.parse("minecraft:observer"), () -> new ObserverData(13573));

    public static final Block<ShulkerBoxData> SHULKER_BOX = new Block<>(645, NamespacedKey.parse("minecraft:shulker_box"), () -> new ShulkerBoxData(13585));

    public static final Block<ShulkerBoxData> WHITE_SHULKER_BOX = new Block<>(646, NamespacedKey.parse("minecraft:white_shulker_box"), () -> new ShulkerBoxData(13591));

    public static final Block<ShulkerBoxData> ORANGE_SHULKER_BOX = new Block<>(647, NamespacedKey.parse("minecraft:orange_shulker_box"), () -> new ShulkerBoxData(13597));

    public static final Block<ShulkerBoxData> MAGENTA_SHULKER_BOX = new Block<>(648, NamespacedKey.parse("minecraft:magenta_shulker_box"), () -> new ShulkerBoxData(13603));

    public static final Block<ShulkerBoxData> LIGHT_BLUE_SHULKER_BOX = new Block<>(649, NamespacedKey.parse("minecraft:light_blue_shulker_box"), () -> new ShulkerBoxData(13609));

    public static final Block<ShulkerBoxData> YELLOW_SHULKER_BOX = new Block<>(650, NamespacedKey.parse("minecraft:yellow_shulker_box"), () -> new ShulkerBoxData(13615));

    public static final Block<ShulkerBoxData> LIME_SHULKER_BOX = new Block<>(651, NamespacedKey.parse("minecraft:lime_shulker_box"), () -> new ShulkerBoxData(13621));

    public static final Block<ShulkerBoxData> PINK_SHULKER_BOX = new Block<>(652, NamespacedKey.parse("minecraft:pink_shulker_box"), () -> new ShulkerBoxData(13627));

    public static final Block<ShulkerBoxData> GRAY_SHULKER_BOX = new Block<>(653, NamespacedKey.parse("minecraft:gray_shulker_box"), () -> new ShulkerBoxData(13633));

    public static final Block<ShulkerBoxData> LIGHT_GRAY_SHULKER_BOX = new Block<>(654, NamespacedKey.parse("minecraft:light_gray_shulker_box"), () -> new ShulkerBoxData(13639));

    public static final Block<ShulkerBoxData> CYAN_SHULKER_BOX = new Block<>(655, NamespacedKey.parse("minecraft:cyan_shulker_box"), () -> new ShulkerBoxData(13645));

    public static final Block<ShulkerBoxData> PURPLE_SHULKER_BOX = new Block<>(656, NamespacedKey.parse("minecraft:purple_shulker_box"), () -> new ShulkerBoxData(13651));

    public static final Block<ShulkerBoxData> BLUE_SHULKER_BOX = new Block<>(657, NamespacedKey.parse("minecraft:blue_shulker_box"), () -> new ShulkerBoxData(13657));

    public static final Block<ShulkerBoxData> BROWN_SHULKER_BOX = new Block<>(658, NamespacedKey.parse("minecraft:brown_shulker_box"), () -> new ShulkerBoxData(13663));

    public static final Block<ShulkerBoxData> GREEN_SHULKER_BOX = new Block<>(659, NamespacedKey.parse("minecraft:green_shulker_box"), () -> new ShulkerBoxData(13669));

    public static final Block<ShulkerBoxData> RED_SHULKER_BOX = new Block<>(660, NamespacedKey.parse("minecraft:red_shulker_box"), () -> new ShulkerBoxData(13675));

    public static final Block<ShulkerBoxData> BLACK_SHULKER_BOX = new Block<>(661, NamespacedKey.parse("minecraft:black_shulker_box"), () -> new ShulkerBoxData(13681));

    public static final Block<GlazedTerracottaData> WHITE_GLAZED_TERRACOTTA = new Block<>(662, NamespacedKey.parse("minecraft:white_glazed_terracotta"), () -> new GlazedTerracottaData(13687));

    public static final Block<GlazedTerracottaData> ORANGE_GLAZED_TERRACOTTA = new Block<>(663, NamespacedKey.parse("minecraft:orange_glazed_terracotta"), () -> new GlazedTerracottaData(13691));

    public static final Block<GlazedTerracottaData> MAGENTA_GLAZED_TERRACOTTA = new Block<>(664, NamespacedKey.parse("minecraft:magenta_glazed_terracotta"), () -> new GlazedTerracottaData(13695));

    public static final Block<GlazedTerracottaData> LIGHT_BLUE_GLAZED_TERRACOTTA = new Block<>(665, NamespacedKey.parse("minecraft:light_blue_glazed_terracotta"), () -> new GlazedTerracottaData(13699));

    public static final Block<GlazedTerracottaData> YELLOW_GLAZED_TERRACOTTA = new Block<>(666, NamespacedKey.parse("minecraft:yellow_glazed_terracotta"), () -> new GlazedTerracottaData(13703));

    public static final Block<GlazedTerracottaData> LIME_GLAZED_TERRACOTTA = new Block<>(667, NamespacedKey.parse("minecraft:lime_glazed_terracotta"), () -> new GlazedTerracottaData(13707));

    public static final Block<GlazedTerracottaData> PINK_GLAZED_TERRACOTTA = new Block<>(668, NamespacedKey.parse("minecraft:pink_glazed_terracotta"), () -> new GlazedTerracottaData(13711));

    public static final Block<GlazedTerracottaData> GRAY_GLAZED_TERRACOTTA = new Block<>(669, NamespacedKey.parse("minecraft:gray_glazed_terracotta"), () -> new GlazedTerracottaData(13715));

    public static final Block<GlazedTerracottaData> LIGHT_GRAY_GLAZED_TERRACOTTA = new Block<>(670, NamespacedKey.parse("minecraft:light_gray_glazed_terracotta"), () -> new GlazedTerracottaData(13719));

    public static final Block<GlazedTerracottaData> CYAN_GLAZED_TERRACOTTA = new Block<>(671, NamespacedKey.parse("minecraft:cyan_glazed_terracotta"), () -> new GlazedTerracottaData(13723));

    public static final Block<GlazedTerracottaData> PURPLE_GLAZED_TERRACOTTA = new Block<>(672, NamespacedKey.parse("minecraft:purple_glazed_terracotta"), () -> new GlazedTerracottaData(13727));

    public static final Block<GlazedTerracottaData> BLUE_GLAZED_TERRACOTTA = new Block<>(673, NamespacedKey.parse("minecraft:blue_glazed_terracotta"), () -> new GlazedTerracottaData(13731));

    public static final Block<GlazedTerracottaData> BROWN_GLAZED_TERRACOTTA = new Block<>(674, NamespacedKey.parse("minecraft:brown_glazed_terracotta"), () -> new GlazedTerracottaData(13735));

    public static final Block<GlazedTerracottaData> GREEN_GLAZED_TERRACOTTA = new Block<>(675, NamespacedKey.parse("minecraft:green_glazed_terracotta"), () -> new GlazedTerracottaData(13739));

    public static final Block<GlazedTerracottaData> RED_GLAZED_TERRACOTTA = new Block<>(676, NamespacedKey.parse("minecraft:red_glazed_terracotta"), () -> new GlazedTerracottaData(13743));

    public static final Block<GlazedTerracottaData> BLACK_GLAZED_TERRACOTTA = new Block<>(677, NamespacedKey.parse("minecraft:black_glazed_terracotta"), () -> new GlazedTerracottaData(13747));

    public static final Block<BlockData> WHITE_CONCRETE = new Block<>(678, NamespacedKey.parse("minecraft:white_concrete"), () -> new BlockData(13751));

    public static final Block<BlockData> ORANGE_CONCRETE = new Block<>(679, NamespacedKey.parse("minecraft:orange_concrete"), () -> new BlockData(13752));

    public static final Block<BlockData> MAGENTA_CONCRETE = new Block<>(680, NamespacedKey.parse("minecraft:magenta_concrete"), () -> new BlockData(13753));

    public static final Block<BlockData> LIGHT_BLUE_CONCRETE = new Block<>(681, NamespacedKey.parse("minecraft:light_blue_concrete"), () -> new BlockData(13754));

    public static final Block<BlockData> YELLOW_CONCRETE = new Block<>(682, NamespacedKey.parse("minecraft:yellow_concrete"), () -> new BlockData(13755));

    public static final Block<BlockData> LIME_CONCRETE = new Block<>(683, NamespacedKey.parse("minecraft:lime_concrete"), () -> new BlockData(13756));

    public static final Block<BlockData> PINK_CONCRETE = new Block<>(684, NamespacedKey.parse("minecraft:pink_concrete"), () -> new BlockData(13757));

    public static final Block<BlockData> GRAY_CONCRETE = new Block<>(685, NamespacedKey.parse("minecraft:gray_concrete"), () -> new BlockData(13758));

    public static final Block<BlockData> LIGHT_GRAY_CONCRETE = new Block<>(686, NamespacedKey.parse("minecraft:light_gray_concrete"), () -> new BlockData(13759));

    public static final Block<BlockData> CYAN_CONCRETE = new Block<>(687, NamespacedKey.parse("minecraft:cyan_concrete"), () -> new BlockData(13760));

    public static final Block<BlockData> PURPLE_CONCRETE = new Block<>(688, NamespacedKey.parse("minecraft:purple_concrete"), () -> new BlockData(13761));

    public static final Block<BlockData> BLUE_CONCRETE = new Block<>(689, NamespacedKey.parse("minecraft:blue_concrete"), () -> new BlockData(13762));

    public static final Block<BlockData> BROWN_CONCRETE = new Block<>(690, NamespacedKey.parse("minecraft:brown_concrete"), () -> new BlockData(13763));

    public static final Block<BlockData> GREEN_CONCRETE = new Block<>(691, NamespacedKey.parse("minecraft:green_concrete"), () -> new BlockData(13764));

    public static final Block<BlockData> RED_CONCRETE = new Block<>(692, NamespacedKey.parse("minecraft:red_concrete"), () -> new BlockData(13765));

    public static final Block<BlockData> BLACK_CONCRETE = new Block<>(693, NamespacedKey.parse("minecraft:black_concrete"), () -> new BlockData(13766));

    public static final Block<BlockData> WHITE_CONCRETE_POWDER = new Block<>(694, NamespacedKey.parse("minecraft:white_concrete_powder"), () -> new BlockData(13767));

    public static final Block<BlockData> ORANGE_CONCRETE_POWDER = new Block<>(695, NamespacedKey.parse("minecraft:orange_concrete_powder"), () -> new BlockData(13768));

    public static final Block<BlockData> MAGENTA_CONCRETE_POWDER = new Block<>(696, NamespacedKey.parse("minecraft:magenta_concrete_powder"), () -> new BlockData(13769));

    public static final Block<BlockData> LIGHT_BLUE_CONCRETE_POWDER = new Block<>(697, NamespacedKey.parse("minecraft:light_blue_concrete_powder"), () -> new BlockData(13770));

    public static final Block<BlockData> YELLOW_CONCRETE_POWDER = new Block<>(698, NamespacedKey.parse("minecraft:yellow_concrete_powder"), () -> new BlockData(13771));

    public static final Block<BlockData> LIME_CONCRETE_POWDER = new Block<>(699, NamespacedKey.parse("minecraft:lime_concrete_powder"), () -> new BlockData(13772));

    public static final Block<BlockData> PINK_CONCRETE_POWDER = new Block<>(700, NamespacedKey.parse("minecraft:pink_concrete_powder"), () -> new BlockData(13773));

    public static final Block<BlockData> GRAY_CONCRETE_POWDER = new Block<>(701, NamespacedKey.parse("minecraft:gray_concrete_powder"), () -> new BlockData(13774));

    public static final Block<BlockData> LIGHT_GRAY_CONCRETE_POWDER = new Block<>(702, NamespacedKey.parse("minecraft:light_gray_concrete_powder"), () -> new BlockData(13775));

    public static final Block<BlockData> CYAN_CONCRETE_POWDER = new Block<>(703, NamespacedKey.parse("minecraft:cyan_concrete_powder"), () -> new BlockData(13776));

    public static final Block<BlockData> PURPLE_CONCRETE_POWDER = new Block<>(704, NamespacedKey.parse("minecraft:purple_concrete_powder"), () -> new BlockData(13777));

    public static final Block<BlockData> BLUE_CONCRETE_POWDER = new Block<>(705, NamespacedKey.parse("minecraft:blue_concrete_powder"), () -> new BlockData(13778));

    public static final Block<BlockData> BROWN_CONCRETE_POWDER = new Block<>(706, NamespacedKey.parse("minecraft:brown_concrete_powder"), () -> new BlockData(13779));

    public static final Block<BlockData> GREEN_CONCRETE_POWDER = new Block<>(707, NamespacedKey.parse("minecraft:green_concrete_powder"), () -> new BlockData(13780));

    public static final Block<BlockData> RED_CONCRETE_POWDER = new Block<>(708, NamespacedKey.parse("minecraft:red_concrete_powder"), () -> new BlockData(13781));

    public static final Block<BlockData> BLACK_CONCRETE_POWDER = new Block<>(709, NamespacedKey.parse("minecraft:black_concrete_powder"), () -> new BlockData(13782));

    public static final Block<KelpData> KELP = new Block<>(710, NamespacedKey.parse("minecraft:kelp"), () -> new KelpData(13783));

    public static final Block<BlockData> KELP_PLANT = new Block<>(711, NamespacedKey.parse("minecraft:kelp_plant"), () -> new BlockData(13809));

    public static final Block<BlockData> DRIED_KELP_BLOCK = new Block<>(712, NamespacedKey.parse("minecraft:dried_kelp_block"), () -> new BlockData(13810));

    public static final Block<TurtleEggData> TURTLE_EGG = new Block<>(713, NamespacedKey.parse("minecraft:turtle_egg"), () -> new TurtleEggData(13811));

    public static final Block<SnifferEggData> SNIFFER_EGG = new Block<>(714, NamespacedKey.parse("minecraft:sniffer_egg"), () -> new SnifferEggData(13823));

    public static final Block<BlockData> DEAD_TUBE_CORAL_BLOCK = new Block<>(715, NamespacedKey.parse("minecraft:dead_tube_coral_block"), () -> new BlockData(13826));

    public static final Block<BlockData> DEAD_BRAIN_CORAL_BLOCK = new Block<>(716, NamespacedKey.parse("minecraft:dead_brain_coral_block"), () -> new BlockData(13827));

    public static final Block<BlockData> DEAD_BUBBLE_CORAL_BLOCK = new Block<>(717, NamespacedKey.parse("minecraft:dead_bubble_coral_block"), () -> new BlockData(13828));

    public static final Block<BlockData> DEAD_FIRE_CORAL_BLOCK = new Block<>(718, NamespacedKey.parse("minecraft:dead_fire_coral_block"), () -> new BlockData(13829));

    public static final Block<BlockData> DEAD_HORN_CORAL_BLOCK = new Block<>(719, NamespacedKey.parse("minecraft:dead_horn_coral_block"), () -> new BlockData(13830));

    public static final Block<BlockData> TUBE_CORAL_BLOCK = new Block<>(720, NamespacedKey.parse("minecraft:tube_coral_block"), () -> new BlockData(13831));

    public static final Block<BlockData> BRAIN_CORAL_BLOCK = new Block<>(721, NamespacedKey.parse("minecraft:brain_coral_block"), () -> new BlockData(13832));

    public static final Block<BlockData> BUBBLE_CORAL_BLOCK = new Block<>(722, NamespacedKey.parse("minecraft:bubble_coral_block"), () -> new BlockData(13833));

    public static final Block<BlockData> FIRE_CORAL_BLOCK = new Block<>(723, NamespacedKey.parse("minecraft:fire_coral_block"), () -> new BlockData(13834));

    public static final Block<BlockData> HORN_CORAL_BLOCK = new Block<>(724, NamespacedKey.parse("minecraft:horn_coral_block"), () -> new BlockData(13835));

    public static final Block<BaseCoralPlantData> DEAD_TUBE_CORAL = new Block<>(725, NamespacedKey.parse("minecraft:dead_tube_coral"), () -> new BaseCoralPlantData(13836));

    public static final Block<BaseCoralPlantData> DEAD_BRAIN_CORAL = new Block<>(726, NamespacedKey.parse("minecraft:dead_brain_coral"), () -> new BaseCoralPlantData(13838));

    public static final Block<BaseCoralPlantData> DEAD_BUBBLE_CORAL = new Block<>(727, NamespacedKey.parse("minecraft:dead_bubble_coral"), () -> new BaseCoralPlantData(13840));

    public static final Block<BaseCoralPlantData> DEAD_FIRE_CORAL = new Block<>(728, NamespacedKey.parse("minecraft:dead_fire_coral"), () -> new BaseCoralPlantData(13842));

    public static final Block<BaseCoralPlantData> DEAD_HORN_CORAL = new Block<>(729, NamespacedKey.parse("minecraft:dead_horn_coral"), () -> new BaseCoralPlantData(13844));

    public static final Block<CoralPlantData> TUBE_CORAL = new Block<>(730, NamespacedKey.parse("minecraft:tube_coral"), () -> new CoralPlantData(13846));

    public static final Block<CoralPlantData> BRAIN_CORAL = new Block<>(731, NamespacedKey.parse("minecraft:brain_coral"), () -> new CoralPlantData(13848));

    public static final Block<CoralPlantData> BUBBLE_CORAL = new Block<>(732, NamespacedKey.parse("minecraft:bubble_coral"), () -> new CoralPlantData(13850));

    public static final Block<CoralPlantData> FIRE_CORAL = new Block<>(733, NamespacedKey.parse("minecraft:fire_coral"), () -> new CoralPlantData(13852));

    public static final Block<CoralPlantData> HORN_CORAL = new Block<>(734, NamespacedKey.parse("minecraft:horn_coral"), () -> new CoralPlantData(13854));

    public static final Block<BaseCoralFanData> DEAD_TUBE_CORAL_FAN = new Block<>(735, NamespacedKey.parse("minecraft:dead_tube_coral_fan"), () -> new BaseCoralFanData(13856));

    public static final Block<BaseCoralFanData> DEAD_BRAIN_CORAL_FAN = new Block<>(736, NamespacedKey.parse("minecraft:dead_brain_coral_fan"), () -> new BaseCoralFanData(13858));

    public static final Block<BaseCoralFanData> DEAD_BUBBLE_CORAL_FAN = new Block<>(737, NamespacedKey.parse("minecraft:dead_bubble_coral_fan"), () -> new BaseCoralFanData(13860));

    public static final Block<BaseCoralFanData> DEAD_FIRE_CORAL_FAN = new Block<>(738, NamespacedKey.parse("minecraft:dead_fire_coral_fan"), () -> new BaseCoralFanData(13862));

    public static final Block<BaseCoralFanData> DEAD_HORN_CORAL_FAN = new Block<>(739, NamespacedKey.parse("minecraft:dead_horn_coral_fan"), () -> new BaseCoralFanData(13864));

    public static final Block<CoralFanData> TUBE_CORAL_FAN = new Block<>(740, NamespacedKey.parse("minecraft:tube_coral_fan"), () -> new CoralFanData(13866));

    public static final Block<CoralFanData> BRAIN_CORAL_FAN = new Block<>(741, NamespacedKey.parse("minecraft:brain_coral_fan"), () -> new CoralFanData(13868));

    public static final Block<CoralFanData> BUBBLE_CORAL_FAN = new Block<>(742, NamespacedKey.parse("minecraft:bubble_coral_fan"), () -> new CoralFanData(13870));

    public static final Block<CoralFanData> FIRE_CORAL_FAN = new Block<>(743, NamespacedKey.parse("minecraft:fire_coral_fan"), () -> new CoralFanData(13872));

    public static final Block<CoralFanData> HORN_CORAL_FAN = new Block<>(744, NamespacedKey.parse("minecraft:horn_coral_fan"), () -> new CoralFanData(13874));

    public static final Block<BaseCoralWallFanData> DEAD_TUBE_CORAL_WALL_FAN = new Block<>(745, NamespacedKey.parse("minecraft:dead_tube_coral_wall_fan"), () -> new BaseCoralWallFanData(13876));

    public static final Block<BaseCoralWallFanData> DEAD_BRAIN_CORAL_WALL_FAN = new Block<>(746, NamespacedKey.parse("minecraft:dead_brain_coral_wall_fan"), () -> new BaseCoralWallFanData(13884));

    public static final Block<BaseCoralWallFanData> DEAD_BUBBLE_CORAL_WALL_FAN = new Block<>(747, NamespacedKey.parse("minecraft:dead_bubble_coral_wall_fan"), () -> new BaseCoralWallFanData(13892));

    public static final Block<BaseCoralWallFanData> DEAD_FIRE_CORAL_WALL_FAN = new Block<>(748, NamespacedKey.parse("minecraft:dead_fire_coral_wall_fan"), () -> new BaseCoralWallFanData(13900));

    public static final Block<BaseCoralWallFanData> DEAD_HORN_CORAL_WALL_FAN = new Block<>(749, NamespacedKey.parse("minecraft:dead_horn_coral_wall_fan"), () -> new BaseCoralWallFanData(13908));

    public static final Block<CoralWallFanData> TUBE_CORAL_WALL_FAN = new Block<>(750, NamespacedKey.parse("minecraft:tube_coral_wall_fan"), () -> new CoralWallFanData(13916));

    public static final Block<CoralWallFanData> BRAIN_CORAL_WALL_FAN = new Block<>(751, NamespacedKey.parse("minecraft:brain_coral_wall_fan"), () -> new CoralWallFanData(13924));

    public static final Block<CoralWallFanData> BUBBLE_CORAL_WALL_FAN = new Block<>(752, NamespacedKey.parse("minecraft:bubble_coral_wall_fan"), () -> new CoralWallFanData(13932));

    public static final Block<CoralWallFanData> FIRE_CORAL_WALL_FAN = new Block<>(753, NamespacedKey.parse("minecraft:fire_coral_wall_fan"), () -> new CoralWallFanData(13940));

    public static final Block<CoralWallFanData> HORN_CORAL_WALL_FAN = new Block<>(754, NamespacedKey.parse("minecraft:horn_coral_wall_fan"), () -> new CoralWallFanData(13948));

    public static final Block<SeaPickleData> SEA_PICKLE = new Block<>(755, NamespacedKey.parse("minecraft:sea_pickle"), () -> new SeaPickleData(13956));

    public static final Block<BlockData> BLUE_ICE = new Block<>(756, NamespacedKey.parse("minecraft:blue_ice"), () -> new BlockData(13964));

    public static final Block<ConduitData> CONDUIT = new Block<>(757, NamespacedKey.parse("minecraft:conduit"), () -> new ConduitData(13965));

    public static final Block<BlockData> BAMBOO_SAPLING = new Block<>(758, NamespacedKey.parse("minecraft:bamboo_sapling"), () -> new BlockData(13967));

    public static final Block<BambooStalkData> BAMBOO = new Block<>(759, NamespacedKey.parse("minecraft:bamboo"), () -> new BambooStalkData(13968));

    public static final Block<BlockData> POTTED_BAMBOO = new Block<>(760, NamespacedKey.parse("minecraft:potted_bamboo"), () -> new BlockData(13980));

    public static final Block<BlockData> VOID_AIR = new Block<>(761, NamespacedKey.parse("minecraft:void_air"), () -> new BlockData(13981));

    public static final Block<BlockData> CAVE_AIR = new Block<>(762, NamespacedKey.parse("minecraft:cave_air"), () -> new BlockData(13982));

    public static final Block<BubbleColumnData> BUBBLE_COLUMN = new Block<>(763, NamespacedKey.parse("minecraft:bubble_column"), () -> new BubbleColumnData(13983));

    public static final Block<StairData> POLISHED_GRANITE_STAIRS = new Block<>(764, NamespacedKey.parse("minecraft:polished_granite_stairs"), () -> new StairData(13985));

    public static final Block<StairData> SMOOTH_RED_SANDSTONE_STAIRS = new Block<>(765, NamespacedKey.parse("minecraft:smooth_red_sandstone_stairs"), () -> new StairData(14065));

    public static final Block<StairData> MOSSY_STONE_BRICK_STAIRS = new Block<>(766, NamespacedKey.parse("minecraft:mossy_stone_brick_stairs"), () -> new StairData(14145));

    public static final Block<StairData> POLISHED_DIORITE_STAIRS = new Block<>(767, NamespacedKey.parse("minecraft:polished_diorite_stairs"), () -> new StairData(14225));

    public static final Block<StairData> MOSSY_COBBLESTONE_STAIRS = new Block<>(768, NamespacedKey.parse("minecraft:mossy_cobblestone_stairs"), () -> new StairData(14305));

    public static final Block<StairData> END_STONE_BRICK_STAIRS = new Block<>(769, NamespacedKey.parse("minecraft:end_stone_brick_stairs"), () -> new StairData(14385));

    public static final Block<StairData> STONE_STAIRS = new Block<>(770, NamespacedKey.parse("minecraft:stone_stairs"), () -> new StairData(14465));

    public static final Block<StairData> SMOOTH_SANDSTONE_STAIRS = new Block<>(771, NamespacedKey.parse("minecraft:smooth_sandstone_stairs"), () -> new StairData(14545));

    public static final Block<StairData> SMOOTH_QUARTZ_STAIRS = new Block<>(772, NamespacedKey.parse("minecraft:smooth_quartz_stairs"), () -> new StairData(14625));

    public static final Block<StairData> GRANITE_STAIRS = new Block<>(773, NamespacedKey.parse("minecraft:granite_stairs"), () -> new StairData(14705));

    public static final Block<StairData> ANDESITE_STAIRS = new Block<>(774, NamespacedKey.parse("minecraft:andesite_stairs"), () -> new StairData(14785));

    public static final Block<StairData> RED_NETHER_BRICK_STAIRS = new Block<>(775, NamespacedKey.parse("minecraft:red_nether_brick_stairs"), () -> new StairData(14865));

    public static final Block<StairData> POLISHED_ANDESITE_STAIRS = new Block<>(776, NamespacedKey.parse("minecraft:polished_andesite_stairs"), () -> new StairData(14945));

    public static final Block<StairData> DIORITE_STAIRS = new Block<>(777, NamespacedKey.parse("minecraft:diorite_stairs"), () -> new StairData(15025));

    public static final Block<SlabData> POLISHED_GRANITE_SLAB = new Block<>(778, NamespacedKey.parse("minecraft:polished_granite_slab"), () -> new SlabData(15105));

    public static final Block<SlabData> SMOOTH_RED_SANDSTONE_SLAB = new Block<>(779, NamespacedKey.parse("minecraft:smooth_red_sandstone_slab"), () -> new SlabData(15111));

    public static final Block<SlabData> MOSSY_STONE_BRICK_SLAB = new Block<>(780, NamespacedKey.parse("minecraft:mossy_stone_brick_slab"), () -> new SlabData(15117));

    public static final Block<SlabData> POLISHED_DIORITE_SLAB = new Block<>(781, NamespacedKey.parse("minecraft:polished_diorite_slab"), () -> new SlabData(15123));

    public static final Block<SlabData> MOSSY_COBBLESTONE_SLAB = new Block<>(782, NamespacedKey.parse("minecraft:mossy_cobblestone_slab"), () -> new SlabData(15129));

    public static final Block<SlabData> END_STONE_BRICK_SLAB = new Block<>(783, NamespacedKey.parse("minecraft:end_stone_brick_slab"), () -> new SlabData(15135));

    public static final Block<SlabData> SMOOTH_SANDSTONE_SLAB = new Block<>(784, NamespacedKey.parse("minecraft:smooth_sandstone_slab"), () -> new SlabData(15141));

    public static final Block<SlabData> SMOOTH_QUARTZ_SLAB = new Block<>(785, NamespacedKey.parse("minecraft:smooth_quartz_slab"), () -> new SlabData(15147));

    public static final Block<SlabData> GRANITE_SLAB = new Block<>(786, NamespacedKey.parse("minecraft:granite_slab"), () -> new SlabData(15153));

    public static final Block<SlabData> ANDESITE_SLAB = new Block<>(787, NamespacedKey.parse("minecraft:andesite_slab"), () -> new SlabData(15159));

    public static final Block<SlabData> RED_NETHER_BRICK_SLAB = new Block<>(788, NamespacedKey.parse("minecraft:red_nether_brick_slab"), () -> new SlabData(15165));

    public static final Block<SlabData> POLISHED_ANDESITE_SLAB = new Block<>(789, NamespacedKey.parse("minecraft:polished_andesite_slab"), () -> new SlabData(15171));

    public static final Block<SlabData> DIORITE_SLAB = new Block<>(790, NamespacedKey.parse("minecraft:diorite_slab"), () -> new SlabData(15177));

    public static final Block<WallData> BRICK_WALL = new Block<>(791, NamespacedKey.parse("minecraft:brick_wall"), () -> new WallData(15183));

    public static final Block<WallData> PRISMARINE_WALL = new Block<>(792, NamespacedKey.parse("minecraft:prismarine_wall"), () -> new WallData(15507));

    public static final Block<WallData> RED_SANDSTONE_WALL = new Block<>(793, NamespacedKey.parse("minecraft:red_sandstone_wall"), () -> new WallData(15831));

    public static final Block<WallData> MOSSY_STONE_BRICK_WALL = new Block<>(794, NamespacedKey.parse("minecraft:mossy_stone_brick_wall"), () -> new WallData(16155));

    public static final Block<WallData> GRANITE_WALL = new Block<>(795, NamespacedKey.parse("minecraft:granite_wall"), () -> new WallData(16479));

    public static final Block<WallData> STONE_BRICK_WALL = new Block<>(796, NamespacedKey.parse("minecraft:stone_brick_wall"), () -> new WallData(16803));

    public static final Block<WallData> MUD_BRICK_WALL = new Block<>(797, NamespacedKey.parse("minecraft:mud_brick_wall"), () -> new WallData(17127));

    public static final Block<WallData> NETHER_BRICK_WALL = new Block<>(798, NamespacedKey.parse("minecraft:nether_brick_wall"), () -> new WallData(17451));

    public static final Block<WallData> ANDESITE_WALL = new Block<>(799, NamespacedKey.parse("minecraft:andesite_wall"), () -> new WallData(17775));

    public static final Block<WallData> RED_NETHER_BRICK_WALL = new Block<>(800, NamespacedKey.parse("minecraft:red_nether_brick_wall"), () -> new WallData(18099));

    public static final Block<WallData> SANDSTONE_WALL = new Block<>(801, NamespacedKey.parse("minecraft:sandstone_wall"), () -> new WallData(18423));

    public static final Block<WallData> END_STONE_BRICK_WALL = new Block<>(802, NamespacedKey.parse("minecraft:end_stone_brick_wall"), () -> new WallData(18747));

    public static final Block<WallData> DIORITE_WALL = new Block<>(803, NamespacedKey.parse("minecraft:diorite_wall"), () -> new WallData(19071));

    public static final Block<ScaffoldingData> SCAFFOLDING = new Block<>(804, NamespacedKey.parse("minecraft:scaffolding"), () -> new ScaffoldingData(19395));

    public static final Block<LoomData> LOOM = new Block<>(805, NamespacedKey.parse("minecraft:loom"), () -> new LoomData(19427));

    public static final Block<BarrelData> BARREL = new Block<>(806, NamespacedKey.parse("minecraft:barrel"), () -> new BarrelData(19431));

    public static final Block<SmokerData> SMOKER = new Block<>(807, NamespacedKey.parse("minecraft:smoker"), () -> new SmokerData(19443));

    public static final Block<BlastFurnaceData> BLAST_FURNACE = new Block<>(808, NamespacedKey.parse("minecraft:blast_furnace"), () -> new BlastFurnaceData(19451));

    public static final Block<BlockData> CARTOGRAPHY_TABLE = new Block<>(809, NamespacedKey.parse("minecraft:cartography_table"), () -> new BlockData(19459));

    public static final Block<BlockData> FLETCHING_TABLE = new Block<>(810, NamespacedKey.parse("minecraft:fletching_table"), () -> new BlockData(19460));

    public static final Block<GrindstoneData> GRINDSTONE = new Block<>(811, NamespacedKey.parse("minecraft:grindstone"), () -> new GrindstoneData(19461));

    public static final Block<LecternData> LECTERN = new Block<>(812, NamespacedKey.parse("minecraft:lectern"), () -> new LecternData(19473));

    public static final Block<BlockData> SMITHING_TABLE = new Block<>(813, NamespacedKey.parse("minecraft:smithing_table"), () -> new BlockData(19489));

    public static final Block<StonecutterData> STONECUTTER = new Block<>(814, NamespacedKey.parse("minecraft:stonecutter"), () -> new StonecutterData(19490));

    public static final Block<BellData> BELL = new Block<>(815, NamespacedKey.parse("minecraft:bell"), () -> new BellData(19494));

    public static final Block<LanternData> LANTERN = new Block<>(816, NamespacedKey.parse("minecraft:lantern"), () -> new LanternData(19526));

    public static final Block<LanternData> SOUL_LANTERN = new Block<>(817, NamespacedKey.parse("minecraft:soul_lantern"), () -> new LanternData(19530));

    public static final Block<CampfireData> CAMPFIRE = new Block<>(818, NamespacedKey.parse("minecraft:campfire"), () -> new CampfireData(19534));

    public static final Block<CampfireData> SOUL_CAMPFIRE = new Block<>(819, NamespacedKey.parse("minecraft:soul_campfire"), () -> new CampfireData(19566));

    public static final Block<SweetBerryBushData> SWEET_BERRY_BUSH = new Block<>(820, NamespacedKey.parse("minecraft:sweet_berry_bush"), () -> new SweetBerryBushData(19598));

    public static final Block<RotatedPillarData> WARPED_STEM = new Block<>(821, NamespacedKey.parse("minecraft:warped_stem"), () -> new RotatedPillarData(19602));

    public static final Block<RotatedPillarData> STRIPPED_WARPED_STEM = new Block<>(822, NamespacedKey.parse("minecraft:stripped_warped_stem"), () -> new RotatedPillarData(19605));

    public static final Block<RotatedPillarData> WARPED_HYPHAE = new Block<>(823, NamespacedKey.parse("minecraft:warped_hyphae"), () -> new RotatedPillarData(19608));

    public static final Block<RotatedPillarData> STRIPPED_WARPED_HYPHAE = new Block<>(824, NamespacedKey.parse("minecraft:stripped_warped_hyphae"), () -> new RotatedPillarData(19611));

    public static final Block<BlockData> WARPED_NYLIUM = new Block<>(825, NamespacedKey.parse("minecraft:warped_nylium"), () -> new BlockData(19614));

    public static final Block<BlockData> WARPED_FUNGUS = new Block<>(826, NamespacedKey.parse("minecraft:warped_fungus"), () -> new BlockData(19615));

    public static final Block<BlockData> WARPED_WART_BLOCK = new Block<>(827, NamespacedKey.parse("minecraft:warped_wart_block"), () -> new BlockData(19616));

    public static final Block<BlockData> WARPED_ROOTS = new Block<>(828, NamespacedKey.parse("minecraft:warped_roots"), () -> new BlockData(19617));

    public static final Block<BlockData> NETHER_SPROUTS = new Block<>(829, NamespacedKey.parse("minecraft:nether_sprouts"), () -> new BlockData(19618));

    public static final Block<RotatedPillarData> CRIMSON_STEM = new Block<>(830, NamespacedKey.parse("minecraft:crimson_stem"), () -> new RotatedPillarData(19619));

    public static final Block<RotatedPillarData> STRIPPED_CRIMSON_STEM = new Block<>(831, NamespacedKey.parse("minecraft:stripped_crimson_stem"), () -> new RotatedPillarData(19622));

    public static final Block<RotatedPillarData> CRIMSON_HYPHAE = new Block<>(832, NamespacedKey.parse("minecraft:crimson_hyphae"), () -> new RotatedPillarData(19625));

    public static final Block<RotatedPillarData> STRIPPED_CRIMSON_HYPHAE = new Block<>(833, NamespacedKey.parse("minecraft:stripped_crimson_hyphae"), () -> new RotatedPillarData(19628));

    public static final Block<BlockData> CRIMSON_NYLIUM = new Block<>(834, NamespacedKey.parse("minecraft:crimson_nylium"), () -> new BlockData(19631));

    public static final Block<BlockData> CRIMSON_FUNGUS = new Block<>(835, NamespacedKey.parse("minecraft:crimson_fungus"), () -> new BlockData(19632));

    public static final Block<BlockData> SHROOMLIGHT = new Block<>(836, NamespacedKey.parse("minecraft:shroomlight"), () -> new BlockData(19633));

    public static final Block<WeepingVinesData> WEEPING_VINES = new Block<>(837, NamespacedKey.parse("minecraft:weeping_vines"), () -> new WeepingVinesData(19634));

    public static final Block<BlockData> WEEPING_VINES_PLANT = new Block<>(838, NamespacedKey.parse("minecraft:weeping_vines_plant"), () -> new BlockData(19660));

    public static final Block<TwistingVinesData> TWISTING_VINES = new Block<>(839, NamespacedKey.parse("minecraft:twisting_vines"), () -> new TwistingVinesData(19661));

    public static final Block<BlockData> TWISTING_VINES_PLANT = new Block<>(840, NamespacedKey.parse("minecraft:twisting_vines_plant"), () -> new BlockData(19687));

    public static final Block<BlockData> CRIMSON_ROOTS = new Block<>(841, NamespacedKey.parse("minecraft:crimson_roots"), () -> new BlockData(19688));

    public static final Block<BlockData> CRIMSON_PLANKS = new Block<>(842, NamespacedKey.parse("minecraft:crimson_planks"), () -> new BlockData(19689));

    public static final Block<BlockData> WARPED_PLANKS = new Block<>(843, NamespacedKey.parse("minecraft:warped_planks"), () -> new BlockData(19690));

    public static final Block<SlabData> CRIMSON_SLAB = new Block<>(844, NamespacedKey.parse("minecraft:crimson_slab"), () -> new SlabData(19691));

    public static final Block<SlabData> WARPED_SLAB = new Block<>(845, NamespacedKey.parse("minecraft:warped_slab"), () -> new SlabData(19697));

    public static final Block<PressurePlateData> CRIMSON_PRESSURE_PLATE = new Block<>(846, NamespacedKey.parse("minecraft:crimson_pressure_plate"), () -> new PressurePlateData(19703));

    public static final Block<PressurePlateData> WARPED_PRESSURE_PLATE = new Block<>(847, NamespacedKey.parse("minecraft:warped_pressure_plate"), () -> new PressurePlateData(19705));

    public static final Block<FenceData> CRIMSON_FENCE = new Block<>(848, NamespacedKey.parse("minecraft:crimson_fence"), () -> new FenceData(19707));

    public static final Block<FenceData> WARPED_FENCE = new Block<>(849, NamespacedKey.parse("minecraft:warped_fence"), () -> new FenceData(19739));

    public static final Block<TrapdoorData> CRIMSON_TRAPDOOR = new Block<>(850, NamespacedKey.parse("minecraft:crimson_trapdoor"), () -> new TrapdoorData(19771));

    public static final Block<TrapdoorData> WARPED_TRAPDOOR = new Block<>(851, NamespacedKey.parse("minecraft:warped_trapdoor"), () -> new TrapdoorData(19835));

    public static final Block<FenceGateData> CRIMSON_FENCE_GATE = new Block<>(852, NamespacedKey.parse("minecraft:crimson_fence_gate"), () -> new FenceGateData(19899));

    public static final Block<FenceGateData> WARPED_FENCE_GATE = new Block<>(853, NamespacedKey.parse("minecraft:warped_fence_gate"), () -> new FenceGateData(19931));

    public static final Block<StairData> CRIMSON_STAIRS = new Block<>(854, NamespacedKey.parse("minecraft:crimson_stairs"), () -> new StairData(19963));

    public static final Block<StairData> WARPED_STAIRS = new Block<>(855, NamespacedKey.parse("minecraft:warped_stairs"), () -> new StairData(20043));

    public static final Block<ButtonData> CRIMSON_BUTTON = new Block<>(856, NamespacedKey.parse("minecraft:crimson_button"), () -> new ButtonData(20123));

    public static final Block<ButtonData> WARPED_BUTTON = new Block<>(857, NamespacedKey.parse("minecraft:warped_button"), () -> new ButtonData(20147));

    public static final Block<DoorData> CRIMSON_DOOR = new Block<>(858, NamespacedKey.parse("minecraft:crimson_door"), () -> new DoorData(20171));

    public static final Block<DoorData> WARPED_DOOR = new Block<>(859, NamespacedKey.parse("minecraft:warped_door"), () -> new DoorData(20235));

    public static final Block<StandingSignData> CRIMSON_SIGN = new Block<>(860, NamespacedKey.parse("minecraft:crimson_sign"), () -> new StandingSignData(20299));

    public static final Block<StandingSignData> WARPED_SIGN = new Block<>(861, NamespacedKey.parse("minecraft:warped_sign"), () -> new StandingSignData(20331));

    public static final Block<WallSignData> CRIMSON_WALL_SIGN = new Block<>(862, NamespacedKey.parse("minecraft:crimson_wall_sign"), () -> new WallSignData(20363));

    public static final Block<WallSignData> WARPED_WALL_SIGN = new Block<>(863, NamespacedKey.parse("minecraft:warped_wall_sign"), () -> new WallSignData(20371));

    public static final Block<StructureData> STRUCTURE_BLOCK = new Block<>(864, NamespacedKey.parse("minecraft:structure_block"), () -> new StructureData(20379));

    public static final Block<JigsawData> JIGSAW = new Block<>(865, NamespacedKey.parse("minecraft:jigsaw"), () -> new JigsawData(20383));

    public static final Block<TestData> TEST_BLOCK = new Block<>(866, NamespacedKey.parse("minecraft:test_block"), () -> new TestData(20395));

    public static final Block<BlockData> TEST_INSTANCE_BLOCK = new Block<>(867, NamespacedKey.parse("minecraft:test_instance_block"), () -> new BlockData(20399));

    public static final Block<ComposterData> COMPOSTER = new Block<>(868, NamespacedKey.parse("minecraft:composter"), () -> new ComposterData(20400));

    public static final Block<TargetData> TARGET = new Block<>(869, NamespacedKey.parse("minecraft:target"), () -> new TargetData(20409));

    public static final Block<BeehiveData> BEE_NEST = new Block<>(870, NamespacedKey.parse("minecraft:bee_nest"), () -> new BeehiveData(20425));

    public static final Block<BeehiveData> BEEHIVE = new Block<>(871, NamespacedKey.parse("minecraft:beehive"), () -> new BeehiveData(20449));

    public static final Block<BlockData> HONEY_BLOCK = new Block<>(872, NamespacedKey.parse("minecraft:honey_block"), () -> new BlockData(20473));

    public static final Block<BlockData> HONEYCOMB_BLOCK = new Block<>(873, NamespacedKey.parse("minecraft:honeycomb_block"), () -> new BlockData(20474));

    public static final Block<BlockData> NETHERITE_BLOCK = new Block<>(874, NamespacedKey.parse("minecraft:netherite_block"), () -> new BlockData(20475));

    public static final Block<BlockData> ANCIENT_DEBRIS = new Block<>(875, NamespacedKey.parse("minecraft:ancient_debris"), () -> new BlockData(20476));

    public static final Block<BlockData> CRYING_OBSIDIAN = new Block<>(876, NamespacedKey.parse("minecraft:crying_obsidian"), () -> new BlockData(20477));

    public static final Block<RespawnAnchorData> RESPAWN_ANCHOR = new Block<>(877, NamespacedKey.parse("minecraft:respawn_anchor"), () -> new RespawnAnchorData(20478));

    public static final Block<BlockData> POTTED_CRIMSON_FUNGUS = new Block<>(878, NamespacedKey.parse("minecraft:potted_crimson_fungus"), () -> new BlockData(20483));

    public static final Block<BlockData> POTTED_WARPED_FUNGUS = new Block<>(879, NamespacedKey.parse("minecraft:potted_warped_fungus"), () -> new BlockData(20484));

    public static final Block<BlockData> POTTED_CRIMSON_ROOTS = new Block<>(880, NamespacedKey.parse("minecraft:potted_crimson_roots"), () -> new BlockData(20485));

    public static final Block<BlockData> POTTED_WARPED_ROOTS = new Block<>(881, NamespacedKey.parse("minecraft:potted_warped_roots"), () -> new BlockData(20486));

    public static final Block<BlockData> LODESTONE = new Block<>(882, NamespacedKey.parse("minecraft:lodestone"), () -> new BlockData(20487));

    public static final Block<BlockData> BLACKSTONE = new Block<>(883, NamespacedKey.parse("minecraft:blackstone"), () -> new BlockData(20488));

    public static final Block<StairData> BLACKSTONE_STAIRS = new Block<>(884, NamespacedKey.parse("minecraft:blackstone_stairs"), () -> new StairData(20489));

    public static final Block<WallData> BLACKSTONE_WALL = new Block<>(885, NamespacedKey.parse("minecraft:blackstone_wall"), () -> new WallData(20569));

    public static final Block<SlabData> BLACKSTONE_SLAB = new Block<>(886, NamespacedKey.parse("minecraft:blackstone_slab"), () -> new SlabData(20893));

    public static final Block<BlockData> POLISHED_BLACKSTONE = new Block<>(887, NamespacedKey.parse("minecraft:polished_blackstone"), () -> new BlockData(20899));

    public static final Block<BlockData> POLISHED_BLACKSTONE_BRICKS = new Block<>(888, NamespacedKey.parse("minecraft:polished_blackstone_bricks"), () -> new BlockData(20900));

    public static final Block<BlockData> CRACKED_POLISHED_BLACKSTONE_BRICKS = new Block<>(889, NamespacedKey.parse("minecraft:cracked_polished_blackstone_bricks"), () -> new BlockData(20901));

    public static final Block<BlockData> CHISELED_POLISHED_BLACKSTONE = new Block<>(890, NamespacedKey.parse("minecraft:chiseled_polished_blackstone"), () -> new BlockData(20902));

    public static final Block<SlabData> POLISHED_BLACKSTONE_BRICK_SLAB = new Block<>(891, NamespacedKey.parse("minecraft:polished_blackstone_brick_slab"), () -> new SlabData(20903));

    public static final Block<StairData> POLISHED_BLACKSTONE_BRICK_STAIRS = new Block<>(892, NamespacedKey.parse("minecraft:polished_blackstone_brick_stairs"), () -> new StairData(20909));

    public static final Block<WallData> POLISHED_BLACKSTONE_BRICK_WALL = new Block<>(893, NamespacedKey.parse("minecraft:polished_blackstone_brick_wall"), () -> new WallData(20989));

    public static final Block<BlockData> GILDED_BLACKSTONE = new Block<>(894, NamespacedKey.parse("minecraft:gilded_blackstone"), () -> new BlockData(21313));

    public static final Block<StairData> POLISHED_BLACKSTONE_STAIRS = new Block<>(895, NamespacedKey.parse("minecraft:polished_blackstone_stairs"), () -> new StairData(21314));

    public static final Block<SlabData> POLISHED_BLACKSTONE_SLAB = new Block<>(896, NamespacedKey.parse("minecraft:polished_blackstone_slab"), () -> new SlabData(21394));

    public static final Block<PressurePlateData> POLISHED_BLACKSTONE_PRESSURE_PLATE = new Block<>(897, NamespacedKey.parse("minecraft:polished_blackstone_pressure_plate"), () -> new PressurePlateData(21400));

    public static final Block<ButtonData> POLISHED_BLACKSTONE_BUTTON = new Block<>(898, NamespacedKey.parse("minecraft:polished_blackstone_button"), () -> new ButtonData(21402));

    public static final Block<WallData> POLISHED_BLACKSTONE_WALL = new Block<>(899, NamespacedKey.parse("minecraft:polished_blackstone_wall"), () -> new WallData(21426));

    public static final Block<BlockData> CHISELED_NETHER_BRICKS = new Block<>(900, NamespacedKey.parse("minecraft:chiseled_nether_bricks"), () -> new BlockData(21750));

    public static final Block<BlockData> CRACKED_NETHER_BRICKS = new Block<>(901, NamespacedKey.parse("minecraft:cracked_nether_bricks"), () -> new BlockData(21751));

    public static final Block<BlockData> QUARTZ_BRICKS = new Block<>(902, NamespacedKey.parse("minecraft:quartz_bricks"), () -> new BlockData(21752));

    public static final Block<CandleData> CANDLE = new Block<>(903, NamespacedKey.parse("minecraft:candle"), () -> new CandleData(21753));

    public static final Block<CandleData> WHITE_CANDLE = new Block<>(904, NamespacedKey.parse("minecraft:white_candle"), () -> new CandleData(21769));

    public static final Block<CandleData> ORANGE_CANDLE = new Block<>(905, NamespacedKey.parse("minecraft:orange_candle"), () -> new CandleData(21785));

    public static final Block<CandleData> MAGENTA_CANDLE = new Block<>(906, NamespacedKey.parse("minecraft:magenta_candle"), () -> new CandleData(21801));

    public static final Block<CandleData> LIGHT_BLUE_CANDLE = new Block<>(907, NamespacedKey.parse("minecraft:light_blue_candle"), () -> new CandleData(21817));

    public static final Block<CandleData> YELLOW_CANDLE = new Block<>(908, NamespacedKey.parse("minecraft:yellow_candle"), () -> new CandleData(21833));

    public static final Block<CandleData> LIME_CANDLE = new Block<>(909, NamespacedKey.parse("minecraft:lime_candle"), () -> new CandleData(21849));

    public static final Block<CandleData> PINK_CANDLE = new Block<>(910, NamespacedKey.parse("minecraft:pink_candle"), () -> new CandleData(21865));

    public static final Block<CandleData> GRAY_CANDLE = new Block<>(911, NamespacedKey.parse("minecraft:gray_candle"), () -> new CandleData(21881));

    public static final Block<CandleData> LIGHT_GRAY_CANDLE = new Block<>(912, NamespacedKey.parse("minecraft:light_gray_candle"), () -> new CandleData(21897));

    public static final Block<CandleData> CYAN_CANDLE = new Block<>(913, NamespacedKey.parse("minecraft:cyan_candle"), () -> new CandleData(21913));

    public static final Block<CandleData> PURPLE_CANDLE = new Block<>(914, NamespacedKey.parse("minecraft:purple_candle"), () -> new CandleData(21929));

    public static final Block<CandleData> BLUE_CANDLE = new Block<>(915, NamespacedKey.parse("minecraft:blue_candle"), () -> new CandleData(21945));

    public static final Block<CandleData> BROWN_CANDLE = new Block<>(916, NamespacedKey.parse("minecraft:brown_candle"), () -> new CandleData(21961));

    public static final Block<CandleData> GREEN_CANDLE = new Block<>(917, NamespacedKey.parse("minecraft:green_candle"), () -> new CandleData(21977));

    public static final Block<CandleData> RED_CANDLE = new Block<>(918, NamespacedKey.parse("minecraft:red_candle"), () -> new CandleData(21993));

    public static final Block<CandleData> BLACK_CANDLE = new Block<>(919, NamespacedKey.parse("minecraft:black_candle"), () -> new CandleData(22009));

    public static final Block<CandleCakeData> CANDLE_CAKE = new Block<>(920, NamespacedKey.parse("minecraft:candle_cake"), () -> new CandleCakeData(22025));

    public static final Block<CandleCakeData> WHITE_CANDLE_CAKE = new Block<>(921, NamespacedKey.parse("minecraft:white_candle_cake"), () -> new CandleCakeData(22027));

    public static final Block<CandleCakeData> ORANGE_CANDLE_CAKE = new Block<>(922, NamespacedKey.parse("minecraft:orange_candle_cake"), () -> new CandleCakeData(22029));

    public static final Block<CandleCakeData> MAGENTA_CANDLE_CAKE = new Block<>(923, NamespacedKey.parse("minecraft:magenta_candle_cake"), () -> new CandleCakeData(22031));

    public static final Block<CandleCakeData> LIGHT_BLUE_CANDLE_CAKE = new Block<>(924, NamespacedKey.parse("minecraft:light_blue_candle_cake"), () -> new CandleCakeData(22033));

    public static final Block<CandleCakeData> YELLOW_CANDLE_CAKE = new Block<>(925, NamespacedKey.parse("minecraft:yellow_candle_cake"), () -> new CandleCakeData(22035));

    public static final Block<CandleCakeData> LIME_CANDLE_CAKE = new Block<>(926, NamespacedKey.parse("minecraft:lime_candle_cake"), () -> new CandleCakeData(22037));

    public static final Block<CandleCakeData> PINK_CANDLE_CAKE = new Block<>(927, NamespacedKey.parse("minecraft:pink_candle_cake"), () -> new CandleCakeData(22039));

    public static final Block<CandleCakeData> GRAY_CANDLE_CAKE = new Block<>(928, NamespacedKey.parse("minecraft:gray_candle_cake"), () -> new CandleCakeData(22041));

    public static final Block<CandleCakeData> LIGHT_GRAY_CANDLE_CAKE = new Block<>(929, NamespacedKey.parse("minecraft:light_gray_candle_cake"), () -> new CandleCakeData(22043));

    public static final Block<CandleCakeData> CYAN_CANDLE_CAKE = new Block<>(930, NamespacedKey.parse("minecraft:cyan_candle_cake"), () -> new CandleCakeData(22045));

    public static final Block<CandleCakeData> PURPLE_CANDLE_CAKE = new Block<>(931, NamespacedKey.parse("minecraft:purple_candle_cake"), () -> new CandleCakeData(22047));

    public static final Block<CandleCakeData> BLUE_CANDLE_CAKE = new Block<>(932, NamespacedKey.parse("minecraft:blue_candle_cake"), () -> new CandleCakeData(22049));

    public static final Block<CandleCakeData> BROWN_CANDLE_CAKE = new Block<>(933, NamespacedKey.parse("minecraft:brown_candle_cake"), () -> new CandleCakeData(22051));

    public static final Block<CandleCakeData> GREEN_CANDLE_CAKE = new Block<>(934, NamespacedKey.parse("minecraft:green_candle_cake"), () -> new CandleCakeData(22053));

    public static final Block<CandleCakeData> RED_CANDLE_CAKE = new Block<>(935, NamespacedKey.parse("minecraft:red_candle_cake"), () -> new CandleCakeData(22055));

    public static final Block<CandleCakeData> BLACK_CANDLE_CAKE = new Block<>(936, NamespacedKey.parse("minecraft:black_candle_cake"), () -> new CandleCakeData(22057));

    public static final Block<BlockData> AMETHYST_BLOCK = new Block<>(937, NamespacedKey.parse("minecraft:amethyst_block"), () -> new BlockData(22059));

    public static final Block<BlockData> BUDDING_AMETHYST = new Block<>(938, NamespacedKey.parse("minecraft:budding_amethyst"), () -> new BlockData(22060));

    public static final Block<AmethystClusterData> AMETHYST_CLUSTER = new Block<>(939, NamespacedKey.parse("minecraft:amethyst_cluster"), () -> new AmethystClusterData(22061));

    public static final Block<AmethystClusterData> LARGE_AMETHYST_BUD = new Block<>(940, NamespacedKey.parse("minecraft:large_amethyst_bud"), () -> new AmethystClusterData(22073));

    public static final Block<AmethystClusterData> MEDIUM_AMETHYST_BUD = new Block<>(941, NamespacedKey.parse("minecraft:medium_amethyst_bud"), () -> new AmethystClusterData(22085));

    public static final Block<AmethystClusterData> SMALL_AMETHYST_BUD = new Block<>(942, NamespacedKey.parse("minecraft:small_amethyst_bud"), () -> new AmethystClusterData(22097));

    public static final Block<BlockData> TUFF = new Block<>(943, NamespacedKey.parse("minecraft:tuff"), () -> new BlockData(22109));

    public static final Block<SlabData> TUFF_SLAB = new Block<>(944, NamespacedKey.parse("minecraft:tuff_slab"), () -> new SlabData(22110));

    public static final Block<StairData> TUFF_STAIRS = new Block<>(945, NamespacedKey.parse("minecraft:tuff_stairs"), () -> new StairData(22116));

    public static final Block<WallData> TUFF_WALL = new Block<>(946, NamespacedKey.parse("minecraft:tuff_wall"), () -> new WallData(22196));

    public static final Block<BlockData> POLISHED_TUFF = new Block<>(947, NamespacedKey.parse("minecraft:polished_tuff"), () -> new BlockData(22520));

    public static final Block<SlabData> POLISHED_TUFF_SLAB = new Block<>(948, NamespacedKey.parse("minecraft:polished_tuff_slab"), () -> new SlabData(22521));

    public static final Block<StairData> POLISHED_TUFF_STAIRS = new Block<>(949, NamespacedKey.parse("minecraft:polished_tuff_stairs"), () -> new StairData(22527));

    public static final Block<WallData> POLISHED_TUFF_WALL = new Block<>(950, NamespacedKey.parse("minecraft:polished_tuff_wall"), () -> new WallData(22607));

    public static final Block<BlockData> CHISELED_TUFF = new Block<>(951, NamespacedKey.parse("minecraft:chiseled_tuff"), () -> new BlockData(22931));

    public static final Block<BlockData> TUFF_BRICKS = new Block<>(952, NamespacedKey.parse("minecraft:tuff_bricks"), () -> new BlockData(22932));

    public static final Block<SlabData> TUFF_BRICK_SLAB = new Block<>(953, NamespacedKey.parse("minecraft:tuff_brick_slab"), () -> new SlabData(22933));

    public static final Block<StairData> TUFF_BRICK_STAIRS = new Block<>(954, NamespacedKey.parse("minecraft:tuff_brick_stairs"), () -> new StairData(22939));

    public static final Block<WallData> TUFF_BRICK_WALL = new Block<>(955, NamespacedKey.parse("minecraft:tuff_brick_wall"), () -> new WallData(23019));

    public static final Block<BlockData> CHISELED_TUFF_BRICKS = new Block<>(956, NamespacedKey.parse("minecraft:chiseled_tuff_bricks"), () -> new BlockData(23343));

    public static final Block<BlockData> CALCITE = new Block<>(957, NamespacedKey.parse("minecraft:calcite"), () -> new BlockData(23344));

    public static final Block<BlockData> TINTED_GLASS = new Block<>(958, NamespacedKey.parse("minecraft:tinted_glass"), () -> new BlockData(23345));

    public static final Block<BlockData> POWDER_SNOW = new Block<>(959, NamespacedKey.parse("minecraft:powder_snow"), () -> new BlockData(23346));

    public static final Block<SculkSensorData> SCULK_SENSOR = new Block<>(960, NamespacedKey.parse("minecraft:sculk_sensor"), () -> new SculkSensorData(23347));

    public static final Block<CalibratedSculkSensorData> CALIBRATED_SCULK_SENSOR = new Block<>(961, NamespacedKey.parse("minecraft:calibrated_sculk_sensor"), () -> new CalibratedSculkSensorData(23443));

    public static final Block<BlockData> SCULK = new Block<>(962, NamespacedKey.parse("minecraft:sculk"), () -> new BlockData(23827));

    public static final Block<SculkVeinData> SCULK_VEIN = new Block<>(963, NamespacedKey.parse("minecraft:sculk_vein"), () -> new SculkVeinData(23828));

    public static final Block<SculkCatalystData> SCULK_CATALYST = new Block<>(964, NamespacedKey.parse("minecraft:sculk_catalyst"), () -> new SculkCatalystData(23956));

    public static final Block<SculkShriekerData> SCULK_SHRIEKER = new Block<>(965, NamespacedKey.parse("minecraft:sculk_shrieker"), () -> new SculkShriekerData(23958));

    public static final Block<BlockData> COPPER_BLOCK = new Block<>(966, NamespacedKey.parse("minecraft:copper_block"), () -> new BlockData(23966));

    public static final Block<BlockData> EXPOSED_COPPER = new Block<>(967, NamespacedKey.parse("minecraft:exposed_copper"), () -> new BlockData(23967));

    public static final Block<BlockData> WEATHERED_COPPER = new Block<>(968, NamespacedKey.parse("minecraft:weathered_copper"), () -> new BlockData(23968));

    public static final Block<BlockData> OXIDIZED_COPPER = new Block<>(969, NamespacedKey.parse("minecraft:oxidized_copper"), () -> new BlockData(23969));

    public static final Block<BlockData> COPPER_ORE = new Block<>(970, NamespacedKey.parse("minecraft:copper_ore"), () -> new BlockData(23970));

    public static final Block<BlockData> DEEPSLATE_COPPER_ORE = new Block<>(971, NamespacedKey.parse("minecraft:deepslate_copper_ore"), () -> new BlockData(23971));

    public static final Block<BlockData> OXIDIZED_CUT_COPPER = new Block<>(972, NamespacedKey.parse("minecraft:oxidized_cut_copper"), () -> new BlockData(23972));

    public static final Block<BlockData> WEATHERED_CUT_COPPER = new Block<>(973, NamespacedKey.parse("minecraft:weathered_cut_copper"), () -> new BlockData(23973));

    public static final Block<BlockData> EXPOSED_CUT_COPPER = new Block<>(974, NamespacedKey.parse("minecraft:exposed_cut_copper"), () -> new BlockData(23974));

    public static final Block<BlockData> CUT_COPPER = new Block<>(975, NamespacedKey.parse("minecraft:cut_copper"), () -> new BlockData(23975));

    public static final Block<BlockData> OXIDIZED_CHISELED_COPPER = new Block<>(976, NamespacedKey.parse("minecraft:oxidized_chiseled_copper"), () -> new BlockData(23976));

    public static final Block<BlockData> WEATHERED_CHISELED_COPPER = new Block<>(977, NamespacedKey.parse("minecraft:weathered_chiseled_copper"), () -> new BlockData(23977));

    public static final Block<BlockData> EXPOSED_CHISELED_COPPER = new Block<>(978, NamespacedKey.parse("minecraft:exposed_chiseled_copper"), () -> new BlockData(23978));

    public static final Block<BlockData> CHISELED_COPPER = new Block<>(979, NamespacedKey.parse("minecraft:chiseled_copper"), () -> new BlockData(23979));

    public static final Block<BlockData> WAXED_OXIDIZED_CHISELED_COPPER = new Block<>(980, NamespacedKey.parse("minecraft:waxed_oxidized_chiseled_copper"), () -> new BlockData(23980));

    public static final Block<BlockData> WAXED_WEATHERED_CHISELED_COPPER = new Block<>(981, NamespacedKey.parse("minecraft:waxed_weathered_chiseled_copper"), () -> new BlockData(23981));

    public static final Block<BlockData> WAXED_EXPOSED_CHISELED_COPPER = new Block<>(982, NamespacedKey.parse("minecraft:waxed_exposed_chiseled_copper"), () -> new BlockData(23982));

    public static final Block<BlockData> WAXED_CHISELED_COPPER = new Block<>(983, NamespacedKey.parse("minecraft:waxed_chiseled_copper"), () -> new BlockData(23983));

    public static final Block<WeatheringCopperStairData> OXIDIZED_CUT_COPPER_STAIRS = new Block<>(984, NamespacedKey.parse("minecraft:oxidized_cut_copper_stairs"), () -> new WeatheringCopperStairData(23984));

    public static final Block<WeatheringCopperStairData> WEATHERED_CUT_COPPER_STAIRS = new Block<>(985, NamespacedKey.parse("minecraft:weathered_cut_copper_stairs"), () -> new WeatheringCopperStairData(24064));

    public static final Block<WeatheringCopperStairData> EXPOSED_CUT_COPPER_STAIRS = new Block<>(986, NamespacedKey.parse("minecraft:exposed_cut_copper_stairs"), () -> new WeatheringCopperStairData(24144));

    public static final Block<WeatheringCopperStairData> CUT_COPPER_STAIRS = new Block<>(987, NamespacedKey.parse("minecraft:cut_copper_stairs"), () -> new WeatheringCopperStairData(24224));

    public static final Block<WeatheringCopperSlabData> OXIDIZED_CUT_COPPER_SLAB = new Block<>(988, NamespacedKey.parse("minecraft:oxidized_cut_copper_slab"), () -> new WeatheringCopperSlabData(24304));

    public static final Block<WeatheringCopperSlabData> WEATHERED_CUT_COPPER_SLAB = new Block<>(989, NamespacedKey.parse("minecraft:weathered_cut_copper_slab"), () -> new WeatheringCopperSlabData(24310));

    public static final Block<WeatheringCopperSlabData> EXPOSED_CUT_COPPER_SLAB = new Block<>(990, NamespacedKey.parse("minecraft:exposed_cut_copper_slab"), () -> new WeatheringCopperSlabData(24316));

    public static final Block<WeatheringCopperSlabData> CUT_COPPER_SLAB = new Block<>(991, NamespacedKey.parse("minecraft:cut_copper_slab"), () -> new WeatheringCopperSlabData(24322));

    public static final Block<BlockData> WAXED_COPPER_BLOCK = new Block<>(992, NamespacedKey.parse("minecraft:waxed_copper_block"), () -> new BlockData(24328));

    public static final Block<BlockData> WAXED_WEATHERED_COPPER = new Block<>(993, NamespacedKey.parse("minecraft:waxed_weathered_copper"), () -> new BlockData(24329));

    public static final Block<BlockData> WAXED_EXPOSED_COPPER = new Block<>(994, NamespacedKey.parse("minecraft:waxed_exposed_copper"), () -> new BlockData(24330));

    public static final Block<BlockData> WAXED_OXIDIZED_COPPER = new Block<>(995, NamespacedKey.parse("minecraft:waxed_oxidized_copper"), () -> new BlockData(24331));

    public static final Block<BlockData> WAXED_OXIDIZED_CUT_COPPER = new Block<>(996, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper"), () -> new BlockData(24332));

    public static final Block<BlockData> WAXED_WEATHERED_CUT_COPPER = new Block<>(997, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper"), () -> new BlockData(24333));

    public static final Block<BlockData> WAXED_EXPOSED_CUT_COPPER = new Block<>(998, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper"), () -> new BlockData(24334));

    public static final Block<BlockData> WAXED_CUT_COPPER = new Block<>(999, NamespacedKey.parse("minecraft:waxed_cut_copper"), () -> new BlockData(24335));

    public static final Block<StairData> WAXED_OXIDIZED_CUT_COPPER_STAIRS = new Block<>(1000, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_stairs"), () -> new StairData(24336));

    public static final Block<StairData> WAXED_WEATHERED_CUT_COPPER_STAIRS = new Block<>(1001, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_stairs"), () -> new StairData(24416));

    public static final Block<StairData> WAXED_EXPOSED_CUT_COPPER_STAIRS = new Block<>(1002, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_stairs"), () -> new StairData(24496));

    public static final Block<StairData> WAXED_CUT_COPPER_STAIRS = new Block<>(1003, NamespacedKey.parse("minecraft:waxed_cut_copper_stairs"), () -> new StairData(24576));

    public static final Block<SlabData> WAXED_OXIDIZED_CUT_COPPER_SLAB = new Block<>(1004, NamespacedKey.parse("minecraft:waxed_oxidized_cut_copper_slab"), () -> new SlabData(24656));

    public static final Block<SlabData> WAXED_WEATHERED_CUT_COPPER_SLAB = new Block<>(1005, NamespacedKey.parse("minecraft:waxed_weathered_cut_copper_slab"), () -> new SlabData(24662));

    public static final Block<SlabData> WAXED_EXPOSED_CUT_COPPER_SLAB = new Block<>(1006, NamespacedKey.parse("minecraft:waxed_exposed_cut_copper_slab"), () -> new SlabData(24668));

    public static final Block<SlabData> WAXED_CUT_COPPER_SLAB = new Block<>(1007, NamespacedKey.parse("minecraft:waxed_cut_copper_slab"), () -> new SlabData(24674));

    public static final Block<WeatheringCopperDoorData> COPPER_DOOR = new Block<>(1008, NamespacedKey.parse("minecraft:copper_door"), () -> new WeatheringCopperDoorData(24680));

    public static final Block<WeatheringCopperDoorData> EXPOSED_COPPER_DOOR = new Block<>(1009, NamespacedKey.parse("minecraft:exposed_copper_door"), () -> new WeatheringCopperDoorData(24744));

    public static final Block<WeatheringCopperDoorData> OXIDIZED_COPPER_DOOR = new Block<>(1010, NamespacedKey.parse("minecraft:oxidized_copper_door"), () -> new WeatheringCopperDoorData(24808));

    public static final Block<WeatheringCopperDoorData> WEATHERED_COPPER_DOOR = new Block<>(1011, NamespacedKey.parse("minecraft:weathered_copper_door"), () -> new WeatheringCopperDoorData(24872));

    public static final Block<DoorData> WAXED_COPPER_DOOR = new Block<>(1012, NamespacedKey.parse("minecraft:waxed_copper_door"), () -> new DoorData(24936));

    public static final Block<DoorData> WAXED_EXPOSED_COPPER_DOOR = new Block<>(1013, NamespacedKey.parse("minecraft:waxed_exposed_copper_door"), () -> new DoorData(25000));

    public static final Block<DoorData> WAXED_OXIDIZED_COPPER_DOOR = new Block<>(1014, NamespacedKey.parse("minecraft:waxed_oxidized_copper_door"), () -> new DoorData(25064));

    public static final Block<DoorData> WAXED_WEATHERED_COPPER_DOOR = new Block<>(1015, NamespacedKey.parse("minecraft:waxed_weathered_copper_door"), () -> new DoorData(25128));

    public static final Block<WeatheringCopperTrapDoorData> COPPER_TRAPDOOR = new Block<>(1016, NamespacedKey.parse("minecraft:copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25192));

    public static final Block<WeatheringCopperTrapDoorData> EXPOSED_COPPER_TRAPDOOR = new Block<>(1017, NamespacedKey.parse("minecraft:exposed_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25256));

    public static final Block<WeatheringCopperTrapDoorData> OXIDIZED_COPPER_TRAPDOOR = new Block<>(1018, NamespacedKey.parse("minecraft:oxidized_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25320));

    public static final Block<WeatheringCopperTrapDoorData> WEATHERED_COPPER_TRAPDOOR = new Block<>(1019, NamespacedKey.parse("minecraft:weathered_copper_trapdoor"), () -> new WeatheringCopperTrapDoorData(25384));

    public static final Block<TrapdoorData> WAXED_COPPER_TRAPDOOR = new Block<>(1020, NamespacedKey.parse("minecraft:waxed_copper_trapdoor"), () -> new TrapdoorData(25448));

    public static final Block<TrapdoorData> WAXED_EXPOSED_COPPER_TRAPDOOR = new Block<>(1021, NamespacedKey.parse("minecraft:waxed_exposed_copper_trapdoor"), () -> new TrapdoorData(25512));

    public static final Block<TrapdoorData> WAXED_OXIDIZED_COPPER_TRAPDOOR = new Block<>(1022, NamespacedKey.parse("minecraft:waxed_oxidized_copper_trapdoor"), () -> new TrapdoorData(25576));

    public static final Block<TrapdoorData> WAXED_WEATHERED_COPPER_TRAPDOOR = new Block<>(1023, NamespacedKey.parse("minecraft:waxed_weathered_copper_trapdoor"), () -> new TrapdoorData(25640));

    public static final Block<WeatheringCopperGrateData> COPPER_GRATE = new Block<>(1024, NamespacedKey.parse("minecraft:copper_grate"), () -> new WeatheringCopperGrateData(25704));

    public static final Block<WeatheringCopperGrateData> EXPOSED_COPPER_GRATE = new Block<>(1025, NamespacedKey.parse("minecraft:exposed_copper_grate"), () -> new WeatheringCopperGrateData(25706));

    public static final Block<WeatheringCopperGrateData> WEATHERED_COPPER_GRATE = new Block<>(1026, NamespacedKey.parse("minecraft:weathered_copper_grate"), () -> new WeatheringCopperGrateData(25708));

    public static final Block<WeatheringCopperGrateData> OXIDIZED_COPPER_GRATE = new Block<>(1027, NamespacedKey.parse("minecraft:oxidized_copper_grate"), () -> new WeatheringCopperGrateData(25710));

    public static final Block<WaterloggedTransparentData> WAXED_COPPER_GRATE = new Block<>(1028, NamespacedKey.parse("minecraft:waxed_copper_grate"), () -> new WaterloggedTransparentData(25712));

    public static final Block<WaterloggedTransparentData> WAXED_EXPOSED_COPPER_GRATE = new Block<>(1029, NamespacedKey.parse("minecraft:waxed_exposed_copper_grate"), () -> new WaterloggedTransparentData(25714));

    public static final Block<WaterloggedTransparentData> WAXED_WEATHERED_COPPER_GRATE = new Block<>(1030, NamespacedKey.parse("minecraft:waxed_weathered_copper_grate"), () -> new WaterloggedTransparentData(25716));

    public static final Block<WaterloggedTransparentData> WAXED_OXIDIZED_COPPER_GRATE = new Block<>(1031, NamespacedKey.parse("minecraft:waxed_oxidized_copper_grate"), () -> new WaterloggedTransparentData(25718));

    public static final Block<WeatheringCopperBulbData> COPPER_BULB = new Block<>(1032, NamespacedKey.parse("minecraft:copper_bulb"), () -> new WeatheringCopperBulbData(25720));

    public static final Block<WeatheringCopperBulbData> EXPOSED_COPPER_BULB = new Block<>(1033, NamespacedKey.parse("minecraft:exposed_copper_bulb"), () -> new WeatheringCopperBulbData(25724));

    public static final Block<WeatheringCopperBulbData> WEATHERED_COPPER_BULB = new Block<>(1034, NamespacedKey.parse("minecraft:weathered_copper_bulb"), () -> new WeatheringCopperBulbData(25728));

    public static final Block<WeatheringCopperBulbData> OXIDIZED_COPPER_BULB = new Block<>(1035, NamespacedKey.parse("minecraft:oxidized_copper_bulb"), () -> new WeatheringCopperBulbData(25732));

    public static final Block<CopperBulbBlockData> WAXED_COPPER_BULB = new Block<>(1036, NamespacedKey.parse("minecraft:waxed_copper_bulb"), () -> new CopperBulbBlockData(25736));

    public static final Block<CopperBulbBlockData> WAXED_EXPOSED_COPPER_BULB = new Block<>(1037, NamespacedKey.parse("minecraft:waxed_exposed_copper_bulb"), () -> new CopperBulbBlockData(25740));

    public static final Block<CopperBulbBlockData> WAXED_WEATHERED_COPPER_BULB = new Block<>(1038, NamespacedKey.parse("minecraft:waxed_weathered_copper_bulb"), () -> new CopperBulbBlockData(25744));

    public static final Block<CopperBulbBlockData> WAXED_OXIDIZED_COPPER_BULB = new Block<>(1039, NamespacedKey.parse("minecraft:waxed_oxidized_copper_bulb"), () -> new CopperBulbBlockData(25748));

    public static final Block<LightningRodData> LIGHTNING_ROD = new Block<>(1040, NamespacedKey.parse("minecraft:lightning_rod"), () -> new LightningRodData(25752));

    public static final Block<PointedDripstoneData> POINTED_DRIPSTONE = new Block<>(1041, NamespacedKey.parse("minecraft:pointed_dripstone"), () -> new PointedDripstoneData(25776));

    public static final Block<BlockData> DRIPSTONE_BLOCK = new Block<>(1042, NamespacedKey.parse("minecraft:dripstone_block"), () -> new BlockData(25796));

    public static final Block<CaveVinesData> CAVE_VINES = new Block<>(1043, NamespacedKey.parse("minecraft:cave_vines"), () -> new CaveVinesData(25797));

    public static final Block<CaveVinesPlantData> CAVE_VINES_PLANT = new Block<>(1044, NamespacedKey.parse("minecraft:cave_vines_plant"), () -> new CaveVinesPlantData(25849));

    public static final Block<BlockData> SPORE_BLOSSOM = new Block<>(1045, NamespacedKey.parse("minecraft:spore_blossom"), () -> new BlockData(25851));

    public static final Block<BlockData> AZALEA = new Block<>(1046, NamespacedKey.parse("minecraft:azalea"), () -> new BlockData(25852));

    public static final Block<BlockData> FLOWERING_AZALEA = new Block<>(1047, NamespacedKey.parse("minecraft:flowering_azalea"), () -> new BlockData(25853));

    public static final Block<BlockData> MOSS_CARPET = new Block<>(1048, NamespacedKey.parse("minecraft:moss_carpet"), () -> new BlockData(25854));

    public static final Block<FlowerBedData> PINK_PETALS = new Block<>(1049, NamespacedKey.parse("minecraft:pink_petals"), () -> new FlowerBedData(25855));

    public static final Block<FlowerBedData> WILDFLOWERS = new Block<>(1050, NamespacedKey.parse("minecraft:wildflowers"), () -> new FlowerBedData(25871));

    public static final Block<LeafLitterData> LEAF_LITTER = new Block<>(1051, NamespacedKey.parse("minecraft:leaf_litter"), () -> new LeafLitterData(25887));

    public static final Block<BlockData> MOSS_BLOCK = new Block<>(1052, NamespacedKey.parse("minecraft:moss_block"), () -> new BlockData(25903));

    public static final Block<BigDripleafData> BIG_DRIPLEAF = new Block<>(1053, NamespacedKey.parse("minecraft:big_dripleaf"), () -> new BigDripleafData(25904));

    public static final Block<BigDripleafStemData> BIG_DRIPLEAF_STEM = new Block<>(1054, NamespacedKey.parse("minecraft:big_dripleaf_stem"), () -> new BigDripleafStemData(25936));

    public static final Block<SmallDripleafData> SMALL_DRIPLEAF = new Block<>(1055, NamespacedKey.parse("minecraft:small_dripleaf"), () -> new SmallDripleafData(25944));

    public static final Block<HangingRootsData> HANGING_ROOTS = new Block<>(1056, NamespacedKey.parse("minecraft:hanging_roots"), () -> new HangingRootsData(25960));

    public static final Block<BlockData> ROOTED_DIRT = new Block<>(1057, NamespacedKey.parse("minecraft:rooted_dirt"), () -> new BlockData(25962));

    public static final Block<BlockData> MUD = new Block<>(1058, NamespacedKey.parse("minecraft:mud"), () -> new BlockData(25963));

    public static final Block<RotatedPillarData> DEEPSLATE = new Block<>(1059, NamespacedKey.parse("minecraft:deepslate"), () -> new RotatedPillarData(25964));

    public static final Block<BlockData> COBBLED_DEEPSLATE = new Block<>(1060, NamespacedKey.parse("minecraft:cobbled_deepslate"), () -> new BlockData(25967));

    public static final Block<StairData> COBBLED_DEEPSLATE_STAIRS = new Block<>(1061, NamespacedKey.parse("minecraft:cobbled_deepslate_stairs"), () -> new StairData(25968));

    public static final Block<SlabData> COBBLED_DEEPSLATE_SLAB = new Block<>(1062, NamespacedKey.parse("minecraft:cobbled_deepslate_slab"), () -> new SlabData(26048));

    public static final Block<WallData> COBBLED_DEEPSLATE_WALL = new Block<>(1063, NamespacedKey.parse("minecraft:cobbled_deepslate_wall"), () -> new WallData(26054));

    public static final Block<BlockData> POLISHED_DEEPSLATE = new Block<>(1064, NamespacedKey.parse("minecraft:polished_deepslate"), () -> new BlockData(26378));

    public static final Block<StairData> POLISHED_DEEPSLATE_STAIRS = new Block<>(1065, NamespacedKey.parse("minecraft:polished_deepslate_stairs"), () -> new StairData(26379));

    public static final Block<SlabData> POLISHED_DEEPSLATE_SLAB = new Block<>(1066, NamespacedKey.parse("minecraft:polished_deepslate_slab"), () -> new SlabData(26459));

    public static final Block<WallData> POLISHED_DEEPSLATE_WALL = new Block<>(1067, NamespacedKey.parse("minecraft:polished_deepslate_wall"), () -> new WallData(26465));

    public static final Block<BlockData> DEEPSLATE_TILES = new Block<>(1068, NamespacedKey.parse("minecraft:deepslate_tiles"), () -> new BlockData(26789));

    public static final Block<StairData> DEEPSLATE_TILE_STAIRS = new Block<>(1069, NamespacedKey.parse("minecraft:deepslate_tile_stairs"), () -> new StairData(26790));

    public static final Block<SlabData> DEEPSLATE_TILE_SLAB = new Block<>(1070, NamespacedKey.parse("minecraft:deepslate_tile_slab"), () -> new SlabData(26870));

    public static final Block<WallData> DEEPSLATE_TILE_WALL = new Block<>(1071, NamespacedKey.parse("minecraft:deepslate_tile_wall"), () -> new WallData(26876));

    public static final Block<BlockData> DEEPSLATE_BRICKS = new Block<>(1072, NamespacedKey.parse("minecraft:deepslate_bricks"), () -> new BlockData(27200));

    public static final Block<StairData> DEEPSLATE_BRICK_STAIRS = new Block<>(1073, NamespacedKey.parse("minecraft:deepslate_brick_stairs"), () -> new StairData(27201));

    public static final Block<SlabData> DEEPSLATE_BRICK_SLAB = new Block<>(1074, NamespacedKey.parse("minecraft:deepslate_brick_slab"), () -> new SlabData(27281));

    public static final Block<WallData> DEEPSLATE_BRICK_WALL = new Block<>(1075, NamespacedKey.parse("minecraft:deepslate_brick_wall"), () -> new WallData(27287));

    public static final Block<BlockData> CHISELED_DEEPSLATE = new Block<>(1076, NamespacedKey.parse("minecraft:chiseled_deepslate"), () -> new BlockData(27611));

    public static final Block<BlockData> CRACKED_DEEPSLATE_BRICKS = new Block<>(1077, NamespacedKey.parse("minecraft:cracked_deepslate_bricks"), () -> new BlockData(27612));

    public static final Block<BlockData> CRACKED_DEEPSLATE_TILES = new Block<>(1078, NamespacedKey.parse("minecraft:cracked_deepslate_tiles"), () -> new BlockData(27613));

    public static final Block<InfestedRotatedPillarData> INFESTED_DEEPSLATE = new Block<>(1079, NamespacedKey.parse("minecraft:infested_deepslate"), () -> new InfestedRotatedPillarData(27614));

    public static final Block<BlockData> SMOOTH_BASALT = new Block<>(1080, NamespacedKey.parse("minecraft:smooth_basalt"), () -> new BlockData(27617));

    public static final Block<BlockData> RAW_IRON_BLOCK = new Block<>(1081, NamespacedKey.parse("minecraft:raw_iron_block"), () -> new BlockData(27618));

    public static final Block<BlockData> RAW_COPPER_BLOCK = new Block<>(1082, NamespacedKey.parse("minecraft:raw_copper_block"), () -> new BlockData(27619));

    public static final Block<BlockData> RAW_GOLD_BLOCK = new Block<>(1083, NamespacedKey.parse("minecraft:raw_gold_block"), () -> new BlockData(27620));

    public static final Block<BlockData> POTTED_AZALEA_BUSH = new Block<>(1084, NamespacedKey.parse("minecraft:potted_azalea_bush"), () -> new BlockData(27621));

    public static final Block<BlockData> POTTED_FLOWERING_AZALEA_BUSH = new Block<>(1085, NamespacedKey.parse("minecraft:potted_flowering_azalea_bush"), () -> new BlockData(27622));

    public static final Block<RotatedPillarData> OCHRE_FROGLIGHT = new Block<>(1086, NamespacedKey.parse("minecraft:ochre_froglight"), () -> new RotatedPillarData(27623));

    public static final Block<RotatedPillarData> VERDANT_FROGLIGHT = new Block<>(1087, NamespacedKey.parse("minecraft:verdant_froglight"), () -> new RotatedPillarData(27626));

    public static final Block<RotatedPillarData> PEARLESCENT_FROGLIGHT = new Block<>(1088, NamespacedKey.parse("minecraft:pearlescent_froglight"), () -> new RotatedPillarData(27629));

    public static final Block<BlockData> FROGSPAWN = new Block<>(1089, NamespacedKey.parse("minecraft:frogspawn"), () -> new BlockData(27632));

    public static final Block<BlockData> REINFORCED_DEEPSLATE = new Block<>(1090, NamespacedKey.parse("minecraft:reinforced_deepslate"), () -> new BlockData(27633));

    public static final Block<DecoratedPotData> DECORATED_POT = new Block<>(1091, NamespacedKey.parse("minecraft:decorated_pot"), () -> new DecoratedPotData(27634));

    public static final Block<CrafterData> CRAFTER = new Block<>(1092, NamespacedKey.parse("minecraft:crafter"), () -> new CrafterData(27650));

    public static final Block<TrialSpawnerData> TRIAL_SPAWNER = new Block<>(1093, NamespacedKey.parse("minecraft:trial_spawner"), () -> new TrialSpawnerData(27698));

    public static final Block<VaultData> VAULT = new Block<>(1094, NamespacedKey.parse("minecraft:vault"), () -> new VaultData(27710));

    public static final Block<HeavyCoreData> HEAVY_CORE = new Block<>(1095, NamespacedKey.parse("minecraft:heavy_core"), () -> new HeavyCoreData(27742));

    public static final Block<BlockData> PALE_MOSS_BLOCK = new Block<>(1096, NamespacedKey.parse("minecraft:pale_moss_block"), () -> new BlockData(27744));

    public static final Block<MossyCarpetData> PALE_MOSS_CARPET = new Block<>(1097, NamespacedKey.parse("minecraft:pale_moss_carpet"), () -> new MossyCarpetData(27745));

    public static final Block<HangingMossData> PALE_HANGING_MOSS = new Block<>(1098, NamespacedKey.parse("minecraft:pale_hanging_moss"), () -> new HangingMossData(27907));

    public static final Block<BlockData> OPEN_EYEBLOSSOM = new Block<>(1099, NamespacedKey.parse("minecraft:open_eyeblossom"), () -> new BlockData(27909));

    public static final Block<BlockData> CLOSED_EYEBLOSSOM = new Block<>(1100, NamespacedKey.parse("minecraft:closed_eyeblossom"), () -> new BlockData(27910));

    public static final Block<BlockData> POTTED_OPEN_EYEBLOSSOM = new Block<>(1101, NamespacedKey.parse("minecraft:potted_open_eyeblossom"), () -> new BlockData(27911));

    public static final Block<BlockData> POTTED_CLOSED_EYEBLOSSOM = new Block<>(1102, NamespacedKey.parse("minecraft:potted_closed_eyeblossom"), () -> new BlockData(27912));

    public static final Block<BlockData> FIREFLY_BUSH = new Block<>(1103, NamespacedKey.parse("minecraft:firefly_bush"), () -> new BlockData(27913));

    public static BuiltInRegistry<Block<?>> createDefaultRegistry(Server server) {
        return new BuiltInRegistry<>(server, RegistryKey.BLOCKS).modify(modifiable -> {
            modifiable.register(AIR.key(), AIR);
            modifiable.register(STONE.key(), STONE);
            modifiable.register(GRANITE.key(), GRANITE);
            modifiable.register(POLISHED_GRANITE.key(), POLISHED_GRANITE);
            modifiable.register(DIORITE.key(), DIORITE);
            modifiable.register(POLISHED_DIORITE.key(), POLISHED_DIORITE);
            modifiable.register(ANDESITE.key(), ANDESITE);
            modifiable.register(POLISHED_ANDESITE.key(), POLISHED_ANDESITE);
            modifiable.register(GRASS_BLOCK.key(), GRASS_BLOCK);
            modifiable.register(DIRT.key(), DIRT);
            modifiable.register(COARSE_DIRT.key(), COARSE_DIRT);
            modifiable.register(PODZOL.key(), PODZOL);
            modifiable.register(COBBLESTONE.key(), COBBLESTONE);
            modifiable.register(OAK_PLANKS.key(), OAK_PLANKS);
            modifiable.register(SPRUCE_PLANKS.key(), SPRUCE_PLANKS);
            modifiable.register(BIRCH_PLANKS.key(), BIRCH_PLANKS);
            modifiable.register(JUNGLE_PLANKS.key(), JUNGLE_PLANKS);
            modifiable.register(ACACIA_PLANKS.key(), ACACIA_PLANKS);
            modifiable.register(CHERRY_PLANKS.key(), CHERRY_PLANKS);
            modifiable.register(DARK_OAK_PLANKS.key(), DARK_OAK_PLANKS);
            modifiable.register(PALE_OAK_WOOD.key(), PALE_OAK_WOOD);
            modifiable.register(PALE_OAK_PLANKS.key(), PALE_OAK_PLANKS);
            modifiable.register(MANGROVE_PLANKS.key(), MANGROVE_PLANKS);
            modifiable.register(BAMBOO_PLANKS.key(), BAMBOO_PLANKS);
            modifiable.register(BAMBOO_MOSAIC.key(), BAMBOO_MOSAIC);
            modifiable.register(OAK_SAPLING.key(), OAK_SAPLING);
            modifiable.register(SPRUCE_SAPLING.key(), SPRUCE_SAPLING);
            modifiable.register(BIRCH_SAPLING.key(), BIRCH_SAPLING);
            modifiable.register(JUNGLE_SAPLING.key(), JUNGLE_SAPLING);
            modifiable.register(ACACIA_SAPLING.key(), ACACIA_SAPLING);
            modifiable.register(CHERRY_SAPLING.key(), CHERRY_SAPLING);
            modifiable.register(DARK_OAK_SAPLING.key(), DARK_OAK_SAPLING);
            modifiable.register(PALE_OAK_SAPLING.key(), PALE_OAK_SAPLING);
            modifiable.register(MANGROVE_PROPAGULE.key(), MANGROVE_PROPAGULE);
            modifiable.register(BEDROCK.key(), BEDROCK);
            modifiable.register(WATER.key(), WATER);
            modifiable.register(LAVA.key(), LAVA);
            modifiable.register(SAND.key(), SAND);
            modifiable.register(SUSPICIOUS_SAND.key(), SUSPICIOUS_SAND);
            modifiable.register(RED_SAND.key(), RED_SAND);
            modifiable.register(GRAVEL.key(), GRAVEL);
            modifiable.register(SUSPICIOUS_GRAVEL.key(), SUSPICIOUS_GRAVEL);
            modifiable.register(GOLD_ORE.key(), GOLD_ORE);
            modifiable.register(DEEPSLATE_GOLD_ORE.key(), DEEPSLATE_GOLD_ORE);
            modifiable.register(IRON_ORE.key(), IRON_ORE);
            modifiable.register(DEEPSLATE_IRON_ORE.key(), DEEPSLATE_IRON_ORE);
            modifiable.register(COAL_ORE.key(), COAL_ORE);
            modifiable.register(DEEPSLATE_COAL_ORE.key(), DEEPSLATE_COAL_ORE);
            modifiable.register(NETHER_GOLD_ORE.key(), NETHER_GOLD_ORE);
            modifiable.register(OAK_LOG.key(), OAK_LOG);
            modifiable.register(SPRUCE_LOG.key(), SPRUCE_LOG);
            modifiable.register(BIRCH_LOG.key(), BIRCH_LOG);
            modifiable.register(JUNGLE_LOG.key(), JUNGLE_LOG);
            modifiable.register(ACACIA_LOG.key(), ACACIA_LOG);
            modifiable.register(CHERRY_LOG.key(), CHERRY_LOG);
            modifiable.register(DARK_OAK_LOG.key(), DARK_OAK_LOG);
            modifiable.register(PALE_OAK_LOG.key(), PALE_OAK_LOG);
            modifiable.register(MANGROVE_LOG.key(), MANGROVE_LOG);
            modifiable.register(MANGROVE_ROOTS.key(), MANGROVE_ROOTS);
            modifiable.register(MUDDY_MANGROVE_ROOTS.key(), MUDDY_MANGROVE_ROOTS);
            modifiable.register(BAMBOO_BLOCK.key(), BAMBOO_BLOCK);
            modifiable.register(STRIPPED_SPRUCE_LOG.key(), STRIPPED_SPRUCE_LOG);
            modifiable.register(STRIPPED_BIRCH_LOG.key(), STRIPPED_BIRCH_LOG);
            modifiable.register(STRIPPED_JUNGLE_LOG.key(), STRIPPED_JUNGLE_LOG);
            modifiable.register(STRIPPED_ACACIA_LOG.key(), STRIPPED_ACACIA_LOG);
            modifiable.register(STRIPPED_CHERRY_LOG.key(), STRIPPED_CHERRY_LOG);
            modifiable.register(STRIPPED_DARK_OAK_LOG.key(), STRIPPED_DARK_OAK_LOG);
            modifiable.register(STRIPPED_PALE_OAK_LOG.key(), STRIPPED_PALE_OAK_LOG);
            modifiable.register(STRIPPED_OAK_LOG.key(), STRIPPED_OAK_LOG);
            modifiable.register(STRIPPED_MANGROVE_LOG.key(), STRIPPED_MANGROVE_LOG);
            modifiable.register(STRIPPED_BAMBOO_BLOCK.key(), STRIPPED_BAMBOO_BLOCK);
            modifiable.register(OAK_WOOD.key(), OAK_WOOD);
            modifiable.register(SPRUCE_WOOD.key(), SPRUCE_WOOD);
            modifiable.register(BIRCH_WOOD.key(), BIRCH_WOOD);
            modifiable.register(JUNGLE_WOOD.key(), JUNGLE_WOOD);
            modifiable.register(ACACIA_WOOD.key(), ACACIA_WOOD);
            modifiable.register(CHERRY_WOOD.key(), CHERRY_WOOD);
            modifiable.register(DARK_OAK_WOOD.key(), DARK_OAK_WOOD);
            modifiable.register(MANGROVE_WOOD.key(), MANGROVE_WOOD);
            modifiable.register(STRIPPED_OAK_WOOD.key(), STRIPPED_OAK_WOOD);
            modifiable.register(STRIPPED_SPRUCE_WOOD.key(), STRIPPED_SPRUCE_WOOD);
            modifiable.register(STRIPPED_BIRCH_WOOD.key(), STRIPPED_BIRCH_WOOD);
            modifiable.register(STRIPPED_JUNGLE_WOOD.key(), STRIPPED_JUNGLE_WOOD);
            modifiable.register(STRIPPED_ACACIA_WOOD.key(), STRIPPED_ACACIA_WOOD);
            modifiable.register(STRIPPED_CHERRY_WOOD.key(), STRIPPED_CHERRY_WOOD);
            modifiable.register(STRIPPED_DARK_OAK_WOOD.key(), STRIPPED_DARK_OAK_WOOD);
            modifiable.register(STRIPPED_PALE_OAK_WOOD.key(), STRIPPED_PALE_OAK_WOOD);
            modifiable.register(STRIPPED_MANGROVE_WOOD.key(), STRIPPED_MANGROVE_WOOD);
            modifiable.register(OAK_LEAVES.key(), OAK_LEAVES);
            modifiable.register(SPRUCE_LEAVES.key(), SPRUCE_LEAVES);
            modifiable.register(BIRCH_LEAVES.key(), BIRCH_LEAVES);
            modifiable.register(JUNGLE_LEAVES.key(), JUNGLE_LEAVES);
            modifiable.register(ACACIA_LEAVES.key(), ACACIA_LEAVES);
            modifiable.register(CHERRY_LEAVES.key(), CHERRY_LEAVES);
            modifiable.register(DARK_OAK_LEAVES.key(), DARK_OAK_LEAVES);
            modifiable.register(PALE_OAK_LEAVES.key(), PALE_OAK_LEAVES);
            modifiable.register(MANGROVE_LEAVES.key(), MANGROVE_LEAVES);
            modifiable.register(AZALEA_LEAVES.key(), AZALEA_LEAVES);
            modifiable.register(FLOWERING_AZALEA_LEAVES.key(), FLOWERING_AZALEA_LEAVES);
            modifiable.register(SPONGE.key(), SPONGE);
            modifiable.register(WET_SPONGE.key(), WET_SPONGE);
            modifiable.register(GLASS.key(), GLASS);
            modifiable.register(LAPIS_ORE.key(), LAPIS_ORE);
            modifiable.register(DEEPSLATE_LAPIS_ORE.key(), DEEPSLATE_LAPIS_ORE);
            modifiable.register(LAPIS_BLOCK.key(), LAPIS_BLOCK);
            modifiable.register(DISPENSER.key(), DISPENSER);
            modifiable.register(SANDSTONE.key(), SANDSTONE);
            modifiable.register(CHISELED_SANDSTONE.key(), CHISELED_SANDSTONE);
            modifiable.register(CUT_SANDSTONE.key(), CUT_SANDSTONE);
            modifiable.register(NOTE_BLOCK.key(), NOTE_BLOCK);
            modifiable.register(WHITE_BED.key(), WHITE_BED);
            modifiable.register(ORANGE_BED.key(), ORANGE_BED);
            modifiable.register(MAGENTA_BED.key(), MAGENTA_BED);
            modifiable.register(LIGHT_BLUE_BED.key(), LIGHT_BLUE_BED);
            modifiable.register(YELLOW_BED.key(), YELLOW_BED);
            modifiable.register(LIME_BED.key(), LIME_BED);
            modifiable.register(PINK_BED.key(), PINK_BED);
            modifiable.register(GRAY_BED.key(), GRAY_BED);
            modifiable.register(LIGHT_GRAY_BED.key(), LIGHT_GRAY_BED);
            modifiable.register(CYAN_BED.key(), CYAN_BED);
            modifiable.register(PURPLE_BED.key(), PURPLE_BED);
            modifiable.register(BLUE_BED.key(), BLUE_BED);
            modifiable.register(BROWN_BED.key(), BROWN_BED);
            modifiable.register(GREEN_BED.key(), GREEN_BED);
            modifiable.register(RED_BED.key(), RED_BED);
            modifiable.register(BLACK_BED.key(), BLACK_BED);
            modifiable.register(POWERED_RAIL.key(), POWERED_RAIL);
            modifiable.register(DETECTOR_RAIL.key(), DETECTOR_RAIL);
            modifiable.register(STICKY_PISTON.key(), STICKY_PISTON);
            modifiable.register(COBWEB.key(), COBWEB);
            modifiable.register(SHORT_GRASS.key(), SHORT_GRASS);
            modifiable.register(FERN.key(), FERN);
            modifiable.register(DEAD_BUSH.key(), DEAD_BUSH);
            modifiable.register(BUSH.key(), BUSH);
            modifiable.register(SHORT_DRY_GRASS.key(), SHORT_DRY_GRASS);
            modifiable.register(TALL_DRY_GRASS.key(), TALL_DRY_GRASS);
            modifiable.register(SEAGRASS.key(), SEAGRASS);
            modifiable.register(TALL_SEAGRASS.key(), TALL_SEAGRASS);
            modifiable.register(PISTON.key(), PISTON);
            modifiable.register(PISTON_HEAD.key(), PISTON_HEAD);
            modifiable.register(WHITE_WOOL.key(), WHITE_WOOL);
            modifiable.register(ORANGE_WOOL.key(), ORANGE_WOOL);
            modifiable.register(MAGENTA_WOOL.key(), MAGENTA_WOOL);
            modifiable.register(LIGHT_BLUE_WOOL.key(), LIGHT_BLUE_WOOL);
            modifiable.register(YELLOW_WOOL.key(), YELLOW_WOOL);
            modifiable.register(LIME_WOOL.key(), LIME_WOOL);
            modifiable.register(PINK_WOOL.key(), PINK_WOOL);
            modifiable.register(GRAY_WOOL.key(), GRAY_WOOL);
            modifiable.register(LIGHT_GRAY_WOOL.key(), LIGHT_GRAY_WOOL);
            modifiable.register(CYAN_WOOL.key(), CYAN_WOOL);
            modifiable.register(PURPLE_WOOL.key(), PURPLE_WOOL);
            modifiable.register(BLUE_WOOL.key(), BLUE_WOOL);
            modifiable.register(BROWN_WOOL.key(), BROWN_WOOL);
            modifiable.register(GREEN_WOOL.key(), GREEN_WOOL);
            modifiable.register(RED_WOOL.key(), RED_WOOL);
            modifiable.register(BLACK_WOOL.key(), BLACK_WOOL);
            modifiable.register(MOVING_PISTON.key(), MOVING_PISTON);
            modifiable.register(DANDELION.key(), DANDELION);
            modifiable.register(TORCHFLOWER.key(), TORCHFLOWER);
            modifiable.register(POPPY.key(), POPPY);
            modifiable.register(BLUE_ORCHID.key(), BLUE_ORCHID);
            modifiable.register(ALLIUM.key(), ALLIUM);
            modifiable.register(AZURE_BLUET.key(), AZURE_BLUET);
            modifiable.register(RED_TULIP.key(), RED_TULIP);
            modifiable.register(ORANGE_TULIP.key(), ORANGE_TULIP);
            modifiable.register(WHITE_TULIP.key(), WHITE_TULIP);
            modifiable.register(PINK_TULIP.key(), PINK_TULIP);
            modifiable.register(OXEYE_DAISY.key(), OXEYE_DAISY);
            modifiable.register(CORNFLOWER.key(), CORNFLOWER);
            modifiable.register(WITHER_ROSE.key(), WITHER_ROSE);
            modifiable.register(LILY_OF_THE_VALLEY.key(), LILY_OF_THE_VALLEY);
            modifiable.register(BROWN_MUSHROOM.key(), BROWN_MUSHROOM);
            modifiable.register(RED_MUSHROOM.key(), RED_MUSHROOM);
            modifiable.register(GOLD_BLOCK.key(), GOLD_BLOCK);
            modifiable.register(IRON_BLOCK.key(), IRON_BLOCK);
            modifiable.register(BRICKS.key(), BRICKS);
            modifiable.register(TNT.key(), TNT);
            modifiable.register(BOOKSHELF.key(), BOOKSHELF);
            modifiable.register(CHISELED_BOOKSHELF.key(), CHISELED_BOOKSHELF);
            modifiable.register(MOSSY_COBBLESTONE.key(), MOSSY_COBBLESTONE);
            modifiable.register(OBSIDIAN.key(), OBSIDIAN);
            modifiable.register(TORCH.key(), TORCH);
            modifiable.register(WALL_TORCH.key(), WALL_TORCH);
            modifiable.register(FIRE.key(), FIRE);
            modifiable.register(SOUL_FIRE.key(), SOUL_FIRE);
            modifiable.register(SPAWNER.key(), SPAWNER);
            modifiable.register(CREAKING_HEART.key(), CREAKING_HEART);
            modifiable.register(OAK_STAIRS.key(), OAK_STAIRS);
            modifiable.register(CHEST.key(), CHEST);
            modifiable.register(REDSTONE_WIRE.key(), REDSTONE_WIRE);
            modifiable.register(DIAMOND_ORE.key(), DIAMOND_ORE);
            modifiable.register(DEEPSLATE_DIAMOND_ORE.key(), DEEPSLATE_DIAMOND_ORE);
            modifiable.register(DIAMOND_BLOCK.key(), DIAMOND_BLOCK);
            modifiable.register(CRAFTING_TABLE.key(), CRAFTING_TABLE);
            modifiable.register(WHEAT.key(), WHEAT);
            modifiable.register(FARMLAND.key(), FARMLAND);
            modifiable.register(FURNACE.key(), FURNACE);
            modifiable.register(OAK_SIGN.key(), OAK_SIGN);
            modifiable.register(SPRUCE_SIGN.key(), SPRUCE_SIGN);
            modifiable.register(BIRCH_SIGN.key(), BIRCH_SIGN);
            modifiable.register(ACACIA_SIGN.key(), ACACIA_SIGN);
            modifiable.register(CHERRY_SIGN.key(), CHERRY_SIGN);
            modifiable.register(JUNGLE_SIGN.key(), JUNGLE_SIGN);
            modifiable.register(DARK_OAK_SIGN.key(), DARK_OAK_SIGN);
            modifiable.register(PALE_OAK_SIGN.key(), PALE_OAK_SIGN);
            modifiable.register(MANGROVE_SIGN.key(), MANGROVE_SIGN);
            modifiable.register(BAMBOO_SIGN.key(), BAMBOO_SIGN);
            modifiable.register(OAK_DOOR.key(), OAK_DOOR);
            modifiable.register(LADDER.key(), LADDER);
            modifiable.register(RAIL.key(), RAIL);
            modifiable.register(COBBLESTONE_STAIRS.key(), COBBLESTONE_STAIRS);
            modifiable.register(OAK_WALL_SIGN.key(), OAK_WALL_SIGN);
            modifiable.register(SPRUCE_WALL_SIGN.key(), SPRUCE_WALL_SIGN);
            modifiable.register(BIRCH_WALL_SIGN.key(), BIRCH_WALL_SIGN);
            modifiable.register(ACACIA_WALL_SIGN.key(), ACACIA_WALL_SIGN);
            modifiable.register(CHERRY_WALL_SIGN.key(), CHERRY_WALL_SIGN);
            modifiable.register(JUNGLE_WALL_SIGN.key(), JUNGLE_WALL_SIGN);
            modifiable.register(DARK_OAK_WALL_SIGN.key(), DARK_OAK_WALL_SIGN);
            modifiable.register(PALE_OAK_WALL_SIGN.key(), PALE_OAK_WALL_SIGN);
            modifiable.register(MANGROVE_WALL_SIGN.key(), MANGROVE_WALL_SIGN);
            modifiable.register(BAMBOO_WALL_SIGN.key(), BAMBOO_WALL_SIGN);
            modifiable.register(OAK_HANGING_SIGN.key(), OAK_HANGING_SIGN);
            modifiable.register(SPRUCE_HANGING_SIGN.key(), SPRUCE_HANGING_SIGN);
            modifiable.register(BIRCH_HANGING_SIGN.key(), BIRCH_HANGING_SIGN);
            modifiable.register(ACACIA_HANGING_SIGN.key(), ACACIA_HANGING_SIGN);
            modifiable.register(CHERRY_HANGING_SIGN.key(), CHERRY_HANGING_SIGN);
            modifiable.register(JUNGLE_HANGING_SIGN.key(), JUNGLE_HANGING_SIGN);
            modifiable.register(DARK_OAK_HANGING_SIGN.key(), DARK_OAK_HANGING_SIGN);
            modifiable.register(PALE_OAK_HANGING_SIGN.key(), PALE_OAK_HANGING_SIGN);
            modifiable.register(CRIMSON_HANGING_SIGN.key(), CRIMSON_HANGING_SIGN);
            modifiable.register(WARPED_HANGING_SIGN.key(), WARPED_HANGING_SIGN);
            modifiable.register(MANGROVE_HANGING_SIGN.key(), MANGROVE_HANGING_SIGN);
            modifiable.register(BAMBOO_HANGING_SIGN.key(), BAMBOO_HANGING_SIGN);
            modifiable.register(OAK_WALL_HANGING_SIGN.key(), OAK_WALL_HANGING_SIGN);
            modifiable.register(SPRUCE_WALL_HANGING_SIGN.key(), SPRUCE_WALL_HANGING_SIGN);
            modifiable.register(BIRCH_WALL_HANGING_SIGN.key(), BIRCH_WALL_HANGING_SIGN);
            modifiable.register(ACACIA_WALL_HANGING_SIGN.key(), ACACIA_WALL_HANGING_SIGN);
            modifiable.register(CHERRY_WALL_HANGING_SIGN.key(), CHERRY_WALL_HANGING_SIGN);
            modifiable.register(JUNGLE_WALL_HANGING_SIGN.key(), JUNGLE_WALL_HANGING_SIGN);
            modifiable.register(DARK_OAK_WALL_HANGING_SIGN.key(), DARK_OAK_WALL_HANGING_SIGN);
            modifiable.register(PALE_OAK_WALL_HANGING_SIGN.key(), PALE_OAK_WALL_HANGING_SIGN);
            modifiable.register(MANGROVE_WALL_HANGING_SIGN.key(), MANGROVE_WALL_HANGING_SIGN);
            modifiable.register(CRIMSON_WALL_HANGING_SIGN.key(), CRIMSON_WALL_HANGING_SIGN);
            modifiable.register(WARPED_WALL_HANGING_SIGN.key(), WARPED_WALL_HANGING_SIGN);
            modifiable.register(BAMBOO_WALL_HANGING_SIGN.key(), BAMBOO_WALL_HANGING_SIGN);
            modifiable.register(LEVER.key(), LEVER);
            modifiable.register(STONE_PRESSURE_PLATE.key(), STONE_PRESSURE_PLATE);
            modifiable.register(IRON_DOOR.key(), IRON_DOOR);
            modifiable.register(OAK_PRESSURE_PLATE.key(), OAK_PRESSURE_PLATE);
            modifiable.register(SPRUCE_PRESSURE_PLATE.key(), SPRUCE_PRESSURE_PLATE);
            modifiable.register(BIRCH_PRESSURE_PLATE.key(), BIRCH_PRESSURE_PLATE);
            modifiable.register(JUNGLE_PRESSURE_PLATE.key(), JUNGLE_PRESSURE_PLATE);
            modifiable.register(ACACIA_PRESSURE_PLATE.key(), ACACIA_PRESSURE_PLATE);
            modifiable.register(CHERRY_PRESSURE_PLATE.key(), CHERRY_PRESSURE_PLATE);
            modifiable.register(DARK_OAK_PRESSURE_PLATE.key(), DARK_OAK_PRESSURE_PLATE);
            modifiable.register(PALE_OAK_PRESSURE_PLATE.key(), PALE_OAK_PRESSURE_PLATE);
            modifiable.register(MANGROVE_PRESSURE_PLATE.key(), MANGROVE_PRESSURE_PLATE);
            modifiable.register(BAMBOO_PRESSURE_PLATE.key(), BAMBOO_PRESSURE_PLATE);
            modifiable.register(REDSTONE_ORE.key(), REDSTONE_ORE);
            modifiable.register(DEEPSLATE_REDSTONE_ORE.key(), DEEPSLATE_REDSTONE_ORE);
            modifiable.register(REDSTONE_TORCH.key(), REDSTONE_TORCH);
            modifiable.register(REDSTONE_WALL_TORCH.key(), REDSTONE_WALL_TORCH);
            modifiable.register(STONE_BUTTON.key(), STONE_BUTTON);
            modifiable.register(SNOW.key(), SNOW);
            modifiable.register(ICE.key(), ICE);
            modifiable.register(SNOW_BLOCK.key(), SNOW_BLOCK);
            modifiable.register(CACTUS.key(), CACTUS);
            modifiable.register(CACTUS_FLOWER.key(), CACTUS_FLOWER);
            modifiable.register(CLAY.key(), CLAY);
            modifiable.register(SUGAR_CANE.key(), SUGAR_CANE);
            modifiable.register(JUKEBOX.key(), JUKEBOX);
            modifiable.register(OAK_FENCE.key(), OAK_FENCE);
            modifiable.register(NETHERRACK.key(), NETHERRACK);
            modifiable.register(SOUL_SAND.key(), SOUL_SAND);
            modifiable.register(SOUL_SOIL.key(), SOUL_SOIL);
            modifiable.register(BASALT.key(), BASALT);
            modifiable.register(POLISHED_BASALT.key(), POLISHED_BASALT);
            modifiable.register(SOUL_TORCH.key(), SOUL_TORCH);
            modifiable.register(SOUL_WALL_TORCH.key(), SOUL_WALL_TORCH);
            modifiable.register(GLOWSTONE.key(), GLOWSTONE);
            modifiable.register(NETHER_PORTAL.key(), NETHER_PORTAL);
            modifiable.register(CARVED_PUMPKIN.key(), CARVED_PUMPKIN);
            modifiable.register(JACK_O_LANTERN.key(), JACK_O_LANTERN);
            modifiable.register(CAKE.key(), CAKE);
            modifiable.register(REPEATER.key(), REPEATER);
            modifiable.register(WHITE_STAINED_GLASS.key(), WHITE_STAINED_GLASS);
            modifiable.register(ORANGE_STAINED_GLASS.key(), ORANGE_STAINED_GLASS);
            modifiable.register(MAGENTA_STAINED_GLASS.key(), MAGENTA_STAINED_GLASS);
            modifiable.register(LIGHT_BLUE_STAINED_GLASS.key(), LIGHT_BLUE_STAINED_GLASS);
            modifiable.register(YELLOW_STAINED_GLASS.key(), YELLOW_STAINED_GLASS);
            modifiable.register(LIME_STAINED_GLASS.key(), LIME_STAINED_GLASS);
            modifiable.register(PINK_STAINED_GLASS.key(), PINK_STAINED_GLASS);
            modifiable.register(GRAY_STAINED_GLASS.key(), GRAY_STAINED_GLASS);
            modifiable.register(LIGHT_GRAY_STAINED_GLASS.key(), LIGHT_GRAY_STAINED_GLASS);
            modifiable.register(CYAN_STAINED_GLASS.key(), CYAN_STAINED_GLASS);
            modifiable.register(PURPLE_STAINED_GLASS.key(), PURPLE_STAINED_GLASS);
            modifiable.register(BLUE_STAINED_GLASS.key(), BLUE_STAINED_GLASS);
            modifiable.register(BROWN_STAINED_GLASS.key(), BROWN_STAINED_GLASS);
            modifiable.register(GREEN_STAINED_GLASS.key(), GREEN_STAINED_GLASS);
            modifiable.register(RED_STAINED_GLASS.key(), RED_STAINED_GLASS);
            modifiable.register(BLACK_STAINED_GLASS.key(), BLACK_STAINED_GLASS);
            modifiable.register(OAK_TRAPDOOR.key(), OAK_TRAPDOOR);
            modifiable.register(SPRUCE_TRAPDOOR.key(), SPRUCE_TRAPDOOR);
            modifiable.register(BIRCH_TRAPDOOR.key(), BIRCH_TRAPDOOR);
            modifiable.register(JUNGLE_TRAPDOOR.key(), JUNGLE_TRAPDOOR);
            modifiable.register(ACACIA_TRAPDOOR.key(), ACACIA_TRAPDOOR);
            modifiable.register(CHERRY_TRAPDOOR.key(), CHERRY_TRAPDOOR);
            modifiable.register(DARK_OAK_TRAPDOOR.key(), DARK_OAK_TRAPDOOR);
            modifiable.register(PALE_OAK_TRAPDOOR.key(), PALE_OAK_TRAPDOOR);
            modifiable.register(MANGROVE_TRAPDOOR.key(), MANGROVE_TRAPDOOR);
            modifiable.register(BAMBOO_TRAPDOOR.key(), BAMBOO_TRAPDOOR);
            modifiable.register(STONE_BRICKS.key(), STONE_BRICKS);
            modifiable.register(MOSSY_STONE_BRICKS.key(), MOSSY_STONE_BRICKS);
            modifiable.register(CRACKED_STONE_BRICKS.key(), CRACKED_STONE_BRICKS);
            modifiable.register(CHISELED_STONE_BRICKS.key(), CHISELED_STONE_BRICKS);
            modifiable.register(PACKED_MUD.key(), PACKED_MUD);
            modifiable.register(MUD_BRICKS.key(), MUD_BRICKS);
            modifiable.register(INFESTED_STONE.key(), INFESTED_STONE);
            modifiable.register(INFESTED_COBBLESTONE.key(), INFESTED_COBBLESTONE);
            modifiable.register(INFESTED_STONE_BRICKS.key(), INFESTED_STONE_BRICKS);
            modifiable.register(INFESTED_MOSSY_STONE_BRICKS.key(), INFESTED_MOSSY_STONE_BRICKS);
            modifiable.register(INFESTED_CRACKED_STONE_BRICKS.key(), INFESTED_CRACKED_STONE_BRICKS);
            modifiable.register(INFESTED_CHISELED_STONE_BRICKS.key(), INFESTED_CHISELED_STONE_BRICKS);
            modifiable.register(BROWN_MUSHROOM_BLOCK.key(), BROWN_MUSHROOM_BLOCK);
            modifiable.register(RED_MUSHROOM_BLOCK.key(), RED_MUSHROOM_BLOCK);
            modifiable.register(MUSHROOM_STEM.key(), MUSHROOM_STEM);
            modifiable.register(IRON_BARS.key(), IRON_BARS);
            modifiable.register(CHAIN.key(), CHAIN);
            modifiable.register(GLASS_PANE.key(), GLASS_PANE);
            modifiable.register(PUMPKIN.key(), PUMPKIN);
            modifiable.register(MELON.key(), MELON);
            modifiable.register(ATTACHED_PUMPKIN_STEM.key(), ATTACHED_PUMPKIN_STEM);
            modifiable.register(ATTACHED_MELON_STEM.key(), ATTACHED_MELON_STEM);
            modifiable.register(PUMPKIN_STEM.key(), PUMPKIN_STEM);
            modifiable.register(MELON_STEM.key(), MELON_STEM);
            modifiable.register(VINE.key(), VINE);
            modifiable.register(GLOW_LICHEN.key(), GLOW_LICHEN);
            modifiable.register(RESIN_CLUMP.key(), RESIN_CLUMP);
            modifiable.register(OAK_FENCE_GATE.key(), OAK_FENCE_GATE);
            modifiable.register(BRICK_STAIRS.key(), BRICK_STAIRS);
            modifiable.register(STONE_BRICK_STAIRS.key(), STONE_BRICK_STAIRS);
            modifiable.register(MUD_BRICK_STAIRS.key(), MUD_BRICK_STAIRS);
            modifiable.register(MYCELIUM.key(), MYCELIUM);
            modifiable.register(LILY_PAD.key(), LILY_PAD);
            modifiable.register(RESIN_BLOCK.key(), RESIN_BLOCK);
            modifiable.register(RESIN_BRICKS.key(), RESIN_BRICKS);
            modifiable.register(RESIN_BRICK_STAIRS.key(), RESIN_BRICK_STAIRS);
            modifiable.register(RESIN_BRICK_SLAB.key(), RESIN_BRICK_SLAB);
            modifiable.register(RESIN_BRICK_WALL.key(), RESIN_BRICK_WALL);
            modifiable.register(CHISELED_RESIN_BRICKS.key(), CHISELED_RESIN_BRICKS);
            modifiable.register(NETHER_BRICKS.key(), NETHER_BRICKS);
            modifiable.register(NETHER_BRICK_FENCE.key(), NETHER_BRICK_FENCE);
            modifiable.register(NETHER_BRICK_STAIRS.key(), NETHER_BRICK_STAIRS);
            modifiable.register(NETHER_WART.key(), NETHER_WART);
            modifiable.register(ENCHANTING_TABLE.key(), ENCHANTING_TABLE);
            modifiable.register(BREWING_STAND.key(), BREWING_STAND);
            modifiable.register(CAULDRON.key(), CAULDRON);
            modifiable.register(WATER_CAULDRON.key(), WATER_CAULDRON);
            modifiable.register(LAVA_CAULDRON.key(), LAVA_CAULDRON);
            modifiable.register(POWDER_SNOW_CAULDRON.key(), POWDER_SNOW_CAULDRON);
            modifiable.register(END_PORTAL.key(), END_PORTAL);
            modifiable.register(END_PORTAL_FRAME.key(), END_PORTAL_FRAME);
            modifiable.register(END_STONE.key(), END_STONE);
            modifiable.register(DRAGON_EGG.key(), DRAGON_EGG);
            modifiable.register(REDSTONE_LAMP.key(), REDSTONE_LAMP);
            modifiable.register(COCOA.key(), COCOA);
            modifiable.register(SANDSTONE_STAIRS.key(), SANDSTONE_STAIRS);
            modifiable.register(EMERALD_ORE.key(), EMERALD_ORE);
            modifiable.register(DEEPSLATE_EMERALD_ORE.key(), DEEPSLATE_EMERALD_ORE);
            modifiable.register(ENDER_CHEST.key(), ENDER_CHEST);
            modifiable.register(TRIPWIRE_HOOK.key(), TRIPWIRE_HOOK);
            modifiable.register(TRIPWIRE.key(), TRIPWIRE);
            modifiable.register(EMERALD_BLOCK.key(), EMERALD_BLOCK);
            modifiable.register(SPRUCE_STAIRS.key(), SPRUCE_STAIRS);
            modifiable.register(BIRCH_STAIRS.key(), BIRCH_STAIRS);
            modifiable.register(JUNGLE_STAIRS.key(), JUNGLE_STAIRS);
            modifiable.register(COMMAND_BLOCK.key(), COMMAND_BLOCK);
            modifiable.register(BEACON.key(), BEACON);
            modifiable.register(COBBLESTONE_WALL.key(), COBBLESTONE_WALL);
            modifiable.register(MOSSY_COBBLESTONE_WALL.key(), MOSSY_COBBLESTONE_WALL);
            modifiable.register(FLOWER_POT.key(), FLOWER_POT);
            modifiable.register(POTTED_TORCHFLOWER.key(), POTTED_TORCHFLOWER);
            modifiable.register(POTTED_OAK_SAPLING.key(), POTTED_OAK_SAPLING);
            modifiable.register(POTTED_SPRUCE_SAPLING.key(), POTTED_SPRUCE_SAPLING);
            modifiable.register(POTTED_BIRCH_SAPLING.key(), POTTED_BIRCH_SAPLING);
            modifiable.register(POTTED_JUNGLE_SAPLING.key(), POTTED_JUNGLE_SAPLING);
            modifiable.register(POTTED_ACACIA_SAPLING.key(), POTTED_ACACIA_SAPLING);
            modifiable.register(POTTED_CHERRY_SAPLING.key(), POTTED_CHERRY_SAPLING);
            modifiable.register(POTTED_DARK_OAK_SAPLING.key(), POTTED_DARK_OAK_SAPLING);
            modifiable.register(POTTED_PALE_OAK_SAPLING.key(), POTTED_PALE_OAK_SAPLING);
            modifiable.register(POTTED_MANGROVE_PROPAGULE.key(), POTTED_MANGROVE_PROPAGULE);
            modifiable.register(POTTED_FERN.key(), POTTED_FERN);
            modifiable.register(POTTED_DANDELION.key(), POTTED_DANDELION);
            modifiable.register(POTTED_POPPY.key(), POTTED_POPPY);
            modifiable.register(POTTED_BLUE_ORCHID.key(), POTTED_BLUE_ORCHID);
            modifiable.register(POTTED_ALLIUM.key(), POTTED_ALLIUM);
            modifiable.register(POTTED_AZURE_BLUET.key(), POTTED_AZURE_BLUET);
            modifiable.register(POTTED_RED_TULIP.key(), POTTED_RED_TULIP);
            modifiable.register(POTTED_ORANGE_TULIP.key(), POTTED_ORANGE_TULIP);
            modifiable.register(POTTED_WHITE_TULIP.key(), POTTED_WHITE_TULIP);
            modifiable.register(POTTED_PINK_TULIP.key(), POTTED_PINK_TULIP);
            modifiable.register(POTTED_OXEYE_DAISY.key(), POTTED_OXEYE_DAISY);
            modifiable.register(POTTED_CORNFLOWER.key(), POTTED_CORNFLOWER);
            modifiable.register(POTTED_LILY_OF_THE_VALLEY.key(), POTTED_LILY_OF_THE_VALLEY);
            modifiable.register(POTTED_WITHER_ROSE.key(), POTTED_WITHER_ROSE);
            modifiable.register(POTTED_RED_MUSHROOM.key(), POTTED_RED_MUSHROOM);
            modifiable.register(POTTED_BROWN_MUSHROOM.key(), POTTED_BROWN_MUSHROOM);
            modifiable.register(POTTED_DEAD_BUSH.key(), POTTED_DEAD_BUSH);
            modifiable.register(POTTED_CACTUS.key(), POTTED_CACTUS);
            modifiable.register(CARROTS.key(), CARROTS);
            modifiable.register(POTATOES.key(), POTATOES);
            modifiable.register(OAK_BUTTON.key(), OAK_BUTTON);
            modifiable.register(SPRUCE_BUTTON.key(), SPRUCE_BUTTON);
            modifiable.register(BIRCH_BUTTON.key(), BIRCH_BUTTON);
            modifiable.register(JUNGLE_BUTTON.key(), JUNGLE_BUTTON);
            modifiable.register(ACACIA_BUTTON.key(), ACACIA_BUTTON);
            modifiable.register(CHERRY_BUTTON.key(), CHERRY_BUTTON);
            modifiable.register(DARK_OAK_BUTTON.key(), DARK_OAK_BUTTON);
            modifiable.register(PALE_OAK_BUTTON.key(), PALE_OAK_BUTTON);
            modifiable.register(MANGROVE_BUTTON.key(), MANGROVE_BUTTON);
            modifiable.register(BAMBOO_BUTTON.key(), BAMBOO_BUTTON);
            modifiable.register(SKELETON_SKULL.key(), SKELETON_SKULL);
            modifiable.register(SKELETON_WALL_SKULL.key(), SKELETON_WALL_SKULL);
            modifiable.register(WITHER_SKELETON_SKULL.key(), WITHER_SKELETON_SKULL);
            modifiable.register(WITHER_SKELETON_WALL_SKULL.key(), WITHER_SKELETON_WALL_SKULL);
            modifiable.register(ZOMBIE_HEAD.key(), ZOMBIE_HEAD);
            modifiable.register(ZOMBIE_WALL_HEAD.key(), ZOMBIE_WALL_HEAD);
            modifiable.register(PLAYER_HEAD.key(), PLAYER_HEAD);
            modifiable.register(PLAYER_WALL_HEAD.key(), PLAYER_WALL_HEAD);
            modifiable.register(CREEPER_HEAD.key(), CREEPER_HEAD);
            modifiable.register(CREEPER_WALL_HEAD.key(), CREEPER_WALL_HEAD);
            modifiable.register(DRAGON_HEAD.key(), DRAGON_HEAD);
            modifiable.register(DRAGON_WALL_HEAD.key(), DRAGON_WALL_HEAD);
            modifiable.register(PIGLIN_HEAD.key(), PIGLIN_HEAD);
            modifiable.register(PIGLIN_WALL_HEAD.key(), PIGLIN_WALL_HEAD);
            modifiable.register(ANVIL.key(), ANVIL);
            modifiable.register(CHIPPED_ANVIL.key(), CHIPPED_ANVIL);
            modifiable.register(DAMAGED_ANVIL.key(), DAMAGED_ANVIL);
            modifiable.register(TRAPPED_CHEST.key(), TRAPPED_CHEST);
            modifiable.register(LIGHT_WEIGHTED_PRESSURE_PLATE.key(), LIGHT_WEIGHTED_PRESSURE_PLATE);
            modifiable.register(HEAVY_WEIGHTED_PRESSURE_PLATE.key(), HEAVY_WEIGHTED_PRESSURE_PLATE);
            modifiable.register(COMPARATOR.key(), COMPARATOR);
            modifiable.register(DAYLIGHT_DETECTOR.key(), DAYLIGHT_DETECTOR);
            modifiable.register(REDSTONE_BLOCK.key(), REDSTONE_BLOCK);
            modifiable.register(NETHER_QUARTZ_ORE.key(), NETHER_QUARTZ_ORE);
            modifiable.register(HOPPER.key(), HOPPER);
            modifiable.register(QUARTZ_BLOCK.key(), QUARTZ_BLOCK);
            modifiable.register(CHISELED_QUARTZ_BLOCK.key(), CHISELED_QUARTZ_BLOCK);
            modifiable.register(QUARTZ_PILLAR.key(), QUARTZ_PILLAR);
            modifiable.register(QUARTZ_STAIRS.key(), QUARTZ_STAIRS);
            modifiable.register(ACTIVATOR_RAIL.key(), ACTIVATOR_RAIL);
            modifiable.register(DROPPER.key(), DROPPER);
            modifiable.register(WHITE_TERRACOTTA.key(), WHITE_TERRACOTTA);
            modifiable.register(ORANGE_TERRACOTTA.key(), ORANGE_TERRACOTTA);
            modifiable.register(MAGENTA_TERRACOTTA.key(), MAGENTA_TERRACOTTA);
            modifiable.register(LIGHT_BLUE_TERRACOTTA.key(), LIGHT_BLUE_TERRACOTTA);
            modifiable.register(YELLOW_TERRACOTTA.key(), YELLOW_TERRACOTTA);
            modifiable.register(LIME_TERRACOTTA.key(), LIME_TERRACOTTA);
            modifiable.register(PINK_TERRACOTTA.key(), PINK_TERRACOTTA);
            modifiable.register(GRAY_TERRACOTTA.key(), GRAY_TERRACOTTA);
            modifiable.register(LIGHT_GRAY_TERRACOTTA.key(), LIGHT_GRAY_TERRACOTTA);
            modifiable.register(CYAN_TERRACOTTA.key(), CYAN_TERRACOTTA);
            modifiable.register(PURPLE_TERRACOTTA.key(), PURPLE_TERRACOTTA);
            modifiable.register(BLUE_TERRACOTTA.key(), BLUE_TERRACOTTA);
            modifiable.register(BROWN_TERRACOTTA.key(), BROWN_TERRACOTTA);
            modifiable.register(GREEN_TERRACOTTA.key(), GREEN_TERRACOTTA);
            modifiable.register(RED_TERRACOTTA.key(), RED_TERRACOTTA);
            modifiable.register(BLACK_TERRACOTTA.key(), BLACK_TERRACOTTA);
            modifiable.register(WHITE_STAINED_GLASS_PANE.key(), WHITE_STAINED_GLASS_PANE);
            modifiable.register(ORANGE_STAINED_GLASS_PANE.key(), ORANGE_STAINED_GLASS_PANE);
            modifiable.register(MAGENTA_STAINED_GLASS_PANE.key(), MAGENTA_STAINED_GLASS_PANE);
            modifiable.register(LIGHT_BLUE_STAINED_GLASS_PANE.key(), LIGHT_BLUE_STAINED_GLASS_PANE);
            modifiable.register(YELLOW_STAINED_GLASS_PANE.key(), YELLOW_STAINED_GLASS_PANE);
            modifiable.register(LIME_STAINED_GLASS_PANE.key(), LIME_STAINED_GLASS_PANE);
            modifiable.register(PINK_STAINED_GLASS_PANE.key(), PINK_STAINED_GLASS_PANE);
            modifiable.register(GRAY_STAINED_GLASS_PANE.key(), GRAY_STAINED_GLASS_PANE);
            modifiable.register(LIGHT_GRAY_STAINED_GLASS_PANE.key(), LIGHT_GRAY_STAINED_GLASS_PANE);
            modifiable.register(CYAN_STAINED_GLASS_PANE.key(), CYAN_STAINED_GLASS_PANE);
            modifiable.register(PURPLE_STAINED_GLASS_PANE.key(), PURPLE_STAINED_GLASS_PANE);
            modifiable.register(BLUE_STAINED_GLASS_PANE.key(), BLUE_STAINED_GLASS_PANE);
            modifiable.register(BROWN_STAINED_GLASS_PANE.key(), BROWN_STAINED_GLASS_PANE);
            modifiable.register(GREEN_STAINED_GLASS_PANE.key(), GREEN_STAINED_GLASS_PANE);
            modifiable.register(RED_STAINED_GLASS_PANE.key(), RED_STAINED_GLASS_PANE);
            modifiable.register(BLACK_STAINED_GLASS_PANE.key(), BLACK_STAINED_GLASS_PANE);
            modifiable.register(ACACIA_STAIRS.key(), ACACIA_STAIRS);
            modifiable.register(CHERRY_STAIRS.key(), CHERRY_STAIRS);
            modifiable.register(DARK_OAK_STAIRS.key(), DARK_OAK_STAIRS);
            modifiable.register(PALE_OAK_STAIRS.key(), PALE_OAK_STAIRS);
            modifiable.register(MANGROVE_STAIRS.key(), MANGROVE_STAIRS);
            modifiable.register(BAMBOO_STAIRS.key(), BAMBOO_STAIRS);
            modifiable.register(BAMBOO_MOSAIC_STAIRS.key(), BAMBOO_MOSAIC_STAIRS);
            modifiable.register(SLIME_BLOCK.key(), SLIME_BLOCK);
            modifiable.register(BARRIER.key(), BARRIER);
            modifiable.register(LIGHT.key(), LIGHT);
            modifiable.register(IRON_TRAPDOOR.key(), IRON_TRAPDOOR);
            modifiable.register(PRISMARINE.key(), PRISMARINE);
            modifiable.register(PRISMARINE_BRICKS.key(), PRISMARINE_BRICKS);
            modifiable.register(DARK_PRISMARINE.key(), DARK_PRISMARINE);
            modifiable.register(PRISMARINE_STAIRS.key(), PRISMARINE_STAIRS);
            modifiable.register(PRISMARINE_BRICK_STAIRS.key(), PRISMARINE_BRICK_STAIRS);
            modifiable.register(DARK_PRISMARINE_STAIRS.key(), DARK_PRISMARINE_STAIRS);
            modifiable.register(PRISMARINE_SLAB.key(), PRISMARINE_SLAB);
            modifiable.register(PRISMARINE_BRICK_SLAB.key(), PRISMARINE_BRICK_SLAB);
            modifiable.register(DARK_PRISMARINE_SLAB.key(), DARK_PRISMARINE_SLAB);
            modifiable.register(SEA_LANTERN.key(), SEA_LANTERN);
            modifiable.register(HAY_BLOCK.key(), HAY_BLOCK);
            modifiable.register(WHITE_CARPET.key(), WHITE_CARPET);
            modifiable.register(ORANGE_CARPET.key(), ORANGE_CARPET);
            modifiable.register(MAGENTA_CARPET.key(), MAGENTA_CARPET);
            modifiable.register(LIGHT_BLUE_CARPET.key(), LIGHT_BLUE_CARPET);
            modifiable.register(YELLOW_CARPET.key(), YELLOW_CARPET);
            modifiable.register(LIME_CARPET.key(), LIME_CARPET);
            modifiable.register(PINK_CARPET.key(), PINK_CARPET);
            modifiable.register(GRAY_CARPET.key(), GRAY_CARPET);
            modifiable.register(LIGHT_GRAY_CARPET.key(), LIGHT_GRAY_CARPET);
            modifiable.register(CYAN_CARPET.key(), CYAN_CARPET);
            modifiable.register(PURPLE_CARPET.key(), PURPLE_CARPET);
            modifiable.register(BLUE_CARPET.key(), BLUE_CARPET);
            modifiable.register(BROWN_CARPET.key(), BROWN_CARPET);
            modifiable.register(GREEN_CARPET.key(), GREEN_CARPET);
            modifiable.register(RED_CARPET.key(), RED_CARPET);
            modifiable.register(BLACK_CARPET.key(), BLACK_CARPET);
            modifiable.register(TERRACOTTA.key(), TERRACOTTA);
            modifiable.register(COAL_BLOCK.key(), COAL_BLOCK);
            modifiable.register(PACKED_ICE.key(), PACKED_ICE);
            modifiable.register(SUNFLOWER.key(), SUNFLOWER);
            modifiable.register(LILAC.key(), LILAC);
            modifiable.register(ROSE_BUSH.key(), ROSE_BUSH);
            modifiable.register(PEONY.key(), PEONY);
            modifiable.register(TALL_GRASS.key(), TALL_GRASS);
            modifiable.register(LARGE_FERN.key(), LARGE_FERN);
            modifiable.register(WHITE_BANNER.key(), WHITE_BANNER);
            modifiable.register(ORANGE_BANNER.key(), ORANGE_BANNER);
            modifiable.register(MAGENTA_BANNER.key(), MAGENTA_BANNER);
            modifiable.register(LIGHT_BLUE_BANNER.key(), LIGHT_BLUE_BANNER);
            modifiable.register(YELLOW_BANNER.key(), YELLOW_BANNER);
            modifiable.register(LIME_BANNER.key(), LIME_BANNER);
            modifiable.register(PINK_BANNER.key(), PINK_BANNER);
            modifiable.register(GRAY_BANNER.key(), GRAY_BANNER);
            modifiable.register(LIGHT_GRAY_BANNER.key(), LIGHT_GRAY_BANNER);
            modifiable.register(CYAN_BANNER.key(), CYAN_BANNER);
            modifiable.register(PURPLE_BANNER.key(), PURPLE_BANNER);
            modifiable.register(BLUE_BANNER.key(), BLUE_BANNER);
            modifiable.register(BROWN_BANNER.key(), BROWN_BANNER);
            modifiable.register(GREEN_BANNER.key(), GREEN_BANNER);
            modifiable.register(RED_BANNER.key(), RED_BANNER);
            modifiable.register(BLACK_BANNER.key(), BLACK_BANNER);
            modifiable.register(WHITE_WALL_BANNER.key(), WHITE_WALL_BANNER);
            modifiable.register(ORANGE_WALL_BANNER.key(), ORANGE_WALL_BANNER);
            modifiable.register(MAGENTA_WALL_BANNER.key(), MAGENTA_WALL_BANNER);
            modifiable.register(LIGHT_BLUE_WALL_BANNER.key(), LIGHT_BLUE_WALL_BANNER);
            modifiable.register(YELLOW_WALL_BANNER.key(), YELLOW_WALL_BANNER);
            modifiable.register(LIME_WALL_BANNER.key(), LIME_WALL_BANNER);
            modifiable.register(PINK_WALL_BANNER.key(), PINK_WALL_BANNER);
            modifiable.register(GRAY_WALL_BANNER.key(), GRAY_WALL_BANNER);
            modifiable.register(LIGHT_GRAY_WALL_BANNER.key(), LIGHT_GRAY_WALL_BANNER);
            modifiable.register(CYAN_WALL_BANNER.key(), CYAN_WALL_BANNER);
            modifiable.register(PURPLE_WALL_BANNER.key(), PURPLE_WALL_BANNER);
            modifiable.register(BLUE_WALL_BANNER.key(), BLUE_WALL_BANNER);
            modifiable.register(BROWN_WALL_BANNER.key(), BROWN_WALL_BANNER);
            modifiable.register(GREEN_WALL_BANNER.key(), GREEN_WALL_BANNER);
            modifiable.register(RED_WALL_BANNER.key(), RED_WALL_BANNER);
            modifiable.register(BLACK_WALL_BANNER.key(), BLACK_WALL_BANNER);
            modifiable.register(RED_SANDSTONE.key(), RED_SANDSTONE);
            modifiable.register(CHISELED_RED_SANDSTONE.key(), CHISELED_RED_SANDSTONE);
            modifiable.register(CUT_RED_SANDSTONE.key(), CUT_RED_SANDSTONE);
            modifiable.register(RED_SANDSTONE_STAIRS.key(), RED_SANDSTONE_STAIRS);
            modifiable.register(OAK_SLAB.key(), OAK_SLAB);
            modifiable.register(SPRUCE_SLAB.key(), SPRUCE_SLAB);
            modifiable.register(BIRCH_SLAB.key(), BIRCH_SLAB);
            modifiable.register(JUNGLE_SLAB.key(), JUNGLE_SLAB);
            modifiable.register(ACACIA_SLAB.key(), ACACIA_SLAB);
            modifiable.register(CHERRY_SLAB.key(), CHERRY_SLAB);
            modifiable.register(DARK_OAK_SLAB.key(), DARK_OAK_SLAB);
            modifiable.register(PALE_OAK_SLAB.key(), PALE_OAK_SLAB);
            modifiable.register(MANGROVE_SLAB.key(), MANGROVE_SLAB);
            modifiable.register(BAMBOO_SLAB.key(), BAMBOO_SLAB);
            modifiable.register(BAMBOO_MOSAIC_SLAB.key(), BAMBOO_MOSAIC_SLAB);
            modifiable.register(STONE_SLAB.key(), STONE_SLAB);
            modifiable.register(SMOOTH_STONE_SLAB.key(), SMOOTH_STONE_SLAB);
            modifiable.register(SANDSTONE_SLAB.key(), SANDSTONE_SLAB);
            modifiable.register(CUT_SANDSTONE_SLAB.key(), CUT_SANDSTONE_SLAB);
            modifiable.register(PETRIFIED_OAK_SLAB.key(), PETRIFIED_OAK_SLAB);
            modifiable.register(COBBLESTONE_SLAB.key(), COBBLESTONE_SLAB);
            modifiable.register(BRICK_SLAB.key(), BRICK_SLAB);
            modifiable.register(STONE_BRICK_SLAB.key(), STONE_BRICK_SLAB);
            modifiable.register(MUD_BRICK_SLAB.key(), MUD_BRICK_SLAB);
            modifiable.register(NETHER_BRICK_SLAB.key(), NETHER_BRICK_SLAB);
            modifiable.register(QUARTZ_SLAB.key(), QUARTZ_SLAB);
            modifiable.register(RED_SANDSTONE_SLAB.key(), RED_SANDSTONE_SLAB);
            modifiable.register(CUT_RED_SANDSTONE_SLAB.key(), CUT_RED_SANDSTONE_SLAB);
            modifiable.register(PURPUR_SLAB.key(), PURPUR_SLAB);
            modifiable.register(SMOOTH_STONE.key(), SMOOTH_STONE);
            modifiable.register(SMOOTH_SANDSTONE.key(), SMOOTH_SANDSTONE);
            modifiable.register(SMOOTH_QUARTZ.key(), SMOOTH_QUARTZ);
            modifiable.register(SMOOTH_RED_SANDSTONE.key(), SMOOTH_RED_SANDSTONE);
            modifiable.register(SPRUCE_FENCE_GATE.key(), SPRUCE_FENCE_GATE);
            modifiable.register(BIRCH_FENCE_GATE.key(), BIRCH_FENCE_GATE);
            modifiable.register(JUNGLE_FENCE_GATE.key(), JUNGLE_FENCE_GATE);
            modifiable.register(ACACIA_FENCE_GATE.key(), ACACIA_FENCE_GATE);
            modifiable.register(CHERRY_FENCE_GATE.key(), CHERRY_FENCE_GATE);
            modifiable.register(DARK_OAK_FENCE_GATE.key(), DARK_OAK_FENCE_GATE);
            modifiable.register(PALE_OAK_FENCE_GATE.key(), PALE_OAK_FENCE_GATE);
            modifiable.register(MANGROVE_FENCE_GATE.key(), MANGROVE_FENCE_GATE);
            modifiable.register(BAMBOO_FENCE_GATE.key(), BAMBOO_FENCE_GATE);
            modifiable.register(SPRUCE_FENCE.key(), SPRUCE_FENCE);
            modifiable.register(BIRCH_FENCE.key(), BIRCH_FENCE);
            modifiable.register(JUNGLE_FENCE.key(), JUNGLE_FENCE);
            modifiable.register(ACACIA_FENCE.key(), ACACIA_FENCE);
            modifiable.register(CHERRY_FENCE.key(), CHERRY_FENCE);
            modifiable.register(DARK_OAK_FENCE.key(), DARK_OAK_FENCE);
            modifiable.register(PALE_OAK_FENCE.key(), PALE_OAK_FENCE);
            modifiable.register(MANGROVE_FENCE.key(), MANGROVE_FENCE);
            modifiable.register(BAMBOO_FENCE.key(), BAMBOO_FENCE);
            modifiable.register(SPRUCE_DOOR.key(), SPRUCE_DOOR);
            modifiable.register(BIRCH_DOOR.key(), BIRCH_DOOR);
            modifiable.register(JUNGLE_DOOR.key(), JUNGLE_DOOR);
            modifiable.register(ACACIA_DOOR.key(), ACACIA_DOOR);
            modifiable.register(CHERRY_DOOR.key(), CHERRY_DOOR);
            modifiable.register(DARK_OAK_DOOR.key(), DARK_OAK_DOOR);
            modifiable.register(PALE_OAK_DOOR.key(), PALE_OAK_DOOR);
            modifiable.register(MANGROVE_DOOR.key(), MANGROVE_DOOR);
            modifiable.register(BAMBOO_DOOR.key(), BAMBOO_DOOR);
            modifiable.register(END_ROD.key(), END_ROD);
            modifiable.register(CHORUS_PLANT.key(), CHORUS_PLANT);
            modifiable.register(CHORUS_FLOWER.key(), CHORUS_FLOWER);
            modifiable.register(PURPUR_BLOCK.key(), PURPUR_BLOCK);
            modifiable.register(PURPUR_PILLAR.key(), PURPUR_PILLAR);
            modifiable.register(PURPUR_STAIRS.key(), PURPUR_STAIRS);
            modifiable.register(END_STONE_BRICKS.key(), END_STONE_BRICKS);
            modifiable.register(TORCHFLOWER_CROP.key(), TORCHFLOWER_CROP);
            modifiable.register(PITCHER_CROP.key(), PITCHER_CROP);
            modifiable.register(PITCHER_PLANT.key(), PITCHER_PLANT);
            modifiable.register(BEETROOTS.key(), BEETROOTS);
            modifiable.register(DIRT_PATH.key(), DIRT_PATH);
            modifiable.register(END_GATEWAY.key(), END_GATEWAY);
            modifiable.register(REPEATING_COMMAND_BLOCK.key(), REPEATING_COMMAND_BLOCK);
            modifiable.register(CHAIN_COMMAND_BLOCK.key(), CHAIN_COMMAND_BLOCK);
            modifiable.register(FROSTED_ICE.key(), FROSTED_ICE);
            modifiable.register(MAGMA_BLOCK.key(), MAGMA_BLOCK);
            modifiable.register(NETHER_WART_BLOCK.key(), NETHER_WART_BLOCK);
            modifiable.register(RED_NETHER_BRICKS.key(), RED_NETHER_BRICKS);
            modifiable.register(BONE_BLOCK.key(), BONE_BLOCK);
            modifiable.register(STRUCTURE_VOID.key(), STRUCTURE_VOID);
            modifiable.register(OBSERVER.key(), OBSERVER);
            modifiable.register(SHULKER_BOX.key(), SHULKER_BOX);
            modifiable.register(WHITE_SHULKER_BOX.key(), WHITE_SHULKER_BOX);
            modifiable.register(ORANGE_SHULKER_BOX.key(), ORANGE_SHULKER_BOX);
            modifiable.register(MAGENTA_SHULKER_BOX.key(), MAGENTA_SHULKER_BOX);
            modifiable.register(LIGHT_BLUE_SHULKER_BOX.key(), LIGHT_BLUE_SHULKER_BOX);
            modifiable.register(YELLOW_SHULKER_BOX.key(), YELLOW_SHULKER_BOX);
            modifiable.register(LIME_SHULKER_BOX.key(), LIME_SHULKER_BOX);
            modifiable.register(PINK_SHULKER_BOX.key(), PINK_SHULKER_BOX);
            modifiable.register(GRAY_SHULKER_BOX.key(), GRAY_SHULKER_BOX);
            modifiable.register(LIGHT_GRAY_SHULKER_BOX.key(), LIGHT_GRAY_SHULKER_BOX);
            modifiable.register(CYAN_SHULKER_BOX.key(), CYAN_SHULKER_BOX);
            modifiable.register(PURPLE_SHULKER_BOX.key(), PURPLE_SHULKER_BOX);
            modifiable.register(BLUE_SHULKER_BOX.key(), BLUE_SHULKER_BOX);
            modifiable.register(BROWN_SHULKER_BOX.key(), BROWN_SHULKER_BOX);
            modifiable.register(GREEN_SHULKER_BOX.key(), GREEN_SHULKER_BOX);
            modifiable.register(RED_SHULKER_BOX.key(), RED_SHULKER_BOX);
            modifiable.register(BLACK_SHULKER_BOX.key(), BLACK_SHULKER_BOX);
            modifiable.register(WHITE_GLAZED_TERRACOTTA.key(), WHITE_GLAZED_TERRACOTTA);
            modifiable.register(ORANGE_GLAZED_TERRACOTTA.key(), ORANGE_GLAZED_TERRACOTTA);
            modifiable.register(MAGENTA_GLAZED_TERRACOTTA.key(), MAGENTA_GLAZED_TERRACOTTA);
            modifiable.register(LIGHT_BLUE_GLAZED_TERRACOTTA.key(), LIGHT_BLUE_GLAZED_TERRACOTTA);
            modifiable.register(YELLOW_GLAZED_TERRACOTTA.key(), YELLOW_GLAZED_TERRACOTTA);
            modifiable.register(LIME_GLAZED_TERRACOTTA.key(), LIME_GLAZED_TERRACOTTA);
            modifiable.register(PINK_GLAZED_TERRACOTTA.key(), PINK_GLAZED_TERRACOTTA);
            modifiable.register(GRAY_GLAZED_TERRACOTTA.key(), GRAY_GLAZED_TERRACOTTA);
            modifiable.register(LIGHT_GRAY_GLAZED_TERRACOTTA.key(), LIGHT_GRAY_GLAZED_TERRACOTTA);
            modifiable.register(CYAN_GLAZED_TERRACOTTA.key(), CYAN_GLAZED_TERRACOTTA);
            modifiable.register(PURPLE_GLAZED_TERRACOTTA.key(), PURPLE_GLAZED_TERRACOTTA);
            modifiable.register(BLUE_GLAZED_TERRACOTTA.key(), BLUE_GLAZED_TERRACOTTA);
            modifiable.register(BROWN_GLAZED_TERRACOTTA.key(), BROWN_GLAZED_TERRACOTTA);
            modifiable.register(GREEN_GLAZED_TERRACOTTA.key(), GREEN_GLAZED_TERRACOTTA);
            modifiable.register(RED_GLAZED_TERRACOTTA.key(), RED_GLAZED_TERRACOTTA);
            modifiable.register(BLACK_GLAZED_TERRACOTTA.key(), BLACK_GLAZED_TERRACOTTA);
            modifiable.register(WHITE_CONCRETE.key(), WHITE_CONCRETE);
            modifiable.register(ORANGE_CONCRETE.key(), ORANGE_CONCRETE);
            modifiable.register(MAGENTA_CONCRETE.key(), MAGENTA_CONCRETE);
            modifiable.register(LIGHT_BLUE_CONCRETE.key(), LIGHT_BLUE_CONCRETE);
            modifiable.register(YELLOW_CONCRETE.key(), YELLOW_CONCRETE);
            modifiable.register(LIME_CONCRETE.key(), LIME_CONCRETE);
            modifiable.register(PINK_CONCRETE.key(), PINK_CONCRETE);
            modifiable.register(GRAY_CONCRETE.key(), GRAY_CONCRETE);
            modifiable.register(LIGHT_GRAY_CONCRETE.key(), LIGHT_GRAY_CONCRETE);
            modifiable.register(CYAN_CONCRETE.key(), CYAN_CONCRETE);
            modifiable.register(PURPLE_CONCRETE.key(), PURPLE_CONCRETE);
            modifiable.register(BLUE_CONCRETE.key(), BLUE_CONCRETE);
            modifiable.register(BROWN_CONCRETE.key(), BROWN_CONCRETE);
            modifiable.register(GREEN_CONCRETE.key(), GREEN_CONCRETE);
            modifiable.register(RED_CONCRETE.key(), RED_CONCRETE);
            modifiable.register(BLACK_CONCRETE.key(), BLACK_CONCRETE);
            modifiable.register(WHITE_CONCRETE_POWDER.key(), WHITE_CONCRETE_POWDER);
            modifiable.register(ORANGE_CONCRETE_POWDER.key(), ORANGE_CONCRETE_POWDER);
            modifiable.register(MAGENTA_CONCRETE_POWDER.key(), MAGENTA_CONCRETE_POWDER);
            modifiable.register(LIGHT_BLUE_CONCRETE_POWDER.key(), LIGHT_BLUE_CONCRETE_POWDER);
            modifiable.register(YELLOW_CONCRETE_POWDER.key(), YELLOW_CONCRETE_POWDER);
            modifiable.register(LIME_CONCRETE_POWDER.key(), LIME_CONCRETE_POWDER);
            modifiable.register(PINK_CONCRETE_POWDER.key(), PINK_CONCRETE_POWDER);
            modifiable.register(GRAY_CONCRETE_POWDER.key(), GRAY_CONCRETE_POWDER);
            modifiable.register(LIGHT_GRAY_CONCRETE_POWDER.key(), LIGHT_GRAY_CONCRETE_POWDER);
            modifiable.register(CYAN_CONCRETE_POWDER.key(), CYAN_CONCRETE_POWDER);
            modifiable.register(PURPLE_CONCRETE_POWDER.key(), PURPLE_CONCRETE_POWDER);
            modifiable.register(BLUE_CONCRETE_POWDER.key(), BLUE_CONCRETE_POWDER);
            modifiable.register(BROWN_CONCRETE_POWDER.key(), BROWN_CONCRETE_POWDER);
            modifiable.register(GREEN_CONCRETE_POWDER.key(), GREEN_CONCRETE_POWDER);
            modifiable.register(RED_CONCRETE_POWDER.key(), RED_CONCRETE_POWDER);
            modifiable.register(BLACK_CONCRETE_POWDER.key(), BLACK_CONCRETE_POWDER);
            modifiable.register(KELP.key(), KELP);
            modifiable.register(KELP_PLANT.key(), KELP_PLANT);
            modifiable.register(DRIED_KELP_BLOCK.key(), DRIED_KELP_BLOCK);
            modifiable.register(TURTLE_EGG.key(), TURTLE_EGG);
            modifiable.register(SNIFFER_EGG.key(), SNIFFER_EGG);
            modifiable.register(DEAD_TUBE_CORAL_BLOCK.key(), DEAD_TUBE_CORAL_BLOCK);
            modifiable.register(DEAD_BRAIN_CORAL_BLOCK.key(), DEAD_BRAIN_CORAL_BLOCK);
            modifiable.register(DEAD_BUBBLE_CORAL_BLOCK.key(), DEAD_BUBBLE_CORAL_BLOCK);
            modifiable.register(DEAD_FIRE_CORAL_BLOCK.key(), DEAD_FIRE_CORAL_BLOCK);
            modifiable.register(DEAD_HORN_CORAL_BLOCK.key(), DEAD_HORN_CORAL_BLOCK);
            modifiable.register(TUBE_CORAL_BLOCK.key(), TUBE_CORAL_BLOCK);
            modifiable.register(BRAIN_CORAL_BLOCK.key(), BRAIN_CORAL_BLOCK);
            modifiable.register(BUBBLE_CORAL_BLOCK.key(), BUBBLE_CORAL_BLOCK);
            modifiable.register(FIRE_CORAL_BLOCK.key(), FIRE_CORAL_BLOCK);
            modifiable.register(HORN_CORAL_BLOCK.key(), HORN_CORAL_BLOCK);
            modifiable.register(DEAD_TUBE_CORAL.key(), DEAD_TUBE_CORAL);
            modifiable.register(DEAD_BRAIN_CORAL.key(), DEAD_BRAIN_CORAL);
            modifiable.register(DEAD_BUBBLE_CORAL.key(), DEAD_BUBBLE_CORAL);
            modifiable.register(DEAD_FIRE_CORAL.key(), DEAD_FIRE_CORAL);
            modifiable.register(DEAD_HORN_CORAL.key(), DEAD_HORN_CORAL);
            modifiable.register(TUBE_CORAL.key(), TUBE_CORAL);
            modifiable.register(BRAIN_CORAL.key(), BRAIN_CORAL);
            modifiable.register(BUBBLE_CORAL.key(), BUBBLE_CORAL);
            modifiable.register(FIRE_CORAL.key(), FIRE_CORAL);
            modifiable.register(HORN_CORAL.key(), HORN_CORAL);
            modifiable.register(DEAD_TUBE_CORAL_FAN.key(), DEAD_TUBE_CORAL_FAN);
            modifiable.register(DEAD_BRAIN_CORAL_FAN.key(), DEAD_BRAIN_CORAL_FAN);
            modifiable.register(DEAD_BUBBLE_CORAL_FAN.key(), DEAD_BUBBLE_CORAL_FAN);
            modifiable.register(DEAD_FIRE_CORAL_FAN.key(), DEAD_FIRE_CORAL_FAN);
            modifiable.register(DEAD_HORN_CORAL_FAN.key(), DEAD_HORN_CORAL_FAN);
            modifiable.register(TUBE_CORAL_FAN.key(), TUBE_CORAL_FAN);
            modifiable.register(BRAIN_CORAL_FAN.key(), BRAIN_CORAL_FAN);
            modifiable.register(BUBBLE_CORAL_FAN.key(), BUBBLE_CORAL_FAN);
            modifiable.register(FIRE_CORAL_FAN.key(), FIRE_CORAL_FAN);
            modifiable.register(HORN_CORAL_FAN.key(), HORN_CORAL_FAN);
            modifiable.register(DEAD_TUBE_CORAL_WALL_FAN.key(), DEAD_TUBE_CORAL_WALL_FAN);
            modifiable.register(DEAD_BRAIN_CORAL_WALL_FAN.key(), DEAD_BRAIN_CORAL_WALL_FAN);
            modifiable.register(DEAD_BUBBLE_CORAL_WALL_FAN.key(), DEAD_BUBBLE_CORAL_WALL_FAN);
            modifiable.register(DEAD_FIRE_CORAL_WALL_FAN.key(), DEAD_FIRE_CORAL_WALL_FAN);
            modifiable.register(DEAD_HORN_CORAL_WALL_FAN.key(), DEAD_HORN_CORAL_WALL_FAN);
            modifiable.register(TUBE_CORAL_WALL_FAN.key(), TUBE_CORAL_WALL_FAN);
            modifiable.register(BRAIN_CORAL_WALL_FAN.key(), BRAIN_CORAL_WALL_FAN);
            modifiable.register(BUBBLE_CORAL_WALL_FAN.key(), BUBBLE_CORAL_WALL_FAN);
            modifiable.register(FIRE_CORAL_WALL_FAN.key(), FIRE_CORAL_WALL_FAN);
            modifiable.register(HORN_CORAL_WALL_FAN.key(), HORN_CORAL_WALL_FAN);
            modifiable.register(SEA_PICKLE.key(), SEA_PICKLE);
            modifiable.register(BLUE_ICE.key(), BLUE_ICE);
            modifiable.register(CONDUIT.key(), CONDUIT);
            modifiable.register(BAMBOO_SAPLING.key(), BAMBOO_SAPLING);
            modifiable.register(BAMBOO.key(), BAMBOO);
            modifiable.register(POTTED_BAMBOO.key(), POTTED_BAMBOO);
            modifiable.register(VOID_AIR.key(), VOID_AIR);
            modifiable.register(CAVE_AIR.key(), CAVE_AIR);
            modifiable.register(BUBBLE_COLUMN.key(), BUBBLE_COLUMN);
            modifiable.register(POLISHED_GRANITE_STAIRS.key(), POLISHED_GRANITE_STAIRS);
            modifiable.register(SMOOTH_RED_SANDSTONE_STAIRS.key(), SMOOTH_RED_SANDSTONE_STAIRS);
            modifiable.register(MOSSY_STONE_BRICK_STAIRS.key(), MOSSY_STONE_BRICK_STAIRS);
            modifiable.register(POLISHED_DIORITE_STAIRS.key(), POLISHED_DIORITE_STAIRS);
            modifiable.register(MOSSY_COBBLESTONE_STAIRS.key(), MOSSY_COBBLESTONE_STAIRS);
            modifiable.register(END_STONE_BRICK_STAIRS.key(), END_STONE_BRICK_STAIRS);
            modifiable.register(STONE_STAIRS.key(), STONE_STAIRS);
            modifiable.register(SMOOTH_SANDSTONE_STAIRS.key(), SMOOTH_SANDSTONE_STAIRS);
            modifiable.register(SMOOTH_QUARTZ_STAIRS.key(), SMOOTH_QUARTZ_STAIRS);
            modifiable.register(GRANITE_STAIRS.key(), GRANITE_STAIRS);
            modifiable.register(ANDESITE_STAIRS.key(), ANDESITE_STAIRS);
            modifiable.register(RED_NETHER_BRICK_STAIRS.key(), RED_NETHER_BRICK_STAIRS);
            modifiable.register(POLISHED_ANDESITE_STAIRS.key(), POLISHED_ANDESITE_STAIRS);
            modifiable.register(DIORITE_STAIRS.key(), DIORITE_STAIRS);
            modifiable.register(POLISHED_GRANITE_SLAB.key(), POLISHED_GRANITE_SLAB);
            modifiable.register(SMOOTH_RED_SANDSTONE_SLAB.key(), SMOOTH_RED_SANDSTONE_SLAB);
            modifiable.register(MOSSY_STONE_BRICK_SLAB.key(), MOSSY_STONE_BRICK_SLAB);
            modifiable.register(POLISHED_DIORITE_SLAB.key(), POLISHED_DIORITE_SLAB);
            modifiable.register(MOSSY_COBBLESTONE_SLAB.key(), MOSSY_COBBLESTONE_SLAB);
            modifiable.register(END_STONE_BRICK_SLAB.key(), END_STONE_BRICK_SLAB);
            modifiable.register(SMOOTH_SANDSTONE_SLAB.key(), SMOOTH_SANDSTONE_SLAB);
            modifiable.register(SMOOTH_QUARTZ_SLAB.key(), SMOOTH_QUARTZ_SLAB);
            modifiable.register(GRANITE_SLAB.key(), GRANITE_SLAB);
            modifiable.register(ANDESITE_SLAB.key(), ANDESITE_SLAB);
            modifiable.register(RED_NETHER_BRICK_SLAB.key(), RED_NETHER_BRICK_SLAB);
            modifiable.register(POLISHED_ANDESITE_SLAB.key(), POLISHED_ANDESITE_SLAB);
            modifiable.register(DIORITE_SLAB.key(), DIORITE_SLAB);
            modifiable.register(BRICK_WALL.key(), BRICK_WALL);
            modifiable.register(PRISMARINE_WALL.key(), PRISMARINE_WALL);
            modifiable.register(RED_SANDSTONE_WALL.key(), RED_SANDSTONE_WALL);
            modifiable.register(MOSSY_STONE_BRICK_WALL.key(), MOSSY_STONE_BRICK_WALL);
            modifiable.register(GRANITE_WALL.key(), GRANITE_WALL);
            modifiable.register(STONE_BRICK_WALL.key(), STONE_BRICK_WALL);
            modifiable.register(MUD_BRICK_WALL.key(), MUD_BRICK_WALL);
            modifiable.register(NETHER_BRICK_WALL.key(), NETHER_BRICK_WALL);
            modifiable.register(ANDESITE_WALL.key(), ANDESITE_WALL);
            modifiable.register(RED_NETHER_BRICK_WALL.key(), RED_NETHER_BRICK_WALL);
            modifiable.register(SANDSTONE_WALL.key(), SANDSTONE_WALL);
            modifiable.register(END_STONE_BRICK_WALL.key(), END_STONE_BRICK_WALL);
            modifiable.register(DIORITE_WALL.key(), DIORITE_WALL);
            modifiable.register(SCAFFOLDING.key(), SCAFFOLDING);
            modifiable.register(LOOM.key(), LOOM);
            modifiable.register(BARREL.key(), BARREL);
            modifiable.register(SMOKER.key(), SMOKER);
            modifiable.register(BLAST_FURNACE.key(), BLAST_FURNACE);
            modifiable.register(CARTOGRAPHY_TABLE.key(), CARTOGRAPHY_TABLE);
            modifiable.register(FLETCHING_TABLE.key(), FLETCHING_TABLE);
            modifiable.register(GRINDSTONE.key(), GRINDSTONE);
            modifiable.register(LECTERN.key(), LECTERN);
            modifiable.register(SMITHING_TABLE.key(), SMITHING_TABLE);
            modifiable.register(STONECUTTER.key(), STONECUTTER);
            modifiable.register(BELL.key(), BELL);
            modifiable.register(LANTERN.key(), LANTERN);
            modifiable.register(SOUL_LANTERN.key(), SOUL_LANTERN);
            modifiable.register(CAMPFIRE.key(), CAMPFIRE);
            modifiable.register(SOUL_CAMPFIRE.key(), SOUL_CAMPFIRE);
            modifiable.register(SWEET_BERRY_BUSH.key(), SWEET_BERRY_BUSH);
            modifiable.register(WARPED_STEM.key(), WARPED_STEM);
            modifiable.register(STRIPPED_WARPED_STEM.key(), STRIPPED_WARPED_STEM);
            modifiable.register(WARPED_HYPHAE.key(), WARPED_HYPHAE);
            modifiable.register(STRIPPED_WARPED_HYPHAE.key(), STRIPPED_WARPED_HYPHAE);
            modifiable.register(WARPED_NYLIUM.key(), WARPED_NYLIUM);
            modifiable.register(WARPED_FUNGUS.key(), WARPED_FUNGUS);
            modifiable.register(WARPED_WART_BLOCK.key(), WARPED_WART_BLOCK);
            modifiable.register(WARPED_ROOTS.key(), WARPED_ROOTS);
            modifiable.register(NETHER_SPROUTS.key(), NETHER_SPROUTS);
            modifiable.register(CRIMSON_STEM.key(), CRIMSON_STEM);
            modifiable.register(STRIPPED_CRIMSON_STEM.key(), STRIPPED_CRIMSON_STEM);
            modifiable.register(CRIMSON_HYPHAE.key(), CRIMSON_HYPHAE);
            modifiable.register(STRIPPED_CRIMSON_HYPHAE.key(), STRIPPED_CRIMSON_HYPHAE);
            modifiable.register(CRIMSON_NYLIUM.key(), CRIMSON_NYLIUM);
            modifiable.register(CRIMSON_FUNGUS.key(), CRIMSON_FUNGUS);
            modifiable.register(SHROOMLIGHT.key(), SHROOMLIGHT);
            modifiable.register(WEEPING_VINES.key(), WEEPING_VINES);
            modifiable.register(WEEPING_VINES_PLANT.key(), WEEPING_VINES_PLANT);
            modifiable.register(TWISTING_VINES.key(), TWISTING_VINES);
            modifiable.register(TWISTING_VINES_PLANT.key(), TWISTING_VINES_PLANT);
            modifiable.register(CRIMSON_ROOTS.key(), CRIMSON_ROOTS);
            modifiable.register(CRIMSON_PLANKS.key(), CRIMSON_PLANKS);
            modifiable.register(WARPED_PLANKS.key(), WARPED_PLANKS);
            modifiable.register(CRIMSON_SLAB.key(), CRIMSON_SLAB);
            modifiable.register(WARPED_SLAB.key(), WARPED_SLAB);
            modifiable.register(CRIMSON_PRESSURE_PLATE.key(), CRIMSON_PRESSURE_PLATE);
            modifiable.register(WARPED_PRESSURE_PLATE.key(), WARPED_PRESSURE_PLATE);
            modifiable.register(CRIMSON_FENCE.key(), CRIMSON_FENCE);
            modifiable.register(WARPED_FENCE.key(), WARPED_FENCE);
            modifiable.register(CRIMSON_TRAPDOOR.key(), CRIMSON_TRAPDOOR);
            modifiable.register(WARPED_TRAPDOOR.key(), WARPED_TRAPDOOR);
            modifiable.register(CRIMSON_FENCE_GATE.key(), CRIMSON_FENCE_GATE);
            modifiable.register(WARPED_FENCE_GATE.key(), WARPED_FENCE_GATE);
            modifiable.register(CRIMSON_STAIRS.key(), CRIMSON_STAIRS);
            modifiable.register(WARPED_STAIRS.key(), WARPED_STAIRS);
            modifiable.register(CRIMSON_BUTTON.key(), CRIMSON_BUTTON);
            modifiable.register(WARPED_BUTTON.key(), WARPED_BUTTON);
            modifiable.register(CRIMSON_DOOR.key(), CRIMSON_DOOR);
            modifiable.register(WARPED_DOOR.key(), WARPED_DOOR);
            modifiable.register(CRIMSON_SIGN.key(), CRIMSON_SIGN);
            modifiable.register(WARPED_SIGN.key(), WARPED_SIGN);
            modifiable.register(CRIMSON_WALL_SIGN.key(), CRIMSON_WALL_SIGN);
            modifiable.register(WARPED_WALL_SIGN.key(), WARPED_WALL_SIGN);
            modifiable.register(STRUCTURE_BLOCK.key(), STRUCTURE_BLOCK);
            modifiable.register(JIGSAW.key(), JIGSAW);
            modifiable.register(TEST_BLOCK.key(), TEST_BLOCK);
            modifiable.register(TEST_INSTANCE_BLOCK.key(), TEST_INSTANCE_BLOCK);
            modifiable.register(COMPOSTER.key(), COMPOSTER);
            modifiable.register(TARGET.key(), TARGET);
            modifiable.register(BEE_NEST.key(), BEE_NEST);
            modifiable.register(BEEHIVE.key(), BEEHIVE);
            modifiable.register(HONEY_BLOCK.key(), HONEY_BLOCK);
            modifiable.register(HONEYCOMB_BLOCK.key(), HONEYCOMB_BLOCK);
            modifiable.register(NETHERITE_BLOCK.key(), NETHERITE_BLOCK);
            modifiable.register(ANCIENT_DEBRIS.key(), ANCIENT_DEBRIS);
            modifiable.register(CRYING_OBSIDIAN.key(), CRYING_OBSIDIAN);
            modifiable.register(RESPAWN_ANCHOR.key(), RESPAWN_ANCHOR);
            modifiable.register(POTTED_CRIMSON_FUNGUS.key(), POTTED_CRIMSON_FUNGUS);
            modifiable.register(POTTED_WARPED_FUNGUS.key(), POTTED_WARPED_FUNGUS);
            modifiable.register(POTTED_CRIMSON_ROOTS.key(), POTTED_CRIMSON_ROOTS);
            modifiable.register(POTTED_WARPED_ROOTS.key(), POTTED_WARPED_ROOTS);
            modifiable.register(LODESTONE.key(), LODESTONE);
            modifiable.register(BLACKSTONE.key(), BLACKSTONE);
            modifiable.register(BLACKSTONE_STAIRS.key(), BLACKSTONE_STAIRS);
            modifiable.register(BLACKSTONE_WALL.key(), BLACKSTONE_WALL);
            modifiable.register(BLACKSTONE_SLAB.key(), BLACKSTONE_SLAB);
            modifiable.register(POLISHED_BLACKSTONE.key(), POLISHED_BLACKSTONE);
            modifiable.register(POLISHED_BLACKSTONE_BRICKS.key(), POLISHED_BLACKSTONE_BRICKS);
            modifiable.register(CRACKED_POLISHED_BLACKSTONE_BRICKS.key(), CRACKED_POLISHED_BLACKSTONE_BRICKS);
            modifiable.register(CHISELED_POLISHED_BLACKSTONE.key(), CHISELED_POLISHED_BLACKSTONE);
            modifiable.register(POLISHED_BLACKSTONE_BRICK_SLAB.key(), POLISHED_BLACKSTONE_BRICK_SLAB);
            modifiable.register(POLISHED_BLACKSTONE_BRICK_STAIRS.key(), POLISHED_BLACKSTONE_BRICK_STAIRS);
            modifiable.register(POLISHED_BLACKSTONE_BRICK_WALL.key(), POLISHED_BLACKSTONE_BRICK_WALL);
            modifiable.register(GILDED_BLACKSTONE.key(), GILDED_BLACKSTONE);
            modifiable.register(POLISHED_BLACKSTONE_STAIRS.key(), POLISHED_BLACKSTONE_STAIRS);
            modifiable.register(POLISHED_BLACKSTONE_SLAB.key(), POLISHED_BLACKSTONE_SLAB);
            modifiable.register(POLISHED_BLACKSTONE_PRESSURE_PLATE.key(), POLISHED_BLACKSTONE_PRESSURE_PLATE);
            modifiable.register(POLISHED_BLACKSTONE_BUTTON.key(), POLISHED_BLACKSTONE_BUTTON);
            modifiable.register(POLISHED_BLACKSTONE_WALL.key(), POLISHED_BLACKSTONE_WALL);
            modifiable.register(CHISELED_NETHER_BRICKS.key(), CHISELED_NETHER_BRICKS);
            modifiable.register(CRACKED_NETHER_BRICKS.key(), CRACKED_NETHER_BRICKS);
            modifiable.register(QUARTZ_BRICKS.key(), QUARTZ_BRICKS);
            modifiable.register(CANDLE.key(), CANDLE);
            modifiable.register(WHITE_CANDLE.key(), WHITE_CANDLE);
            modifiable.register(ORANGE_CANDLE.key(), ORANGE_CANDLE);
            modifiable.register(MAGENTA_CANDLE.key(), MAGENTA_CANDLE);
            modifiable.register(LIGHT_BLUE_CANDLE.key(), LIGHT_BLUE_CANDLE);
            modifiable.register(YELLOW_CANDLE.key(), YELLOW_CANDLE);
            modifiable.register(LIME_CANDLE.key(), LIME_CANDLE);
            modifiable.register(PINK_CANDLE.key(), PINK_CANDLE);
            modifiable.register(GRAY_CANDLE.key(), GRAY_CANDLE);
            modifiable.register(LIGHT_GRAY_CANDLE.key(), LIGHT_GRAY_CANDLE);
            modifiable.register(CYAN_CANDLE.key(), CYAN_CANDLE);
            modifiable.register(PURPLE_CANDLE.key(), PURPLE_CANDLE);
            modifiable.register(BLUE_CANDLE.key(), BLUE_CANDLE);
            modifiable.register(BROWN_CANDLE.key(), BROWN_CANDLE);
            modifiable.register(GREEN_CANDLE.key(), GREEN_CANDLE);
            modifiable.register(RED_CANDLE.key(), RED_CANDLE);
            modifiable.register(BLACK_CANDLE.key(), BLACK_CANDLE);
            modifiable.register(CANDLE_CAKE.key(), CANDLE_CAKE);
            modifiable.register(WHITE_CANDLE_CAKE.key(), WHITE_CANDLE_CAKE);
            modifiable.register(ORANGE_CANDLE_CAKE.key(), ORANGE_CANDLE_CAKE);
            modifiable.register(MAGENTA_CANDLE_CAKE.key(), MAGENTA_CANDLE_CAKE);
            modifiable.register(LIGHT_BLUE_CANDLE_CAKE.key(), LIGHT_BLUE_CANDLE_CAKE);
            modifiable.register(YELLOW_CANDLE_CAKE.key(), YELLOW_CANDLE_CAKE);
            modifiable.register(LIME_CANDLE_CAKE.key(), LIME_CANDLE_CAKE);
            modifiable.register(PINK_CANDLE_CAKE.key(), PINK_CANDLE_CAKE);
            modifiable.register(GRAY_CANDLE_CAKE.key(), GRAY_CANDLE_CAKE);
            modifiable.register(LIGHT_GRAY_CANDLE_CAKE.key(), LIGHT_GRAY_CANDLE_CAKE);
            modifiable.register(CYAN_CANDLE_CAKE.key(), CYAN_CANDLE_CAKE);
            modifiable.register(PURPLE_CANDLE_CAKE.key(), PURPLE_CANDLE_CAKE);
            modifiable.register(BLUE_CANDLE_CAKE.key(), BLUE_CANDLE_CAKE);
            modifiable.register(BROWN_CANDLE_CAKE.key(), BROWN_CANDLE_CAKE);
            modifiable.register(GREEN_CANDLE_CAKE.key(), GREEN_CANDLE_CAKE);
            modifiable.register(RED_CANDLE_CAKE.key(), RED_CANDLE_CAKE);
            modifiable.register(BLACK_CANDLE_CAKE.key(), BLACK_CANDLE_CAKE);
            modifiable.register(AMETHYST_BLOCK.key(), AMETHYST_BLOCK);
            modifiable.register(BUDDING_AMETHYST.key(), BUDDING_AMETHYST);
            modifiable.register(AMETHYST_CLUSTER.key(), AMETHYST_CLUSTER);
            modifiable.register(LARGE_AMETHYST_BUD.key(), LARGE_AMETHYST_BUD);
            modifiable.register(MEDIUM_AMETHYST_BUD.key(), MEDIUM_AMETHYST_BUD);
            modifiable.register(SMALL_AMETHYST_BUD.key(), SMALL_AMETHYST_BUD);
            modifiable.register(TUFF.key(), TUFF);
            modifiable.register(TUFF_SLAB.key(), TUFF_SLAB);
            modifiable.register(TUFF_STAIRS.key(), TUFF_STAIRS);
            modifiable.register(TUFF_WALL.key(), TUFF_WALL);
            modifiable.register(POLISHED_TUFF.key(), POLISHED_TUFF);
            modifiable.register(POLISHED_TUFF_SLAB.key(), POLISHED_TUFF_SLAB);
            modifiable.register(POLISHED_TUFF_STAIRS.key(), POLISHED_TUFF_STAIRS);
            modifiable.register(POLISHED_TUFF_WALL.key(), POLISHED_TUFF_WALL);
            modifiable.register(CHISELED_TUFF.key(), CHISELED_TUFF);
            modifiable.register(TUFF_BRICKS.key(), TUFF_BRICKS);
            modifiable.register(TUFF_BRICK_SLAB.key(), TUFF_BRICK_SLAB);
            modifiable.register(TUFF_BRICK_STAIRS.key(), TUFF_BRICK_STAIRS);
            modifiable.register(TUFF_BRICK_WALL.key(), TUFF_BRICK_WALL);
            modifiable.register(CHISELED_TUFF_BRICKS.key(), CHISELED_TUFF_BRICKS);
            modifiable.register(CALCITE.key(), CALCITE);
            modifiable.register(TINTED_GLASS.key(), TINTED_GLASS);
            modifiable.register(POWDER_SNOW.key(), POWDER_SNOW);
            modifiable.register(SCULK_SENSOR.key(), SCULK_SENSOR);
            modifiable.register(CALIBRATED_SCULK_SENSOR.key(), CALIBRATED_SCULK_SENSOR);
            modifiable.register(SCULK.key(), SCULK);
            modifiable.register(SCULK_VEIN.key(), SCULK_VEIN);
            modifiable.register(SCULK_CATALYST.key(), SCULK_CATALYST);
            modifiable.register(SCULK_SHRIEKER.key(), SCULK_SHRIEKER);
            modifiable.register(COPPER_BLOCK.key(), COPPER_BLOCK);
            modifiable.register(EXPOSED_COPPER.key(), EXPOSED_COPPER);
            modifiable.register(WEATHERED_COPPER.key(), WEATHERED_COPPER);
            modifiable.register(OXIDIZED_COPPER.key(), OXIDIZED_COPPER);
            modifiable.register(COPPER_ORE.key(), COPPER_ORE);
            modifiable.register(DEEPSLATE_COPPER_ORE.key(), DEEPSLATE_COPPER_ORE);
            modifiable.register(OXIDIZED_CUT_COPPER.key(), OXIDIZED_CUT_COPPER);
            modifiable.register(WEATHERED_CUT_COPPER.key(), WEATHERED_CUT_COPPER);
            modifiable.register(EXPOSED_CUT_COPPER.key(), EXPOSED_CUT_COPPER);
            modifiable.register(CUT_COPPER.key(), CUT_COPPER);
            modifiable.register(OXIDIZED_CHISELED_COPPER.key(), OXIDIZED_CHISELED_COPPER);
            modifiable.register(WEATHERED_CHISELED_COPPER.key(), WEATHERED_CHISELED_COPPER);
            modifiable.register(EXPOSED_CHISELED_COPPER.key(), EXPOSED_CHISELED_COPPER);
            modifiable.register(CHISELED_COPPER.key(), CHISELED_COPPER);
            modifiable.register(WAXED_OXIDIZED_CHISELED_COPPER.key(), WAXED_OXIDIZED_CHISELED_COPPER);
            modifiable.register(WAXED_WEATHERED_CHISELED_COPPER.key(), WAXED_WEATHERED_CHISELED_COPPER);
            modifiable.register(WAXED_EXPOSED_CHISELED_COPPER.key(), WAXED_EXPOSED_CHISELED_COPPER);
            modifiable.register(WAXED_CHISELED_COPPER.key(), WAXED_CHISELED_COPPER);
            modifiable.register(OXIDIZED_CUT_COPPER_STAIRS.key(), OXIDIZED_CUT_COPPER_STAIRS);
            modifiable.register(WEATHERED_CUT_COPPER_STAIRS.key(), WEATHERED_CUT_COPPER_STAIRS);
            modifiable.register(EXPOSED_CUT_COPPER_STAIRS.key(), EXPOSED_CUT_COPPER_STAIRS);
            modifiable.register(CUT_COPPER_STAIRS.key(), CUT_COPPER_STAIRS);
            modifiable.register(OXIDIZED_CUT_COPPER_SLAB.key(), OXIDIZED_CUT_COPPER_SLAB);
            modifiable.register(WEATHERED_CUT_COPPER_SLAB.key(), WEATHERED_CUT_COPPER_SLAB);
            modifiable.register(EXPOSED_CUT_COPPER_SLAB.key(), EXPOSED_CUT_COPPER_SLAB);
            modifiable.register(CUT_COPPER_SLAB.key(), CUT_COPPER_SLAB);
            modifiable.register(WAXED_COPPER_BLOCK.key(), WAXED_COPPER_BLOCK);
            modifiable.register(WAXED_WEATHERED_COPPER.key(), WAXED_WEATHERED_COPPER);
            modifiable.register(WAXED_EXPOSED_COPPER.key(), WAXED_EXPOSED_COPPER);
            modifiable.register(WAXED_OXIDIZED_COPPER.key(), WAXED_OXIDIZED_COPPER);
            modifiable.register(WAXED_OXIDIZED_CUT_COPPER.key(), WAXED_OXIDIZED_CUT_COPPER);
            modifiable.register(WAXED_WEATHERED_CUT_COPPER.key(), WAXED_WEATHERED_CUT_COPPER);
            modifiable.register(WAXED_EXPOSED_CUT_COPPER.key(), WAXED_EXPOSED_CUT_COPPER);
            modifiable.register(WAXED_CUT_COPPER.key(), WAXED_CUT_COPPER);
            modifiable.register(WAXED_OXIDIZED_CUT_COPPER_STAIRS.key(), WAXED_OXIDIZED_CUT_COPPER_STAIRS);
            modifiable.register(WAXED_WEATHERED_CUT_COPPER_STAIRS.key(), WAXED_WEATHERED_CUT_COPPER_STAIRS);
            modifiable.register(WAXED_EXPOSED_CUT_COPPER_STAIRS.key(), WAXED_EXPOSED_CUT_COPPER_STAIRS);
            modifiable.register(WAXED_CUT_COPPER_STAIRS.key(), WAXED_CUT_COPPER_STAIRS);
            modifiable.register(WAXED_OXIDIZED_CUT_COPPER_SLAB.key(), WAXED_OXIDIZED_CUT_COPPER_SLAB);
            modifiable.register(WAXED_WEATHERED_CUT_COPPER_SLAB.key(), WAXED_WEATHERED_CUT_COPPER_SLAB);
            modifiable.register(WAXED_EXPOSED_CUT_COPPER_SLAB.key(), WAXED_EXPOSED_CUT_COPPER_SLAB);
            modifiable.register(WAXED_CUT_COPPER_SLAB.key(), WAXED_CUT_COPPER_SLAB);
            modifiable.register(COPPER_DOOR.key(), COPPER_DOOR);
            modifiable.register(EXPOSED_COPPER_DOOR.key(), EXPOSED_COPPER_DOOR);
            modifiable.register(OXIDIZED_COPPER_DOOR.key(), OXIDIZED_COPPER_DOOR);
            modifiable.register(WEATHERED_COPPER_DOOR.key(), WEATHERED_COPPER_DOOR);
            modifiable.register(WAXED_COPPER_DOOR.key(), WAXED_COPPER_DOOR);
            modifiable.register(WAXED_EXPOSED_COPPER_DOOR.key(), WAXED_EXPOSED_COPPER_DOOR);
            modifiable.register(WAXED_OXIDIZED_COPPER_DOOR.key(), WAXED_OXIDIZED_COPPER_DOOR);
            modifiable.register(WAXED_WEATHERED_COPPER_DOOR.key(), WAXED_WEATHERED_COPPER_DOOR);
            modifiable.register(COPPER_TRAPDOOR.key(), COPPER_TRAPDOOR);
            modifiable.register(EXPOSED_COPPER_TRAPDOOR.key(), EXPOSED_COPPER_TRAPDOOR);
            modifiable.register(OXIDIZED_COPPER_TRAPDOOR.key(), OXIDIZED_COPPER_TRAPDOOR);
            modifiable.register(WEATHERED_COPPER_TRAPDOOR.key(), WEATHERED_COPPER_TRAPDOOR);
            modifiable.register(WAXED_COPPER_TRAPDOOR.key(), WAXED_COPPER_TRAPDOOR);
            modifiable.register(WAXED_EXPOSED_COPPER_TRAPDOOR.key(), WAXED_EXPOSED_COPPER_TRAPDOOR);
            modifiable.register(WAXED_OXIDIZED_COPPER_TRAPDOOR.key(), WAXED_OXIDIZED_COPPER_TRAPDOOR);
            modifiable.register(WAXED_WEATHERED_COPPER_TRAPDOOR.key(), WAXED_WEATHERED_COPPER_TRAPDOOR);
            modifiable.register(COPPER_GRATE.key(), COPPER_GRATE);
            modifiable.register(EXPOSED_COPPER_GRATE.key(), EXPOSED_COPPER_GRATE);
            modifiable.register(WEATHERED_COPPER_GRATE.key(), WEATHERED_COPPER_GRATE);
            modifiable.register(OXIDIZED_COPPER_GRATE.key(), OXIDIZED_COPPER_GRATE);
            modifiable.register(WAXED_COPPER_GRATE.key(), WAXED_COPPER_GRATE);
            modifiable.register(WAXED_EXPOSED_COPPER_GRATE.key(), WAXED_EXPOSED_COPPER_GRATE);
            modifiable.register(WAXED_WEATHERED_COPPER_GRATE.key(), WAXED_WEATHERED_COPPER_GRATE);
            modifiable.register(WAXED_OXIDIZED_COPPER_GRATE.key(), WAXED_OXIDIZED_COPPER_GRATE);
            modifiable.register(COPPER_BULB.key(), COPPER_BULB);
            modifiable.register(EXPOSED_COPPER_BULB.key(), EXPOSED_COPPER_BULB);
            modifiable.register(WEATHERED_COPPER_BULB.key(), WEATHERED_COPPER_BULB);
            modifiable.register(OXIDIZED_COPPER_BULB.key(), OXIDIZED_COPPER_BULB);
            modifiable.register(WAXED_COPPER_BULB.key(), WAXED_COPPER_BULB);
            modifiable.register(WAXED_EXPOSED_COPPER_BULB.key(), WAXED_EXPOSED_COPPER_BULB);
            modifiable.register(WAXED_WEATHERED_COPPER_BULB.key(), WAXED_WEATHERED_COPPER_BULB);
            modifiable.register(WAXED_OXIDIZED_COPPER_BULB.key(), WAXED_OXIDIZED_COPPER_BULB);
            modifiable.register(LIGHTNING_ROD.key(), LIGHTNING_ROD);
            modifiable.register(POINTED_DRIPSTONE.key(), POINTED_DRIPSTONE);
            modifiable.register(DRIPSTONE_BLOCK.key(), DRIPSTONE_BLOCK);
            modifiable.register(CAVE_VINES.key(), CAVE_VINES);
            modifiable.register(CAVE_VINES_PLANT.key(), CAVE_VINES_PLANT);
            modifiable.register(SPORE_BLOSSOM.key(), SPORE_BLOSSOM);
            modifiable.register(AZALEA.key(), AZALEA);
            modifiable.register(FLOWERING_AZALEA.key(), FLOWERING_AZALEA);
            modifiable.register(MOSS_CARPET.key(), MOSS_CARPET);
            modifiable.register(PINK_PETALS.key(), PINK_PETALS);
            modifiable.register(WILDFLOWERS.key(), WILDFLOWERS);
            modifiable.register(LEAF_LITTER.key(), LEAF_LITTER);
            modifiable.register(MOSS_BLOCK.key(), MOSS_BLOCK);
            modifiable.register(BIG_DRIPLEAF.key(), BIG_DRIPLEAF);
            modifiable.register(BIG_DRIPLEAF_STEM.key(), BIG_DRIPLEAF_STEM);
            modifiable.register(SMALL_DRIPLEAF.key(), SMALL_DRIPLEAF);
            modifiable.register(HANGING_ROOTS.key(), HANGING_ROOTS);
            modifiable.register(ROOTED_DIRT.key(), ROOTED_DIRT);
            modifiable.register(MUD.key(), MUD);
            modifiable.register(DEEPSLATE.key(), DEEPSLATE);
            modifiable.register(COBBLED_DEEPSLATE.key(), COBBLED_DEEPSLATE);
            modifiable.register(COBBLED_DEEPSLATE_STAIRS.key(), COBBLED_DEEPSLATE_STAIRS);
            modifiable.register(COBBLED_DEEPSLATE_SLAB.key(), COBBLED_DEEPSLATE_SLAB);
            modifiable.register(COBBLED_DEEPSLATE_WALL.key(), COBBLED_DEEPSLATE_WALL);
            modifiable.register(POLISHED_DEEPSLATE.key(), POLISHED_DEEPSLATE);
            modifiable.register(POLISHED_DEEPSLATE_STAIRS.key(), POLISHED_DEEPSLATE_STAIRS);
            modifiable.register(POLISHED_DEEPSLATE_SLAB.key(), POLISHED_DEEPSLATE_SLAB);
            modifiable.register(POLISHED_DEEPSLATE_WALL.key(), POLISHED_DEEPSLATE_WALL);
            modifiable.register(DEEPSLATE_TILES.key(), DEEPSLATE_TILES);
            modifiable.register(DEEPSLATE_TILE_STAIRS.key(), DEEPSLATE_TILE_STAIRS);
            modifiable.register(DEEPSLATE_TILE_SLAB.key(), DEEPSLATE_TILE_SLAB);
            modifiable.register(DEEPSLATE_TILE_WALL.key(), DEEPSLATE_TILE_WALL);
            modifiable.register(DEEPSLATE_BRICKS.key(), DEEPSLATE_BRICKS);
            modifiable.register(DEEPSLATE_BRICK_STAIRS.key(), DEEPSLATE_BRICK_STAIRS);
            modifiable.register(DEEPSLATE_BRICK_SLAB.key(), DEEPSLATE_BRICK_SLAB);
            modifiable.register(DEEPSLATE_BRICK_WALL.key(), DEEPSLATE_BRICK_WALL);
            modifiable.register(CHISELED_DEEPSLATE.key(), CHISELED_DEEPSLATE);
            modifiable.register(CRACKED_DEEPSLATE_BRICKS.key(), CRACKED_DEEPSLATE_BRICKS);
            modifiable.register(CRACKED_DEEPSLATE_TILES.key(), CRACKED_DEEPSLATE_TILES);
            modifiable.register(INFESTED_DEEPSLATE.key(), INFESTED_DEEPSLATE);
            modifiable.register(SMOOTH_BASALT.key(), SMOOTH_BASALT);
            modifiable.register(RAW_IRON_BLOCK.key(), RAW_IRON_BLOCK);
            modifiable.register(RAW_COPPER_BLOCK.key(), RAW_COPPER_BLOCK);
            modifiable.register(RAW_GOLD_BLOCK.key(), RAW_GOLD_BLOCK);
            modifiable.register(POTTED_AZALEA_BUSH.key(), POTTED_AZALEA_BUSH);
            modifiable.register(POTTED_FLOWERING_AZALEA_BUSH.key(), POTTED_FLOWERING_AZALEA_BUSH);
            modifiable.register(OCHRE_FROGLIGHT.key(), OCHRE_FROGLIGHT);
            modifiable.register(VERDANT_FROGLIGHT.key(), VERDANT_FROGLIGHT);
            modifiable.register(PEARLESCENT_FROGLIGHT.key(), PEARLESCENT_FROGLIGHT);
            modifiable.register(FROGSPAWN.key(), FROGSPAWN);
            modifiable.register(REINFORCED_DEEPSLATE.key(), REINFORCED_DEEPSLATE);
            modifiable.register(DECORATED_POT.key(), DECORATED_POT);
            modifiable.register(CRAFTER.key(), CRAFTER);
            modifiable.register(TRIAL_SPAWNER.key(), TRIAL_SPAWNER);
            modifiable.register(VAULT.key(), VAULT);
            modifiable.register(HEAVY_CORE.key(), HEAVY_CORE);
            modifiable.register(PALE_MOSS_BLOCK.key(), PALE_MOSS_BLOCK);
            modifiable.register(PALE_MOSS_CARPET.key(), PALE_MOSS_CARPET);
            modifiable.register(PALE_HANGING_MOSS.key(), PALE_HANGING_MOSS);
            modifiable.register(OPEN_EYEBLOSSOM.key(), OPEN_EYEBLOSSOM);
            modifiable.register(CLOSED_EYEBLOSSOM.key(), CLOSED_EYEBLOSSOM);
            modifiable.register(POTTED_OPEN_EYEBLOSSOM.key(), POTTED_OPEN_EYEBLOSSOM);
            modifiable.register(POTTED_CLOSED_EYEBLOSSOM.key(), POTTED_CLOSED_EYEBLOSSOM);
            modifiable.register(FIREFLY_BUSH.key(), FIREFLY_BUSH);
        });
    }
}
