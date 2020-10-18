package Assignment1;

public class Filling {

    private String filling;

        /**
    @.pre filling != null
    @.post getFilling.equals(filling)
     */

    public Filling(String filling) {
        this.filling = filling;
    }



    /**

     * @.pre true
     * @.post RESULT == (filling)
     */
    public String getFilling() {
        return filling;
    }

    /**
    @.pre filling != null
    @.post getFilling.equals(filling)
     */
    public void setFilling(String filling) {
        this.filling = filling;
    }

}
