public class Problema_3_InstitucionEducativaEjecutor {
    public static void main(String[] args) {
        Problema_3_InstitucionEducativaBase inst = new Problema_3_InstitucionEducativaBase();
        inst.setNombre("Colegio Central");
        inst.setTipo("Fisco");
        inst.setNumAlumnos(500);
        inst.setNumDocentes(30);
        inst.setNumSedes(2);
        inst.setGastoPorAlumno(120.50);
        inst.calcularPresupuesto();
        System.out.println(inst);
    }
}
