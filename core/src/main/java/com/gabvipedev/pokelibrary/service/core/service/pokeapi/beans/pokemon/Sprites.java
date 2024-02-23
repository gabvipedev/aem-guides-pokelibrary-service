package com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon;

public class Sprites {
    private String backDefault;
    private String backFemale;
    private String backShiny;
    private String backShinyFemale;
    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;
    private OtherSprites other;
    private VersionSprites versions;

    // getters and setters


    public String getBackDefault() {
        return backDefault;
    }

    public String getBackFemale() {
        return backFemale;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public String getFrontFemale() {
        return frontFemale;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public OtherSprites getOther() {
        return other;
    }

    public VersionSprites getVersions() {
        return versions;
    }

    public static class OtherSprites {
        private DreamWorldSprites dreamWorld;
        private HomeSprites home;
        private OfficialArtworkSprites officialArtwork;

        // getters and setters

        public DreamWorldSprites getDreamWorld() {
            return dreamWorld;
        }

        public HomeSprites getHome() {
            return home;
        }

        public OfficialArtworkSprites getOfficialArtwork() {
            return officialArtwork;
        }
    }

    public static class DreamWorldSprites {
        private String frontDefault;
        private String frontFemale;

        // getters and setters

        public String getFrontDefault() {
            return frontDefault;
        }

        public String getFrontFemale() {
            return frontFemale;
        }
    }

    public static class HomeSprites {
        private String frontDefault;
        private String frontFemale;
        private String frontShiny;
        private String frontShinyFemale;

        // getters and setters

        public String getFrontDefault() {
            return frontDefault;
        }

        public String getFrontFemale() {
            return frontFemale;
        }

        public String getFrontShiny() {
            return frontShiny;
        }

        public String getFrontShinyFemale() {
            return frontShinyFemale;
        }
    }

    public static class OfficialArtworkSprites {
        private String frontDefault;

        // getters and setters

        public String getFrontDefault() {
            return frontDefault;
        }
    }

    public static class VersionSprites {
        private GenerationISprites generationI;
        private GenerationIISprites generationII;
        private GenerationIIISprites generationIII;
        private GenerationIVSprites generationIV;
        private GenerationVSprites generationV;
        private GenerationVISprites generationVI;
        private GenerationVIISprites generationVII;
        private GenerationVIIISprites generationVIII;
        // getters and setters


        public GenerationISprites getGenerationI() {
            return generationI;
        }

        public GenerationIISprites getGenerationII() {
            return generationII;
        }

        public GenerationIIISprites getGenerationIII() {
            return generationIII;
        }

        public GenerationIVSprites getGenerationIV() {
            return generationIV;
        }

        public GenerationVSprites getGenerationV() {
            return generationV;
        }

        public GenerationVISprites getGenerationVI() {
            return generationVI;
        }

        public GenerationVIISprites getGenerationVII() {
            return generationVII;
        }

        public GenerationVIIISprites getGenerationVIII() {
            return generationVIII;
        }
    }

    public static class GenerationISprites {
        private RedBlueSprites redBlue;
        private YellowSprites yellow;
        // getters and setters


        public RedBlueSprites getRedBlue() {
            return redBlue;
        }

        public YellowSprites getYellow() {
            return yellow;
        }
    }

    public static class RedBlueSprites {
        private String back_default;
        private String back_gray;
        private String front_default;
        private String front_gray;
        // getters and setters

        public String getBack_default() {
            return back_default;
        }

        public String getBack_gray() {
            return back_gray;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_gray() {
            return front_gray;
        }
    }

    public static class YellowSprites {
        private String back_default;
        private String back_gray;
        private String front_default;
        private String front_gray;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_gray() {
            return back_gray;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_gray() {
            return front_gray;
        }
    }

    public static class GenerationIISprites {
        private CrystalSprites crystal;
        private GoldSprites gold;
        private SilverSprites silver;
        // getters and setters


        public CrystalSprites getCrystal() {
            return crystal;
        }

        public GoldSprites getGold() {
            return gold;
        }

        public SilverSprites getSilver() {
            return silver;
        }
    }

    public static class CrystalSprites {
        private String back_default;
        private String back_shiny;
        private String front_default;
        private String front_shiny;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_shiny() {
            return front_shiny;
        }
    }

    public static class GoldSprites {
        private String back_default;
        private String back_shiny;
        private String front_default;
        private String front_shiny;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_shiny() {
            return front_shiny;
        }
    }

    public static class SilverSprites {
        private String back_default;
        private String back_shiny;
        private String front_default;
        private String front_shiny;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_shiny() {
            return front_shiny;
        }
    }

    public static class GenerationIIISprites {
        private EmeraldSprites emerald;
        private FireredLeafgreenSprites fireredLeafgreen;
        private RubySapphireSprites rubySapphire;
        // getters and setters


        public EmeraldSprites getEmerald() {
            return emerald;
        }

        public FireredLeafgreenSprites getFireredLeafgreen() {
            return fireredLeafgreen;
        }

        public RubySapphireSprites getRubySapphire() {
            return rubySapphire;
        }
    }

    public static class EmeraldSprites {
        private String front_default;
        private String front_shiny;
        // getters and setters


        public String getFront_default() {
            return front_default;
        }

        public String getFront_shiny() {
            return front_shiny;
        }
    }

    public static class FireredLeafgreenSprites {
        private String back_default;
        private String back_shiny;
        private String front_default;
        private String front_shiny;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_shiny() {
            return front_shiny;
        }
    }

    public static class RubySapphireSprites {
        private String back_default;
        private String back_shiny;
        private String front_default;
        private String front_shiny;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_shiny() {
            return front_shiny;
        }
    }

    public static class GenerationIVSprites {
        private DiamondPearlSprites diamondPearl;
        private HeartgoldSoulsilverSprites heartgoldSoulsilver;
        private PlatinumSprites platinum;
        // getters and setters


        public DiamondPearlSprites getDiamondPearl() {
            return diamondPearl;
        }

        public HeartgoldSoulsilverSprites getHeartgoldSoulsilver() {
            return heartgoldSoulsilver;
        }

        public PlatinumSprites getPlatinum() {
            return platinum;
        }
    }

    public static class DiamondPearlSprites {
        private String back_default;
        private String back_female;
        private String back_shiny;
        private String back_shiny_female;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_female() {
            return back_female;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getBack_shiny_female() {
            return back_shiny_female;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class HeartgoldSoulsilverSprites {
        private String back_default;
        private String back_female;
        private String back_shiny;
        private String back_shiny_female;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_female() {
            return back_female;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getBack_shiny_female() {
            return back_shiny_female;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class PlatinumSprites {
        private String back_default;
        private String back_female;
        private String back_shiny;
        private String back_shiny_female;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_female() {
            return back_female;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getBack_shiny_female() {
            return back_shiny_female;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class GenerationVSprites {
        private BlackWhiteSprites blackWhite;
        // getters and setters


        public BlackWhiteSprites getBlackWhite() {
            return blackWhite;
        }
    }

    public static class BlackWhiteSprites {
        private AnimatedSprites animated;
        private String back_default;
        private String back_female;
        private String back_shiny;
        private String back_shiny_female;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public AnimatedSprites getAnimated() {
            return animated;
        }

        public String getBack_default() {
            return back_default;
        }

        public String getBack_female() {
            return back_female;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getBack_shiny_female() {
            return back_shiny_female;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class GenerationVISprites {
        private XYSprites xy;
        private OmegaRubyAlphaSapphireSprites omegaRubyAlphaSapphire;
        // getters and setters


        public XYSprites getXy() {
            return xy;
        }

        public OmegaRubyAlphaSapphireSprites getOmegaRubyAlphaSapphire() {
            return omegaRubyAlphaSapphire;
        }
    }

    public static class XYSprites {
        private AnimatedSprites animated;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public AnimatedSprites getAnimated() {
            return animated;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class OmegaRubyAlphaSapphireSprites {
        private AnimatedSprites animated;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public AnimatedSprites getAnimated() {
            return animated;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class GenerationVIISprites {
        private SunMoonSprites sunMoon;
        private UltraSunUltraMoonSprites ultraSunUltraMoon;
        // getters and setters


        public SunMoonSprites getSunMoon() {
            return sunMoon;
        }

        public UltraSunUltraMoonSprites getUltraSunUltraMoon() {
            return ultraSunUltraMoon;
        }
    }

    public static class SunMoonSprites {
        private AnimatedSprites animated;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public AnimatedSprites getAnimated() {
            return animated;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class UltraSunUltraMoonSprites {
        private AnimatedSprites animated;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public AnimatedSprites getAnimated() {
            return animated;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class GenerationVIIISprites {
        private SwordShieldSprites swordShield;
        // getters and setters

        public SwordShieldSprites getSwordShield() {
            return swordShield;
        }
    }

    public static class SwordShieldSprites {
        private AnimatedSprites animated;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public AnimatedSprites getAnimated() {
            return animated;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

    public static class AnimatedSprites {
        private String back_default;
        private String back_female;
        private String back_shiny;
        private String back_shiny_female;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;
        // getters and setters


        public String getBack_default() {
            return back_default;
        }

        public String getBack_female() {
            return back_female;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public String getBack_shiny_female() {
            return back_shiny_female;
        }

        public String getFront_default() {
            return front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }
    }

}


