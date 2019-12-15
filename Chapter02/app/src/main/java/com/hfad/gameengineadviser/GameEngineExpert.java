package com.hfad.gameengineadviser;

import java.util.ArrayList;
import java.util.List;

public class GameEngineExpert {
    List<String> getBrands(String langues)
    {
        List<String> game_engines = new ArrayList<>();
        if (langues.equals("C++")) {
            game_engines.add("Unreal Engine");
            game_engines.add("Cocos Engine");
        }
        else
        {
            game_engines.add("Unity");
        }
        return game_engines;
    }
}
