package Q_1_12.Q_7_Interface;

interface Exportable {

    void export();

    // abstract interface method cannot have a body.

    // interface without access modifier is public

}

class Tool implements Exportable {

        public void export() {       // line n1

        System.out.println("Tool::export");
    }
}

class ReportTool extends Tool implements Exportable {

    public void export() {      // line n2

        System.out.println("RTool::export");
    }

    public static void main(String[] args) {

        Tool aTool = new ReportTool();
        Tool bTool = new Tool();

        callExport (aTool);
        callExport (bTool);
    }

    public static void callExport(Exportable ex) {

        ex.export();
    }
//    What is the restul?

//    a. Compilation fails only at line n2.
//    B. RTool: exportToo::export
//    C. Tool::exportTool:export
//    D. Compilation fails only at line n1.
//    E. Compilation fails at both line n1 and line n2.

}
