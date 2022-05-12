package ramzi.uploadfile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ramzi.uploadfile.model.Doc;
import ramzi.uploadfile.repository.DocsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DocStorageService {

    @Autowired
    private DocsRepository docsRepository;

    public Doc saveFile(MultipartFile file){
        String docname = file.getOriginalFilename();
        try{
            Doc doc = new Doc(docname, file.getContentType(), file.getBytes());
            return docsRepository.save(doc);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Optional<Doc> getFile (Integer fileId){
        return docsRepository.findById(fileId);
    }

    public List<Doc> getFiles(){
        return docsRepository.findAll();
    }
}
