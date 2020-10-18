package Assignment1;

public class Dimension {

    private int height;
    private int length;


    /**
    @.pre height != null && height != null
    @.post getLenght.equals(length) && getHeight.equals(height)
     */

    public Dimension(int height, int length) {
        this.height = height;
        this.length = length;
    }


    /**

     * @.pre true
     * @.post RESULT == (height)
     */
    public int getHeight() {
        return height;
    }

    /**
    @.pre height != null
    @.post getHeight.equals(height)
     */

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @.pre true
     * @.post RESULT == (length)
     */
    public int getLength() {
        return length;
    }


    /**
    @.pre height != null
    @.post getLeight.equals(length)
     */
    public void setLength(int length) {
        this.length = length;
    }
}
