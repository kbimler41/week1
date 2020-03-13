public class Main {
    /*
     * Add a new method in TweetyBird to print the reverse of the string passed
     * Add to the case statement in order to handle a new argument "teewt"
     */
    public static void main(String[] args) throws Exception {
        if(args.length != 2) {
            throw new Exception("Incorrect use of the program!");
        }
        TweetyBird bird = new TweetyBird();

        switch (args[0]) {
            case "tweet":
                System.out.println(bird.tweet(args[1]));
            default:
                throw new Exception("Incorrect first argument");
        }
    }
}