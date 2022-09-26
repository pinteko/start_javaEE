public class Story {
    private String nameStory;
    private String authorStory;
    private double rating;

    public Story(String name, String author, double rating) {
        this.nameStory = name;
        this.authorStory = author;
        this.rating = rating;
    }

    public String getNameStory() {
        return nameStory;
    }

    public String getAuthorStory() {
        return authorStory;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "" +
                '\"' + nameStory + '\"' +
                " " + authorStory + " (" +
                "rating=" + rating + ").";
    }
}
