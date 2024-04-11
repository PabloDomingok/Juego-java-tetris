package Juego;

import java.util.Random;

public class Shape {
	
	protected enum Tet {NoShape, ZShape, SShape, LineShape, 
		TShape, SquareShape, LShape, MirroredLShape}
	
	private Tet pieceShape;
	private int coords[][];
	private int [][][] coordsTable;
	
	public Shape() {
		initShape();
	}

	private void initShape() {
		
		coords= new int [4][2];
		
		coordsTable= new int [][][] {
			{ {0, 0}, {0, 0}, {0, 0},{0, 0}},
			{ {0, -1}, {0, 0}, {-1, 0},{-1, 1}},
			{ {0, -1}, {0, 0}, {1, 0},{1, 1}},
			{ {0, -1}, {0, 0}, {0, 1},{0, 2}},
			{ {-1, 0}, {0, 0}, {1, 0},{0, 1}},
			{ {0, 0}, {1, 0}, {0, 1},{1, 1}},
			{ {-1, -1}, {0, -1}, {0, 0},{0, 1}},
			{ {1, -1}, {0, -1}, {0, 0},{0, 1}}
			
			
		};
		
		setShape(Tet.NoShape);
	}
	private void setShape(Tet shape) {
		
		for(int i=0; i<4;i++) {
			for(int j=0;j<2;j++) {
				coords[i][j]=coordsTable[shape.ordinal()][i][j];
			}
		}
		
	}
	public void setX(int index, int x) { coords[index][0]=x;}
	private void setY(int index, int y) { coords[index][0]=y;}
	public int x(int index) {return coords[index][0];}
	public int y(int index) {return coords[index][1];}
	public Tet getShape() {return pieceShape;}
	
	
	public void setRandomShape() {
		
		var r = new Random();
		int x = Math.abs(r.nextInt())%7+1;
		
		Tet[] values = Tet.values();
		setShape(values[x]);
	}

}
