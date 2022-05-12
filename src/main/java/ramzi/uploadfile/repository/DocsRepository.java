package ramzi.uploadfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ramzi.uploadfile.model.Doc;

public interface DocsRepository extends JpaRepository <Doc,Integer> {
}
