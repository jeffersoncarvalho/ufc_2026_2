import { StatusBar, Text, StyleSheet, ScrollView } from "react-native";
import {SafeAreaView} from "react-native-safe-area-context"

import StudentComponent from "./StudentComponent";
import students from "./student_data";

const UniversityComponent = () => {
  return (
    <SafeAreaView style={styles.container}>
      <StatusBar hidden/>
      <Text style={styles.title}>Lista de Estudantes</Text>
      <ScrollView>
      {
        students.map(
          ({name, course, ira, imagesrc}) => <StudentComponent 
            name = {name}
            course = {course}
            ira = {ira}
            imagesrc={imagesrc}
          />
        )
      }
      </ScrollView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: "#F5F5F7"
    },
    title: {
        fontSize: 24,
        fontWeight: "bold",
        marginBottom: 20,
        textAlign: "center"
    },
    scroll: {
      
    }
})

export default UniversityComponent;
