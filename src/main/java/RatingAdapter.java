
public class RatingAdapter extends RatingStar {
  private IRating ratingScore;

  public RatingAdapter(IRating ratingScore) {
    this.ratingScore = ratingScore;
  }

  public Float fetchRating() {
    Float score = this.getStars() * 2.0F;
    return score;
  }

  public void saveRating() {
    Float stars = this.ratingScore.getRating() / 2;
    this.setStars(stars);
  }

}
