import { StatusBar, Text, StyleSheet, ScrollView } from "react-native";
import {SafeAreaView, SafeAreaProvider} from "react-native-safe-area-context";

import StudentComponent from "./StudentComponent";
import ProfessorComponent from "./ProfessorComponent";
import students from "./student_data";
import professors from "./professor_data";

const UniversityComponent = () => {
  return (
    <SafeAreaProvider>
    <SafeAreaView style={styles.container}>
      <ScrollView>
      <Text style={styles.title}>Lista de Professores</Text>
      {
        //fazer o mapeamento dos professores aqui
        professors.map(
          (professor) => <ProfessorComponent 
            name = {professor.name}
            title={professor.title}
            imagesrc={professor.imagesrc}
          />
        )
      }
      <Text style={styles.title}>Lista de Estudantes</Text>
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
    </SafeAreaProvider>
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
