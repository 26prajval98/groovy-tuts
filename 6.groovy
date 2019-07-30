class Main {
	static void main(args) {
		Matrix mat1 = new Matrix(2, 2);
		mat1.SetMatrix();
		mat1.Display();

		Matrix mat2 = new Matrix(2, 2);
		mat2.SetMatrix();
		mat2.Display();
		
		def mat3 = mat1 + mat2;
		mat3.Display();

		def mat4 = mat1 * mat2;
		mat4.Display();
	}
}

class Matrix {
	int rows, cols;
	def matrix;
	def br = new BufferedReader(new InputStreamReader(System.in));

	int GetRow(){
		return rows;
	}

	int GetCol(){
		return cols;
	}

	void SetMatrix(){
		rows.times {
			r -> {
				cols.times {
					c -> {
						int n = br.readLine().toInteger();
						SetMatrixElement(r, c, n);
					}
				}
			}
		}
	}

	void SetMatrixElement(int r, int c, int n){
		matrix[r][c] = n;
	}

	void Display(){
		println "****************************MATRIX****************************"
		rows.times {
			r -> {
				println matrix[r].join(", ");
			}
		}
		println "***************************************************************"
	}

	Matrix multiply(Matrix other){
		assert cols == other.rows : "Incorrect dimensions";

		def m = new Matrix(rows, cols);

		rows.times {
			r -> other.cols.times {
				c -> {
					m.matrix[r][c] = 0;
					cols.times {
						k -> {
							m.matrix[r][c] += this.matrix[r][k] * other.matrix[k][c];
						}
					}
				}
			}
		}
		return m;
	}

	Matrix plus(Matrix other){
		assert rows == other.rows : "Incorrect rows";
		assert cols == other.cols : "Incorrect columns";

		def m = new Matrix(rows, cols);

		rows.times {
			r -> cols.times {
				c -> 
					m.matrix[r][c] = this.matrix[r][c] + other.matrix[r][c];
			}
		}
		return m;
	}

	Matrix(rows, cols){
		assert rows > 0 && cols > 0 : "Incorrect dimensions";
		this.rows = rows.toInteger();
		this.cols = cols.toInteger();
		matrix = new Integer[this.rows][this.cols];
	}
}