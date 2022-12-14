package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println("Average of post Over 40's is: " + averageOfPostsOver40(UsersRepository.getUsersList()));
        System.out.println("Average of post Under 40's is: " +averageOfPostsUnder40(UsersRepository.getUsersList()));

    }
        public static double averageOfPostsOver40 (List<User> users){
                   double avg = users
                    .stream()
                    .filter(user -> user.getAge() >= 40)
                    .mapToInt(n -> n.getNumberOfPost())
                    .average()
                    .getAsDouble();
            return avg;

        }

        public static double averageOfPostsUnder40 (List<User> users) {
            double avg2 = users
                    .stream()
                    .filter(user -> user.getAge() < 40)
                    .mapToInt(n -> n.getNumberOfPost())
                    .average()
                    .getAsDouble();
            return avg2;


        }

    }


