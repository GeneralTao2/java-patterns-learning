package bridge;

public class StrongEncoding implements Encoding {
    String code = "Strong encoded ";

    @Override
    public String encodeImage(String image) {
        return code + "image " + image;
    }

    @Override
    public String encodeText(String text) {
        return code + "text " + text;
    }

    @Override
    public String encodeVideo(String video) {
        return code + "video " + video;
    }
}
