package realestate;
class Flat{
    int area=1330;
    int bhk=2;
    public double calculateRent(){
        return ( area*bhk * 0.013);
    }
}