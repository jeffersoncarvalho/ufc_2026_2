import {Text, View, StyleSheet} from "react-native"


import StudentComponent from "./components/StudentComponent"

const App = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.text}>PIDM</Text>
      <StudentComponent 
        name="Jefferson de Carvalho"
        course="Design Digital"
        ira={7.3}
      />
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection:"column",
    justifyContent:"center",
    alignItems:"center",
    marginTop: 26,
  },
  text: {
    fontWeight:"bold",
    fontSize:20
  }
})

export default App