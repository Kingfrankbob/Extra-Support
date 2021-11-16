package extrasupport.content;
import arc.graphics.Color;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import extrasupport.entities.bullet.*;
import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;

public class SupportBullets implements ContentList {
    public static BulletType payBullet, payBulletBig, homingPay, homingPayBig, 
    @Override
    public void load(){
        payBullet = new PayloadBullet(1.6f){{
            hitEffect = Fx.
            despawnEffect = Fx.none;
            hitColor = Pal.engine;

            lifetime = 80f;
            trailSize = 6f;
            splashDamageRadius = 30f;
        }};

        payBulletBig = new PayloadBullet(3.2f){{
            hitEffect = Fx.mineHuge;
            despawnEffect = ;
            hitColor = Pal.lancerLaser;

            lifetime = 20f;
            trailSize = 8f;
            splashDamageRadius = 50f;
            hitShake = 2.5f;

        }};

        homingPay = new HomingPayloadBullet(1.6f){{
            hitEffect = Fx.mineBig;
            despawnEffect = Fx.none;
            hitColor = Pal.engine;

            lifetime = 80f;
            trailSize = 6f;
            splashDamageRadius = 30f;

            homingPower = 0.03f;
            homingRange = 120f;
        }};

        homingPayBig = new HomingPayloadBullet(3.2f){{
            hitEffect = Fx.mineHuge;
            despawnEffect = ;
            hitColor = Pal.lancerLaser;

            lifetime = 20f;
            trailSize = 8f;
            splashDamageRadius = 50f;
            hitShake = 2.5f;
            trailEffect = ;

            homingPower = 0.21f;
            homingRange = 120f;
        }};
    }
}
