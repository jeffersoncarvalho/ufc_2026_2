import { View, Text, StyleSheet } from "react-native";

const GroupComponent = ({ label, content }) => {
  return (
    <View style={styles.group}>
      <Text style={styles.label}>{label}:</Text>
      <Text style={styles.content}>{content}</Text>
    </View>
  );
};

const styles = StyleSheet.create(
    {
        group: {
            flexDirection: "row"
        },
        label:{
            fontWeight:"bold",
            fontSize:18,
            marginRight: 15,
        },
        content:{
            fontStyle:"italic",
            fontSize:18,
        }
    }
)
export default GroupComponent;
