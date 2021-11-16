package extrasupport.content;

import extrasupport.entities.bullet.*;
import extrasupport.world.blocks.defense.*;
import extrasupport.world.blocks.defense.turrets.*;
import extrasupport.world.blocks.defense.turrets.pattern.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

public class SupportBlocks implements ContentList {
  
  compounce, coalPress, 
  
  
  
  @Override
  public void load() {
  
          compounce = new GenericCrafter("Compounce"){{
            requirements(Category.crafting, with(Items.copper, 90, Items.lead, 60, Items.scrap, 45, Items.scrap, 45, Items.titanium, 45));
            craftEffect = Fx.smeltsmoke; //todo
            outputItem = new ItemStack(Items.blast-compound, 2);
            craftTime = 80f;
            size = 2;
            hasPower = hasItems = true;
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;
            baseEfficiency = 0f;

            consumes.items(with(Items.scrap, 10));
            consumes.liquids(with(Liquids.water, 12));
            consumes.power(0.60f);
        }};

