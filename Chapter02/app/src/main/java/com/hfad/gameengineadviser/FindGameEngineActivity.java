package com.hfad.gameengineadviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindGameEngineActivity extends AppCompatActivity {
    private GameEngineExpert expert = new GameEngineExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_game_engine);
    }

    // 버튼을 클릭하면 호출
    public void onClickFindGameEngine(View view)
    {
        // 스피너의 레퍼런스를 얻음
        Spinner computer_languages = (Spinner)findViewById(R.id.languages);

        // 텍스트 뷰의 레퍼런스를 얻음
        TextView game_engines = (TextView)findViewById(R.id.game_engines);

        // 스피너에서 선택한 항목을 얻음
        String languageType = String.valueOf(computer_languages.getSelectedItem());

        // 선택한 항목을 표시
        //game_engines.setText(languageType);
        
        //Game Engine Expert 클래스를 이용해서 추천 목록을 얻음
        List<String> gameEnginesList = expert.getBrands(languageType);
        StringBuilder gameEnginesFormatted = new StringBuilder();
        for(String game_engine : gameEnginesList)
        {
            gameEnginesFormatted.append(game_engine).append('\n');
        }

        // 게임 엔진 목록 표시
        game_engines.setText(gameEnginesFormatted);

    }
}
