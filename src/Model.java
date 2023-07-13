
public class Model{
	private double cantidad;
	private double resultado;
	Vista vw = new Vista();
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double pesoToDollar() {
		this.resultado = this.cantidad * 0.058;
		return this.resultado;
	}
}
