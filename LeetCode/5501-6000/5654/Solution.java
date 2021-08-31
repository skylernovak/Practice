class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int highestBallCount = 0;
        int numOfBalls = highLimit - lowLimit + 1;
        int ballNumber = lowLimit;
        Map<Integer, Integer> map = new HashMap<>(); // Key = Box Number, Value = Balls in Box

        for (int i = 0; i < numOfBalls; i++) {
            int boxNumber = 0;
            int currBall = ballNumber;
            System.out.println("ballNumber: " + ballNumber);
            while (currBall > 10) {
                boxNumber += (currBall % 10);
                currBall %= 10;
            }
            if (currBall < 10 && currBall > 0) {
                boxNumber += currBall;
            }
            int currBallsInBox;
            if (map.get(boxNumber) == null)
                currBallsInBox = 0;
            else
                currBallsInBox = map.get(boxNumber);
            currBallsInBox++;
            System.out.println("currBallsInBox: " + currBallsInBox);
            map.put(boxNumber, currBallsInBox);
            if (currBallsInBox >= highestBallCount)
                highestBallCount = currBallsInBox;
            ballNumber++;
        }
        return highestBallCount;
    }
}