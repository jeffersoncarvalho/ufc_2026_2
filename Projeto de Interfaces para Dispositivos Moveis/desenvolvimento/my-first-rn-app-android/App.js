import { Text, View, StyleSheet, ScrollView } from "react-native";
//import StudentComponent from "./components/university/StudentComponent";
//import UniversityComponent from "./components/university/UniversityComponent";
//import UniversityFlatListComponent from "./components/university/UniversityFlatListComponent";
import { NavigationContainer } from "@react-navigation/native"
import RootStack from "./components/navigation/RootStack";

const App = () => {
  return (
    <NavigationContainer>
      <RootStack />
    </NavigationContainer>
  );
};



export default App;
