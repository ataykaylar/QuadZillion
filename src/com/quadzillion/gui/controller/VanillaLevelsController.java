package com.quadzillion.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VanillaLevelsController implements Controllable {


    public static int vanillaLevel;

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onThemeChange() {

    }

    @FXML
    public void onLevelSelected(ActionEvent ae) {
        Util.currentLevel = (Integer.valueOf(((Button) ae.getSource()).getText().split(" ")[1]) - 1) % 3;
        Util.mode = 1;


        // DO STUFF ABOUT LEVEL

        Util.addVanillaGamePane();
        Util.setScene(Util.SCENE_PLAY_GAME);
    }

    @FXML
    public void onReturnToMainMenuButtonClicked() {
        Util.removeVanillaChildren();
        Util.setScene(Util.SCENE_MODES);
    }
}
