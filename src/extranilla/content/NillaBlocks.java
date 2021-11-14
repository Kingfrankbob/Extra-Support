package extranilla.content;

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

public class NillaBlocks implements ContentList {
  
  
  
  @Override
  public void load() {
  
          compounce = new GenericCrafter("Compounce"){{
            requirements(Category.crafting, with(Items.copper, 90, Items.lead, 60, Items.scrap, 45, Items.scrap, 45, Items.titanium, 45));
            craftEffect = Fx.smeltsmoke; //todo
            outputItem = new ItemStack(Items.metaglass, 2);
            craftTime = 80f;
            size = 2;
            hasPower = hasItems = true;
            drawer = new DrawSmelter(Pal.lancerLaser.cpy());
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;
            baseEfficiency = 0f;
            attribute = MindyAttribute.metallic;

            consumes.items(with(Items.sand, 2));
            consumes.power(0.60f);
        }};

