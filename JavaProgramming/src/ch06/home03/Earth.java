package ch06.home03;

public class Earth {
	
	//static final 필드 ---> 대문자
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	//static{ }
	static{
		EARTH_SURFACE_AREA = 4*Math.PI* EARTH_RADIUS*EARTH_RADIUS;
	}

}
