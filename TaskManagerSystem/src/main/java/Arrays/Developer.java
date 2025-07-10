package Arrays;

public class Developer {
    public static String[] developers = new String[100];
    int DevCount=0;

    String _developer;

    public void setDeveloper(String Developer){
        this._developer = Developer;
        DevCount++;
    }
    public String getDeveloper(){
        return this._developer;
    }
}
