package Pack.Controller;

import Pack.Entity.User;
import Pack.Service.UserService;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUserById(id).orElse(null);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam("image") MultipartFile image) {
        try {
            if (image.isEmpty()) {
                return "No image file provided.";
            }

            // 파일명 생성
            String fileName = StringUtils.cleanPath(image.getOriginalFilename());

            // 이미지를 저장할 경로 지정
            String uploadDir = "src/main/resources/static/img";
            String filePath = uploadDir + "/" + fileName;

            // 이미지를 저장
            Path path = Paths.get(filePath);
//            Files.createDirectories(path.getParent());
            Files.write(path, image.getBytes());
            return "Image uploaded successfully!";
        } catch (IOException  e) {
            // 저장 중 오류 발생 시 처리
            return "Error occurred while uploading the image.";
        }
    }

}
