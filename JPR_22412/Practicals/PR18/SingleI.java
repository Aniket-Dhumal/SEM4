class Room
{
    int length;
    int breadth;
    Room(int x,int y)
    {
        length=x;
        breadth=y;
    }
    int area()
    {
        return(length*breadth);
    }
}
class BedRoom extends Room    
{
    int height;
    BedRoom(int x,int y,int z)
    {
		super(x,y);         
        height=z;
    }
    int volume()
    {
        return (length*breadth*height);
    }
}
class SingleI
{
    public static void main(String args[])
	{
		BedRoom room=new BedRoom(14,12,10);
        int area=room.area();
        int volume=room.volume();      
        System.out.println(area);
        System.out.println(volume);
    }
}