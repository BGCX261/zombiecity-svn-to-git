/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class MapThree extends Map 
{
    private Worlds world;

    /**
     * Constructor for objects of class MapOne
     */
    public MapThree( Worlds world )
    {
        this.world = world;
    }

    public void makeWorld()
    {
        world.setBackground("map3.png");
        world.addObject(this.gui, 350, 350);
        
        this.player.setLocation(192,73);
        this.player.addedToWorld( world );
        
        prepare();
    }
    
    public void prepare()
    {
        
        
        TextTrigger textTrigger2 = new TextTrigger("Level 2 ",35);
        world.addObject(textTrigger2, 190, 75);
        
         EnemyZombie enemyzombie = new EnemyZombie();
        world.addObject(enemyzombie, 472, 620);
        EnemyZombie enemyzombie2 = new EnemyZombie();
        world.addObject(enemyzombie2, 611, 121);
        EnemyZombie enemyzombie3 = new EnemyZombie();
        world.addObject(enemyzombie3, 466, 279);
        EnemyZombie enemyzombie4 = new EnemyZombie();
        world.addObject(enemyzombie4, 470, 481);
        EnemyZombie enemyzombie5 = new EnemyZombie();
        world.addObject(enemyzombie5, 45, 449);
        EnemyZombie enemyzombie6 = new EnemyZombie();
        world.addObject(enemyzombie6, 94, 588);
        EnemyZombie enemyzombie7 = new EnemyZombie();
        world.addObject(enemyzombie7, 26, 212);
        EnemyZombie enemyzombie8 = new EnemyZombie();
        world.addObject(enemyzombie8, 408, 88);
        EnemyZombie enemyzombie9 = new EnemyZombie();
        world.addObject(enemyzombie9, 208, 185);
        EnemyZombie enemyzombie10 = new EnemyZombie();
        world.addObject(enemyzombie10, 60, 88);
        EnemyZombie enemyzombie11 = new EnemyZombie();
        world.addObject(enemyzombie11, 154, 285);
        EnemyZombie enemyzombie12 = new EnemyZombie();
        world.addObject(enemyzombie12, 167, 373);
        enemyzombie10.setLocation(31, 128);
        enemyzombie9.setLocation(212, 290);
        EnemyZombie enemyzombie13 = new EnemyZombie();
        world.addObject(enemyzombie13, 409, 127);
        EnemyZombie enemyzombie14 = new EnemyZombie();
        world.addObject(enemyzombie14, 220, 365);
        EnemyZombie enemyzombie15 = new EnemyZombie();
        world.addObject(enemyzombie15, 212, 562);
        EnemyZombie enemyzombie16 = new EnemyZombie();
        world.addObject(enemyzombie16, 332, 549);
        EnemyZombie enemyzombie17 = new EnemyZombie();
        world.addObject(enemyzombie17, 364, 264);
        
        Tree tree = new Tree();
        world.addObject(tree, 401, 215);
        Tree tree2 = new Tree();
        world.addObject(tree2, 525, 222);
        tree2.setLocation(517, 212);
        tree.setLocation(396, 212);
        Tree tree3 = new Tree();
        world.addObject(tree3, 521, 193);
        tree3.setLocation(517, 193);
        Tree tree4 = new Tree();
        world.addObject(tree4, 525, 223);
        tree4.setLocation(518, 219);
        Tree tree5 = new Tree();
        world.addObject(tree5, 399, 200);
        tree5.setLocation(395, 197);
        Tree tree6 = new Tree();
        world.addObject(tree6, 407, 232);
        tree6.setLocation(396, 221);
        Tree tree7 = new Tree();
        world.addObject(tree7, 643, 17);
        tree7.setLocation(633, 21);
        Tree tree8 = new Tree();
        world.addObject(tree8, 642, 56);
        tree8.setLocation(633, 38);
        tree8.setLocation(634, 39);
        Tree tree9 = new Tree();
        world.addObject(tree9, 533, 525);
        tree9.setLocation(523, 513);
        Tree tree10 = new Tree();
        world.addObject(tree10, 532, 550);
        tree10.setLocation(526, 550);
        Tree tree11 = new Tree();
        world.addObject(tree11, 109, 204);
        tree11.setLocation(106, 198);
        Tree tree12 = new Tree();
        world.addObject(tree12, 109, 230);
        tree12.setLocation(106, 226);
        Invisiblewall invisiblewall = new Invisiblewall();
        world.addObject(invisiblewall, 68, 183);
        invisiblewall.setLocation(63, 174);
        Invisiblewall invisiblewall2 = new Invisiblewall();
        world.addObject(invisiblewall2, 68, 235);
        invisiblewall2.setLocation(64, 228);
        Invisiblewall invisiblewall3 = new Invisiblewall();
        world.addObject(invisiblewall3, 74, 269);
        invisiblewall3.setLocation(64, 258);
        invisiblewall2.setLocation(63, 225);
        invisiblewall3.setLocation(63, 259);
        Invisiblewall invisiblewall4 = new Invisiblewall();
        world.addObject(invisiblewall4, 332, 312);
        invisiblewall4.setLocation(329, 302);
        Invisiblewall invisiblewall5 = new Invisiblewall();
        world.addObject(invisiblewall5, 320, 362);
        invisiblewall5.setLocation(314, 357);
        Invisiblewall invisiblewall6 = new Invisiblewall();
        world.addObject(invisiblewall6, 324, 416);
        invisiblewall6.setLocation(314, 413);
        Invisiblewall invisiblewall7 = new Invisiblewall();
        world.addObject(invisiblewall7, 318, 463);
        invisiblewall7.setLocation(314, 453);
        Invisiblewall invisiblewall8 = new Invisiblewall();
        world.addObject(invisiblewall8, 352, 457);
        invisiblewall8.setLocation(349, 451);
        Invisiblewall invisiblewall9 = new Invisiblewall();
        world.addObject(invisiblewall9, 341, 473);
        invisiblewall9.setLocation(332, 469);
        Invisiblewall invisiblewall10 = new Invisiblewall();
        world.addObject(invisiblewall10, 360, 407);
        invisiblewall10.setLocation(349, 404);
        Invisiblewall invisiblewall11 = new Invisiblewall();
        world.addObject(invisiblewall11, 354, 356);
        invisiblewall11.setLocation(349, 351);
        Invisiblewall invisiblewall12 = new Invisiblewall();
        world.addObject(invisiblewall12, 37, 13);
        invisiblewall12.setLocation(27, 7);
        Invisiblewall invisiblewall13 = new Invisiblewall();
        world.addObject(invisiblewall13, 44, 15);
        invisiblewall13.setLocation(41, 8);
        Invisiblewall invisiblewall14 = new Invisiblewall();
        world.addObject(invisiblewall14, 431, 11);
        invisiblewall14.setLocation(425, 6);
        Invisiblewall invisiblewall15 = new Invisiblewall();
        world.addObject(invisiblewall15, 384, 10);
        invisiblewall15.setLocation(377, 6);
        Invisiblewall invisiblewall16 = new Invisiblewall();
        world.addObject(invisiblewall16, 324, 13);
        invisiblewall16.setLocation(318, 6);
        Invisiblewall invisiblewall17 = new Invisiblewall();
        world.addObject(invisiblewall17, 32, 662);
        invisiblewall17.setLocation(22, 659);
        Invisiblewall invisiblewall18 = new Invisiblewall();
        world.addObject(invisiblewall18, 54, 665);
        invisiblewall18.setLocation(48, 659);
        Invisiblewall invisiblewall19 = new Invisiblewall();
        world.addObject(invisiblewall19, 284, 658);
        Invisiblewall invisiblewall20 = new Invisiblewall();
        world.addObject(invisiblewall20, 353, 667);
        invisiblewall20.setLocation(341, 658);
        Invisiblewall invisiblewall21 = new Invisiblewall();
        world.addObject(invisiblewall21, 391, 663);
        invisiblewall21.setLocation(382, 640);
        invisiblewall20.setLocation(337, 640);
        invisiblewall19.setLocation(277, 640);
        invisiblewall20.setLocation(329, 640);
        invisiblewall21.setLocation(384, 640);
        Invisiblewall invisiblewall22 = new Invisiblewall();
        world.addObject(invisiblewall22, 586, 630);
        invisiblewall22.setLocation(571, 626);
        Invisiblewall invisiblewall23 = new Invisiblewall();
        world.addObject(invisiblewall23, 631, 633);
        invisiblewall23.setLocation(628, 626);
        Invisiblewall invisiblewall24 = new Invisiblewall();
        world.addObject(invisiblewall24, 686, 633);
        invisiblewall24.setLocation(686, 626);
        invisiblewall23.setLocation(626, 625);
        invisiblewall24.setLocation(686, 627);
        invisiblewall23.setLocation(626, 626);
        Invisiblewall invisiblewall25 = new Invisiblewall();
        world.addObject(invisiblewall25, 576, 572);
        invisiblewall25.setLocation(571, 568);
        Invisiblewall invisiblewall26 = new Invisiblewall();
        world.addObject(invisiblewall26, 578, 517);
        invisiblewall26.setLocation(570, 512);
        Invisiblewall invisiblewall27 = new Invisiblewall();
        world.addObject(invisiblewall27, 578, 462);
        invisiblewall27.setLocation(570, 461);
        invisiblewall27.setLocation(570, 457);
        Invisiblewall invisiblewall28 = new Invisiblewall();
        world.addObject(invisiblewall28, 571, 390);
        invisiblewall28.setLocation(570, 398);
        Invisiblewall invisiblewall29 = new Invisiblewall();
        world.addObject(invisiblewall29, 575, 337);
        invisiblewall29.setLocation(570, 339);
        Invisiblewall invisiblewall30 = new Invisiblewall();
        world.addObject(invisiblewall30, 587, 301);
        invisiblewall30.setLocation(583, 308);
        Invisiblewall invisiblewall31 = new Invisiblewall();
        world.addObject(invisiblewall31, 599, 283);
        invisiblewall31.setLocation(598, 282);
        Invisiblewall invisiblewall32 = new Invisiblewall();
        world.addObject(invisiblewall32, 619, 244);
        invisiblewall32.setLocation(619, 240);
        Invisiblewall invisiblewall33 = new Invisiblewall();
        world.addObject(invisiblewall33, 650, 212);
        invisiblewall33.setLocation(626, 219);
        invisiblewall32.setLocation(608, 243);
        invisiblewall31.setLocation(596, 275);
        invisiblewall32.setLocation(608, 262);
        invisiblewall33.setLocation(615, 254);
        invisiblewall31.setLocation(590, 303);
        invisiblewall31.setLocation(591, 304);
        invisiblewall31.setLocation(590, 300);
        invisiblewall33.setLocation(598, 290);
        invisiblewall32.setLocation(605, 278);
        Invisiblewall invisiblewall34 = new Invisiblewall();
        world.addObject(invisiblewall34, 619, 274);
        invisiblewall34.setLocation(612, 267);
        Invisiblewall invisiblewall35 = new Invisiblewall();
        world.addObject(invisiblewall35, 624, 260);
        invisiblewall35.setLocation(620, 255);
        Invisiblewall invisiblewall36 = new Invisiblewall();
        world.addObject(invisiblewall36, 585, 338);
        invisiblewall36.setLocation(577, 332);
        invisiblewall30.setLocation(583, 313);
        invisiblewall36.setLocation(577, 328);
        Invisiblewall invisiblewall37 = new Invisiblewall();
        world.addObject(invisiblewall37, 686, 100);
        invisiblewall37.setLocation(680, 21);
        Invisiblewall invisiblewall38 = new Invisiblewall();
        world.addObject(invisiblewall38, 683, 83);
        invisiblewall38.setLocation(681, 80);
        Invisiblewall invisiblewall39 = new Invisiblewall();
        world.addObject(invisiblewall39, 686, 144);
        invisiblewall39.setLocation(681, 138);
        Invisiblewall invisiblewall40 = new Invisiblewall();
        world.addObject(invisiblewall40, 685, 203);
        invisiblewall40.setLocation(682, 198);
        Invisiblewall invisiblewall41 = new Invisiblewall();
        world.addObject(invisiblewall41, 678, 208);
        invisiblewall41.setLocation(674, 202);
        Invisiblewall invisiblewall42 = new Invisiblewall();
        world.addObject(invisiblewall42, 675, 221);
        invisiblewall42.setLocation(665, 217);
        invisiblewall41.setLocation(672, 201);
        invisiblewall41.setLocation(672, 192);
        invisiblewall42.setLocation(664, 206);
        Invisiblewall invisiblewall43 = new Invisiblewall();
        world.addObject(invisiblewall43, 657, 235);
        invisiblewall43.setLocation(653, 231);
        Invisiblewall invisiblewall44 = new Invisiblewall();
        world.addObject(invisiblewall44, 635, 240);
        invisiblewall44.setLocation(628, 231);
        Invisiblewall invisiblewall45 = new Invisiblewall();
        world.addObject(invisiblewall45, 632, 250);
        invisiblewall45.setLocation(623, 243);
        Invisiblewall invisiblewall46 = new Invisiblewall();
        world.addObject(invisiblewall46, 622, 266);
        invisiblewall46.setLocation(614, 259);
        invisiblewall24.setLocation(685, 626);
    }
    
    public void checkLevel()
    {
        
        if ( ( this.player.getX() <= 5 && this.player.getY() >= 449 && this.player.getY() <= 563 )  )
        {
            this.world.removeObjects(this.world.getObjects(MapThree.class));
            this.world.cleanWorld();
            this.world.changeMap( 3 );
        }
    }
}
