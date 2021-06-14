package uploadFile.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class MyUploadForm {

    private String description;

    // Upload files.

    private CommonsMultipartFile[] files;

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public CommonsMultipartFile[] getFiles() {

        return files;

    }

    public void setFiles(CommonsMultipartFile[] files) {

        this.files = files;

    }

}