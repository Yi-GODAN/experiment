package setup4;

public class SimpleDotComTestDrive extends SimpleDotCom {
    SimpleDotCom dot = new SimpleDotCom();
    int[] locations = {2, 3, 4};
    //dot.setLocationCells(locations);
    String userGuess = "2";
    String result = dot.checkYourself(userGuess);
}
