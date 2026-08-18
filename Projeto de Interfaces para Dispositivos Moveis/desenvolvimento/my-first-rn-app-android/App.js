import { Text, View, StyleSheet, ScrollView } from "react-native";

import StudentComponent from "./components/StudentComponent";
import ProfessorComponent from "./components/ProfessorComponent.";
import Calculator from "./components/Calculator";

const App = () => {
  return (
    <View>
      <Calculator />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: "center",
    gap:5,
    marginBottom: 150
  },
  text: {
    fontWeight: "bold",
    fontSize: 20,
  },
});

export default App;
