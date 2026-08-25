import { SafeAreaView, StatusBar, Text, StyleSheet } from "react-native";
import StudentComponent from "./StudentComponent";

const UniversityComponent = () => {
  return (
    <SafeAreaView style={styles.container}>
      
      <Text style={styles.title}>Lista de Estudantes</Text>
      <StudentComponent
        name="Jefferson de Carvalho"
        course="Design Digital"
        ira={7.6}
        imagesrc="https://randomuser.me/api/portraits/men/30.jpg"
      />
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
    }
})

export default UniversityComponent;
