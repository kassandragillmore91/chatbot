package com.kassandragillmore.madlibs;import com.kassandragillmore.MadLib;public class Story0 {    public static void start () {        System.out.println("Be Kind");        String noun1 = MadLib.enterNoun();        String pluralNoun1 = MadLib.enterPluralNoun();        String noun2 = MadLib.enterNoun();        String place1 = MadLib.enterPlace();        String adjective1 = MadLib.enterAdjective();        String noun3 = MadLib.enterNoun();        System.out.println("Be kind to your " + noun1 + "-footed " + pluralNoun1 + "\n" +                "For a duck may be somebody's " + noun2 + "\n" +                "Be kind to your " + pluralNoun1 + " in " + place1 + "\n" +                "Where the weather is always " + adjective1 + "\n" +                "\n" +                "You may think that this is the " + noun3 + "\n" +                "Well, it is." + "\n");    }}