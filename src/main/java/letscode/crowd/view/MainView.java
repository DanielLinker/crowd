package letscode.crowd.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import letscode.crowd.domain.Employee;
import letscode.crowd.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView extends VerticalLayout {
    private final EmployeeRepo employeeRepo;

    private Grid<Employee> grid = new Grid<>(Employee.class);

    @Autowired
    public MainView(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;

        add(grid);
        grid.setItems(employeeRepo.findAll());
    }
}
