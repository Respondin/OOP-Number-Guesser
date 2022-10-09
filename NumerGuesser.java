class NumberGuesser {

  private int originalLowerBound;
  private int originalUpperBound;

  private int currentLowerBound;
  private int currentUpperBound;

  public NumberGuesser(int lowerBound, int upperBound) {
    this.originalLowerBound = lowerBound;
    this.originalUpperBound = upperBound;
    this.currentLowerBound = lowerBound;
    this.currentUpperBound = upperBound;
  }

  public void higher() {

    this.currentLowerBound = getCurrentGuess();
  }

  public void lower() {

    this.currentUpperBound = getCurrentGuess();
  }

  public int getCurrentGuess() {
    return (this.currentLowerBound + this.currentUpperBound) / 2;
  }

  public void reset() {
    this.currentLowerBound = this.originalLowerBound;
    this.currentUpperBound = this.originalUpperBound;
  }

}
