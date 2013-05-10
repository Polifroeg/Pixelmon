package pixelmon.enums;

import pixelmon.config.PixelmonEntityList.ClassType;

public enum EnumPokemon {
	Abra("Abra"),
	Aerodactyl("Aerodactyl"),
	Alakazam("Alakazam"),
	Anorith("Anorith"),
	Arbok("Arbok"),
	Arcanine("Arcanine"),
	Archen("Archen"),
	Archeops("Archeops"),
	Armaldo("Armaldo"),
	//Articuno("Articuno"),
	Bastiodon("Bastiodon"),
	Beedrill("Beedrill"),
	Bellsprout("Bellsprout"),
	Blastoise("Blastoise"),
	Bulbasaur("Bulbasaur"),
	Butterfree("Butterfree"),
	Camerupt("Camerupt"),
	Caterpie("Caterpie"),
	Chansey("Chansey"),
	Charizard("Charizard"),
	Charmander("Charmander"),
	Charmeleon("Charmeleon"),
	Clefable("Clefable"),
	Clefairy("Clefairy"),
	Cloyster("Cloyster"),
	Cranidos("Cranidos"),
	Cubone("Cubone"),
	Diglett("Diglett"),
	Ditto("Ditto"),
	Dodrio("Dodrio"),
	Doduo("Doduo"),
	Dragonair("Dragonair"),
	Dragonite("Dragonite"),
	Dratini("Dratini"),
	Drowzee("Drowzee"),
	Dugtrio("Dugtrio"),
	Eevee("Eevee"),
	Ekans("Ekans"),
	Electrode("Electrode"),
	Espeon("Espeon"),
	Exeggcute("Exeggcute"),
	Exeggutor("Exeggutor"),
	Farfetchd("Farfetchd"),
	Fearow("Fearow"),
	Flaaffy("Flaaffy"),
	Flareon("Flareon"),
	Flygon("Flygon"),
	Gastly("Gastly"),
	Gengar("Gengar"),
	Geodude("Geodude"),
	Glaceon("Glaceon"),
	Gloom("Gloom"),
	Golbat("Golbat"),
	Goldeen("Goldeen"),
	Golduck("Golduck"),
	Golem("Golem"),
	Graveler("Graveler"),
	Grimer("Grimer"),
	Growlithe("Growlithe"),
	Gyarados("Gyarados"),
	Haunter("Haunter"),
	Hitmonchan("Hitmonchan"),
	Hitmonlee("Hitmonlee"),
	Horsea("Horsea"),
	Hypno("Hypno"),
	Ivysaur("Ivysaur"),
	Jigglypuff("Jigglypuff"),
	Jolteon("Jolteon"),
	Jynx("Jynx"),
	Kabuto("Kabuto"),
	Kadabra("Kadabra"),
	Kabutops("Kabutops"),
	Kakuna("Kakuna"),
	Kingler("Kingler"),
	Koffing("Koffing"),
	Krabby("Krabby"),
	Krokorok("Krokorok"),
	Lapras("Lapras"),
	Leafeon("Leafeon"),
	Lunatone("Lunatone"),
	Machamp("Machamp"),
	Machoke("Machoke"),
	Machop("Machop"),
	Magikarp("Magikarp"),
	Magnemite("Magnemite"),
	Magneton("Magneton"),
	Mankey("Mankey"),
	Mareep("Mareep"),
	Marowak("Marowak"),
	Meowth("Meowth"),
	Metapod("Metapod"),
	Mew("Mew"),
	Miltank("Miltank"),
	Moltres("Moltres"),
	MrMime("MrMime"),
	Muk("Muk"),
	Nidoking("Nidoking"),
	Nidoranfemale("Nidoranfemale"),
	//NidoranMale("NidoranMale"),
	Nidorino("Nidorino"),
	Ninetales("Ninetales"),
	Numel("Numel"),
	Oddish("Oddish"),
	Omanyte("Omanyte"),
	Omastar("Omastar"),
	Onix("Onix"),
	Paras("Paras"),
	Persian("Persian"),
	Pidgey("Pidgey"),
	Pikachu("Pikachu"),
	Pidgeotto("Pidgeotto"),
	Pidgeot("Pidgeot"),
	Piloswine("Piloswine"),
	Pinsir("Pinsir"),
	Poliwag("Poliwag"),
	Poliwhirl("Poliwhirl"),
	Ponyta("Ponyta"),
	Porygon("Porygon"),
	Primeape("Primeape"),
	Psyduck("Psyduck"),
	Raichu("Raichu"),
	Rampardos("Rampardos"),
	Rapidash("Rapidash"),
	Raticate("Raticate"),
	Rattata("Rattata"),
	Rhyhorn("Rhyhorn"),
	Sandile("Sandile"),
	Sandshrew("Sandshrew"),
	Sandslash("Sandslash"),
	Scyther("Scyther"),
	Seadra("Seadra"),
	Seaking("Seaking"),
	Seel("Seel"),
	Shellder("Shellder"),
	Shieldon("Shieldon"),
	Slowbro("Slowbro"),
	Slowpoke("Slowpoke"),
	Snorlax("Snorlax"),
	Solrock("Solrock"),
	Spearow("Spearow"),
	Squirtle("Squirtle"),
	Staryu("Staryu"),
	Starmie("Starmie"),
	Swinub("Swinub"),
	Tangela("Tangela"),
	Tauros("Tauros"),
	Tentacool("Tentacool"),
	Tentacruel("Tentacruel"),
	Trapinch("Trapinch"),
	Umbreon("Umbreon"),
	Venomoth("Venomoth"),
	Venonat("Venonat"),
	Venusaur("Venusaur"),
	Vaporeon("Vaporeon"),
	Vibrava("Vibrava"),
	Victreebel("Victreebel"),
	Vileplume("Vileplume"),
	Voltorb("Voltorb"),
	Vulpix("Vulpix"),
	Wartortle("Wartortle"),
	Weedle("Weedle"),
	Weepinbell("Weepinbell"),
	Weezing("Weezing"),
	Wigglytuff("Wigglytuff"),
	Zapdos("Zapdos"),
	Zubat("Zubat");

	private EnumPokemon(String name){
		this.name = name;
	}
	public String name;
	public static boolean hasPokemon(String evolveTo) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(evolveTo)) return true;
		}
		return false;
	}
	public static EnumPokemon get(String name) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(name)) return e;
		}
		return null;
	}
}