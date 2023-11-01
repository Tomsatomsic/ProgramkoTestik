module cz.spsmb.tomsa.programkotestik {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.spsmb.tomsa.programkotestik to javafx.fxml;
    exports cz.spsmb.tomsa.programkotestik;
}