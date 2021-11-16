package extrasupport;

import arc.*;
import arc.func.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.game.Team;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import betamindy.content.*;
import mindustry.net.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;

import static java.lang.Float.*;
import static mindustry.Vars.*;

public class ExtraNilla extends Mod{
    public static final String githubURL = "https://github.com/Kingfrankbob/Extranilla-Mod";
    public static final String shortName = "[#FFA600]By MC B)"; //do not use bundles unless you want to region-lock the multiplayer experience

    public static SettingAdder settingAdder = new SettingAdder();
    public static XeloUtil pushUtil = new XeloUtil();
    public static MobileFunctions mobileUtil = new MobileFunctions();
    public static HardMode hardmode = new HardMode();
    public static MusicControl musics = new MusicControl();

    public static ScoreLib scoreLib = new ScoreLib();
    public static OrderedMap<Item, Float> itemScores;
    public static OrderedMap<Liquid, Float> liquidScores;
    public static OrderedMap<UnitType, Float> unitScores;

    public static MindyHints hints = new MindyHints();
    public static MindyUILoader mui = new MindyUILoader();

    public static Seq<Block> visibleBlockList = new Seq<Block>();
    public static boolean uwu = OS.username.equals("sunny") || OS.username.equals("MEEP");
    public static boolean inventoryUI = false;
    //public static UnitGravity gravity = new UnitGravity();
    public static MFilters filters = new MFilters();
