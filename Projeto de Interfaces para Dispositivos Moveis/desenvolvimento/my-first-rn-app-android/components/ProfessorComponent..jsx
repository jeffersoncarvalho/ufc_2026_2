//crie um componente Professor,com
//as seguintes características:

//o professor tem um "name"
//o professor tem um "title"
//o professor tem uma "university"

import { View, Text, StyleSheet } from "react-native";
import GroupComponent from "./GroupComponent";

const ProfessorComponent = ({name, title, university}) => {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Informações do Professor</Text>
      <GroupComponent label="Name" content={name} />
      <GroupComponent label="Title" content={title} />
      <GroupComponent label="University" content={university} />
    </View>
  );
};

const styles = StyleSheet.create(
    {
        container: {
            //flex:1,
            //backgroundColor:"#c0c0c0",
        },
        title: {
            color:"red",
            fontWeight:"bold",
            fontSize: 26,
            
        },
        
    }
)

export default ProfessorComponent;
