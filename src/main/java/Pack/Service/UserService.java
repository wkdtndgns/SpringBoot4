package Pack.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Pack.Entity.User;
import Pack.Repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Read (One)
    public Optional<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    // Read (All)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Update
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Delete
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
