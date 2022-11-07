package baseball.controller;

import baseball.model.GameResult;
import baseball.service.BaseballGameInputService;
import baseball.service.BaseballGameService;
import baseball.view.BaseballGameView;

import java.util.List;

public class BaseballGameController {

    BaseballGameService baseballGameService = new BaseballGameService();
    BaseballGameInputService baseballGameInputService = new BaseballGameInputService();
    BaseballGameView baseballGameView = new BaseballGameView();

    public void gameIntro() {
        baseballGameView.gameIntroMessage();
    }

    public void gameProcess() {
        do {
            gameStart();
        } while (gameRestart());
    }

    private void gameStart() {
        GameResult gameResult = new GameResult(0, 0);
        List<Integer> answerNumbers = baseballGameService.getRandomNumber();

        do {
            baseballGameView.gameStartMessage();


        } while (isThreeStrike(gameResult));

    }


    private boolean gameRestart() {
        return true;
    }

    private boolean isThreeStrike(GameResult gameResult) {
        return true;
    }

}
