def call(String dir){
  sh"""
  echo "Creating directory: ${dir}"
        mkdir -p ${dir}
        ls -l
  """
  
}
