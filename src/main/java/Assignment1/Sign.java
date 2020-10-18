package Assignment1;

public class Sign {

    private String text;



    private Dimension dimension;
    private Filling filling;



    private Boolean decoration;

    public Sign(Dimension signDimension, Filling filling, String text) {
        this.text = text;
        this.dimension = signDimension;
        this.filling = filling;
        this.decoration = true;
    }

    public Sign(String text, Boolean decoration){
        this.text = text;
        this.dimension = new Dimension(5,40);
        this.filling = new Filling("*");
       this.decoration = decoration;
    }



    /**

     * @.pre true
     * @.post RESULT == (text)
     */
    public String getText() {
        return text;
    }

    /**

     * @.pre true
     * @.post RESULT == (decoration)
     */
    public Boolean isDecoration() {
        return decoration;
    }


    /**

     * @.pre true
     * @.post RESULT == (dimension)
     */
    public Dimension getDimension() {
        return dimension;
    }



    /**
     @.pre dimension != null
     @.post getDimension.equals(dimension)
     */
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }


    /**
     @.pre filling != null
     @.post getfilling.equals(filling)
     */
    public void setFilling(Filling filling) {
        this.filling = filling;
    }


    /**
     * @.pre dimnesion != null && filling != null
     * @.post RESULT == String
     * @return String
     */

    @Override
    public String toString() {
        if(!decoration) return "--{ " + text + " }--";

        StringBuffer sign = new StringBuffer();
        final int k2 = (dimension.getHeight()-1)/2;
        final int l2 = (dimension.getLength()-text.length()-2)/2;
        final String m = filling.getFilling();
        String r = "";
        for(int i=0;i<dimension.getLength();i++) r += m;
        for(int i=0;i<k2;i++) sign.append(r+"\n");
        for(int i=0;i<l2;i++) sign.append(m);
        sign.append(" " + text + " ");
        for(int i=0;i<dimension.getLength()-l2-text.length()-2;i++) sign.append(m);
        sign.append("\n");
        for(int i=0;i<dimension.getHeight()-k2-1;i++) sign.append(r+"\n");

        return sign.toString();
    }


}
