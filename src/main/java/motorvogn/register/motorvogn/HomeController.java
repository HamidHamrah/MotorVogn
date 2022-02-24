package motorvogn.register.motorvogn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    public final List<MotorVogn> MotorVognRegister = new ArrayList<>();
    @PostMapping("/lagreAlle")
    public void lagreMotorVogn(MotorVogn Biler){
        MotorVognRegister.add(Biler);
    }
    @GetMapping("/hentalle")
    public List<MotorVogn> hentAlle(){
        return MotorVognRegister;
    }

}
