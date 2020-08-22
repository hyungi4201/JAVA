package JAVA21;

class Plane {
private String company;
private String model;
private int passenger;

void setCompany(String c) {
	company = c;
}
void setModel(String m) {
	model = m;
}
void setPassenger(int p) {
	passenger = p;
}

String getCompany () {
	return company;
}

String getModel() {
	return model;
}

int getPassenger() {
	return passenger;
}

public Plane() {
	planes++;
}

public Plane(String c, String m, int p) {
	company = c;
	model = m;
	passenger = p;
	planes++;
}
static int planes = 0 ;

static int getPlanes() {
	return planes;
}
}

public class PlaneTest{
	public static void main(String args[]) {
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		System.out.println(Plane.getPlanes());
	}
}
