
package mohsin_stuff;


public class Ball {


    private int size ;
    private String name ;
    private String colour ;

        public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour)  {
        this.colour = colour;
    }
    
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public Ball ()// default constructor 
    {}
    
    public Ball (int size1 , String name1 , String colour1 ) 
    {
        size = size1 ;
        name = name1 ;
        colour = colour1 ;
    }

    public void ShowBall ()
    {
        System.out.println(getName()+ getSize() + getColour() ); 
    }

}
