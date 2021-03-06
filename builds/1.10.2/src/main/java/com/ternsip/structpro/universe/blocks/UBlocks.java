package com.ternsip.structpro.universe.blocks;

import com.ternsip.structpro.logic.Configurator;
import com.ternsip.structpro.universe.utils.Report;
import com.ternsip.structpro.universe.utils.Selector;
import com.ternsip.structpro.universe.utils.Utils;
import net.minecraft.init.Blocks;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Blocks wrapper
 * @author Ternsip
 */
@SuppressWarnings({"WeakerAccess"})
public class UBlocks {

    public static final UBlock AIR = new UBlock(Blocks.AIR);
    public static final UBlock STONE = new UBlock(Blocks.STONE);
    public static final UBlock GRASS = new UBlock(Blocks.GRASS);
    public static final UBlock DIRT = new UBlock(Blocks.DIRT);
    public static final UBlock COBBLESTONE = new UBlock(Blocks.COBBLESTONE);
    public static final UBlock PLANKS = new UBlock(Blocks.PLANKS);
    public static final UBlock SAPLING = new UBlock(Blocks.SAPLING);
    public static final UBlock BEDROCK = new UBlock(Blocks.BEDROCK);
    public static final UBlock FLOWING_WATER = new UBlock(Blocks.FLOWING_WATER);
    public static final UBlock WATER = new UBlock(Blocks.WATER);
    public static final UBlock FLOWING_LAVA = new UBlock(Blocks.FLOWING_LAVA);
    public static final UBlock LAVA = new UBlock(Blocks.LAVA);
    public static final UBlock SAND = new UBlock(Blocks.SAND);
    public static final UBlock GRAVEL = new UBlock(Blocks.GRAVEL);
    public static final UBlock GOLD_ORE = new UBlock(Blocks.GOLD_ORE);
    public static final UBlock IRON_ORE = new UBlock(Blocks.IRON_ORE);
    public static final UBlock COAL_ORE = new UBlock(Blocks.COAL_ORE);
    public static final UBlock LOG = new UBlock(Blocks.LOG);
    public static final UBlock LOG2 = new UBlock(Blocks.LOG2);
    public static final UBlock LEAVES = new UBlock(Blocks.LEAVES);
    public static final UBlock LEAVES2 = new UBlock(Blocks.LEAVES2);
    public static final UBlock SPONGE = new UBlock(Blocks.SPONGE);
    public static final UBlock GLASS = new UBlock(Blocks.GLASS);
    public static final UBlock LAPIS_ORE = new UBlock(Blocks.LAPIS_ORE);
    public static final UBlock LAPIS_BLOCK = new UBlock(Blocks.LAPIS_BLOCK);
    public static final UBlock DISPENSER = new UBlock(Blocks.DISPENSER);
    public static final UBlock SANDSTONE = new UBlock(Blocks.SANDSTONE);
    public static final UBlock NOTEBLOCK = new UBlock(Blocks.NOTEBLOCK);
    public static final UBlock BED = new UBlock(Blocks.BED);
    public static final UBlock GOLDEN_RAIL = new UBlock(Blocks.GOLDEN_RAIL);
    public static final UBlock DETECTOR_RAIL = new UBlock(Blocks.DETECTOR_RAIL);
    public static final UBlock STICKY_PISTON = new UBlock(Blocks.STICKY_PISTON);
    public static final UBlock WEB = new UBlock(Blocks.WEB);
    public static final UBlock TALLGRASS = new UBlock(Blocks.TALLGRASS);
    public static final UBlock DEADBUSH = new UBlock(Blocks.DEADBUSH);
    public static final UBlock PISTON = new UBlock(Blocks.PISTON);
    public static final UBlock PISTON_HEAD = new UBlock(Blocks.PISTON_HEAD);
    public static final UBlock WOOL = new UBlock(Blocks.WOOL);
    public static final UBlock PISTON_EXTENSION = new UBlock(Blocks.PISTON_EXTENSION);
    public static final UBlock YELLOW_FLOWER = new UBlock(Blocks.YELLOW_FLOWER);
    public static final UBlock RED_FLOWER = new UBlock(Blocks.RED_FLOWER);
    public static final UBlock BROWN_MUSHROOM = new UBlock(Blocks.BROWN_MUSHROOM);
    public static final UBlock RED_MUSHROOM = new UBlock(Blocks.RED_MUSHROOM);
    public static final UBlock GOLD_BLOCK = new UBlock(Blocks.GOLD_BLOCK);
    public static final UBlock IRON_BLOCK = new UBlock(Blocks.IRON_BLOCK);
    public static final UBlock DOUBLE_STONE_SLAB = new UBlock(Blocks.DOUBLE_STONE_SLAB);
    public static final UBlock STONE_SLAB = new UBlock(Blocks.STONE_SLAB);
    public static final UBlock BRICK_BLOCK = new UBlock(Blocks.BRICK_BLOCK);
    public static final UBlock TNT = new UBlock(Blocks.TNT);
    public static final UBlock BOOKSHELF = new UBlock(Blocks.BOOKSHELF);
    public static final UBlock MOSSY_COBBLESTONE = new UBlock(Blocks.MOSSY_COBBLESTONE);
    public static final UBlock OBSIDIAN = new UBlock(Blocks.OBSIDIAN);
    public static final UBlock TORCH = new UBlock(Blocks.TORCH);
    public static final UBlock FIRE = new UBlock(Blocks.FIRE);
    public static final UBlock MOB_SPAWNER = new UBlock(Blocks.MOB_SPAWNER);
    public static final UBlock OAK_STAIRS = new UBlock(Blocks.OAK_STAIRS);
    public static final UBlock CHEST = new UBlock(Blocks.CHEST);
    public static final UBlock REDSTONE_WIRE = new UBlock(Blocks.REDSTONE_WIRE);
    public static final UBlock DIAMOND_ORE = new UBlock(Blocks.DIAMOND_ORE);
    public static final UBlock DIAMOND_BLOCK = new UBlock(Blocks.DIAMOND_BLOCK);
    public static final UBlock CRAFTING_TABLE = new UBlock(Blocks.CRAFTING_TABLE);
    public static final UBlock WHEAT = new UBlock(Blocks.WHEAT);
    public static final UBlock FARMLAND = new UBlock(Blocks.FARMLAND);
    public static final UBlock FURNACE = new UBlock(Blocks.FURNACE);
    public static final UBlock LIT_FURNACE = new UBlock(Blocks.LIT_FURNACE);
    public static final UBlock STANDING_SIGN = new UBlock(Blocks.STANDING_SIGN);
    public static final UBlock OAK_DOOR = new UBlock(Blocks.OAK_DOOR);
    public static final UBlock SPRUCE_DOOR = new UBlock(Blocks.SPRUCE_DOOR);
    public static final UBlock BIRCH_DOOR = new UBlock(Blocks.BIRCH_DOOR);
    public static final UBlock JUNGLE_DOOR = new UBlock(Blocks.JUNGLE_DOOR);
    public static final UBlock ACACIA_DOOR = new UBlock(Blocks.ACACIA_DOOR);
    public static final UBlock DARK_OAK_DOOR = new UBlock(Blocks.DARK_OAK_DOOR);
    public static final UBlock LADDER = new UBlock(Blocks.LADDER);
    public static final UBlock RAIL = new UBlock(Blocks.RAIL);
    public static final UBlock STONE_STAIRS = new UBlock(Blocks.STONE_STAIRS);
    public static final UBlock WALL_SIGN = new UBlock(Blocks.WALL_SIGN);
    public static final UBlock LEVER = new UBlock(Blocks.LEVER);
    public static final UBlock STONE_PRESSURE_PLATE = new UBlock(Blocks.STONE_PRESSURE_PLATE);
    public static final UBlock IRON_DOOR = new UBlock(Blocks.IRON_DOOR);
    public static final UBlock WOODEN_PRESSURE_PLATE = new UBlock(Blocks.WOODEN_PRESSURE_PLATE);
    public static final UBlock REDSTONE_ORE = new UBlock(Blocks.REDSTONE_ORE);
    public static final UBlock LIT_REDSTONE_ORE = new UBlock(Blocks.LIT_REDSTONE_ORE);
    public static final UBlock UNLIT_REDSTONE_TORCH = new UBlock(Blocks.UNLIT_REDSTONE_TORCH);
    public static final UBlock REDSTONE_TORCH = new UBlock(Blocks.REDSTONE_TORCH);
    public static final UBlock STONE_BUTTON = new UBlock(Blocks.STONE_BUTTON);
    public static final UBlock SNOW_LAYER = new UBlock(Blocks.SNOW_LAYER);
    public static final UBlock ICE = new UBlock(Blocks.ICE);
    public static final UBlock SNOW = new UBlock(Blocks.SNOW);
    public static final UBlock CACTUS = new UBlock(Blocks.CACTUS);
    public static final UBlock CLAY = new UBlock(Blocks.CLAY);
    public static final UBlock REEDS = new UBlock(Blocks.REEDS);
    public static final UBlock JUKEBOX = new UBlock(Blocks.JUKEBOX);
    public static final UBlock OAK_FENCE = new UBlock(Blocks.OAK_FENCE);
    public static final UBlock SPRUCE_FENCE = new UBlock(Blocks.SPRUCE_FENCE);
    public static final UBlock BIRCH_FENCE = new UBlock(Blocks.BIRCH_FENCE);
    public static final UBlock JUNGLE_FENCE = new UBlock(Blocks.JUNGLE_FENCE);
    public static final UBlock DARK_OAK_FENCE = new UBlock(Blocks.DARK_OAK_FENCE);
    public static final UBlock ACACIA_FENCE = new UBlock(Blocks.ACACIA_FENCE);
    public static final UBlock PUMPKIN = new UBlock(Blocks.PUMPKIN);
    public static final UBlock NETHERRACK = new UBlock(Blocks.NETHERRACK);
    public static final UBlock SOUL_SAND = new UBlock(Blocks.SOUL_SAND);
    public static final UBlock GLOWSTONE = new UBlock(Blocks.GLOWSTONE);
    public static final UBlock PORTAL = new UBlock(Blocks.PORTAL);
    public static final UBlock LIT_PUMPKIN = new UBlock(Blocks.LIT_PUMPKIN);
    public static final UBlock CAKE = new UBlock(Blocks.CAKE);
    public static final UBlock UNPOWERED_REPEATER = new UBlock(Blocks.UNPOWERED_REPEATER);
    public static final UBlock POWERED_REPEATER = new UBlock(Blocks.POWERED_REPEATER);
    public static final UBlock TRAPDOOR = new UBlock(Blocks.TRAPDOOR);
    public static final UBlock MONSTER_EGG = new UBlock(Blocks.MONSTER_EGG);
    public static final UBlock STONEBRICK = new UBlock(Blocks.STONEBRICK);
    public static final UBlock BROWN_MUSHROOM_BLOCK = new UBlock(Blocks.BROWN_MUSHROOM_BLOCK);
    public static final UBlock RED_MUSHROOM_BLOCK = new UBlock(Blocks.RED_MUSHROOM_BLOCK);
    public static final UBlock IRON_BARS = new UBlock(Blocks.IRON_BARS);
    public static final UBlock GLASS_PANE = new UBlock(Blocks.GLASS_PANE);
    public static final UBlock MELON_BLOCK = new UBlock(Blocks.MELON_BLOCK);
    public static final UBlock PUMPKIN_STEM = new UBlock(Blocks.PUMPKIN_STEM);
    public static final UBlock MELON_STEM = new UBlock(Blocks.MELON_STEM);
    public static final UBlock VINE = new UBlock(Blocks.VINE);
    public static final UBlock OAK_FENCE_GATE = new UBlock(Blocks.OAK_FENCE_GATE);
    public static final UBlock SPRUCE_FENCE_GATE = new UBlock(Blocks.SPRUCE_FENCE_GATE);
    public static final UBlock BIRCH_FENCE_GATE = new UBlock(Blocks.BIRCH_FENCE_GATE);
    public static final UBlock JUNGLE_FENCE_GATE = new UBlock(Blocks.JUNGLE_FENCE_GATE);
    public static final UBlock DARK_OAK_FENCE_GATE = new UBlock(Blocks.DARK_OAK_FENCE_GATE);
    public static final UBlock ACACIA_FENCE_GATE = new UBlock(Blocks.ACACIA_FENCE_GATE);
    public static final UBlock BRICK_STAIRS = new UBlock(Blocks.BRICK_STAIRS);
    public static final UBlock STONE_BRICK_STAIRS = new UBlock(Blocks.STONE_BRICK_STAIRS);
    public static final UBlock MYCELIUM = new UBlock(Blocks.MYCELIUM);
    public static final UBlock WATERLILY = new UBlock(Blocks.WATERLILY);
    public static final UBlock NETHER_BRICK = new UBlock(Blocks.NETHER_BRICK);
    public static final UBlock NETHER_BRICK_FENCE = new UBlock(Blocks.NETHER_BRICK_FENCE);
    public static final UBlock NETHER_BRICK_STAIRS = new UBlock(Blocks.NETHER_BRICK_STAIRS);
    public static final UBlock NETHER_WART = new UBlock(Blocks.NETHER_WART);
    public static final UBlock ENCHANTING_TABLE = new UBlock(Blocks.ENCHANTING_TABLE);
    public static final UBlock BREWING_STAND = new UBlock(Blocks.BREWING_STAND);
    public static final UBlock CAULDRON = new UBlock(Blocks.CAULDRON);
    public static final UBlock END_PORTAL = new UBlock(Blocks.END_PORTAL);
    public static final UBlock END_PORTAL_FRAME = new UBlock(Blocks.END_PORTAL_FRAME);
    public static final UBlock END_STONE = new UBlock(Blocks.END_STONE);
    public static final UBlock DRAGON_EGG = new UBlock(Blocks.DRAGON_EGG);
    public static final UBlock REDSTONE_LAMP = new UBlock(Blocks.REDSTONE_LAMP);
    public static final UBlock LIT_REDSTONE_LAMP = new UBlock(Blocks.LIT_REDSTONE_LAMP);
    public static final UBlock DOUBLE_WOODEN_SLAB = new UBlock(Blocks.DOUBLE_WOODEN_SLAB);
    public static final UBlock WOODEN_SLAB = new UBlock(Blocks.WOODEN_SLAB);
    public static final UBlock COCOA = new UBlock(Blocks.COCOA);
    public static final UBlock SANDSTONE_STAIRS = new UBlock(Blocks.SANDSTONE_STAIRS);
    public static final UBlock EMERALD_ORE = new UBlock(Blocks.EMERALD_ORE);
    public static final UBlock ENDER_CHEST = new UBlock(Blocks.ENDER_CHEST);
    public static final UBlock TRIPWIRE_HOOK = new UBlock(Blocks.TRIPWIRE_HOOK);
    public static final UBlock TRIPWIRE = new UBlock(Blocks.TRIPWIRE);
    public static final UBlock EMERALD_BLOCK = new UBlock(Blocks.EMERALD_BLOCK);
    public static final UBlock SPRUCE_STAIRS = new UBlock(Blocks.SPRUCE_STAIRS);
    public static final UBlock BIRCH_STAIRS = new UBlock(Blocks.BIRCH_STAIRS);
    public static final UBlock JUNGLE_STAIRS = new UBlock(Blocks.JUNGLE_STAIRS);
    public static final UBlock COMMAND_BLOCK = new UBlock(Blocks.COMMAND_BLOCK);
    public static final UBlock BEACON = new UBlock(Blocks.BEACON);
    public static final UBlock COBBLESTONE_WALL = new UBlock(Blocks.COBBLESTONE_WALL);
    public static final UBlock FLOWER_POT = new UBlock(Blocks.FLOWER_POT);
    public static final UBlock CARROTS = new UBlock(Blocks.CARROTS);
    public static final UBlock POTATOES = new UBlock(Blocks.POTATOES);
    public static final UBlock WOODEN_BUTTON = new UBlock(Blocks.WOODEN_BUTTON);
    public static final UBlock SKULL = new UBlock(Blocks.SKULL);
    public static final UBlock ANVIL = new UBlock(Blocks.ANVIL);
    public static final UBlock TRAPPED_CHEST = new UBlock(Blocks.TRAPPED_CHEST);
    public static final UBlock LIGHT_WEIGHTED_PRESSURE_PLATE = new UBlock(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
    public static final UBlock HEAVY_WEIGHTED_PRESSURE_PLATE = new UBlock(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
    public static final UBlock UNPOWERED_COMPARATOR = new UBlock(Blocks.UNPOWERED_COMPARATOR);
    public static final UBlock POWERED_COMPARATOR = new UBlock(Blocks.POWERED_COMPARATOR);
    public static final UBlock DAYLIGHT_DETECTOR = new UBlock(Blocks.DAYLIGHT_DETECTOR);
    public static final UBlock DAYLIGHT_DETECTOR_INVERTED = new UBlock(Blocks.DAYLIGHT_DETECTOR_INVERTED);
    public static final UBlock REDSTONE_BLOCK = new UBlock(Blocks.REDSTONE_BLOCK);
    public static final UBlock QUARTZ_ORE = new UBlock(Blocks.QUARTZ_ORE);
    public static final UBlock HOPPER = new UBlock(Blocks.HOPPER);
    public static final UBlock QUARTZ_BLOCK = new UBlock(Blocks.QUARTZ_BLOCK);
    public static final UBlock QUARTZ_STAIRS = new UBlock(Blocks.QUARTZ_STAIRS);
    public static final UBlock ACTIVATOR_RAIL = new UBlock(Blocks.ACTIVATOR_RAIL);
    public static final UBlock DROPPER = new UBlock(Blocks.DROPPER);
    public static final UBlock STAINED_HARDENED_CLAY = new UBlock(Blocks.STAINED_HARDENED_CLAY);
    public static final UBlock BARRIER = new UBlock(Blocks.BARRIER);
    public static final UBlock IRON_TRAPDOOR = new UBlock(Blocks.IRON_TRAPDOOR);
    public static final UBlock HAY_BLOCK = new UBlock(Blocks.HAY_BLOCK);
    public static final UBlock CARPET = new UBlock(Blocks.CARPET);
    public static final UBlock HARDENED_CLAY = new UBlock(Blocks.HARDENED_CLAY);
    public static final UBlock COAL_BLOCK = new UBlock(Blocks.COAL_BLOCK);
    public static final UBlock PACKED_ICE = new UBlock(Blocks.PACKED_ICE);
    public static final UBlock ACACIA_STAIRS = new UBlock(Blocks.ACACIA_STAIRS);
    public static final UBlock DARK_OAK_STAIRS = new UBlock(Blocks.DARK_OAK_STAIRS);
    public static final UBlock SLIME_BLOCK = new UBlock(Blocks.SLIME_BLOCK);
    public static final UBlock DOUBLE_PLANT = new UBlock(Blocks.DOUBLE_PLANT);
    public static final UBlock STAINED_GLASS = new UBlock(Blocks.STAINED_GLASS);
    public static final UBlock STAINED_GLASS_PANE = new UBlock(Blocks.STAINED_GLASS_PANE);
    public static final UBlock PRISMARINE = new UBlock(Blocks.PRISMARINE);
    public static final UBlock SEA_LANTERN = new UBlock(Blocks.SEA_LANTERN);
    public static final UBlock STANDING_BANNER = new UBlock(Blocks.STANDING_BANNER);
    public static final UBlock WALL_BANNER = new UBlock(Blocks.WALL_BANNER);
    public static final UBlock RED_SANDSTONE = new UBlock(Blocks.RED_SANDSTONE);
    public static final UBlock RED_SANDSTONE_STAIRS = new UBlock(Blocks.RED_SANDSTONE_STAIRS);
    public static final UBlock DOUBLE_STONE_SLAB2 = new UBlock(Blocks.DOUBLE_STONE_SLAB2);
    public static final UBlock STONE_SLAB2 = new UBlock(Blocks.STONE_SLAB2);
    public static final UBlock END_ROD = new UBlock(Blocks.END_ROD);
    public static final UBlock CHORUS_PLANT = new UBlock(Blocks.CHORUS_PLANT);
    public static final UBlock CHORUS_FLOWER = new UBlock(Blocks.CHORUS_FLOWER);
    public static final UBlock PURPUR_BLOCK = new UBlock(Blocks.PURPUR_BLOCK);
    public static final UBlock PURPUR_PILLAR = new UBlock(Blocks.PURPUR_PILLAR);
    public static final UBlock PURPUR_STAIRS = new UBlock(Blocks.PURPUR_STAIRS);
    public static final UBlock PURPUR_DOUBLE_SLAB = new UBlock(Blocks.PURPUR_DOUBLE_SLAB);
    public static final UBlock PURPUR_SLAB = new UBlock(Blocks.PURPUR_SLAB);
    public static final UBlock END_BRICKS = new UBlock(Blocks.END_BRICKS);
    public static final UBlock BEETROOTS = new UBlock(Blocks.BEETROOTS);
    public static final UBlock GRASS_PATH = new UBlock(Blocks.GRASS_PATH);
    public static final UBlock END_GATEWAY = new UBlock(Blocks.END_GATEWAY);
    public static final UBlock REPEATING_COMMAND_BLOCK = new UBlock(Blocks.REPEATING_COMMAND_BLOCK);
    public static final UBlock CHAIN_COMMAND_BLOCK = new UBlock(Blocks.CHAIN_COMMAND_BLOCK);
    public static final UBlock FROSTED_ICE = new UBlock(Blocks.FROSTED_ICE);
    public static final UBlock MAGMA = new UBlock(Blocks.MAGMA);
    public static final UBlock NETHER_WART_BLOCK = new UBlock(Blocks.NETHER_WART_BLOCK);
    public static final UBlock RED_NETHER_BRICK = new UBlock(Blocks.RED_NETHER_BRICK);
    public static final UBlock BONE_BLOCK = new UBlock(Blocks.BONE_BLOCK);
    public static final UBlock STRUCTURE_VOID = new UBlock(Blocks.STRUCTURE_VOID);
    public static final UBlock STRUCTURE_BLOCK = new UBlock(Blocks.STRUCTURE_BLOCK);

    /** Default vanilla blocks by classical indices */
    private static final UBlock[] blocks = new UBlock[256];

    /** Block selector */
    final static Selector<UBlock> selector = new Selector<>();

    /**
     * Check if the block have vanilla index
     * @param blockID Block index
     * @return True if block has vanilla ID
     */
    public static boolean isVanilla(int blockID) {
        return blockID >= 0 && blockID < 256;
    }

    /**
     * Vanilla block from block id
     * @param blockID Block index
     * @return Minecraft native block or null
     */
    public static UBlock getBlockVanilla(int blockID) {
        return isVanilla(blockID) ? blocks[blockID] : null;
    }

    static {

        blocks[0] = AIR;
        blocks[1] = STONE;
        blocks[2] = GRASS;
        blocks[3] = DIRT;
        blocks[4] = COBBLESTONE;
        blocks[5] = PLANKS;
        blocks[6] = SAPLING;
        blocks[7] = BEDROCK;
        blocks[8] = FLOWING_WATER;
        blocks[9] = WATER;
        blocks[10] = FLOWING_LAVA;
        blocks[11] = LAVA;
        blocks[12] = SAND;
        blocks[13] = GRAVEL;
        blocks[14] = GOLD_ORE;
        blocks[15] = IRON_ORE;
        blocks[16] = COAL_ORE;
        blocks[17] = LOG;
        blocks[18] = LEAVES;
        blocks[19] = SPONGE;
        blocks[20] = GLASS;
        blocks[21] = LAPIS_ORE;
        blocks[22] = LAPIS_BLOCK;
        blocks[23] = DISPENSER;
        blocks[24] = SANDSTONE;
        blocks[25] = NOTEBLOCK;
        blocks[26] = BED;
        blocks[27] = GOLDEN_RAIL;
        blocks[28] = DETECTOR_RAIL;
        blocks[29] = STICKY_PISTON;
        blocks[30] = WEB;
        blocks[31] = TALLGRASS;
        blocks[32] = DEADBUSH;
        blocks[33] = PISTON;
        blocks[34] = PISTON_HEAD;
        blocks[35] = WOOL;
        blocks[36] = PISTON_EXTENSION;
        blocks[37] = YELLOW_FLOWER;
        blocks[38] = RED_FLOWER;
        blocks[39] = BROWN_MUSHROOM;
        blocks[40] = RED_MUSHROOM;
        blocks[41] = GOLD_BLOCK;
        blocks[42] = IRON_BLOCK;
        blocks[43] = DOUBLE_STONE_SLAB;
        blocks[44] = STONE_SLAB;
        blocks[45] = BRICK_BLOCK;
        blocks[46] = TNT;
        blocks[47] = BOOKSHELF;
        blocks[48] = MOSSY_COBBLESTONE;
        blocks[49] = OBSIDIAN;
        blocks[50] = TORCH;
        blocks[51] = FIRE;
        blocks[52] = MOB_SPAWNER;
        blocks[53] = OAK_STAIRS;
        blocks[54] = CHEST;
        blocks[55] = REDSTONE_WIRE;
        blocks[56] = DIAMOND_ORE;
        blocks[57] = DIAMOND_BLOCK;
        blocks[58] = CRAFTING_TABLE;
        blocks[59] = WHEAT;
        blocks[60] = FARMLAND;
        blocks[61] = FURNACE;
        blocks[62] = LIT_FURNACE;
        blocks[63] = STANDING_SIGN;
        blocks[64] = OAK_DOOR;
        blocks[65] = LADDER;
        blocks[66] = RAIL;
        blocks[67] = STONE_STAIRS;
        blocks[68] = WALL_SIGN;
        blocks[69] = LEVER;
        blocks[70] = STONE_PRESSURE_PLATE;
        blocks[71] = IRON_DOOR;
        blocks[72] = WOODEN_PRESSURE_PLATE;
        blocks[73] = REDSTONE_ORE;
        blocks[74] = LIT_REDSTONE_ORE;
        blocks[75] = UNLIT_REDSTONE_TORCH;
        blocks[76] = REDSTONE_TORCH;
        blocks[77] = STONE_BUTTON;
        blocks[78] = SNOW_LAYER;
        blocks[79] = ICE;
        blocks[80] = SNOW;
        blocks[81] = CACTUS;
        blocks[82] = CLAY;
        blocks[83] = REEDS;
        blocks[84] = JUKEBOX;
        blocks[85] = OAK_FENCE;
        blocks[86] = PUMPKIN;
        blocks[87] = NETHERRACK;
        blocks[88] = SOUL_SAND;
        blocks[89] = GLOWSTONE;
        blocks[90] = PORTAL;
        blocks[91] = LIT_PUMPKIN;
        blocks[92] = CAKE;
        blocks[93] = UNPOWERED_REPEATER;
        blocks[94] = POWERED_REPEATER;
        blocks[95] = STAINED_GLASS;
        blocks[96] = TRAPDOOR;
        blocks[97] = MONSTER_EGG;
        blocks[98] = STONEBRICK;
        blocks[99] = BROWN_MUSHROOM_BLOCK;
        blocks[100] = RED_MUSHROOM_BLOCK;
        blocks[101] = IRON_BARS;
        blocks[102] = GLASS_PANE;
        blocks[103] = MELON_BLOCK;
        blocks[104] = PUMPKIN_STEM;
        blocks[105] = MELON_STEM;
        blocks[106] = VINE;
        blocks[107] = OAK_FENCE_GATE;
        blocks[108] = BRICK_STAIRS;
        blocks[109] = STONE_BRICK_STAIRS;
        blocks[110] = MYCELIUM;
        blocks[111] = WATERLILY;
        blocks[112] = NETHER_BRICK;
        blocks[113] = NETHER_BRICK_FENCE;
        blocks[114] = NETHER_BRICK_STAIRS;
        blocks[115] = NETHER_WART;
        blocks[116] = ENCHANTING_TABLE;
        blocks[117] = BREWING_STAND;
        blocks[118] = CAULDRON;
        blocks[119] = END_PORTAL;
        blocks[120] = END_PORTAL_FRAME;
        blocks[121] = END_STONE;
        blocks[122] = DRAGON_EGG;
        blocks[123] = REDSTONE_LAMP;
        blocks[124] = LIT_REDSTONE_LAMP;
        blocks[125] = DOUBLE_WOODEN_SLAB;
        blocks[126] = WOODEN_SLAB;
        blocks[127] = COCOA;
        blocks[128] = SANDSTONE_STAIRS;
        blocks[129] = EMERALD_ORE;
        blocks[130] = ENDER_CHEST;
        blocks[131] = TRIPWIRE_HOOK;
        blocks[132] = TRIPWIRE;
        blocks[133] = EMERALD_BLOCK;
        blocks[134] = SPRUCE_STAIRS;
        blocks[135] = BIRCH_STAIRS;
        blocks[136] = JUNGLE_STAIRS;
        blocks[137] = COMMAND_BLOCK;
        blocks[138] = BEACON;
        blocks[139] = COBBLESTONE_WALL;
        blocks[140] = FLOWER_POT;
        blocks[141] = CARROTS;
        blocks[142] = POTATOES;
        blocks[143] = WOODEN_BUTTON;
        blocks[144] = SKULL;
        blocks[145] = ANVIL;
        blocks[146] = TRAPPED_CHEST;
        blocks[147] = LIGHT_WEIGHTED_PRESSURE_PLATE;
        blocks[148] = HEAVY_WEIGHTED_PRESSURE_PLATE;
        blocks[149] = UNPOWERED_COMPARATOR;
        blocks[150] = POWERED_COMPARATOR;
        blocks[151] = DAYLIGHT_DETECTOR;
        blocks[152] = REDSTONE_BLOCK;
        blocks[153] = QUARTZ_ORE;
        blocks[154] = HOPPER;
        blocks[155] = QUARTZ_BLOCK;
        blocks[156] = QUARTZ_STAIRS;
        blocks[157] = ACTIVATOR_RAIL;
        blocks[158] = DROPPER;
        blocks[159] = STAINED_HARDENED_CLAY;
        blocks[160] = STAINED_GLASS_PANE;
        blocks[161] = LEAVES2;
        blocks[162] = LOG2;
        blocks[163] = ACACIA_STAIRS;
        blocks[164] = DARK_OAK_STAIRS;
        blocks[165] = SLIME_BLOCK;
        blocks[166] = BARRIER;
        blocks[167] = IRON_TRAPDOOR;
        blocks[168] = PRISMARINE;
        blocks[169] = SEA_LANTERN;
        blocks[170] = HAY_BLOCK;
        blocks[171] = CARPET;
        blocks[172] = HARDENED_CLAY;
        blocks[173] = COAL_BLOCK;
        blocks[174] = PACKED_ICE;
        blocks[175] = DOUBLE_PLANT;
        blocks[176] = STANDING_BANNER;
        blocks[177] = WALL_BANNER;
        blocks[178] = DAYLIGHT_DETECTOR_INVERTED;
        blocks[179] = RED_SANDSTONE;
        blocks[180] = RED_SANDSTONE_STAIRS;
        blocks[181] = DOUBLE_STONE_SLAB2;
        blocks[182] = STONE_SLAB2;
        blocks[183] = SPRUCE_FENCE_GATE;
        blocks[184] = BIRCH_FENCE_GATE;
        blocks[185] = JUNGLE_FENCE_GATE;
        blocks[186] = DARK_OAK_FENCE_GATE;
        blocks[187] = ACACIA_FENCE_GATE;
        blocks[188] = SPRUCE_FENCE;
        blocks[189] = BIRCH_FENCE;
        blocks[190] = JUNGLE_FENCE;
        blocks[191] = DARK_OAK_FENCE;
        blocks[192] = ACACIA_FENCE;
        blocks[193] = SPRUCE_DOOR;
        blocks[194] = BIRCH_DOOR;
        blocks[195] = JUNGLE_DOOR;
        blocks[196] = ACACIA_DOOR;
        blocks[197] = DARK_OAK_DOOR;
        blocks[198] = END_ROD;
        blocks[199] = CHORUS_PLANT;
        blocks[200] = CHORUS_FLOWER;
        blocks[201] = PURPUR_BLOCK;
        blocks[202] = PURPUR_PILLAR;
        blocks[203] = PURPUR_STAIRS;
        blocks[204] = PURPUR_DOUBLE_SLAB;
        blocks[205] = PURPUR_SLAB;
        blocks[206] = END_BRICKS;
        blocks[207] = BEETROOTS;
        blocks[208] = GRASS_PATH;
        blocks[209] = END_GATEWAY;
        blocks[210] = REPEATING_COMMAND_BLOCK;
        blocks[211] = CHAIN_COMMAND_BLOCK;
        blocks[212] = FROSTED_ICE;
        blocks[213] = MAGMA;
        blocks[214] = NETHER_WART_BLOCK;
        blocks[215] = RED_NETHER_BRICK;
        blocks[216] = BONE_BLOCK;
        blocks[217] = STRUCTURE_VOID;
        blocks[218] = null;
        blocks[219] = null;
        blocks[220] = null;
        blocks[221] = null;
        blocks[222] = null;
        blocks[223] = null;
        blocks[224] = null;
        blocks[225] = null;
        blocks[226] = null;
        blocks[227] = null;
        blocks[228] = null;
        blocks[229] = null;
        blocks[230] = null;
        blocks[231] = null;
        blocks[232] = null;
        blocks[233] = null;
        blocks[234] = null;
        blocks[235] = null;
        blocks[236] = null;
        blocks[237] = null;
        blocks[238] = null;
        blocks[239] = null;
        blocks[240] = null;
        blocks[241] = null;
        blocks[242] = null;
        blocks[243] = null;
        blocks[244] = null;
        blocks[245] = null;
        blocks[246] = null;
        blocks[247] = null;
        blocks[248] = null;
        blocks[249] = null;
        blocks[250] = null;
        blocks[251] = null;
        blocks[252] = null;
        blocks[253] = null;
        blocks[254] = null;
        blocks[255] = STRUCTURE_BLOCK;

        /* Construct block replaces */
        for (UBlock block : blocks) {
            if (block != null && block.isValid()) {
                selector.add(block.getPath(), block);
            }
        }
        selector.add("NULL", null);
        final HashMap<UBlock, UBlock> replace = new HashMap<>();
        for (String name : Configurator.REPLACE_BLOCKS) {
            List<String> tokens = Utils.tokenize(name, "->");
            if (tokens.size() == 2) {
                try {
                    Pattern srcPattern = Pattern.compile(tokens.get(0), Pattern.CASE_INSENSITIVE);
                    Pattern dstPattern = Pattern.compile(tokens.get(1), Pattern.CASE_INSENSITIVE);
                    for (UBlock blockSrc : selector.select(srcPattern)) {
                        for (UBlock blockDst : selector.select(dstPattern)) {
                            replace.put(blockSrc, blockDst);
                        }
                    }
                } catch (PatternSyntaxException pse) {
                    new Report().post("BAD PATTERN", pse.getMessage()).print();
                }
            }
        }

        /* Replace configured blocks */
        for (int index = 0; index < blocks.length; ++index) {
            UBlock block = blocks[index];
            blocks[index] = block == null || !replace.containsKey(block) ? block : replace.get(block);
        }

    }

}
